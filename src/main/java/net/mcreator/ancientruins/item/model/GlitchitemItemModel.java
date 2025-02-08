package net.mcreator.ancientruins.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.ancientruins.item.GlitchitemItem;

public class GlitchitemItemModel extends AnimatedGeoModel<GlitchitemItem> {
	@Override
	public ResourceLocation getAnimationResource(GlitchitemItem animatable) {
		return new ResourceLocation("ancient_ruins", "animations/glitch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchitemItem animatable) {
		return new ResourceLocation("ancient_ruins", "geo/glitch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchitemItem animatable) {
		return new ResourceLocation("ancient_ruins", "textures/items/glitch_one.png");
	}
}
