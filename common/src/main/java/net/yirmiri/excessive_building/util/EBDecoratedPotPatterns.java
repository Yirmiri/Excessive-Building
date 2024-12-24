package net.yirmiri.excessive_building.util;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.DecoratedPotPattern;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.Map;

public class EBDecoratedPotPatterns {
    private static final ResourceKey<DecoratedPotPattern> ROYALTY = create("royalty");
    private static final ResourceKey<DecoratedPotPattern> ANCIENT = create("ancient");
    private static final ResourceKey<DecoratedPotPattern> BITTER = create("bitter");
    private static final ResourceKey<DecoratedPotPattern> BOIN = create("boin");
    private static final ResourceKey<DecoratedPotPattern> BUSTLING = create("bustling");
    private static final ResourceKey<DecoratedPotPattern> CHECKERED = create("checkered");
    private static final ResourceKey<DecoratedPotPattern> DECAY = create("decay");
    private static final ResourceKey<DecoratedPotPattern> DESTRUCTION = create("destruction");
    private static final ResourceKey<DecoratedPotPattern> FORWARDS = create("forwards");
    private static final ResourceKey<DecoratedPotPattern> HEXXED = create("hexxed");
    private static final ResourceKey<DecoratedPotPattern> KITTEH = create("kitteh");
    private static final ResourceKey<DecoratedPotPattern> LIFE = create("life");
    private static final ResourceKey<DecoratedPotPattern> PORTAL = create("portal");
    private static final ResourceKey<DecoratedPotPattern> POTTERY = create("pottery");
    private static final ResourceKey<DecoratedPotPattern> RING = create("ring");
    private static final ResourceKey<DecoratedPotPattern> SNOUT = create("snout");
    private static final ResourceKey<DecoratedPotPattern> SPRITE = create("sprite");
    private static final ResourceKey<DecoratedPotPattern> TWINS = create("twins");
    private static final ResourceKey<DecoratedPotPattern> WRATHFUL = create("wrathful");
    private static final ResourceKey<DecoratedPotPattern> IS_THAT = create("is_that");
    private static final ResourceKey<DecoratedPotPattern> MESMERIZE = create("mesmerize");
    private static final ResourceKey<DecoratedPotPattern> KOKOS_BUG = create("kokos_bug");
    private static final ResourceKey<DecoratedPotPattern> THIEF = create("thief");

    public static final DecoratedPotPattern ROYALTY_POTTERY_PATTERN = register(ROYALTY, "royalty_pottery_pattern");
    public static final DecoratedPotPattern ANCIENT_POTTERY_PATTERN = register(ANCIENT, "ancient_pottery_pattern");
    public static final DecoratedPotPattern BITTER_POTTERY_PATTERN = register(BITTER, "bitter_pottery_pattern");
    public static final DecoratedPotPattern BOIN_POTTERY_PATTERN = register(BOIN, "boin_pottery_pattern");
    public static final DecoratedPotPattern BUSTLING_POTTERY_PATTERN = register(BUSTLING, "bustling_pottery_pattern");
    public static final DecoratedPotPattern CHECKERED_POTTERY_PATTERN = register(CHECKERED, "checkered_pottery_pattern");
    public static final DecoratedPotPattern DECAY_POTTERY_PATTERN = register(DECAY, "decay_pottery_pattern");
    public static final DecoratedPotPattern DESTRUCTION_POTTERY_PATTERN = register(DESTRUCTION, "destruction_pottery_pattern");
    public static final DecoratedPotPattern FORWARDS_POTTERY_PATTERN = register(FORWARDS, "forwards_pottery_pattern");
    public static final DecoratedPotPattern HEXXED_POTTERY_PATTERN = register(HEXXED, "hexxed_pottery_pattern");
    public static final DecoratedPotPattern KITTEH_POTTERY_PATTERN = register(KITTEH, "kitteh_pottery_pattern");
    public static final DecoratedPotPattern LIFE_POTTERY_PATTERN = register(LIFE, "life_pottery_pattern");
    public static final DecoratedPotPattern PORTAL_POTTERY_PATTERN = register(PORTAL, "portal_pottery_pattern");
    public static final DecoratedPotPattern POTTERY_POTTERY_PATTERN = register(POTTERY, "pottery_pottery_pattern");
    public static final DecoratedPotPattern RING_POTTERY_PATTERN = register(RING, "ring_pottery_pattern");
    public static final DecoratedPotPattern SNOUT_POTTERY_PATTERN = register(SNOUT, "snout_pottery_pattern");
    public static final DecoratedPotPattern SPRITE_POTTERY_PATTERN = register(SPRITE, "sprite_pottery_pattern");
    public static final DecoratedPotPattern TWINS_POTTERY_PATTERN = register(TWINS, "twins_pottery_pattern");
    public static final DecoratedPotPattern WRATHFUL_POTTERY_PATTERN = register(WRATHFUL, "wrathful_pottery_pattern");
    public static final DecoratedPotPattern IS_THAT_POTTERY_PATTERN = register(IS_THAT, "is_that_pottery_pattern");
    public static final DecoratedPotPattern MESMERIZE_POTTERY_PATTERN = register(MESMERIZE, "mesmerize_pottery_pattern");
    public static final DecoratedPotPattern KOKOS_BUG_POTTERY_PATTERN = register(KOKOS_BUG, "kokos_bug_pottery_pattern");
    public static final DecoratedPotPattern THIEF_POTTERY_PATTERN = register(THIEF, "thief_pottery_pattern");

