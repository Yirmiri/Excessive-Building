package net.yirmiri.excessive_building;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {

    public NeoForgeExcessiveBuilding(IEventBus eventBus) {
        ExcessiveBuilding.init();
    }
}