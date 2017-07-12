package me.tomerkenis.taps;

import java.io.File;
import java.util.List;

import org.bukkit.configuration.file.YamlConfiguration;

public class Config {

	public static List<?> getDisabledWorlds() {

		File file = new File("plugins//Taps//config.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

		List<?> toReturn = config.getList("disabled-worlds");
		return toReturn;
	}

	public static YamlConfiguration getFileConfig() {
		File file = new File("plugins//Taps//config.yml");
		YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
		return config;
	}

}
