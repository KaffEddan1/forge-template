package net.kandetvaraeddan.tutorialmod.block.custom;

import net.kandetvaraeddan.tutorialmod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class TomatoCropBlock extends CropBlock {

    public TomatoCropBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected ItemLike getBaseSeedId() {return ModItems.TOMATO_SEEDS.get();}

}
