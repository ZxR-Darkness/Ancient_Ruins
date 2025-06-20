
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
import net.mcreator.ancientruins.world.features.ores.FarelOreFeature;
import net.mcreator.ancientruins.world.features.RuinFirstFeature;
import net.mcreator.ancientruins.world.features.AncientTunnelFeature;
import net.mcreator.ancientruins.AncientRuinsMod;

@Mod.EventBusSubscriber
public class AncientRuinsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AncientRuinsMod.MODID);
	public static final RegistryObject<Feature<?>> LITERUIM_ORE = REGISTRY.register("literuim_ore", LiteruimOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUIN_FIRST = REGISTRY.register("ruin_first", RuinFirstFeature::feature);
	public static final RegistryObject<Feature<?>> FAREL_ORE = REGISTRY.register("farel_ore", FarelOreFeature::feature);
	public static final RegistryObject<Feature<?>> ANCIENT_TUNNEL = REGISTRY.register("ancient_tunnel", AncientTunnelFeature::feature);
}
