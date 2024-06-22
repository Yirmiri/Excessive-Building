package net.yirmiri.excessive_building.util;

//5: logs || 20: planks/carpet || 30: shelves || 60: wool
//5: planks/logs || 20: shelves || 30: wool || 60: carpet

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.yirmiri.excessive_building.registry.EBBlocks;

public class EBRegistries {
    public static void registerRegistries() {
        registerStrippables();
        registerCompostables();
        registerFuels();
        registerFlammables();
    }

    public static void registerStrippables() {
//        StrippableBlockRegistry.register(AUBlocks.GLOOM_LOG, AUBlocks.STRIPPED_GLOOM_LOG);
//        StrippableBlockRegistry.register(AUBlocks.GLOOM_WOOD, AUBlocks.STRIPPED_GLOOM_WOOD);
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
    }

    public static void registerFlammables() {
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
        //ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.PLACEHOLDER.asItem(), 0.5f);
    }
}
