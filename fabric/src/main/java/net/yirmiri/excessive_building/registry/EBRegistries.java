package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.world.item.DyeColor;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class EBRegistries {
    public static void loadRegistries() {
        registerStrippables();
        registerCompostables();
        registerFuels();
        registerFlammables();
        registerOxidizables();
        registerWaxables();
    }

    public static void registerOxidizables() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICKS.value(), EBBlocks.EXPOSED_COPPER_BRICKS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICKS.value(), EBBlocks.WEATHERED_COPPER_BRICKS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICKS.value(), EBBlocks.OXIDIZED_COPPER_BRICKS.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICK_STAIRS.value(), EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.value(), EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.value(), EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICK_SLAB.value(), EBBlocks.EXPOSED_COPPER_BRICK_SLAB.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.value(), EBBlocks.WEATHERED_COPPER_BRICK_SLAB.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.value(), EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_PRESSURE_PLATE.value(), EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE.value(), EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE.value(), EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BUTTON.value(), EBBlocks.EXPOSED_COPPER_BUTTON.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BUTTON.value(), EBBlocks.WEATHERED_COPPER_BUTTON.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BUTTON.value(), EBBlocks.OXIDIZED_COPPER_BUTTON.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS.value());
    }

    public static void registerWaxables() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICKS.value(), EBBlocks.WAXED_COPPER_BRICKS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICKS.value(), EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICKS.value(), EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICKS.value(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.value());

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICK_STAIRS.value(), EBBlocks.WAXED_COPPER_BRICK_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.value(), EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.value(), EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.value(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.value());

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICK_SLAB.value(), EBBlocks.WAXED_COPPER_BRICK_SLAB.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.value(), EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.value(), EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.value(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.value());

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS.value(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS.value());

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_PRESSURE_PLATE.value(), EBBlocks.WAXED_COPPER_PRESSURE_PLATE.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE.value(), EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE.value(), EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE.value(), EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.value());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BUTTON.value(), EBBlocks.WAXED_COPPER_BUTTON.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BUTTON.value(), EBBlocks.WAXED_EXPOSED_COPPER_BUTTON.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BUTTON.value(), EBBlocks.WAXED_WEATHERED_COPPER_BUTTON.value());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.OXIDIZED_COPPER_BUTTON.value(), EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON.value());

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS.value());
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS.value(), EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS.value());
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(EBBlocks.ANCIENT_LOG.value(), EBBlocks.STRIPPED_ANCIENT_LOG.value());
        StrippableBlockRegistry.register(EBBlocks.ANCIENT_WOOD.value(), EBBlocks.STRIPPED_ANCIENT_WOOD.value());
        StrippableBlockRegistry.register(EBBlocks.GLOOM_LOG.value(), EBBlocks.STRIPPED_GLOOM_LOG.value());
        StrippableBlockRegistry.register(EBBlocks.GLOOM_WOOD.value(), EBBlocks.STRIPPED_GLOOM_WOOD.value());
    }

    public static void registerFuels() {
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_OAK_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_SPRUCE_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_BIRCH_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_JUNGLE_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_ACACIA_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_DARK_OAK_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_MANGROVE_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_CHERRY_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_BAMBOO_PLANKS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_ANCIENT_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_FENCE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_FENCE_GATE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BUTTON.value(), 100);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_PRESSURE_PLATE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_SAPLING.value(), 100);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_CRAFTING_TABLE.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_GLOOM_PLANKS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_FENCE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_FENCE_GATE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BUTTON.value(), 100);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_PRESSURE_PLATE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_SAPLING.value(), 100);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_CRAFTING_TABLE.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_CRAFTING_TABLE.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_CRAFTING_TABLE.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_LADDER.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_LADDER.value(), 300);

        for (DyeColor colors : DyeColor.values()) {
            FuelRegistry.INSTANCE.add(EBBlocks.getDyedKnittedWools(colors.getId()).value(), 100);
            FuelRegistry.INSTANCE.add(EBBlocks.getDyedKnittedCarpets(colors.getId()).value(), 67);
        }

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BOOKSHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BOOKSHELF.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.OAK_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_DECORATIVE_SHELF.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_DECORATIVE_SHELF.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.OAK_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS.value(), 300);

        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BOARDS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BOARD_STAIRS.value(), 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BOARD_SLAB.value(), 150);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS.value(), 300);
    }

    public static void registerFlammables() {
        //5: logs || 20: planks/carpet || 30: shelves || 60: wool
        //5: planks/logs || 20: shelves || 30: wool || 60: carpet
        for (DyeColor colors : DyeColor.values()) {
            FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.getDyedKnittedWools(colors.getId()).value(), 60, 30);
            FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.getDyedKnittedCarpets(colors.getId()).value(), 60, 60);
        }

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_LOG.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_ANCIENT_LOG.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_WOOD.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_ANCIENT_WOOD.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_ANCIENT_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_LEAVES.value(), 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_LOG.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_GLOOM_LOG.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_WOOD.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_GLOOM_WOOD.value(), 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_GLOOM_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_LEAVES.value(), 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_OAK_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_SPRUCE_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_BIRCH_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_JUNGLE_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_ACACIA_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_DARK_OAK_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_MANGROVE_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_CHERRY_PLANKS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_BAMBOO_PLANKS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_VERTICAL_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_DECORATIVE_SHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_DECORATIVE_SHELF.value(), 30, 20);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_BOOKSHELF.value(), 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_BOOKSHELF.value(), 30, 20);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS.value(), 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_BOARDS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_BOARD_STAIRS.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_BOARD_SLAB.value(), 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS.value(), 20, 5);
    }

    private static void registerCompostables() {
        //ANCIENT IS INCREASED BY +50%
        COMPOSTABLES.put(EBBlocks.ANCIENT_SAPLING.value().asItem(), 0.8f);
        COMPOSTABLES.put(EBBlocks.ANCIENT_LEAVES.value().asItem(), 0.8f);
        COMPOSTABLES.put(EBItems.ANCIENT_FRUIT.value().asItem(), 1.0f);
        COMPOSTABLES.put(EBBlocks.GLOOM_SAPLING.value().asItem(), 0.3f);
        COMPOSTABLES.put(EBBlocks.GLOOM_SEEDS.value().asItem(), 0.3f);
        COMPOSTABLES.put(EBBlocks.GLOOM_LEAVES.value().asItem(), 0.3f);
        COMPOSTABLES.put(EBBlocks.MOSS_PASTE.value().asItem(), 0.5f);
        COMPOSTABLES.put(EBBlocks.ROSE.value().asItem(), 0.65f);
        COMPOSTABLES.put(EBBlocks.CYAN_ROSE.value().asItem(), 0.65f);
        COMPOSTABLES.put(EBBlocks.WHITE_ROSE.value().asItem(), 0.65f);
    }
}
