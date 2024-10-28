package net.kandetvaraeddan.tutorialmod.event;

import net.kandetvaraeddan.tutorialmod.TutorialMod;
import net.kandetvaraeddan.tutorialmod.entity.ModEntityTypes;
import net.kandetvaraeddan.tutorialmod.entity.custom.Raccoon;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RACCOON.get(), Raccoon.setAttributes());
    }
}
