package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.packs.PackType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.yirmiri.excessive_building.common.util.BlockTransmutation;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.init.EBFeatures;
import net.yirmiri.excessive_building.core.registry.EBRegistries;
import net.yirmiri.excessive_building.util.FabricBlockTransmutation;

public class FabricExcessiveBuilding implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ExcessiveBuilding.init();
        EBRegistries.loadRegistries();

        //BIOME MODIFIERS
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.LUSH_CAVES), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_CHLOROSLATE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_JUNGLE), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_CHLOROSLATE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_OVERWORLD), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_HECTALITE);

        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BADLANDS), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_ARIDITE);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.HAS_RUINED_PORTAL_DESERT), GenerationStep.Decoration.UNDERGROUND_ORES, EBFeatures.PlacedFeatures.ORE_ARIDITE);

        ResourceManagerHelper.get(PackType.SERVER_DATA).registerReloadListener(new FabricBlockTransmutation());

        UseBlockCallback.EVENT.register((player, level, hand, hitResult) -> {
            if (!level.isClientSide()) {
                ItemStack stack = player.getItemInHand(hand);
                BlockPos pos = hitResult.getBlockPos();

                BlockTransmutation.TransmutationRule rule = BlockTransmutation.getResult(level.getBlockState(pos).getBlock(), stack.getItem());
                if (rule != null) {
                    BlockState originalState = level.getBlockState(pos);
                    BlockState newState = rule.resultBlock().defaultBlockState();
                    BlockState newStateWithProperties = EBUtil.copyBlockProperties(originalState, newState);

                    level.setBlock(pos, newStateWithProperties, 3);

                    if (rule.soundEvent() != null) {
                        level.playSound(null, pos, BuiltInRegistries.SOUND_EVENT.get(rule.soundEvent()), SoundSource.BLOCKS, 1.0F, 1.0F);
                    }

                    if (!player.isCreative()) {
                        if (stack.isDamageableItem()) {
                            stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
                        } else {
                            stack.shrink(1);
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            }
            return InteractionResult.PASS;
        });
    }
}
