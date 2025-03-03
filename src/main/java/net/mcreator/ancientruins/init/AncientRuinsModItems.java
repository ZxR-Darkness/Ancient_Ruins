
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ancientruins.item.TestSwordItem;
import net.mcreator.ancientruins.item.SteelitemItem;
import net.mcreator.ancientruins.item.MorgenItem;
import net.mcreator.ancientruins.item.LiteriumingotItem;
import net.mcreator.ancientruins.item.LiteriumShovelItem;
import net.mcreator.ancientruins.item.LiteriumPickaxeItem;
import net.mcreator.ancientruins.item.LiteriumOreItem;
import net.mcreator.ancientruins.item.LiteriumHoeItem;
import net.mcreator.ancientruins.item.LiteriumAxeItem;
import net.mcreator.ancientruins.item.LiteriumArmorItem;
import net.mcreator.ancientruins.item.GlitchitemItem;
import net.mcreator.ancientruins.item.FareloreItemItem;
import net.mcreator.ancientruins.item.EyeItem;
import net.mcreator.ancientruins.item.AsoulfragmentItem;
import net.mcreator.ancientruins.item.AncientRemainsItem;
import net.mcreator.ancientruins.item.AncientPortalsItem;
import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AncientRuinsMod.MODID);
	public static final RegistryObject<Item> BLOCKES = block(AncientRuinsModBlocks.BLOCKES, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> LITERUIM_ORE = block(AncientRuinsModBlocks.LITERUIM_ORE, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> LITERIUM_ORE = REGISTRY.register("literium_ore", () -> new LiteriumOreItem());
	public static final RegistryObject<Item> STEELITEM = REGISTRY.register("steelitem", () -> new SteelitemItem());
	public static final RegistryObject<Item> EYE = REGISTRY.register("eye", () -> new EyeItem());
	public static final RegistryObject<Item> ANCIENT_REMAINS = REGISTRY.register("ancient_remains", () -> new AncientRemainsItem());
	public static final RegistryObject<Item> LITERIUMINGOT = REGISTRY.register("literiumingot", () -> new LiteriumingotItem());
	public static final RegistryObject<Item> TEST_SWORD = REGISTRY.register("test_sword", () -> new TestSwordItem());
	public static final RegistryObject<Item> LITERIUM_AXE = REGISTRY.register("literium_axe", () -> new LiteriumAxeItem());
	public static final RegistryObject<Item> LITERIUM_PICKAXE = REGISTRY.register("literium_pickaxe", () -> new LiteriumPickaxeItem());
	public static final RegistryObject<Item> LITERIUM_SHOVEL = REGISTRY.register("literium_shovel", () -> new LiteriumShovelItem());
	public static final RegistryObject<Item> LITERIUM_HOE = REGISTRY.register("literium_hoe", () -> new LiteriumHoeItem());
	public static final RegistryObject<Item> LITERIUM_ARMOR_HELMET = REGISTRY.register("literium_armor_helmet", () -> new LiteriumArmorItem.Helmet());
	public static final RegistryObject<Item> LITERIUM_ARMOR_CHESTPLATE = REGISTRY.register("literium_armor_chestplate", () -> new LiteriumArmorItem.Chestplate());
	public static final RegistryObject<Item> LITERIUM_ARMOR_LEGGINGS = REGISTRY.register("literium_armor_leggings", () -> new LiteriumArmorItem.Leggings());
	public static final RegistryObject<Item> LITERIUM_ARMOR_BOOTS = REGISTRY.register("literium_armor_boots", () -> new LiteriumArmorItem.Boots());
	public static final RegistryObject<Item> MORGEN = REGISTRY.register("morgen", () -> new MorgenItem());
	public static final RegistryObject<Item> ANCIENT_RAT_SPAWN_EGG = REGISTRY.register("ancient_rat_spawn_egg",
			() -> new ForgeSpawnEggItem(AncientRuinsModEntities.ANCIENT_RAT, -16751104, -13382656, new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY)));
	public static final RegistryObject<Item> GLITCHITEM = REGISTRY.register("glitchitem", () -> new GlitchitemItem());
	public static final RegistryObject<Item> FOUNDRY = block(AncientRuinsModBlocks.FOUNDRY, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> BLOCK_PORTAL = block(AncientRuinsModBlocks.BLOCK_PORTAL, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> ANCIENT_PORTALS = REGISTRY.register("ancient_portals", () -> new AncientPortalsItem());
	public static final RegistryObject<Item> FAREL_ORE = block(AncientRuinsModBlocks.FAREL_ORE, AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY);
	public static final RegistryObject<Item> FARELORE_ITEM = REGISTRY.register("farelore_item", () -> new FareloreItemItem());
	public static final RegistryObject<Item> ASOULFRAGMENT = REGISTRY.register("asoulfragment", () -> new AsoulfragmentItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
