package net.yirmiri.excessive_building;

import net.yirmiri.excessive_building.common.util.EBRegistries;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBCreativeTabs;
import net.yirmiri.excessive_building.core.registry.EBItems;
import net.yirmiri.excessive_building.core.registry.EBParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding {
    public static final String MOD_ID = "excessive_building";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        EBParticles.load();
        EBBlocks.load();
        EBItems.load();
        EBCreativeTabs.load();
    }
}//todo make integration cleaner (delicate recipe)