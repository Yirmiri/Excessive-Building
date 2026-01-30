package net.yirmiri.excessive_building;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.yirmiri.excessive_building.common.util.EBRegistries;
import net.yirmiri.excessive_building.registry.EBNeoForgeLootModifiers;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {

    public NeoForgeExcessiveBuilding(IEventBus eventBus) {
        ExcessiveBuilding.init();
        EBNeoForgeLootModifiers.LOOT_MODIFIERS.register(eventBus);

        eventBus.addListener(this::commonSetup);
    }

    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(EBRegistries::load);
    }
}