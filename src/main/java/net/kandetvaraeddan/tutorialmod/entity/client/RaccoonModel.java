package net.kandetvaraeddan.tutorialmod.entity.client;

import net.kandetvaraeddan.tutorialmod.TutorialMod;
import net.kandetvaraeddan.tutorialmod.entity.custom.Raccoon;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaccoonModel extends AnimatedGeoModel<Raccoon> {
    @Override
    public ResourceLocation getModelResource(Raccoon object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Raccoon object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Raccoon animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/raccoon.animation.json");
    }
}
