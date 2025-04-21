package net.yirmiri.excessive_building;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;
import net.yirmiri.excessive_building.init.*;
import net.yirmiri.excessive_building.worldgen.EBPlacedFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.yirmiri.excessive_building.registry.*;

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
}