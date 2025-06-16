package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

//The code in this file is owned by Hecco.
//All rights are reserved by the original author.
//Explicit permission has been granted to Yirmiri for usage of this code in this software.

public class StonecutterRecipeTreeGenerator {
    public static List<Map.Entry<ItemLike, ItemLike>> SHADOW_RECIPES = new ArrayList<>();
    public static List<Map.Entry<ItemLike, ItemLike>> RECIPES = new ArrayList<>();
    private static final Map<Map.Entry<ItemLike, ItemLike>, Integer> ENTRY_TO_COUNT = new HashMap<>();

    public StonecutterRecipeTreeGenerator() {
    }

    public StonecutterRecipeTreeGenerator putShadowRecipe(ItemLike output, ItemLike input) {
        SHADOW_RECIPES.add(Map.entry(input, output));
        ENTRY_TO_COUNT.put(Map.entry(input, output), 1);
        return this;
    }
    public StonecutterRecipeTreeGenerator putShadowRecipe(ItemLike output, ItemLike input, int count) {
        SHADOW_RECIPES.add(Map.entry(input, output));
        ENTRY_TO_COUNT.put(Map.entry(input, output), count);
        return this;
    }
    public StonecutterRecipeTreeGenerator putRecipe(ItemLike output, ItemLike input) {
        RECIPES.add(Map.entry(input, output));
        ENTRY_TO_COUNT.put(Map.entry(input, output), 1);
        return this;
    }

    public StonecutterRecipeTreeGenerator putRecipe(ItemLike output, ItemLike input, int count) {
        RECIPES.add(Map.entry(input, output));
        ENTRY_TO_COUNT.put(Map.entry(input, output), count);
        return this;
    }

    public void generateRecipes(Consumer<FinishedRecipe> recipeOutput) {
        for (Map.Entry<ItemLike, ItemLike> entry : RECIPES) {
            FabricRecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, entry.getValue(), entry.getKey(), ENTRY_TO_COUNT.get(entry));
        }
        List<Map.Entry<ItemLike, ItemLike>> RECIPES = new ArrayList<>(Stream.concat(StonecutterRecipeTreeGenerator.RECIPES.stream(), SHADOW_RECIPES.stream()).toList());
        for (Map.Entry<ItemLike, ItemLike> entry : RECIPES) {
            if (RECIPES.contains(entry)) {
                for (Map.Entry<ItemLike, ItemLike> secondEntry : RECIPES) {
                    if (secondEntry.getValue() == entry.getKey()) {
                        FabricRecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, entry.getValue(), secondEntry.getKey(), ENTRY_TO_COUNT.get(entry));

                        for (Map.Entry<ItemLike, ItemLike> thirdEntry : RECIPES) {
                            if (thirdEntry.getValue() == secondEntry.getKey()) {
                                FabricRecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, entry.getValue(), thirdEntry.getKey(), ENTRY_TO_COUNT.get(entry));

                                for (Map.Entry<ItemLike, ItemLike> fourthEntry : RECIPES) {
                                    if (fourthEntry.getValue() == thirdEntry.getKey()) {
                                        FabricRecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, entry.getValue(), fourthEntry.getKey(), ENTRY_TO_COUNT.get(entry));

                                        for (Map.Entry<ItemLike, ItemLike> fifthEntry : RECIPES) {
                                            if (fifthEntry.getValue() == fourthEntry.getKey()) {
                                                FabricRecipeProvider.stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, entry.getValue(), fifthEntry.getKey(), ENTRY_TO_COUNT.get(entry));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
