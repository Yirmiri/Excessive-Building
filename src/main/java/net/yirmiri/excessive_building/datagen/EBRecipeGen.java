package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBRecipeGen extends FabricRecipeProvider {
    public EBRecipeGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OAK_MOSAIC, 1)
                .input('#', Items.OAK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.OAK_SLAB), conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OAK_MOSAIC)));

        createStairsRecipe(EBBlocks.OAK_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.OAK_MOSAIC))
                .criterion(hasItem(EBBlocks.OAK_MOSAIC), conditionsFromItem(EBBlocks.OAK_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OAK_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OAK_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.OAK_MOSAIC))
                .criterion(hasItem(EBBlocks.OAK_MOSAIC), conditionsFromItem(EBBlocks.OAK_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OAK_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.OAK_MOSAIC))
                .criterion(hasItem(EBBlocks.OAK_MOSAIC), conditionsFromItem(EBBlocks.OAK_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS)));

        createVerticalStairsRecipe(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.BAMBOO_MOSAIC))
                .criterion(hasItem(Blocks.BAMBOO_MOSAIC), conditionsFromItem(Blocks.BAMBOO_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS)));
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SPRUCE_MOSAIC, 1)
                .input('#', Items.SPRUCE_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.SPRUCE_SLAB), conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_MOSAIC)));

        createStairsRecipe(EBBlocks.SPRUCE_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.SPRUCE_MOSAIC))
                .criterion(hasItem(EBBlocks.SPRUCE_MOSAIC), conditionsFromItem(EBBlocks.SPRUCE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SPRUCE_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.SPRUCE_MOSAIC))
                .criterion(hasItem(EBBlocks.SPRUCE_MOSAIC), conditionsFromItem(EBBlocks.SPRUCE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SPRUCE_MOSAIC))
                .criterion(hasItem(EBBlocks.SPRUCE_MOSAIC), conditionsFromItem(EBBlocks.SPRUCE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BIRCH_MOSAIC, 1)
                .input('#', Items.BIRCH_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.BIRCH_SLAB), conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_MOSAIC)));

        createStairsRecipe(EBBlocks.BIRCH_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.BIRCH_MOSAIC))
                .criterion(hasItem(EBBlocks.BIRCH_MOSAIC), conditionsFromItem(EBBlocks.BIRCH_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BIRCH_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.BIRCH_MOSAIC))
                .criterion(hasItem(EBBlocks.BIRCH_MOSAIC), conditionsFromItem(EBBlocks.BIRCH_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.BIRCH_MOSAIC))
                .criterion(hasItem(EBBlocks.BIRCH_MOSAIC), conditionsFromItem(EBBlocks.BIRCH_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.JUNGLE_MOSAIC, 1)
                .input('#', Items.JUNGLE_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.JUNGLE_SLAB), conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_MOSAIC)));

        createStairsRecipe(EBBlocks.JUNGLE_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.JUNGLE_MOSAIC))
                .criterion(hasItem(EBBlocks.JUNGLE_MOSAIC), conditionsFromItem(EBBlocks.JUNGLE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.JUNGLE_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.JUNGLE_MOSAIC))
                .criterion(hasItem(EBBlocks.JUNGLE_MOSAIC), conditionsFromItem(EBBlocks.JUNGLE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.JUNGLE_MOSAIC))
                .criterion(hasItem(EBBlocks.JUNGLE_MOSAIC), conditionsFromItem(EBBlocks.JUNGLE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ACACIA_MOSAIC, 1)
                .input('#', Items.ACACIA_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.ACACIA_SLAB), conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_MOSAIC)));

        createStairsRecipe(EBBlocks.ACACIA_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.ACACIA_MOSAIC))
                .criterion(hasItem(EBBlocks.ACACIA_MOSAIC), conditionsFromItem(EBBlocks.ACACIA_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ACACIA_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.ACACIA_MOSAIC))
                .criterion(hasItem(EBBlocks.ACACIA_MOSAIC), conditionsFromItem(EBBlocks.ACACIA_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.ACACIA_MOSAIC))
                .criterion(hasItem(EBBlocks.ACACIA_MOSAIC), conditionsFromItem(EBBlocks.ACACIA_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_OAK_MOSAIC, 1)
                .input('#', Items.DARK_OAK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.DARK_OAK_SLAB), conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_MOSAIC)));

        createStairsRecipe(EBBlocks.DARK_OAK_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.DARK_OAK_MOSAIC))
                .criterion(hasItem(EBBlocks.DARK_OAK_MOSAIC), conditionsFromItem(EBBlocks.DARK_OAK_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_OAK_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.DARK_OAK_MOSAIC))
                .criterion(hasItem(EBBlocks.DARK_OAK_MOSAIC), conditionsFromItem(EBBlocks.DARK_OAK_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.DARK_OAK_MOSAIC))
                .criterion(hasItem(EBBlocks.DARK_OAK_MOSAIC), conditionsFromItem(EBBlocks.DARK_OAK_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MANGROVE_MOSAIC, 1)
                .input('#', Items.MANGROVE_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.MANGROVE_SLAB), conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_MOSAIC)));

        createStairsRecipe(EBBlocks.MANGROVE_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.MANGROVE_MOSAIC))
                .criterion(hasItem(EBBlocks.MANGROVE_MOSAIC), conditionsFromItem(EBBlocks.MANGROVE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MANGROVE_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.MANGROVE_MOSAIC))
                .criterion(hasItem(EBBlocks.MANGROVE_MOSAIC), conditionsFromItem(EBBlocks.MANGROVE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.MANGROVE_MOSAIC))
                .criterion(hasItem(EBBlocks.MANGROVE_MOSAIC), conditionsFromItem(EBBlocks.MANGROVE_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHERRY_MOSAIC, 1)
                .input('#', Items.CHERRY_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.CHERRY_SLAB), conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_MOSAIC)));

        createStairsRecipe(EBBlocks.CHERRY_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.CHERRY_MOSAIC))
                .criterion(hasItem(EBBlocks.CHERRY_MOSAIC), conditionsFromItem(EBBlocks.CHERRY_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHERRY_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.CHERRY_MOSAIC))
                .criterion(hasItem(EBBlocks.CHERRY_MOSAIC), conditionsFromItem(EBBlocks.CHERRY_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.CHERRY_MOSAIC))
                .criterion(hasItem(EBBlocks.CHERRY_MOSAIC), conditionsFromItem(EBBlocks.CHERRY_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRIMSON_MOSAIC, 1)
                .input('#', Items.CRIMSON_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.CRIMSON_SLAB), conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_MOSAIC)));

        createStairsRecipe(EBBlocks.CRIMSON_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.CRIMSON_MOSAIC))
                .criterion(hasItem(EBBlocks.CRIMSON_MOSAIC), conditionsFromItem(EBBlocks.CRIMSON_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRIMSON_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.CRIMSON_MOSAIC))
                .criterion(hasItem(EBBlocks.CRIMSON_MOSAIC), conditionsFromItem(EBBlocks.CRIMSON_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.CRIMSON_MOSAIC))
                .criterion(hasItem(EBBlocks.CRIMSON_MOSAIC), conditionsFromItem(EBBlocks.CRIMSON_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WARPED_MOSAIC, 1)
                .input('#', Items.WARPED_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Items.WARPED_SLAB), conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_MOSAIC)));

        createStairsRecipe(EBBlocks.WARPED_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.WARPED_MOSAIC))
                .criterion(hasItem(EBBlocks.WARPED_MOSAIC), conditionsFromItem(EBBlocks.WARPED_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WARPED_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.WARPED_MOSAIC))
                .criterion(hasItem(EBBlocks.WARPED_MOSAIC), conditionsFromItem(EBBlocks.WARPED_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.WARPED_MOSAIC))
                .criterion(hasItem(EBBlocks.WARPED_MOSAIC), conditionsFromItem(EBBlocks.WARPED_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS)));
    }

    public static CraftingRecipeJsonBuilder createVerticalStairsRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("###")
                .pattern("## ")
                .pattern("#  ");
    }
}
