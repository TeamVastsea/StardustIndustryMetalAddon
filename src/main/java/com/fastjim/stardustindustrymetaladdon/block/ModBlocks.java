package com.fastjim.stardustindustrymetaladdon.block;

import com.fastjim.stardustindustrymetaladdon.StardustIndustryMetalAddon;
import com.fastjim.stardustindustrymetaladdon.item.MetalBlockItem;
import com.fastjim.stardustindustrymetaladdon.item.ModItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(StardustIndustryMetalAddon.MODID);

    // 钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_STEEL =
            registerMetalBlock("storage_block/steel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb1b1b1));

    // 铝块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ALUMINIUM =
            registerMetalBlock("storage_block/aluminium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd4d4d4));

    // 铅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LEAD =
            registerMetalBlock("storage_block/lead",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0a0b0));

    // 锌块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ZINC =
            registerMetalBlock("storage_block/zinc",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc8d0d0));

    // 镍块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NICKEL =
            registerMetalBlock("storage_block/nickel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb2bfbf));

    // 铬块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CHROME =
            registerMetalBlock("storage_block/chrome",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0b8b0));

    // 锇块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_OSMIUM =
            registerMetalBlock("storage_block/osmium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF8890a0));

    // 锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TIN =
            registerMetalBlock("storage_block/tin",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa8b0b8));

    // 银块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILVER =
            registerMetalBlock("storage_block/silver",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFf0f0f0));

    // 铂块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_PLATINUM =
            registerMetalBlock("storage_block/platinum",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd0d0d8));

    // 钛块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TITANIUM =
            registerMetalBlock("storage_block/titanium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0b8c0));

    // 钨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TUNGSTEN =
            registerMetalBlock("storage_block/tungsten",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF47484d));

    // 钴块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COBALT =
            registerMetalBlock("storage_block/cobalt",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF0050a0));

    // 锰块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MANGANESE =
            registerMetalBlock("storage_block/manganese",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF9c7574));

    // 镁块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MAGNESIUM =
            registerMetalBlock("storage_block/magnesium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0c8c8));

    // 锂块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LITHIUM =
            registerMetalBlock("storage_block/lithium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF698291));

    // 铍块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BERYLLIUM =
            registerMetalBlock("storage_block/beryllium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb8c0c0));

    // 镓块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GALLIUM =
            registerMetalBlock("storage_block/gallium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd0d8d8));

    // 锗块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GERMANIUM =
            registerMetalBlock("storage_block/germanium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF8b7777));

    // 铋块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BISMUTH =
            registerMetalBlock("storage_block/bismuth",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd0a0b8));

    // 镉块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CADMIUM =
            registerMetalBlock("storage_block/cadmium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFe0d8c8));

    // 锑块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ANTIMONY =
            registerMetalBlock("storage_block/antimony",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa09088));

    // 铟块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_INDIUM =
            registerMetalBlock("storage_block/indium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0c0d0));

    // 铱块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_IRIDIUM =
            registerMetalBlock("storage_block/iridium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc8c8d0));

    // 钯块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_PALLADIUM =
            registerMetalBlock("storage_block/palladium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0b8b8));

    // 铑块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_RHODIUM =
            registerMetalBlock("storage_block/rhodium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc8c0c0));

    // 钌块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_RUTHENIUM =
            registerMetalBlock("storage_block/ruthenium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF8b8b9d));

    // 钒块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_VANADIUM =
            registerMetalBlock("storage_block/vanadium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0a898));

    // 锆块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ZIRCONIUM =
            registerMetalBlock("storage_block/zirconium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb8b8c0));

    // 铌块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NIOBIUM =
            registerMetalBlock("storage_block/niobium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0b0b8));

    // 钼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MOLYBDENUM =
            registerMetalBlock("storage_block/molybdenum",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0a0a8));

    // 铪块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_HAFNIUM =
            registerMetalBlock("storage_block/hafnium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0b8b8));

    // 钽块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TANTALUM =
            registerMetalBlock("storage_block/tantalum",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF909098));

    // 铼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_RHENIUM =
            registerMetalBlock("storage_block/rhenium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb49b9b));

    // 硒块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SELENIUM =
            registerMetalBlock("storage_block/selenium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF9f9687));

    // 碲块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TELLURIUM =
            registerMetalBlock("storage_block/tellurium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF97a286));

    // 镧块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LANTHANUM =
            registerMetalBlock("storage_block/lanthanum",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa2a2b6));

    // 铈块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CERIUM =
            registerMetalBlock("storage_block/cerium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc1a3a8));

    // 镨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_PRASEODYMIUM =
            registerMetalBlock("storage_block/praseodymium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF7e9098));

    // 钕块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NEODYMIUM =
            registerMetalBlock("storage_block/neodymium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa1a1aa));

    // 钐块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SAMARIUM =
            registerMetalBlock("storage_block/samarium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb6ccb2));

    // 铕块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_EUROPIUM =
            registerMetalBlock("storage_block/europium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa7b9a3));

    // 钆块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GADOLINIUM =
            registerMetalBlock("storage_block/gadolinium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa6d6d8));

    // 铽块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TERBIUM =
            registerMetalBlock("storage_block/terbium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd7afd3));

    // 镝块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_DYSPROSIUM =
            registerMetalBlock("storage_block/dysprosium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb9d7af));

    // 钬块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_HOLMIUM =
            registerMetalBlock("storage_block/holmium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd7afaf));

    // 铒块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ERBIUM =
            registerMetalBlock("storage_block/erbium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd3afd7));

    // 铥块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_THULIUM =
            registerMetalBlock("storage_block/thulium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFafb4d7));

    // 镱块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_YTTERBIUM =
            registerMetalBlock("storage_block/ytterbium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFd3d7af));

    // 镥块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LUTETIUM =
            registerMetalBlock("storage_block/lutetium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFe7ebc4));

    // 钪块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SCANDIUM =
            registerMetalBlock("storage_block/scandium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc4e0eb));

    // 钇块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_YTTRIUM =
            registerMetalBlock("storage_block/yttrium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0c0c8));

    // 青铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BRONZE =
            registerMetalBlock("storage_block/bronze",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFcd7f32));

    // 黄铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BRASS =
            registerMetalBlock("storage_block/brass",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb5a642));

    // 不锈钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_STAINLESS_STEEL =
            registerMetalBlock("storage_block/stainless_steel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc8c8c8));

    // 碳钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CARBON_STEEL =
            registerMetalBlock("storage_block/carbon_steel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF3a3e40));

    // 高速钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_HIGH_SPEED_STEEL =
            registerMetalBlock("storage_block/high_speed_steel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb8b0b0));

    // 工具钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TOOL_STEEL =
            registerMetalBlock("storage_block/tool_steel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFcdcdcd));

    // 碳化钨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TUNGSTEN_CARBIDE =
            registerMetalBlock("storage_block/tungsten_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF424242));

    // 硬质合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CEMENTED_CARBIDE =
            registerMetalBlock("storage_block/cemented_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF707070));

    // 因科镍块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_INCONEL =
            registerMetalBlock("storage_block/inconel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa8b0b0));

    // 哈氏合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_HASTELLOY =
            registerMetalBlock("storage_block/hastelloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0a8a8));

    // 司太立块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_STELLITE =
            registerMetalBlock("storage_block/stellite",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa8b0a8));

    // 白铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CUPRONICKEL =
            registerMetalBlock("storage_block/cupronickel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0b8a8));

    // 因瓦合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_INVAR =
            registerMetalBlock("storage_block/invar",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0a4a4));

    // 铝锂合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ALUMINIUM_LITHIUM =
            registerMetalBlock("storage_block/aluminium_lithium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb8b8b8));

    // 镁合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MAGNESIUM_ALLOY =
            registerMetalBlock("storage_block/magnesium_alloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc1a6bc));

    // 锆合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ZIRCONIUM_ALLOY =
            registerMetalBlock("storage_block/zirconium_alloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0b8b0));

    // 铌锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NIOBIUM_TIN =
            registerMetalBlock("storage_block/niobium_tin",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0a8a0));

    // 钛铝块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TITANIUM_ALUMINIDE =
            registerMetalBlock("storage_block/titanium_aluminide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa8a8a8));

    // 铬钼钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CHROMOLY =
            registerMetalBlock("storage_block/chromoly",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb3c6c4));

    // 硅钢块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILICON_STEEL =
            registerMetalBlock("storage_block/silicon_steel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa9a9a9));

    // 镍基合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NICKEL_ALLOY =
            registerMetalBlock("storage_block/nickel_alloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF97a1af));

    // 钴基合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COBALT_ALLOY =
            registerMetalBlock("storage_block/cobalt_alloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF657da2));

    // 铝青铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ALUMINIUM_BRONZE =
            registerMetalBlock("storage_block/aluminium_bronze",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0a080));

    // 铍青铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BERYLLIUM_COPPER =
            registerMetalBlock("storage_block/beryllium_copper",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0a080));

    // 磷青铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_PHOSPHOR_BRONZE =
            registerMetalBlock("storage_block/phosphor_bronze",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb09070));

    // 铜镍合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COPPER_NICKEL =
            registerMetalBlock("storage_block/copper_nickel",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFe4c692));

    // 镍铬合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NICHROME =
            registerMetalBlock("storage_block/nichrome",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0b0b0));

    // 铁铬铝块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_FECRALLOY =
            registerMetalBlock("storage_block/fecralloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFcecdcc));

    // 锰铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MANGANIN =
            registerMetalBlock("storage_block/manganin",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa09080));

    // 康铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CONSTANTAN =
            registerMetalBlock("storage_block/constantan",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb0a090));

    // 热电偶合金块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_THERMOCOUPLE_ALLOY =
            registerMetalBlock("storage_block/thermocouple_alloy",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF9c9c9c));

    // 铂铑块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_PLATINUM_RHODIUM =
            registerMetalBlock("storage_block/platinum_rhodium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFffe0a9));

    // 金锗块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GOLD_GERMANIUM =
            registerMetalBlock("storage_block/gold_germanium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0a060));

    // 金锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GOLD_TIN =
            registerMetalBlock("storage_block/gold_tin",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0a070));

    // 银钯块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILVER_PALLADIUM =
            registerMetalBlock("storage_block/silver_palladium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0b0b0));

    // 银锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILVER_TIN =
            registerMetalBlock("storage_block/silver_tin",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0b0a0));

    // 铟锡氧化物块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_INDIUM_TIN_OXIDE =
            registerMetalBlock("storage_block/indium_tin_oxide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF9fc79d));

    // 二氧化钛块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TITANIUM_DIOXIDE =
            registerMetalBlock("storage_block/titanium_dioxide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc7b29d));

    // 氧化铝块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ALUMINA =
            registerMetalBlock("storage_block/alumina",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFe8e8e8));

    // 氧化锆块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ZIRCONIA =
            registerMetalBlock("storage_block/zirconia",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFe0e0e0));

    // 碳化硅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILICON_CARBIDE =
            registerMetalBlock("storage_block/silicon_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF6d6155));

    // 氮化硼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BORON_NITRIDE =
            registerMetalBlock("storage_block/boron_nitride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF86705b));

    // 氮化钛块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TITANIUM_NITRIDE =
            registerMetalBlock("storage_block/titanium_nitride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0a040));

    // 氮化硅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILICON_NITRIDE =
            registerMetalBlock("storage_block/silicon_nitride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0c0c0));

    // 二硼化钛块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TITANIUM_DIBORIDE =
            registerMetalBlock("storage_block/titanium_diboride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFaf9d8b));

    // 二硼化锆块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ZIRCONIUM_DIBORIDE =
            registerMetalBlock("storage_block/zirconium_diboride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF92af8b));

    // 碳化铪块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_HAFNIUM_CARBIDE =
            registerMetalBlock("storage_block/hafnium_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF989898));

    // 碳化钽块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TANTALUM_CARBIDE =
            registerMetalBlock("storage_block/tantalum_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF898989));

    // 碳化铌块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NIOBIUM_CARBIDE =
            registerMetalBlock("storage_block/niobium_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFaba0a0));

    // 碳化铬块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CHROMIUM_CARBIDE =
            registerMetalBlock("storage_block/chromium_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0aba5));

    // 碳化钒块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_VANADIUM_CARBIDE =
            registerMetalBlock("storage_block/vanadium_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFabac9d));

    // 碳化钼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MOLYBDENUM_CARBIDE =
            registerMetalBlock("storage_block/molybdenum_carbide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0a8ab));

    // 硼化钨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TUNGSTEN_BORIDE =
            registerMetalBlock("storage_block/tungsten_boride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF5c5c5c));

    // 硼化铬块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CHROMIUM_BORIDE =
            registerMetalBlock("storage_block/chromium_boride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFbad1db));

    // 硼化钴块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COBALT_BORIDE =
            registerMetalBlock("storage_block/cobalt_boride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF586b8a));

    // 硅化钼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MOLYBDENUM_SILICIDE =
            registerMetalBlock("storage_block/molybdenum_silicide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF868b8a));

    // 硅化钨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TUNGSTEN_SILICIDE =
            registerMetalBlock("storage_block/tungsten_silicide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF465067));

    // 锗硅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILICON_GERMANIUM =
            registerMetalBlock("storage_block/silicon_germanium",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF576645));

    // 砷化镓块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GALLIUM_ARSENIDE =
            registerMetalBlock("storage_block/gallium_arsenide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF4a5e33));

    // 磷化铟块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_INDIUM_PHOSPHIDE =
            registerMetalBlock("storage_block/indium_phosphide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFabb5a0));

    // 氮化镓块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GALLIUM_NITRIDE =
            registerMetalBlock("storage_block/gallium_nitride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0b0b5));

    // 铜铟镓硒块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CIGS =
            registerMetalBlock("storage_block/cigs",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc9ac7d));

    // 碲化镉块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CADMIUM_TELLURIDE =
            registerMetalBlock("storage_block/cadmium_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFbdb2b2));

    // 碲化铋块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BISMUTH_TELLURIDE =
            registerMetalBlock("storage_block/bismuth_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFbcbdb2));

    // 硒化铋块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BISMUTH_SELENIDE =
            registerMetalBlock("storage_block/bismuth_selenide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb3c6ae));

    // 硒化锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TIN_SELENIDE =
            registerMetalBlock("storage_block/tin_selenide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFaec3c6));

    // 碲化锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TIN_TELLURIDE =
            registerMetalBlock("storage_block/tin_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFaec6c5));

    // 锑化铟块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_INDIUM_ANTIMONIDE =
            registerMetalBlock("storage_block/indium_antimonide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb7c0b6));

    // 锑化镓块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GALLIUM_ANTIMONIDE =
            registerMetalBlock("storage_block/gallium_antimonide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF7f977d));

    // 锑化铝块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ALUMINIUM_ANTIMONIDE =
            registerMetalBlock("storage_block/aluminium_antimonide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc6b5ae));

    // 碲化铅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LEAD_TELLURIDE =
            registerMetalBlock("storage_block/lead_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF7d8297));

    // 硒化铅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LEAD_SELENIDE =
            registerMetalBlock("storage_block/lead_selenide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF7d8f97));

    // 铋硒碲块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BISMUTH_SELENIDE_TELLURIDE =
            registerMetalBlock("storage_block/bismuth_selenide_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb6c0bc));

    // 铋锑块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BISMUTH_ANTIMONY =
            registerMetalBlock("storage_block/bismuth_antimony",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFbcb6c0));

    // 锗铋碲块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GERMANIUM_BISMUTH_TELLURIDE =
            registerMetalBlock("storage_block/germanium_bismuth_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF97aac0));

    // 银锑碲块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILVER_ANTIMONY_TELLURIDE =
            registerMetalBlock("storage_block/silver_antimony_telluride",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0b6c0));

    // 铜锑硫块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COPPER_ANTIMONY_SULFIDE =
            registerMetalBlock("storage_block/copper_antimony_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0a497));

    // 铜锌锡硫块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CZTS =
            registerMetalBlock("storage_block/czts",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc0a797));

    // 钙钛矿块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_PEROVSKITE =
            registerMetalBlock("storage_block/perovskite",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc2f0ed));

    // 二硫化钼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MOLYBDENUM_DISULFIDE =
            registerMetalBlock("storage_block/molybdenum_disulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFa0a0a0));

    // 二硫化钨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TUNGSTEN_DISULFIDE =
            registerMetalBlock("storage_block/tungsten_disulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF4c3b2b));

    // 硫化铅块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_LEAD_SULFIDE =
            registerMetalBlock("storage_block/lead_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF5d6f82));

    // 硫化锡块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TIN_SULFIDE =
            registerMetalBlock("storage_block/tin_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF63738f));

    // 硫化铋块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_BISMUTH_SULFIDE =
            registerMetalBlock("storage_block/bismuth_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF814d95));

    // 硫化铜块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COPPER_SULFIDE =
            registerMetalBlock("storage_block/copper_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFc8a547));

    // 硫化银块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_SILVER_SULFIDE =
            registerMetalBlock("storage_block/silver_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFade2df));

    // 硫化锌块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ZINC_SULFIDE =
            registerMetalBlock("storage_block/zinc_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFFb2b37c));

    // 硫化镉块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_CADMIUM_SULFIDE =
            registerMetalBlock("storage_block/cadmium_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF5f5f5f));

    // 硫化锑块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_ANTIMONY_SULFIDE =
            registerMetalBlock("storage_block/antimony_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF8b8b8b));

    // 硫化锰块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MANGANESE_SULFIDE =
            registerMetalBlock("storage_block/manganese_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF753d85));

    // 硫化镍块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_NICKEL_SULFIDE =
            registerMetalBlock("storage_block/nickel_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF26736e));

    // 硫化钴块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_COBALT_SULFIDE =
            registerMetalBlock("storage_block/cobalt_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF3d4285));

    // 硫化钨块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TUNGSTEN_SULFIDE =
            registerMetalBlock("storage_block/tungsten_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF484a3e));

    // 硫化钼块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_MOLYBDENUM_SULFIDE =
            registerMetalBlock("storage_block/molybdenum_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF86898b));

    // 硫化钛块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_TITANIUM_SULFIDE =
            registerMetalBlock("storage_block/titanium_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF7b825d));

    // 硫化锗块
    public static final DeferredBlock<MetalBlock> BLOCK_OF_GERMANIUM_SULFIDE =
            registerMetalBlock("storage_block/germanium_sulfide",
                    () -> new MetalBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK), 0xFF2b3f4c));




    //注册
    private static <T extends MetalBlock> DeferredBlock<T> registerMetalBlock(String name, Supplier<T> blockSupplier) {
        DeferredBlock<T> block = BLOCKS.register(name, blockSupplier);

        DeferredItem<MetalBlockItem> blockItem = ModItem.ITEMS.register(name,
                () -> new MetalBlockItem(block.get(), new Item.Properties(), block.get().getColor()));

        ModItem.addMetalItem(blockItem);

        return block;
    }
}