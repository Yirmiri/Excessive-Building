package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.yirmiri.excessive_building.particle.FallingLeafParticle;
import net.yirmiri.excessive_building.registry.EBBlockEntities;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBParticles;
import net.yirmiri.excessive_building.util.EBBlockSetTypes;

@Environment(EnvType.CLIENT)
public class ExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(EBBlockSetTypes.EBWoodTypes.ANCIENT, TexturedRenderLayers.getSignTextureId(EBBlockSetTypes.EBWoodTypes.ANCIENT));
        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(EBBlockSetTypes.EBWoodTypes.GLOOM, TexturedRenderLayers.getSignTextureId(EBBlockSetTypes.EBWoodTypes.GLOOM));

        BlockEntityRendererFactories.register(EBBlockEntities.EB_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(EBBlockEntities.EB_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

        //CUTOUT
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.POTTED_ANCIENT_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLOOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLOOM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.CHERRY_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.BAMBOO_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLOOM_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLASS_JAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLASS_JAR_OF_FIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLASS_JAR_OF_SOUL_FIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.GLOOM_SEEDS, RenderLayer.getCutout());

        //TRANSLUCENT
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.SEA_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.VERDANT_SEA_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ROSE_SEA_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.AQUA_SEA_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.SCARLET_SEA_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.FUCHSIA_SEA_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.SEA_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.VERDANT_SEA_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ROSE_SEA_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.AQUA_SEA_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.SCARLET_SEA_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.FUCHSIA_SEA_GLASS_PANE, RenderLayer.getTranslucent());

        //PARTICLE
        ParticleFactoryRegistry.getInstance().register(EBParticles.ANCIENT_PARTICLE, FallingLeafParticle.Factory::new);
    }
}
