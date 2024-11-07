package net.yirmiri.excessive_building.platform;

import net.yirmiri.excessive_building.EBForgeConfig;
import net.yirmiri.excessive_building.platform.services.ConfigHelper;

public class ForgeConfigHelper implements ConfigHelper {
    @Override
    public boolean enableCustomTooltips() {
        return EBForgeConfig.ENABLE_CUSTOM_TOOLTIPS.get();
    }

    @Override
    public boolean enableDecorativeShelves() {
        return EBForgeConfig.ENABLE_DECORATIVE_SHELVES.get();
    }
}
