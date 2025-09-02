package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class FabricExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcessiveBuildingClient.clientinit();
    }
}
