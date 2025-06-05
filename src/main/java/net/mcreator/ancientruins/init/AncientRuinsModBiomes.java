
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.ancientruins.world.biome.RuinsWORLDBiome;
import net.mcreator.ancientruins.world.biome.DeadBiomBiome;
import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AncientRuinsMod.MODID);
	public static final RegistryObject<Biome> DEAD_BIOM = REGISTRY.register("dead_biom", DeadBiomBiome::createBiome);
	public static final RegistryObject<Biome> RUINS_WORLD = REGISTRY.register("ruins_world", RuinsWORLDBiome::createBiome);
}
