package com.fastjim.stardustindustrymetaladdon.item;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class MetalArmorItem extends ArmorItem {
    private final int color;

    public MetalArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties, int color) {
        super(material, type, properties);
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
