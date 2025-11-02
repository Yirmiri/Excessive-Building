package net.yirmiri.excessive_building;

import net.yirmiri.excessive_building.core.registry.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding {
    public static final String MOD_ID = "excessive_building";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        EBBlocks.loadBlocks();
        EBItems.loadItems();
        EBBlockEntities.loadBlockEntities();
        EBCreativeTabs.loadCreativeTabs();
        EBParticles.loadParticles();
        EBPotions.loadPotions();
        EBEffects.loadEffects();
        EBEntities.loadEntities();
    }
}

//TODO 4.1
//Almentra
//Marble/Marquina Marble
//Frosted Lanterns

//TODO 1.21.1+
//Ancient tree particle
//Potion of reaching (1.21.1)