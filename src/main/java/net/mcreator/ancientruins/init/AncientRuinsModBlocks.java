
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ancientruins.block.LiteruimOreBlock;
import net.mcreator.ancientruins.block.FoundryBlock;
import net.mcreator.ancientruins.block.BlockesBlock;
import net.mcreator.ancientruins.block.BlockPortalBlock;
import net.mcreator.ancientruins.block.AnvilBlock;
import net.mcreator.ancientruins.block.AncientPortalsPortalBlock;
import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientRuinsMod.MODID);
	public static final RegistryObject<Block> ANVIL = REGISTRY.register("anvil", () -> new AnvilBlock());
	public static final RegistryObject<Block> BLOCKES = REGISTRY.register("blockes", () -> new BlockesBlock());
	public static final RegistryObject<Block> LITERUIM_ORE = REGISTRY.register("literuim_ore", () -> new LiteruimOreBlock());
	public static final RegistryObject<Block> FOUNDRY = REGISTRY.register("foundry", () -> new FoundryBlock());
	public static final RegistryObject<Block> BLOCK_PORTAL = REGISTRY.register("block_portal", () -> new BlockPortalBlock());
	public static final RegistryObject<Block> ANCIENT_PORTALS_PORTAL = REGISTRY.register("ancient_portals_portal", () -> new AncientPortalsPortalBlock());
}
