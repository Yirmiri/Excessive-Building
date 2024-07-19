package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.concurrent.CompletableFuture;

public class EBRecipeGen extends FabricRecipeProvider {
    public EBRecipeGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createTwoByTwoRecipe(EBBlocks.CHISELED_OAK_PLANKS, 2,
                Ingredient.ofItems(Blocks.OAK_SLAB))
                .criterion(hasItem(Blocks.OAK_SLAB), conditionsFromItem(Blocks.OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_OAK_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_SPRUCE_PLANKS, 2,
                Ingredient.ofItems(Blocks.SPRUCE_SLAB))
                .criterion(hasItem(Blocks.SPRUCE_SLAB), conditionsFromItem(Blocks.SPRUCE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_SPRUCE_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_BIRCH_PLANKS, 2,
                Ingredient.ofItems(Blocks.BIRCH_SLAB))
                .criterion(hasItem(Blocks.BIRCH_SLAB), conditionsFromItem(Blocks.BIRCH_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_BIRCH_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_JUNGLE_PLANKS, 2,
                Ingredient.ofItems(Blocks.JUNGLE_SLAB))
                .criterion(hasItem(Blocks.JUNGLE_SLAB), conditionsFromItem(Blocks.JUNGLE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_JUNGLE_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_ACACIA_PLANKS, 2,
                Ingredient.ofItems(Blocks.ACACIA_SLAB))
                .criterion(hasItem(Blocks.ACACIA_SLAB), conditionsFromItem(Blocks.ACACIA_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_ACACIA_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_DARK_OAK_PLANKS, 2,
                Ingredient.ofItems(Blocks.DARK_OAK_SLAB))
                .criterion(hasItem(Blocks.DARK_OAK_SLAB), conditionsFromItem(Blocks.DARK_OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_DARK_OAK_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_MANGROVE_PLANKS, 2,
                Ingredient.ofItems(Blocks.MANGROVE_SLAB))
                .criterion(hasItem(Blocks.MANGROVE_SLAB), conditionsFromItem(Blocks.MANGROVE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_MANGROVE_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_CHERRY_PLANKS, 2,
                Ingredient.ofItems(Blocks.CHERRY_SLAB))
                .criterion(hasItem(Blocks.CHERRY_SLAB), conditionsFromItem(Blocks.CHERRY_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_CHERRY_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_BAMBOO_PLANKS, 2,
                Ingredient.ofItems(Blocks.BAMBOO_SLAB))
                .criterion(hasItem(Blocks.BAMBOO_SLAB), conditionsFromItem(Blocks.BAMBOO_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_BAMBOO_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_CRIMSON_PLANKS, 2,
                Ingredient.ofItems(Blocks.CRIMSON_SLAB))
                .criterion(hasItem(Blocks.CRIMSON_SLAB), conditionsFromItem(Blocks.CRIMSON_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_CRIMSON_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_WARPED_PLANKS, 2,
                Ingredient.ofItems(Blocks.WARPED_SLAB))
                .criterion(hasItem(Blocks.WARPED_SLAB), conditionsFromItem(Blocks.WARPED_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_WARPED_PLANKS)));
        
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

        createFourForFourWendysMealRecipe(EBBlocks.COBBLESTONE_BRICKS,
                Ingredient.ofItems(Blocks.COBBLESTONE))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLESTONE_BRICKS)));

        createStairsRecipe(EBBlocks.COBBLESTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.COBBLESTONE_BRICKS))
                .criterion(hasItem(EBBlocks.COBBLESTONE_BRICKS), conditionsFromItem(EBBlocks.COBBLESTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLESTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.COBBLESTONE_BRICKS))
                .criterion(hasItem(EBBlocks.COBBLESTONE_BRICKS), conditionsFromItem(EBBlocks.COBBLESTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLESTONE_BRICK_SLAB)));
        
        offerCrackingRecipe(exporter, EBBlocks.CRACKED_COBBLESTONE_BRICKS, EBBlocks.COBBLESTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_STAIRS, EBBlocks.COBBLESTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_SLAB, EBBlocks.COBBLESTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLESTONE_BRICKS, 1);

        createFourForFourWendysMealRecipe(EBBlocks.MOSSY_COBBLESTONE_BRICKS,
                Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICKS)));

        createStairsRecipe(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .criterion(hasItem(EBBlocks.MOSSY_COBBLESTONE_BRICKS), conditionsFromItem(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .criterion(hasItem(EBBlocks.MOSSY_COBBLESTONE_BRICKS), conditionsFromItem(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1);

        createFourForFourWendysMealRecipe(EBBlocks.COBBLED_DEEPSLATE_BRICKS,
                Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE))
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICKS)));

        createStairsRecipe(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .criterion(hasItem(EBBlocks.COBBLED_DEEPSLATE_BRICKS), conditionsFromItem(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .criterion(hasItem(EBBlocks.COBBLED_DEEPSLATE_BRICKS), conditionsFromItem(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB)));

        offerCrackingRecipe(exporter, EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS, EBBlocks.COBBLED_DEEPSLATE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 1);

        createFourForFourWendysMealRecipe(EBBlocks.BLACKSTONE_BRICKS,
                Ingredient.ofItems(Blocks.BLACKSTONE))
                .criterion(hasItem(Blocks.BLACKSTONE), conditionsFromItem(Blocks.BLACKSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BLACKSTONE_BRICKS)));

        createStairsRecipe(EBBlocks.BLACKSTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.BLACKSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.BLACKSTONE_BRICKS), conditionsFromItem(EBBlocks.BLACKSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BLACKSTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.BLACKSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.BLACKSTONE_BRICKS), conditionsFromItem(EBBlocks.BLACKSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BLACKSTONE_BRICK_SLAB)));

        offerCrackingRecipe(exporter, EBBlocks.CRACKED_BLACKSTONE_BRICKS, EBBlocks.BLACKSTONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICKS, Blocks.BLACKSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_STAIRS, EBBlocks.BLACKSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_SLAB, EBBlocks.BLACKSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BLACKSTONE_BRICKS, 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_MOSAIC, 1)
                .input('#', EBBlocks.ANCIENT_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.ANCIENT_SLAB), conditionsFromItem(EBBlocks.ANCIENT_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_MOSAIC)));

        createStairsRecipe(EBBlocks.ANCIENT_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.ANCIENT_MOSAIC))
                .criterion(hasItem(EBBlocks.ANCIENT_MOSAIC), conditionsFromItem(EBBlocks.ANCIENT_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.ANCIENT_MOSAIC))
                .criterion(hasItem(EBBlocks.ANCIENT_MOSAIC), conditionsFromItem(EBBlocks.ANCIENT_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.ANCIENT_MOSAIC))
                .criterion(hasItem(EBBlocks.ANCIENT_MOSAIC), conditionsFromItem(EBBlocks.ANCIENT_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_PLANKS, 4)
                .input(EBTags.Items.ANCIENT_LOGS)
                .criterion(hasItem(EBBlocks.ANCIENT_LOG), conditionsFromItem(EBBlocks.ANCIENT_LOG))
                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.ANCIENT_PLANKS))));

        createStairsRecipe(EBBlocks.ANCIENT_STAIRS,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_SLAB,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANCIENT_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_VERTICAL_STAIRS)));

        createFenceRecipe(EBBlocks.ANCIENT_FENCE,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_FENCE)));

        createFenceGateRecipe(EBBlocks.ANCIENT_FENCE_GATE,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_FENCE_GATE)));

        createDoorRecipe(EBBlocks.ANCIENT_DOOR,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_DOOR)));

        createTrapdoorRecipe(EBBlocks.ANCIENT_TRAPDOOR,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.ANCIENT_PRESSURE_PLATE, 1)
                .input('#', EBBlocks.ANCIENT_PLANKS)
                .pattern("##")
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.ANCIENT_BUTTON, 1)
                .input(EBBlocks.ANCIENT_PLANKS)
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_BUTTON)));

        createSignRecipe(EBItems.ANCIENT_SIGN,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBItems.ANCIENT_SIGN)));

        offerHangingSignRecipe(exporter, EBItems.ANCIENT_HANGING_SIGN, EBBlocks.STRIPPED_ANCIENT_LOG);

        createTwoByTwoRecipe(EBBlocks.CHISELED_ANCIENT_PLANKS, 2,
                Ingredient.ofItems(EBBlocks.ANCIENT_SLAB))
                .criterion(hasItem(EBBlocks.ANCIENT_SLAB), conditionsFromItem(EBBlocks.ANCIENT_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_ANCIENT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_MOSAIC, 1)
                .input('#', EBBlocks.GLOOM_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.GLOOM_SLAB), conditionsFromItem(EBBlocks.GLOOM_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_MOSAIC)));

        createStairsRecipe(EBBlocks.GLOOM_MOSAIC_STAIRS,
                Ingredient.ofItems(EBBlocks.GLOOM_MOSAIC))
                .criterion(hasItem(EBBlocks.GLOOM_MOSAIC), conditionsFromItem(EBBlocks.GLOOM_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_MOSAIC_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_MOSAIC_SLAB,
                Ingredient.ofItems(EBBlocks.GLOOM_MOSAIC))
                .criterion(hasItem(EBBlocks.GLOOM_MOSAIC), conditionsFromItem(EBBlocks.GLOOM_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.GLOOM_MOSAIC))
                .criterion(hasItem(EBBlocks.GLOOM_MOSAIC), conditionsFromItem(EBBlocks.GLOOM_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_PLANKS, 4)
                .input(EBTags.Items.GLOOM_LOGS)
                .criterion(hasItem(EBBlocks.GLOOM_LOG), conditionsFromItem(EBBlocks.GLOOM_LOG))
                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.GLOOM_PLANKS))));

        createStairsRecipe(EBBlocks.GLOOM_STAIRS,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_SLAB,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GLOOM_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_VERTICAL_STAIRS)));

        createFenceRecipe(EBBlocks.GLOOM_FENCE,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_FENCE)));

        createFenceGateRecipe(EBBlocks.GLOOM_FENCE_GATE,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_FENCE_GATE)));

        createDoorRecipe(EBBlocks.GLOOM_DOOR,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_DOOR)));

        createTrapdoorRecipe(EBBlocks.GLOOM_TRAPDOOR,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.GLOOM_PRESSURE_PLATE, 1)
                .input('#', EBBlocks.GLOOM_PLANKS)
                .pattern("##")
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.GLOOM_BUTTON, 1)
                .input(EBBlocks.GLOOM_PLANKS)
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_BUTTON)));

        createSignRecipe(EBItems.GLOOM_SIGN,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBItems.GLOOM_SIGN)));

        offerHangingSignRecipe(exporter, EBItems.GLOOM_HANGING_SIGN, EBBlocks.STRIPPED_GLOOM_LOG);

        createTwoByTwoRecipe(EBBlocks.CHISELED_GLOOM_PLANKS, 2,
                Ingredient.ofItems(EBBlocks.GLOOM_SLAB))
                .criterion(hasItem(EBBlocks.GLOOM_SLAB), conditionsFromItem(EBBlocks.GLOOM_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_GLOOM_PLANKS)));

        createFourForFourWendysMealRecipe(EBBlocks.COPPER_BRICKS,
                Ingredient.ofItems(EBBlocks.COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.COPPER_BLOCK)
                .pattern("##")
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COPPER_PRESSURE_PLATE)));
        
        createFourForFourWendysMealRecipe(EBBlocks.EXPOSED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.EXPOSED_COPPER))
                .criterion(hasItem(Blocks.EXPOSED_COPPER), conditionsFromItem(Blocks.EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.EXPOSED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.EXPOSED_COPPER_BRICKS), conditionsFromItem(EBBlocks.EXPOSED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.EXPOSED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.EXPOSED_COPPER_BRICKS), conditionsFromItem(EBBlocks.EXPOSED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.EXPOSED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.EXPOSED_COPPER_BRICKS), conditionsFromItem(EBBlocks.EXPOSED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.EXPOSED_COPPER)
                .pattern("##")
                .criterion(hasItem(Blocks.EXPOSED_COPPER), conditionsFromItem(Blocks.EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE)));
        
        createFourForFourWendysMealRecipe(EBBlocks.WEATHERED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.WEATHERED_COPPER))
                .criterion(hasItem(Blocks.WEATHERED_COPPER), conditionsFromItem(Blocks.WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.WEATHERED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WEATHERED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WEATHERED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.WEATHERED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WEATHERED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WEATHERED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.WEATHERED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WEATHERED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WEATHERED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.WEATHERED_COPPER)
                .pattern("##")
                .criterion(hasItem(Blocks.WEATHERED_COPPER), conditionsFromItem(Blocks.WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.OXIDIZED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.OXIDIZED_COPPER))
                .criterion(hasItem(Blocks.OXIDIZED_COPPER), conditionsFromItem(Blocks.OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.OXIDIZED_COPPER_BRICKS), conditionsFromItem(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.OXIDIZED_COPPER_BRICKS), conditionsFromItem(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.OXIDIZED_COPPER_BRICKS), conditionsFromItem(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.OXIDIZED_COPPER)
                .pattern("##")
                .criterion(hasItem(Blocks.OXIDIZED_COPPER), conditionsFromItem(Blocks.OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.WAXED_COPPER_BLOCK))
                .criterion(hasItem(Blocks.WAXED_COPPER_BLOCK), conditionsFromItem(Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.WAXED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.WAXED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.WAXED_COPPER_BLOCK)
                .pattern("##")
                .criterion(hasItem(Blocks.WAXED_COPPER_BLOCK), conditionsFromItem(Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.WAXED_EXPOSED_COPPER))
                .criterion(hasItem(Blocks.WAXED_EXPOSED_COPPER), conditionsFromItem(Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.WAXED_EXPOSED_COPPER)
                .pattern("##")
                .criterion(hasItem(Blocks.WAXED_EXPOSED_COPPER), conditionsFromItem(Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.WAXED_WEATHERED_COPPER))
                .criterion(hasItem(Blocks.WAXED_WEATHERED_COPPER), conditionsFromItem(Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.WAXED_WEATHERED_COPPER)
                .pattern("##")
                .criterion(hasItem(Blocks.WAXED_WEATHERED_COPPER), conditionsFromItem(Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS,
                Ingredient.ofItems(Blocks.WAXED_OXIDIZED_COPPER))
                .criterion(hasItem(Blocks.WAXED_OXIDIZED_COPPER), conditionsFromItem(Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS)));

        createStairsRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .criterion(hasItem(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS), conditionsFromItem(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, 1)
                .input('#', Blocks.WAXED_OXIDIZED_COPPER)
                .pattern("##")
                .criterion(hasItem(Blocks.WAXED_OXIDIZED_COPPER), conditionsFromItem(Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICKS, Blocks.COPPER_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_STAIRS, EBBlocks.COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_SLAB, EBBlocks.COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.COPPER_PRESSURE_PLATE, Blocks.COPPER_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICKS, Blocks.EXPOSED_COPPER, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_SLAB, EBBlocks.EXPOSED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Blocks.EXPOSED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICKS, Blocks.WEATHERED_COPPER, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_SLAB, EBBlocks.WEATHERED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WEATHERED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICKS, Blocks.OXIDIZED_COPPER, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, EBBlocks.OXIDIZED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICKS, Blocks.WAXED_COPPER_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_SLAB, EBBlocks.WAXED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_PRESSURE_PLATE, Blocks.WAXED_COPPER_BLOCK, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, Blocks.WAXED_EXPOSED_COPPER, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, Blocks.WAXED_EXPOSED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, Blocks.WAXED_WEATHERED_COPPER, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WAXED_WEATHERED_COPPER, 2);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, Blocks.WAXED_OXIDIZED_COPPER, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.WAXED_OXIDIZED_COPPER, 2);
    
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICKS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICKS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICK_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICK_SLAB, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_SLAB), conditionsFromItem(EBBlocks.COPPER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICKS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_SLAB), conditionsFromItem(EBBlocks.COPPER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICKS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_SLAB), conditionsFromItem(EBBlocks.COPPER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICKS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICKS), conditionsFromItem(EBBlocks.COPPER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_SLAB), conditionsFromItem(EBBlocks.COPPER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.ofItems(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), conditionsFromItem(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_PRESSURE_PLATE, 1, Ingredient.ofItems(EBBlocks.COPPER_PRESSURE_PLATE.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_PRESSURE_PLATE), conditionsFromItem(EBBlocks.COPPER_PRESSURE_PLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, 1, Ingredient.ofItems(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE.asItem()))
                .criterion(hasItem(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE), conditionsFromItem(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, 1, Ingredient.ofItems(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE.asItem()))
                .criterion(hasItem(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE), conditionsFromItem(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, 1, Ingredient.ofItems(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE.asItem()))
                .criterion(hasItem(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE), conditionsFromItem(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_COPPER_BUTTON, 1, Ingredient.ofItems(EBBlocks.COPPER_BUTTON.asItem()))
                .criterion(hasItem(EBBlocks.COPPER_BUTTON), conditionsFromItem(EBBlocks.COPPER_BUTTON))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BUTTON) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, 1, Ingredient.ofItems(EBBlocks.EXPOSED_COPPER_BUTTON.asItem()))
                .criterion(hasItem(EBBlocks.EXPOSED_COPPER_BUTTON), conditionsFromItem(EBBlocks.EXPOSED_COPPER_BUTTON))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, 1, Ingredient.ofItems(EBBlocks.WEATHERED_COPPER_BUTTON.asItem()))
                .criterion(hasItem(EBBlocks.WEATHERED_COPPER_BUTTON), conditionsFromItem(EBBlocks.WEATHERED_COPPER_BUTTON))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, 1, Ingredient.ofItems(EBBlocks.OXIDIZED_COPPER_BUTTON.asItem()))
                .criterion(hasItem(EBBlocks.OXIDIZED_COPPER_BUTTON), conditionsFromItem(EBBlocks.OXIDIZED_COPPER_BUTTON))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON) + "_from_honeycomb"));

        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_BUTTON, Blocks.WAXED_COPPER_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, Blocks.WAXED_EXPOSED_COPPER, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, Blocks.WAXED_WEATHERED_COPPER, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_COPPER, 4);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.COPPER_BUTTON, 1)
                .input(Blocks.COPPER_BLOCK)
                .criterion(hasItem(Blocks.COPPER_BLOCK), conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.EXPOSED_COPPER_BUTTON, 1)
                .input(Blocks.EXPOSED_COPPER)
                .criterion(hasItem(Blocks.EXPOSED_COPPER), conditionsFromItem(Blocks.EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WEATHERED_COPPER_BUTTON, 1)
                .input(Blocks.WEATHERED_COPPER)
                .criterion(hasItem(Blocks.WEATHERED_COPPER), conditionsFromItem(Blocks.WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.OXIDIZED_COPPER_BUTTON, 1)
                .input(Blocks.OXIDIZED_COPPER)
                .criterion(hasItem(Blocks.OXIDIZED_COPPER), conditionsFromItem(Blocks.OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_BUTTON, 1)
                .input(Blocks.WAXED_COPPER_BLOCK)
                .criterion(hasItem(Blocks.WAXED_COPPER_BLOCK), conditionsFromItem(Blocks.WAXED_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, 1)
                .input(Blocks.WAXED_EXPOSED_COPPER)
                .criterion(hasItem(Blocks.WAXED_EXPOSED_COPPER), conditionsFromItem(Blocks.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, 1)
                .input(Blocks.WAXED_WEATHERED_COPPER)
                .criterion(hasItem(Blocks.WAXED_WEATHERED_COPPER), conditionsFromItem(Blocks.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, 1)
                .input(Blocks.WAXED_OXIDIZED_COPPER)
                .criterion(hasItem(Blocks.WAXED_OXIDIZED_COPPER), conditionsFromItem(Blocks.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON)));

        createTwoByTwoRecipe(EBBlocks.IRON_BRICKS, 1,
                Ingredient.ofItems(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.IRON_BRICKS)));

        createStairsRecipe(EBBlocks.IRON_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.IRON_BRICKS))
                .criterion(hasItem(EBBlocks.IRON_BRICKS), conditionsFromItem(EBBlocks.IRON_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.IRON_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.IRON_BRICKS))
                .criterion(hasItem(EBBlocks.IRON_BRICKS), conditionsFromItem(EBBlocks.IRON_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.IRON_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.IRON_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.IRON_BRICKS))
                .criterion(hasItem(EBBlocks.IRON_BRICKS), conditionsFromItem(EBBlocks.IRON_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.IRON_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICKS, Blocks.IRON_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_STAIRS, EBBlocks.IRON_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_SLAB, EBBlocks.IRON_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_VERTICAL_STAIRS, EBBlocks.IRON_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.EMERALD_BRICKS, 1,
                Ingredient.ofItems(Items.EMERALD))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EMERALD_BRICKS)));

        createStairsRecipe(EBBlocks.EMERALD_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.EMERALD_BRICKS))
                .criterion(hasItem(EBBlocks.EMERALD_BRICKS), conditionsFromItem(EBBlocks.EMERALD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EMERALD_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.EMERALD_BRICKS))
                .criterion(hasItem(EBBlocks.EMERALD_BRICKS), conditionsFromItem(EBBlocks.EMERALD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EMERALD_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.EMERALD_BRICKS))
                .criterion(hasItem(EBBlocks.EMERALD_BRICKS), conditionsFromItem(EBBlocks.EMERALD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICKS, Blocks.EMERALD_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_STAIRS, EBBlocks.EMERALD_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_SLAB, EBBlocks.EMERALD_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS, EBBlocks.EMERALD_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.GOLD_BRICKS, 1,
                Ingredient.ofItems(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GOLD_BRICKS)));

        createStairsRecipe(EBBlocks.GOLD_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.GOLD_BRICKS))
                .criterion(hasItem(EBBlocks.GOLD_BRICKS), conditionsFromItem(EBBlocks.GOLD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GOLD_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.GOLD_BRICKS))
                .criterion(hasItem(EBBlocks.GOLD_BRICKS), conditionsFromItem(EBBlocks.GOLD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GOLD_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.GOLD_BRICKS))
                .criterion(hasItem(EBBlocks.GOLD_BRICKS), conditionsFromItem(EBBlocks.GOLD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICKS, Blocks.GOLD_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_STAIRS, EBBlocks.GOLD_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_SLAB, EBBlocks.GOLD_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_VERTICAL_STAIRS, EBBlocks.GOLD_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.LAPIS_BRICKS, 1,
                Ingredient.ofItems(Items.LAPIS_LAZULI))
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.LAPIS_BRICKS)));

        createStairsRecipe(EBBlocks.LAPIS_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.LAPIS_BRICKS))
                .criterion(hasItem(EBBlocks.LAPIS_BRICKS), conditionsFromItem(EBBlocks.LAPIS_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.LAPIS_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.LAPIS_BRICKS))
                .criterion(hasItem(EBBlocks.LAPIS_BRICKS), conditionsFromItem(EBBlocks.LAPIS_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.LAPIS_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.LAPIS_BRICKS))
                .criterion(hasItem(EBBlocks.LAPIS_BRICKS), conditionsFromItem(EBBlocks.LAPIS_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICKS, Blocks.LAPIS_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_STAIRS, EBBlocks.LAPIS_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_SLAB, EBBlocks.LAPIS_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS, EBBlocks.LAPIS_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.DIAMOND_BRICKS, 1,
                Ingredient.ofItems(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIAMOND_BRICKS)));

        createStairsRecipe(EBBlocks.DIAMOND_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.DIAMOND_BRICKS))
                .criterion(hasItem(EBBlocks.DIAMOND_BRICKS), conditionsFromItem(EBBlocks.DIAMOND_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIAMOND_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.DIAMOND_BRICKS))
                .criterion(hasItem(EBBlocks.DIAMOND_BRICKS), conditionsFromItem(EBBlocks.DIAMOND_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIAMOND_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.DIAMOND_BRICKS))
                .criterion(hasItem(EBBlocks.DIAMOND_BRICKS), conditionsFromItem(EBBlocks.DIAMOND_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICKS, Blocks.DIAMOND_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_STAIRS, EBBlocks.DIAMOND_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_SLAB, EBBlocks.DIAMOND_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS, EBBlocks.DIAMOND_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.NETHERITE_BRICKS, 1,
                Ingredient.ofItems(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.NETHERITE_BRICKS)));

        createStairsRecipe(EBBlocks.NETHERITE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.NETHERITE_BRICKS))
                .criterion(hasItem(EBBlocks.NETHERITE_BRICKS), conditionsFromItem(EBBlocks.NETHERITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.NETHERITE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.NETHERITE_BRICKS))
                .criterion(hasItem(EBBlocks.NETHERITE_BRICKS), conditionsFromItem(EBBlocks.NETHERITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.NETHERITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.NETHERITE_BRICKS))
                .criterion(hasItem(EBBlocks.NETHERITE_BRICKS), conditionsFromItem(EBBlocks.NETHERITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICKS, Blocks.NETHERITE_BLOCK, 4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_STAIRS, EBBlocks.NETHERITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_SLAB, EBBlocks.NETHERITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS, EBBlocks.NETHERITE_BRICKS, 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SEA_GLASS, 4)
                .input('#', Items.PRISMARINE_CRYSTALS).input('@', Blocks.GLASS.asItem())
                .pattern("#@#")
                .pattern("@ @")
                .pattern("#@#")
                .criterion(hasItem(Items.PRISMARINE_CRYSTALS), conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.SCARLET_SEA_GLASS, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS), Ingredient.ofItems(Items.RED_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS), conditionsFromItem(EBBlocks.SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SCARLET_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.VERDANT_SEA_GLASS, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS), Ingredient.ofItems(Items.LIME_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS), conditionsFromItem(EBBlocks.SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.VERDANT_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.ROSE_SEA_GLASS, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS), Ingredient.ofItems(Items.PINK_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS), conditionsFromItem(EBBlocks.SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ROSE_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.AQUA_SEA_GLASS, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS), Ingredient.ofItems(Items.BLUE_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS), conditionsFromItem(EBBlocks.SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.AQUA_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.FUCHSIA_SEA_GLASS, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS), Ingredient.ofItems(Items.MAGENTA_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS), conditionsFromItem(EBBlocks.SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.FUCHSIA_SEA_GLASS)));

        createPaneRecipe(EBBlocks.SEA_GLASS_PANE, 16,
                Ingredient.ofItems(EBBlocks.SEA_GLASS))
                .criterion(hasItem(EBBlocks.SEA_GLASS), conditionsFromItem(EBBlocks.SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.SCARLET_SEA_GLASS_PANE, 16,
                Ingredient.ofItems(EBBlocks.SCARLET_SEA_GLASS))
                .criterion(hasItem(EBBlocks.SCARLET_SEA_GLASS), conditionsFromItem(EBBlocks.SCARLET_SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SCARLET_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.FUCHSIA_SEA_GLASS_PANE, 16,
                Ingredient.ofItems(EBBlocks.FUCHSIA_SEA_GLASS))
                .criterion(hasItem(EBBlocks.FUCHSIA_SEA_GLASS), conditionsFromItem(EBBlocks.FUCHSIA_SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.FUCHSIA_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.AQUA_SEA_GLASS_PANE, 16,
                Ingredient.ofItems(EBBlocks.AQUA_SEA_GLASS))
                .criterion(hasItem(EBBlocks.AQUA_SEA_GLASS), conditionsFromItem(EBBlocks.AQUA_SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.AQUA_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.VERDANT_SEA_GLASS_PANE, 16,
                Ingredient.ofItems(EBBlocks.VERDANT_SEA_GLASS))
                .criterion(hasItem(EBBlocks.VERDANT_SEA_GLASS), conditionsFromItem(EBBlocks.VERDANT_SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.VERDANT_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.ROSE_SEA_GLASS_PANE, 16,
                Ingredient.ofItems(EBBlocks.ROSE_SEA_GLASS))
                .criterion(hasItem(EBBlocks.ROSE_SEA_GLASS), conditionsFromItem(EBBlocks.ROSE_SEA_GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ROSE_SEA_GLASS_PANE)));

        createDyeEightRecipe(EBBlocks.SCARLET_SEA_GLASS_PANE, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS_PANE), Ingredient.ofItems(Items.RED_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS_PANE), conditionsFromItem(EBBlocks.SEA_GLASS_PANE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SCARLET_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.VERDANT_SEA_GLASS_PANE, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS_PANE), Ingredient.ofItems(Items.LIME_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS_PANE), conditionsFromItem(EBBlocks.SEA_GLASS_PANE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.VERDANT_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.ROSE_SEA_GLASS_PANE, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS_PANE), Ingredient.ofItems(Items.PINK_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS_PANE), conditionsFromItem(EBBlocks.SEA_GLASS_PANE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ROSE_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.AQUA_SEA_GLASS_PANE, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS_PANE), Ingredient.ofItems(Items.BLUE_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS_PANE), conditionsFromItem(EBBlocks.SEA_GLASS_PANE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.AQUA_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.FUCHSIA_SEA_GLASS_PANE, 8,
                Ingredient.ofItems(EBBlocks.SEA_GLASS_PANE), Ingredient.ofItems(Items.MAGENTA_DYE))
                .criterion(hasItem(EBBlocks.SEA_GLASS_PANE), conditionsFromItem(EBBlocks.SEA_GLASS_PANE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.FUCHSIA_SEA_GLASS_PANE) + "_from_dye"));
    }

    public static CraftingRecipeJsonBuilder createWaxedRecipe(ItemConvertible output, int count, Ingredient input) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input(input).input(Ingredient.ofItems(Items.HONEYCOMB));
    }

    public static CraftingRecipeJsonBuilder createPaneRecipe(ItemConvertible output, int count, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input)
                .pattern("###")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createDyeEightRecipe(ItemConvertible output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input).input('@', input2)
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }
    
    public static CraftingRecipeJsonBuilder createVerticalStairsRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("###")
                .pattern("## ")
                .pattern("#  ");
    }

    public static CraftingRecipeJsonBuilder createFourForFourWendysMealRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("##")
                .pattern("##");
    }

    public static CraftingRecipeJsonBuilder createTwoByTwoRecipe(ItemConvertible output, int count, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input)
                .pattern("##")
                .pattern("##");
    }
}
