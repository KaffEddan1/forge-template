package net.kandetvaraeddan.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorial_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HOLY_ROTTEN_TOMATO.get());
        }
    };
}
