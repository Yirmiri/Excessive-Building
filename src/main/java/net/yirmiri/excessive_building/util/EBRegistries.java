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

        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_STAIRS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(EBBlocks.OAK_MOSAIC_SLAB, 20, 5);
    }

    public static void registerStrippables() {
//        StrippableBlockRegistry.register(AUBlocks.GLOOM_LOG, AUBlocks.STRIPPED_GLOOM_LOG);
//        StrippableBlockRegistry.register(AUBlocks.GLOOM_WOOD, AUBlocks.STRIPPED_GLOOM_WOOD);
    }

    public static void registerFuels() {
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_STAIRS, 150);
        FuelRegistry.INSTANCE.add(EBBlocks.OAK_MOSAIC_SLAB, 150);
    }

    private static void registerCompostables() {
        //ITEM_TO_LEVEL_INCREASE_CHANCE.put(EBBlocks.PLACEHOLDER.asItem(), 0.5f);
    }
}
