package net.yirmiri.excessive_building;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.yirmiri.excessive_building.datagen.*;

public class ExcessiveBuildingDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EBEnUsLangGen::new);
		pack.addProvider(EBLootTableGen::new);
		pack.addProvider(EBRecipeGen::new);
		pack.addProvider(EBModelGen::new);
		pack.addProvider(EBBlockTagGen::new);
		pack.addProvider(EBItemTagGen::new);
		pack.addProvider(EBPaintingVariantTagGen::new);
	}
}
