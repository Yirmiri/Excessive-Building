package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBBlockTagGen extends FabricTagProvider.BlockTagProvider {
    public EBBlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapper) {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EBBlocks.COBBLESTONE_BRICK_WALL)
                .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL)
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL)
                .add(EBBlocks.BLACKSTONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(EBBlocks.COBBLESTONE_BRICKS)
                .add(EBBlocks.COBBLESTONE_BRICK_STAIRS)
                .add(EBBlocks.COBBLESTONE_BRICK_SLAB)
                .add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.COBBLESTONE_BRICK_WALL)
                .add(EBBlocks.CRACKED_COBBLESTONE_BRICKS)
                .add(EBBlocks.MOSSY_COBBLESTONE_BRICKS)
                .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS)
                .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB)
                .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL)
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICKS)
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS)
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB)
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL)
                .add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS)
                .add(EBBlocks.BLACKSTONE_BRICKS)
                .add(EBBlocks.BLACKSTONE_BRICK_STAIRS)
                .add(EBBlocks.BLACKSTONE_BRICK_SLAB)
                .add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS)
                .add(EBBlocks.BLACKSTONE_BRICK_WALL)
                .add(EBBlocks.CRACKED_BLACKSTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(EBBlocks.OAK_MOSAIC)
                .add(EBBlocks.OAK_MOSAIC_STAIRS)
                .add(EBBlocks.OAK_MOSAIC_SLAB)
                .add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.SPRUCE_MOSAIC)
                .add(EBBlocks.SPRUCE_MOSAIC_STAIRS)
                .add(EBBlocks.SPRUCE_MOSAIC_SLAB)
                .add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.BIRCH_MOSAIC)
                .add(EBBlocks.BIRCH_MOSAIC_STAIRS)
                .add(EBBlocks.BIRCH_MOSAIC_SLAB)
                .add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.JUNGLE_MOSAIC)
                .add(EBBlocks.JUNGLE_MOSAIC_STAIRS)
                .add(EBBlocks.JUNGLE_MOSAIC_SLAB)
                .add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.ACACIA_MOSAIC)
                .add(EBBlocks.ACACIA_MOSAIC_STAIRS)
                .add(EBBlocks.ACACIA_MOSAIC_SLAB)
                .add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.DARK_OAK_MOSAIC)
                .add(EBBlocks.DARK_OAK_MOSAIC_STAIRS)
                .add(EBBlocks.DARK_OAK_MOSAIC_SLAB)
                .add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.MANGROVE_MOSAIC)
                .add(EBBlocks.MANGROVE_MOSAIC_STAIRS)
                .add(EBBlocks.MANGROVE_MOSAIC_SLAB)
                .add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.CHERRY_MOSAIC)
                .add(EBBlocks.CHERRY_MOSAIC_STAIRS)
                .add(EBBlocks.CHERRY_MOSAIC_SLAB)
                .add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.CRIMSON_MOSAIC)
                .add(EBBlocks.CRIMSON_MOSAIC_STAIRS)
                .add(EBBlocks.CRIMSON_MOSAIC_SLAB)
                .add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.WARPED_MOSAIC)
                .add(EBBlocks.WARPED_MOSAIC_STAIRS)
                .add(EBBlocks.WARPED_MOSAIC_SLAB)
                .add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS)
                .add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
    }
}
