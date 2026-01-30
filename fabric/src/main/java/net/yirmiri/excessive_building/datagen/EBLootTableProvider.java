package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBLootTableProvider extends FabricBlockLootTableProvider {
    public EBLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(EBBlocks.COPPER_BRICKS.get());
        dropSelf(EBBlocks.COPPER_BRICK_STAIRS.get());
        add(EBBlocks.COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.EXPOSED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.WEATHERED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.OXIDIZED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.WAXED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.WAXED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.WAXED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get());
        dropSelf(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get());
        add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get()));

        dropSelf(EBBlocks.COBBLESTONE_BRICKS.get());
        dropSelf(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());
        dropSelf(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
        add(EBBlocks.COBBLESTONE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.COBBLESTONE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.COBBLESTONE_BRICK_WALL.get());

        dropSelf(EBBlocks.CORALSOIL.get());
        dropSelf(EBBlocks.CORALSOIL_BRICKS.get());
        dropSelf(EBBlocks.CORALSOIL_BRICK_STAIRS.get());
        add(EBBlocks.CORALSOIL_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.CORALSOIL_BRICK_SLAB.get()));
        dropSelf(EBBlocks.CORALSOIL_BRICK_WALL.get());

        dropSelf(EBBlocks.LAVENDER_CLAY.get());
        dropSelf(EBBlocks.LAVENDER_BRICKS.get());
        dropSelf(EBBlocks.MOSSY_LAVENDER_BRICKS.get());
        dropSelf(EBBlocks.LAVENDER_BRICK_STAIRS.get());
        add(EBBlocks.LAVENDER_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.LAVENDER_BRICK_SLAB.get()));
        dropSelf(EBBlocks.LAVENDER_BRICK_WALL.get());
        dropSelf(EBBlocks.LAVENDER.get());
        dropPottedContents(EBBlocks.POTTED_LAVENDER.get());
        dropSelf(EBBlocks.LAVENDER_BLOCK.get());

        dropSelf(EBBlocks.CONGLOMERATE.get());
        dropSelf(EBBlocks.CONGLOMERATE_STAIRS.get());
        add(EBBlocks.CONGLOMERATE_SLAB.get(), createSlabItemTable(EBBlocks.CONGLOMERATE_SLAB.get()));
        dropSelf(EBBlocks.CONGLOMERATE_WALL.get());

        dropSelf(EBBlocks.CONGLOMERATE_BRICKS.get());
        dropSelf(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get());
        add(EBBlocks.CONGLOMERATE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.CONGLOMERATE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.CONGLOMERATE_BRICK_WALL.get());

        dropSelf(EBBlocks.PEBBLESTONE.get());
    }
}