package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.DyeColor;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import static net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE;

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
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICKS, EBBlocks.EXPOSED_COPPER_BRICKS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICKS, EBBlocks.WEATHERED_COPPER_BRICKS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICKS, EBBlocks.OXIDIZED_COPPER_BRICKS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICK_STAIRS, EBBlocks.EXPOSED_COPPER_BRICK_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.WEATHERED_COPPER_BRICK_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICK_SLAB, EBBlocks.EXPOSED_COPPER_BRICK_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_SLAB, EBBlocks.WEATHERED_COPPER_BRICK_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_SLAB, EBBlocks.OXIDIZED_COPPER_BRICK_SLAB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_PRESSURE_PLATE, EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BUTTON, EBBlocks.EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BUTTON, EBBlocks.WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BUTTON, EBBlocks.OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.CUT_COPPER_VERTICAL_STAIRS, EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS, EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS, EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
    }

    public static void registerWaxables() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICKS, EBBlocks.WAXED_COPPER_BRICKS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICK_STAIRS, EBBlocks.WAXED_COPPER_BRICK_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICK_SLAB, EBBlocks.WAXED_COPPER_BRICK_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_SLAB, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_SLAB, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB);

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.COPPER_PRESSURE_PLATE, EBBlocks.WAXED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.COPPER_BUTTON, EBBlocks.WAXED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.EXPOSED_COPPER_BUTTON, EBBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.WEATHERED_COPPER_BUTTON, EBBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EBBlocks.OXIDIZED_COPPER_BUTTON, EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.CUT_COPPER_VERTICAL_STAIRS, EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS, EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS, EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS);
    }

    public static void registerStrippables() {
        StrippableBlockRegistry.register(EBBlocks.ANCIENT_LOG, EBBlocks.STRIPPED_ANCIENT_LOG);
        StrippableBlockRegistry.register(EBBlocks.ANCIENT_WOOD, EBBlocks.STRIPPED_ANCIENT_WOOD);
        StrippableBlockRegistry.register(EBBlocks.GLOOM_LOG, EBBlocks.STRIPPED_GLOOM_LOG);
        StrippableBlockRegistry.register(EBBlocks.GLOOM_WOOD, EBBlocks.STRIPPED_GLOOM_WOOD);
    }

    public static void registerFuels() {
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_OAK_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_SPRUCE_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_BIRCH_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_JUNGLE_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_ACACIA_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_DARK_OAK_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_MANGROVE_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_CHERRY_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_BAMBOO_PLANKS, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_ANCIENT_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_FENCE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_FENCE_GATE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BUTTON, 100);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_PRESSURE_PLATE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_SAPLING, 100);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_CRAFTING_TABLE, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_GLOOM_PLANKS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_FENCE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_FENCE_GATE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BUTTON, 100);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_PRESSURE_PLATE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_SAPLING, 100);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_CRAFTING_TABLE, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_CRAFTING_TABLE, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_CRAFTING_TABLE, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_LADDER, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_LADDER, 300);

        for (DyeColor colors : DyeColor.values()) {
            FuelRegistry.INSTANCE.add(EBBlocks.getDyedKnittedWools(colors.getId()), 100);
            FuelRegistry.INSTANCE.add(EBBlocks.getDyedKnittedCarpets(colors.getId()), 67);
        }

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_BOOKSHELF, 300);

        FuelRegistry.INSTANCE.add(EBBlocks.OAK_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.ANCIENT_DECORATIVE_SHELF, 300);
        FuelRegistry.INSTANCE.add(EBBlocks.GLOOM_DECORATIVE_SHELF, 300);
    }

    //TODO: BOARDS

    public static void registerFlammables() {
        //5: logs || 20: planks/carpet || 30: shelves || 60: wool
        //5: planks/logs || 20: shelves || 30: wool || 60: carpet
        for (DyeColor colors : DyeColor.values()) {
            FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.getDyedKnittedWools(colors.getId()), 60, 30);
            FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.getDyedKnittedCarpets(colors.getId()), 60, 60);
        }

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_ANCIENT_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_ANCIENT_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_ANCIENT_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ANCIENT_LEAVES, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_GLOOM_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.STRIPPED_GLOOM_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_GLOOM_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.GLOOM_LEAVES, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_OAK_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_SPRUCE_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_BIRCH_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_JUNGLE_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_ACACIA_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_DARK_OAK_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_MANGROVE_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_CHERRY_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHISELED_BAMBOO_PLANKS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_VERTICAL_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC_SLAB, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, 20, 5);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_DECORATIVE_SHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_DECORATIVE_SHELF, 30, 20);

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.SPRUCE_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BIRCH_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.JUNGLE_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.ACACIA_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.DARK_OAK_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.MANGROVE_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.CHERRY_BOOKSHELF, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.BAMBOO_BOOKSHELF, 30, 20);
    }

    private static void registerCompostables() {
        //ANCIENT IS INCREASED BY +50%
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.ANCIENT_SAPLING.asItem(), 0.8f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.ANCIENT_LEAVES.asItem(), 0.8f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBItems.ANCIENT_FRUIT.asItem(), 1.0f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.GLOOM_SAPLING.asItem(), 0.3f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.GLOOM_SEEDS.asItem(), 0.3f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.GLOOM_LEAVES.asItem(), 0.3f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.MOSS_PASTE.asItem(), 0.5f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.ROSE.asItem(), 0.65f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.CYAN_ROSE.asItem(), 0.65f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.WHITE_ROSE.asItem(), 0.65f);
    }
}
