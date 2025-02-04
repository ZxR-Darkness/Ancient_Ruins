package net.mcreator.ancientruins.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.ancientruins.world.inventory.AnvilguiMenu;

public class OpenGuiAnvilProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof Player _plr ? _plr.containerMenu instanceof AnvilguiMenu : false;
	}
}
