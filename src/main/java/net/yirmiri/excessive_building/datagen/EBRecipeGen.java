package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EBRecipeGen extends FabricRecipeProvider {
    public EBRecipeGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //TODO: MAKE ALL STONECUTTER RECIPES A LIST OF INGREDIENTS
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

        createTwoByTwoRecipe(EBBlocks.BONE_BRICKS, 4,
                Ingredient.ofItems(Items.BONE_BLOCK))
                .criterion(hasItem(Items.BONE_BLOCK), conditionsFromItem(Items.BONE_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BONE_BRICKS)));

        createStairsRecipe(EBBlocks.BONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.BONE_BRICKS))
                .criterion(hasItem(EBBlocks.BONE_BRICKS), conditionsFromItem(EBBlocks.BONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.BONE_BRICKS))
                .criterion(hasItem(EBBlocks.BONE_BRICKS), conditionsFromItem(EBBlocks.BONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.BONE_BRICKS))
                .criterion(hasItem(EBBlocks.BONE_BRICKS), conditionsFromItem(EBBlocks.BONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BONE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.BONE_BRICK_WALL, 6,
                Ingredient.ofItems(EBBlocks.BONE_BRICKS))
                .criterion(hasItem(EBBlocks.BONE_BRICKS), conditionsFromItem(EBBlocks.BONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BONE_BRICK_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICKS, Blocks.BONE_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_STAIRS, EBBlocks.BONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_SLAB, EBBlocks.BONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_VERTICAL_STAIRS, EBBlocks.BONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_WALL, EBBlocks.BONE_BRICKS, 1);

        for (DyeColor colors : DyeColor.values()) {
            offerCarpetRecipe(exporter, EBBlocks.getDyedKnittedCarpets(colors.getId()), EBBlocks.getDyedKnittedWools(colors.getId()));
        }

        for (DyeColor colors : DyeColor.values()) {
            createDyeRecipe(EBBlocks.getDyedKnittedCarpets(colors.getId()), 1, colors);
        }

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_MAGMA_BLOCK, 2)
                .input('#', EBBlocks.SOUL_SANDSTONE).input('@', Items.MAGMA_CREAM)
                .pattern("@#")
                .pattern("#@")
                .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_MAGMA_BLOCK)));

        createTwoByTwoRecipe(EBBlocks.SOUL_SANDSTONE, 1,
                Ingredient.ofItems(Items.SOUL_SAND))
                .criterion(hasItem(Items.SOUL_SAND), conditionsFromItem(Items.SOUL_SAND))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE)));

        createStairsRecipe(EBBlocks.SOUL_SANDSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.SOUL_SANDSTONE_WALL, 6,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_STAIRS, EBBlocks.SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_SLAB, EBBlocks.SOUL_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_WALL, EBBlocks.SOUL_SANDSTONE, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE, EBBlocks.SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_SOUL_SANDSTONE, EBBlocks.SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_SOUL_SANDSTONE_SLAB, EBBlocks.CUT_SOUL_SANDSTONE, 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE, 1)
                .input('#', EBBlocks.SOUL_SANDSTONE_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_SLAB), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_SOUL_SANDSTONE)));

        createTwoByTwoRecipe(EBBlocks.CUT_SOUL_SANDSTONE, 4,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CUT_SOUL_SANDSTONE)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_SOUL_SANDSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.CUT_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.CUT_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.CUT_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CUT_SOUL_SANDSTONE_SLAB)));

        offerSmelting(exporter, List.of(EBBlocks.SOUL_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE, 0.1F, 200, "smooth_soul_sandstone");

        createStairsRecipe(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SMOOTH_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SMOOTH_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SMOOTH_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS, EBBlocks.SMOOTH_SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, EBBlocks.SMOOTH_SOUL_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.SMOOTH_SOUL_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_SANDSTONE, 4,
                Ingredient.ofItems(Blocks.SANDSTONE))
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SANDSTONE)));

        createStairsRecipe(EBBlocks.POLISHED_SANDSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SANDSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.POLISHED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE, Blocks.SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_STAIRS, EBBlocks.POLISHED_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_SLAB, EBBlocks.POLISHED_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.SANDSTONE_BRICKS, 4,
                Ingredient.ofItems(EBBlocks.POLISHED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_BRICKS)));

        createStairsRecipe(EBBlocks.SANDSTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SANDSTONE_BRICKS, 1)
                .input('#', EBBlocks.SANDSTONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.SANDSTONE_BRICK_SLAB), conditionsFromItem(EBBlocks.SANDSTONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_SANDSTONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ENGRAVED_SANDSTONE_BRICKS, 2)
                .input('#', EBBlocks.CHISELED_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.CHISELED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.CHISELED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ENGRAVED_SANDSTONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SANDSTONE_BRICKS, 2)
                .input('#', EBBlocks.ENGRAVED_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.ENGRAVED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.ENGRAVED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DECORATED_SANDSTONE_BRICKS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICKS, EBBlocks.POLISHED_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_STAIRS, EBBlocks.SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_SLAB, EBBlocks.SANDSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SANDSTONE_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SANDSTONE_BRICKS, EBBlocks.SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ENGRAVED_SANDSTONE_BRICKS, EBBlocks.SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SANDSTONE_BRICKS, EBBlocks.SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_PILLAR, EBBlocks.SANDSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SANDSTONE_TILES, 4,
                Ingredient.ofItems(EBBlocks.SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_TILES)));

        createStairsRecipe(EBBlocks.SANDSTONE_TILE_STAIRS,
                Ingredient.ofItems(EBBlocks.SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.SANDSTONE_TILES), conditionsFromItem(EBBlocks.SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_TILE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_SLAB,
                Ingredient.ofItems(EBBlocks.SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.SANDSTONE_TILES), conditionsFromItem(EBBlocks.SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.SANDSTONE_TILES), conditionsFromItem(EBBlocks.SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILES, EBBlocks.SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_STAIRS, EBBlocks.SANDSTONE_TILES, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_SLAB, EBBlocks.SANDSTONE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SANDSTONE_TILES, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_RED_SANDSTONE, 4,
                Ingredient.ofItems(Blocks.RED_SANDSTONE))
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_RED_SANDSTONE)));

        createStairsRecipe(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_RED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_RED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.POLISHED_RED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_RED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_RED_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_RED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_RED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE, Blocks.RED_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_STAIRS, EBBlocks.POLISHED_RED_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_SLAB, EBBlocks.POLISHED_RED_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_RED_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.RED_SANDSTONE_BRICKS, 4,
                Ingredient.ofItems(EBBlocks.POLISHED_RED_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_RED_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_BRICKS)));

        createStairsRecipe(EBBlocks.RED_SANDSTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.RED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.RED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.RED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_RED_SANDSTONE_BRICKS, 1)
                .input('#', EBBlocks.RED_SANDSTONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_BRICK_SLAB), conditionsFromItem(EBBlocks.RED_SANDSTONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS, 2)
                .input('#', EBBlocks.CHISELED_RED_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, 2)
                .input('#', EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICKS, EBBlocks.POLISHED_RED_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_STAIRS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_SLAB, EBBlocks.RED_SANDSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ENGRAVED_RED_SANDSTONE_BRICKS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_RED_SANDSTONE_BRICKS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_PILLAR, EBBlocks.RED_SANDSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.RED_SANDSTONE_TILES, 4,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.RED_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_TILES)));

        createStairsRecipe(EBBlocks.RED_SANDSTONE_TILE_STAIRS,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_TILES), conditionsFromItem(EBBlocks.RED_SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_TILE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_SLAB,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_TILES), conditionsFromItem(EBBlocks.RED_SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.RED_SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.RED_SANDSTONE_TILES), conditionsFromItem(EBBlocks.RED_SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILES, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_STAIRS, EBBlocks.RED_SANDSTONE_TILES, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_SLAB, EBBlocks.RED_SANDSTONE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_TILES, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_SOUL_SANDSTONE, 4,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE), conditionsFromItem(EBBlocks.SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE)));

        createStairsRecipe(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE, EBBlocks.SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS, EBBlocks.POLISHED_SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB, EBBlocks.POLISHED_SOUL_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SOUL_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.SOUL_SANDSTONE_BRICKS, 4,
                Ingredient.ofItems(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_SOUL_SANDSTONE), conditionsFromItem(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_BRICKS)));

        createStairsRecipe(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS, 1)
                .input('#', EBBlocks.SOUL_SANDSTONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS, 2)
                .input('#', EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, 2)
                .input('#', EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICKS, EBBlocks.POLISHED_SOUL_SANDSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_SLAB, EBBlocks.SOUL_SANDSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ENGRAVED_SOUL_SANDSTONE_BRICKS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_PILLAR, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SOUL_SANDSTONE_TILES, 4,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_BRICKS), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_TILES)));

        createStairsRecipe(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_TILES), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_SLAB,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_TILES), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SOUL_SANDSTONE_TILES))
                .criterion(hasItem(EBBlocks.SOUL_SANDSTONE_TILES), conditionsFromItem(EBBlocks.SOUL_SANDSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILES, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_STAIRS, EBBlocks.SOUL_SANDSTONE_TILES, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_SLAB, EBBlocks.SOUL_SANDSTONE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_TILES, 1);

        createLadderRecipe(EBBlocks.SPRUCE_LADDER,
                Ingredient.ofItems(Blocks.SPRUCE_PLANKS))
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_LADDER)));

        createLadderRecipe(EBBlocks.BIRCH_LADDER,
                Ingredient.ofItems(Blocks.BIRCH_PLANKS))
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_LADDER)));

        createLadderRecipe(EBBlocks.JUNGLE_LADDER,
                Ingredient.ofItems(Blocks.JUNGLE_PLANKS))
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_LADDER)));

        createLadderRecipe(EBBlocks.ACACIA_LADDER,
                Ingredient.ofItems(Blocks.ACACIA_PLANKS))
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_LADDER)));

        createLadderRecipe(EBBlocks.DARK_OAK_LADDER,
                Ingredient.ofItems(Blocks.DARK_OAK_PLANKS))
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_LADDER)));

        createLadderRecipe(EBBlocks.MANGROVE_LADDER,
                Ingredient.ofItems(Blocks.MANGROVE_PLANKS))
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_LADDER)));

        createLadderRecipe(EBBlocks.CHERRY_LADDER,
                Ingredient.ofItems(Blocks.CHERRY_PLANKS))
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_LADDER)));

        createLadderRecipe(EBBlocks.BAMBOO_LADDER,
                Ingredient.ofItems(Blocks.BAMBOO_PLANKS))
                .criterion(hasItem(Blocks.BAMBOO_PLANKS), conditionsFromItem(Blocks.BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BAMBOO_LADDER)));

        createLadderRecipe(EBBlocks.CRIMSON_LADDER,
                Ingredient.ofItems(Blocks.CRIMSON_PLANKS))
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_LADDER)));

        createLadderRecipe(EBBlocks.WARPED_LADDER,
                Ingredient.ofItems(Blocks.WARPED_PLANKS))
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_LADDER)));

        createLadderRecipe(EBBlocks.ANCIENT_LADDER,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_LADDER)));

        createLadderRecipe(EBBlocks.GLOOM_LADDER,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_LADDER)));

        createLadderRecipe(Blocks.LADDER,
                Ingredient.ofItems(Blocks.OAK_PLANKS))
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(Blocks.LADDER)));

        createTwoByTwoRecipe(EBBlocks.SPRUCE_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.SPRUCE_PLANKS))
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.WARPED_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.WARPED_PLANKS))
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.CRIMSON_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.CRIMSON_PLANKS))
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.BAMBOO_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.BAMBOO_PLANKS))
                .criterion(hasItem(Blocks.BAMBOO_PLANKS), conditionsFromItem(Blocks.BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BAMBOO_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.CHERRY_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.CHERRY_PLANKS))
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.MANGROVE_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.MANGROVE_PLANKS))
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.DARK_OAK_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.DARK_OAK_PLANKS))
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.ACACIA_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.ACACIA_PLANKS))
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.JUNGLE_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.JUNGLE_PLANKS))
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.BIRCH_CRAFTING_TABLE, 1,
                Ingredient.ofItems(Blocks.BIRCH_PLANKS))
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.ANCIENT_CRAFTING_TABLE, 1,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS))
                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.GLOOM_CRAFTING_TABLE, 1,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS))
                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_CRAFTING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.CRAFTER, 1)
                .input('#', Items.IRON_INGOT).input('@', Items.REDSTONE).input('!', Items.DROPPER).input('$', EBTags.Items.CRAFTING_TABLES)
                .pattern("###")
                .pattern("#$#")
                .pattern("@!@")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(Items.DROPPER), conditionsFromItem(Items.DROPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(Blocks.CRAFTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.WOODEN_MUG, 3)
                .input('#', ItemTags.WOODEN_SLABS).input('@', Items.STICK)
                .pattern("@##")
                .pattern(" ##")
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WOODEN_MUG)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.GLASS_JAR, 3)
                .input('#', Items.GLASS)
                .pattern("# #")
                .pattern("###")
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLASS_JAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.GLASS_JAR_OF_FIRE, 1)
                .input('#', EBBlocks.GLASS_JAR).input('@', Items.FIRE_CHARGE)
                .pattern("#")
                .pattern("@")
                .criterion(hasItem(EBBlocks.GLASS_JAR), conditionsFromItem(EBBlocks.GLASS_JAR))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLASS_JAR_OF_FIRE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.GLASS_JAR_OF_SOUL_FIRE, 1)
                .input('#', EBBlocks.GLASS_JAR).input('@', Items.FIRE_CHARGE).input('!', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern("#")
                .pattern("@")
                .pattern("!")
                .criterion(hasItem(EBBlocks.GLASS_JAR), conditionsFromItem(EBBlocks.GLASS_JAR))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLASS_JAR_OF_SOUL_FIRE)));

        createStairsRecipe(EBBlocks.QUARTZ_BRICK_STAIRS,
                Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.QUARTZ_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_SLAB,
                Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.QUARTZ_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.QUARTZ_BRICK_WALL, 6,
                Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.QUARTZ_BRICK_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS, Blocks.QUARTZ_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);

        for (DyeColor colors : DyeColor.values()) {
            createTerracottaDyingRecipe(EBBlocks.getDyedTerracottaTiles(colors.getId()), EBBlocks.TERRACOTTA_TILES, DyeItem.byColor(colors).getColor());
        }

        for (DyeColor colors : DyeColor.values()) {
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileStairs(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileSlab(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()), 2);
        }

        for (DyeColor colors : DyeColor.values()) {
            offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            createStairsRecipe(EBBlocks.getDyedTerracottaTileStairs(colors.getId()),
                    Ingredient.ofItems(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .criterion(hasItem(EBBlocks.getDyedTerracottaTiles(colors.getId())), conditionsFromItem(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTileStairs(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileSlab(colors.getId()),
                    Ingredient.ofItems(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .criterion(hasItem(EBBlocks.getDyedTerracottaTiles(colors.getId())), conditionsFromItem(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTileSlab(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            createVerticalStairsRecipe(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()),
                    Ingredient.ofItems(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .criterion(hasItem(EBBlocks.getDyedTerracottaTiles(colors.getId())), conditionsFromItem(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()))));
        }

        createTwoByTwoCheckersMealRecipe(EBBlocks.TERRACOTTA_TILES, 4,
                Ingredient.ofItems(Blocks.TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.TERRACOTTA), conditionsFromItem(Blocks.TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.TERRACOTTA_TILES)));

        createStairsRecipe(EBBlocks.TERRACOTTA_TILE_STAIRS,
                Ingredient.ofItems(EBBlocks.TERRACOTTA_TILES))
                .criterion(hasItem(EBBlocks.TERRACOTTA_TILES), conditionsFromItem(EBBlocks.TERRACOTTA_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.TERRACOTTA_TILE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_SLAB,
                Ingredient.ofItems(EBBlocks.TERRACOTTA_TILES))
                .criterion(hasItem(EBBlocks.TERRACOTTA_TILES), conditionsFromItem(EBBlocks.TERRACOTTA_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.TERRACOTTA_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.TERRACOTTA_TILES))
                .criterion(hasItem(EBBlocks.TERRACOTTA_TILES), conditionsFromItem(EBBlocks.TERRACOTTA_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_STAIRS, EBBlocks.TERRACOTTA_TILES, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_SLAB, EBBlocks.TERRACOTTA_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS, EBBlocks.TERRACOTTA_TILES, 1);

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.WHITE.getId()), 4,
                Ingredient.ofItems(Blocks.WHITE_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.WHITE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_GRAY.getId()), 4,
                Ingredient.ofItems(Blocks.LIGHT_GRAY_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_GRAY.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.GRAY.getId()), 4,
                Ingredient.ofItems(Blocks.GRAY_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.GRAY.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.BLACK.getId()), 4,
                Ingredient.ofItems(Blocks.BLACK_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.BLACK.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.BROWN.getId()), 4,
                Ingredient.ofItems(Blocks.BROWN_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.BROWN.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.RED.getId()), 4,
                Ingredient.ofItems(Blocks.RED_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.RED.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.ORANGE.getId()), 4,
                Ingredient.ofItems(Blocks.ORANGE_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.ORANGE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.YELLOW.getId()), 4,
                Ingredient.ofItems(Blocks.YELLOW_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.YELLOW.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.LIME.getId()), 4,
                Ingredient.ofItems(Blocks.LIME_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.LIME.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.GREEN.getId()), 4,
                Ingredient.ofItems(Blocks.GREEN_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.GREEN.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.CYAN.getId()), 4,
                Ingredient.ofItems(Blocks.CYAN_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.CYAN.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_BLUE.getId()), 4,
                Ingredient.ofItems(Blocks.LIGHT_BLUE_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_BLUE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.BLUE.getId()), 4,
                Ingredient.ofItems(Blocks.BLUE_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.BLUE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.PURPLE.getId()), 4,
                Ingredient.ofItems(Blocks.PURPLE_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.PURPLE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.MAGENTA.getId()), 4,
                Ingredient.ofItems(Blocks.MAGENTA_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.MAGENTA.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.PINK.getId()), 4,
                Ingredient.ofItems(Blocks.PINK_TERRACOTTA), Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.PINK.getId()))));

        createVerticalStairsRecipe(EBBlocks.OAK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.OAK_PLANKS))
                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OAK_VERTICAL_STAIRS)));

        createVerticalStairsRecipe(EBBlocks.SPRUCE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.SPRUCE_PLANKS))
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_VERTICAL_STAIRS)));

        createVerticalStairsRecipe(EBBlocks.BIRCH_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.BIRCH_PLANKS))
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.JUNGLE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.JUNGLE_PLANKS))
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.ACACIA_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.ACACIA_PLANKS))
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.DARK_OAK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.DARK_OAK_PLANKS))
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.MANGROVE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.MANGROVE_PLANKS))
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.CHERRY_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.CHERRY_PLANKS))
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.BAMBOO_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.BAMBOO_PLANKS))
                .criterion(hasItem(Blocks.BAMBOO_PLANKS), conditionsFromItem(Blocks.BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BAMBOO_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.CRIMSON_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.CRIMSON_PLANKS))
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.WARPED_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.WARPED_PLANKS))
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.STONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.STONE))
                .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.STONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.STONE_VERTICAL_STAIRS, Blocks.STONE, 1);

        createVerticalStairsRecipe(EBBlocks.COBBLESTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.COBBLESTONE))
                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLESTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_VERTICAL_STAIRS, Blocks.COBBLESTONE, 1);

        createVerticalStairsRecipe(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE))
                .criterion(hasItem(Blocks.MOSSY_COBBLESTONE), conditionsFromItem(Blocks.MOSSY_COBBLESTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS, Blocks.MOSSY_COBBLESTONE, 1);

        createVerticalStairsRecipe(EBBlocks.STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.STONE_BRICKS))
                .criterion(hasItem(Blocks.STONE_BRICKS), conditionsFromItem(Blocks.STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.STONE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.STONE_BRICK_VERTICAL_STAIRS, Blocks.STONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.MOSSY_STONE_BRICKS))
                .criterion(hasItem(Blocks.MOSSY_STONE_BRICKS), conditionsFromItem(Blocks.MOSSY_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS, Blocks.MOSSY_STONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.COBBLED_DEEPSLATE))
                .criterion(hasItem(Blocks.COBBLED_DEEPSLATE), conditionsFromItem(Blocks.COBBLED_DEEPSLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS, Blocks.COBBLED_DEEPSLATE, 1);

        createVerticalStairsRecipe(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.DEEPSLATE_BRICKS))
                .criterion(hasItem(Blocks.DEEPSLATE_BRICKS), conditionsFromItem(Blocks.DEEPSLATE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS, Blocks.DEEPSLATE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.DEEPSLATE_TILES))
                .criterion(hasItem(Blocks.DEEPSLATE_TILES), conditionsFromItem(Blocks.DEEPSLATE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS, Blocks.DEEPSLATE_TILES, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_DEEPSLATE))
                .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS, Blocks.POLISHED_DEEPSLATE, 1);

        createVerticalStairsRecipe(EBBlocks.QUARTZ_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.QUARTZ_BLOCK))
                .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.QUARTZ_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_VERTICAL_STAIRS, Blocks.QUARTZ_BLOCK, 1);

        createVerticalStairsRecipe(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.SMOOTH_QUARTZ))
                .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS, Blocks.SMOOTH_QUARTZ, 1);

        createVerticalStairsRecipe(EBBlocks.BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.BRICKS))
                .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRICK_VERTICAL_STAIRS, Blocks.BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.SANDSTONE))
                .criterion(hasItem(Blocks.SANDSTONE), conditionsFromItem(Blocks.SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_VERTICAL_STAIRS, Blocks.SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.RED_SANDSTONE))
                .criterion(hasItem(Blocks.RED_SANDSTONE), conditionsFromItem(Blocks.RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS, Blocks.RED_SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.SMOOTH_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS, Blocks.SMOOTH_SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.SMOOTH_RED_SANDSTONE))
                .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS, Blocks.SMOOTH_RED_SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.BLACKSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.BLACKSTONE))
                .criterion(hasItem(Blocks.BLACKSTONE), conditionsFromItem(Blocks.BLACKSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BLACKSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_VERTICAL_STAIRS, Blocks.BLACKSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_BLACKSTONE))
                .criterion(hasItem(Blocks.POLISHED_BLACKSTONE), conditionsFromItem(Blocks.POLISHED_BLACKSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS, Blocks.POLISHED_BLACKSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .criterion(hasItem(Blocks.POLISHED_BLACKSTONE_BRICKS), conditionsFromItem(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.NETHER_BRICKS))
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHER_BRICK_VERTICAL_STAIRS, Blocks.NETHER_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.RED_NETHER_BRICKS))
                .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS, Blocks.RED_NETHER_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.PRISMARINE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.PRISMARINE))
                .criterion(hasItem(Blocks.PRISMARINE), conditionsFromItem(Blocks.PRISMARINE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.PRISMARINE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_VERTICAL_STAIRS, Blocks.PRISMARINE, 1);

        createVerticalStairsRecipe(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.PRISMARINE_BRICKS))
                .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS, Blocks.PRISMARINE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.DARK_PRISMARINE))
                .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS, Blocks.DARK_PRISMARINE, 1);

        createVerticalStairsRecipe(EBBlocks.ANDESITE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.ANDESITE))
                .criterion(hasItem(Blocks.ANDESITE), conditionsFromItem(Blocks.ANDESITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANDESITE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_VERTICAL_STAIRS, Blocks.ANDESITE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_ANDESITE))
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS, Blocks.POLISHED_ANDESITE, 1);

        createVerticalStairsRecipe(EBBlocks.GRANITE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.GRANITE))
                .criterion(hasItem(Blocks.GRANITE), conditionsFromItem(Blocks.GRANITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GRANITE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_VERTICAL_STAIRS, Blocks.GRANITE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_GRANITE))
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS, Blocks.POLISHED_GRANITE, 1);

        createVerticalStairsRecipe(EBBlocks.DIORITE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.DIORITE))
                .criterion(hasItem(Blocks.DIORITE), conditionsFromItem(Blocks.DIORITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIORITE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_VERTICAL_STAIRS, Blocks.DIORITE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_DIORITE))
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS, Blocks.POLISHED_DIORITE, 1);

        createVerticalStairsRecipe(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.END_STONE_BRICKS))
                .criterion(hasItem(Blocks.END_STONE_BRICKS), conditionsFromItem(Blocks.END_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS, Blocks.END_STONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.PURPUR_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.PURPUR_BLOCK))
                .criterion(hasItem(Blocks.PURPUR_BLOCK), conditionsFromItem(Blocks.PURPUR_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.PURPUR_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.PURPUR_VERTICAL_STAIRS, Blocks.PURPUR_BLOCK, 1);

        createVerticalStairsRecipe(EBBlocks.CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.CUT_COPPER))
                .criterion(hasItem(Blocks.CUT_COPPER), conditionsFromItem(Blocks.CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_COPPER_VERTICAL_STAIRS, Blocks.CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.EXPOSED_CUT_COPPER))
                .criterion(hasItem(Blocks.EXPOSED_CUT_COPPER), conditionsFromItem(Blocks.EXPOSED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.EXPOSED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.WEATHERED_CUT_COPPER))
                .criterion(hasItem(Blocks.WEATHERED_CUT_COPPER), conditionsFromItem(Blocks.WEATHERED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WEATHERED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.OXIDIZED_CUT_COPPER))
                .criterion(hasItem(Blocks.OXIDIZED_CUT_COPPER), conditionsFromItem(Blocks.OXIDIZED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.OXIDIZED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.WAXED_CUT_COPPER))
                .criterion(hasItem(Blocks.WAXED_CUT_COPPER), conditionsFromItem(Blocks.WAXED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.WAXED_EXPOSED_CUT_COPPER))
                .criterion(hasItem(Blocks.WAXED_EXPOSED_CUT_COPPER), conditionsFromItem(Blocks.WAXED_EXPOSED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.WAXED_WEATHERED_CUT_COPPER))
                .criterion(hasItem(Blocks.WAXED_WEATHERED_CUT_COPPER), conditionsFromItem(Blocks.WAXED_WEATHERED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .criterion(hasItem(Blocks.WAXED_OXIDIZED_CUT_COPPER), conditionsFromItem(Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.TUFF_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.TUFF))
                .criterion(hasItem(Blocks.TUFF), conditionsFromItem(Blocks.TUFF))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.TUFF_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_VERTICAL_STAIRS, Blocks.TUFF, 1);

        createVerticalStairsRecipe(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.TUFF_BRICKS))
                .criterion(hasItem(Blocks.TUFF_BRICKS), conditionsFromItem(Blocks.TUFF_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_VERTICAL_STAIRS, Blocks.TUFF_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS,
                Ingredient.ofItems(Blocks.POLISHED_TUFF))
                .criterion(hasItem(Blocks.POLISHED_TUFF), conditionsFromItem(Blocks.POLISHED_TUFF))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS, Blocks.POLISHED_TUFF, 1);

        createTwoByTwoRecipe(EBBlocks.GRANITE_BRICKS, 4,
                Ingredient.ofItems(Items.POLISHED_GRANITE))
                .criterion(hasItem(Items.POLISHED_GRANITE), conditionsFromItem(Items.POLISHED_GRANITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GRANITE_BRICKS)));

        createStairsRecipe(EBBlocks.GRANITE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.GRANITE_BRICKS))
                .criterion(hasItem(EBBlocks.GRANITE_BRICKS), conditionsFromItem(EBBlocks.GRANITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GRANITE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.GRANITE_BRICKS))
                .criterion(hasItem(EBBlocks.GRANITE_BRICKS), conditionsFromItem(EBBlocks.GRANITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GRANITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.GRANITE_BRICKS))
                .criterion(hasItem(EBBlocks.GRANITE_BRICKS), conditionsFromItem(EBBlocks.GRANITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.GRANITE_BRICK_WALL, 6,
                Ingredient.ofItems(EBBlocks.GRANITE_BRICKS))
                .criterion(hasItem(EBBlocks.GRANITE_BRICKS), conditionsFromItem(EBBlocks.GRANITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GRANITE_BRICK_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_STAIRS, EBBlocks.GRANITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_SLAB, EBBlocks.GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS, EBBlocks.GRANITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_WALL, EBBlocks.GRANITE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.ANDESITE_BRICKS, 4,
                Ingredient.ofItems(Items.POLISHED_ANDESITE))
                .criterion(hasItem(Items.POLISHED_ANDESITE), conditionsFromItem(Items.POLISHED_ANDESITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANDESITE_BRICKS)));

        createStairsRecipe(EBBlocks.ANDESITE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(EBBlocks.ANDESITE_BRICKS), conditionsFromItem(EBBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANDESITE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(EBBlocks.ANDESITE_BRICKS), conditionsFromItem(EBBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANDESITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(EBBlocks.ANDESITE_BRICKS), conditionsFromItem(EBBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.ANDESITE_BRICK_WALL, 6,
                Ingredient.ofItems(EBBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(EBBlocks.ANDESITE_BRICKS), conditionsFromItem(EBBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANDESITE_BRICK_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_STAIRS, EBBlocks.ANDESITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_SLAB, EBBlocks.ANDESITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS, EBBlocks.ANDESITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_WALL, EBBlocks.ANDESITE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.DIORITE_BRICKS, 4,
                Ingredient.ofItems(Items.POLISHED_DIORITE))
                .criterion(hasItem(Items.POLISHED_DIORITE), conditionsFromItem(Items.POLISHED_DIORITE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIORITE_BRICKS)));

        createStairsRecipe(EBBlocks.DIORITE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.DIORITE_BRICKS))
                .criterion(hasItem(EBBlocks.DIORITE_BRICKS), conditionsFromItem(EBBlocks.DIORITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIORITE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.DIORITE_BRICKS))
                .criterion(hasItem(EBBlocks.DIORITE_BRICKS), conditionsFromItem(EBBlocks.DIORITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIORITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.DIORITE_BRICKS))
                .criterion(hasItem(EBBlocks.DIORITE_BRICKS), conditionsFromItem(EBBlocks.DIORITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.DIORITE_BRICK_WALL, 6,
                Ingredient.ofItems(EBBlocks.DIORITE_BRICKS))
                .criterion(hasItem(EBBlocks.DIORITE_BRICKS), conditionsFromItem(EBBlocks.DIORITE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DIORITE_BRICK_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_STAIRS, EBBlocks.DIORITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_SLAB, EBBlocks.DIORITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS, EBBlocks.DIORITE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_WALL, EBBlocks.DIORITE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SMOOTH_BRICKS, 4,
                Ingredient.ofItems(Items.BRICKS))
                .criterion(hasItem(Items.BRICKS), conditionsFromItem(Items.BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_BRICKS)));

        createStairsRecipe(EBBlocks.SMOOTH_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.SMOOTH_BRICKS))
                .criterion(hasItem(EBBlocks.SMOOTH_BRICKS), conditionsFromItem(EBBlocks.SMOOTH_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.SMOOTH_BRICKS))
                .criterion(hasItem(EBBlocks.SMOOTH_BRICKS), conditionsFromItem(EBBlocks.SMOOTH_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.SMOOTH_BRICKS))
                .criterion(hasItem(EBBlocks.SMOOTH_BRICKS), conditionsFromItem(EBBlocks.SMOOTH_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.SMOOTH_BRICK_WALL, 6,
                Ingredient.ofItems(EBBlocks.SMOOTH_BRICKS))
                .criterion(hasItem(EBBlocks.SMOOTH_BRICKS), conditionsFromItem(EBBlocks.SMOOTH_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_BRICK_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICKS, Blocks.BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_STAIRS, EBBlocks.SMOOTH_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_SLAB, EBBlocks.SMOOTH_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_WALL, EBBlocks.SMOOTH_BRICKS, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.HERRINGBONE_BRICKS, Blocks.BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_HERRINGBONE_BRICKS, EBBlocks.SMOOTH_BRICKS, 1);

        offerCrackingRecipe(exporter, EBBlocks.CRACKED_BRICKS, Blocks.BRICKS);
        offerCrackingRecipe(exporter, EBBlocks.CRACKED_SMOOTH_BRICKS, EBBlocks.SMOOTH_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HERRINGBONE_BRICKS, 1)
                .input('#', Blocks.BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(Blocks.BRICK_SLAB), conditionsFromItem(Blocks.BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.HERRINGBONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_HERRINGBONE_BRICKS, 1)
                .input('#', EBBlocks.SMOOTH_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.SMOOTH_BRICK_SLAB), conditionsFromItem(EBBlocks.SMOOTH_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SMOOTH_HERRINGBONE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.REACHING_LANTERN, 1)
                .input('#', EBItems.ANCIENT_FRUIT).input('@', Items.LANTERN)
                .pattern("#")
                .pattern("@")
                .pattern("#")
                .criterion(hasItem(EBItems.ANCIENT_FRUIT), conditionsFromItem(EBItems.ANCIENT_FRUIT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.REACHING_LANTERN)));

        createShelfBlock(EBBlocks.SPRUCE_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.SPRUCE_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_BOOKSHELF)));

        createShelfBlock(EBBlocks.BIRCH_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.BIRCH_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_BOOKSHELF)));

        createShelfBlock(EBBlocks.JUNGLE_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.JUNGLE_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_BOOKSHELF)));

        createShelfBlock(EBBlocks.ACACIA_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.ACACIA_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_BOOKSHELF)));

        createShelfBlock(EBBlocks.DARK_OAK_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.DARK_OAK_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_BOOKSHELF)));

        createShelfBlock(EBBlocks.MANGROVE_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.MANGROVE_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_BOOKSHELF)));

        createShelfBlock(EBBlocks.CHERRY_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.CHERRY_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_BOOKSHELF)));

        createShelfBlock(EBBlocks.BAMBOO_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.BAMBOO_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BAMBOO_BOOKSHELF)));

        createShelfBlock(EBBlocks.CRIMSON_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.CRIMSON_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_BOOKSHELF)));

        createShelfBlock(EBBlocks.WARPED_BOOKSHELF, 1,
                Ingredient.ofItems(Blocks.WARPED_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_BOOKSHELF)));

        createShelfBlock(EBBlocks.ANCIENT_BOOKSHELF, 1,
                Ingredient.ofItems(EBBlocks.ANCIENT_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_BOOKSHELF)));

        createShelfBlock(EBBlocks.GLOOM_BOOKSHELF, 1,
                Ingredient.ofItems(EBBlocks.GLOOM_PLANKS), Ingredient.ofItems(Items.BOOK))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_BOOKSHELF)));

        createTwoByTwoCheckersMealRecipe(EBBlocks.BRIMSTONE, 4,
                Ingredient.ofItems(Blocks.NETHERRACK), Ingredient.ofItems(Blocks.BASALT))
                .criterion(hasItem(Blocks.BASALT), conditionsFromItem(Blocks.BASALT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE)));

        createStairsRecipe(EBBlocks.BRIMSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.BRIMSTONE))
                .criterion(hasItem(EBBlocks.BRIMSTONE), conditionsFromItem(EBBlocks.BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.BRIMSTONE))
                .criterion(hasItem(EBBlocks.BRIMSTONE), conditionsFromItem(EBBlocks.BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BRIMSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.BRIMSTONE))
                .criterion(hasItem(EBBlocks.BRIMSTONE), conditionsFromItem(EBBlocks.BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.BRIMSTONE_WALL, 6,
                Ingredient.ofItems(EBBlocks.BRIMSTONE))
                .criterion(hasItem(EBBlocks.BRIMSTONE), conditionsFromItem(EBBlocks.BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_WALL)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_STAIRS, EBBlocks.BRIMSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_SLAB, EBBlocks.BRIMSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_WALL, EBBlocks.BRIMSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_BRIMSTONE, 4,
                Ingredient.ofItems(EBBlocks.BRIMSTONE))
                .criterion(hasItem(EBBlocks.BRIMSTONE), conditionsFromItem(EBBlocks.BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_BRIMSTONE)));

        createStairsRecipe(EBBlocks.POLISHED_BRIMSTONE_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_BRIMSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_BRIMSTONE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_SLAB,
                Ingredient.ofItems(EBBlocks.POLISHED_BRIMSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_BRIMSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.POLISHED_BRIMSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_STAIRS, EBBlocks.POLISHED_BRIMSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_SLAB, EBBlocks.POLISHED_BRIMSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_BRIMSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.BRIMSTONE_BRICKS, 4,
                Ingredient.ofItems(EBBlocks.POLISHED_BRIMSTONE))
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_BRICKS)));

        createStairsRecipe(EBBlocks.BRIMSTONE_BRICK_STAIRS,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.BRIMSTONE_BRICKS), conditionsFromItem(EBBlocks.BRIMSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_BRICK_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_SLAB,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.BRIMSTONE_BRICKS), conditionsFromItem(EBBlocks.BRIMSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.BRIMSTONE_BRICKS), conditionsFromItem(EBBlocks.BRIMSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_STAIRS, EBBlocks.BRIMSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_SLAB, EBBlocks.BRIMSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.BRIMSTONE_TILES, 4,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_BRICKS))
                .criterion(hasItem(EBBlocks.BRIMSTONE_BRICKS), conditionsFromItem(EBBlocks.BRIMSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_TILES)));

        createStairsRecipe(EBBlocks.BRIMSTONE_TILE_STAIRS,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_TILES))
                .criterion(hasItem(EBBlocks.BRIMSTONE_TILES), conditionsFromItem(EBBlocks.BRIMSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_TILE_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_SLAB,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_TILES))
                .criterion(hasItem(EBBlocks.BRIMSTONE_TILES), conditionsFromItem(EBBlocks.BRIMSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.BRIMSTONE_TILES))
                .criterion(hasItem(EBBlocks.BRIMSTONE_TILES), conditionsFromItem(EBBlocks.BRIMSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_STAIRS, EBBlocks.BRIMSTONE_TILES, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_SLAB, EBBlocks.BRIMSTONE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_TILES, 1);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE, EBBlocks.BRIMSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICKS, EBBlocks.POLISHED_BRIMSTONE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILES, EBBlocks.BRIMSTONE_BRICKS, 1);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_PILLAR, 1)
                .input('#', EBBlocks.POLISHED_BRIMSTONE_SLAB)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE_SLAB), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_PILLAR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_LAMP, 4)
                .input('#', EBBlocks.POLISHED_BRIMSTONE).input('@', Items.GLOWSTONE_DUST)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@")
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_LAMP)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_WINDOW, 4)
                .input('@', EBBlocks.POLISHED_BRIMSTONE).input('#', Items.GLOWSTONE_DUST)
                .pattern("@#@")
                .pattern("###")
                .pattern("@#@")
                .criterion(hasItem(EBBlocks.POLISHED_BRIMSTONE), conditionsFromItem(EBBlocks.POLISHED_BRIMSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BRIMSTONE_WINDOW)));

        createStairsRecipe(EBBlocks.ASPHALT_STAIRS,
                Ingredient.ofItems(EBBlocks.ASPHALT))
                .criterion(hasItem(EBBlocks.ASPHALT), conditionsFromItem(EBBlocks.ASPHALT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ASPHALT_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_SLAB,
                Ingredient.ofItems(EBBlocks.ASPHALT))
                .criterion(hasItem(EBBlocks.ASPHALT), conditionsFromItem(EBBlocks.ASPHALT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ASPHALT_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ASPHALT_VERTICAL_STAIRS,
                Ingredient.ofItems(EBBlocks.ASPHALT))
                .criterion(hasItem(EBBlocks.ASPHALT), conditionsFromItem(EBBlocks.ASPHALT))
                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ASPHALT_VERTICAL_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_STAIRS, EBBlocks.ASPHALT, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_SLAB, EBBlocks.ASPHALT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_VERTICAL_STAIRS, EBBlocks.ASPHALT, 1);
    }

    public static CraftingRecipeJsonBuilder createShelfBlock(ItemConvertible output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, count)
                .input('#', input).input('@', input2)
                .pattern("###")
                .pattern("@@@")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createWaxedRecipe(ItemConvertible output, int count, Ingredient input) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input(input).input(Ingredient.ofItems(Items.HONEYCOMB));
    }

    public static CraftingRecipeJsonBuilder createDyeRecipe(ItemConvertible output, int count, DyeColor color) {
        return ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input(DyeItem.byColor(color));
    }

    public static CraftingRecipeJsonBuilder createPaneRecipe(ItemConvertible output, int count, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input)
                .pattern("###")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createLadderRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 8)
                .input('#', Ingredient.ofItems(Items.STICK)).input('@', input)
                .pattern("# #")
                .pattern("#@#")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createDyeEightRecipe(ItemConvertible output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input).input('@', input2)
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createTerracottaDyingRecipe(ItemConvertible output, Block input, DyeColor color) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input('#', input).input('@', DyeItem.byColor(color))
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

    public static CraftingRecipeJsonBuilder createTwoByTwoCheckersMealRecipe(ItemConvertible output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input).input('@', input2)
                .pattern("@#")
                .pattern("#@");
    }

    public static CraftingRecipeJsonBuilder createTwoByTwoRecipe(ItemConvertible output, int count, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, count)
                .input('#', input)
                .pattern("##")
                .pattern("##");
    }
}
