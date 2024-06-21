package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.yirmiri.excessive_building.screen.KilnScreen;

@Environment(EnvType.CLIENT)
public class ExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ExcessiveBuilding.KILN_SCREEN_HANDLER, KilnScreen::new);
    }
}
