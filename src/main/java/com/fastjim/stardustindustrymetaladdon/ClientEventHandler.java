package com.fastjim.stardustindustrymetaladdon;

import com.fastjim.stardustindustrymetaladdon.item.MetalItem;
import com.fastjim.stardustindustrymetaladdon.item.ModItem;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = StardustIndustryMetalAddon.MODID, value = Dist.CLIENT)
public class ClientEventHandler {

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        ModItem.ITEMS.getEntries().forEach(holder -> {
            Item item = holder.get();
            if (item instanceof MetalItem metalItem) {
                event.register((stack, tintIndex) -> {
                    return metalItem.getColor();
                }, metalItem);
            }
        });
    }
}
