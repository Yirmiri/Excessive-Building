package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

import java.util.concurrent.CompletableFuture;

public class EBLootTableProvider extends FabricBlockLootTableProvider {
    public static final float[] LEAVES_STICK_DROP_CHANCE = new float[] { 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F };
    public static final float[] SAPLING_DROP_CHANCE = new float[] { 0.01F, 0.05F, 0.08F, 0.1F };

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

        dropSelf(EBBlocks.SAGE_CLAY.get());
        dropSelf(EBBlocks.SAGE_BRICKS.get());
        dropSelf(EBBlocks.MOSSY_SAGE_BRICKS.get());
        dropSelf(EBBlocks.SAGE_BRICK_STAIRS.get());
        add(EBBlocks.SAGE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.SAGE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.SAGE_BRICK_WALL.get());
        dropSelf(EBBlocks.SAGE.get());
        dropPottedContents(EBBlocks.POTTED_SAGE.get());
        dropSelf(EBBlocks.SAGE_BLOCK.get());

        dropSelf(EBBlocks.CONGLOMERATE.get());
        dropSelf(EBBlocks.CONGLOMERATE_STAIRS.get());
        add(EBBlocks.CONGLOMERATE_SLAB.get(), createSlabItemTable(EBBlocks.CONGLOMERATE_SLAB.get()));
        dropSelf(EBBlocks.CONGLOMERATE_WALL.get());

        dropSelf(EBBlocks.CONGLOMERATE_BRICKS.get());
        dropSelf(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get());
        add(EBBlocks.CONGLOMERATE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.CONGLOMERATE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.CONGLOMERATE_BRICK_WALL.get());

        dropSelf(EBBlocks.PEBBLESTONE.get());

