package net.yirmiri.excessive_building.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.Map;

public class EBDecoratedPotPatterns {
    public static final ResourceKey<String> ROYALTY_POTTERY_PATTERN = register("royalty_pottery_pattern");
    public static final ResourceKey<String> ANCIENT_POTTERY_PATTERN = register("ancient_pottery_pattern");
    public static final ResourceKey<String> BITTER_POTTERY_PATTERN = register("bitter_pottery_pattern");
    public static final ResourceKey<String> BOIN_POTTERY_PATTERN = register("boin_pottery_pattern");
    public static final ResourceKey<String> BUSTLING_POTTERY_PATTERN = register("bustling_pottery_pattern");
    public static final ResourceKey<String> CHECKERED_POTTERY_PATTERN = register("checkered_pottery_pattern");
    public static final ResourceKey<String> DECAY_POTTERY_PATTERN = register("decay_pottery_pattern");
    public static final ResourceKey<String> DESTRUCTION_POTTERY_PATTERN = register("destruction_pottery_pattern");
    public static final ResourceKey<String> FORWARDS_POTTERY_PATTERN = register("forwards_pottery_pattern");
    public static final ResourceKey<String> HEXXED_POTTERY_PATTERN = register("hexxed_pottery_pattern");
    public static final ResourceKey<String> KITTEH_POTTERY_PATTERN = register("kitteh_pottery_pattern");
    public static final ResourceKey<String> LIFE_POTTERY_PATTERN = register("life_pottery_pattern");
    public static final ResourceKey<String> PORTAL_POTTERY_PATTERN = register("portal_pottery_pattern");
    public static final ResourceKey<String> POTTERY_POTTERY_PATTERN = register("pottery_pottery_pattern");
    public static final ResourceKey<String> RING_POTTERY_PATTERN = register("ring_pottery_pattern");
    public static final ResourceKey<String> SNOUT_POTTERY_PATTERN = register("snout_pottery_pattern");
    public static final ResourceKey<String> SPRITE_POTTERY_PATTERN = register("sprite_pottery_pattern");
    public static final ResourceKey<String> TWINS_POTTERY_PATTERN = register("twins_pottery_pattern");
    public static final ResourceKey<String> WRATHFUL_POTTERY_PATTERN = register("wrathful_pottery_pattern");
    public static final ResourceKey<String> IS_THAT_POTTERY_PATTERN = register("is_that_pottery_pattern");
    public static final ResourceKey<String> MESMERIZE_POTTERY_PATTERN = register("mesmerize_pottery_pattern");
    public static final ResourceKey<String> KOKOS_BUG_POTTERY_PATTERN = register("kokos_bug_pottery_pattern");
    public static final ResourceKey<String> THIEF_POTTERY_PATTERN = register("thief_pottery_pattern");

    private static ResourceKey<String> register(String id) {
        return ResourceKey.create(Registries.DECORATED_POT_PATTERNS, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id));
    }

    public static void loadPotteryPatterns() {
    }
}
