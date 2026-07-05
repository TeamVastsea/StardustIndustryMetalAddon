package com.fastjim.stardustindustrymetaladdon.item;

import com.fastjim.stardustindustrymetaladdon.StardustIndustryMetalAddon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ModItem {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(StardustIndustryMetalAddon.MODID);

    // 按 MetalMaterial 查锭/粒
    public static final Map<MetalMaterial, DeferredItem<MetalItem>> INGOTS  = new EnumMap<>(MetalMaterial.class);
    public static final Map<MetalMaterial, DeferredItem<MetalItem>> NUGGETS = new EnumMap<>(MetalMaterial.class);

    // 创意栏列表
    private static final List<DeferredItem<?>> METAL_ITEMS = new ArrayList<>();
    private static final List<DeferredItem<?>> TOOL_ITEMS  = new ArrayList<>();
    private static DeferredItem<PickaxeItem> STEEL_PICKAXE;

    static {
        for (MetalMaterial m : MetalMaterial.values()) {
            DeferredItem<MetalItem> nugget = ITEMS.register("nugget/" + m.id + "_nugget",
                    () -> new MetalItem(new Item.Properties(), m.color));
            NUGGETS.put(m, nugget);
            METAL_ITEMS.add(nugget);
        }
        for (MetalMaterial m : MetalMaterial.values()) {
            DeferredItem<MetalItem> ingot = ITEMS.register("ingot/" + m.id + "_ingot",
                    () -> new MetalItem(new Item.Properties(), m.color));
            INGOTS.put(m, ingot);
            METAL_ITEMS.add(ingot);
        }
        // 块由 ModBlocks 通过 addMetalItem 追加，天然排在锭之后
        for (MetalMaterial m : MetalMaterial.values()) {
            if (m.hasTools) {
                TOOL_ITEMS.add(ITEMS.register("tool/" + m.id + "_sword",
                        () -> new SwordItem(m, new Item.Properties().attributes(SwordItem.createAttributes(m, 3, -2.4F)))));
                DeferredItem<PickaxeItem> pickaxe = ITEMS.register("tool/" + m.id + "_pickaxe",
                        () -> new PickaxeItem(m, new Item.Properties().attributes(PickaxeItem.createAttributes(m, 1, -2.8F))));
                TOOL_ITEMS.add(pickaxe);
                if (m == MetalMaterial.STEEL) STEEL_PICKAXE = pickaxe;
                TOOL_ITEMS.add(ITEMS.register("tool/" + m.id + "_shovel",
                        () -> new ShovelItem(m, new Item.Properties().attributes(ShovelItem.createAttributes(m, 1.5F, -3.0F)))));
                TOOL_ITEMS.add(ITEMS.register("tool/" + m.id + "_axe",
                        () -> new AxeItem(m, new Item.Properties().attributes(AxeItem.createAttributes(m, 6, -3.1F)))));
                TOOL_ITEMS.add(ITEMS.register("tool/" + m.id + "_hoe",
                        () -> new HoeItem(m, new Item.Properties().attributes(HoeItem.createAttributes(m, 0, -3.0F)))));
            }
        }
    }

    public static void addMetalItem(DeferredItem<?> item) {
        METAL_ITEMS.add(item);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StardustIndustryMetalAddon.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> METAL_TAB = CREATIVE_TABS.register("metal_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + StardustIndustryMetalAddon.MODID + ".metal_tab"))
                    .icon(() -> INGOTS.get(MetalMaterial.STEEL).get().getDefaultInstance())
                    .displayItems((parameters, output) -> METAL_ITEMS.forEach(output::accept))
                    .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOOL_TAB = CREATIVE_TABS.register("tool_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + StardustIndustryMetalAddon.MODID + ".tool_tab"))
                    .icon(() -> STEEL_PICKAXE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> TOOL_ITEMS.forEach(output::accept))
                    .build());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        CREATIVE_TABS.register(eventBus);
    }
}
