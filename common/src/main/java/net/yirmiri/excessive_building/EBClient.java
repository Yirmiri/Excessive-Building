package net.yirmiri.excessive_building;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.client.renderer.RenderType;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class EBClient {
    public static void init() {
        //CUTOUT
        RLServices.loadClient().registerBlockRenderType(EBBlocks.LAVENDER.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.POTTED_LAVENDER.get(), RenderType.cutout());
    }
}
