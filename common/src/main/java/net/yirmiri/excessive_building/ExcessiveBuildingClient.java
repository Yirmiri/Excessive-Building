package net.yirmiri.excessive_building;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.client.renderer.RenderType;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class ExcessiveBuildingClient {
    public static void init() {
        //CUTOUT
        RLServices.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_LEAVES.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_VINES.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_VINES_PLANT.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.ANCIENT_SAPLING.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.POTTED_ANCIENT_SAPLING.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.LAVENDER.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.POTTED_LAVENDER.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.SAGE.get(), RenderType.cutout());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.POTTED_SAGE.get(), RenderType.cutout());

        //TRANSLUCENT
        RLServices.loadClient().registerBlockRenderType(EBBlocks.AMETHYST_FRAMED_GLASS.get(), RenderType.translucent());
        RLServices.loadClient().registerBlockRenderType(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), RenderType.translucent());

        //SIGN
        //Sheets.SIGN_MATERIALS.put(EBRegistries.ANCIENT, new Material(Sheets.SIGN_SHEET, ResourceLocation.withDefaultNamespace("entity/signs/ancient")));
        //Sheets.HANGING_SIGN_MATERIALS.put(EBRegistries.ANCIENT, new Material(Sheets.SIGN_SHEET, ResourceLocation.withDefaultNamespace("entity/signs/hanging/ancient")));
    }
}
