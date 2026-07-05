package com.fastjim.stardustindustrymetaladdon.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MetalBlockItem extends BlockItem {
    private final int color;

    public MetalBlockItem(Block block, Item.Properties properties, int color) {
        super(block, properties);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}