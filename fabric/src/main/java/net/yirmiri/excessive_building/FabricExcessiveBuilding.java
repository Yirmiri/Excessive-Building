package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yirmiri.excessive_building.core.init.EBFeatures;

public class FabricExcessiveBuilding implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ExcessiveBuilding.init();

        //BIOME MODIFIERS
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.LUSH_CAVES), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_CHLOROSLATE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_JUNGLE), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_CHLOROSLATE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_OVERWORLD), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_HECTALITE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BADLANDS), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_ARIDITE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.HAS_RUINED_PORTAL_DESERT), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_ARIDITE);
    }
}