        add(EBBlocks.ANCIENT_LEAVES.get(), createLeavesDrops(EBBlocks.ANCIENT_LEAVES.get(), EBBlocks.ANCIENT_SAPLING.get(), SAPLING_DROP_CHANCE));
        add(EBBlocks.ANCIENT_DOOR.get(), createDoorTable(EBBlocks.ANCIENT_DOOR.get()));
        addNetherVinesDropTable(EBBlocks.ANCIENT_VINES.get(), EBBlocks.ANCIENT_VINES_PLANT.get());
        dropOther(EBBlocks.ANCIENT_SIGN.get(), EBItems.ANCIENT_SIGN.get());
        dropOther(EBBlocks.ANCIENT_WALL_SIGN.get(), EBItems.ANCIENT_SIGN.get());
        dropOther(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBItems.ANCIENT_HANGING_SIGN.get());
        dropOther(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), EBItems.ANCIENT_HANGING_SIGN.get());
        dropSelf(EBBlocks.ANCIENT_PLANKS.get());
        dropSelf(EBBlocks.ANCIENT_STAIRS.get());
        add(EBBlocks.ANCIENT_SLAB.get(), createSlabItemTable(EBBlocks.ANCIENT_SLAB.get()));
        dropSelf(EBBlocks.ANCIENT_FENCE_GATE.get());
        dropSelf(EBBlocks.ANCIENT_FENCE.get());
        dropSelf(EBBlocks.ANCIENT_PRESSURE_PLATE.get());
        dropSelf(EBBlocks.ANCIENT_BUTTON.get());
        dropSelf(EBBlocks.ANCIENT_LOG.get());
        dropSelf(EBBlocks.ANCIENT_WOOD.get());
        dropSelf(EBBlocks.STRIPPED_ANCIENT_LOG.get());
        dropSelf(EBBlocks.STRIPPED_ANCIENT_WOOD.get());
        dropSelf(EBBlocks.ANCIENT_SAPLING.get());
        dropPottedContents(EBBlocks.POTTED_ANCIENT_SAPLING.get());
        add(EBBlocks.ANCIENT_DOOR.get(), createDoorTable(EBBlocks.ANCIENT_DOOR.get()));
        dropSelf(EBBlocks.ANCIENT_TRAPDOOR.get());

        dropSelf(EBBlocks.BRIMSTONE.get());
        dropSelf(EBBlocks.BRIMSTONE_STAIRS.get());
        add(EBBlocks.BRIMSTONE_SLAB.get(), createSlabItemTable(EBBlocks.BRIMSTONE_SLAB.get()));
        dropSelf(EBBlocks.BRIMSTONE_WALL.get());

        dropSelf(EBBlocks.POLISHED_BRIMSTONE.get());
        dropSelf(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get());
        add(EBBlocks.POLISHED_BRIMSTONE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_BRIMSTONE_SLAB.get()));

        dropSelf(EBBlocks.BRIMSTONE_BRICKS.get());
        dropSelf(EBBlocks.BRIMSTONE_BRICK_STAIRS.get());
        add(EBBlocks.BRIMSTONE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.BRIMSTONE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.BRIMSTONE_BRICK_WALL.get());

        dropSelf(EBBlocks.BRIMSTONE_TILES.get());
        dropSelf(EBBlocks.BRIMSTONE_TILE_STAIRS.get());
        add(EBBlocks.BRIMSTONE_TILE_SLAB.get(), createSlabItemTable(EBBlocks.BRIMSTONE_TILE_SLAB.get()));

        dropSelf(EBBlocks.BRIMSTONE_LAMP.get());
        dropSelf(EBBlocks.BRIMSTONE_PILLAR.get());

        dropSelf(EBBlocks.HECTALITE.get());
        dropSelf(EBBlocks.HECTALITE_STAIRS.get());
        add(EBBlocks.HECTALITE_SLAB.get(), createSlabItemTable(EBBlocks.HECTALITE_SLAB.get()));
        dropSelf(EBBlocks.HECTALITE_WALL.get());

        dropSelf(EBBlocks.POLISHED_HECTALITE.get());
        dropSelf(EBBlocks.POLISHED_HECTALITE_STAIRS.get());
        add(EBBlocks.POLISHED_HECTALITE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_HECTALITE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_HECTALITE_WALL.get());

        dropSelf(EBBlocks.HECTALITE_BRICKS.get());
        dropSelf(EBBlocks.HECTALITE_BRICK_STAIRS.get());
        add(EBBlocks.HECTALITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.HECTALITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.HECTALITE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_HECTALITE.get());

        dropSelf(EBBlocks.CHLOROSLATE.get());
        dropSelf(EBBlocks.CHLOROSLATE_STAIRS.get());
        add(EBBlocks.CHLOROSLATE_SLAB.get(), createSlabItemTable(EBBlocks.CHLOROSLATE_SLAB.get()));
        dropSelf(EBBlocks.CHLOROSLATE_WALL.get());

        dropSelf(EBBlocks.POLISHED_CHLOROSLATE.get());
        dropSelf(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get());
        add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_CHLOROSLATE_WALL.get());

        dropSelf(EBBlocks.CHLOROSLATE_BRICKS.get());
        dropSelf(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get());
        add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.CHLOROSLATE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.CHLOROSLATE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_CHLOROSLATE.get());

        dropSelf(EBBlocks.ARIDITE.get());
        dropSelf(EBBlocks.ARIDITE_STAIRS.get());
        add(EBBlocks.ARIDITE_SLAB.get(), createSlabItemTable(EBBlocks.ARIDITE_SLAB.get()));
        dropSelf(EBBlocks.ARIDITE_WALL.get());

        dropSelf(EBBlocks.POLISHED_ARIDITE.get());
        dropSelf(EBBlocks.POLISHED_ARIDITE_STAIRS.get());
        add(EBBlocks.POLISHED_ARIDITE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_ARIDITE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_ARIDITE_WALL.get());

        dropSelf(EBBlocks.ARIDITE_BRICKS.get());
        dropSelf(EBBlocks.ARIDITE_BRICK_STAIRS.get());
        add(EBBlocks.ARIDITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ARIDITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ARIDITE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_ARIDITE.get());

        dropSelf(EBBlocks.HECTALITE_PILLAR.get());
        dropSelf(EBBlocks.CHLOROSLATE_PILLAR.get());
        dropSelf(EBBlocks.ARIDITE_PILLAR.get());

        dropSelf(EBBlocks.DIORITE_BRICKS.get());
        dropSelf(EBBlocks.DIORITE_BRICK_STAIRS.get());
        add(EBBlocks.DIORITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.DIORITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.DIORITE_BRICK_WALL.get());

        dropSelf(EBBlocks.GRANITE_BRICKS.get());
        dropSelf(EBBlocks.GRANITE_BRICK_STAIRS.get());
        add(EBBlocks.GRANITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.GRANITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.GRANITE_BRICK_WALL.get());

        dropSelf(EBBlocks.ANDESITE_BRICKS.get());
        dropSelf(EBBlocks.ANDESITE_BRICK_STAIRS.get());
        add(EBBlocks.ANDESITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ANDESITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ANDESITE_BRICK_WALL.get());
    }
}