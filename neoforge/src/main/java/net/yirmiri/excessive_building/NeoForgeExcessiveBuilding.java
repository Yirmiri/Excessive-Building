package net.yirmiri.excessive_building;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {

    public NeoForgeExcessiveBuilding(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        ExcessiveBuilding.LOGGER.info("Hello NeoForge world!");
        ExcessiveBuilding.init();

    }
}