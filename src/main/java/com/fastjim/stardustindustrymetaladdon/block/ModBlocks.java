package com.fastjim.stardustindustrymetaladdon.block;

import com.fastjim.stardustindustrymetaladdon.StardustIndustryMetalAddon;
import com.fastjim.stardustindustrymetaladdon.item.MetalBlockItem;
import com.fastjim.stardustindustrymetaladdon.item.MetalMaterial;
import com.fastjim.stardustindustrymetaladdon.item.ModItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StardustIndustryMetalAddon.MODID);

    static {
        for (MetalMaterial m : MetalMaterial.values()) {
            DeferredBlock<MetalBlock> block = BLOCKS.register("storage_block/" + m.id,
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), m.color));

            DeferredItem<MetalBlockItem> blockItem = ModItem.ITEMS.register("storage_block/" + m.id,
                    () -> new MetalBlockItem(block.get(), new Item.Properties(), block.get().getColor()));

            ModItem.addMetalItem(blockItem);
        }
    }
}
