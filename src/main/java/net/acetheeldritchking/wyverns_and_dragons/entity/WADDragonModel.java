package net.acetheeldritchking.wyverns_and_dragons.entity;

import net.acetheeldritchking.wyverns_and_dragons.WyvernsAndDragons;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WADDragonModel extends AnimatedGeoModel<DragonEntity> {
    @Override
    public ResourceLocation getModelResource(DragonEntity object) {
        return new ResourceLocation(WyvernsAndDragons.MOD_ID, "geo/dragon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DragonEntity object) {
        return new ResourceLocation(WyvernsAndDragons.MOD_ID, "textures/entity/dragon_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DragonEntity animatable) {
        return new ResourceLocation(WyvernsAndDragons.MOD_ID, "animations/dragon.animation.json");
    }
}