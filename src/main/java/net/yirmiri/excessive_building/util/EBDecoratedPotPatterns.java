package net.yirmiri.excessive_building.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.Map;

public class EBDecoratedPotPatterns {
    public static final RegistryKey<String> ROYALTY_POTTERY_PATTERN = register("royalty_pottery_pattern");
    public static final RegistryKey<String> ANCIENT_POTTERY_PATTERN = register("ancient_pottery_pattern");
    public static final RegistryKey<String> BITTER_POTTERY_PATTERN = register("bitter_pottery_pattern");
    public static final RegistryKey<String> BOIN_POTTERY_PATTERN = register("boin_pottery_pattern");
    public static final RegistryKey<String> BUSTLING_POTTERY_PATTERN = register("bustling_pottery_pattern");
    public static final RegistryKey<String> CHECKERED_POTTERY_PATTERN = register("checkered_pottery_pattern");
    public static final RegistryKey<String> DECAY_POTTERY_PATTERN = register("decay_pottery_pattern");
    public static final RegistryKey<String> DESTRUCTION_POTTERY_PATTERN = register("destruction_pottery_pattern");
    public static final RegistryKey<String> FORWARDS_POTTERY_PATTERN = register("forwards_pottery_pattern");
    public static final RegistryKey<String> HEXXED_POTTERY_PATTERN = register("hexxed_pottery_pattern");
    public static final RegistryKey<String> KITTEH_POTTERY_PATTERN = register("kitteh_pottery_pattern");
    public static final RegistryKey<String> LIFE_POTTERY_PATTERN = register("life_pottery_pattern");
    public static final RegistryKey<String> PORTAL_POTTERY_PATTERN = register("portal_pottery_pattern");
    public static final RegistryKey<String> POTTERY_POTTERY_PATTERN = register("pottery_pottery_pattern");
    public static final RegistryKey<String> RING_POTTERY_PATTERN = register("ring_pottery_pattern");
    public static final RegistryKey<String> SNOUT_POTTERY_PATTERN = register("snout_pottery_pattern");
    public static final RegistryKey<String> SPRITE_POTTERY_PATTERN = register("sprite_pottery_pattern");
    public static final RegistryKey<String> TWINS_POTTERY_PATTERN = register("twins_pottery_pattern");
    public static final RegistryKey<String> WRATHFUL_POTTERY_PATTERN = register("wrathful_pottery_pattern");
    public static final RegistryKey<String> IS_THAT_POTTERY_PATTERN = register("is_that_pottery_pattern");
    public static final RegistryKey<String> MESMERIZE_POTTERY_PATTERN = register("mesmerize_pottery_pattern");
    public static final RegistryKey<String> KOKOS_BUG_POTTERY_PATTERN = register("kokos_bug_pottery_pattern");
    public static final RegistryKey<String> THIEF_POTTERY_PATTERN = register("thief_pottery_pattern");

    private static RegistryKey<String> register(String id) {
        return RegistryKey.of(RegistryKeys.DECORATED_POT_PATTERN, Identifier.of(ExcessiveBuilding.MOD_ID, id));
    }

    public static void loadPotteryPatterns() {
    }
}
