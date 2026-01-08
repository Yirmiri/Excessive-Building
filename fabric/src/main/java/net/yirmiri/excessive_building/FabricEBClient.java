package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yirmiri.excessive_building.core.init.EBFeatureKeys;
import net.yirmiri.excessive_building.core.init.EBTags;

@Environment(EnvType.CLIENT)
public class FabricEBClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EBClient.init();

        BiomeModifications.addFeature(BiomeSelectors.tag(EBTags.BiomeT.LAVENDER_GENERATES_IN),
                GenerationStep.Decoration.VEGETAL_DECORATION, EBFeatureKeys.PlacedFeatures.PATCH_LAVENDER);
    }
}
