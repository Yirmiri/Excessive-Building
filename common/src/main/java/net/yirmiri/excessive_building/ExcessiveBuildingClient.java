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
        Services.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_SAPLING.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.POTTED_ANCIENT_SAPLING.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.PRISMARINE_CLUSTER.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.MEDIUM_PRISMARINE_BUD.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.SMALL_PRISMARINE_BUD.get(), RenderType.cutout());
        Services.loadClient().registerBlockRenderType(EBBlocks.LARGE_PRISMARINE_BUD.get(), RenderType.cutout());

        //TRANSLUCENT
        Services.loadClient().registerBlockRenderType(EBBlocks.AMETHYST_FRAMED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(EBBlocks.RADIANCE_FRAMED_GLASS.get(), RenderType.translucent());
        Services.loadClient().registerBlockRenderType(EBBlocks.RADIANCE_FRAMED_GLASS_PANE.get(), RenderType.translucent());
    }
}
