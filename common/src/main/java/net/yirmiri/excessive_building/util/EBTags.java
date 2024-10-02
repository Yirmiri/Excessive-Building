package net.yirmiri.excessive_building.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBTags {
    public static class Blocks {
        public static final TagKey<Block> ANCIENT_LOGS = create("ancient_logs");
        public static final TagKey<Block> GLOOM_LOGS = create("gloom_logs");
        public static final TagKey<Block> DECORATIVES = create("decoratives");

        private static TagKey<Block> create(String id) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id));
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

        private static TagKey<Item> create(String id) {
            return TagKey.create(Registries.ITEM, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class PaintingVariants {
        public static final TagKey<PaintingVariant> EB_PAINTINGS = create("eb_paintings");

        private static TagKey<PaintingVariant> create(String id) {
            return TagKey.create(Registries.PAINTING_VARIANT, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
