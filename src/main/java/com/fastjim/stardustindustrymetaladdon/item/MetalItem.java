package com.fastjim.stardustindustrymetaladdon.item;

import net.minecraft.world.item.Item;

public class MetalItem extends Item {
    private final int color; // 存储 ARGB 颜色值

    public MetalItem(Item.Properties properties, int color) {
        super(properties);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
