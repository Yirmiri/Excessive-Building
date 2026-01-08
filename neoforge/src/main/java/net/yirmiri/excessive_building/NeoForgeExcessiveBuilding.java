package net.yirmiri.excessive_building;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {

    public NeoForgeExcessiveBuilding(IEventBus eventBus) {
        ExcessiveBuilding.init();

        eventBus.addListener(this::clientSetup);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        EBClient.init();
    }
}