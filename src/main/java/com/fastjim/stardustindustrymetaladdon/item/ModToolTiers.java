package com.fastjim.stardustindustrymetaladdon.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {

    // 钢工具等级
    STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 350, 6.5f, 2.5f, 14, 0xFFb1b1b1,
            () -> Ingredient.of(ModItem.STEEL_INGOT.get())),

    // 铝工具等级
    ALUMINIUM(BlockTags.INCORRECT_FOR_STONE_TOOL, 180, 7f, 1f, 16, 0xFFd4d4d4,
            () -> Ingredient.of(ModItem.ALUMINIUM_INGOT.get())),

    // 铅工具等级
    LEAD(BlockTags.INCORRECT_FOR_STONE_TOOL, 200, 4f, 1.5f, 10, 0xFFa0a0b0,
            () -> Ingredient.of(ModItem.LEAD_INGOT.get())),

    // 锌工具等级
    ZINC(BlockTags.INCORRECT_FOR_IRON_TOOL, 210, 4.5f, 1.5f, 12, 0xFFc8d0d0,
            () -> Ingredient.of(ModItem.ZINC_INGOT.get())),

    // 镍工具等级
    NICKEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 400, 6f, 2f, 14, 0xFFb2bfbf,
            () -> Ingredient.of(ModItem.NICKEL_INGOT.get())),

    // 铬工具等级
    CHROME(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 7.5f, 2.8f, 12, 0xFFa0b8b0,
            () -> Ingredient.of(ModItem.CHROME_INGOT.get())),

    // 锇工具等级
    OSMIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600, 8f, 3.5f, 10, 0xFF8890a0,
            () -> Ingredient.of(ModItem.OSMIUM_INGOT.get())),

    // 锡工具等级
    TIN(BlockTags.INCORRECT_FOR_STONE_TOOL, 150, 3.5f, 1f, 8, 0xFFa8b0b8,
            () -> Ingredient.of(ModItem.TIN_INGOT.get())),

    // 银工具等级
    SILVER(BlockTags.INCORRECT_FOR_STONE_TOOL, 250, 5.5f, 2f, 20, 0xFFf0f0f0,
            () -> Ingredient.of(ModItem.SILVER_INGOT.get())),

    // 铂工具等级
    PLATINUM(BlockTags.INCORRECT_FOR_STONE_TOOL, 280, 5f, 2.2f, 22, 0xFFd0d0d8,
            () -> Ingredient.of(ModItem.PLATINUM_INGOT.get())),

    // 钛工具等级
    TITANIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 7f, 3f, 14, 0xFFb0b8c0,
            () -> Ingredient.of(ModItem.TITANIUM_INGOT.get())),

    // 钨工具等级
    TUNGSTEN(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 800, 7.5f, 4f, 8, 0xFF47484d,
            () -> Ingredient.of(ModItem.TUNGSTEN_INGOT.get())),

    // 钴工具等级
    COBALT(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 450, 6.8f, 3f, 12, 0xFF0050a0,
            () -> Ingredient.of(ModItem.COBALT_INGOT.get())),

    // 青铜工具等级
    BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 6f, 2.2f, 12, 0xFFcd7f32,
            () -> Ingredient.of(ModItem.BRONZE_INGOT.get())),

    // 黄铜工具等级
    BRASS(BlockTags.INCORRECT_FOR_IRON_TOOL, 260, 5.5f, 1.8f, 15, 0xFFb5a642,
            () -> Ingredient.of(ModItem.BRASS_INGOT.get())),

    // 不锈钢工具等级
    STAINLESS_STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 550, 6.5f, 2.8f, 12, 0xFFc8c8c8,
            () -> Ingredient.of(ModItem.STAINLESS_STEEL_INGOT.get())),

    // 碳钢工具等级
    CARBON_STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 500, 6.8f, 3f, 10, 0xFF3a3e40,
            () -> Ingredient.of(ModItem.CARBON_STEEL_INGOT.get())),

    // 高速钢工具等级
    HIGH_SPEED_STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 400, 8.5f, 3.2f, 10, 0xFFb8b0b0,
            () -> Ingredient.of(ModItem.HIGH_SPEED_STEEL_INGOT.get())),

    // 工具钢工具等级
    TOOL_STEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 600, 7.2f, 3.5f, 10, 0xFFcdcdcd,
            () -> Ingredient.of(ModItem.TOOL_STEEL_INGOT.get())),

    // 碳化钨工具等级
    TUNGSTEN_CARBIDE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1200, 9f, 4.5f, 6, 0xFF424242,
            () -> Ingredient.of(ModItem.TUNGSTEN_CARBIDE_INGOT.get())),

    // 硬质合金工具等级
    CEMENTED_CARBIDE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1000, 8.5f, 4f, 6, 0xFF707070,
            () -> Ingredient.of(ModItem.CEMENTED_CARBIDE_INGOT.get())),

    // 康铜工具等级
    CONSTANTAN(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 5f, 2f, 14, 0xFFb0a090,
            () -> Ingredient.of(ModItem.CONSTANTAN_INGOT.get()));





    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final int color;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(
            TagKey<Block> incorrectBlocksForDrops,
            int uses,
            float speed,
            float damage,
            int enchantmentValue,
            int color,
            Supplier<Ingredient> repairIngredient
    ) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.color = color;
        this.repairIngredient = repairIngredient;
    }

    public int getColor() {
        return this.color;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}