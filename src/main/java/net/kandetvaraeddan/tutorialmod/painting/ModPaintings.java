package net.kandetvaraeddan.tutorialmod.painting;

import net.kandetvaraeddan.tutorialmod.TutorialMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TutorialMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> NEO_0 = PAINTING_VARIANTS.register("neo_0",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> NEO_1 = PAINTING_VARIANTS.register("neo_1",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> KASISSA = PAINTING_VARIANTS.register("kasissa",
            () -> new PaintingVariant(96, 160));

    public static void register(IEventBus eventBus){
        PAINTING_VARIANTS.register(eventBus);
    }
}
