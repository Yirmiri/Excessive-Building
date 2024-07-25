package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;

public class EBConfig {
    public static final ForgeConfigSpec COMMON;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    //CONTENT
    public static final ForgeConfigSpec.BooleanValue ENABLE_VERTICAL_STAIRS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RESOURCE_BRICKS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CRAFTING_TABLE_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LADDER_VARIANTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_POTTERY_SHERDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DECORATIVES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_ANCIENT_SAPLINGS;

    //BALANCE
    public static final ForgeConfigSpec.BooleanValue ENABLE_SOUL_MAGMA_COLUMN_TOGGLE;
    public static final ForgeConfigSpec.FloatValue ANCIENT_SAPLING_CHANCE;
    public static final ForgeConfigSpec.FloatValue GLOOM_SEEDS_CHANCE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_REACHING_LANTERN_FUNCTIONALITY;
    public static final ForgeConfigSpec.IntValue REACHING_LANTERN_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue REACHING_LANTERN_RANGE;
    public static final ForgeConfigSpec.IntValue REACHING_DURATION;
    public static final ForgeConfigSpec.IntValue LONG_REACHING_DURATION;
    public static final ForgeConfigSpec.IntValue REACHING_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue STRONG_REACHING_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue SHORTENING_DURATION;
    public static final ForgeConfigSpec.IntValue LONG_SHORTENING_DURATION;
    public static final ForgeConfigSpec.IntValue SHORTENING_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue STRONG_SHORTENING_AMPLIFIER;
    public static final ForgeConfigSpec.IntValue ANCIENT_FRUIT_DURATION;
    public static final ForgeConfigSpec.IntValue ANCIENT_FRUIT_AMPLIFIER;

    static {
        //CONTENT TOGGLES
        BUILDER.push("Content Toggles").comment("Disabling these will make the corresponding feature unobtainable/unusable");

        ENABLE_VERTICAL_STAIRS = BUILDER
                .comment("Should vertical stairs be enabled? (default: true)")
                .define("enableVerticalStairs", true);

        ENABLE_RESOURCE_BRICKS = BUILDER
                .comment("Should blocks made out of resources (gold, diamond, etc) be enabled? (default: true)")
                .define("enableResourceBricks", true);

        ENABLE_CRAFTING_TABLE_VARIANTS = BUILDER
                .comment("Should crafting table variants be enabled? (default: true)")
                .define("enableCraftingTableVariants", true);

        ENABLE_LADDER_VARIANTS = BUILDER
                .comment("Should ladder variants be enabled? (default: true)")
                .define("enableLadderVariants", true);

        ENABLE_POTTERY_SHERDS = BUILDER
                .comment("Should Excessive Building's pottery sherds be enabled? (default: true)")
                .define("enablePotterySherds", true);

        ENABLE_DECORATIVES = BUILDER
                .comment("Should small decoration blocks (jars, mugs, etc) be enabled? (default: true)")
                .define("enableDecoratives", true);

        ENABLE_ANCIENT_SAPLINGS = BUILDER
                .comment("Should ancient saplings be enabled (and to extension their content)? (default: true)")
                .define("enableAncientSaplings", true);

        BUILDER.pop();

        //BALANCE CONFIGURATION
        BUILDER.push("Balance Configuration").comment("Configuration for features that may impact gameplay in a large way");

        ENABLE_SOUL_MAGMA_COLUMN_TOGGLE = BUILDER
                .comment("Should soul magma bubble columns be toggled with redstone? (default: true)")
                .define("enableSoulMagmaColumnToggle", true);

        ANCIENT_SAPLING_CHANCE = BUILDER
                .comment("How rare should ancient saplings be? (default: 0.15 aka 15%)")
                .defineInRange("ancientSaplingChance", 0.15F, 0F, 1.0F);

        GLOOM_SEEDS_CHANCE = BUILDER
                .comment("How rare should gloom seeds be? (default: 0.02 aka 2%)")
                .defineInRange("ancientSaplingChance", 0.02F, 0F, 1.0F);

        ENABLE_REACHING_LANTERN_FUNCTIONALITY = BUILDER
                .comment("Should reaching lanterns grant nearby players the reaching effect? (default: true)")
                .define("enableReachingLanternFunctionality", true);

        REACHING_LANTERN_AMPLIFIER = BUILDER
                .comment("What level of reaching should the reaching lantern grant? (default: 1)")
                .defineInRange("reachingLanternAmplifier", 1, 0, 255);

        REACHING_LANTERN_RANGE = BUILDER
                .comment("How large should the reaching lantern's range be in blocks? (default: 8)")
                .defineInRange("reachingLanternRange", 8, 0, 64);

        REACHING_DURATION = BUILDER
                .comment("How long should the reaching potion last in ticks? (default: 12000)")
                .defineInRange("reachingDuration", 12000, 0, 72000);

        LONG_REACHING_DURATION = BUILDER
                .comment("How long should the long reaching potion last in ticks? (default: 24000)")
                .defineInRange("longReachingDuration", 24000, 0, 72000);

        REACHING_AMPLIFIER = BUILDER
                .comment("What level of reaching should the reaching potion grant? (default: 2)")
                .defineInRange("reachingAmplifier", 2, 0, 255);

        STRONG_REACHING_AMPLIFIER = BUILDER
                .comment("What level of reaching should the strong reaching potion grant? (default: 4)")
                .defineInRange("strongReachingAmplifier", 4, 0, 255);

        SHORTENING_DURATION = BUILDER
                .comment("How long should the shortening potion last in ticks? (default: 6000)")
                .defineInRange("shorteningDuration", 6000, 0, 72000);

        LONG_SHORTENING_DURATION = BUILDER
                .comment("How long should the long shortening potion last in ticks? (default: 12000)")
                .defineInRange("longShorteningDuration", 12000, 0, 72000);

        SHORTENING_AMPLIFIER = BUILDER
                .comment("What level of shortening should the shortening potion grant? (default: 1)")
                .defineInRange("shorteningAmplifier", 1, 0, 255);

        STRONG_SHORTENING_AMPLIFIER = BUILDER
                .comment("What level of shortening should the strong shortening potion grant? (default: 2)")
                .defineInRange("strongShorteningAmplifier", 2, 0, 255);

        ANCIENT_FRUIT_DURATION = BUILDER
                .comment("How long should the ancient fruit's reaching last in ticks? (default: 600)")
                .defineInRange("ancientFruitDuration", 600, 0, 72000);

        ANCIENT_FRUIT_AMPLIFIER = BUILDER
                .comment("What level of reaching should the ancient fruit grant? (default: 1)")
                .defineInRange("ancientFruitAmplifier", 1, 0, 255);

        COMMON = BUILDER.build();
    }
}