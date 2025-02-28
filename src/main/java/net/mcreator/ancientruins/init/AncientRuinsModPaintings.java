
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.ancientruins.AncientRuinsMod;

public class AncientRuinsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AncientRuinsMod.MODID);
	public static final RegistryObject<PaintingVariant> CHEESE = REGISTRY.register("cheese", () -> new PaintingVariant(32, 32));
}
