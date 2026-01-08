package net.yirmiri.excessive_building.core.init;

import net.azurune.runiclib.RunicLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBTags {
    public static class BlockT {
        //MISC

        private static TagKey<Block> create(String id) {
            return TagKey.create(Registries.BLOCK, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class ItemT {
        //MISC
        public static final TagKey<Item> DEAD_CORAL_BLOCKS = create("dead_coral_blocks");

        private static TagKey<Item> create(String id) {
            return TagKey.create(Registries.ITEM, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class BiomeT {
        //FEATURES
        public static final TagKey<Biome> LAVENDER_GENERATES_IN = create("lavender_generates_in");

        private static TagKey<Biome> create(String id) {
            return TagKey.create(Registries.BIOME, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
