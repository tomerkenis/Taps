package me.tomerkenis.taps;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.tomerkenis.taps.Commands.TapsCmd;
import me.tomerkenis.taps.Events.PlayerInteract;

public class Main extends JavaPlugin {

	public void onEnable() {
		registerCommands();
		registerEvents();
		checkConfigExistensAndCreateOne();
	}

	public void onDisable() {

	}

	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerInteract(), this);
	}

	private void registerCommands() {
		getCommand("taps").setExecutor(new TapsCmd());
	}

	private void checkConfigExistensAndCreateOne() {
		getDataFolder().mkdir();
		File f = new File("plugins//Taps//config.yml");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			ArrayList<String> list = new ArrayList<String>();
			list.add("world_nether");
			YamlConfiguration c = YamlConfiguration.loadConfiguration(f);
			c.set("disabled-worlds", list);
			try {
				c.save(f);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
