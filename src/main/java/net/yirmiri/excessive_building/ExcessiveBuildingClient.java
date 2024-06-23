package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.yirmiri.excessive_building.registry.EBBlockEntities;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.util.EBBlockSetTypes;

@Environment(EnvType.CLIENT)
public class ExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(EBBlockSetTypes.EBWoodTypes.ANCIENT, TexturedRenderLayers.getSignTextureId(EBBlockSetTypes.EBWoodTypes.ANCIENT));

        BlockEntityRendererFactories.register(EBBlockEntities.EB_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(EBBlockEntities.EB_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

        //CUTOUT
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.ANCIENT_TRAPDOOR, RenderLayer.getCutout());
    }
}
