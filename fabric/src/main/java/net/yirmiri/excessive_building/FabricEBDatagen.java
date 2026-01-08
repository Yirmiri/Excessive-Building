package net.yirmiri.excessive_building;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.yirmiri.excessive_building.datagen.*;

public class FabricEBDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(EBLangProvider::new);
        pack.addProvider(EBBlockTagProvider::new);
        pack.addProvider(EBItemTagProvider::new);
        pack.addProvider(EBLootTableProvider::new);
        pack.addProvider(EBModelProvider::new);
        pack.addProvider(EBRecipeProvider::new);
        pack.addProvider(EBBiomeTagProvider::new);
    }
}
