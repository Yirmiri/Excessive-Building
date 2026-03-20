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
        public static final TagKey<Block> MINEABLE_WITH_BLUNT_FORCE = create("mineable_with_blunt_force");

        private static TagKey<Block> create(String id) {
            return TagKey.create(Registries.BLOCK, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class ItemT {
        //MISC
        public static final TagKey<Item> DEAD_CORAL_BLOCKS = create("dead_coral_blocks");
        public static final TagKey<Item> ANCIENT_LOGS = create("ancient_logs");
        public static final TagKey<Item> WINTERGREEN_LOGS = create("wintergreen_logs");

        private static TagKey<Item> create(String id) {
            return TagKey.create(Registries.ITEM, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }

    public static class BiomeT {
        //FEATURES
        public static final TagKey<Biome> LAVENDER_GENERATES_IN = create("lavender_generates_in");
        public static final TagKey<Biome> SAGE_GENERATES_IN = create("sage_generates_in");
        public static final TagKey<Biome> WINTERGREEN_GENERATES_IN = create("wintergreen_generates_in");
        public static final TagKey<Biome> SNOWY_WINTERGREEN_GENERATES_IN = create("snowy_wintergreen_generates_in");
        public static final TagKey<Biome> ARIDITE_GENERATES_IN = create("aridite_generates_in");

        private static TagKey<Biome> create(String id) {
            return TagKey.create(Registries.BIOME, RunicLib.customid(ExcessiveBuilding.MOD_ID, id));
        }
    }
}
