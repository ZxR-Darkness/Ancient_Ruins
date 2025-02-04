
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.ancientruins.world.features.ores.LiteruimOreFeature;
import net.mcreator.ancientruins.AncientRuinsMod;

@Mod.EventBusSubscriber
public class AncientRuinsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AncientRuinsMod.MODID);
	public static final RegistryObject<Feature<?>> LITERUIM_ORE = REGISTRY.register("literuim_ore", LiteruimOreFeature::feature);
}
