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
