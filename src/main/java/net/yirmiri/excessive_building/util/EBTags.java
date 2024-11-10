package net.yirmiri.excessive_building.util;

import net.minecraft.block.Block;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBTags {
    public static class Blocks {
        public static final TagKey<Block> ANCIENT_LOGS = create("ancient_logs");
        public static final TagKey<Block> GLOOM_LOGS = create("gloom_logs");
        public static final TagKey<Block> DECORATIVES = create("decoratives");
        public static final TagKey<Block> HAMMER_MINEABLE = create("hammer_mineable");
        public static final TagKey<Block> CANNOT_BE_WRENCHED = create("cannot_be_wrenched");
        public static final TagKey<Block> CARVED_PUMPKINS = create("carved_pumpkins");
        public static final TagKey<Block> TERRACOTTA_POTS = create("terracotta_pots");
        public static final TagKey<Block> INCORRECT_FOR_HAMMER_TOOL = create("incorrect_for_hammer_tool");

        private static TagKey<Block> create(String id) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class Items {
        public static final TagKey<Item> MOSAIC = create("mosaic");
        public static final TagKey<Item> GLOW_REMOVALS = create("glow_removals");
        public static final TagKey<Item> ANCIENT_LOGS = create("ancient_logs");
        public static final TagKey<Item> GLOOM_LOGS = create("gloom_logs");
        public static final TagKey<Item> CRAFTING_TABLES = create("crafting_tables");
        public static final TagKey<Item> SOILS = create("soils");
        public static final TagKey<Item> KNITTED_WOOL = create("knitted_wool");
        public static final TagKey<Item> KNITTED_CARPET = create("knitted_carpet");
        public static final TagKey<Item> HAMMER_REPAIRABLE = create("hammer_repairable");
        public static final TagKey<Item> HAMMERABLE_TOOLTIP = create("hammerable_tooltip");
        public static final TagKey<Item> BOOKSHELF_VARIANTS = create("bookshelf_variants");
        public static final TagKey<Item> TAKES_PRIORITY_OVER_TOOLS = create("takes_priority_over_tools");
        public static final TagKey<Item> WRENCH_REPAIRABLE = create("wrench_repairable");

        private static TagKey<Item> create(String id) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class PaintingVariants {
        public static final TagKey<PaintingVariant> EB_PAINTINGS = create("eb_paintings");

        private static TagKey<PaintingVariant> create(String id) {
            return TagKey.of(RegistryKeys.PAINTING_VARIANT, Identifier.of(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
