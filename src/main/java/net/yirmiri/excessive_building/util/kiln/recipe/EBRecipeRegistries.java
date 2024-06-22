package net.yirmiri.excessive_building.util.kiln.recipe;

import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.util.kiln.screen.KilnScreenHandler;

public class EBRecipeRegistries {

    public static ScreenHandlerType<KilnScreenHandler> KILN_SCREEN_HANDLER;
    public static RecipeSerializer<KilnRecipe> KILN_RECIPE_SERIALIZER;
    public static RecipeType<KilnRecipe> KILN_RECIPE_TYPE;

    public static void registerEBRecipeRegistries() {
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
