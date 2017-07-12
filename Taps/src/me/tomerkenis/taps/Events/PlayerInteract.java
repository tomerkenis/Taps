package me.tomerkenis.taps.Events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.tomerkenis.taps.Config;

public class PlayerInteract implements Listener {

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {

		Block b = e.getClickedBlock();
		Location l = b.getLocation();
		World world = l.getWorld();
		if (!Config.getDisabledWorlds().contains(world.getName())) {
			int x = l.getBlockX();
			int y = l.getBlockY();
			int z = l.getBlockZ();
			Location l1 = new Location(world, x + 1, y, z);
			Location l2 = new Location(world, x - 1, y, z);
			Location l3 = new Location(world, x, y + 1, z);
			Location l4 = new Location(world, x, y, z + 1);
			Location l5 = new Location(world, x, y, z - 1);
			Material m = b.getType();
			if (m == Material.STONE_BUTTON || m == Material.WOOD_BUTTON) {
				if (l1.getBlock().getType().equals(Material.ICE)
						|| l1.getBlock().getType().equals(Material.PACKED_ICE)) {
					Location loc = new Location(world, l1.getX(), l1.getY() - 1, l1.getZ());
					if (loc.getBlock().getType() == Material.AIR) {
						loc.getBlock().setType(Material.WATER);
					}
				} else if (l2.getBlock().getType().equals(Material.ICE)
						|| l2.getBlock().getType().equals(Material.PACKED_ICE)) {
					Location loc = new Location(world, l2.getX(), l2.getY() - 1, l2.getZ());
					if (loc.getBlock().getType() == Material.AIR) {
						loc.getBlock().setType(Material.WATER);
					}

				} else if (l3.getBlock().getType().equals(Material.ICE)
						|| l3.getBlock().getType().equals(Material.PACKED_ICE)) {
					Location loc = new Location(world, l3.getX(), l3.getY() - 1, l3.getZ());
					if (loc.getBlock().getType() == Material.AIR) {
						loc.getBlock().setType(Material.WATER);
					}
				} else if (l4.getBlock().getType().equals(Material.ICE)
						|| l4.getBlock().getType().equals(Material.PACKED_ICE)) {
					Location loc = new Location(world, l4.getX(), l4.getY() - 1, l4.getZ());
					if (loc.getBlock().getType() == Material.AIR) {
						loc.getBlock().setType(Material.WATER);
					}
				} else if (l5.getBlock().getType().equals(Material.ICE)
						|| l5.getBlock().getType().equals(Material.PACKED_ICE)) {
					Location loc = new Location(world, l5.getX(), l5.getY() - 1, l5.getZ());
					if (loc.getBlock().getType() == Material.AIR) {
						loc.getBlock().setType(Material.WATER);
					}

				}
			}
		}
	}
}