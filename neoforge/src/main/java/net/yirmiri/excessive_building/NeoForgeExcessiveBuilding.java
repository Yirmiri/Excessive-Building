package net.yirmiri.excessive_building;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.yirmiri.excessive_building.platform.NeoForgeEBRegistryHelper;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {
    public NeoForgeExcessiveBuilding(IEventBus eventBus) {
        ExcessiveBuilding.init();

        NeoForgeEBRegistryHelper.ITEMS.register(eventBus);
        NeoForgeEBRegistryHelper.BLOCKS.register(eventBus);
    }
}