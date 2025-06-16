package net.yirmiri.excessive_building.core.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBTags {
    public static class Blocks {
        public static final TagKey<Block> MINEABLE_WITH_GAUNTLET = create("mineable_with_gauntlet");

        private static TagKey<Block> create(String id) {
            return TagKey.create(Registries.BLOCK, ExcessiveBuilding.modid(id));
        }
    }

    public static class Items {
        //public static final TagKey<Item> RADIANT_ITEMS = create("radiant_items");

        private static TagKey<Item> create(String id) {
            return TagKey.create(Registries.ITEM, ExcessiveBuilding.modid(id));
        }
    }
}
