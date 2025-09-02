package net.yirmiri.excessive_building;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.client.renderer.RenderType;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class ExcessiveBuildingClient {

    public static void clientinit() {
        //CUTOUT
        Services.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_leaves").get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_VINES.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_VINES_PLANT.get(), RenderType.cutout());

        //TRANSLUCENT
        Services.loadClient().registerBlockRenderType(EBBlocks.AMETHYST_FRAMED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(EBBlocks.RADIANCE_FRAMED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get(), RenderType.translucent());
    }
}
