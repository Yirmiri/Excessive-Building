package net.yirmiri.excessive_building;

import fuzs.forgeconfigapiport.fabric.api.forge.v4.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ModConfig;
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