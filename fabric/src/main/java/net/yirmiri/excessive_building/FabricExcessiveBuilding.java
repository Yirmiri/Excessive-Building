package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yirmiri.excessive_building.common.util.EBRegistries;
import net.yirmiri.excessive_building.core.init.EBFeatureKeys;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.mixin.BlockEntityAccessor;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBFabricLootModifiers;

import java.util.HashSet;
import java.util.Set;

public class FabricExcessiveBuilding implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ExcessiveBuilding.init();
        EBFabricLootModifiers.load();
        EBRegistries.load();

        Set<Block> signs = new HashSet<>(((BlockEntityAccessor) BlockEntityType.SIGN).getValidBlocks());
        signs.add(EBBlocks.ANCIENT_SIGN.get());
        signs.add(EBBlocks.ANCIENT_WALL_SIGN.get());
        ((BlockEntityAccessor) BlockEntityType.SIGN).setValidBlocks(signs);

        Set<Block> hangingSigns = new HashSet<>(((BlockEntityAccessor) BlockEntityType.HANGING_SIGN).getValidBlocks());
        signs.add(EBBlocks.ANCIENT_HANGING_SIGN.get());
        signs.add(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get());
        ((BlockEntityAccessor) BlockEntityType.HANGING_SIGN).setValidBlocks(hangingSigns);

        //BIOME MODIFIERS
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SWAMP),
                GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatureKeys.PlacedFeatures.ORE_SITRITE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_JUNGLE),
                GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatureKeys.PlacedFeatures.ORE_CHLOROSLATE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_OVERWORLD),
                GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatureKeys.PlacedFeatures.ORE_HECTALITE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.HAS_RUINED_PORTAL_DESERT),
                GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatureKeys.PlacedFeatures.ORE_ARIDITE);

        BiomeModifications.addFeature(BiomeSelectors.tag(EBTags.BiomeT.LAVENDER_GENERATES_IN),
                GenerationStep.Decoration.VEGETAL_DECORATION, EBFeatureKeys.PlacedFeatures.PATCH_LAVENDER);

        BiomeModifications.addFeature(BiomeSelectors.tag(EBTags.BiomeT.SAGE_GENERATES_IN),
                GenerationStep.Decoration.VEGETAL_DECORATION, EBFeatureKeys.PlacedFeatures.PATCH_SAGE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_NETHER),
                GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatureKeys.PlacedFeatures.ORE_BRIMSTONE);
    }
}
