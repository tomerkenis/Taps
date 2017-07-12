package me.tomerkenis.taps.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TapsCmd implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(ChatColor.WHITE + "put a" + ChatColor.GRAY + " Button " + ChatColor.WHITE + "on "
					+ ChatColor.BLUE + "Ice " + ChatColor.WHITE + "and " + ChatColor.RED + "Click " + ChatColor.WHITE
					+ "the " + ChatColor.GRAY + "Button " + ChatColor.WHITE + ".");

		}
		return false;
	}

}
