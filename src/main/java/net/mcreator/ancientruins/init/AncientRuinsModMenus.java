
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ancientruins.world.inventory.AnvilguiMenu;
import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AncientRuinsMod.MODID);
	public static final RegistryObject<MenuType<AnvilguiMenu>> ANVILGUI = REGISTRY.register("anvilgui", () -> IForgeMenuType.create(AnvilguiMenu::new));
}
