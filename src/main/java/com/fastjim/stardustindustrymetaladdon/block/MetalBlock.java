package com.fastjim.stardustindustrymetaladdon.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MetalBlock extends Block {
    private final int color;

    public MetalBlock(BlockBehaviour.Properties properties, int color) {
        super(properties);
        this.color = color;
    }

    public int getColor() {
        return color;
    }


}