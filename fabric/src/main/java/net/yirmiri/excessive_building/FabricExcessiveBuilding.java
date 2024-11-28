package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;

public class FabricExcessiveBuilding implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        ExcessiveBuilding.LOGGER.info("Hello Fabric world!");
        ExcessiveBuilding.init();
    }
}
