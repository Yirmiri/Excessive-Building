package net.yirmiri.excessive_building.recipe;

import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.screen.KilnScreenHandler;

public class EBRecipeRegistry {
    public static RecipeType<KilnRecipe> KILN_RECIPE_TYPE = Registry.register(Registries.RECIPE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "kiln"), new RecipeType<KilnRecipe>() {
        @Override
        public String toString() {
            return "kiln";
        }
    });

    public static RecipeSerializer<KilnRecipe> KILN_RECIPE_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(ExcessiveBuilding.MOD_ID, "kiln"), new CookingRecipeSerializer<KilnRecipe>(KilnRecipe::new, 100));
    public static ScreenHandlerType<KilnScreenHandler> KILN_SCREEN_HANDLER = new ScreenHandlerType<KilnScreenHandler>(KilnScreenHandler::new, FeatureSet.empty());
}
