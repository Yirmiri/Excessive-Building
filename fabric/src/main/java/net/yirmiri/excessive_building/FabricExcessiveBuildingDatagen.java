package net.yirmiri.excessive_building;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.yirmiri.excessive_building.datagen.*;

public class FabricExcessiveBuildingDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(EBLangGen::new);
        pack.addProvider(EBBlockTagGen::new);
        pack.addProvider(EBItemTagGen::new);
        pack.addProvider(EBRecipeGen::new);
        pack.addProvider(EBLootTableGen::new);
        pack.addProvider(EBModelGen::new);
    }
}
