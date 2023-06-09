package net.kandetvaraeddan.tutorialmod.item;

import net.kandetvaraeddan.tutorialmod.TutorialMod;
import net.kandetvaraeddan.tutorialmod.block.ModBlocks;
import net.kandetvaraeddan.tutorialmod.item.custom.EightBallItem;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON =  ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON =  ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> BLUEBERRY_SEEDS =  ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> BLUEBERRY =  ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> IRON_PILL =  ITEMS.register("iron_pill",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().effect(new MobEffectInstance(MobEffects.REGENERATION, 40), 200)
                            .nutrition(6).saturationMod(6f).build())));
    public static final RegistryObject<Item> HEALING_PASTE =  ITEMS.register("healing_paste",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, 100), 200)
                            .nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> FISH_OIL =  ITEMS.register("fish_oil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().effect(new MobEffectInstance(MobEffects.CONFUSION, 200), 200)
                    .nutrition(1).saturationMod(1f).build())));
    public static final RegistryObject<Item> EIGHT_BALL =  ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
