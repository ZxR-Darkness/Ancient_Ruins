
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ancientruins.block.StoneRuinsBlock;
import net.mcreator.ancientruins.block.LiteruimOreBlock;
import net.mcreator.ancientruins.block.GrassblockBlock;
import net.mcreator.ancientruins.block.FoundryBlock;
import net.mcreator.ancientruins.block.FarelOreBlock;
import net.mcreator.ancientruins.block.BlockesBlock;
import net.mcreator.ancientruins.block.BlockPortalBlock;
import net.mcreator.ancientruins.block.AncientPortalsPortalBlock;
import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientRuinsMod.MODID);
	public static final RegistryObject<Block> BLOCKES = REGISTRY.register("blockes", () -> new BlockesBlock());
	public static final RegistryObject<Block> LITERUIM_ORE = REGISTRY.register("literuim_ore", () -> new LiteruimOreBlock());
	public static final RegistryObject<Block> FOUNDRY = REGISTRY.register("foundry", () -> new FoundryBlock());
	public static final RegistryObject<Block> BLOCK_PORTAL = REGISTRY.register("block_portal", () -> new BlockPortalBlock());
	public static final RegistryObject<Block> ANCIENT_PORTALS_PORTAL = REGISTRY.register("ancient_portals_portal", () -> new AncientPortalsPortalBlock());
	public static final RegistryObject<Block> FAREL_ORE = REGISTRY.register("farel_ore", () -> new FarelOreBlock());
	public static final RegistryObject<Block> GRASSBLOCK = REGISTRY.register("grassblock", () -> new GrassblockBlock());
	public static final RegistryObject<Block> STONE_RUINS = REGISTRY.register("stone_ruins", () -> new StoneRuinsBlock());
}
