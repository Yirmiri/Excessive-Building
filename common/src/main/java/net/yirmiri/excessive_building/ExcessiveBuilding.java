package net.yirmiri.excessive_building;

import net.yirmiri.excessive_building.common.util.EBFamilyTypes;
import net.yirmiri.excessive_building.core.registry.*;
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
        EBEffects.load();
        EBFamilyTypes.load();
        EBPlacers.load();
    }
}