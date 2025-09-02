package net.yirmiri.excessive_building;

import net.minecraft.resources.ResourceLocation;
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
        EBRegistries.loadRegistries();
        EBParticles.loadParticles();
    }

    public static ResourceLocation modid(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}

//TODO::: Ancient Tree Leaf Particle | Ancient Signs | Ancient Tree from Sniffer | Ancient Fruit from Leaves | Potion of Reaching(?) | Better Ancient tree gen