package net.yirmiri.excessive_building;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.yirmiri.excessive_building.datagen.*;
import net.yirmiri.excessive_building.util.EBPaintingVariants;

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
		pack.addProvider(EBPaintingTagGen::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder builder) {
		builder.addRegistry(RegistryKeys.PAINTING_VARIANT, EBPaintingVariants::bootstrap);
	}
}
