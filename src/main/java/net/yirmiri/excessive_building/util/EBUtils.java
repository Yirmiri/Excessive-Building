package net.yirmiri.excessive_building.util;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.Objects;

public class EBUtils {
    public static void hammerUsed(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        player.playSound(SoundEvents.UI_STONECUTTER_TAKE_RESULT, 0.5F, 1.0F);
        world.addBlockBreakParticles(pos, state);
        player.incrementStat(EBStats.BLOCKS_HAMMERED);
    }

    public static void wrenchUsed(PlayerEntity player) {
        player.playSound(SoundEvents.ITEM_SPYGLASS_USE, 0.5F, 1.0F);
        player.incrementStat(EBStats.BLOCKS_WRENCHED);
    }

    public static final Supplier<ImmutableBiMap<Object, Object>> BASE_TO_HAMMERED_VARIANT = Suppliers.memoize(() -> ImmutableBiMap.builder()
            .put(Blocks.CARVED_PUMPKIN, EBBlocks.WICKED_CARVED_PUMPKIN)
            .put(EBBlocks.WICKED_CARVED_PUMPKIN, EBBlocks.CHEERFUL_CARVED_PUMPKIN)
            .put(EBBlocks.CHEERFUL_CARVED_PUMPKIN, EBBlocks.GRUMPY_CARVED_PUMPKIN)
            .put(EBBlocks.GRUMPY_CARVED_PUMPKIN, Blocks.CARVED_PUMPKIN)

            .put(Blocks.JACK_O_LANTERN, EBBlocks.WICKED_JACK_O_LANTERN)
            .put(EBBlocks.WICKED_JACK_O_LANTERN, EBBlocks.CHEERFUL_JACK_O_LANTERN)
            .put(EBBlocks.CHEERFUL_JACK_O_LANTERN, EBBlocks.GRUMPY_JACK_O_LANTERN)
            .put(EBBlocks.GRUMPY_JACK_O_LANTERN, Blocks.JACK_O_LANTERN)

            .put(EBBlocks.SOUL_JACK_O_LANTERN, EBBlocks.WICKED_SOUL_JACK_O_LANTERN)
            .put(EBBlocks.WICKED_SOUL_JACK_O_LANTERN, EBBlocks.CHEERFUL_SOUL_JACK_O_LANTERN)
            .put(EBBlocks.CHEERFUL_SOUL_JACK_O_LANTERN, EBBlocks.GRUMPY_SOUL_JACK_O_LANTERN)
            .put(EBBlocks.GRUMPY_SOUL_JACK_O_LANTERN, EBBlocks.SOUL_JACK_O_LANTERN)

            .put(EBBlocks.OAK_MOSAIC, EBBlocks.OAK_BOARDS)
            .put(EBBlocks.OAK_MOSAIC_STAIRS, EBBlocks.OAK_BOARD_STAIRS)
            .put(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, EBBlocks.OAK_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.OAK_MOSAIC_SLAB, EBBlocks.OAK_BOARD_SLAB)
            .put(EBBlocks.SPRUCE_MOSAIC, EBBlocks.SPRUCE_BOARDS)
            .put(EBBlocks.SPRUCE_MOSAIC_STAIRS, EBBlocks.SPRUCE_BOARD_STAIRS)
            .put(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.SPRUCE_MOSAIC_SLAB, EBBlocks.SPRUCE_BOARD_SLAB)
            .put(EBBlocks.BIRCH_MOSAIC, EBBlocks.BIRCH_BOARDS)
            .put(EBBlocks.BIRCH_MOSAIC_STAIRS, EBBlocks.BIRCH_BOARD_STAIRS)
            .put(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.BIRCH_MOSAIC_SLAB, EBBlocks.BIRCH_BOARD_SLAB)
            .put(EBBlocks.JUNGLE_MOSAIC, EBBlocks.JUNGLE_BOARDS)
            .put(EBBlocks.JUNGLE_MOSAIC_STAIRS, EBBlocks.JUNGLE_BOARD_STAIRS)
            .put(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.JUNGLE_MOSAIC_SLAB, EBBlocks.JUNGLE_BOARD_SLAB)
            .put(EBBlocks.ACACIA_MOSAIC, EBBlocks.ACACIA_BOARDS)
            .put(EBBlocks.ACACIA_MOSAIC_STAIRS, EBBlocks.ACACIA_BOARD_STAIRS)
            .put(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.ACACIA_MOSAIC_SLAB, EBBlocks.ACACIA_BOARD_SLAB)
            .put(EBBlocks.DARK_OAK_MOSAIC, EBBlocks.DARK_OAK_BOARDS)
            .put(EBBlocks.DARK_OAK_MOSAIC_STAIRS, EBBlocks.DARK_OAK_BOARD_STAIRS)
            .put(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.DARK_OAK_MOSAIC_SLAB, EBBlocks.DARK_OAK_BOARD_SLAB)
            .put(EBBlocks.MANGROVE_MOSAIC, EBBlocks.MANGROVE_BOARDS)
            .put(EBBlocks.MANGROVE_MOSAIC_STAIRS, EBBlocks.MANGROVE_BOARD_STAIRS)
            .put(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.MANGROVE_MOSAIC_SLAB, EBBlocks.MANGROVE_BOARD_SLAB)
            .put(EBBlocks.CHERRY_MOSAIC, EBBlocks.CHERRY_BOARDS)
            .put(EBBlocks.CHERRY_MOSAIC_STAIRS, EBBlocks.CHERRY_BOARD_STAIRS)
            .put(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.CHERRY_MOSAIC_SLAB, EBBlocks.CHERRY_BOARD_SLAB)
            .put(Blocks.BAMBOO_MOSAIC, EBBlocks.BAMBOO_BOARDS)
            .put(Blocks.BAMBOO_MOSAIC_STAIRS, EBBlocks.BAMBOO_BOARD_STAIRS)
            .put(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS)
            .put(Blocks.BAMBOO_MOSAIC_SLAB, EBBlocks.BAMBOO_BOARD_SLAB)
            .put(EBBlocks.CRIMSON_MOSAIC, EBBlocks.CRIMSON_BOARDS)
            .put(EBBlocks.CRIMSON_MOSAIC_STAIRS, EBBlocks.CRIMSON_BOARD_STAIRS)
            .put(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS, EBBlocks.CRIMSON_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.CRIMSON_MOSAIC_SLAB, EBBlocks.CRIMSON_BOARD_SLAB)
            .put(EBBlocks.WARPED_MOSAIC, EBBlocks.WARPED_BOARDS)
            .put(EBBlocks.WARPED_MOSAIC_STAIRS, EBBlocks.WARPED_BOARD_STAIRS)
            .put(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS, EBBlocks.WARPED_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.WARPED_MOSAIC_SLAB, EBBlocks.WARPED_BOARD_SLAB)
            .put(EBBlocks.ANCIENT_MOSAIC, EBBlocks.ANCIENT_BOARDS)
            .put(EBBlocks.ANCIENT_MOSAIC_STAIRS, EBBlocks.ANCIENT_BOARD_STAIRS)
            .put(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.ANCIENT_MOSAIC_SLAB, EBBlocks.ANCIENT_BOARD_SLAB)
            .put(EBBlocks.GLOOM_MOSAIC, EBBlocks.GLOOM_BOARDS)
            .put(EBBlocks.GLOOM_MOSAIC_STAIRS, EBBlocks.GLOOM_BOARD_STAIRS)
            .put(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS, EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS)
            .put(EBBlocks.GLOOM_MOSAIC_SLAB, EBBlocks.GLOOM_BOARD_SLAB)

            .put(EBBlocks.OAK_BOARDS, EBBlocks.OAK_MOSAIC)
            .put(EBBlocks.OAK_BOARD_STAIRS, EBBlocks.OAK_MOSAIC_STAIRS)
            .put(EBBlocks.OAK_BOARD_VERTICAL_STAIRS, EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.OAK_BOARD_SLAB, EBBlocks.OAK_MOSAIC_SLAB)
            .put(EBBlocks.SPRUCE_BOARDS, EBBlocks.SPRUCE_MOSAIC)
            .put(EBBlocks.SPRUCE_BOARD_STAIRS, EBBlocks.SPRUCE_MOSAIC_STAIRS)
            .put(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS, EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.SPRUCE_BOARD_SLAB, EBBlocks.SPRUCE_MOSAIC_SLAB)
            .put(EBBlocks.BIRCH_BOARDS, EBBlocks.BIRCH_MOSAIC)
            .put(EBBlocks.BIRCH_BOARD_STAIRS, EBBlocks.BIRCH_MOSAIC_STAIRS)
            .put(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS, EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.BIRCH_BOARD_SLAB, EBBlocks.BIRCH_MOSAIC_SLAB)
            .put(EBBlocks.JUNGLE_BOARDS, EBBlocks.JUNGLE_MOSAIC)
            .put(EBBlocks.JUNGLE_BOARD_STAIRS, EBBlocks.JUNGLE_MOSAIC_STAIRS)
            .put(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS, EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.JUNGLE_BOARD_SLAB, EBBlocks.JUNGLE_MOSAIC_SLAB)
            .put(EBBlocks.ACACIA_BOARDS, EBBlocks.ACACIA_MOSAIC)
            .put(EBBlocks.ACACIA_BOARD_STAIRS, EBBlocks.ACACIA_MOSAIC_STAIRS)
            .put(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS, EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.ACACIA_BOARD_SLAB, EBBlocks.ACACIA_MOSAIC_SLAB)
            .put(EBBlocks.DARK_OAK_BOARDS, EBBlocks.DARK_OAK_MOSAIC)
            .put(EBBlocks.DARK_OAK_BOARD_STAIRS, EBBlocks.DARK_OAK_MOSAIC_STAIRS)
            .put(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS, EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.DARK_OAK_BOARD_SLAB, EBBlocks.DARK_OAK_MOSAIC_SLAB)
            .put(EBBlocks.MANGROVE_BOARDS, EBBlocks.MANGROVE_MOSAIC)
            .put(EBBlocks.MANGROVE_BOARD_STAIRS, EBBlocks.MANGROVE_MOSAIC_STAIRS)
            .put(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS, EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.MANGROVE_BOARD_SLAB, EBBlocks.MANGROVE_MOSAIC_SLAB)
            .put(EBBlocks.CHERRY_BOARDS, EBBlocks.CHERRY_MOSAIC)
            .put(EBBlocks.CHERRY_BOARD_STAIRS, EBBlocks.CHERRY_MOSAIC_STAIRS)
            .put(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS, EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.CHERRY_BOARD_SLAB, EBBlocks.CHERRY_MOSAIC_SLAB)
            .put(EBBlocks.BAMBOO_BOARDS, Blocks.BAMBOO_MOSAIC)
            .put(EBBlocks.BAMBOO_BOARD_STAIRS, Blocks.BAMBOO_MOSAIC_STAIRS)
            .put(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS, EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.BAMBOO_BOARD_SLAB, Blocks.BAMBOO_MOSAIC_SLAB)
            .put(EBBlocks.CRIMSON_BOARDS, EBBlocks.CRIMSON_MOSAIC)
            .put(EBBlocks.CRIMSON_BOARD_STAIRS, EBBlocks.CRIMSON_MOSAIC_STAIRS)
            .put(EBBlocks.CRIMSON_BOARD_VERTICAL_STAIRS, EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.CRIMSON_BOARD_SLAB, EBBlocks.CRIMSON_MOSAIC_SLAB)
            .put(EBBlocks.WARPED_BOARDS, EBBlocks.WARPED_MOSAIC)
            .put(EBBlocks.WARPED_BOARD_STAIRS, EBBlocks.WARPED_MOSAIC_STAIRS)
            .put(EBBlocks.WARPED_BOARD_VERTICAL_STAIRS, EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.WARPED_BOARD_SLAB, EBBlocks.WARPED_MOSAIC_SLAB)
            .put(EBBlocks.ANCIENT_BOARDS, EBBlocks.ANCIENT_MOSAIC)
            .put(EBBlocks.ANCIENT_BOARD_STAIRS, EBBlocks.ANCIENT_MOSAIC_STAIRS)
            .put(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS, EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.ANCIENT_BOARD_SLAB, EBBlocks.ANCIENT_MOSAIC_SLAB)
            .put(EBBlocks.GLOOM_BOARDS, EBBlocks.GLOOM_MOSAIC)
            .put(EBBlocks.GLOOM_BOARD_STAIRS, EBBlocks.GLOOM_MOSAIC_STAIRS)
            .put(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS, EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS)
            .put(EBBlocks.GLOOM_BOARD_SLAB, EBBlocks.GLOOM_MOSAIC_SLAB)

            .put(EBBlocks.THIN_PAPER_BLOCK, EBBlocks.THICK_PAPER_BLOCK)
            .put(EBBlocks.THIN_PAPER_STAIRS, EBBlocks.THICK_PAPER_STAIRS)
            .put(EBBlocks.THIN_PAPER_VERTICAL_STAIRS, EBBlocks.THICK_PAPER_VERTICAL_STAIRS)
            .put(EBBlocks.THIN_PAPER_SLAB, EBBlocks.THICK_PAPER_SLAB)
            .put(EBBlocks.THIN_DIVIDED_PAPER_BLOCK, EBBlocks.THICK_DIVIDED_PAPER_BLOCK)
            .put(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK, EBBlocks.THICK_DIAGONAL_PAPER_BLOCK)

            .put(EBBlocks.THICK_PAPER_BLOCK, EBBlocks.THIN_PAPER_BLOCK)
            .put(EBBlocks.THICK_PAPER_STAIRS, EBBlocks.THIN_PAPER_STAIRS)
            .put(EBBlocks.THICK_PAPER_VERTICAL_STAIRS, EBBlocks.THIN_PAPER_VERTICAL_STAIRS)
            .put(EBBlocks.THICK_PAPER_SLAB, EBBlocks.THIN_PAPER_SLAB)
            .put(EBBlocks.THICK_DIVIDED_PAPER_BLOCK, EBBlocks.THIN_DIVIDED_PAPER_BLOCK)
            .put(EBBlocks.THICK_DIAGONAL_PAPER_BLOCK, EBBlocks.THIN_DIAGONAL_PAPER_BLOCK)

            .put(EBBlocks.DECORATED_SANDSTONE_BRICKS, EBBlocks.ENGRAVED_SANDSTONE_BRICKS)
            .put(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS)
            .put(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS)

            .put(Blocks.STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS)
            .put(Blocks.DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS)
            .put(Blocks.DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES)
            .put(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
            .put(Blocks.NETHER_BRICKS, Blocks.CRACKED_NETHER_BRICKS)
            .put(Blocks.INFESTED_STONE_BRICKS, Blocks.INFESTED_CRACKED_STONE_BRICKS)
            .put(EBBlocks.COBBLESTONE_BRICKS, EBBlocks.CRACKED_COBBLESTONE_BRICKS)
            .put(EBBlocks.COBBLED_DEEPSLATE_BRICKS, EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS)
            .put(EBBlocks.BLACKSTONE_BRICKS, EBBlocks.CRACKED_BLACKSTONE_BRICKS)
            .put(EBBlocks.SMOOTH_STONE_BRICKS, EBBlocks.CRACKED_SMOOTH_STONE_BRICKS)
            .put(EBBlocks.GRANITE_BRICKS, EBBlocks.CRACKED_GRANITE_BRICKS)
            .put(EBBlocks.ANDESITE_BRICKS, EBBlocks.CRACKED_ANDESITE_BRICKS)
            .put(EBBlocks.DIORITE_BRICKS, EBBlocks.CRACKED_DIORITE_BRICKS)
            .put(Blocks.BRICKS, EBBlocks.CRACKED_BRICKS)
            .put(EBBlocks.SMOOTH_BRICKS, EBBlocks.CRACKED_SMOOTH_BRICKS)
            .put(EBBlocks.BRIMSTONE_BRICKS, EBBlocks.CRACKED_BRIMSTONE_BRICKS)
            .put(Blocks.MUD_BRICKS, EBBlocks.CRACKED_MUD_BRICKS)
            .build());

    public static void registerHammerableBlockPair(Object base, Object hammered) {
        Objects.requireNonNull(base, "The base block cannot be null!");
        Objects.requireNonNull(hammered, "The hammered block cannot be null!");
        BASE_TO_HAMMERED_VARIANT.get().put(base, hammered);
    }
}
