
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ancientruins.item.SteelitemItem;
import net.mcreator.ancientruins.item.LiteriumOreItem;
import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AncientRuinsMod.MODID);
	public static final RegistryObject<Item> ANVIL = block(AncientRuinsModBlocks.ANVIL, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> BLOCKES = block(AncientRuinsModBlocks.BLOCKES, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> LITERUIM_ORE = block(AncientRuinsModBlocks.LITERUIM_ORE, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> LITERIUM_ORE = REGISTRY.register("literium_ore", () -> new LiteriumOreItem());
	public static final RegistryObject<Item> STEELITEM = REGISTRY.register("steelitem", () -> new SteelitemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
