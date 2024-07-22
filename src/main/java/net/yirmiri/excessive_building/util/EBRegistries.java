package net.yirmiri.excessive_building.util;

//5: logs || 20: planks/carpet || 30: shelves || 60: wool
//5: planks/logs || 20: shelves || 30: wool || 60: carpet

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import static net.minecraft.block.ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE;

public class EBRegistries {
    public static void registerRegistries() {
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
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_VERTICAL_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_SLAB, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, 150);

        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_OAK_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_SPRUCE_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_BIRCH_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_JUNGLE_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_ACACIA_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_DARK_OAK_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_MANGROVE_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_CHERRY_PLANKS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.CHISELED_BAMBOO_PLANKS, 150);
    }

    //TODO: ANCIENT/GLOOM

    public static void registerFlammables() {
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
    }

    private static void registerCompostables() {
        //ANCIENT IS INCREASED BY +50%
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.ANCIENT_SAPLING.asItem(), 0.8f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.ANCIENT_LEAVES.asItem(), 0.8f);
        ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBItems.ANCIENT_FRUIT.asItem(), 1.0f);
    }
}