    public static final Map<Holder<Item>, ResourceKey<DecoratedPotPattern>> SHERD_MAP = Map.ofEntries(
            Map.entry(EBItems.ROYALTY_POTTERY_SHERD, ROYALTY),
            Map.entry(EBItems.ANCIENT_POTTERY_SHERD, ANCIENT),
            Map.entry(EBItems.BITTER_POTTERY_SHERD, BITTER),
            Map.entry(EBItems.BOIN_POTTERY_SHERD, BOIN),
            Map.entry(EBItems.BUSTLING_POTTERY_SHERD, BUSTLING),
            Map.entry(EBItems.CHECKERED_POTTERY_SHERD, CHECKERED),
            Map.entry(EBItems.DECAY_POTTERY_SHERD, DECAY),
            Map.entry(EBItems.DESTRUCTION_POTTERY_SHERD, DESTRUCTION),
            Map.entry(EBItems.FORWARDS_POTTERY_SHERD, FORWARDS),
            Map.entry(EBItems.HEXXED_POTTERY_SHERD, HEXXED),
            Map.entry(EBItems.KITTEH_POTTERY_SHERD, KITTEH),
            Map.entry(EBItems.LIFE_POTTERY_SHERD, LIFE),
            Map.entry(EBItems.PORTAL_POTTERY_SHERD, PORTAL),
            Map.entry(EBItems.POTTERY_POTTERY_SHERD, POTTERY),
            Map.entry(EBItems.RING_POTTERY_SHERD, RING),
            Map.entry(EBItems.SNOUT_POTTERY_SHERD, SNOUT),
            Map.entry(EBItems.SPRITE_POTTERY_SHERD, SPRITE),
            Map.entry(EBItems.TWINS_POTTERY_SHERD, TWINS),
            Map.entry(EBItems.WRATHFUL_POTTERY_SHERD, WRATHFUL),
            Map.entry(EBItems.IS_THAT_POTTERY_SHERD, IS_THAT),
            Map.entry(EBItems.MESMERIZE_POTTERY_SHERD, MESMERIZE),
            Map.entry(EBItems.KOKOS_BUG_POTTERY_SHERD, KOKOS_BUG),
            Map.entry(EBItems.THIEF_POTTERY_SHERD, THIEF)
    );

    private static ResourceKey<DecoratedPotPattern> create(String id) {
        return ResourceKey.create(Registries.DECORATED_POT_PATTERN, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id));
    }

    private static DecoratedPotPattern register(ResourceKey<DecoratedPotPattern> key, String id) {
        return Registry.register(BuiltInRegistries.DECORATED_POT_PATTERN, key, new DecoratedPotPattern(ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id)));
    }

    public static void loadPotteryPatterns() {
    }
}
