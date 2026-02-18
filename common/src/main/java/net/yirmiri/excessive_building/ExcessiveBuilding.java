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
        EBPotions.load();
        EBFamilyTypes.load();
    }
}//make integration cleaner (delicate recipe)
//remove reach from gauntlet
//fix effects
//fix potions
//fix signs
//fix wood types