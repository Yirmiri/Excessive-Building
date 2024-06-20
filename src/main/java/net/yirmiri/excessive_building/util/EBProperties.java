package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.Item;

public class EBProperties {
    public class BlockP {
        //WOOD
        public static final Block.Settings GENERIC_WOOD = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
        public static final Block.Settings CHERRY_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS);
        public static final Block.Settings BAMBOO_WOOD = FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS);
        public static final Block.Settings CRIMSON_WOOD = FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS);
        public static final Block.Settings WARPED_WOOD = FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS);
        public static final Block.Settings ANCIENT_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE);

        //STONE
        public static final Block.Settings COBBLESTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLESTONE);
        public static final Block.Settings COBBLED_DEEPSLATE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE);
        public static final Block.Settings BLACKSTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.BLACKSTONE);
    }

    public class ItemP {
        //MISC
        public static final Item.Settings SIGN = new Item.Settings().maxCount(16);
    }
}
