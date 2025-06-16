package net.yirmiri.excessive_building;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

@Mod(ExcessiveBuilding.MOD_ID)
public class ForgeExcessiveBuilding {
    public ForgeExcessiveBuilding() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ExcessiveBuilding.init();

        eventBus.addListener(this::clientSetup);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        //TRANSLUCENT
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.AMETHYST_FRAMED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), RenderType.translucent());
    }
}