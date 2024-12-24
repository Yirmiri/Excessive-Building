package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;

public class FabricExcessiveBuilding implements ModInitializer {
    
    @Override
    public void onInitialize() {
        //ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, EBConfig.COMMON, "excessive_building-config.toml");
        //ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.CLIENT, EBClientConfig.CLIENT, "excessive_building-config-client.toml");

        ExcessiveBuilding.init();
    }
}
