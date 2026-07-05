package com.fastjim.stardustindustrymetaladdon.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;

public enum MetalMaterial implements Tier {

    // ToolStats:  incorrectTag, uses, speed, damage, enchantmentValue
    // ArmorStats: helmet, chestplate, leggings, boots, toughness, knockbackResistance, enchantmentValue
    STEEL("steel",      0xFFb1b1b1,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,   350, 6.5f, 2.5f, 14),
            new ArmorStats(2, 6, 5, 2, 0.0f, 0.00f, 9)),
    ALUMINIUM("aluminium", 0xFFd4d4d4,
            new ToolStats(BlockTags.INCORRECT_FOR_STONE_TOOL,     180, 7.0f, 1.0f, 16),
            new ArmorStats(1, 4, 3, 1, 0.0f, 0.00f, 16)),
    LEAD("lead",        0xFFa0a0b0,
            new ToolStats(BlockTags.INCORRECT_FOR_STONE_TOOL,     200, 4.0f, 1.5f, 10),
            new ArmorStats(2, 5, 4, 2, 0.0f, 0.00f, 10)),
    ZINC("zinc",        0xFFc8d0d0,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL,      210, 4.5f, 1.5f, 12),
            new ArmorStats(1, 4, 3, 1, 0.0f, 0.00f, 12)),
    NICKEL("nickel",    0xFFb2bfbf,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL,      400, 6.0f, 2.0f, 14),
            new ArmorStats(2, 6, 5, 2, 0.0f, 0.00f, 14)),
    CHROME("chrome",    0xFFa0b8b0,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL,      320, 7.5f, 2.8f, 12),
            new ArmorStats(2, 6, 5, 2, 0.5f, 0.00f, 12)),
    OSMIUM("osmium",    0xFF8890a0,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,   600, 8.0f, 3.5f, 10),
            new ArmorStats(3, 7, 6, 3, 1.0f, 0.10f, 10)),
    TIN("tin",          0xFFa8b0b8,
            new ToolStats(BlockTags.INCORRECT_FOR_STONE_TOOL,     150, 3.5f, 1.0f,  8),
            new ArmorStats(1, 3, 2, 1, 0.0f, 0.00f,  8)),
    SILVER("silver",    0xFFf0f0f0,
            new ToolStats(BlockTags.INCORRECT_FOR_STONE_TOOL,     250, 5.5f, 2.0f, 20),
            new ArmorStats(2, 5, 4, 2, 0.0f, 0.00f, 20)),
    PLATINUM("platinum",0xFFd0d0d8,
            new ToolStats(BlockTags.INCORRECT_FOR_STONE_TOOL,     280, 5.0f, 2.2f, 22),
            new ArmorStats(2, 6, 5, 2, 1.0f, 0.00f, 22)),
    TITANIUM("titanium",0xFFb0b8c0,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL,      500, 7.0f, 3.0f, 14),
            new ArmorStats(2, 6, 5, 2, 1.0f, 0.00f, 14)),
    TUNGSTEN("tungsten",0xFF47484d,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,   800, 7.5f, 4.0f,  8),
            new ArmorStats(3, 8, 6, 3, 2.0f, 0.10f,  8)),
    COBALT("cobalt",    0xFF0050a0,
            new ToolStats(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 450, 6.8f, 3.0f, 12),
            new ArmorStats(3, 8, 6, 3, 2.0f, 0.10f, 12)),
    MANGANESE("manganese",          0xFF9c7574),
    MAGNESIUM("magnesium",          0xFFc0c8c8),
    LITHIUM("lithium",              0xFF698291),
    BERYLLIUM("beryllium",          0xFFb8c0c0),
    GALLIUM("gallium",              0xFFd0d8d8),
    GERMANIUM("germanium",          0xFF8b7777),
    BISMUTH("bismuth",              0xFFd0a0b8),
    CADMIUM("cadmium",              0xFFe0d8c8),
    ANTIMONY("antimony",            0xFFa09088),
    INDIUM("indium",                0xFFc0c0d0),
    IRIDIUM("iridium",              0xFFc8c8d0),
    PALLADIUM("palladium",          0xFFc0b8b8),
    RHODIUM("rhodium",              0xFFc8c0c0),
    RUTHENIUM("ruthenium",          0xFF8b8b9d),
    VANADIUM("vanadium",            0xFFb0a898),
    ZIRCONIUM("zirconium",          0xFFb8b8c0),
    NIOBIUM("niobium",              0xFFb0b0b8),
    MOLYBDENUM("molybdenum",        0xFFa0a0a8),
    HAFNIUM("hafnium",              0xFFb0b8b8),
    TANTALUM("tantalum",            0xFF909098),
    RHENIUM("rhenium",              0xFFb49b9b),
    SELENIUM("selenium",            0xFF9f9687),
    TELLURIUM("tellurium",          0xFF97a286),
    LANTHANUM("lanthanum",          0xFFa2a2b6),
    CERIUM("cerium",                0xFFc1a3a8),
    PRASEODYMIUM("praseodymium",    0xFF7e9098),
    NEODYMIUM("neodymium",          0xFFa1a1aa),
    SAMARIUM("samarium",            0xFFb6ccb2),
    EUROPIUM("europium",            0xFFa7b9a3),
    GADOLINIUM("gadolinium",        0xFFa6d6d8),
    TERBIUM("terbium",              0xFFd7afd3),
    DYSPROSIUM("dysprosium",        0xFFb9d7af),
    HOLMIUM("holmium",              0xFFd7afaf),
    ERBIUM("erbium",                0xFFd3afd7),
    THULIUM("thulium",              0xFFafb4d7),
    YTTERBIUM("ytterbium",          0xFFd3d7af),
    LUTETIUM("lutetium",            0xFFe7ebc4),
    SCANDIUM("scandium",            0xFFc4e0eb),
    YTTRIUM("yttrium",              0xFFc0c0c8),
    BRONZE("bronze",         0xFFcd7f32,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL,     300, 6.0f, 2.2f, 12),
            new ArmorStats(2, 5, 4, 2, 0.0f, 0.00f, 12)),
    BRASS("brass",           0xFFb5a642,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL,     260, 5.5f, 1.8f, 15),
            new ArmorStats(1, 4, 3, 1, 0.0f, 0.00f, 15)),
    STAINLESS_STEEL("stainless_steel",   0xFFc8c8c8,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,  550, 6.5f, 2.8f, 12),
            new ArmorStats(2, 6, 5, 2, 0.5f, 0.00f, 12)),
    CARBON_STEEL("carbon_steel",         0xFF3a3e40,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,  500, 6.8f, 3.0f, 10),
            new ArmorStats(2, 7, 5, 2, 1.0f, 0.00f, 10)),
    HIGH_SPEED_STEEL("high_speed_steel", 0xFFb8b0b0,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,  400, 8.5f, 3.2f, 10),
            new ArmorStats(2, 7, 6, 2, 1.0f, 0.00f, 10)),
    TOOL_STEEL("tool_steel",             0xFFcdcdcd,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,  600, 7.2f, 3.5f, 10),
            new ArmorStats(3, 7, 6, 3, 1.0f, 0.00f, 10)),
    TUNGSTEN_CARBIDE("tungsten_carbide", 0xFF424242,
            new ToolStats(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,1200, 9.0f, 4.5f, 6),
            new ArmorStats(3, 8, 6, 3, 3.0f, 0.10f, 6)),
    CEMENTED_CARBIDE("cemented_carbide", 0xFF707070,
            new ToolStats(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1000, 8.5f, 4.0f, 6),
            new ArmorStats(3, 8, 6, 3, 2.0f, 0.10f, 6)),
    INCONEL("inconel",              0xFFa8b0b0),
    HASTELLOY("hastelloy",          0xFFa0a8a8),
    STELLITE("stellite",            0xFFa8b0a8),
    CUPRONICKEL("cupronickel",      0xFFc0b8a8),
    INVAR("invar",                  0xFFb0a4a4),
    ALUMINIUM_LITHIUM("aluminium_lithium",   0xFFb8b8b8),
    MAGNESIUM_ALLOY("magnesium_alloy",       0xFFc1a6bc),
    ZIRCONIUM_ALLOY("zirconium_alloy",       0xFFb0b8b0),
    NIOBIUM_TIN("niobium_tin",               0xFFa0a8a0),
    TITANIUM_ALUMINIDE("titanium_aluminide", 0xFFa8a8a8),
    CHROMOLY("chromoly",            0xFFb3c6c4),
    SILICON_STEEL("silicon_steel",  0xFFa9a9a9),
    NICKEL_ALLOY("nickel_alloy",    0xFF97a1af),
    COBALT_ALLOY("cobalt_alloy",    0xFF657da2),
    ALUMINIUM_BRONZE("aluminium_bronze", 0xFFb0a080),
    BERYLLIUM_COPPER("beryllium_copper", 0xFFc0a080),
    PHOSPHOR_BRONZE("phosphor_bronze",   0xFFb09070),
    COPPER_NICKEL("copper_nickel",       0xFFe4c692),
    NICHROME("nichrome",            0xFFb0b0b0),
    FECRALLOY("fecralloy",          0xFFcecdcc),
    MANGANIN("manganin",            0xFFa09080),
    CONSTANTAN("constantan",    0xFFb0a090,
            new ToolStats(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 5.0f, 2.0f, 14),
            new ArmorStats(2, 5, 4, 2, 0.0f, 0.00f, 14)),
    THERMOCOUPLE_ALLOY("thermocouple_alloy", 0xFF9c9c9c),
    PLATINUM_RHODIUM("platinum_rhodium",     0xFFffe0a9),
    GOLD_GERMANIUM("gold_germanium",         0xFFc0a060),
    GOLD_TIN("gold_tin",                     0xFFc0a070),
    SILVER_PALLADIUM("silver_palladium",     0xFFc0b0b0),
    SILVER_TIN("silver_tin",                 0xFFc0b0a0),
    INDIUM_TIN_OXIDE("indium_tin_oxide",     0xFF9fc79d),
    TITANIUM_DIOXIDE("titanium_dioxide",     0xFFc7b29d),
    ALUMINA("alumina",              0xFFe8e8e8),
    ZIRCONIA("zirconia",            0xFFe0e0e0),
    SILICON_CARBIDE("silicon_carbide",   0xFF6d6155),
    BORON_NITRIDE("boron_nitride",       0xFF86705b),
    TITANIUM_NITRIDE("titanium_nitride", 0xFFc0a040),
    SILICON_NITRIDE("silicon_nitride",   0xFFc0c0c0),
    TITANIUM_DIBORIDE("titanium_diboride",   0xFFaf9d8b),
    ZIRCONIUM_DIBORIDE("zirconium_diboride", 0xFF92af8b),
    HAFNIUM_CARBIDE("hafnium_carbide",   0xFF989898),
    TANTALUM_CARBIDE("tantalum_carbide", 0xFF898989),
    NIOBIUM_CARBIDE("niobium_carbide",   0xFFaba0a0),
    CHROMIUM_CARBIDE("chromium_carbide", 0xFFa0aba5),
    VANADIUM_CARBIDE("vanadium_carbide", 0xFFabac9d),
    MOLYBDENUM_CARBIDE("molybdenum_carbide", 0xFFa0a8ab),
    TUNGSTEN_BORIDE("tungsten_boride",   0xFF5c5c5c),
    CHROMIUM_BORIDE("chromium_boride",   0xFFbad1db),
    COBALT_BORIDE("cobalt_boride",       0xFF586b8a),
    MOLYBDENUM_SILICIDE("molybdenum_silicide", 0xFF868b8a),
    TUNGSTEN_SILICIDE("tungsten_silicide",     0xFF465067),
    SILICON_GERMANIUM("silicon_germanium",     0xFF576645),
    GALLIUM_ARSENIDE("gallium_arsenide",       0xFF4a5e33),
    INDIUM_PHOSPHIDE("indium_phosphide",       0xFFabb5a0),
    GALLIUM_NITRIDE("gallium_nitride",         0xFFa0b0b5),
    CIGS("cigs",                    0xFFc9ac7d),
    CADMIUM_TELLURIDE("cadmium_telluride",           0xFFbdb2b2),
    BISMUTH_TELLURIDE("bismuth_telluride",           0xFFbcbdb2),
    BISMUTH_SELENIDE("bismuth_selenide",             0xFFb3c6ae),
    TIN_SELENIDE("tin_selenide",                     0xFFaec3c6),
    TIN_TELLURIDE("tin_telluride",                   0xFFaec6c5),
    INDIUM_ANTIMONIDE("indium_antimonide",           0xFFb7c0b6),
    GALLIUM_ANTIMONIDE("gallium_antimonide",         0xFF7f977d),
    ALUMINIUM_ANTIMONIDE("aluminium_antimonide",     0xFFc6b5ae),
    LEAD_TELLURIDE("lead_telluride",                 0xFF7d8297),
    LEAD_SELENIDE("lead_selenide",                   0xFF7d8f97),
    BISMUTH_SELENIDE_TELLURIDE("bismuth_selenide_telluride", 0xFFb6c0bc),
    BISMUTH_ANTIMONY("bismuth_antimony",             0xFFbcb6c0),
    GERMANIUM_BISMUTH_TELLURIDE("germanium_bismuth_telluride", 0xFF97aac0),
    SILVER_ANTIMONY_TELLURIDE("silver_antimony_telluride",   0xFFc0b6c0),
    COPPER_ANTIMONY_SULFIDE("copper_antimony_sulfide",       0xFFc0a497),
    CZTS("czts",                    0xFFc0a797),
    PEROVSKITE("perovskite",        0xFFc2f0ed),
    MOLYBDENUM_DISULFIDE("molybdenum_disulfide", 0xFFa0a0a0),
    TUNGSTEN_DISULFIDE("tungsten_disulfide",     0xFF4c3b2b),
    LEAD_SULFIDE("lead_sulfide",         0xFF5d6f82),
    TIN_SULFIDE("tin_sulfide",           0xFF63738f),
    BISMUTH_SULFIDE("bismuth_sulfide",   0xFF814d95),
    COPPER_SULFIDE("copper_sulfide",     0xFFc8a547),
    SILVER_SULFIDE("silver_sulfide",     0xFFade2df),
    ZINC_SULFIDE("zinc_sulfide",         0xFFb2b37c),
    CADMIUM_SULFIDE("cadmium_sulfide",   0xFF5f5f5f),
    ANTIMONY_SULFIDE("antimony_sulfide", 0xFF8b8b8b),
    MANGANESE_SULFIDE("manganese_sulfide", 0xFF753d85),
    NICKEL_SULFIDE("nickel_sulfide",     0xFF26736e),
    COBALT_SULFIDE("cobalt_sulfide",     0xFF3d4285),
    TUNGSTEN_SULFIDE("tungsten_sulfide", 0xFF484a3e),
    MOLYBDENUM_SULFIDE("molybdenum_sulfide", 0xFF86898b),
    TITANIUM_SULFIDE("titanium_sulfide", 0xFF7b825d),
    GERMANIUM_SULFIDE("germanium_sulfide", 0xFF2b3f4c);

    // ── ToolStats record ─────────────────────────────────────────────────────
    public record ToolStats(TagKey<Block> incorrectBlocksForDrops, int uses, float speed,
                            float damage, int enchantmentValue) {}

    // ── ArmorStats record ────────────────────────────────────────────────────
    public record ArmorStats(int helmet, int chestplate, int leggings, int boots,
                             float toughness, float knockbackResistance, int enchantmentValue) {}

    // ── 字段 ─────────────────────────────────────────────────────────────────
    public final String id;
    public final int color;
    @Nullable public final ToolStats toolStats;
    @Nullable public final ArmorStats armorStats;

    // ── 构造函数 ─────────────────────────────────────────────────────────────
    MetalMaterial(String id, int color) {
        this(id, color, null, null);
    }

    MetalMaterial(String id, int color, @Nullable ToolStats toolStats, @Nullable ArmorStats armorStats) {
        this.id = id;
        this.color = color;
        this.toolStats = toolStats;
        this.armorStats = armorStats;
    }

    public boolean hasTools() { return toolStats != null; }
    public boolean hasArmor() { return armorStats != null; }

    // ── Tier ─────────────────────────────────────────────────────────────────
    @Override public int getUses() { return toolStats != null ? toolStats.uses() : 0; }
    @Override public float getSpeed() { return toolStats != null ? toolStats.speed() : 0f; }
    @Override public float getAttackDamageBonus() { return toolStats != null ? toolStats.damage() : 0f; }
    @Override public TagKey<Block> getIncorrectBlocksForDrops() { return toolStats != null ? toolStats.incorrectBlocksForDrops() : BlockTags.INCORRECT_FOR_WOODEN_TOOL; }
    @Override public int getEnchantmentValue() { return toolStats != null ? toolStats.enchantmentValue() : 0; }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItem.INGOTS.get(this).get());
    }
}
