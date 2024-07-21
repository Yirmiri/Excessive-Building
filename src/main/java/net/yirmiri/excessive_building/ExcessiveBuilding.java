package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;

import net.yirmiri.excessive_building.registry.*;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import net.yirmiri.excessive_building.util.EBLootModifiers;
import net.yirmiri.excessive_building.util.EBRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding implements ModInitializer {
	public static final String MOD_ID = "excessive_building";
	public static final String MOD_NAME = "Excessive Building";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		EBBlocks.registerEBBlocks();
		EBRegistries.registerRegistries();
		EBItemGroups.registerEBItemGroups();
		EBBlockEntities.registerEBBlockEntities();
		EBParticles.registerEBParticles();
		EBItems.registerEBItems();
		EBStatusEffects.registerEBEffects();
		EBPotions.registerEBPotions();
		EBDecoratedPotPatterns.registerEBPotPatterns();
		EBSounds.registerEBSounds();
		EBPacks.registerPacks();
		EBLootModifiers.modifyLoot();
	}
}