package com.fastjim.stardustindustrymetaladdon.client;

import com.fastjim.stardustindustrymetaladdon.StardustIndustryMetalAddon;
import com.fastjim.stardustindustrymetaladdon.block.MetalBlock;
import com.fastjim.stardustindustrymetaladdon.block.ModBlocks;
import com.fastjim.stardustindustrymetaladdon.item.MetalArmorItem;
import com.fastjim.stardustindustrymetaladdon.item.MetalBlockItem;
import com.fastjim.stardustindustrymetaladdon.item.MetalItem;
import com.fastjim.stardustindustrymetaladdon.item.MetalMaterial;
import com.fastjim.stardustindustrymetaladdon.item.ModItem;
import net.minecraft.world.item.TieredItem;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = StardustIndustryMetalAddon.MODID, value = Dist.CLIENT)
public class ColorHandler {

    @SubscribeEvent
    public static void onRegisterItemColors(RegisterColorHandlersEvent.Item event) {
        ModItem.ITEMS.getEntries().forEach(holder -> {
            var item = holder.get();
            if (item instanceof MetalItem metalItem) {
                event.register((stack, tintIndex) -> metalItem.getColor(), metalItem);
            } else if (item instanceof MetalBlockItem metalBlockItem) {
                event.register((stack, tintIndex) -> metalBlockItem.getColor(), metalBlockItem);
            } else if (item instanceof MetalArmorItem armorItem) {
                event.register((stack, tintIndex) -> armorItem.getColor(), armorItem);
            } else if (item instanceof TieredItem tieredItem
                    && tieredItem.getTier() instanceof MetalMaterial m) {
                event.register((stack, tintIndex) -> tintIndex == 0 ? m.color : 0xFFFFFFFF, tieredItem);
            }
        });
    }

    @SubscribeEvent
    public static void onRegisterBlockColors(RegisterColorHandlersEvent.Block event) {
        ModBlocks.BLOCKS.getEntries().forEach(holder -> {
            var block = holder.get();
            if (block instanceof MetalBlock metalBlock) {
                event.register((state, level, pos, tintIndex) -> metalBlock.getColor(), metalBlock);
            }
        });
    }
}
