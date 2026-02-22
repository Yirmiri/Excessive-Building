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
                .add(EBBlocks.ZEUS_EPIC_BLOCK.get())

                .add(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get())
                .add(EBBlocks.SMOOTH_CORALSOIL_BRICK_STAIRS.get())
                .add(EBBlocks.SMOOTH_CORALSOIL_BRICK_SLAB.get())
                .add(EBBlocks.SMOOTH_CORALSOIL_BRICK_WALL.get())

                .add(EBBlocks.SMOOTH_LAVENDER_BRICKS.get())
                .add(EBBlocks.SMOOTH_LAVENDER_BRICK_STAIRS.get())
                .add(EBBlocks.SMOOTH_LAVENDER_BRICK_SLAB.get())
                .add(EBBlocks.SMOOTH_LAVENDER_BRICK_WALL.get())

                .add(EBBlocks.SMOOTH_SAGE_BRICKS.get())
                .add(EBBlocks.SMOOTH_SAGE_BRICK_STAIRS.get())
                .add(EBBlocks.SMOOTH_SAGE_BRICK_SLAB.get())
                .add(EBBlocks.SMOOTH_SAGE_BRICK_WALL.get())

                .add(EBBlocks.SMOOTH_BRICKS.get())
                .add(EBBlocks.SMOOTH_BRICK_STAIRS.get())
                .add(EBBlocks.SMOOTH_BRICK_SLAB.get())
                .add(EBBlocks.SMOOTH_BRICK_WALL.get())

                .add(EBBlocks.CORALSOIL_GLAZED_CLAY.get())
                .add(EBBlocks.LAVENDER_GLAZED_CLAY.get())
                .add(EBBlocks.SAGE_GLAZED_CLAY.get())

                .add(EBBlocks.CORALSOIL_HARDENED_CLAY.get())
                .add(EBBlocks.LAVENDER_HARDENED_CLAY.get())
                .add(EBBlocks.SAGE_HARDENED_CLAY.get())

                .add(EBBlocks.CORALSOIL_BRICKS.get())
                .add(EBBlocks.CORALSOIL_BRICK_STAIRS.get())
                .add(EBBlocks.CORALSOIL_BRICK_SLAB.get())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get())

                .add(EBBlocks.LAVENDER_BRICKS.get())
                .add(EBBlocks.LAVENDER_BRICK_STAIRS.get())
                .add(EBBlocks.LAVENDER_BRICK_SLAB.get())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get())

                .add(EBBlocks.SAGE_BRICKS.get())
                .add(EBBlocks.SAGE_BRICK_STAIRS.get())
                .add(EBBlocks.SAGE_BRICK_SLAB.get())
                .add(EBBlocks.SAGE_BRICK_WALL.get())

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

                .add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get())
                .add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_STAIRS.get())
                .add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_SLAB.get())
                .add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_WALL.get())

                .add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get())
                .add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_STAIRS.get())
                .add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_SLAB.get())
                .add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_WALL.get())
                .add(EBBlocks.MOSSY_LAVENDER_HARDENED_CLAY_BRICKS.get())

                .add(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get())
                .add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_STAIRS.get())
                .add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_SLAB.get())
                .add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_WALL.get())
                .add(EBBlocks.MOSSY_SAGE_HARDENED_CLAY_BRICKS.get())

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

                .add(EBBlocks.SITRITE.get())
                .add(EBBlocks.SITRITE_STAIRS.get())
                .add(EBBlocks.SITRITE_SLAB.get())
                .add(EBBlocks.SITRITE_WALL.get())

                .add(EBBlocks.POLISHED_SITRITE.get())
                .add(EBBlocks.POLISHED_SITRITE_STAIRS.get())
                .add(EBBlocks.POLISHED_SITRITE_SLAB.get())

                .add(EBBlocks.SITRITE_BRICKS.get())
                .add(EBBlocks.SITRITE_BRICK_STAIRS.get())
                .add(EBBlocks.SITRITE_BRICK_SLAB.get())
                .add(EBBlocks.SITRITE_BRICK_WALL.get())

                .add(EBBlocks.SITRITE_TILES.get())
                .add(EBBlocks.SITRITE_TILE_STAIRS.get())
                .add(EBBlocks.SITRITE_TILE_SLAB.get())

                .add(EBBlocks.SITRITE_PILLAR.get())
                .add(EBBlocks.CHISELED_SITRITE.get())

                .add(EBBlocks.AMETHYST_BRICKS.get())
                .add(EBBlocks.AMETHYST_BRICK_STAIRS.get())
                .add(EBBlocks.AMETHYST_BRICK_SLAB.get())
                .add(EBBlocks.AMETHYST_BRICK_WALL.get())

                .add(EBBlocks.EMERALD_BRICKS.get())
                .add(EBBlocks.EMERALD_BRICK_STAIRS.get())
                .add(EBBlocks.EMERALD_BRICK_SLAB.get())
                .add(EBBlocks.EMERALD_BRICK_WALL.get())

                .add(EBBlocks.DIAMOND_BRICKS.get())
                .add(EBBlocks.DIAMOND_BRICK_STAIRS.get())
                .add(EBBlocks.DIAMOND_BRICK_SLAB.get())
                .add(EBBlocks.DIAMOND_BRICK_WALL.get())

                .add(EBBlocks.LAPIS_BRICKS.get())
                .add(EBBlocks.LAPIS_BRICK_STAIRS.get())
                .add(EBBlocks.LAPIS_BRICK_SLAB.get())
                .add(EBBlocks.LAPIS_BRICK_WALL.get())

                .add(EBBlocks.MALACHITE.get())
                .add(EBBlocks.MALACHITE_STAIRS.get())
                .add(EBBlocks.MALACHITE_SLAB.get())
                .add(EBBlocks.MALACHITE_WALL.get())

                .add(EBBlocks.POLISHED_MALACHITE.get())
                .add(EBBlocks.POLISHED_MALACHITE_STAIRS.get())
                .add(EBBlocks.POLISHED_MALACHITE_SLAB.get())

                .add(EBBlocks.CUT_MALACHITE.get())
                .add(EBBlocks.CUT_MALACHITE_STAIRS.get())
                .add(EBBlocks.CUT_MALACHITE_SLAB.get())
                .add(EBBlocks.CUT_MALACHITE_WALL.get())

                .add(EBBlocks.MALACHITE_BRICKS.get())
                .add(EBBlocks.MALACHITE_BRICK_STAIRS.get())
                .add(EBBlocks.MALACHITE_BRICK_SLAB.get())
                .add(EBBlocks.MALACHITE_BRICK_WALL.get())

                .add(EBBlocks.AMETHYST_FRAMED_GLASS.get())
                .add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get())

                .add(EBBlocks.LAPIS_FRAMED_GLASS.get())
                .add(EBBlocks.LAPIS_FRAMED_GLASS_PANE.get())

                .add(EBBlocks.DIAMOND_FRAMED_GLASS.get())
                .add(EBBlocks.DIAMOND_FRAMED_GLASS_PANE.get())

                .add(EBBlocks.EMERALD_FRAMED_GLASS.get())
                .add(EBBlocks.EMERALD_FRAMED_GLASS_PANE.get())
        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(EBBlocks.getDyedCorrugatedIron(colors.getId()).get())
                    .add(EBBlocks.getDyedCorrugatedIronStairs(colors.getId()).get())
                    .add(EBBlocks.getDyedCorrugatedIronSlab(colors.getId()).get())
                    .add(EBBlocks.getDyedFrostedLantern(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentra(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraStairs(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraSlab(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraStatue(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraBricks(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()).get())
                    .add(EBBlocks.getDyedAlmentraBrickWall(colors.getId()).get())
            ;
        }
    }

    private void appendWalls() {
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EBBlocks.AMETHYST_BRICK_WALL.get())
                .add(EBBlocks.COBBLESTONE_BRICK_WALL.get())
                .add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_WALL.get())
                .add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_WALL.get())
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
                .add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_WALL.get())
                .add(EBBlocks.SITRITE_WALL.get())
                .add(EBBlocks.SITRITE_BRICK_WALL.get())
                .add(EBBlocks.SMOOTH_BRICK_WALL.get())
                .add(EBBlocks.CORALSOIL_BRICK_WALL.get())
                .add(EBBlocks.SMOOTH_CORALSOIL_BRICK_WALL.get())
                .add(EBBlocks.SAGE_BRICK_WALL.get())
                .add(EBBlocks.SMOOTH_SAGE_BRICK_WALL.get())
                .add(EBBlocks.LAVENDER_BRICK_WALL.get())
                .add(EBBlocks.SMOOTH_LAVENDER_BRICK_WALL.get())
                .add(EBBlocks.EMERALD_BRICK_WALL.get())
                .add(EBBlocks.DIAMOND_BRICK_WALL.get())
                .add(EBBlocks.LAPIS_BRICK_WALL.get())
                .add(EBBlocks.MALACHITE_WALL.get())
                .add(EBBlocks.MALACHITE_BRICK_WALL.get())
                .add(EBBlocks.CUT_MALACHITE_WALL.get())
        ;

        for (DyeColor colors : DyeColor.values()) {
            getOrCreateTagBuilder(BlockTags.WALLS)
                    .add(EBBlocks.getDyedAlmentraBrickWall(colors.getId()).get())
            ;
        }
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

                .add(EBBlocks.WINTERGREEN_PLANKS.get())
                .add(EBBlocks.WINTERGREEN_STAIRS.get())
                .add(EBBlocks.WINTERGREEN_SLAB.get())
                .add(EBBlocks.WINTERGREEN_FENCE.get())
                .add(EBBlocks.WINTERGREEN_FENCE_GATE.get())
                .add(EBBlocks.WINTERGREEN_PRESSURE_PLATE.get())
                .add(EBBlocks.WINTERGREEN_BUTTON.get())
                .add(EBBlocks.WINTERGREEN_LOG.get())
                .add(EBBlocks.WINTERGREEN_WOOD.get())
                .add(EBBlocks.STRIPPED_WINTERGREEN_LOG.get())
                .add(EBBlocks.STRIPPED_WINTERGREEN_WOOD.get())
                .add(EBBlocks.WINTERGREEN_DOOR.get())
                .add(EBBlocks.WINTERGREEN_TRAPDOOR.get())
                .add(EBBlocks.WINTERGREEN_SIGN.get())
                .add(EBBlocks.WINTERGREEN_WALL_SIGN.get())
                .add(EBBlocks.WINTERGREEN_HANGING_SIGN.get())
                .add(EBBlocks.WINTERGREEN_WALL_HANGING_SIGN.get())
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
                .add(EBBlocks.AMETHYST_FRAMED_GLASS.get())
                .add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get())
                .add(EBBlocks.AMETHYST_LAMP.get())
                .add(EBBlocks.LAPIS_FRAMED_GLASS.get())
                .add(EBBlocks.LAPIS_FRAMED_GLASS_PANE.get())
                .add(EBBlocks.LAPIS_LAMP.get())
                .add(EBBlocks.DIAMOND_FRAMED_GLASS.get())
                .add(EBBlocks.DIAMOND_FRAMED_GLASS_PANE.get())
                .add(EBBlocks.DIAMOND_LAMP.get())
                .add(EBBlocks.EMERALD_FRAMED_GLASS.get())
                .add(EBBlocks.EMERALD_FRAMED_GLASS_PANE.get())
                .add(EBBlocks.EMERALD_LAMP.get())
                .add(Blocks.CREEPER_HEAD)
                .add(Blocks.SKELETON_SKULL)
                .add(Blocks.WITHER_SKELETON_SKULL)
                .add(Blocks.ZOMBIE_HEAD)
                .add(Blocks.DRAGON_HEAD)
                .add(Blocks.PIGLIN_HEAD)
                .add(Blocks.PLAYER_HEAD)
                .add(Blocks.CREEPER_WALL_HEAD)
                .add(Blocks.SKELETON_WALL_SKULL)
                .add(Blocks.WITHER_SKELETON_WALL_SKULL)
                .add(Blocks.ZOMBIE_WALL_HEAD)
                .add(Blocks.DRAGON_WALL_HEAD)
                .add(Blocks.PIGLIN_WALL_HEAD)
                .add(Blocks.PLAYER_WALL_HEAD)
                .add(Blocks.BEACON)
                .add(Blocks.CACTUS)
                .add(Blocks.CAKE)
                .add(Blocks.CANDLE_CAKE)
                .add(Blocks.RED_CANDLE_CAKE)
                .add(Blocks.YELLOW_CANDLE_CAKE)
                .add(Blocks.ORANGE_CANDLE_CAKE)
                .add(Blocks.LIME_CANDLE_CAKE)
                .add(Blocks.GREEN_CANDLE_CAKE)
                .add(Blocks.CYAN_CANDLE_CAKE)
                .add(Blocks.LIGHT_BLUE_CANDLE_CAKE)
                .add(Blocks.BLUE_CANDLE_CAKE)
                .add(Blocks.PURPLE_CANDLE_CAKE)
                .add(Blocks.MAGENTA_CANDLE_CAKE)
                .add(Blocks.PINK_CANDLE_CAKE)
                .add(Blocks.BROWN_CANDLE_CAKE)
                .add(Blocks.LIGHT_GRAY_CANDLE_CAKE)
                .add(Blocks.GRAY_CANDLE_CAKE)
                .add(Blocks.BLACK_CANDLE_CAKE)
                .add(Blocks.WHITE_CANDLE_CAKE)
                .add(Blocks.HONEYCOMB_BLOCK)
                .add(Blocks.TURTLE_EGG)
                .add(Blocks.SNIFFER_EGG)
                .add(Blocks.OCHRE_FROGLIGHT)
                .add(Blocks.PEARLESCENT_FROGLIGHT)
                .add(Blocks.VERDANT_FROGLIGHT)
                .add(Blocks.RED_CARPET)
                .add(Blocks.YELLOW_CARPET)
                .add(Blocks.ORANGE_CARPET)
                .add(Blocks.LIME_CARPET)
                .add(Blocks.GREEN_CARPET)
                .add(Blocks.CYAN_CARPET)
                .add(Blocks.LIGHT_BLUE_CARPET)
                .add(Blocks.BLUE_CARPET)
                .add(Blocks.PURPLE_CARPET)
                .add(Blocks.MAGENTA_CARPET)
                .add(Blocks.PINK_CARPET)
                .add(Blocks.BROWN_CARPET)
                .add(Blocks.LIGHT_GRAY_CARPET)
                .add(Blocks.GRAY_CARPET)
                .add(Blocks.BLACK_CARPET)
                .add(Blocks.WHITE_CARPET)
                .add(Blocks.RED_WOOL)
                .add(Blocks.YELLOW_WOOL)
                .add(Blocks.ORANGE_WOOL)
                .add(Blocks.LIME_WOOL)
                .add(Blocks.GREEN_WOOL)
                .add(Blocks.CYAN_WOOL)
                .add(Blocks.LIGHT_BLUE_WOOL)
                .add(Blocks.BLUE_WOOL)
                .add(Blocks.PURPLE_WOOL)
                .add(Blocks.MAGENTA_WOOL)
                .add(Blocks.PINK_WOOL)
                .add(Blocks.BROWN_WOOL)
                .add(Blocks.LIGHT_GRAY_WOOL)
                .add(Blocks.GRAY_WOOL)
                .add(Blocks.BLACK_WOOL)
                .add(Blocks.WHITE_WOOL)
                .add(Blocks.RED_BED)
                .add(Blocks.YELLOW_BED)
                .add(Blocks.ORANGE_BED)
                .add(Blocks.LIME_BED)
                .add(Blocks.GREEN_BED)
                .add(Blocks.CYAN_BED)
                .add(Blocks.LIGHT_BLUE_BED)
                .add(Blocks.BLUE_BED)
                .add(Blocks.PURPLE_BED)
                .add(Blocks.MAGENTA_BED)
                .add(Blocks.PINK_BED)
                .add(Blocks.BROWN_BED)
                .add(Blocks.LIGHT_GRAY_BED)
                .add(Blocks.GRAY_BED)
                .add(Blocks.BLACK_BED)
                .add(Blocks.WHITE_BED)
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
                .add(EBBlocks.CORALSOIL_CLAY.get())
        ;
    }

    private void appendMineableWithHoe() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(EBBlocks.LAVENDER_BLOCK.get())
                .add(EBBlocks.SAGE_BLOCK.get())
                .add(EBBlocks.ANCIENT_LEAVES.get())
                .add(EBBlocks.WINTERGREEN_LEAVES.get())
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
                .add(EBBlocks.POTTED_WINTERGREEN_SAPLING.get())
        ;
    }

    private void appendSigns() {
        getOrCreateTagBuilder(BlockTags.SIGNS)
                .add(EBBlocks.ANCIENT_SIGN.get())
                .add(EBBlocks.WINTERGREEN_SIGN.get())
        ;
    }

    private void appendWallSigns() {
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_SIGN.get())
                .add(EBBlocks.WINTERGREEN_WALL_SIGN.get())
        ;
    }
    
    private void appendCeilingHangingSigns() {
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_HANGING_SIGN.get())
                .add(EBBlocks.WINTERGREEN_HANGING_SIGN.get())
        ;
    }

    private void appendWallHangingSigns() {
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get())
                .add(EBBlocks.WINTERGREEN_WALL_HANGING_SIGN.get())
        ;
    }

    private void appendWoodenButtons() {
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(EBBlocks.ANCIENT_BUTTON.get())
                .add(EBBlocks.WINTERGREEN_BUTTON.get())
        ;
    }

    private void appendWoodenPressurePlates() {
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(EBBlocks.ANCIENT_PRESSURE_PLATE.get())
                .add(EBBlocks.WINTERGREEN_PRESSURE_PLATE.get())
        ;
    }

    private void appendWoodenSlabs() {
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(EBBlocks.ANCIENT_SLAB.get())
                .add(EBBlocks.WINTERGREEN_SLAB.get())
        ;
    }

    private void appendWoodenStairs() {
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(EBBlocks.ANCIENT_STAIRS.get())
                .add(EBBlocks.WINTERGREEN_STAIRS.get())
        ;
    }

    private void appendWoodenFences() {
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(EBBlocks.ANCIENT_FENCE.get())
                .add(EBBlocks.WINTERGREEN_FENCE.get())
        ;
    }

    private void appendWoodenFenceGates() {
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(EBBlocks.ANCIENT_FENCE_GATE.get())
                .add(EBBlocks.WINTERGREEN_FENCE_GATE.get())
        ;
    }

    private void appendWoodenDoors() {
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(EBBlocks.ANCIENT_DOOR.get())
                .add(EBBlocks.WINTERGREEN_DOOR.get())
        ;
    }

    private void appendWoodenTrapdoors() {
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(EBBlocks.ANCIENT_TRAPDOOR.get())
                .add(EBBlocks.WINTERGREEN_TRAPDOOR.get())
        ;
    }

    private void appendPlanks() {
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(EBBlocks.ANCIENT_PLANKS.get())
                .add(EBBlocks.WINTERGREEN_PLANKS.get())
        ;
    }

    private void appendLogs() {
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(EBBlocks.ANCIENT_LOG.get())
                .add(EBBlocks.ANCIENT_WOOD.get())
                .add(EBBlocks.STRIPPED_ANCIENT_LOG.get())
                .add(EBBlocks.STRIPPED_ANCIENT_WOOD.get())

                .add(EBBlocks.WINTERGREEN_LOG.get())
                .add(EBBlocks.WINTERGREEN_WOOD.get())
                .add(EBBlocks.STRIPPED_WINTERGREEN_LOG.get())
                .add(EBBlocks.STRIPPED_WINTERGREEN_WOOD.get())
        ;
    }

    private void appendLeaves() {
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(EBBlocks.ANCIENT_LEAVES.get())
                .add(EBBlocks.WINTERGREEN_LEAVES.get())
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
