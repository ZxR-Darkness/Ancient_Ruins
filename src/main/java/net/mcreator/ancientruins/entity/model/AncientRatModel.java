package net.mcreator.ancientruins.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.ancientruins.entity.AncientRatEntity;

public class AncientRatModel extends AnimatedGeoModel<AncientRatEntity> {
	@Override
	public ResourceLocation getAnimationResource(AncientRatEntity entity) {
		return new ResourceLocation("ancient_ruins", "animations/ancient_rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AncientRatEntity entity) {
		return new ResourceLocation("ancient_ruins", "geo/ancient_rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AncientRatEntity entity) {
		return new ResourceLocation("ancient_ruins", "textures/entities/" + entity.getTexture() + ".png");
	}

}
