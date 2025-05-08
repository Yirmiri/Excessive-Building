package net.yirmiri.excessive_building;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;
import net.yirmiri.excessive_building.core.init.*;
import net.yirmiri.excessive_building.common.worldgen.EBPlacedFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.yirmiri.excessive_building.core.registry.*;

public class ExcessiveBuilding implements ModInitializer {
	public static final String MOD_ID = "excessive_building";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.COMMON, EBConfig.COMMON, "excessive_building-config.toml");

		EBBlocks.loadBlocks();
		EBRegistries.loadRegistries();
		EBCreativeTabs.loadItemGroups();
		EBBlockEntities.loadBlockEntities();
		EBParticles.loadParticles();
		EBItems.loadItems();
		EBPotions.loadPotions();
		EBDecoratedPotPatterns.loadPotteryPatterns();
		EBSounds.loadSounds();
		EBPacks.loadPacks();
		EBLootModifiers.replaceLoot();
		EBPlacedFeatures.addBiomeModifiers();
		EBTrades.loadTrades();
		EBPaintingVariants.loadEBPaintings();

		//Registries.BLOCK.addAlias(Identifier.of(MOD_ID, "old"), Registries.BLOCK.get(Identifier.of(MOD_ID, "new")));
	}

	//TODO
	//Life fruit obtaining method
	//New woodset
	//New stoneset (inspired by screwed up pallete)
	//Rewrite configurable blocks registry
	//Common features config - enables cobblestone bricks/stone brick variants etc
	//Additional plank blocks config - enables mosaics and chiseled planks
	//Multiple new blockset configs (sandstone, brimstone etc)
	//Overhaul paper blocks
	//Reaching lantern updates
	//Particle candle overhaul
	//Sea glass overhaul (pane only maybe?)
	//Old ancient color resource pack
	//Ancient tree gen
	//Port 1.21 features here
	//PORT TO MULTILOADER (last)
}