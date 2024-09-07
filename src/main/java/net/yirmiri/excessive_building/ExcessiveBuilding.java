package net.yirmiri.excessive_building;

import fuzs.forgeconfigapiport.fabric.api.forge.v4.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;
import net.yirmiri.excessive_building.worldgen.EBPlacedFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.yirmiri.excessive_building.registry.*;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import net.yirmiri.excessive_building.util.EBLootModifiers;
import net.yirmiri.excessive_building.util.EBRegistries;

public class ExcessiveBuilding implements ModInitializer {
	public static final String MOD_ID = "excessive_building";
	public static final String MOD_NAME = "Excessive Building";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, EBConfig.COMMON, "excessive_building-config.toml");

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
	}
}