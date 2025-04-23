package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;

public class EBConfig {
    public static final ForgeConfigSpec COMMON;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    //MISC CONFIGURATIONS
    public static final ForgeConfigSpec.BooleanValue ENABLE_CUSTOM_TOOLTIPS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MISC_TOOLTIPS;

    //CONTENT CONFIGURATIONS
    public static final ForgeConfigSpec.BooleanValue ENABLE_VERTICAL_STAIRS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_ASPHALT;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RESOURCE_BRICKS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DECORATIVE_SHELVES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SHELF_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CRAFTING_TABLE_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LADDER_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_BLOODROOT_SAPLINGS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_EB_POTTERY_SHERDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PARTICLE_CANDLES;

    //BALANCE CONFIGURATIONS
    public static final ForgeConfigSpec.BooleanValue ENABLE_EB_VILLAGER_TRADES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SOUL_MAGMA_COLUMN_TOGGLE;
    public static final ForgeConfigSpec.IntValue ENDURANCE_DURATION;
    public static final ForgeConfigSpec.IntValue LONG_ENDURANCE_DURATION;
    public static final ForgeConfigSpec.IntValue ENDURANCE_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue STRONG_ENDURANCE_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue FATIGUING_DURATION;
    public static final ForgeConfigSpec.IntValue LONG_FATIGUING_DURATION;
    public static final ForgeConfigSpec.IntValue FATIGUING_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue STRONG_FATIGUING_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue LIFE_FRUIT_DURATION;
    public static final ForgeConfigSpec.IntValue LIFE_FRUIT_AMPLIFIER;

    static {
        BUILDER.push("Excessive Building Config");

        //MISC CONFIGURATIONS
        BUILDER.push("Misc Configurations").comment("Configurations for miscellaneous features that don't directly affect gameplay");

        ENABLE_CUSTOM_TOOLTIPS = BUILDER
                .comment("Should Excessive Building items with special interactions have custom tooltips? (default: true)")
                .define("enableCustomTooltips", true);

        ENABLE_MISC_TOOLTIPS = BUILDER
                .comment("Should additional tooltips appear on some items like Excessive Building's pottery sherds? (default: true)")
                .define("enableMiscTooltips", true);

        BUILDER.pop();

        //CONTENT CONFIGURATIONS
        BUILDER.push("Content Configurations").comment("Disabling these will make the corresponding feature unobtainable/unusable");

        ENABLE_VERTICAL_STAIRS = BUILDER
                .comment("Should vertical stairs be enabled? (default: true)")
                .define("enableVerticalStairs", true);

        ENABLE_ASPHALT = BUILDER
                .comment("Should asphalt, a block that increases movement speed while stepped on be enabled? (default: true)")
                .define("enableAsphalt", true);

        ENABLE_RESOURCE_BRICKS = BUILDER
                .comment("Should blocks made out of resources (gold, diamond, etc) be enabled? (default: true)")
                .define("enableResourceBricks", true);

        ENABLE_DECORATIVE_SHELVES = BUILDER
                .comment("Should decorative shelves be enabled? (default: true)")
                .define("enableDecorativeShelves", true);

        ENABLE_SHELF_VARIANTS = BUILDER
                .comment("Should shelf wood variants be enabled? (default: false)")
                .define("enableShelfVariants", false);

        ENABLE_CRAFTING_TABLE_VARIANTS = BUILDER
                .comment("Should crafting table wood variants be enabled? (default: false)")
                .define("enableCraftingTableVariants", false);

        ENABLE_LADDER_VARIANTS = BUILDER
                .comment("Should ladder wood variants be enabled? (default: false)")
                .define("enableLadderVariants", false);

        ENABLE_BLOODROOT_SAPLINGS = BUILDER
                .comment("Should bloodroot saplings be enabled (and to extension their content)? (default: true)")
                .define("enableBloodrootSaplings", true);

        ENABLE_EB_POTTERY_SHERDS = BUILDER
                .comment("Should Excessive Building's pottery sherds be enabled? (default: true)")
                .define("enableEBPotterySherds", true);

        ENABLE_PARTICLE_CANDLES = BUILDER
                .comment("Should new candles that produce particles when lit be enabled? (default: true)")
                .define("enableParticleCandles", true);

        BUILDER.pop();

        //BALANCE CONFIGURATIONS
        BUILDER.push("Balance Configurations").comment("Configurations for features that may impact gameplay in a large way");

        ENABLE_EB_VILLAGER_TRADES = BUILDER
                .comment("Should Excessive Building add new trade offers to villagers? (default: true)")
                .define("enableEBVillagerTrades", true);

        ENABLE_SOUL_MAGMA_COLUMN_TOGGLE = BUILDER
                .comment("Should soul magma bubble columns be toggled with redstone? (default: true)")
                .define("enableSoulMagmaColumnToggle", true);

        ENDURANCE_DURATION = BUILDER
                .comment("How long should the endurance potion last in ticks? (default: 6000)")
                .defineInRange("enduranceDuration", 6000, 0, 72000);

        LONG_ENDURANCE_DURATION = BUILDER
                .comment("How long should the long endurance potion last in ticks? (default: 12000)")
                .defineInRange("longEnduranceDuration", 12000, 0, 72000);

        ENDURANCE_AMPLIFIER = BUILDER
                .comment("What level of haste should the endurance potion grant? (default: 0)")
                .defineInRange("enduranceAmplifier", 0, 0, 255);

        STRONG_ENDURANCE_AMPLIFIER = BUILDER
                .comment("What level of haste should the strong endurance potion grant? (default: 1)")
                .defineInRange("strongEnduranceAmplifier", 1, 0, 255);

        FATIGUING_DURATION = BUILDER
                .comment("How long should the fatiguing potion last in ticks? (default: 3000)")
                .defineInRange("fatiguingDuration", 3000, 0, 72000);

        LONG_FATIGUING_DURATION = BUILDER
                .comment("How long should the long fatiguing potion last in ticks? (default: 6000)")
                .defineInRange("longFatiguingDuration", 6000, 0, 72000);

        FATIGUING_AMPLIFIER = BUILDER
                .comment("What level of mining fatigue should the fatiguing potion grant? (default: 0)")
                .defineInRange("fatiguingAmplifier", 0, 0, 255);

        STRONG_FATIGUING_AMPLIFIER = BUILDER
                .comment("What level of mining fatigue should the strong fatiguing potion grant? (default: 1)")
                .defineInRange("strongFatiguingAmplifier", 1, 0, 255);

        LIFE_FRUIT_DURATION = BUILDER
                .comment("How long should the ancient fruit's haste last in ticks? (default: 600)")
                .defineInRange("lifeFruitDuration", 600, 0, 72000);

        LIFE_FRUIT_AMPLIFIER = BUILDER
                .comment("What level of haste should the ancient fruit grant? (default: 1)")
                .defineInRange("lifeFruitAmplifier", 1, 0, 255);

        COMMON = BUILDER.build();
    }
}