package net.mcreator.diff.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.diff.entity.BobrEntity;

public class BobrModel extends GeoModel<BobrEntity> {
	@Override
	public ResourceLocation getAnimationResource(BobrEntity entity) {
		return new ResourceLocation("diff", "animations/bobr.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BobrEntity entity) {
		return new ResourceLocation("diff", "geo/bobr.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BobrEntity entity) {
		return new ResourceLocation("diff", "textures/entities/" + entity.getTexture() + ".png");
	}

}
