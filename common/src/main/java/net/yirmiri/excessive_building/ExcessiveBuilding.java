package net.yirmiri.excessive_building;

import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.registry.*;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import net.yirmiri.excessive_building.util.EBLootModifiers;
import net.yirmiri.excessive_building.util.EBRegistries;
import net.yirmiri.excessive_building.util.EBStats;
import net.yirmiri.excessive_building.worldgen.EBPlacedFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding {
    public static final String MOD_ID = "excessive_building";
    public static final String MOD_NAME = "Excessive Building";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        EBBlocks.loadBlocks();
        EBRegistries.loadRegistries();
        EBItemGroups.loadItemGroups();
        EBBlockEntities.loadBlockEntities();
        EBParticles.loadParticles();
        EBItems.loadItems();
        EBStatusEffects.loadEffects();
        EBPotions.loadPotions();
        EBDecoratedPotPatterns.loadPotteryPatterns();
        EBSounds.loadSounds();
        EBPacks.loadPacks();
        EBLootModifiers.modifyLoot();
        EBPlacedFeatures.addBiomeModifiers();
        EBTrades.loadTrades();
        EBStats.loadStats();
    }

    public static ResourceLocation modid(String id) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
    }
}