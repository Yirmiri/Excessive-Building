package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.core.init.EBTags;
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
        appendMineableWithAxe();
        appendSigns();
        appendCeilingHangingSigns();
        appendWallHangingSigns();
        appendWallSigns();
        appendWoodenButtons();
        appendWoodenFenceGates();
        appendWoodenDoors();
        appendWoodenFences();
        appendWoodenPressurePlates();
        appendWoodenSlabs();
        appendWoodenStairs();
        appendWoodenTrapdoors();
        appendPlanks();
        appendLeaves();
        appendLogs();
        appendMineableWithBluntForce();
    }

    private void appendMineableWithPickaxe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EBBlocks.ANDESITE_BRICKS.get())
                .add(EBBlocks.ANDESITE_BRICK_STAIRS.get())
                .add(EBBlocks.ANDESITE_BRICK_SLAB.get())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get())

                .add(EBBlocks.GRANITE_BRICKS.get())
                .add(EBBlocks.GRANITE_BRICK_STAIRS.get())
                .add(EBBlocks.GRANITE_BRICK_SLAB.get())
                .add(EBBlocks.GRANITE_BRICK_WALL.get())

                .add(EBBlocks.DIORITE_BRICKS.get())
                .add(EBBlocks.DIORITE_BRICK_STAIRS.get())
                .add(EBBlocks.DIORITE_BRICK_SLAB.get())
                .add(EBBlocks.DIORITE_BRICK_WALL.get())

                .add(EBBlocks.PEBBLESTONE.get())

                .add(EBBlocks.CONGLOMERATE.get())
                .add(EBBlocks.CONGLOMERATE_STAIRS.get())
                .add(EBBlocks.CONGLOMERATE_SLAB.get())
                .add(EBBlocks.CONGLOMERATE_WALL.get())

                .add(EBBlocks.CONGLOMERATE_BRICKS.get())
                .add(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get())
                .add(EBBlocks.CONGLOMERATE_BRICK_SLAB.get())
                .add(EBBlocks.CONGLOMERATE_BRICK_WALL.get())

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

                .add(EBBlocks.SAGE_BRICKS.get())
                .add(EBBlocks.SAGE_BRICK_STAIRS.get())
                .add(EBBlocks.SAGE_BRICK_SLAB.get())
                .add(EBBlocks.SAGE_BRICK_WALL.get())
                .add(EBBlocks.MOSSY_SAGE_BRICKS.get())

                .add(EBBlocks.BRIMSTONE.get())
                .add(EBBlocks.BRIMSTONE_STAIRS.get())
                .add(EBBlocks.BRIMSTONE_SLAB.get())
                .add(EBBlocks.BRIMSTONE_WALL.get())

                .add(EBBlocks.POLISHED_BRIMSTONE.get())
                .add(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get())
                .add(EBBlocks.POLISHED_BRIMSTONE_SLAB.get())

                .add(EBBlocks.BRIMSTONE_BRICKS.get())
                .add(EBBlocks.BRIMSTONE_BRICK_STAIRS.get())
                .add(EBBlocks.BRIMSTONE_BRICK_SLAB.get())
                .add(EBBlocks.BRIMSTONE_BRICK_WALL.get())

                .add(EBBlocks.BRIMSTONE_TILES.get())
                .add(EBBlocks.BRIMSTONE_TILE_STAIRS.get())
                .add(EBBlocks.BRIMSTONE_TILE_SLAB.get())

                .add(EBBlocks.BRIMSTONE_PILLAR.get())
                .add(EBBlocks.BRIMSTONE_LAMP.get())

                .add(EBBlocks.HECTALITE_PILLAR.get())
                .add(EBBlocks.CHLOROSLATE_PILLAR.get())
                .add(EBBlocks.ARIDITE_PILLAR.get())

                .add(EBBlocks.CHLOROSLATE.get())
                .add(EBBlocks.CHLOROSLATE_STAIRS.get())
                .add(EBBlocks.CHLOROSLATE_SLAB.get())
                .add(EBBlocks.CHLOROSLATE_WALL.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get())
                .add(EBBlocks.CHLOROSLATE_BRICKS.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_CHLOROSLATE.get())

                .add(EBBlocks.HECTALITE.get())
                .add(EBBlocks.HECTALITE_STAIRS.get())
                .add(EBBlocks.HECTALITE_SLAB.get())
                .add(EBBlocks.HECTALITE_WALL.get())
                .add(EBBlocks.POLISHED_HECTALITE.get())
                .add(EBBlocks.POLISHED_HECTALITE_STAIRS.get())
                .add(EBBlocks.POLISHED_HECTALITE_SLAB.get())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get())
                .add(EBBlocks.HECTALITE_BRICKS.get())
                .add(EBBlocks.HECTALITE_BRICK_STAIRS.get())
                .add(EBBlocks.HECTALITE_BRICK_SLAB.get())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_HECTALITE.get())

                .add(EBBlocks.ARIDITE.get())
                .add(EBBlocks.ARIDITE_STAIRS.get())
                .add(EBBlocks.ARIDITE_SLAB.get())
                .add(EBBlocks.ARIDITE_WALL.get())
                .add(EBBlocks.POLISHED_ARIDITE.get())
                .add(EBBlocks.POLISHED_ARIDITE_STAIRS.get())
                .add(EBBlocks.POLISHED_ARIDITE_SLAB.get())
                .add(EBBlocks.POLISHED_ARIDITE_WALL.get())
                .add(EBBlocks.ARIDITE_BRICKS.get())
                .add(EBBlocks.ARIDITE_BRICK_STAIRS.get())
                .add(EBBlocks.ARIDITE_BRICK_SLAB.get())
                .add(EBBlocks.ARIDITE_BRICK_WALL.get())
                .add(EBBlocks.CHISELED_ARIDITE.get())
        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(EBBlocks.getDyedCorrugatedIron(colors.getId()).get())
                    .add(EBBlocks.getDyedCorrugatedIronStairs(colors.getId()).get())
                    .add(EBBlocks.getDyedCorrugatedIronSlab(colors.getId()).get())
            ;
        }
    }

    private void appendWalls() {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get())
                .add(EBBlocks.CONGLOMERATE_WALL.get())
                .add(EBBlocks.CONGLOMERATE_BRICK_WALL.get())
                .add(EBBlocks.BRIMSTONE_WALL.get())
                .add(EBBlocks.BRIMSTONE_BRICK_WALL.get())
                .add(EBBlocks.DIORITE_BRICK_WALL.get())
                .add(EBBlocks.GRANITE_BRICK_WALL.get())
                .add(EBBlocks.ANDESITE_BRICK_WALL.get())
                .add(EBBlocks.HECTALITE_WALL.get())
                .add(EBBlocks.POLISHED_HECTALITE_WALL.get())
                .add(EBBlocks.HECTALITE_BRICK_WALL.get())
                .add(EBBlocks.ARIDITE_WALL.get())
                .add(EBBlocks.POLISHED_ARIDITE_WALL.get())
                .add(EBBlocks.ARIDITE_BRICK_WALL.get())
                .add(EBBlocks.CHLOROSLATE_WALL.get())
                .add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get())
                .add(EBBlocks.CHLOROSLATE_BRICK_WALL.get())
                .add(EBBlocks.SAGE_BRICK_WALL.get())
        ;
    }

    private void appendMineableWithAxe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(EBBlocks.ANCIENT_PLANKS.get())
                .add(EBBlocks.ANCIENT_STAIRS.get())
                .add(EBBlocks.ANCIENT_SLAB.get())
                .add(EBBlocks.ANCIENT_FENCE.get())
                .add(EBBlocks.ANCIENT_FENCE_GATE.get())
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE.get())
                .add(EBBlocks.ANCIENT_BUTTON.get())
                .add(EBBlocks.ANCIENT_LOG.get())
                .add(EBBlocks.ANCIENT_WOOD.get())
                .add(EBBlocks.STRIPPED_ANCIENT_LOG.get())
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD.get())
                .add(EBBlocks.ANCIENT_DOOR.get())
                .add(EBBlocks.ANCIENT_TRAPDOOR.get())
                .add(EBBlocks.ANCIENT_SIGN.get())
                .add(EBBlocks.ANCIENT_WALL_SIGN.get())
                .add(EBBlocks.ANCIENT_HANGING_SIGN.get())
                .add(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get())
        ;
    }

    private void appendMineableWithBluntForce() {
        getOrCreateTagBuilder(EBTags.BlockT.MINEABLE_WITH_BLUNT_FORCE)
                .add(Blocks.SEA_LANTERN)
                .add(Blocks.GLOWSTONE)
                .add(Blocks.REDSTONE_LAMP)
                .add(Blocks.TINTED_GLASS)
                .add(Blocks.GLASS)
                .add(Blocks.GLASS_PANE)
                .add(Blocks.WHITE_STAINED_GLASS)
                .add(Blocks.WHITE_STAINED_GLASS_PANE)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .add(Blocks.GRAY_STAINED_GLASS)
                .add(Blocks.GRAY_STAINED_GLASS_PANE)
                .add(Blocks.BROWN_STAINED_GLASS)
                .add(Blocks.BROWN_STAINED_GLASS_PANE)
                .add(Blocks.BLACK_STAINED_GLASS)
                .add(Blocks.BLACK_STAINED_GLASS_PANE)
                .add(Blocks.RED_STAINED_GLASS)
                .add(Blocks.RED_STAINED_GLASS_PANE)
                .add(Blocks.ORANGE_STAINED_GLASS)
                .add(Blocks.ORANGE_STAINED_GLASS_PANE)
                .add(Blocks.YELLOW_STAINED_GLASS)
                .add(Blocks.YELLOW_STAINED_GLASS_PANE)
                .add(Blocks.LIME_STAINED_GLASS)
                .add(Blocks.LIME_STAINED_GLASS_PANE)
                .add(Blocks.GREEN_STAINED_GLASS)
                .add(Blocks.GREEN_STAINED_GLASS_PANE)
                .add(Blocks.CYAN_STAINED_GLASS)
                .add(Blocks.CYAN_STAINED_GLASS_PANE)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .add(Blocks.BLUE_STAINED_GLASS)
                .add(Blocks.BLUE_STAINED_GLASS_PANE)
                .add(Blocks.PURPLE_STAINED_GLASS)
                .add(Blocks.PURPLE_STAINED_GLASS_PANE)
                .add(Blocks.MAGENTA_STAINED_GLASS)
                .add(Blocks.MAGENTA_STAINED_GLASS_PANE)
                .add(Blocks.PINK_STAINED_GLASS)
                .add(Blocks.PINK_STAINED_GLASS_PANE)
                .add(Blocks.ICE)
                .add(Blocks.BLUE_ICE)
                .add(Blocks.FROSTED_ICE)
                .add(Blocks.PACKED_ICE)
                .add(EBBlocks.FROSTED_GLASS.get())
        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(EBTags.BlockT.MINEABLE_WITH_BLUNT_FORCE)
                    .add(EBBlocks.getDyedFrostedGlass(colors.getId()).get())
            ;
        }
    }

    private void appendMineableWithShovel() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(EBBlocks.LAVENDER_CLAY.get())
                .add(EBBlocks.SAGE_CLAY.get())
                .add(EBBlocks.CORALSOIL.get())
        ;
    }

    private void appendMineableWithHoe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(EBBlocks.LAVENDER_BLOCK.get())
                .add(EBBlocks.SAGE_BLOCK.get())
                .add(EBBlocks.ANCIENT_LEAVES.get())
        ;
    }

    private void appendSmallFlowers() {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(EBBlocks.LAVENDER.get())
                .add(EBBlocks.SAGE.get())
        ;
    }

    private void appendFlowerPots() {
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(EBBlocks.POTTED_LAVENDER.get())
                .add(EBBlocks.POTTED_SAGE.get())
                .add(EBBlocks.POTTED_ANCIENT_SAPLING.get())
        ;
    }

    private void appendSigns() {
        getOrCreateTagBuilder(BlockTags.SIGNS)
                .add(EBBlocks.ANCIENT_SIGN.get())
        ;
    }

    private void appendWallSigns() {
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_SIGN.get())
        ;
    }
    private void appendCeilingHangingSigns() {
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_HANGING_SIGN.get())
        ;
    }

    private void appendWallHangingSigns() {
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get())
        ;
    }

    private void appendWoodenButtons() {
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(EBBlocks.ANCIENT_BUTTON.get())
        ;
    }

    private void appendWoodenPressurePlates() {
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE.get())
        ;
    }

    private void appendWoodenSlabs() {
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(EBBlocks.ANCIENT_SLAB.get())
        ;
    }

    private void appendWoodenStairs() {
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(EBBlocks.ANCIENT_STAIRS.get())
        ;
    }

    private void appendWoodenFences() {
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(EBBlocks.ANCIENT_FENCE.get())
        ;
    }

    private void appendWoodenFenceGates() {
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(EBBlocks.ANCIENT_FENCE_GATE.get())
        ;
    }

    private void appendWoodenDoors() {
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(EBBlocks.ANCIENT_DOOR.get())
        ;
    }

    private void appendWoodenTrapdoors() {
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(EBBlocks.ANCIENT_TRAPDOOR.get())
        ;
    }

    private void appendPlanks() {
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(EBBlocks.ANCIENT_PLANKS.get())
        ;
    }

    private void appendLogs() {
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(EBBlocks.ANCIENT_LOG.get())
                .add(EBBlocks.ANCIENT_WOOD.get())
                .add(EBBlocks.STRIPPED_ANCIENT_LOG.get())
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD.get())
        ;
    }

    private void appendLeaves() {
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(EBBlocks.ANCIENT_LEAVES.get())
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
