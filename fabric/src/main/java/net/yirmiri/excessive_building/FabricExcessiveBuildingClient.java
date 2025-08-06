package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

@Environment(EnvType.CLIENT)
public class FabricExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //TRANSLUCENT
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.AMETHYST_FRAMED_GLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.RADIANCE_FRAMED_GLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get(), RenderType.translucent());
    }
}
