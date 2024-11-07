package net.yirmiri.excessive_building.platform;

import net.yirmiri.excessive_building.platform.services.ConfigHelper;

public class FabricConfigHelper implements ConfigHelper {

    @Override
    public boolean enableCustomTooltips() {
        return false;
    }

    @Override
    public boolean enableDecorativeShelves() {
        return false;
    }
}
