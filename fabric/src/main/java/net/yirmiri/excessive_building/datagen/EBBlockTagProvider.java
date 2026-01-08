package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public EBBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        appendMineableWithPickaxe();
        appendNeedsStoneTool();
        appendWalls();
        appendSmallFlowers();
        appendFlowerPots();
        appendMineableWithHoe();
        appendMineableWithShovel();
    }

    private void appendMineableWithPickaxe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EBBlocks.COPPER_BRICKS.get())
                .add(EBBlocks.COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.COPPER_BRICK_SLAB.get())

                .add(EBBlocks.EXPOSED_COPPER_BRICKS.get())
                .add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WEATHERED_COPPER_BRICKS.get())
                .add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.OXIDIZED_COPPER_BRICKS.get())
                .add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.COBBLESTONE_BRICKS.get())
                .add(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get())
                .add(EBBlocks.COBBLESTONE_BRICK_STAIRS.get())
                .add(EBBlocks.COBBLESTONE_BRICK_SLAB.get())
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get())

                .add(EBBlocks.CORALSOIL_BRICKS.get())
                .add(EBBlocks.CORALSOIL_BRICK_STAIRS.get())
                .add(EBBlocks.CORALSOIL_BRICK_SLAB.get())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get())

                .add(EBBlocks.LAVENDER_BRICKS.get())
                .add(EBBlocks.LAVENDER_BRICK_STAIRS.get())
                .add(EBBlocks.LAVENDER_BRICK_SLAB.get())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get())
                .add(EBBlocks.MOSSY_LAVENDER_BRICKS.get())
        ;
    }

    private void appendWalls() {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get())
        ;
    }

    private void appendMineableWithShovel() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EBBlocks.LAVENDER_CLAY.get())
                .add(EBBlocks.CORALSOIL.get())
        ;
    }

    private void appendMineableWithHoe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(EBBlocks.LAVENDER_BLOCK.get())
        ;
    }

    private void appendSmallFlowers() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(EBBlocks.LAVENDER.get())
        ;
    }

    private void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(EBBlocks.POTTED_LAVENDER.get())
        ;
    }

    private void appendNeedsStoneTool() {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(EBBlocks.COPPER_BRICKS.get())
                .add(EBBlocks.COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.COPPER_BRICK_SLAB.get())

                .add(EBBlocks.EXPOSED_COPPER_BRICKS.get())
                .add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WEATHERED_COPPER_BRICKS.get())
                .add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.OXIDIZED_COPPER_BRICKS.get())
                .add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get())

                .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get())
                .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get())
                .add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get())
        ;
    }
}
