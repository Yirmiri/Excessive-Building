package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;

import java.util.function.ToIntFunction;

public class EBProperties {
    public static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int lightLevel) {
        return (s) -> (Boolean) s.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
    }

    public static class BlockP {
        //LAVENDER
        public static final BlockBehaviour.Properties LAVENDER = BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties POTTED_LAVENDER = BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties LAVENDER_CLAY = BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties LAVENDER_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties LAVENDER_BALE = BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).sound(SoundType.MOSS).mapColor(MapColor.COLOR_MAGENTA);

        //CORALSOIL
        public static final BlockBehaviour.Properties CORALSOIL_CLAY = BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).mapColor(MapColor.COLOR_ORANGE);
        public static final BlockBehaviour.Properties CORALSOIL = BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.PACKED_MUD);

        //STONES
        public static final BlockBehaviour.Properties COBBLESTONE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE);
        public static final BlockBehaviour.Properties CONGLOMERATE = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).mapColor(MapColor.TERRACOTTA_WHITE);
        public static final BlockBehaviour.Properties PEBBLESTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).sound(SoundType.STONE);

        //METALS
        public static final BlockBehaviour.Properties COPPER = BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC_ITEM = new Item.Properties();
    }
}
