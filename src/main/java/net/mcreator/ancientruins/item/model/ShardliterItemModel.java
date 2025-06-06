package net.mcreator.ancientruins.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.ancientruins.item.ShardliterItem;

public class ShardliterItemModel extends AnimatedGeoModel<ShardliterItem> {
	@Override
	public ResourceLocation getAnimationResource(ShardliterItem animatable) {
		return new ResourceLocation("ancient_ruins", "animations/shard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShardliterItem animatable) {
		return new ResourceLocation("ancient_ruins", "geo/shard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShardliterItem animatable) {
		return new ResourceLocation("ancient_ruins", "textures/items/texture_shard.png");
	}
}
