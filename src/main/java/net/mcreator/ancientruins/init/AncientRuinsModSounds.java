
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AncientRuinsMod.MODID);
	public static final RegistryObject<SoundEvent> GAGS = REGISTRY.register("gags", () -> new SoundEvent(new ResourceLocation("ancient_ruins", "gags")));
	public static final RegistryObject<SoundEvent> STEEL_AUDIO = REGISTRY.register("steel_audio", () -> new SoundEvent(new ResourceLocation("ancient_ruins", "steel_audio")));
	public static final RegistryObject<SoundEvent> LITERIUM_AUDIO = REGISTRY.register("literium_audio", () -> new SoundEvent(new ResourceLocation("ancient_ruins", "literium_audio")));
}
