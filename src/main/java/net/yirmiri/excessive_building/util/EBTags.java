package net.yirmiri.excessive_building.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBTags {
    public static class Blocks {

        private static TagKey<Block> create(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ExcessiveBuilding.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MOSAIC = create("mosaic");
        public static final TagKey<Item> GLOW_REMOVALS = create("glow_removals");

        private static TagKey<Item> create(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ExcessiveBuilding.MOD_ID, name));
        }
    }
}
