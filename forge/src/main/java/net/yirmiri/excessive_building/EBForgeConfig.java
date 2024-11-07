package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;

public class EBForgeConfig {
    public static final ForgeConfigSpec COMMON;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    //CONTENT
    public static final ForgeConfigSpec.BooleanValue ENABLE_ASPHALT;
    public static final ForgeConfigSpec.BooleanValue ENABLE_VERTICAL_STAIRS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RESOURCE_BRICKS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SHELF_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DECORATIVE_SHELVES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CRAFTING_TABLE_VARIANTS;
    //public static final ForgeConfigSpec.BooleanValue ENABLE_CHEST_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LADDER_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_EB_POTTERY_SHERDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PARTICLE_CANDLES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DECORATIVES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_ANCIENT_SAPLINGS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_GLOOM_SEEDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CUSTOM_TOOLTIPS;

    //BALANCE
    public static final ForgeConfigSpec.BooleanValue ENABLE_EB_VILLAGER_TRADES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SOUL_MAGMA_COLUMN_TOGGLE;
    public static final ForgeConfigSpec.IntValue HASTY_DURATION;
    public static final ForgeConfigSpec.IntValue LONG_HASTY_DURATION;
    public static final ForgeConfigSpec.IntValue HASTY_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue STRONG_HASTY_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue FATIGUED_DURATION;
    public static final ForgeConfigSpec.IntValue LONG_FATIGUED_DURATION;
    public static final ForgeConfigSpec.IntValue FATIGUED_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue STRONG_FATIGUED_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue ANCIENT_FRUIT_DURATION;
    public static final ForgeConfigSpec.IntValue ANCIENT_FRUIT_AMPLIFIER;

    static {
        //CONTENT TOGGLES
        BUILDER.push("Excessive Building Config");

        BUILDER.push("Content Toggles").comment("Disabling these will make the corresponding feature unobtainable/unusable");

        ENABLE_ASPHALT = BUILDER
                .comment("Should asphalt be enabled? (default: true)")
                .define("enableAsphalt", true);

        ENABLE_VERTICAL_STAIRS = BUILDER
                .comment("Should vertical stairs be enabled? (default: true)")
                .define("enableVerticalStairs", true);

        ENABLE_RESOURCE_BRICKS = BUILDER
                .comment("Should blocks made out of resources (gold, diamond, etc) be enabled? (default: true)")
                .define("enableResourceBricks", true);

        ENABLE_SHELF_VARIANTS = BUILDER
                .comment("Should shelf variants be enabled? (default: true)")
                .define("enableShelfVariants", true);

        ENABLE_DECORATIVE_SHELVES = BUILDER
                .comment("Should decorative shelf blocks be enabled? (default: true)")
                .define("enableDecorativeShelves", true);

        ENABLE_CRAFTING_TABLE_VARIANTS = BUILDER
                .comment("Should crafting table variants be enabled? (default: true)")
                .define("enableCraftingTableVariants", true);

//        ENABLE_CHEST_VARIANTS = BUILDER
//                .comment("Should chest variants be enabled? (default: true)")
//                .define("enableChestVariants", true);

        ENABLE_LADDER_VARIANTS = BUILDER
                .comment("Should ladder variants be enabled? (default: true)")
                .define("enableLadderVariants", true);

        ENABLE_EB_POTTERY_SHERDS = BUILDER
                .comment("Should Excessive Building's pottery sherds be enabled? (default: true)")
                .define("enableEBPotterySherds", true);

        ENABLE_PARTICLE_CANDLES = BUILDER
                .comment("Should new candles that produce particles when lit be enabled? (default: true)")
                .define("enableParticleCandles", true);

        ENABLE_DECORATIVES = BUILDER
                .comment("Should small decoration blocks (jars, mugs, etc) be enabled? (default: true)")
                .define("enableDecoratives", true);

        ENABLE_ANCIENT_SAPLINGS = BUILDER
                .comment("Should ancient saplings be enabled (and to extension their content)? (default: true)")
                .define("enableAncientSaplings", true);

        ENABLE_GLOOM_SEEDS = BUILDER
                .comment("Should gloom seeds be enabled (and to extension their content)? (default: true)")
                .define("enableGloomSeeds", true);

        ENABLE_CUSTOM_TOOLTIPS = BUILDER
                .comment("Should Excessive Building items with special interactions have custom tooltips? (default: true)")
                .define("enableCustomTooltips", true);

        BUILDER.pop();

        //BALANCE CONFIGURATION
        BUILDER.push("Balance Configuration").comment("Configuration for features that may impact gameplay in a large way");

        ENABLE_EB_VILLAGER_TRADES = BUILDER
                .comment("Should Excessive Building add new trade offers to villagers? (default: true)")
                .define("enableEBVillagerTrades", true);

        ENABLE_SOUL_MAGMA_COLUMN_TOGGLE = BUILDER
                .comment("Should soul magma bubble columns be toggled with redstone? (default: true)")
                .define("enableSoulMagmaColumnToggle", true);

        HASTY_DURATION = BUILDER
                .comment("How long should the hasty potion last in ticks? (default: 6000)")
                .defineInRange("hastyDuration", 6000, 0, 72000);

        LONG_HASTY_DURATION = BUILDER
                .comment("How long should the long hasty potion last in ticks? (default: 12000)")
                .defineInRange("longHastyDuration", 12000, 0, 72000);

        HASTY_AMPLIFIER = BUILDER
                .comment("What level of haste should the reaching potion grant? (default: 0)")
                .defineInRange("hastyAmplifier", 0, 0, 255);

        STRONG_HASTY_AMPLIFIER = BUILDER
                .comment("What level of haste should the strong hasty potion grant? (default: 1)")
                .defineInRange("strongHastyAmplifier", 1, 0, 255);

        FATIGUED_DURATION = BUILDER
                .comment("How long should the fatigued potion last in ticks? (default: 3000)")
                .defineInRange("fatiguedDuration", 3000, 0, 72000);

        LONG_FATIGUED_DURATION = BUILDER
                .comment("How long should the long fatigued potion last in ticks? (default: 6000)")
                .defineInRange("longFatiguedDuration", 6000, 0, 72000);

        FATIGUED_AMPLIFIER = BUILDER
                .comment("What level of mining fatigue should the fatigued potion grant? (default: 0)")
                .defineInRange("fatiguedAmplifier", 0, 0, 255);

        STRONG_FATIGUED_AMPLIFIER = BUILDER
                .comment("What level of mining fatigue should the strong fatigued potion grant? (default: 1)")
                .defineInRange("strongFatiguedAmplifier", 1, 0, 255);

        ANCIENT_FRUIT_DURATION = BUILDER
                .comment("How long should the ancient fruit's haste last in ticks? (default: 600)")
                .defineInRange("ancientFruitDuration", 600, 0, 72000);

        ANCIENT_FRUIT_AMPLIFIER = BUILDER
                .comment("What level of haste should the ancient fruit grant? (default: 1)")
                .defineInRange("ancientFruitAmplifier", 1, 0, 255);

        COMMON = BUILDER.build();
    }
}