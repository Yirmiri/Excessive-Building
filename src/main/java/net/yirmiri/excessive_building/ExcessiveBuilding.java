package net.yirmiri.excessive_building;

import net.fabricmc.api.ModInitializer;

import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.recipe.KilnRecipe;
import net.yirmiri.excessive_building.registry.EBBlockEntities;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItemGroups;
import net.yirmiri.excessive_building.screen.KilnScreenHandler;
import net.yirmiri.excessive_building.util.EBRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcessiveBuilding implements ModInitializer {
	public static final String MOD_ID = "excessive_building";
	public static final String MOD_NAME = "Excessive Building";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static ScreenHandlerType<KilnScreenHandler> KILN_SCREEN_HANDLER;
	public static RecipeSerializer<KilnRecipe> KILN_RECIPE_SERIALIZER;
	public static RecipeType<KilnRecipe> KILN_RECIPE_TYPE;

	@Override
	public void onInitialize() {
		EBBlocks.registerEBBlocks();
		EBRegistries.registerRegistries();
		EBItemGroups.registerEBItemGroups();
		EBBlockEntities.registerEBBlockEntities();

		KILN_SCREEN_HANDLER = new ScreenHandlerType<KilnScreenHandler>(KilnScreenHandler::new, FeatureSet.empty());
		Registry.register(Registries.SCREEN_HANDLER, Identifier.of(ExcessiveBuilding.MOD_ID, "kiln"), KILN_SCREEN_HANDLER);

		KILN_RECIPE_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(ExcessiveBuilding.MOD_ID, "kiln"), new CookingRecipeSerializer<>(KilnRecipe::new, 100));
		KILN_RECIPE_TYPE = Registry.register(Registries.RECIPE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "kiln"), new RecipeType<KilnRecipe>() {
			@Override
			public String toString() {
				return ExcessiveBuilding.MOD_ID + "kiln";
			}
		});
	}
}