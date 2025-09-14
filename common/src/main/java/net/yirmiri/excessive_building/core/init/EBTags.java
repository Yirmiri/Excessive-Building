package net.yirmiri.excessive_building.core.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBTags {
    public static class BlockT {
        public static final TagKey<Block> MINEABLE_WITH_MALLET = create("mineable_with_mallet");
        public static final TagKey<Block> CHAIRS = create("chairs");

        private static TagKey<Block> create(String id) {
            return TagKey.create(Registries.BLOCK, ExcessiveBuilding.modid(id));
        }
    }

    public static class ItemT {
        public static final TagKey<Item> HAS_MALLET_VARIANTS = create("has_mallet_variants");
        public static final TagKey<Item> ANCIENT_LOGS = create("ancient_logs");

        private static TagKey<Item> create(String id) {
            return TagKey.create(Registries.ITEM, ExcessiveBuilding.modid(id));
        }
    }
}
