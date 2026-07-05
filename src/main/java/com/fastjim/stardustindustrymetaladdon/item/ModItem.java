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
import java.util.List;

public class ModItem {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(StardustIndustryMetalAddon.MODID);

    private static final List<DeferredItem<?>> TOOL_ITEMS = new ArrayList<>();

    private static <T extends net.minecraft.world.item.Item> DeferredItem<T> registerTool(String name, java.util.function.Supplier<T> supplier) {
        DeferredItem<T> item = ITEMS.register(name, supplier);
        TOOL_ITEMS.add(item);
        return item;
    }



    // ---------- 钢制工具 ----------
    public static final DeferredItem<SwordItem> STEEL_SWORD =
            registerTool("tool/steel_sword",
                    () -> new SwordItem(ModToolTiers.STEEL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> STEEL_PICKAXE =
            registerTool("tool/steel_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.STEEL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> STEEL_SHOVEL =
            registerTool("tool/steel_shovel",
                    () -> new ShovelItem(ModToolTiers.STEEL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STEEL, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> STEEL_AXE =
            registerTool("tool/steel_axe",
                    () -> new AxeItem(ModToolTiers.STEEL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STEEL, 6, -3.1F))));
    public static final DeferredItem<HoeItem> STEEL_HOE =
            registerTool("tool/steel_hoe",
                    () -> new HoeItem(ModToolTiers.STEEL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STEEL, 0, -3.0F))));

    // ---------- 铝制工具 ----------
    public static final DeferredItem<SwordItem> ALUMINIUM_SWORD =
            registerTool("tool/aluminium_sword",
                    () -> new SwordItem(ModToolTiers.ALUMINIUM,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ALUMINIUM, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> ALUMINIUM_PICKAXE =
            registerTool("tool/aluminium_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.ALUMINIUM,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ALUMINIUM, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> ALUMINIUM_SHOVEL =
            registerTool("tool/aluminium_shovel",
                    () -> new ShovelItem(ModToolTiers.ALUMINIUM,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ALUMINIUM, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> ALUMINIUM_AXE =
            registerTool("tool/aluminium_axe",
                    () -> new AxeItem(ModToolTiers.ALUMINIUM,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ALUMINIUM, 6, -3.1F))));
    public static final DeferredItem<HoeItem> ALUMINIUM_HOE =
            registerTool("tool/aluminium_hoe",
                    () -> new HoeItem(ModToolTiers.ALUMINIUM,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ALUMINIUM, 0, -3.0F))));

    // ---------- 铅制工具 ----------
    public static final DeferredItem<SwordItem> LEAD_SWORD =
            registerTool("tool/lead_sword",
                    () -> new SwordItem(ModToolTiers.LEAD,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.LEAD, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> LEAD_PICKAXE =
            registerTool("tool/lead_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.LEAD,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.LEAD, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> LEAD_SHOVEL =
            registerTool("tool/lead_shovel",
                    () -> new ShovelItem(ModToolTiers.LEAD,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.LEAD, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> LEAD_AXE =
            registerTool("tool/lead_axe",
                    () -> new AxeItem(ModToolTiers.LEAD,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.LEAD, 6, -3.1F))));
    public static final DeferredItem<HoeItem> LEAD_HOE =
            registerTool("tool/lead_hoe",
                    () -> new HoeItem(ModToolTiers.LEAD,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.LEAD, 0, -3.0F))));

    // ---------- 锌制工具 ----------
    public static final DeferredItem<SwordItem> ZINC_SWORD =
            registerTool("tool/zinc_sword",
                    () -> new SwordItem(ModToolTiers.ZINC,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ZINC, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> ZINC_PICKAXE =
            registerTool("tool/zinc_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.ZINC,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ZINC, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> ZINC_SHOVEL =
            registerTool("tool/zinc_shovel",
                    () -> new ShovelItem(ModToolTiers.ZINC,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ZINC, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> ZINC_AXE =
            registerTool("tool/zinc_axe",
                    () -> new AxeItem(ModToolTiers.ZINC,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ZINC, 6, -3.1F))));
    public static final DeferredItem<HoeItem> ZINC_HOE =
            registerTool("tool/zinc_hoe",
                    () -> new HoeItem(ModToolTiers.ZINC,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ZINC, 0, -3.0F))));

    // ---------- 镍制工具 ----------
    public static final DeferredItem<SwordItem> NICKEL_SWORD =
            registerTool("tool/nickel_sword",
                    () -> new SwordItem(ModToolTiers.NICKEL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.NICKEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> NICKEL_PICKAXE =
            registerTool("tool/nickel_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.NICKEL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.NICKEL, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> NICKEL_SHOVEL =
            registerTool("tool/nickel_shovel",
                    () -> new ShovelItem(ModToolTiers.NICKEL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.NICKEL, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> NICKEL_AXE =
            registerTool("tool/nickel_axe",
                    () -> new AxeItem(ModToolTiers.NICKEL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.NICKEL, 6, -3.1F))));
    public static final DeferredItem<HoeItem> NICKEL_HOE =
            registerTool("tool/nickel_hoe",
                    () -> new HoeItem(ModToolTiers.NICKEL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.NICKEL, 0, -3.0F))));

    // ---------- 铬制工具 ----------
    public static final DeferredItem<SwordItem> CHROME_SWORD =
            registerTool("tool/chrome_sword",
                    () -> new SwordItem(ModToolTiers.CHROME,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHROME, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> CHROME_PICKAXE =
            registerTool("tool/chrome_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.CHROME,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CHROME, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> CHROME_SHOVEL =
            registerTool("tool/chrome_shovel",
                    () -> new ShovelItem(ModToolTiers.CHROME,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CHROME, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> CHROME_AXE =
            registerTool("tool/chrome_axe",
                    () -> new AxeItem(ModToolTiers.CHROME,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CHROME, 6, -3.1F))));
    public static final DeferredItem<HoeItem> CHROME_HOE =
            registerTool("tool/chrome_hoe",
                    () -> new HoeItem(ModToolTiers.CHROME,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CHROME, 0, -3.0F))));

    // ---------- 锇制工具 ----------
    public static final DeferredItem<SwordItem> OSMIUM_SWORD =
            registerTool("tool/osmium_sword",
                    () -> new SwordItem(ModToolTiers.OSMIUM,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OSMIUM, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> OSMIUM_PICKAXE =
            registerTool("tool/osmium_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.OSMIUM,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.OSMIUM, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> OSMIUM_SHOVEL =
            registerTool("tool/osmium_shovel",
                    () -> new ShovelItem(ModToolTiers.OSMIUM,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.OSMIUM, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> OSMIUM_AXE =
            registerTool("tool/osmium_axe",
                    () -> new AxeItem(ModToolTiers.OSMIUM,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.OSMIUM, 6, -3.1F))));
    public static final DeferredItem<HoeItem> OSMIUM_HOE =
            registerTool("tool/osmium_hoe",
                    () -> new HoeItem(ModToolTiers.OSMIUM,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.OSMIUM, 0, -3.0F))));

    // ---------- 锡制工具 ----------
    public static final DeferredItem<SwordItem> TIN_SWORD =
            registerTool("tool/tin_sword",
                    () -> new SwordItem(ModToolTiers.TIN,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TIN, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> TIN_PICKAXE =
            registerTool("tool/tin_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.TIN,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TIN, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> TIN_SHOVEL =
            registerTool("tool/tin_shovel",
                    () -> new ShovelItem(ModToolTiers.TIN,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TIN, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> TIN_AXE =
            registerTool("tool/tin_axe",
                    () -> new AxeItem(ModToolTiers.TIN,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TIN, 6, -3.1F))));
    public static final DeferredItem<HoeItem> TIN_HOE =
            registerTool("tool/tin_hoe",
                    () -> new HoeItem(ModToolTiers.TIN,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TIN, 0, -3.0F))));

    // ---------- 银制工具 ----------
    public static final DeferredItem<SwordItem> SILVER_SWORD =
            registerTool("tool/silver_sword",
                    () -> new SwordItem(ModToolTiers.SILVER,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SILVER, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> SILVER_PICKAXE =
            registerTool("tool/silver_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.SILVER,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.SILVER, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> SILVER_SHOVEL =
            registerTool("tool/silver_shovel",
                    () -> new ShovelItem(ModToolTiers.SILVER,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.SILVER, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> SILVER_AXE =
            registerTool("tool/silver_axe",
                    () -> new AxeItem(ModToolTiers.SILVER,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.SILVER, 6, -3.1F))));
    public static final DeferredItem<HoeItem> SILVER_HOE =
            registerTool("tool/silver_hoe",
                    () -> new HoeItem(ModToolTiers.SILVER,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.SILVER, 0, -3.0F))));

    // ---------- 铂制工具 ----------
    public static final DeferredItem<SwordItem> PLATINUM_SWORD =
            registerTool("tool/platinum_sword",
                    () -> new SwordItem(ModToolTiers.PLATINUM,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.PLATINUM, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> PLATINUM_PICKAXE =
            registerTool("tool/platinum_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.PLATINUM,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.PLATINUM, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> PLATINUM_SHOVEL =
            registerTool("tool/platinum_shovel",
                    () -> new ShovelItem(ModToolTiers.PLATINUM,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.PLATINUM, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> PLATINUM_AXE =
            registerTool("tool/platinum_axe",
                    () -> new AxeItem(ModToolTiers.PLATINUM,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.PLATINUM, 6, -3.1F))));
    public static final DeferredItem<HoeItem> PLATINUM_HOE =
            registerTool("tool/platinum_hoe",
                    () -> new HoeItem(ModToolTiers.PLATINUM,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.PLATINUM, 0, -3.0F))));

    // ---------- 钛制工具 ----------
    public static final DeferredItem<SwordItem> TITANIUM_SWORD =
            registerTool("tool/titanium_sword",
                    () -> new SwordItem(ModToolTiers.TITANIUM,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> TITANIUM_PICKAXE =
            registerTool("tool/titanium_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.TITANIUM,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TITANIUM, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> TITANIUM_SHOVEL =
            registerTool("tool/titanium_shovel",
                    () -> new ShovelItem(ModToolTiers.TITANIUM,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TITANIUM, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> TITANIUM_AXE =
            registerTool("tool/titanium_axe",
                    () -> new AxeItem(ModToolTiers.TITANIUM,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TITANIUM, 6, -3.1F))));
    public static final DeferredItem<HoeItem> TITANIUM_HOE =
            registerTool("tool/titanium_hoe",
                    () -> new HoeItem(ModToolTiers.TITANIUM,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TITANIUM, 0, -3.0F))));

    // ---------- 钨制工具 ----------
    public static final DeferredItem<SwordItem> TUNGSTEN_SWORD =
            registerTool("tool/tungsten_sword",
                    () -> new SwordItem(ModToolTiers.TUNGSTEN,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TUNGSTEN, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> TUNGSTEN_PICKAXE =
            registerTool("tool/tungsten_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.TUNGSTEN,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TUNGSTEN, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> TUNGSTEN_SHOVEL =
            registerTool("tool/tungsten_shovel",
                    () -> new ShovelItem(ModToolTiers.TUNGSTEN,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TUNGSTEN, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> TUNGSTEN_AXE =
            registerTool("tool/tungsten_axe",
                    () -> new AxeItem(ModToolTiers.TUNGSTEN,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TUNGSTEN, 6, -3.1F))));
    public static final DeferredItem<HoeItem> TUNGSTEN_HOE =
            registerTool("tool/tungsten_hoe",
                    () -> new HoeItem(ModToolTiers.TUNGSTEN,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TUNGSTEN, 0, -3.0F))));

    // ---------- 钴制工具 ----------
    public static final DeferredItem<SwordItem> COBALT_SWORD =
            registerTool("tool/cobalt_sword",
                    () -> new SwordItem(ModToolTiers.COBALT,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COBALT, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> COBALT_PICKAXE =
            registerTool("tool/cobalt_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.COBALT,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.COBALT, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> COBALT_SHOVEL =
            registerTool("tool/cobalt_shovel",
                    () -> new ShovelItem(ModToolTiers.COBALT,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.COBALT, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> COBALT_AXE =
            registerTool("tool/cobalt_axe",
                    () -> new AxeItem(ModToolTiers.COBALT,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.COBALT, 6, -3.1F))));
    public static final DeferredItem<HoeItem> COBALT_HOE =
            registerTool("tool/cobalt_hoe",
                    () -> new HoeItem(ModToolTiers.COBALT,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.COBALT, 0, -3.0F))));

    // ---------- 青铜制工具 ----------
    public static final DeferredItem<SwordItem> BRONZE_SWORD =
            registerTool("tool/bronze_sword",
                    () -> new SwordItem(ModToolTiers.BRONZE,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE =
            registerTool("tool/bronze_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.BRONZE,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL =
            registerTool("tool/bronze_shovel",
                    () -> new ShovelItem(ModToolTiers.BRONZE,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> BRONZE_AXE =
            registerTool("tool/bronze_axe",
                    () -> new AxeItem(ModToolTiers.BRONZE,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6, -3.1F))));
    public static final DeferredItem<HoeItem> BRONZE_HOE =
            registerTool("tool/bronze_hoe",
                    () -> new HoeItem(ModToolTiers.BRONZE,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, 0, -3.0F))));

    // ---------- 黄铜制工具 ----------
    public static final DeferredItem<SwordItem> BRASS_SWORD =
            registerTool("tool/brass_sword",
                    () -> new SwordItem(ModToolTiers.BRASS,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRASS, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> BRASS_PICKAXE =
            registerTool("tool/brass_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.BRASS,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRASS, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> BRASS_SHOVEL =
            registerTool("tool/brass_shovel",
                    () -> new ShovelItem(ModToolTiers.BRASS,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRASS, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> BRASS_AXE =
            registerTool("tool/brass_axe",
                    () -> new AxeItem(ModToolTiers.BRASS,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRASS, 6, -3.1F))));
    public static final DeferredItem<HoeItem> BRASS_HOE =
            registerTool("tool/brass_hoe",
                    () -> new HoeItem(ModToolTiers.BRASS,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRASS, 0, -3.0F))));

    // ---------- 不锈钢制工具 ----------
    public static final DeferredItem<SwordItem> STAINLESS_STEEL_SWORD =
            registerTool("tool/stainless_steel_sword",
                    () -> new SwordItem(ModToolTiers.STAINLESS_STEEL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STAINLESS_STEEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> STAINLESS_STEEL_PICKAXE =
            registerTool("tool/stainless_steel_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.STAINLESS_STEEL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STAINLESS_STEEL, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> STAINLESS_STEEL_SHOVEL =
            registerTool("tool/stainless_steel_shovel",
                    () -> new ShovelItem(ModToolTiers.STAINLESS_STEEL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STAINLESS_STEEL, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> STAINLESS_STEEL_AXE =
            registerTool("tool/stainless_steel_axe",
                    () -> new AxeItem(ModToolTiers.STAINLESS_STEEL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STAINLESS_STEEL, 6, -3.1F))));
    public static final DeferredItem<HoeItem> STAINLESS_STEEL_HOE =
            registerTool("tool/stainless_steel_hoe",
                    () -> new HoeItem(ModToolTiers.STAINLESS_STEEL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STAINLESS_STEEL, 0, -3.0F))));

    // ---------- 碳钢制工具 ----------
    public static final DeferredItem<SwordItem> CARBON_STEEL_SWORD =
            registerTool("tool/carbon_steel_sword",
                    () -> new SwordItem(ModToolTiers.CARBON_STEEL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CARBON_STEEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> CARBON_STEEL_PICKAXE =
            registerTool("tool/carbon_steel_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.CARBON_STEEL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CARBON_STEEL, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> CARBON_STEEL_SHOVEL =
            registerTool("tool/carbon_steel_shovel",
                    () -> new ShovelItem(ModToolTiers.CARBON_STEEL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CARBON_STEEL, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> CARBON_STEEL_AXE =
            registerTool("tool/carbon_steel_axe",
                    () -> new AxeItem(ModToolTiers.CARBON_STEEL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CARBON_STEEL, 6, -3.1F))));
    public static final DeferredItem<HoeItem> CARBON_STEEL_HOE =
            registerTool("tool/carbon_steel_hoe",
                    () -> new HoeItem(ModToolTiers.CARBON_STEEL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CARBON_STEEL, 0, -3.0F))));

    // ---------- 高速钢制工具 ----------
    public static final DeferredItem<SwordItem> HIGH_SPEED_STEEL_SWORD =
            registerTool("tool/high_speed_steel_sword",
                    () -> new SwordItem(ModToolTiers.HIGH_SPEED_STEEL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.HIGH_SPEED_STEEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> HIGH_SPEED_STEEL_PICKAXE =
            registerTool("tool/high_speed_steel_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.HIGH_SPEED_STEEL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.HIGH_SPEED_STEEL, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> HIGH_SPEED_STEEL_SHOVEL =
            registerTool("tool/high_speed_steel_shovel",
                    () -> new ShovelItem(ModToolTiers.HIGH_SPEED_STEEL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.HIGH_SPEED_STEEL, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> HIGH_SPEED_STEEL_AXE =
            registerTool("tool/high_speed_steel_axe",
                    () -> new AxeItem(ModToolTiers.HIGH_SPEED_STEEL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.HIGH_SPEED_STEEL, 6, -3.1F))));
    public static final DeferredItem<HoeItem> HIGH_SPEED_STEEL_HOE =
            registerTool("tool/high_speed_steel_hoe",
                    () -> new HoeItem(ModToolTiers.HIGH_SPEED_STEEL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.HIGH_SPEED_STEEL, 0, -3.0F))));

    // ---------- 工具钢制工具 ----------
    public static final DeferredItem<SwordItem> TOOL_STEEL_SWORD =
            registerTool("tool/tool_steel_sword",
                    () -> new SwordItem(ModToolTiers.TOOL_STEEL,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TOOL_STEEL, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> TOOL_STEEL_PICKAXE =
            registerTool("tool/tool_steel_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.TOOL_STEEL,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TOOL_STEEL, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> TOOL_STEEL_SHOVEL =
            registerTool("tool/tool_steel_shovel",
                    () -> new ShovelItem(ModToolTiers.TOOL_STEEL,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TOOL_STEEL, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> TOOL_STEEL_AXE =
            registerTool("tool/tool_steel_axe",
                    () -> new AxeItem(ModToolTiers.TOOL_STEEL,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TOOL_STEEL, 6, -3.1F))));
    public static final DeferredItem<HoeItem> TOOL_STEEL_HOE =
            registerTool("tool/tool_steel_hoe",
                    () -> new HoeItem(ModToolTiers.TOOL_STEEL,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TOOL_STEEL, 0, -3.0F))));

    // ---------- 碳化钨制工具 ----------
    public static final DeferredItem<SwordItem> TUNGSTEN_CARBIDE_SWORD =
            registerTool("tool/tungsten_carbide_sword",
                    () -> new SwordItem(ModToolTiers.TUNGSTEN_CARBIDE,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TUNGSTEN_CARBIDE, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> TUNGSTEN_CARBIDE_PICKAXE =
            registerTool("tool/tungsten_carbide_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.TUNGSTEN_CARBIDE,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TUNGSTEN_CARBIDE, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> TUNGSTEN_CARBIDE_SHOVEL =
            registerTool("tool/tungsten_carbide_shovel",
                    () -> new ShovelItem(ModToolTiers.TUNGSTEN_CARBIDE,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.TUNGSTEN_CARBIDE, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> TUNGSTEN_CARBIDE_AXE =
            registerTool("tool/tungsten_carbide_axe",
                    () -> new AxeItem(ModToolTiers.TUNGSTEN_CARBIDE,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.TUNGSTEN_CARBIDE, 6, -3.1F))));
    public static final DeferredItem<HoeItem> TUNGSTEN_CARBIDE_HOE =
            registerTool("tool/tungsten_carbide_hoe",
                    () -> new HoeItem(ModToolTiers.TUNGSTEN_CARBIDE,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.TUNGSTEN_CARBIDE, 0, -3.0F))));

    // ---------- 硬质合金制工具 ----------
    public static final DeferredItem<SwordItem> CEMENTED_CARBIDE_SWORD =
            registerTool("tool/cemented_carbide_sword",
                    () -> new SwordItem(ModToolTiers.CEMENTED_CARBIDE,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CEMENTED_CARBIDE, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> CEMENTED_CARBIDE_PICKAXE =
            registerTool("tool/cemented_carbide_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.CEMENTED_CARBIDE,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CEMENTED_CARBIDE, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> CEMENTED_CARBIDE_SHOVEL =
            registerTool("tool/cemented_carbide_shovel",
                    () -> new ShovelItem(ModToolTiers.CEMENTED_CARBIDE,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CEMENTED_CARBIDE, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> CEMENTED_CARBIDE_AXE =
            registerTool("tool/cemented_carbide_axe",
                    () -> new AxeItem(ModToolTiers.CEMENTED_CARBIDE,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CEMENTED_CARBIDE, 6, -3.1F))));
    public static final DeferredItem<HoeItem> CEMENTED_CARBIDE_HOE =
            registerTool("tool/cemented_carbide_hoe",
                    () -> new HoeItem(ModToolTiers.CEMENTED_CARBIDE,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CEMENTED_CARBIDE, 0, -3.0F))));

    // ---------- 康铜制工具 ----------
    public static final DeferredItem<SwordItem> CONSTANTAN_SWORD =
            registerTool("tool/constantan_sword",
                    () -> new SwordItem(ModToolTiers.CONSTANTAN,
                            new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CONSTANTAN, 3, -2.4F))));
    public static final DeferredItem<PickaxeItem> CONSTANTAN_PICKAXE =
            registerTool("tool/constantan_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.CONSTANTAN,
                            new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CONSTANTAN, 1, -2.8F))));
    public static final DeferredItem<ShovelItem> CONSTANTAN_SHOVEL =
            registerTool("tool/constantan_shovel",
                    () -> new ShovelItem(ModToolTiers.CONSTANTAN,
                            new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CONSTANTAN, 1.5F, -3.0F))));
    public static final DeferredItem<AxeItem> CONSTANTAN_AXE =
            registerTool("tool/constantan_axe",
                    () -> new AxeItem(ModToolTiers.CONSTANTAN,
                            new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CONSTANTAN, 6, -3.1F))));
    public static final DeferredItem<HoeItem> CONSTANTAN_HOE =
            registerTool("tool/constantan_hoe",
                    () -> new HoeItem(ModToolTiers.CONSTANTAN,
                            new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CONSTANTAN, 0, -3.0F))));



    private static final List<DeferredItem<?>> METAL_ITEMS = new ArrayList<>();

    public static void addMetalItem(DeferredItem<?> item) {
        METAL_ITEMS.add(item);
    }


    //标签页
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StardustIndustryMetalAddon.MODID);


    private static DeferredItem<MetalItem> registerIngredient(String name, int color) {
        DeferredItem<MetalItem> item = ITEMS.register(name,
                () -> new MetalItem(new Item.Properties(), color));
        METAL_ITEMS.add(item);
        return item;
    }


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOOL_TAB =
            CREATIVE_TABS.register("tool_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup." + StardustIndustryMetalAddon.MODID + ".tool_tab"))
                            .icon(() -> ModItem.STEEL_PICKAXE.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                TOOL_ITEMS.forEach(output::accept);
                            })
                            .build()
            );

    // 钢锭 / 粒
    public static final DeferredItem<MetalItem> STEEL_INGOT =
            registerIngredient("ingot/steel_ingot", 0xFFb1b1b1);
    public static final DeferredItem<MetalItem> STEEL_NUGGET =
            registerIngredient("nugget/steel_nugget", 0xFFb1b1b1);

    // 铝锭 / 粒
    public static final DeferredItem<MetalItem> ALUMINIUM_INGOT =
            registerIngredient("ingot/aluminium_ingot", 0xFFd4d4d4);
    public static final DeferredItem<MetalItem> ALUMINIUM_NUGGET =
            registerIngredient("nugget/aluminium_nugget", 0xFFd4d4d4);

    // 铅锭 / 粒
    public static final DeferredItem<MetalItem> LEAD_INGOT =
            registerIngredient("ingot/lead_ingot", 0xFFa0a0b0);
    public static final DeferredItem<MetalItem> LEAD_NUGGET =
            registerIngredient("nugget/lead_nugget", 0xFFa0a0b0);

    // 锌锭 / 粒
    public static final DeferredItem<MetalItem> ZINC_INGOT =
            registerIngredient("ingot/zinc_ingot", 0xFFc8d0d0);
    public static final DeferredItem<MetalItem> ZINC_NUGGET =
            registerIngredient("nugget/zinc_nugget", 0xFFc8d0d0);

    // 镍锭 / 粒
    public static final DeferredItem<MetalItem> NICKEL_INGOT =
            registerIngredient("ingot/nickel_ingot", 0xFFb2bfbf);
    public static final DeferredItem<MetalItem> NICKEL_NUGGET =
            registerIngredient("nugget/nickel_nugget", 0xFFb2bfbf);

    // 铬锭 / 粒
    public static final DeferredItem<MetalItem> CHROME_INGOT =
            registerIngredient("ingot/chrome_ingot", 0xFFa0b8b0);
    public static final DeferredItem<MetalItem> CHROME_NUGGET =
            registerIngredient("nugget/chrome_nugget", 0xFFa0b8b0);

    // 锇锭 / 粒
    public static final DeferredItem<MetalItem> OSMIUM_INGOT =
            registerIngredient("ingot/osmium_ingot", 0xFF8890a0);
    public static final DeferredItem<MetalItem> OSMIUM_NUGGET =
            registerIngredient("nugget/osmium_nugget", 0xFF8890a0);

    // 锡锭 / 粒
    public static final DeferredItem<MetalItem> TIN_INGOT =
            registerIngredient("ingot/tin_ingot", 0xFFa8b0b8);
    public static final DeferredItem<MetalItem> TIN_NUGGET =
            registerIngredient("nugget/tin_nugget", 0xFFa8b0b8);

    // 银锭 / 粒
    public static final DeferredItem<MetalItem> SILVER_INGOT =
            registerIngredient("ingot/silver_ingot", 0xFFf0f0f0);
    public static final DeferredItem<MetalItem> SILVER_NUGGET =
            registerIngredient("nugget/silver_nugget", 0xFFf0f0f0);

    // 铂锭 / 粒
    public static final DeferredItem<MetalItem> PLATINUM_INGOT =
            registerIngredient("ingot/platinum_ingot", 0xFFd0d0d8);
    public static final DeferredItem<MetalItem> PLATINUM_NUGGET =
            registerIngredient("nugget/platinum_nugget", 0xFFd0d0d8);

    // 钛锭 / 粒
    public static final DeferredItem<MetalItem> TITANIUM_INGOT =
            registerIngredient("ingot/titanium_ingot", 0xFFb0b8c0);
    public static final DeferredItem<MetalItem> TITANIUM_NUGGET =
            registerIngredient("nugget/titanium_nugget", 0xFFb0b8c0);

    // 钨锭 / 粒
    public static final DeferredItem<MetalItem> TUNGSTEN_INGOT =
            registerIngredient("ingot/tungsten_ingot", 0xFF47484d);
    public static final DeferredItem<MetalItem> TUNGSTEN_NUGGET =
            registerIngredient("nugget/tungsten_nugget", 0xFF47484d);

    // 钴锭 / 粒
    public static final DeferredItem<MetalItem> COBALT_INGOT =
            registerIngredient("ingot/cobalt_ingot", 0xFF0050a0);
    public static final DeferredItem<MetalItem> COBALT_NUGGET =
            registerIngredient("nugget/cobalt_nugget", 0xFF0050a0);

    // 锰锭 / 粒
    public static final DeferredItem<MetalItem> MANGANESE_INGOT =
            registerIngredient("ingot/manganese_ingot", 0xFF9c7574);
    public static final DeferredItem<MetalItem> MANGANESE_NUGGET =
            registerIngredient("nugget/manganese_nugget", 0xFF9c7574);

    // 镁锭 / 粒
    public static final DeferredItem<MetalItem> MAGNESIUM_INGOT =
            registerIngredient("ingot/magnesium_ingot", 0xFFc0c8c8);
    public static final DeferredItem<MetalItem> MAGNESIUM_NUGGET =
            registerIngredient("nugget/magnesium_nugget", 0xFFc0c8c8);

    // 锂锭 / 粒
    public static final DeferredItem<MetalItem> LITHIUM_INGOT =
            registerIngredient("ingot/lithium_ingot", 0xFF698291);
    public static final DeferredItem<MetalItem> LITHIUM_NUGGET =
            registerIngredient("nugget/lithium_nugget", 0xFF698291);

    // 铍锭 / 粒
    public static final DeferredItem<MetalItem> BERYLLIUM_INGOT =
            registerIngredient("ingot/beryllium_ingot", 0xFFb8c0c0);
    public static final DeferredItem<MetalItem> BERYLLIUM_NUGGET =
            registerIngredient("nugget/beryllium_nugget", 0xFFb8c0c0);

    // 镓锭 / 粒
    public static final DeferredItem<MetalItem> GALLIUM_INGOT =
            registerIngredient("ingot/gallium_ingot", 0xFFd0d8d8);
    public static final DeferredItem<MetalItem> GALLIUM_NUGGET =
            registerIngredient("nugget/gallium_nugget", 0xFFd0d8d8);

    // 锗锭 / 粒
    public static final DeferredItem<MetalItem> GERMANIUM_INGOT =
            registerIngredient("ingot/germanium_ingot", 0xFF8b7777);
    public static final DeferredItem<MetalItem> GERMANIUM_NUGGET =
            registerIngredient("nugget/germanium_nugget", 0xFF8b7777);

    // 铋锭 / 粒
    public static final DeferredItem<MetalItem> BISMUTH_INGOT =
            registerIngredient("ingot/bismuth_ingot", 0xFFd0a0b8);
    public static final DeferredItem<MetalItem> BISMUTH_NUGGET =
            registerIngredient("nugget/bismuth_nugget", 0xFFd0a0b8);

    // 镉锭 / 粒
    public static final DeferredItem<MetalItem> CADMIUM_INGOT =
            registerIngredient("ingot/cadmium_ingot", 0xFFe0d8c8);
    public static final DeferredItem<MetalItem> CADMIUM_NUGGET =
            registerIngredient("nugget/cadmium_nugget", 0xFFe0d8c8);

    // 锑锭 / 粒
    public static final DeferredItem<MetalItem> ANTIMONY_INGOT =
            registerIngredient("ingot/antimony_ingot", 0xFFa09088);
    public static final DeferredItem<MetalItem> ANTIMONY_NUGGET =
            registerIngredient("nugget/antimony_nugget", 0xFFa09088);

    // 铟锭 / 粒
    public static final DeferredItem<MetalItem> INDIUM_INGOT =
            registerIngredient("ingot/indium_ingot", 0xFFc0c0d0);
    public static final DeferredItem<MetalItem> INDIUM_NUGGET =
            registerIngredient("nugget/indium_nugget", 0xFFc0c0d0);

    // 铱锭 / 粒
    public static final DeferredItem<MetalItem> IRIDIUM_INGOT =
            registerIngredient("ingot/iridium_ingot", 0xFFc8c8d0);
    public static final DeferredItem<MetalItem> IRIDIUM_NUGGET =
            registerIngredient("nugget/iridium_nugget", 0xFFc8c8d0);

    // 钯锭 / 粒
    public static final DeferredItem<MetalItem> PALLADIUM_INGOT =
            registerIngredient("ingot/palladium_ingot", 0xFFc0b8b8);
    public static final DeferredItem<MetalItem> PALLADIUM_NUGGET =
            registerIngredient("nugget/palladium_nugget", 0xFFc0b8b8);

    // 铑锭 / 粒
    public static final DeferredItem<MetalItem> RHODIUM_INGOT =
            registerIngredient("ingot/rhodium_ingot", 0xFFc8c0c0);
    public static final DeferredItem<MetalItem> RHODIUM_NUGGET =
            registerIngredient("nugget/rhodium_nugget", 0xFFc8c0c0);

    // 钌锭 / 粒
    public static final DeferredItem<MetalItem> RUTHENIUM_INGOT =
            registerIngredient("ingot/ruthenium_ingot", 0xFF8b8b9d);
    public static final DeferredItem<MetalItem> RUTHENIUM_NUGGET =
            registerIngredient("nugget/ruthenium_nugget", 0xFF8b8b9d);

    // 钒锭 / 粒
    public static final DeferredItem<MetalItem> VANADIUM_INGOT =
            registerIngredient("ingot/vanadium_ingot", 0xFFb0a898);
    public static final DeferredItem<MetalItem> VANADIUM_NUGGET =
            registerIngredient("nugget/vanadium_nugget", 0xFFb0a898);

    // 锆锭 / 粒
    public static final DeferredItem<MetalItem> ZIRCONIUM_INGOT =
            registerIngredient("ingot/zirconium_ingot", 0xFFb8b8c0);
    public static final DeferredItem<MetalItem> ZIRCONIUM_NUGGET =
            registerIngredient("nugget/zirconium_nugget", 0xFFb8b8c0);

    // 铌锭 / 粒
    public static final DeferredItem<MetalItem> NIOBIUM_INGOT =
            registerIngredient("ingot/niobium_ingot", 0xFFb0b0b8);
    public static final DeferredItem<MetalItem> NIOBIUM_NUGGET =
            registerIngredient("nugget/niobium_nugget", 0xFFb0b0b8);

    // 钼锭 / 粒
    public static final DeferredItem<MetalItem> MOLYBDENUM_INGOT =
            registerIngredient("ingot/molybdenum_ingot", 0xFFa0a0a8);
    public static final DeferredItem<MetalItem> MOLYBDENUM_NUGGET =
            registerIngredient("nugget/molybdenum_nugget", 0xFFa0a0a8);

    // 铪锭 / 粒
    public static final DeferredItem<MetalItem> HAFNIUM_INGOT =
            registerIngredient("ingot/hafnium_ingot", 0xFFb0b8b8);
    public static final DeferredItem<MetalItem> HAFNIUM_NUGGET =
            registerIngredient("nugget/hafnium_nugget", 0xFFb0b8b8);

    // 钽锭 / 粒
    public static final DeferredItem<MetalItem> TANTALUM_INGOT =
            registerIngredient("ingot/tantalum_ingot", 0xFF909098);
    public static final DeferredItem<MetalItem> TANTALUM_NUGGET =
            registerIngredient("nugget/tantalum_nugget", 0xFF909098);

    // 铼锭 / 粒
    public static final DeferredItem<MetalItem> RHENIUM_INGOT =
            registerIngredient("ingot/rhenium_ingot", 0xFFb49b9b);
    public static final DeferredItem<MetalItem> RHENIUM_NUGGET =
            registerIngredient("nugget/rhenium_nugget", 0xFFb49b9b);

    // 硒锭 / 粒
    public static final DeferredItem<MetalItem> SELENIUM_INGOT =
            registerIngredient("ingot/selenium_ingot", 0xFF9f9687);
    public static final DeferredItem<MetalItem> SELENIUM_NUGGET =
            registerIngredient("nugget/selenium_nugget", 0xFF9f9687);

    // 碲锭 / 粒
    public static final DeferredItem<MetalItem> TELLURIUM_INGOT =
            registerIngredient("ingot/tellurium_ingot", 0xFF97a286);
    public static final DeferredItem<MetalItem> TELLURIUM_NUGGET =
            registerIngredient("nugget/tellurium_nugget", 0xFF97a286);

    // 镧锭 / 粒
    public static final DeferredItem<MetalItem> LANTHANUM_INGOT =
            registerIngredient("ingot/lanthanum_ingot", 0xFFa2a2b6);
    public static final DeferredItem<MetalItem> LANTHANUM_NUGGET =
            registerIngredient("nugget/lanthanum_nugget", 0xFFa2a2b6);

    // 铈锭 / 粒
    public static final DeferredItem<MetalItem> CERIUM_INGOT =
            registerIngredient("ingot/cerium_ingot", 0xFFc1a3a8);
    public static final DeferredItem<MetalItem> CERIUM_NUGGET =
            registerIngredient("nugget/cerium_nugget", 0xFFc1a3a8);

    // 镨锭 / 粒
    public static final DeferredItem<MetalItem> PRASEODYMIUM_INGOT =
            registerIngredient("ingot/praseodymium_ingot", 0xFF7e9098);
    public static final DeferredItem<MetalItem> PRASEODYMIUM_NUGGET =
            registerIngredient("nugget/praseodymium_nugget", 0xFF7e9098);

    // 钕锭 / 粒
    public static final DeferredItem<MetalItem> NEODYMIUM_INGOT =
            registerIngredient("ingot/neodymium_ingot", 0xFFa1a1aa);
    public static final DeferredItem<MetalItem> NEODYMIUM_NUGGET =
            registerIngredient("nugget/neodymium_nugget", 0xFFa1a1aa);

    // 钐锭 / 粒
    public static final DeferredItem<MetalItem> SAMARIUM_INGOT =
            registerIngredient("ingot/samarium_ingot", 0xFFb6ccb2);
    public static final DeferredItem<MetalItem> SAMARIUM_NUGGET =
            registerIngredient("nugget/samarium_nugget", 0xFFb6ccb2);

    // 铕锭 / 粒
    public static final DeferredItem<MetalItem> EUROPIUM_INGOT =
            registerIngredient("ingot/europium_ingot", 0xFFa7b9a3);
    public static final DeferredItem<MetalItem> EUROPIUM_NUGGET =
            registerIngredient("nugget/europium_nugget", 0xFFa7b9a3);

    // 钆锭 / 粒
    public static final DeferredItem<MetalItem> GADOLINIUM_INGOT =
            registerIngredient("ingot/gadolinium_ingot", 0xFFa6d6d8);
    public static final DeferredItem<MetalItem> GADOLINIUM_NUGGET =
            registerIngredient("nugget/gadolinium_nugget", 0xFFa6d6d8);

    // 铽锭 / 粒
    public static final DeferredItem<MetalItem> TERBIUM_INGOT =
            registerIngredient("ingot/terbium_ingot", 0xFFd7afd3);
    public static final DeferredItem<MetalItem> TERBIUM_NUGGET =
            registerIngredient("nugget/terbium_nugget", 0xFFd7afd3);

    // 镝锭 / 粒
    public static final DeferredItem<MetalItem> DYSPROSIUM_INGOT =
            registerIngredient("ingot/dysprosium_ingot", 0xFFb9d7af);
    public static final DeferredItem<MetalItem> DYSPROSIUM_NUGGET =
            registerIngredient("nugget/dysprosium_nugget", 0xFFb9d7af);

    // 钬锭 / 粒
    public static final DeferredItem<MetalItem> HOLMIUM_INGOT =
            registerIngredient("ingot/holmium_ingot", 0xFFd7afaf);
    public static final DeferredItem<MetalItem> HOLMIUM_NUGGET =
            registerIngredient("nugget/holmium_nugget", 0xFFd7afaf);

    // 铒锭 / 粒
    public static final DeferredItem<MetalItem> ERBIUM_INGOT =
            registerIngredient("ingot/erbium_ingot", 0xFFd3afd7);
    public static final DeferredItem<MetalItem> ERBIUM_NUGGET =
            registerIngredient("nugget/erbium_nugget", 0xFFd3afd7);

    // 铥锭 / 粒
    public static final DeferredItem<MetalItem> THULIUM_INGOT =
            registerIngredient("ingot/thulium_ingot", 0xFFafb4d7);
    public static final DeferredItem<MetalItem> THULIUM_NUGGET =
            registerIngredient("nugget/thulium_nugget", 0xFFafb4d7);

    // 镱锭 / 粒
    public static final DeferredItem<MetalItem> YTTERBIUM_INGOT =
            registerIngredient("ingot/ytterbium_ingot", 0xFFd3d7af);
    public static final DeferredItem<MetalItem> YTTERBIUM_NUGGET =
            registerIngredient("nugget/ytterbium_nugget", 0xFFd3d7af);

    // 镥锭 / 粒
    public static final DeferredItem<MetalItem> LUTETIUM_INGOT =
            registerIngredient("ingot/lutetium_ingot", 0xFFe7ebc4);
    public static final DeferredItem<MetalItem> LUTETIUM_NUGGET =
            registerIngredient("nugget/lutetium_nugget", 0xFFe7ebc4);

    // 钪锭 / 粒
    public static final DeferredItem<MetalItem> SCANDIUM_INGOT =
            registerIngredient("ingot/scandium_ingot", 0xFFc4e0eb);
    public static final DeferredItem<MetalItem> SCANDIUM_NUGGET =
            registerIngredient("nugget/scandium_nugget", 0xFFc4e0eb);

    // 钇锭 / 粒
    public static final DeferredItem<MetalItem> YTTRIUM_INGOT =
            registerIngredient("ingot/yttrium_ingot", 0xFFc0c0c8);
    public static final DeferredItem<MetalItem> YTTRIUM_NUGGET =
            registerIngredient("nugget/yttrium_nugget", 0xFFc0c0c8);

    // 青铜锭 / 粒
    public static final DeferredItem<MetalItem> BRONZE_INGOT =
            registerIngredient("ingot/bronze_ingot", 0xFFcd7f32);
    public static final DeferredItem<MetalItem> BRONZE_NUGGET =
            registerIngredient("nugget/bronze_nugget", 0xFFcd7f32);

    // 黄铜锭 / 粒
    public static final DeferredItem<MetalItem> BRASS_INGOT =
            registerIngredient("ingot/brass_ingot", 0xFFb5a642);
    public static final DeferredItem<MetalItem> BRASS_NUGGET =
            registerIngredient("nugget/brass_nugget", 0xFFb5a642);

    // 不锈钢锭 / 粒
    public static final DeferredItem<MetalItem> STAINLESS_STEEL_INGOT =
            registerIngredient("ingot/stainless_steel_ingot", 0xFFc8c8c8);
    public static final DeferredItem<MetalItem> STAINLESS_STEEL_NUGGET =
            registerIngredient("nugget/stainless_steel_nugget", 0xFFc8c8c8);

    // 碳钢锭 / 粒
    public static final DeferredItem<MetalItem> CARBON_STEEL_INGOT =
            registerIngredient("ingot/carbon_steel_ingot", 0xFF3a3e40);
    public static final DeferredItem<MetalItem> CARBON_STEEL_NUGGET =
            registerIngredient("nugget/carbon_steel_nugget", 0xFF3a3e40);

    // 高速钢锭 / 粒
    public static final DeferredItem<MetalItem> HIGH_SPEED_STEEL_INGOT =
            registerIngredient("ingot/high_speed_steel_ingot", 0xFFb8b0b0);
    public static final DeferredItem<MetalItem> HIGH_SPEED_STEEL_NUGGET =
            registerIngredient("nugget/high_speed_steel_nugget", 0xFFb8b0b0);

    // 工具钢锭 / 粒
    public static final DeferredItem<MetalItem> TOOL_STEEL_INGOT =
            registerIngredient("ingot/tool_steel_ingot", 0xFFcdcdcd);
    public static final DeferredItem<MetalItem> TOOL_STEEL_NUGGET =
            registerIngredient("nugget/tool_steel_nugget", 0xFFcdcdcd);

    // 碳化钨锭 / 粒
    public static final DeferredItem<MetalItem> TUNGSTEN_CARBIDE_INGOT =
            registerIngredient("ingot/tungsten_carbide_ingot", 0xFF424242);
    public static final DeferredItem<MetalItem> TUNGSTEN_CARBIDE_NUGGET =
            registerIngredient("nugget/tungsten_carbide_nugget", 0xFF424242);

    // 硬质合金锭 / 粒
    public static final DeferredItem<MetalItem> CEMENTED_CARBIDE_INGOT =
            registerIngredient("ingot/cemented_carbide_ingot", 0xFF707070);
    public static final DeferredItem<MetalItem> CEMENTED_CARBIDE_NUGGET =
            registerIngredient("nugget/cemented_carbide_nugget", 0xFF707070);

    // 因科镍锭 / 粒
    public static final DeferredItem<MetalItem> INCONEL_INGOT =
            registerIngredient("ingot/inconel_ingot", 0xFFa8b0b0);
    public static final DeferredItem<MetalItem> INCONEL_NUGGET =
            registerIngredient("nugget/inconel_nugget", 0xFFa8b0b0);

    // 哈氏合金锭 / 粒
    public static final DeferredItem<MetalItem> HASTELLOY_INGOT =
            registerIngredient("ingot/hastelloy_ingot", 0xFFa0a8a8);
    public static final DeferredItem<MetalItem> HASTELLOY_NUGGET =
            registerIngredient("nugget/hastelloy_nugget", 0xFFa0a8a8);

    // 司太立锭 / 粒
    public static final DeferredItem<MetalItem> STELLITE_INGOT =
            registerIngredient("ingot/stellite_ingot", 0xFFa8b0a8);
    public static final DeferredItem<MetalItem> STELLITE_NUGGET =
            registerIngredient("nugget/stellite_nugget", 0xFFa8b0a8);

    // 白铜锭 / 粒
    public static final DeferredItem<MetalItem> CUPRONICKEL_INGOT =
            registerIngredient("ingot/cupronickel_ingot", 0xFFc0b8a8);
    public static final DeferredItem<MetalItem> CUPRONICKEL_NUGGET =
            registerIngredient("nugget/cupronickel_nugget", 0xFFc0b8a8);

    // 因瓦合金锭 / 粒
    public static final DeferredItem<MetalItem> INVAR_INGOT =
            registerIngredient("ingot/invar_ingot", 0xFFb0a4a4);
    public static final DeferredItem<MetalItem> INVAR_NUGGET =
            registerIngredient("nugget/invar_nugget", 0xFFb0a4a4);

    // 铝锂合金锭 / 粒
    public static final DeferredItem<MetalItem> ALUMINIUM_LITHIUM_INGOT =
            registerIngredient("ingot/aluminium_lithium_ingot", 0xFFb8b8b8);
    public static final DeferredItem<MetalItem> ALUMINIUM_LITHIUM_NUGGET =
            registerIngredient("nugget/aluminium_lithium_nugget", 0xFFb8b8b8);

    // 镁合金锭 / 粒
    public static final DeferredItem<MetalItem> MAGNESIUM_ALLOY_INGOT =
            registerIngredient("ingot/magnesium_alloy_ingot", 0xFFc1a6bc);
    public static final DeferredItem<MetalItem> MAGNESIUM_ALLOY_NUGGET =
            registerIngredient("nugget/magnesium_alloy_nugget", 0xFFc1a6bc);

    // 锆合金锭 / 粒
    public static final DeferredItem<MetalItem> ZIRCONIUM_ALLOY_INGOT =
            registerIngredient("ingot/zirconium_alloy_ingot", 0xFFb0b8b0);
    public static final DeferredItem<MetalItem> ZIRCONIUM_ALLOY_NUGGET =
            registerIngredient("nugget/zirconium_alloy_nugget", 0xFFb0b8b0);

    // 铌锡锭 / 粒
    public static final DeferredItem<MetalItem> NIOBIUM_TIN_INGOT =
            registerIngredient("ingot/niobium_tin_ingot", 0xFFa0a8a0);
    public static final DeferredItem<MetalItem> NIOBIUM_TIN_NUGGET =
            registerIngredient("nugget/niobium_tin_nugget", 0xFFa0a8a0);

    // 钛铝锭 / 粒
    public static final DeferredItem<MetalItem> TITANIUM_ALUMINIDE_INGOT =
            registerIngredient("ingot/titanium_aluminide_ingot", 0xFFa8a8a8);
    public static final DeferredItem<MetalItem> TITANIUM_ALUMINIDE_NUGGET =
            registerIngredient("nugget/titanium_aluminide_nugget", 0xFFa8a8a8);

    // 铬钼钢锭 / 粒
    public static final DeferredItem<MetalItem> CHROMOLY_INGOT =
            registerIngredient("ingot/chromoly_ingot", 0xFFb3c6c4);
    public static final DeferredItem<MetalItem> CHROMOLY_NUGGET =
            registerIngredient("nugget/chromoly_nugget", 0xFFb3c6c4);

    // 硅钢锭 / 粒
    public static final DeferredItem<MetalItem> SILICON_STEEL_INGOT =
            registerIngredient("ingot/silicon_steel_ingot", 0xFFa9a9a9);
    public static final DeferredItem<MetalItem> SILICON_STEEL_NUGGET =
            registerIngredient("nugget/silicon_steel_nugget", 0xFFa9a9a9);

    // 镍基合金锭 / 粒
    public static final DeferredItem<MetalItem> NICKEL_ALLOY_INGOT =
            registerIngredient("ingot/nickel_alloy_ingot", 0xFF97a1af);
    public static final DeferredItem<MetalItem> NICKEL_ALLOY_NUGGET =
            registerIngredient("nugget/nickel_alloy_nugget", 0xFF97a1af);

    // 钴基合金锭 / 粒
    public static final DeferredItem<MetalItem> COBALT_ALLOY_INGOT =
            registerIngredient("ingot/cobalt_alloy_ingot", 0xFF657da2);
    public static final DeferredItem<MetalItem> COBALT_ALLOY_NUGGET =
            registerIngredient("nugget/cobalt_alloy_nugget", 0xFF657da2);

    // 铝青铜锭 / 粒
    public static final DeferredItem<MetalItem> ALUMINIUM_BRONZE_INGOT =
            registerIngredient("ingot/aluminium_bronze_ingot", 0xFFb0a080);
    public static final DeferredItem<MetalItem> ALUMINIUM_BRONZE_NUGGET =
            registerIngredient("nugget/aluminium_bronze_nugget", 0xFFb0a080);

    // 铍青铜锭 / 粒
    public static final DeferredItem<MetalItem> BERYLLIUM_COPPER_INGOT =
            registerIngredient("ingot/beryllium_copper_ingot", 0xFFc0a080);
    public static final DeferredItem<MetalItem> BERYLLIUM_COPPER_NUGGET =
            registerIngredient("nugget/beryllium_copper_nugget", 0xFFc0a080);

    // 磷青铜锭 / 粒
    public static final DeferredItem<MetalItem> PHOSPHOR_BRONZE_INGOT =
            registerIngredient("ingot/phosphor_bronze_ingot", 0xFFb09070);
    public static final DeferredItem<MetalItem> PHOSPHOR_BRONZE_NUGGET =
            registerIngredient("nugget/phosphor_bronze_nugget", 0xFFb09070);

    // 铜镍合金锭 / 粒
    public static final DeferredItem<MetalItem> COPPER_NICKEL_INGOT =
            registerIngredient("ingot/copper_nickel_ingot", 0xFFe4c692);
    public static final DeferredItem<MetalItem> COPPER_NICKEL_NUGGET =
            registerIngredient("nugget/copper_nickel_nugget", 0xFFe4c692);

    // 镍铬合金锭 / 粒
    public static final DeferredItem<MetalItem> NICHROME_INGOT =
            registerIngredient("ingot/nichrome_ingot", 0xFFb0b0b0);
    public static final DeferredItem<MetalItem> NICHROME_NUGGET =
            registerIngredient("nugget/nichrome_nugget", 0xFFb0b0b0);

    // 铁铬铝锭 / 粒
    public static final DeferredItem<MetalItem> FECRALLOY_INGOT =
            registerIngredient("ingot/fecralloy_ingot", 0xFFcecdcc);
    public static final DeferredItem<MetalItem> FECRALLOY_NUGGET =
            registerIngredient("nugget/fecralloy_nugget", 0xFFcecdcc);

    // 锰铜锭 / 粒
    public static final DeferredItem<MetalItem> MANGANIN_INGOT =
            registerIngredient("ingot/manganin_ingot", 0xFFa09080);
    public static final DeferredItem<MetalItem> MANGANIN_NUGGET =
            registerIngredient("nugget/manganin_nugget", 0xFFa09080);

    // 康铜锭 / 粒
    public static final DeferredItem<MetalItem> CONSTANTAN_INGOT =
            registerIngredient("ingot/constantan_ingot", 0xFFb0a090);
    public static final DeferredItem<MetalItem> CONSTANTAN_NUGGET =
            registerIngredient("nugget/constantan_nugget", 0xFFb0a090);

    // 热电偶合金锭 / 粒
    public static final DeferredItem<MetalItem> THERMOCOUPLE_ALLOY_INGOT =
            registerIngredient("ingot/thermocouple_alloy_ingot", 0xFF9c9c9c);
    public static final DeferredItem<MetalItem> THERMOCOUPLE_ALLOY_NUGGET =
            registerIngredient("nugget/thermocouple_alloy_nugget", 0xFF9c9c9c);

    // 铂铑锭 / 粒
    public static final DeferredItem<MetalItem> PLATINUM_RHODIUM_INGOT =
            registerIngredient("ingot/platinum_rhodium_ingot", 0xFFffe0a9);
    public static final DeferredItem<MetalItem> PLATINUM_RHODIUM_NUGGET =
            registerIngredient("nugget/platinum_rhodium_nugget", 0xFFffe0a9);

    // 金锗锭 / 粒
    public static final DeferredItem<MetalItem> GOLD_GERMANIUM_INGOT =
            registerIngredient("ingot/gold_germanium_ingot", 0xFFc0a060);
    public static final DeferredItem<MetalItem> GOLD_GERMANIUM_NUGGET =
            registerIngredient("nugget/gold_germanium_nugget", 0xFFc0a060);

    // 金锡锭 / 粒
    public static final DeferredItem<MetalItem> GOLD_TIN_INGOT =
            registerIngredient("ingot/gold_tin_ingot", 0xFFc0a070);
    public static final DeferredItem<MetalItem> GOLD_TIN_NUGGET =
            registerIngredient("nugget/gold_tin_nugget", 0xFFc0a070);

    // 银钯锭 / 粒
    public static final DeferredItem<MetalItem> SILVER_PALLADIUM_INGOT =
            registerIngredient("ingot/silver_palladium_ingot", 0xFFc0b0b0);
    public static final DeferredItem<MetalItem> SILVER_PALLADIUM_NUGGET =
            registerIngredient("nugget/silver_palladium_nugget", 0xFFc0b0b0);

    // 银锡锭 / 粒
    public static final DeferredItem<MetalItem> SILVER_TIN_INGOT =
            registerIngredient("ingot/silver_tin_ingot", 0xFFc0b0a0);
    public static final DeferredItem<MetalItem> SILVER_TIN_NUGGET =
            registerIngredient("nugget/silver_tin_nugget", 0xFFc0b0a0);

    // 铟锡氧化物锭 / 粒
    public static final DeferredItem<MetalItem> INDIUM_TIN_OXIDE_INGOT =
            registerIngredient("ingot/indium_tin_oxide_ingot", 0xFF9fc79d);
    public static final DeferredItem<MetalItem> INDIUM_TIN_OXIDE_NUGGET =
            registerIngredient("nugget/indium_tin_oxide_nugget", 0xFF9fc79d);

    // 二氧化钛锭 / 粒
    public static final DeferredItem<MetalItem> TITANIUM_DIOXIDE_INGOT =
            registerIngredient("ingot/titanium_dioxide_ingot", 0xFFc7b29d);
    public static final DeferredItem<MetalItem> TITANIUM_DIOXIDE_NUGGET =
            registerIngredient("nugget/titanium_dioxide_nugget", 0xFFc7b29d);

    // 氧化铝锭 / 粒
    public static final DeferredItem<MetalItem> ALUMINA_INGOT =
            registerIngredient("ingot/alumina_ingot", 0xFFe8e8e8);
    public static final DeferredItem<MetalItem> ALUMINA_NUGGET =
            registerIngredient("nugget/alumina_nugget", 0xFFe8e8e8);

    // 氧化锆锭 / 粒
    public static final DeferredItem<MetalItem> ZIRCONIA_INGOT =
            registerIngredient("ingot/zirconia_ingot", 0xFFe0e0e0);
    public static final DeferredItem<MetalItem> ZIRCONIA_NUGGET =
            registerIngredient("nugget/zirconia_nugget", 0xFFe0e0e0);

    // 碳化硅锭 / 粒
    public static final DeferredItem<MetalItem> SILICON_CARBIDE_INGOT =
            registerIngredient("ingot/silicon_carbide_ingot", 0xFF6d6155);
    public static final DeferredItem<MetalItem> SILICON_CARBIDE_NUGGET =
            registerIngredient("nugget/silicon_carbide_nugget", 0xFF6d6155);

    // 氮化硼锭 / 粒
    public static final DeferredItem<MetalItem> BORON_NITRIDE_INGOT =
            registerIngredient("ingot/boron_nitride_ingot", 0xFF86705b);
    public static final DeferredItem<MetalItem> BORON_NITRIDE_NUGGET =
            registerIngredient("nugget/boron_nitride_nugget", 0xFF86705b);

    // 氮化钛锭 / 粒
    public static final DeferredItem<MetalItem> TITANIUM_NITRIDE_INGOT =
            registerIngredient("ingot/titanium_nitride_ingot", 0xFFc0a040);
    public static final DeferredItem<MetalItem> TITANIUM_NITRIDE_NUGGET =
            registerIngredient("nugget/titanium_nitride_nugget", 0xFFc0a040);

    // 氮化硅锭 / 粒
    public static final DeferredItem<MetalItem> SILICON_NITRIDE_INGOT =
            registerIngredient("ingot/silicon_nitride_ingot", 0xFFc0c0c0);
    public static final DeferredItem<MetalItem> SILICON_NITRIDE_NUGGET =
            registerIngredient("nugget/silicon_nitride_nugget", 0xFFc0c0c0);

    // 二硼化钛锭 / 粒
    public static final DeferredItem<MetalItem> TITANIUM_DIBORIDE_INGOT =
            registerIngredient("ingot/titanium_diboride_ingot", 0xFFaf9d8b);
    public static final DeferredItem<MetalItem> TITANIUM_DIBORIDE_NUGGET =
            registerIngredient("nugget/titanium_diboride_nugget", 0xFFaf9d8b);

    // 二硼化锆锭 / 粒
    public static final DeferredItem<MetalItem> ZIRCONIUM_DIBORIDE_INGOT =
            registerIngredient("ingot/zirconium_diboride_ingot", 0xFF92af8b);
    public static final DeferredItem<MetalItem> ZIRCONIUM_DIBORIDE_NUGGET =
            registerIngredient("nugget/zirconium_diboride_nugget", 0xFF92af8b);

    // 碳化铪锭 / 粒
    public static final DeferredItem<MetalItem> HAFNIUM_CARBIDE_INGOT =
            registerIngredient("ingot/hafnium_carbide_ingot", 0xFF989898);
    public static final DeferredItem<MetalItem> HAFNIUM_CARBIDE_NUGGET =
            registerIngredient("nugget/hafnium_carbide_nugget", 0xFF989898);

    // 碳化钽锭 / 粒
    public static final DeferredItem<MetalItem> TANTALUM_CARBIDE_INGOT =
            registerIngredient("ingot/tantalum_carbide_ingot", 0xFF898989);
    public static final DeferredItem<MetalItem> TANTALUM_CARBIDE_NUGGET =
            registerIngredient("nugget/tantalum_carbide_nugget", 0xFF898989);

    // 碳化铌锭 / 粒
    public static final DeferredItem<MetalItem> NIOBIUM_CARBIDE_INGOT =
            registerIngredient("ingot/niobium_carbide_ingot", 0xFFaba0a0);
    public static final DeferredItem<MetalItem> NIOBIUM_CARBIDE_NUGGET =
            registerIngredient("nugget/niobium_carbide_nugget", 0xFFaba0a0);

    // 碳化铬锭 / 粒
    public static final DeferredItem<MetalItem> CHROMIUM_CARBIDE_INGOT =
            registerIngredient("ingot/chromium_carbide_ingot", 0xFFa0aba5);
    public static final DeferredItem<MetalItem> CHROMIUM_CARBIDE_NUGGET =
            registerIngredient("nugget/chromium_carbide_nugget", 0xFFa0aba5);

    // 碳化钒锭 / 粒
    public static final DeferredItem<MetalItem> VANADIUM_CARBIDE_INGOT =
            registerIngredient("ingot/vanadium_carbide_ingot", 0xFFabac9d);
    public static final DeferredItem<MetalItem> VANADIUM_CARBIDE_NUGGET =
            registerIngredient("nugget/vanadium_carbide_nugget", 0xFFabac9d);

    // 碳化钼锭 / 粒
    public static final DeferredItem<MetalItem> MOLYBDENUM_CARBIDE_INGOT =
            registerIngredient("ingot/molybdenum_carbide_ingot", 0xFFa0a8ab);
    public static final DeferredItem<MetalItem> MOLYBDENUM_CARBIDE_NUGGET =
            registerIngredient("nugget/molybdenum_carbide_nugget", 0xFFa0a8ab);

    // 硼化钨锭 / 粒
    public static final DeferredItem<MetalItem> TUNGSTEN_BORIDE_INGOT =
            registerIngredient("ingot/tungsten_boride_ingot", 0xFF5c5c5c);
    public static final DeferredItem<MetalItem> TUNGSTEN_BORIDE_NUGGET =
            registerIngredient("nugget/tungsten_boride_nugget", 0xFF5c5c5c);

    // 硼化铬锭 / 粒
    public static final DeferredItem<MetalItem> CHROMIUM_BORIDE_INGOT =
            registerIngredient("ingot/chromium_boride_ingot", 0xFFbad1db);
    public static final DeferredItem<MetalItem> CHROMIUM_BORIDE_NUGGET =
            registerIngredient("nugget/chromium_boride_nugget", 0xFFbad1db);

    // 硼化钴锭 / 粒
    public static final DeferredItem<MetalItem> COBALT_BORIDE_INGOT =
            registerIngredient("ingot/cobalt_boride_ingot", 0xFF586b8a);
    public static final DeferredItem<MetalItem> COBALT_BORIDE_NUGGET =
            registerIngredient("nugget/cobalt_boride_nugget", 0xFF586b8a);

    // 硅化钼锭 / 粒
    public static final DeferredItem<MetalItem> MOLYBDENUM_SILICIDE_INGOT =
            registerIngredient("ingot/molybdenum_silicide_ingot", 0xFF868b8a);
    public static final DeferredItem<MetalItem> MOLYBDENUM_SILICIDE_NUGGET =
            registerIngredient("nugget/molybdenum_silicide_nugget", 0xFF868b8a);

    // 硅化钨锭 / 粒
    public static final DeferredItem<MetalItem> TUNGSTEN_SILICIDE_INGOT =
            registerIngredient("ingot/tungsten_silicide_ingot", 0xFF465067);
    public static final DeferredItem<MetalItem> TUNGSTEN_SILICIDE_NUGGET =
            registerIngredient("nugget/tungsten_silicide_nugget", 0xFF465067);

    // 锗硅锭 / 粒
    public static final DeferredItem<MetalItem> SILICON_GERMANIUM_INGOT =
            registerIngredient("ingot/silicon_germanium_ingot", 0xFF576645);
    public static final DeferredItem<MetalItem> SILICON_GERMANIUM_NUGGET =
            registerIngredient("nugget/silicon_germanium_nugget", 0xFF576645);

    // 砷化镓锭 / 粒
    public static final DeferredItem<MetalItem> GALLIUM_ARSENIDE_INGOT =
            registerIngredient("ingot/gallium_arsenide_ingot", 0xFF4a5e33);
    public static final DeferredItem<MetalItem> GALLIUM_ARSENIDE_NUGGET =
            registerIngredient("nugget/gallium_arsenide_nugget", 0xFF4a5e33);

    // 磷化铟锭 / 粒
    public static final DeferredItem<MetalItem> INDIUM_PHOSPHIDE_INGOT =
            registerIngredient("ingot/indium_phosphide_ingot", 0xFFabb5a0);
    public static final DeferredItem<MetalItem> INDIUM_PHOSPHIDE_NUGGET =
            registerIngredient("nugget/indium_phosphide_nugget", 0xFFabb5a0);

    // 氮化镓锭 / 粒
    public static final DeferredItem<MetalItem> GALLIUM_NITRIDE_INGOT =
            registerIngredient("ingot/gallium_nitride_ingot", 0xFFa0b0b5);
    public static final DeferredItem<MetalItem> GALLIUM_NITRIDE_NUGGET =
            registerIngredient("nugget/gallium_nitride_nugget", 0xFFa0b0b5);

    // 铜铟镓硒锭 / 粒
    public static final DeferredItem<MetalItem> CIGS_INGOT =
            registerIngredient("ingot/cigs_ingot", 0xFFc9ac7d);
    public static final DeferredItem<MetalItem> CIGS_NUGGET =
            registerIngredient("nugget/cigs_nugget", 0xFFc9ac7d);

    // 碲化镉锭 / 粒
    public static final DeferredItem<MetalItem> CADMIUM_TELLURIDE_INGOT =
            registerIngredient("ingot/cadmium_telluride_ingot", 0xFFbdb2b2);
    public static final DeferredItem<MetalItem> CADMIUM_TELLURIDE_NUGGET =
            registerIngredient("nugget/cadmium_telluride_nugget", 0xFFbdb2b2);

    // 碲化铋锭 / 粒
    public static final DeferredItem<MetalItem> BISMUTH_TELLURIDE_INGOT =
            registerIngredient("ingot/bismuth_telluride_ingot", 0xFFbcbdb2);
    public static final DeferredItem<MetalItem> BISMUTH_TELLURIDE_NUGGET =
            registerIngredient("nugget/bismuth_telluride_nugget", 0xFFbcbdb2);

    // 硒化铋锭 / 粒
    public static final DeferredItem<MetalItem> BISMUTH_SELENIDE_INGOT =
            registerIngredient("ingot/bismuth_selenide_ingot", 0xFFb3c6ae);
    public static final DeferredItem<MetalItem> BISMUTH_SELENIDE_NUGGET =
            registerIngredient("nugget/bismuth_selenide_nugget", 0xFFb3c6ae);

    // 硒化锡锭 / 粒
    public static final DeferredItem<MetalItem> TIN_SELENIDE_INGOT =
            registerIngredient("ingot/tin_selenide_ingot", 0xFFaec3c6);
    public static final DeferredItem<MetalItem> TIN_SELENIDE_NUGGET =
            registerIngredient("nugget/tin_selenide_nugget", 0xFFaec3c6);

    // 碲化锡锭 / 粒
    public static final DeferredItem<MetalItem> TIN_TELLURIDE_INGOT =
            registerIngredient("ingot/tin_telluride_ingot", 0xFFaec6c5);
    public static final DeferredItem<MetalItem> TIN_TELLURIDE_NUGGET =
            registerIngredient("nugget/tin_telluride_nugget", 0xFFaec6c5);

    // 锑化铟锭 / 粒
    public static final DeferredItem<MetalItem> INDIUM_ANTIMONIDE_INGOT =
            registerIngredient("ingot/indium_antimonide_ingot", 0xFFb7c0b6);
    public static final DeferredItem<MetalItem> INDIUM_ANTIMONIDE_NUGGET =
            registerIngredient("nugget/indium_antimonide_nugget", 0xFFb7c0b6);

    // 锑化镓锭 / 粒
    public static final DeferredItem<MetalItem> GALLIUM_ANTIMONIDE_INGOT =
            registerIngredient("ingot/gallium_antimonide_ingot", 0xFF7f977d);
    public static final DeferredItem<MetalItem> GALLIUM_ANTIMONIDE_NUGGET =
            registerIngredient("nugget/gallium_antimonide_nugget", 0xFF7f977d);

    // 锑化铝锭 / 粒
    public static final DeferredItem<MetalItem> ALUMINIUM_ANTIMONIDE_INGOT =
            registerIngredient("ingot/aluminium_antimonide_ingot", 0xFFc6b5ae);
    public static final DeferredItem<MetalItem> ALUMINIUM_ANTIMONIDE_NUGGET =
            registerIngredient("nugget/aluminium_antimonide_nugget", 0xFFc6b5ae);

    // 碲化铅锭 / 粒
    public static final DeferredItem<MetalItem> LEAD_TELLURIDE_INGOT =
            registerIngredient("ingot/lead_telluride_ingot", 0xFF7d8297);
    public static final DeferredItem<MetalItem> LEAD_TELLURIDE_NUGGET =
            registerIngredient("nugget/lead_telluride_nugget", 0xFF7d8297);

    // 硒化铅锭 / 粒
    public static final DeferredItem<MetalItem> LEAD_SELENIDE_INGOT =
            registerIngredient("ingot/lead_selenide_ingot", 0xFF7d8f97);
    public static final DeferredItem<MetalItem> LEAD_SELENIDE_NUGGET =
            registerIngredient("nugget/lead_selenide_nugget", 0xFF7d8f97);

    // 铋硒碲锭 / 粒
    public static final DeferredItem<MetalItem> BISMUTH_SELENIDE_TELLURIDE_INGOT =
            registerIngredient("ingot/bismuth_selenide_telluride_ingot", 0xFFb6c0bc);
    public static final DeferredItem<MetalItem> BISMUTH_SELENIDE_TELLURIDE_NUGGET =
            registerIngredient("nugget/bismuth_selenide_telluride_nugget", 0xFFb6c0bc);

    // 铋锑锭 / 粒
    public static final DeferredItem<MetalItem> BISMUTH_ANTIMONY_INGOT =
            registerIngredient("ingot/bismuth_antimony_ingot", 0xFFbcb6c0);
    public static final DeferredItem<MetalItem> BISMUTH_ANTIMONY_NUGGET =
            registerIngredient("nugget/bismuth_antimony_nugget", 0xFFbcb6c0);

    // 锗铋碲锭 / 粒
    public static final DeferredItem<MetalItem> GERMANIUM_BISMUTH_TELLURIDE_INGOT =
            registerIngredient("ingot/germanium_bismuth_telluride_ingot", 0xFF97aac0);
    public static final DeferredItem<MetalItem> GERMANIUM_BISMUTH_TELLURIDE_NUGGET =
            registerIngredient("nugget/germanium_bismuth_telluride_nugget", 0xFF97aac0);

    // 银锑碲锭 / 粒
    public static final DeferredItem<MetalItem> SILVER_ANTIMONY_TELLURIDE_INGOT =
            registerIngredient("ingot/silver_antimony_telluride_ingot", 0xFFc0b6c0);
    public static final DeferredItem<MetalItem> SILVER_ANTIMONY_TELLURIDE_NUGGET =
            registerIngredient("nugget/silver_antimony_telluride_nugget", 0xFFc0b6c0);

    // 铜锑硫锭 / 粒
    public static final DeferredItem<MetalItem> COPPER_ANTIMONY_SULFIDE_INGOT =
            registerIngredient("ingot/copper_antimony_sulfide_ingot", 0xFFc0a497);
    public static final DeferredItem<MetalItem> COPPER_ANTIMONY_SULFIDE_NUGGET =
            registerIngredient("nugget/copper_antimony_sulfide_nugget", 0xFFc0a497);

    // 铜锌锡硫锭 / 粒
    public static final DeferredItem<MetalItem> CZTS_INGOT =
            registerIngredient("ingot/czts_ingot", 0xFFc0a797);
    public static final DeferredItem<MetalItem> CZTS_NUGGET =
            registerIngredient("nugget/czts_nugget", 0xFFc0a797);

    // 钙钛矿锭 / 粒
    public static final DeferredItem<MetalItem> PEROVSKITE_INGOT =
            registerIngredient("ingot/perovskite_ingot", 0xFFc2f0ed);
    public static final DeferredItem<MetalItem> PEROVSKITE_NUGGET =
            registerIngredient("nugget/perovskite_nugget", 0xFFc2f0ed);

    // 二硫化钼锭 / 粒
    public static final DeferredItem<MetalItem> MOLYBDENUM_DISULFIDE_INGOT =
            registerIngredient("ingot/molybdenum_disulfide_ingot", 0xFFa0a0a0);
    public static final DeferredItem<MetalItem> MOLYBDENUM_DISULFIDE_NUGGET =
            registerIngredient("nugget/molybdenum_disulfide_nugget", 0xFFa0a0a0);

    // 二硫化钨锭 / 粒
    public static final DeferredItem<MetalItem> TUNGSTEN_DISULFIDE_INGOT =
            registerIngredient("ingot/tungsten_disulfide_ingot", 0xFF4c3b2b);
    public static final DeferredItem<MetalItem> TUNGSTEN_DISULFIDE_NUGGET =
            registerIngredient("nugget/tungsten_disulfide_nugget", 0xFF4c3b2b);

    // 硫化铅锭 / 粒
    public static final DeferredItem<MetalItem> LEAD_SULFIDE_INGOT =
            registerIngredient("ingot/lead_sulfide_ingot", 0xFF5d6f82);
    public static final DeferredItem<MetalItem> LEAD_SULFIDE_NUGGET =
            registerIngredient("nugget/lead_sulfide_nugget", 0xFF5d6f82);

    // 硫化锡锭 / 粒
    public static final DeferredItem<MetalItem> TIN_SULFIDE_INGOT =
            registerIngredient("ingot/tin_sulfide_ingot", 0xFF63738f);
    public static final DeferredItem<MetalItem> TIN_SULFIDE_NUGGET =
            registerIngredient("nugget/tin_sulfide_nugget", 0xFF63738f);

    // 硫化铋锭 / 粒
    public static final DeferredItem<MetalItem> BISMUTH_SULFIDE_INGOT =
            registerIngredient("ingot/bismuth_sulfide_ingot", 0xFF814d95);
    public static final DeferredItem<MetalItem> BISMUTH_SULFIDE_NUGGET =
            registerIngredient("nugget/bismuth_sulfide_nugget", 0xFF814d95);

    // 硫化铜锭 / 粒
    public static final DeferredItem<MetalItem> COPPER_SULFIDE_INGOT =
            registerIngredient("ingot/copper_sulfide_ingot", 0xFFc8a547);
    public static final DeferredItem<MetalItem> COPPER_SULFIDE_NUGGET =
            registerIngredient("nugget/copper_sulfide_nugget", 0xFFc8a547);

    // 硫化银锭 / 粒
    public static final DeferredItem<MetalItem> SILVER_SULFIDE_INGOT =
            registerIngredient("ingot/silver_sulfide_ingot", 0xFFade2df);
    public static final DeferredItem<MetalItem> SILVER_SULFIDE_NUGGET =
            registerIngredient("nugget/silver_sulfide_nugget", 0xFFade2df);

    // 硫化锌锭 / 粒
    public static final DeferredItem<MetalItem> ZINC_SULFIDE_INGOT =
            registerIngredient("ingot/zinc_sulfide_ingot", 0xFFb2b37c);
    public static final DeferredItem<MetalItem> ZINC_SULFIDE_NUGGET =
            registerIngredient("nugget/zinc_sulfide_nugget", 0xFFb2b37c);

    // 硫化镉锭 / 粒
    public static final DeferredItem<MetalItem> CADMIUM_SULFIDE_INGOT =
            registerIngredient("ingot/cadmium_sulfide_ingot", 0xFF5f5f5f);
    public static final DeferredItem<MetalItem> CADMIUM_SULFIDE_NUGGET =
            registerIngredient("nugget/cadmium_sulfide_nugget", 0xFF5f5f5f);

    // 硫化锑锭 / 粒
    public static final DeferredItem<MetalItem> ANTIMONY_SULFIDE_INGOT =
            registerIngredient("ingot/antimony_sulfide_ingot", 0xFF8b8b8b);
    public static final DeferredItem<MetalItem> ANTIMONY_SULFIDE_NUGGET =
            registerIngredient("nugget/antimony_sulfide_nugget", 0xFF8b8b8b);

    // 硫化锰锭 / 粒
    public static final DeferredItem<MetalItem> MANGANESE_SULFIDE_INGOT =
            registerIngredient("ingot/manganese_sulfide_ingot", 0xFF753d85);
    public static final DeferredItem<MetalItem> MANGANESE_SULFIDE_NUGGET =
            registerIngredient("nugget/manganese_sulfide_nugget", 0xFF753d85);

    // 硫化镍锭 / 粒
    public static final DeferredItem<MetalItem> NICKEL_SULFIDE_INGOT =
            registerIngredient("ingot/nickel_sulfide_ingot", 0xFF26736e);
    public static final DeferredItem<MetalItem> NICKEL_SULFIDE_NUGGET =
            registerIngredient("nugget/nickel_sulfide_nugget", 0xFF26736e);

    // 硫化钴锭 / 粒
    public static final DeferredItem<MetalItem> COBALT_SULFIDE_INGOT =
            registerIngredient("ingot/cobalt_sulfide_ingot", 0xFF3d4285);
    public static final DeferredItem<MetalItem> COBALT_SULFIDE_NUGGET =
            registerIngredient("nugget/cobalt_sulfide_nugget", 0xFF3d4285);

    // 硫化钨锭 / 粒
    public static final DeferredItem<MetalItem> TUNGSTEN_SULFIDE_INGOT =
            registerIngredient("ingot/tungsten_sulfide_ingot", 0xFF484a3e);
    public static final DeferredItem<MetalItem> TUNGSTEN_SULFIDE_NUGGET =
            registerIngredient("nugget/tungsten_sulfide_nugget", 0xFF484a3e);

    // 硫化钼锭 / 粒
    public static final DeferredItem<MetalItem> MOLYBDENUM_SULFIDE_INGOT =
            registerIngredient("ingot/molybdenum_sulfide_ingot", 0xFF86898b);
    public static final DeferredItem<MetalItem> MOLYBDENUM_SULFIDE_NUGGET =
            registerIngredient("nugget/molybdenum_sulfide_nugget", 0xFF86898b);

    // 硫化钛锭 / 粒
    public static final DeferredItem<MetalItem> TITANIUM_SULFIDE_INGOT =
            registerIngredient("ingot/titanium_sulfide_ingot", 0xFF7b825d);
    public static final DeferredItem<MetalItem> TITANIUM_SULFIDE_NUGGET =
            registerIngredient("nugget/titanium_sulfide_nugget", 0xFF7b825d);

    // 硫化锗锭 / 粒
    public static final DeferredItem<MetalItem> GERMANIUM_SULFIDE_INGOT =
            registerIngredient("ingot/germanium_sulfide_ingot", 0xFF2b3f4c);
    public static final DeferredItem<MetalItem> GERMANIUM_SULFIDE_NUGGET =
            registerIngredient("nugget/germanium_sulfide_nugget", 0xFF2b3f4c);






    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> METAL_TAB =
            CREATIVE_TABS.register("metal_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup." + StardustIndustryMetalAddon.MODID + ".metal_tab"))
                            .icon(() -> ModItem.STEEL_INGOT.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                METAL_ITEMS.forEach(output::accept);
                            })
                            .build()
            );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        CREATIVE_TABS.register(eventBus);
    }
}