package net.yirmiri.excessive_building.block.kiln.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.yirmiri.excessive_building.registry.EBBlocks;

public class KilnRecipe extends AbstractCookingRecipe {
    public KilnRecipe(String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(EBRecipeRegistries.KILN_RECIPE_TYPE, group, category, input, output, experience, cookTime);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(EBBlocks.KILN);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return EBRecipeRegistries.KILN_RECIPE_SERIALIZER;
    }
}
