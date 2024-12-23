package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("deprecated")
public class EBRecipeGen extends FabricRecipeProvider {
    public EBRecipeGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> future) {
        super(output, future);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        createTwoByTwoRecipe(EBBlocks.CHISELED_OAK_PLANKS, 2,
                Ingredient.of(Blocks.OAK_SLAB))
                .unlockedBy(getHasName(Blocks.OAK_SLAB), has(Blocks.OAK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_OAK_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_SPRUCE_PLANKS, 2,
                Ingredient.of(Blocks.SPRUCE_SLAB))
                .unlockedBy(getHasName(Blocks.SPRUCE_SLAB), has(Blocks.SPRUCE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_SPRUCE_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_BIRCH_PLANKS, 2,
                Ingredient.of(Blocks.BIRCH_SLAB))
                .unlockedBy(getHasName(Blocks.BIRCH_SLAB), has(Blocks.BIRCH_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_BIRCH_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_JUNGLE_PLANKS, 2,
                Ingredient.of(Blocks.JUNGLE_SLAB))
                .unlockedBy(getHasName(Blocks.JUNGLE_SLAB), has(Blocks.JUNGLE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_JUNGLE_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_ACACIA_PLANKS, 2,
                Ingredient.of(Blocks.ACACIA_SLAB))
                .unlockedBy(getHasName(Blocks.ACACIA_SLAB), has(Blocks.ACACIA_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_ACACIA_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_DARK_OAK_PLANKS, 2,
                Ingredient.of(Blocks.DARK_OAK_SLAB))
                .unlockedBy(getHasName(Blocks.DARK_OAK_SLAB), has(Blocks.DARK_OAK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_DARK_OAK_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_MANGROVE_PLANKS, 2,
                Ingredient.of(Blocks.MANGROVE_SLAB))
                .unlockedBy(getHasName(Blocks.MANGROVE_SLAB), has(Blocks.MANGROVE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_MANGROVE_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_CHERRY_PLANKS, 2,
                Ingredient.of(Blocks.CHERRY_SLAB))
                .unlockedBy(getHasName(Blocks.CHERRY_SLAB), has(Blocks.CHERRY_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_CHERRY_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_BAMBOO_PLANKS, 2,
                Ingredient.of(Blocks.BAMBOO_SLAB))
                .unlockedBy(getHasName(Blocks.BAMBOO_SLAB), has(Blocks.BAMBOO_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_BAMBOO_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_CRIMSON_PLANKS, 2,
                Ingredient.of(Blocks.CRIMSON_SLAB))
                .unlockedBy(getHasName(Blocks.CRIMSON_SLAB), has(Blocks.CRIMSON_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_CRIMSON_PLANKS)));

        createTwoByTwoRecipe(EBBlocks.CHISELED_WARPED_PLANKS, 2,
                Ingredient.of(Blocks.WARPED_SLAB))
                .unlockedBy(getHasName(Blocks.WARPED_SLAB), has(Blocks.WARPED_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_WARPED_PLANKS)));
        
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OAK_MOSAIC, 1)
                .define('#', Items.OAK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.OAK_SLAB), has(Items.OAK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_MOSAIC)));

        stairBuilder(EBBlocks.OAK_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.OAK_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.OAK_MOSAIC), has(EBBlocks.OAK_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OAK_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.OAK_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.OAK_MOSAIC), has(EBBlocks.OAK_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.OAK_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.OAK_MOSAIC), has(EBBlocks.OAK_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS)));

        createVerticalStairsRecipe(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(Blocks.BAMBOO_MOSAIC))
                .unlockedBy(getHasName(Blocks.BAMBOO_MOSAIC), has(Blocks.BAMBOO_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS)));
        
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SPRUCE_MOSAIC, 1)
                .define('#', Items.SPRUCE_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.SPRUCE_SLAB), has(Items.SPRUCE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_MOSAIC)));

        stairBuilder(EBBlocks.SPRUCE_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.SPRUCE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.SPRUCE_MOSAIC), has(EBBlocks.SPRUCE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SPRUCE_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.SPRUCE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.SPRUCE_MOSAIC), has(EBBlocks.SPRUCE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SPRUCE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.SPRUCE_MOSAIC), has(EBBlocks.SPRUCE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BIRCH_MOSAIC, 1)
                .define('#', Items.BIRCH_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.BIRCH_SLAB), has(Items.BIRCH_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_MOSAIC)));

        stairBuilder(EBBlocks.BIRCH_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.BIRCH_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.BIRCH_MOSAIC), has(EBBlocks.BIRCH_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BIRCH_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.BIRCH_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.BIRCH_MOSAIC), has(EBBlocks.BIRCH_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BIRCH_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.BIRCH_MOSAIC), has(EBBlocks.BIRCH_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.JUNGLE_MOSAIC, 1)
                .define('#', Items.JUNGLE_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.JUNGLE_SLAB), has(Items.JUNGLE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_MOSAIC)));

        stairBuilder(EBBlocks.JUNGLE_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.JUNGLE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.JUNGLE_MOSAIC), has(EBBlocks.JUNGLE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.JUNGLE_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.JUNGLE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.JUNGLE_MOSAIC), has(EBBlocks.JUNGLE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.JUNGLE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.JUNGLE_MOSAIC), has(EBBlocks.JUNGLE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ACACIA_MOSAIC, 1)
                .define('#', Items.ACACIA_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.ACACIA_SLAB), has(Items.ACACIA_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_MOSAIC)));

        stairBuilder(EBBlocks.ACACIA_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.ACACIA_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.ACACIA_MOSAIC), has(EBBlocks.ACACIA_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ACACIA_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.ACACIA_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.ACACIA_MOSAIC), has(EBBlocks.ACACIA_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ACACIA_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.ACACIA_MOSAIC), has(EBBlocks.ACACIA_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_OAK_MOSAIC, 1)
                .define('#', Items.DARK_OAK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.DARK_OAK_SLAB), has(Items.DARK_OAK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_MOSAIC)));

        stairBuilder(EBBlocks.DARK_OAK_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.DARK_OAK_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.DARK_OAK_MOSAIC), has(EBBlocks.DARK_OAK_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_OAK_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.DARK_OAK_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.DARK_OAK_MOSAIC), has(EBBlocks.DARK_OAK_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.DARK_OAK_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.DARK_OAK_MOSAIC), has(EBBlocks.DARK_OAK_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MANGROVE_MOSAIC, 1)
                .define('#', Items.MANGROVE_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.MANGROVE_SLAB), has(Items.MANGROVE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_MOSAIC)));

        stairBuilder(EBBlocks.MANGROVE_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.MANGROVE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.MANGROVE_MOSAIC), has(EBBlocks.MANGROVE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MANGROVE_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.MANGROVE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.MANGROVE_MOSAIC), has(EBBlocks.MANGROVE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.MANGROVE_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.MANGROVE_MOSAIC), has(EBBlocks.MANGROVE_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHERRY_MOSAIC, 1)
                .define('#', Items.CHERRY_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.CHERRY_SLAB), has(Items.CHERRY_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_MOSAIC)));

        stairBuilder(EBBlocks.CHERRY_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.CHERRY_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.CHERRY_MOSAIC), has(EBBlocks.CHERRY_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHERRY_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.CHERRY_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.CHERRY_MOSAIC), has(EBBlocks.CHERRY_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.CHERRY_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.CHERRY_MOSAIC), has(EBBlocks.CHERRY_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRIMSON_MOSAIC, 1)
                .define('#', Items.CRIMSON_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.CRIMSON_SLAB), has(Items.CRIMSON_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_MOSAIC)));

        stairBuilder(EBBlocks.CRIMSON_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.CRIMSON_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.CRIMSON_MOSAIC), has(EBBlocks.CRIMSON_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRIMSON_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.CRIMSON_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.CRIMSON_MOSAIC), has(EBBlocks.CRIMSON_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.CRIMSON_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.CRIMSON_MOSAIC), has(EBBlocks.CRIMSON_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WARPED_MOSAIC, 1)
                .define('#', Items.WARPED_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Items.WARPED_SLAB), has(Items.WARPED_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_MOSAIC)));

        stairBuilder(EBBlocks.WARPED_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.WARPED_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.WARPED_MOSAIC), has(EBBlocks.WARPED_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WARPED_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.WARPED_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.WARPED_MOSAIC), has(EBBlocks.WARPED_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WARPED_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.WARPED_MOSAIC), has(EBBlocks.WARPED_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS)));

        createFourForFourWendysMealRecipe(EBBlocks.COBBLESTONE_BRICKS,
                Ingredient.of(Blocks.COBBLESTONE))
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLESTONE_BRICKS)));

        stairBuilder(EBBlocks.COBBLESTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.COBBLESTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS), has(EBBlocks.COBBLESTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLESTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.COBBLESTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS), has(EBBlocks.COBBLESTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLESTONE_BRICK_SLAB)));
        
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_COBBLESTONE_BRICKS, EBBlocks.COBBLESTONE_BRICKS);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICKS, Blocks.COBBLESTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_STAIRS, EBBlocks.COBBLESTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_SLAB, EBBlocks.COBBLESTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLESTONE_BRICKS, 1);

        createFourForFourWendysMealRecipe(EBBlocks.MOSSY_COBBLESTONE_BRICKS,
                Ingredient.of(Blocks.MOSSY_COBBLESTONE))
                .unlockedBy(getHasName(Blocks.MOSSY_COBBLESTONE), has(Blocks.MOSSY_COBBLESTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICKS)));

        stairBuilder(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_COBBLESTONE_BRICKS), has(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_COBBLESTONE_BRICKS), has(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, Blocks.MOSSY_COBBLESTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1);

        createFourForFourWendysMealRecipe(EBBlocks.COBBLED_DEEPSLATE_BRICKS,
                Ingredient.of(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy(getHasName(Blocks.COBBLED_DEEPSLATE), has(Blocks.COBBLED_DEEPSLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICKS)));

        stairBuilder(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COBBLED_DEEPSLATE_BRICKS), has(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB,
                Ingredient.of(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COBBLED_DEEPSLATE_BRICKS), has(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB)));

        smeltingResultFromBase(exporter, EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS, EBBlocks.COBBLED_DEEPSLATE_BRICKS);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICKS, Blocks.COBBLED_DEEPSLATE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 1);

        createFourForFourWendysMealRecipe(EBBlocks.BLACKSTONE_BRICKS,
                Ingredient.of(Blocks.BLACKSTONE))
                .unlockedBy(getHasName(Blocks.BLACKSTONE), has(Blocks.BLACKSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BLACKSTONE_BRICKS)));

        stairBuilder(EBBlocks.BLACKSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BLACKSTONE_BRICKS), has(EBBlocks.BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BLACKSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BLACKSTONE_BRICKS), has(EBBlocks.BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BLACKSTONE_BRICK_SLAB)));

        smeltingResultFromBase(exporter, EBBlocks.CRACKED_BLACKSTONE_BRICKS, EBBlocks.BLACKSTONE_BRICKS);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICKS, Blocks.BLACKSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_STAIRS, EBBlocks.BLACKSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_SLAB, EBBlocks.BLACKSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BLACKSTONE_BRICKS, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_MOSAIC, 1)
                .define('#', EBBlocks.ANCIENT_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.ANCIENT_SLAB), has(EBBlocks.ANCIENT_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_MOSAIC)));

        stairBuilder(EBBlocks.ANCIENT_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.ANCIENT_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC), has(EBBlocks.ANCIENT_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.ANCIENT_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC), has(EBBlocks.ANCIENT_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ANCIENT_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_MOSAIC), has(EBBlocks.ANCIENT_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_PLANKS, 4)
                .requires(EBTags.Items.ANCIENT_LOGS)
                .unlockedBy(getHasName(EBBlocks.ANCIENT_LOG), has(EBBlocks.ANCIENT_LOG))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.ANCIENT_PLANKS))));

        stairBuilder(EBBlocks.ANCIENT_STAIRS,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_SLAB,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANCIENT_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_VERTICAL_STAIRS)));

        fenceBuilder(EBBlocks.ANCIENT_FENCE,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_FENCE)));

        fenceGateBuilder(EBBlocks.ANCIENT_FENCE_GATE,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_FENCE_GATE)));

        doorBuilder(EBBlocks.ANCIENT_DOOR,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_DOOR)));

        trapdoorBuilder(EBBlocks.ANCIENT_TRAPDOOR,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_TRAPDOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.ANCIENT_PRESSURE_PLATE, 1)
                .define('#', EBBlocks.ANCIENT_PLANKS)
                .pattern("##")
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_PRESSURE_PLATE)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.ANCIENT_BUTTON, 1)
                .requires(EBBlocks.ANCIENT_PLANKS)
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_BUTTON)));

        signBuilder(EBItems.ANCIENT_SIGN,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBItems.ANCIENT_SIGN)));

        hangingSign(exporter, EBItems.ANCIENT_HANGING_SIGN, EBBlocks.STRIPPED_ANCIENT_LOG);

        createTwoByTwoRecipe(EBBlocks.CHISELED_ANCIENT_PLANKS, 2,
                Ingredient.of(EBBlocks.ANCIENT_SLAB))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_SLAB), has(EBBlocks.ANCIENT_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_ANCIENT_PLANKS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_MOSAIC, 1)
                .define('#', EBBlocks.GLOOM_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.GLOOM_SLAB), has(EBBlocks.GLOOM_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_MOSAIC)));

        stairBuilder(EBBlocks.GLOOM_MOSAIC_STAIRS,
                Ingredient.of(EBBlocks.GLOOM_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.GLOOM_MOSAIC), has(EBBlocks.GLOOM_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_MOSAIC_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_MOSAIC_SLAB,
                Ingredient.of(EBBlocks.GLOOM_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.GLOOM_MOSAIC), has(EBBlocks.GLOOM_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_MOSAIC_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.GLOOM_MOSAIC))
                .unlockedBy(getHasName(EBBlocks.GLOOM_MOSAIC), has(EBBlocks.GLOOM_MOSAIC))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_MOSAIC_VERTICAL_STAIRS)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_PLANKS, 4)
                .requires(EBTags.Items.GLOOM_LOGS)
                .unlockedBy(getHasName(EBBlocks.GLOOM_LOG), has(EBBlocks.GLOOM_LOG))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.GLOOM_PLANKS))));

        stairBuilder(EBBlocks.GLOOM_STAIRS,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_SLAB,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GLOOM_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_VERTICAL_STAIRS)));

        fenceBuilder(EBBlocks.GLOOM_FENCE,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_FENCE)));

        fenceGateBuilder(EBBlocks.GLOOM_FENCE_GATE,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_FENCE_GATE)));

        doorBuilder(EBBlocks.GLOOM_DOOR,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_DOOR)));

        trapdoorBuilder(EBBlocks.GLOOM_TRAPDOOR,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_TRAPDOOR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.GLOOM_PRESSURE_PLATE, 1)
                .define('#', EBBlocks.GLOOM_PLANKS)
                .pattern("##")
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_PRESSURE_PLATE)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.GLOOM_BUTTON, 1)
                .requires(EBBlocks.GLOOM_PLANKS)
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_BUTTON)));

        signBuilder(EBItems.GLOOM_SIGN,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBItems.GLOOM_SIGN)));

        hangingSign(exporter, EBItems.GLOOM_HANGING_SIGN, EBBlocks.STRIPPED_GLOOM_LOG);

        createTwoByTwoRecipe(EBBlocks.CHISELED_GLOOM_PLANKS, 2,
                Ingredient.of(EBBlocks.GLOOM_SLAB))
                .unlockedBy(getHasName(EBBlocks.GLOOM_SLAB), has(EBBlocks.GLOOM_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_GLOOM_PLANKS)));

        createFourForFourWendysMealRecipe(EBBlocks.COPPER_BRICKS,
                Ingredient.of(Blocks.CUT_COPPER))
                .unlockedBy(getHasName(Blocks.CUT_COPPER), has(Blocks.CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COPPER_BRICKS)));

        stairBuilder(EBBlocks.COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.COPPER_BLOCK)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COPPER_PRESSURE_PLATE)));
        
        createFourForFourWendysMealRecipe(EBBlocks.EXPOSED_COPPER_BRICKS,
                Ingredient.of(Blocks.EXPOSED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.EXPOSED_CUT_COPPER), has(Blocks.EXPOSED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.EXPOSED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_BRICKS), has(EBBlocks.EXPOSED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.EXPOSED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_BRICKS), has(EBBlocks.EXPOSED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.EXPOSED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_BRICKS), has(EBBlocks.EXPOSED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.EXPOSED_COPPER)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE)));
        
        createFourForFourWendysMealRecipe(EBBlocks.WEATHERED_COPPER_BRICKS,
                Ingredient.of(Blocks.WEATHERED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WEATHERED_CUT_COPPER), has(Blocks.WEATHERED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WEATHERED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_BRICKS), has(EBBlocks.WEATHERED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.WEATHERED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_BRICKS), has(EBBlocks.WEATHERED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WEATHERED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_BRICKS), has(EBBlocks.WEATHERED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.WEATHERED_COPPER)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.OXIDIZED_COPPER_BRICKS,
                Ingredient.of(Blocks.OXIDIZED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.OXIDIZED_CUT_COPPER), has(Blocks.OXIDIZED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_BRICKS), has(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_BRICKS), has(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_BRICKS), has(EBBlocks.OXIDIZED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.OXIDIZED_COPPER)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_COPPER_BRICKS,
                Ingredient.of(Blocks.WAXED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_CUT_COPPER), has(Blocks.WAXED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.WAXED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WAXED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_COPPER_BRICKS), has(EBBlocks.WAXED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.WAXED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_COPPER_BRICKS), has(EBBlocks.WAXED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WAXED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_COPPER_BRICKS), has(EBBlocks.WAXED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.WAXED_COPPER_BLOCK)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.WAXED_COPPER_BLOCK), has(Blocks.WAXED_COPPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS,
                Ingredient.of(Blocks.WAXED_EXPOSED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_CUT_COPPER), has(Blocks.WAXED_EXPOSED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS), has(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS), has(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS), has(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.WAXED_EXPOSED_COPPER)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), has(Blocks.WAXED_EXPOSED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS,
                Ingredient.of(Blocks.WAXED_WEATHERED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_CUT_COPPER), has(Blocks.WAXED_WEATHERED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS), has(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS), has(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS), has(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.WAXED_WEATHERED_COPPER)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_COPPER), has(Blocks.WAXED_WEATHERED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE)));

        createFourForFourWendysMealRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS,
                Ingredient.of(Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_CUT_COPPER), has(Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS)));

        stairBuilder(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS), has(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB,
                Ingredient.of(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS), has(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS), has(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, 1)
                .define('#', Blocks.WAXED_OXIDIZED_COPPER)
                .pattern("##")
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_COPPER), has(Blocks.WAXED_OXIDIZED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICKS, Blocks.CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_STAIRS, EBBlocks.COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_SLAB, EBBlocks.COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.COPPER_PRESSURE_PLATE, Blocks.COPPER_BLOCK, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICKS, Blocks.EXPOSED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_SLAB, EBBlocks.EXPOSED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.EXPOSED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Blocks.EXPOSED_COPPER, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICKS, Blocks.WEATHERED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_SLAB, EBBlocks.WEATHERED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WEATHERED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WEATHERED_COPPER, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICKS, Blocks.OXIDIZED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_SLAB, EBBlocks.OXIDIZED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.OXIDIZED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICKS, Blocks.WAXED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_SLAB, EBBlocks.WAXED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_PRESSURE_PLATE, Blocks.WAXED_COPPER_BLOCK, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, Blocks.WAXED_EXPOSED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, Blocks.WAXED_EXPOSED_COPPER, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, Blocks.WAXED_WEATHERED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WAXED_WEATHERED_COPPER, 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, Blocks.WAXED_OXIDIZED_CUT_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.WAXED_OXIDIZED_COPPER, 2);
    
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICKS, 1, Ingredient.of(EBBlocks.COPPER_BRICKS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICK_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_STAIRS), has(EBBlocks.COPPER_BRICK_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICK_SLAB, 1, Ingredient.of(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_SLAB), has(EBBlocks.COPPER_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), has(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS, 1, Ingredient.of(EBBlocks.COPPER_BRICKS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_STAIRS), has(EBBlocks.COPPER_BRICK_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB, 1, Ingredient.of(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_SLAB), has(EBBlocks.COPPER_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), has(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS, 1, Ingredient.of(EBBlocks.COPPER_BRICKS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_STAIRS), has(EBBlocks.COPPER_BRICK_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB, 1, Ingredient.of(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_SLAB), has(EBBlocks.COPPER_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), has(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS, 1, Ingredient.of(EBBlocks.COPPER_BRICKS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS), has(EBBlocks.COPPER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_STAIRS), has(EBBlocks.COPPER_BRICK_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB, 1, Ingredient.of(EBBlocks.COPPER_BRICK_SLAB.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_SLAB), has(EBBlocks.COPPER_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS, 1, Ingredient.of(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS), has(EBBlocks.COPPER_BRICK_VERTICAL_STAIRS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_VERTICAL_STAIRS) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_COPPER_PRESSURE_PLATE, 1, Ingredient.of(EBBlocks.COPPER_PRESSURE_PLATE.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_PRESSURE_PLATE), has(EBBlocks.COPPER_PRESSURE_PLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE, 1, Ingredient.of(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE.asItem()))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE), has(EBBlocks.EXPOSED_COPPER_PRESSURE_PLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE, 1, Ingredient.of(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE.asItem()))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE), has(EBBlocks.WEATHERED_COPPER_PRESSURE_PLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));
        
        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE, 1, Ingredient.of(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE.asItem()))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE), has(EBBlocks.OXIDIZED_COPPER_PRESSURE_PLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_COPPER_BUTTON, 1, Ingredient.of(EBBlocks.COPPER_BUTTON.asItem()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BUTTON), has(EBBlocks.COPPER_BUTTON))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BUTTON) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, 1, Ingredient.of(EBBlocks.EXPOSED_COPPER_BUTTON.asItem()))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_BUTTON), has(EBBlocks.EXPOSED_COPPER_BUTTON))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, 1, Ingredient.of(EBBlocks.WEATHERED_COPPER_BUTTON.asItem()))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_BUTTON), has(EBBlocks.WEATHERED_COPPER_BUTTON))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON) + "_from_honeycomb"));

        createWaxedRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, 1, Ingredient.of(EBBlocks.OXIDIZED_COPPER_BUTTON.asItem()))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_BUTTON), has(EBBlocks.OXIDIZED_COPPER_BUTTON))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON) + "_from_honeycomb"));

        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_BUTTON, Blocks.WAXED_COPPER_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, Blocks.WAXED_EXPOSED_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, Blocks.WAXED_WEATHERED_COPPER, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, Blocks.WAXED_OXIDIZED_COPPER, 4);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.COPPER_BUTTON, 1)
                .requires(Blocks.COPPER_BLOCK)
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.EXPOSED_COPPER_BUTTON, 1)
                .requires(Blocks.EXPOSED_COPPER)
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.WEATHERED_COPPER_BUTTON, 1)
                .requires(Blocks.WEATHERED_COPPER)
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.OXIDIZED_COPPER_BUTTON, 1)
                .requires(Blocks.OXIDIZED_COPPER)
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.WAXED_COPPER_BUTTON, 1)
                .requires(Blocks.WAXED_COPPER_BLOCK)
                .unlockedBy(getHasName(Blocks.WAXED_COPPER_BLOCK), has(Blocks.WAXED_COPPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.WAXED_EXPOSED_COPPER_BUTTON, 1)
                .requires(Blocks.WAXED_EXPOSED_COPPER)
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_COPPER), has(Blocks.WAXED_EXPOSED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.WAXED_WEATHERED_COPPER_BUTTON, 1)
                .requires(Blocks.WAXED_WEATHERED_COPPER)
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_COPPER), has(Blocks.WAXED_WEATHERED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BUTTON)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON, 1)
                .requires(Blocks.WAXED_OXIDIZED_COPPER)
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_COPPER), has(Blocks.WAXED_OXIDIZED_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BUTTON)));

        createTwoByTwoRecipe(EBBlocks.IRON_BRICKS, 1,
                Ingredient.of(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.IRON_BRICKS)));

        stairBuilder(EBBlocks.IRON_BRICK_STAIRS,
                Ingredient.of(EBBlocks.IRON_BRICKS))
                .unlockedBy(getHasName(EBBlocks.IRON_BRICKS), has(EBBlocks.IRON_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.IRON_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_SLAB,
                Ingredient.of(EBBlocks.IRON_BRICKS))
                .unlockedBy(getHasName(EBBlocks.IRON_BRICKS), has(EBBlocks.IRON_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.IRON_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.IRON_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.IRON_BRICKS))
                .unlockedBy(getHasName(EBBlocks.IRON_BRICKS), has(EBBlocks.IRON_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.IRON_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICKS, Blocks.IRON_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_STAIRS, EBBlocks.IRON_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_SLAB, EBBlocks.IRON_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_BRICK_VERTICAL_STAIRS, EBBlocks.IRON_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.EMERALD_BRICKS, 1,
                Ingredient.of(Items.EMERALD))
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EMERALD_BRICKS)));

        stairBuilder(EBBlocks.EMERALD_BRICK_STAIRS,
                Ingredient.of(EBBlocks.EMERALD_BRICKS))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS), has(EBBlocks.EMERALD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EMERALD_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_SLAB,
                Ingredient.of(EBBlocks.EMERALD_BRICKS))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS), has(EBBlocks.EMERALD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EMERALD_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.EMERALD_BRICKS))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS), has(EBBlocks.EMERALD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICKS, Blocks.EMERALD_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_STAIRS, EBBlocks.EMERALD_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_SLAB, EBBlocks.EMERALD_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_VERTICAL_STAIRS, EBBlocks.EMERALD_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.GOLD_BRICKS, 1,
                Ingredient.of(Items.GOLD_INGOT))
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GOLD_BRICKS)));

        stairBuilder(EBBlocks.GOLD_BRICK_STAIRS,
                Ingredient.of(EBBlocks.GOLD_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GOLD_BRICKS), has(EBBlocks.GOLD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GOLD_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_SLAB,
                Ingredient.of(EBBlocks.GOLD_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GOLD_BRICKS), has(EBBlocks.GOLD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GOLD_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.GOLD_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GOLD_BRICKS), has(EBBlocks.GOLD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GOLD_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICKS, Blocks.GOLD_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_STAIRS, EBBlocks.GOLD_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_SLAB, EBBlocks.GOLD_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_BRICK_VERTICAL_STAIRS, EBBlocks.GOLD_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.LAPIS_BRICKS, 1,
                Ingredient.of(Items.LAPIS_LAZULI))
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.LAPIS_BRICKS)));

        stairBuilder(EBBlocks.LAPIS_BRICK_STAIRS,
                Ingredient.of(EBBlocks.LAPIS_BRICKS))
                .unlockedBy(getHasName(EBBlocks.LAPIS_BRICKS), has(EBBlocks.LAPIS_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.LAPIS_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_SLAB,
                Ingredient.of(EBBlocks.LAPIS_BRICKS))
                .unlockedBy(getHasName(EBBlocks.LAPIS_BRICKS), has(EBBlocks.LAPIS_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.LAPIS_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.LAPIS_BRICKS))
                .unlockedBy(getHasName(EBBlocks.LAPIS_BRICKS), has(EBBlocks.LAPIS_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICKS, Blocks.LAPIS_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_STAIRS, EBBlocks.LAPIS_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_SLAB, EBBlocks.LAPIS_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_VERTICAL_STAIRS, EBBlocks.LAPIS_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.DIAMOND_BRICKS, 1,
                Ingredient.of(Items.DIAMOND))
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIAMOND_BRICKS)));

        stairBuilder(EBBlocks.DIAMOND_BRICK_STAIRS,
                Ingredient.of(EBBlocks.DIAMOND_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIAMOND_BRICKS), has(EBBlocks.DIAMOND_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIAMOND_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_SLAB,
                Ingredient.of(EBBlocks.DIAMOND_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIAMOND_BRICKS), has(EBBlocks.DIAMOND_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIAMOND_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.DIAMOND_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIAMOND_BRICKS), has(EBBlocks.DIAMOND_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICKS, Blocks.DIAMOND_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_STAIRS, EBBlocks.DIAMOND_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_SLAB, EBBlocks.DIAMOND_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_VERTICAL_STAIRS, EBBlocks.DIAMOND_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.NETHERITE_BRICKS, 1,
                Ingredient.of(Items.NETHERITE_INGOT))
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.NETHERITE_BRICKS)));

        stairBuilder(EBBlocks.NETHERITE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.NETHERITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.NETHERITE_BRICKS), has(EBBlocks.NETHERITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.NETHERITE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_SLAB,
                Ingredient.of(EBBlocks.NETHERITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.NETHERITE_BRICKS), has(EBBlocks.NETHERITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.NETHERITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.NETHERITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.NETHERITE_BRICKS), has(EBBlocks.NETHERITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICKS, Blocks.NETHERITE_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_STAIRS, EBBlocks.NETHERITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_SLAB, EBBlocks.NETHERITE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHERITE_BRICK_VERTICAL_STAIRS, EBBlocks.NETHERITE_BRICKS, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SEA_GLASS, 4)
                .define('#', Items.PRISMARINE_CRYSTALS).define('@', Blocks.GLASS.asItem())
                .pattern("#@#")
                .pattern("@ @")
                .pattern("#@#")
                .unlockedBy(getHasName(Items.PRISMARINE_CRYSTALS), has(Items.PRISMARINE_CRYSTALS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.SCARLET_SEA_GLASS, 8,
                Ingredient.of(EBBlocks.SEA_GLASS), Ingredient.of(Items.RED_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS), has(EBBlocks.SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SCARLET_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.VERDANT_SEA_GLASS, 8,
                Ingredient.of(EBBlocks.SEA_GLASS), Ingredient.of(Items.LIME_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS), has(EBBlocks.SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.VERDANT_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.ROSE_SEA_GLASS, 8,
                Ingredient.of(EBBlocks.SEA_GLASS), Ingredient.of(Items.PINK_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS), has(EBBlocks.SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ROSE_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.AQUA_SEA_GLASS, 8,
                Ingredient.of(EBBlocks.SEA_GLASS), Ingredient.of(Items.BLUE_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS), has(EBBlocks.SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.AQUA_SEA_GLASS)));

        createDyeEightRecipe(EBBlocks.FUCHSIA_SEA_GLASS, 8,
                Ingredient.of(EBBlocks.SEA_GLASS), Ingredient.of(Items.MAGENTA_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS), has(EBBlocks.SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.FUCHSIA_SEA_GLASS)));

        createPaneRecipe(EBBlocks.SEA_GLASS_PANE, 16,
                Ingredient.of(EBBlocks.SEA_GLASS))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS), has(EBBlocks.SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.SCARLET_SEA_GLASS_PANE, 16,
                Ingredient.of(EBBlocks.SCARLET_SEA_GLASS))
                .unlockedBy(getHasName(EBBlocks.SCARLET_SEA_GLASS), has(EBBlocks.SCARLET_SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SCARLET_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.FUCHSIA_SEA_GLASS_PANE, 16,
                Ingredient.of(EBBlocks.FUCHSIA_SEA_GLASS))
                .unlockedBy(getHasName(EBBlocks.FUCHSIA_SEA_GLASS), has(EBBlocks.FUCHSIA_SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.FUCHSIA_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.AQUA_SEA_GLASS_PANE, 16,
                Ingredient.of(EBBlocks.AQUA_SEA_GLASS))
                .unlockedBy(getHasName(EBBlocks.AQUA_SEA_GLASS), has(EBBlocks.AQUA_SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.AQUA_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.VERDANT_SEA_GLASS_PANE, 16,
                Ingredient.of(EBBlocks.VERDANT_SEA_GLASS))
                .unlockedBy(getHasName(EBBlocks.VERDANT_SEA_GLASS), has(EBBlocks.VERDANT_SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.VERDANT_SEA_GLASS_PANE)));

        createPaneRecipe(EBBlocks.ROSE_SEA_GLASS_PANE, 16,
                Ingredient.of(EBBlocks.ROSE_SEA_GLASS))
                .unlockedBy(getHasName(EBBlocks.ROSE_SEA_GLASS), has(EBBlocks.ROSE_SEA_GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ROSE_SEA_GLASS_PANE)));

        createDyeEightRecipe(EBBlocks.SCARLET_SEA_GLASS_PANE, 8,
                Ingredient.of(EBBlocks.SEA_GLASS_PANE), Ingredient.of(Items.RED_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS_PANE), has(EBBlocks.SEA_GLASS_PANE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SCARLET_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.VERDANT_SEA_GLASS_PANE, 8,
                Ingredient.of(EBBlocks.SEA_GLASS_PANE), Ingredient.of(Items.LIME_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS_PANE), has(EBBlocks.SEA_GLASS_PANE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.VERDANT_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.ROSE_SEA_GLASS_PANE, 8,
                Ingredient.of(EBBlocks.SEA_GLASS_PANE), Ingredient.of(Items.PINK_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS_PANE), has(EBBlocks.SEA_GLASS_PANE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ROSE_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.AQUA_SEA_GLASS_PANE, 8,
                Ingredient.of(EBBlocks.SEA_GLASS_PANE), Ingredient.of(Items.BLUE_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS_PANE), has(EBBlocks.SEA_GLASS_PANE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.AQUA_SEA_GLASS_PANE) + "_from_dye"));

        createDyeEightRecipe(EBBlocks.FUCHSIA_SEA_GLASS_PANE, 8,
                Ingredient.of(EBBlocks.SEA_GLASS_PANE), Ingredient.of(Items.MAGENTA_DYE))
                .unlockedBy(getHasName(EBBlocks.SEA_GLASS_PANE), has(EBBlocks.SEA_GLASS_PANE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.FUCHSIA_SEA_GLASS_PANE) + "_from_dye"));

        createTwoByTwoRecipe(EBBlocks.BONE_BRICKS, 4,
                Ingredient.of(Items.BONE_BLOCK))
                .unlockedBy(getHasName(Items.BONE_BLOCK), has(Items.BONE_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BONE_BRICKS)));

        stairBuilder(EBBlocks.BONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.BONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BONE_BRICKS), has(EBBlocks.BONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.BONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BONE_BRICKS), has(EBBlocks.BONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BONE_BRICKS), has(EBBlocks.BONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BONE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.BONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.BONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BONE_BRICKS), has(EBBlocks.BONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICKS, Blocks.BONE_BLOCK, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_STAIRS, EBBlocks.BONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_SLAB, EBBlocks.BONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_VERTICAL_STAIRS, EBBlocks.BONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BONE_BRICK_WALL, EBBlocks.BONE_BRICKS, 1);

        for (DyeColor colors : DyeColor.values()) {
            carpet(exporter, EBBlocks.getDyedKnittedCarpets(colors.getId()), EBBlocks.getDyedKnittedWools(colors.getId()));
        }

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_MAGMA_BLOCK, 2)
                .define('#', EBBlocks.SOUL_SANDSTONE).define('@', Items.MAGMA_CREAM)
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.MAGMA_CREAM), has(Items.MAGMA_CREAM))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_MAGMA_BLOCK)));

        createTwoByTwoRecipe(EBBlocks.SOUL_SANDSTONE, 1,
                Ingredient.of(Items.SOUL_SAND))
                .unlockedBy(getHasName(Items.SOUL_SAND), has(Items.SOUL_SAND))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE)));

        stairBuilder(EBBlocks.SOUL_SANDSTONE_STAIRS,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE), has(EBBlocks.SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_SLAB,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE), has(EBBlocks.SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE), has(EBBlocks.SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.SOUL_SANDSTONE_WALL, 6,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE), has(EBBlocks.SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_STAIRS, EBBlocks.SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_SLAB, EBBlocks.SOUL_SANDSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_WALL, EBBlocks.SOUL_SANDSTONE, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE, EBBlocks.SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_SOUL_SANDSTONE, EBBlocks.SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_SOUL_SANDSTONE_SLAB, EBBlocks.CUT_SOUL_SANDSTONE, 2);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE, 1)
                .define('#', EBBlocks.SOUL_SANDSTONE_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_SLAB), has(EBBlocks.SOUL_SANDSTONE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_SOUL_SANDSTONE)));

        createTwoByTwoRecipe(EBBlocks.CUT_SOUL_SANDSTONE, 4,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE), has(EBBlocks.SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CUT_SOUL_SANDSTONE)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_SOUL_SANDSTONE_SLAB,
                Ingredient.of(EBBlocks.CUT_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.CUT_SOUL_SANDSTONE), has(EBBlocks.CUT_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CUT_SOUL_SANDSTONE_SLAB)));

        oreSmelting(exporter, List.of(EBBlocks.SOUL_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE, 0.1F, 200, "smooth_soul_sandstone");

        stairBuilder(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_SOUL_SANDSTONE), has(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB,
                Ingredient.of(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_SOUL_SANDSTONE), has(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_SOUL_SANDSTONE), has(EBBlocks.SMOOTH_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS, EBBlocks.SMOOTH_SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, EBBlocks.SMOOTH_SOUL_SANDSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.SMOOTH_SOUL_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_SANDSTONE, 4,
                Ingredient.of(Blocks.SANDSTONE))
                .unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SANDSTONE)));

        stairBuilder(EBBlocks.POLISHED_SANDSTONE_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SANDSTONE), has(EBBlocks.POLISHED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SANDSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_SLAB,
                Ingredient.of(EBBlocks.POLISHED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SANDSTONE), has(EBBlocks.POLISHED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SANDSTONE), has(EBBlocks.POLISHED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE, Blocks.SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_STAIRS, EBBlocks.POLISHED_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_SLAB, EBBlocks.POLISHED_SANDSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.SANDSTONE_BRICKS, 4,
                Ingredient.of(EBBlocks.POLISHED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SANDSTONE), has(EBBlocks.POLISHED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_BRICKS)));

        stairBuilder(EBBlocks.SANDSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_BRICKS), has(EBBlocks.SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_BRICKS), has(EBBlocks.SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_BRICKS), has(EBBlocks.SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SANDSTONE_BRICKS, 1)
                .define('#', EBBlocks.SANDSTONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_BRICK_SLAB), has(EBBlocks.SANDSTONE_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_SANDSTONE_BRICKS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SANDSTONE_BRICKS, 2)
                .define('#', EBBlocks.CHISELED_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.CHISELED_SANDSTONE_BRICKS), has(EBBlocks.CHISELED_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DECORATED_SANDSTONE_BRICKS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICKS, EBBlocks.POLISHED_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_STAIRS, EBBlocks.SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_SLAB, EBBlocks.SANDSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SANDSTONE_BRICKS, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SANDSTONE_BRICKS, EBBlocks.SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SANDSTONE_BRICKS, EBBlocks.SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_PILLAR, EBBlocks.SANDSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SANDSTONE_TILES, 4,
                Ingredient.of(EBBlocks.SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_BRICKS), has(EBBlocks.SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_TILES)));

        stairBuilder(EBBlocks.SANDSTONE_TILE_STAIRS,
                Ingredient.of(EBBlocks.SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_TILES), has(EBBlocks.SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_SLAB,
                Ingredient.of(EBBlocks.SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_TILES), has(EBBlocks.SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SANDSTONE_TILES), has(EBBlocks.SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILES, EBBlocks.SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_STAIRS, EBBlocks.SANDSTONE_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_SLAB, EBBlocks.SANDSTONE_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SANDSTONE_TILES, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_RED_SANDSTONE, 4,
                Ingredient.of(Blocks.RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_RED_SANDSTONE)));

        stairBuilder(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_RED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_RED_SANDSTONE), has(EBBlocks.POLISHED_RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_RED_SANDSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_SLAB,
                Ingredient.of(EBBlocks.POLISHED_RED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_RED_SANDSTONE), has(EBBlocks.POLISHED_RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_RED_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_RED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_RED_SANDSTONE), has(EBBlocks.POLISHED_RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE, Blocks.RED_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_STAIRS, EBBlocks.POLISHED_RED_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_SLAB, EBBlocks.POLISHED_RED_SANDSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_RED_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_RED_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.RED_SANDSTONE_BRICKS, 4,
                Ingredient.of(EBBlocks.POLISHED_RED_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_RED_SANDSTONE), has(EBBlocks.POLISHED_RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_BRICKS)));

        stairBuilder(EBBlocks.RED_SANDSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.RED_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_BRICKS), has(EBBlocks.RED_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.RED_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_BRICKS), has(EBBlocks.RED_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.RED_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_BRICKS), has(EBBlocks.RED_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_RED_SANDSTONE_BRICKS, 1)
                .define('#', EBBlocks.RED_SANDSTONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_BRICK_SLAB), has(EBBlocks.RED_SANDSTONE_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, 2)
                .define('#', EBBlocks.CHISELED_RED_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS), has(EBBlocks.CHISELED_RED_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DECORATED_RED_SANDSTONE_BRICKS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICKS, EBBlocks.POLISHED_RED_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_STAIRS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_SLAB, EBBlocks.RED_SANDSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_BRICKS, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_RED_SANDSTONE_BRICKS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_RED_SANDSTONE_BRICKS, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_PILLAR, EBBlocks.RED_SANDSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.RED_SANDSTONE_TILES, 4,
                Ingredient.of(EBBlocks.RED_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_BRICKS), has(EBBlocks.RED_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_TILES)));

        stairBuilder(EBBlocks.RED_SANDSTONE_TILE_STAIRS,
                Ingredient.of(EBBlocks.RED_SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_TILES), has(EBBlocks.RED_SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_SLAB,
                Ingredient.of(EBBlocks.RED_SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_TILES), has(EBBlocks.RED_SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.RED_SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.RED_SANDSTONE_TILES), has(EBBlocks.RED_SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILES, EBBlocks.RED_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_STAIRS, EBBlocks.RED_SANDSTONE_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_SLAB, EBBlocks.RED_SANDSTONE_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.RED_SANDSTONE_TILES, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_SOUL_SANDSTONE, 4,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE), has(EBBlocks.SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE)));

        stairBuilder(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SOUL_SANDSTONE), has(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB,
                Ingredient.of(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SOUL_SANDSTONE), has(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SOUL_SANDSTONE), has(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE, EBBlocks.SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_STAIRS, EBBlocks.POLISHED_SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_SLAB, EBBlocks.POLISHED_SOUL_SANDSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_SOUL_SANDSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_SOUL_SANDSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.SOUL_SANDSTONE_BRICKS, 4,
                Ingredient.of(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_SOUL_SANDSTONE), has(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_BRICKS)));

        stairBuilder(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_BRICKS), has(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_BRICKS), has(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_BRICKS), has(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS, 1)
                .define('#', EBBlocks.SOUL_SANDSTONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB), has(EBBlocks.SOUL_SANDSTONE_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, 2)
                .define('#', EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS), has(EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICKS, EBBlocks.POLISHED_SOUL_SANDSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_STAIRS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_SLAB, EBBlocks.SOUL_SANDSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DECORATED_SOUL_SANDSTONE_BRICKS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SOUL_SANDSTONE_BRICKS, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_PILLAR, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SOUL_SANDSTONE_TILES, 4,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_BRICKS), has(EBBlocks.SOUL_SANDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_TILES)));

        stairBuilder(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_TILES), has(EBBlocks.SOUL_SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_SLAB,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_TILES), has(EBBlocks.SOUL_SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SOUL_SANDSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SOUL_SANDSTONE_TILES), has(EBBlocks.SOUL_SANDSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILES, EBBlocks.SOUL_SANDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_STAIRS, EBBlocks.SOUL_SANDSTONE_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_SLAB, EBBlocks.SOUL_SANDSTONE_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_TILE_VERTICAL_STAIRS, EBBlocks.SOUL_SANDSTONE_TILES, 1);

        createLadderRecipe(EBBlocks.SPRUCE_LADDER,
                Ingredient.of(Blocks.SPRUCE_PLANKS))
                .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_LADDER)));

        createLadderRecipe(EBBlocks.BIRCH_LADDER,
                Ingredient.of(Blocks.BIRCH_PLANKS))
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_LADDER)));

        createLadderRecipe(EBBlocks.JUNGLE_LADDER,
                Ingredient.of(Blocks.JUNGLE_PLANKS))
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_LADDER)));

        createLadderRecipe(EBBlocks.ACACIA_LADDER,
                Ingredient.of(Blocks.ACACIA_PLANKS))
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_LADDER)));

        createLadderRecipe(EBBlocks.DARK_OAK_LADDER,
                Ingredient.of(Blocks.DARK_OAK_PLANKS))
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_LADDER)));

        createLadderRecipe(EBBlocks.MANGROVE_LADDER,
                Ingredient.of(Blocks.MANGROVE_PLANKS))
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_LADDER)));

        createLadderRecipe(EBBlocks.CHERRY_LADDER,
                Ingredient.of(Blocks.CHERRY_PLANKS))
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_LADDER)));

        createLadderRecipe(EBBlocks.BAMBOO_LADDER,
                Ingredient.of(Blocks.BAMBOO_PLANKS))
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_LADDER)));

        createLadderRecipe(EBBlocks.CRIMSON_LADDER,
                Ingredient.of(Blocks.CRIMSON_PLANKS))
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_LADDER)));

        createLadderRecipe(EBBlocks.WARPED_LADDER,
                Ingredient.of(Blocks.WARPED_PLANKS))
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_LADDER)));

        createLadderRecipe(EBBlocks.ANCIENT_LADDER,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_LADDER)));

        createLadderRecipe(EBBlocks.GLOOM_LADDER,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_LADDER)));

        createLadderRecipe(Blocks.LADDER,
                Ingredient.of(Blocks.OAK_PLANKS))
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(Blocks.LADDER)));

        createTwoByTwoRecipe(EBBlocks.SPRUCE_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.SPRUCE_PLANKS))
                .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.WARPED_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.WARPED_PLANKS))
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.CRIMSON_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.CRIMSON_PLANKS))
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.BAMBOO_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.BAMBOO_PLANKS))
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.CHERRY_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.CHERRY_PLANKS))
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.MANGROVE_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.MANGROVE_PLANKS))
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.DARK_OAK_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.DARK_OAK_PLANKS))
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.ACACIA_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.ACACIA_PLANKS))
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.JUNGLE_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.JUNGLE_PLANKS))
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.BIRCH_CRAFTING_TABLE, 1,
                Ingredient.of(Blocks.BIRCH_PLANKS))
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.ANCIENT_CRAFTING_TABLE, 1,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_PLANKS), has(EBBlocks.ANCIENT_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_CRAFTING_TABLE)));

        createTwoByTwoRecipe(EBBlocks.GLOOM_CRAFTING_TABLE, 1,
                Ingredient.of(EBBlocks.GLOOM_PLANKS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_PLANKS), has(EBBlocks.GLOOM_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_CRAFTING_TABLE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.CRAFTER, 1)
                .define('#', Items.IRON_INGOT).define('@', Items.REDSTONE).define('!', Items.DROPPER).define('$', EBTags.Items.CRAFTING_TABLES)
                .pattern("###")
                .pattern("#$#")
                .pattern("@!@")
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .unlockedBy(getHasName(Items.DROPPER), has(Items.DROPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(Blocks.CRAFTER)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.WOODEN_MUG, 3)
                .define('#', ItemTags.WOODEN_SLABS).define('@', Items.STICK)
                .pattern("@##")
                .pattern(" ##")
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WOODEN_MUG)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.GLASS_JAR, 3)
                .define('#', Items.GLASS)
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(Items.GLASS), has(Items.GLASS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLASS_JAR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.GLASS_JAR_OF_FIRE, 1)
                .define('#', EBBlocks.GLASS_JAR).define('@', Items.FIRE_CHARGE)
                .pattern("#")
                .pattern("@")
                .unlockedBy(getHasName(EBBlocks.GLASS_JAR), has(EBBlocks.GLASS_JAR))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLASS_JAR_OF_FIRE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.GLASS_JAR_OF_SOUL_FIRE, 1)
                .define('#', EBBlocks.GLASS_JAR).define('@', Items.FIRE_CHARGE).define('!', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern("#")
                .pattern("@")
                .pattern("!")
                .unlockedBy(getHasName(EBBlocks.GLASS_JAR), has(EBBlocks.GLASS_JAR))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLASS_JAR_OF_SOUL_FIRE)));

        stairBuilder(EBBlocks.QUARTZ_BRICK_STAIRS,
                Ingredient.of(Blocks.QUARTZ_BRICKS))
                .unlockedBy(getHasName(Blocks.QUARTZ_BRICKS), has(Blocks.QUARTZ_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.QUARTZ_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_SLAB,
                Ingredient.of(Blocks.QUARTZ_BRICKS))
                .unlockedBy(getHasName(Blocks.QUARTZ_BRICKS), has(Blocks.QUARTZ_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.QUARTZ_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.QUARTZ_BRICKS))
                .unlockedBy(getHasName(Blocks.QUARTZ_BRICKS), has(Blocks.QUARTZ_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.QUARTZ_BRICK_WALL, 6,
                Ingredient.of(Blocks.QUARTZ_BRICKS))
                .unlockedBy(getHasName(Blocks.QUARTZ_BRICKS), has(Blocks.QUARTZ_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.QUARTZ_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_VERTICAL_STAIRS, Blocks.QUARTZ_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileStairs(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileSlab(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()), 2);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()), EBBlocks.getDyedTerracottaTiles(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stairBuilder(EBBlocks.getDyedTerracottaTileStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedTerracottaTiles(colors.getId())), has(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTileStairs(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedTerracottaTileSlab(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedTerracottaTiles(colors.getId())), has(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTileSlab(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            createVerticalStairsRecipe(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedTerracottaTiles(colors.getId())), has(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTileVerticalStairs(colors.getId()))));
        }

        createTwoByTwoCheckersMealRecipe(EBBlocks.TERRACOTTA_TILES, 4,
                Ingredient.of(Blocks.TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.TERRACOTTA), has(Blocks.TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TERRACOTTA_TILES)));

        stairBuilder(EBBlocks.TERRACOTTA_TILE_STAIRS,
                Ingredient.of(EBBlocks.TERRACOTTA_TILES))
                .unlockedBy(getHasName(EBBlocks.TERRACOTTA_TILES), has(EBBlocks.TERRACOTTA_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TERRACOTTA_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_SLAB,
                Ingredient.of(EBBlocks.TERRACOTTA_TILES))
                .unlockedBy(getHasName(EBBlocks.TERRACOTTA_TILES), has(EBBlocks.TERRACOTTA_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TERRACOTTA_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.TERRACOTTA_TILES))
                .unlockedBy(getHasName(EBBlocks.TERRACOTTA_TILES), has(EBBlocks.TERRACOTTA_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_STAIRS, EBBlocks.TERRACOTTA_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_SLAB, EBBlocks.TERRACOTTA_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TERRACOTTA_TILE_VERTICAL_STAIRS, EBBlocks.TERRACOTTA_TILES, 1);

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.WHITE.getId()), 4,
                Ingredient.of(Blocks.WHITE_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.WHITE_TERRACOTTA), has(Blocks.WHITE_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.WHITE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_GRAY.getId()), 4,
                Ingredient.of(Blocks.LIGHT_GRAY_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.LIGHT_GRAY_TERRACOTTA), has(Blocks.LIGHT_GRAY_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_GRAY.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.GRAY.getId()), 4,
                Ingredient.of(Blocks.GRAY_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.GRAY_TERRACOTTA), has(Blocks.GRAY_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.GRAY.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.BLACK.getId()), 4,
                Ingredient.of(Blocks.BLACK_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.BLACK_TERRACOTTA), has(Blocks.BLACK_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.BLACK.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.BROWN.getId()), 4,
                Ingredient.of(Blocks.BROWN_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.BROWN_TERRACOTTA), has(Blocks.BROWN_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.BROWN.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.RED.getId()), 4,
                Ingredient.of(Blocks.RED_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.RED_TERRACOTTA), has(Blocks.RED_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.RED.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.ORANGE.getId()), 4,
                Ingredient.of(Blocks.ORANGE_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.ORANGE_TERRACOTTA), has(Blocks.ORANGE_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.ORANGE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.YELLOW.getId()), 4,
                Ingredient.of(Blocks.YELLOW_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.YELLOW_TERRACOTTA), has(Blocks.YELLOW_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.YELLOW.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.LIME.getId()), 4,
                Ingredient.of(Blocks.LIME_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.LIME_TERRACOTTA), has(Blocks.LIME_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.LIME.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.GREEN.getId()), 4,
                Ingredient.of(Blocks.GREEN_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.GREEN_TERRACOTTA), has(Blocks.GREEN_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.GREEN.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.CYAN.getId()), 4,
                Ingredient.of(Blocks.CYAN_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.CYAN_TERRACOTTA), has(Blocks.CYAN_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.CYAN.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_BLUE.getId()), 4,
                Ingredient.of(Blocks.LIGHT_BLUE_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.LIGHT_BLUE_TERRACOTTA), has(Blocks.LIGHT_BLUE_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.LIGHT_BLUE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.BLUE.getId()), 4,
                Ingredient.of(Blocks.BLUE_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.BLUE_TERRACOTTA), has(Blocks.BLUE_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.BLUE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.PURPLE.getId()), 4,
                Ingredient.of(Blocks.PURPLE_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.PURPLE_TERRACOTTA), has(Blocks.PURPLE_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.PURPLE.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.MAGENTA.getId()), 4,
                Ingredient.of(Blocks.MAGENTA_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.MAGENTA_TERRACOTTA), has(Blocks.MAGENTA_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.MAGENTA.getId()))));

        createTwoByTwoCheckersMealRecipe(EBBlocks.getDyedTerracottaTiles(DyeColor.PINK.getId()), 4,
                Ingredient.of(Blocks.PINK_TERRACOTTA), Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.PINK_TERRACOTTA), has(Blocks.PINK_TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(DyeColor.PINK.getId()))));

        createVerticalStairsRecipe(EBBlocks.OAK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.OAK_PLANKS))
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_VERTICAL_STAIRS)));

        createVerticalStairsRecipe(EBBlocks.SPRUCE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.SPRUCE_PLANKS))
                .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_VERTICAL_STAIRS)));

        createVerticalStairsRecipe(EBBlocks.BIRCH_VERTICAL_STAIRS,
                Ingredient.of(Blocks.BIRCH_PLANKS))
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.JUNGLE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.JUNGLE_PLANKS))
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.ACACIA_VERTICAL_STAIRS,
                Ingredient.of(Blocks.ACACIA_PLANKS))
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.DARK_OAK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.DARK_OAK_PLANKS))
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.MANGROVE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.MANGROVE_PLANKS))
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.CHERRY_VERTICAL_STAIRS,
                Ingredient.of(Blocks.CHERRY_PLANKS))
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.BAMBOO_VERTICAL_STAIRS,
                Ingredient.of(Blocks.BAMBOO_PLANKS))
                .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS), has(Blocks.BAMBOO_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.CRIMSON_VERTICAL_STAIRS,
                Ingredient.of(Blocks.CRIMSON_PLANKS))
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.WARPED_VERTICAL_STAIRS,
                Ingredient.of(Blocks.WARPED_PLANKS))
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_VERTICAL_STAIRS)));
        
        createVerticalStairsRecipe(EBBlocks.STONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.STONE))
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.STONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.STONE_VERTICAL_STAIRS, Blocks.STONE, 1);

        createVerticalStairsRecipe(EBBlocks.COBBLESTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.COBBLESTONE))
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLESTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_VERTICAL_STAIRS, Blocks.COBBLESTONE, 1);

        createVerticalStairsRecipe(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.MOSSY_COBBLESTONE))
                .unlockedBy(getHasName(Blocks.MOSSY_COBBLESTONE), has(Blocks.MOSSY_COBBLESTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_VERTICAL_STAIRS, Blocks.MOSSY_COBBLESTONE, 1);

        createVerticalStairsRecipe(EBBlocks.STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.STONE_BRICKS))
                .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Blocks.STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.STONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.STONE_BRICK_VERTICAL_STAIRS, Blocks.STONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.MOSSY_STONE_BRICKS))
                .unlockedBy(getHasName(Blocks.MOSSY_STONE_BRICKS), has(Blocks.MOSSY_STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_STONE_BRICK_VERTICAL_STAIRS, Blocks.MOSSY_STONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy(getHasName(Blocks.COBBLED_DEEPSLATE), has(Blocks.COBBLED_DEEPSLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_VERTICAL_STAIRS, Blocks.COBBLED_DEEPSLATE, 1);

        createVerticalStairsRecipe(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(Blocks.DEEPSLATE_BRICKS), has(Blocks.DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DEEPSLATE_BRICK_VERTICAL_STAIRS, Blocks.DEEPSLATE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.DEEPSLATE_TILES))
                .unlockedBy(getHasName(Blocks.DEEPSLATE_TILES), has(Blocks.DEEPSLATE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DEEPSLATE_TILE_VERTICAL_STAIRS, Blocks.DEEPSLATE_TILES, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_DEEPSLATE))
                .unlockedBy(getHasName(Blocks.POLISHED_DEEPSLATE), has(Blocks.POLISHED_DEEPSLATE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_DEEPSLATE_VERTICAL_STAIRS, Blocks.POLISHED_DEEPSLATE, 1);

        createVerticalStairsRecipe(EBBlocks.QUARTZ_VERTICAL_STAIRS,
                Ingredient.of(Blocks.QUARTZ_BLOCK))
                .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.QUARTZ_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.QUARTZ_VERTICAL_STAIRS, Blocks.QUARTZ_BLOCK, 1);

        createVerticalStairsRecipe(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS,
                Ingredient.of(Blocks.SMOOTH_QUARTZ))
                .unlockedBy(getHasName(Blocks.SMOOTH_QUARTZ), has(Blocks.SMOOTH_QUARTZ))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_QUARTZ_VERTICAL_STAIRS, Blocks.SMOOTH_QUARTZ, 1);

        createVerticalStairsRecipe(EBBlocks.BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.BRICKS))
                .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRICK_VERTICAL_STAIRS, Blocks.BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.SANDSTONE))
                .unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_VERTICAL_STAIRS, Blocks.SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_VERTICAL_STAIRS, Blocks.RED_SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.SMOOTH_SANDSTONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_SANDSTONE), has(Blocks.SMOOTH_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SANDSTONE_VERTICAL_STAIRS, Blocks.SMOOTH_SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.SMOOTH_RED_SANDSTONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_RED_SANDSTONE), has(Blocks.SMOOTH_RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_RED_SANDSTONE_VERTICAL_STAIRS, Blocks.SMOOTH_RED_SANDSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.BLACKSTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.BLACKSTONE))
                .unlockedBy(getHasName(Blocks.BLACKSTONE), has(Blocks.BLACKSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BLACKSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_VERTICAL_STAIRS, Blocks.BLACKSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_BLACKSTONE))
                .unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE), has(Blocks.POLISHED_BLACKSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_VERTICAL_STAIRS, Blocks.POLISHED_BLACKSTONE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE_BRICKS), has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.NETHER_BRICKS))
                .unlockedBy(getHasName(Blocks.NETHER_BRICKS), has(Blocks.NETHER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.NETHER_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.NETHER_BRICK_VERTICAL_STAIRS, Blocks.NETHER_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.RED_NETHER_BRICKS))
                .unlockedBy(getHasName(Blocks.RED_NETHER_BRICKS), has(Blocks.RED_NETHER_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_NETHER_BRICK_VERTICAL_STAIRS, Blocks.RED_NETHER_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.PRISMARINE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.PRISMARINE))
                .unlockedBy(getHasName(Blocks.PRISMARINE), has(Blocks.PRISMARINE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.PRISMARINE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_VERTICAL_STAIRS, Blocks.PRISMARINE, 1);

        createVerticalStairsRecipe(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.PRISMARINE_BRICKS))
                .unlockedBy(getHasName(Blocks.PRISMARINE_BRICKS), has(Blocks.PRISMARINE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.PRISMARINE_BRICK_VERTICAL_STAIRS, Blocks.PRISMARINE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.DARK_PRISMARINE))
                .unlockedBy(getHasName(Blocks.DARK_PRISMARINE), has(Blocks.DARK_PRISMARINE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_PRISMARINE_VERTICAL_STAIRS, Blocks.DARK_PRISMARINE, 1);

        createVerticalStairsRecipe(EBBlocks.ANDESITE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.ANDESITE))
                .unlockedBy(getHasName(Blocks.ANDESITE), has(Blocks.ANDESITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANDESITE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_VERTICAL_STAIRS, Blocks.ANDESITE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_ANDESITE))
                .unlockedBy(getHasName(Blocks.POLISHED_ANDESITE), has(Blocks.POLISHED_ANDESITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ANDESITE_VERTICAL_STAIRS, Blocks.POLISHED_ANDESITE, 1);

        createVerticalStairsRecipe(EBBlocks.GRANITE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.GRANITE))
                .unlockedBy(getHasName(Blocks.GRANITE), has(Blocks.GRANITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRANITE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_VERTICAL_STAIRS, Blocks.GRANITE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_GRANITE))
                .unlockedBy(getHasName(Blocks.POLISHED_GRANITE), has(Blocks.POLISHED_GRANITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_GRANITE_VERTICAL_STAIRS, Blocks.POLISHED_GRANITE, 1);

        createVerticalStairsRecipe(EBBlocks.DIORITE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.DIORITE))
                .unlockedBy(getHasName(Blocks.DIORITE), has(Blocks.DIORITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIORITE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_VERTICAL_STAIRS, Blocks.DIORITE, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_DIORITE))
                .unlockedBy(getHasName(Blocks.POLISHED_DIORITE), has(Blocks.POLISHED_DIORITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_DIORITE_VERTICAL_STAIRS, Blocks.POLISHED_DIORITE, 1);

        createVerticalStairsRecipe(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.END_STONE_BRICKS))
                .unlockedBy(getHasName(Blocks.END_STONE_BRICKS), has(Blocks.END_STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.END_STONE_BRICK_VERTICAL_STAIRS, Blocks.END_STONE_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.PURPUR_VERTICAL_STAIRS,
                Ingredient.of(Blocks.PURPUR_BLOCK))
                .unlockedBy(getHasName(Blocks.PURPUR_BLOCK), has(Blocks.PURPUR_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.PURPUR_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.PURPUR_VERTICAL_STAIRS, Blocks.PURPUR_BLOCK, 1);

        createVerticalStairsRecipe(EBBlocks.CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.CUT_COPPER))
                .unlockedBy(getHasName(Blocks.CUT_COPPER), has(Blocks.CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_COPPER_VERTICAL_STAIRS, Blocks.CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.EXPOSED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.EXPOSED_CUT_COPPER), has(Blocks.EXPOSED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.EXPOSED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.WEATHERED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WEATHERED_CUT_COPPER), has(Blocks.WEATHERED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WEATHERED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.OXIDIZED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.OXIDIZED_CUT_COPPER), has(Blocks.OXIDIZED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.OXIDIZED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.WAXED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_CUT_COPPER), has(Blocks.WAXED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.WAXED_EXPOSED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_EXPOSED_CUT_COPPER), has(Blocks.WAXED_EXPOSED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.WAXED_WEATHERED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_WEATHERED_CUT_COPPER), has(Blocks.WAXED_WEATHERED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS,
                Ingredient.of(Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .unlockedBy(getHasName(Blocks.WAXED_OXIDIZED_CUT_COPPER), has(Blocks.WAXED_OXIDIZED_CUT_COPPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_CUT_COPPER_VERTICAL_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER, 1);

        createVerticalStairsRecipe(EBBlocks.TUFF_VERTICAL_STAIRS,
                Ingredient.of(Blocks.TUFF))
                .unlockedBy(getHasName(Blocks.TUFF), has(Blocks.TUFF))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_VERTICAL_STAIRS, Blocks.TUFF, 1);

        createVerticalStairsRecipe(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.TUFF_BRICKS))
                .unlockedBy(getHasName(Blocks.TUFF_BRICKS), has(Blocks.TUFF_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_BRICK_VERTICAL_STAIRS, Blocks.TUFF_BRICKS, 1);

        createVerticalStairsRecipe(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS,
                Ingredient.of(Blocks.POLISHED_TUFF))
                .unlockedBy(getHasName(Blocks.POLISHED_TUFF), has(Blocks.POLISHED_TUFF))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_TUFF_VERTICAL_STAIRS, Blocks.POLISHED_TUFF, 1);

        createTwoByTwoRecipe(EBBlocks.GRANITE_BRICKS, 4,
                Ingredient.of(Items.POLISHED_GRANITE))
                .unlockedBy(getHasName(Items.POLISHED_GRANITE), has(Items.POLISHED_GRANITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRANITE_BRICKS)));

        stairBuilder(EBBlocks.GRANITE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.GRANITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS), has(EBBlocks.GRANITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRANITE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_SLAB,
                Ingredient.of(EBBlocks.GRANITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS), has(EBBlocks.GRANITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRANITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.GRANITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS), has(EBBlocks.GRANITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.GRANITE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.GRANITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS), has(EBBlocks.GRANITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRANITE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_STAIRS, EBBlocks.GRANITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_SLAB, EBBlocks.GRANITE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_VERTICAL_STAIRS, EBBlocks.GRANITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_WALL, EBBlocks.GRANITE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.ANDESITE_BRICKS, 4,
                Ingredient.of(Items.POLISHED_ANDESITE))
                .unlockedBy(getHasName(Items.POLISHED_ANDESITE), has(Items.POLISHED_ANDESITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANDESITE_BRICKS)));

        stairBuilder(EBBlocks.ANDESITE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.ANDESITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS), has(EBBlocks.ANDESITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANDESITE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_SLAB,
                Ingredient.of(EBBlocks.ANDESITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS), has(EBBlocks.ANDESITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANDESITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ANDESITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS), has(EBBlocks.ANDESITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.ANDESITE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.ANDESITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS), has(EBBlocks.ANDESITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANDESITE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_STAIRS, EBBlocks.ANDESITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_SLAB, EBBlocks.ANDESITE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_VERTICAL_STAIRS, EBBlocks.ANDESITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_WALL, EBBlocks.ANDESITE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.DIORITE_BRICKS, 4,
                Ingredient.of(Items.POLISHED_DIORITE))
                .unlockedBy(getHasName(Items.POLISHED_DIORITE), has(Items.POLISHED_DIORITE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIORITE_BRICKS)));

        stairBuilder(EBBlocks.DIORITE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.DIORITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS), has(EBBlocks.DIORITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIORITE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_SLAB,
                Ingredient.of(EBBlocks.DIORITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS), has(EBBlocks.DIORITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIORITE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.DIORITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS), has(EBBlocks.DIORITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.DIORITE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.DIORITE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS), has(EBBlocks.DIORITE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DIORITE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_STAIRS, EBBlocks.DIORITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_SLAB, EBBlocks.DIORITE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_VERTICAL_STAIRS, EBBlocks.DIORITE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_WALL, EBBlocks.DIORITE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SMOOTH_BRICKS, 4,
                Ingredient.of(Items.BRICKS))
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_BRICKS)));

        stairBuilder(EBBlocks.SMOOTH_BRICK_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS), has(EBBlocks.SMOOTH_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_SLAB,
                Ingredient.of(EBBlocks.SMOOTH_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS), has(EBBlocks.SMOOTH_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS), has(EBBlocks.SMOOTH_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.SMOOTH_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.SMOOTH_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS), has(EBBlocks.SMOOTH_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICKS, Blocks.BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_STAIRS, EBBlocks.SMOOTH_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_SLAB, EBBlocks.SMOOTH_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_WALL, EBBlocks.SMOOTH_BRICKS, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.HERRINGBONE_BRICKS, Blocks.BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_HERRINGBONE_BRICKS, EBBlocks.SMOOTH_BRICKS, 1);

        smeltingResultFromBase(exporter, EBBlocks.CRACKED_BRICKS, Blocks.BRICKS);
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_SMOOTH_BRICKS, EBBlocks.SMOOTH_BRICKS);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HERRINGBONE_BRICKS, 1)
                .define('#', Blocks.BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Blocks.BRICK_SLAB), has(Blocks.BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.HERRINGBONE_BRICKS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_HERRINGBONE_BRICKS, 1)
                .define('#', EBBlocks.SMOOTH_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICK_SLAB), has(EBBlocks.SMOOTH_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_HERRINGBONE_BRICKS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.REACHING_LANTERN, 1)
                .define('@', EBItems.ANCIENT_FRUIT).define('#', Items.IRON_INGOT).define('!', Items.AMETHYST_SHARD)
                .pattern("###")
                .pattern("!@!")
                .pattern("!!!")
                .unlockedBy(getHasName(EBItems.ANCIENT_FRUIT), has(EBItems.ANCIENT_FRUIT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.REACHING_LANTERN)));

        createShelfBlock(EBBlocks.SPRUCE_BOOKSHELF, 1,
                Ingredient.of(Blocks.SPRUCE_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_BOOKSHELF)));

        createShelfBlock(EBBlocks.BIRCH_BOOKSHELF, 1,
                Ingredient.of(Blocks.BIRCH_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_BOOKSHELF)));

        createShelfBlock(EBBlocks.JUNGLE_BOOKSHELF, 1,
                Ingredient.of(Blocks.JUNGLE_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_BOOKSHELF)));

        createShelfBlock(EBBlocks.ACACIA_BOOKSHELF, 1,
                Ingredient.of(Blocks.ACACIA_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_BOOKSHELF)));

        createShelfBlock(EBBlocks.DARK_OAK_BOOKSHELF, 1,
                Ingredient.of(Blocks.DARK_OAK_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_BOOKSHELF)));

        createShelfBlock(EBBlocks.MANGROVE_BOOKSHELF, 1,
                Ingredient.of(Blocks.MANGROVE_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_BOOKSHELF)));

        createShelfBlock(EBBlocks.CHERRY_BOOKSHELF, 1,
                Ingredient.of(Blocks.CHERRY_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_BOOKSHELF)));

        createShelfBlock(EBBlocks.BAMBOO_BOOKSHELF, 1,
                Ingredient.of(Blocks.BAMBOO_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_BOOKSHELF)));

        createShelfBlock(EBBlocks.CRIMSON_BOOKSHELF, 1,
                Ingredient.of(Blocks.CRIMSON_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_BOOKSHELF)));

        createShelfBlock(EBBlocks.WARPED_BOOKSHELF, 1,
                Ingredient.of(Blocks.WARPED_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_BOOKSHELF)));

        createShelfBlock(EBBlocks.ANCIENT_BOOKSHELF, 1,
                Ingredient.of(EBBlocks.ANCIENT_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_BOOKSHELF)));

        createShelfBlock(EBBlocks.GLOOM_BOOKSHELF, 1,
                Ingredient.of(EBBlocks.GLOOM_PLANKS), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_BOOKSHELF)));

        createTwoByTwoCheckersMealRecipe(EBBlocks.BRIMSTONE, 4,
                Ingredient.of(Blocks.NETHERRACK), Ingredient.of(Blocks.BASALT))
                .unlockedBy(getHasName(Blocks.BASALT), has(Blocks.BASALT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE)));

        stairBuilder(EBBlocks.BRIMSTONE_STAIRS,
                Ingredient.of(EBBlocks.BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE), has(EBBlocks.BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_SLAB,
                Ingredient.of(EBBlocks.BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE), has(EBBlocks.BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BRIMSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE), has(EBBlocks.BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.BRIMSTONE_WALL, 6,
                Ingredient.of(EBBlocks.BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE), has(EBBlocks.BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_STAIRS, EBBlocks.BRIMSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_SLAB, EBBlocks.BRIMSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_WALL, EBBlocks.BRIMSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.POLISHED_BRIMSTONE, 4,
                Ingredient.of(EBBlocks.BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE), has(EBBlocks.BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_BRIMSTONE)));

        stairBuilder(EBBlocks.POLISHED_BRIMSTONE_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE), has(EBBlocks.POLISHED_BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_BRIMSTONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_SLAB,
                Ingredient.of(EBBlocks.POLISHED_BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE), has(EBBlocks.POLISHED_BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_BRIMSTONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE), has(EBBlocks.POLISHED_BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_STAIRS, EBBlocks.POLISHED_BRIMSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_SLAB, EBBlocks.POLISHED_BRIMSTONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE_VERTICAL_STAIRS, EBBlocks.POLISHED_BRIMSTONE, 1);

        createTwoByTwoRecipe(EBBlocks.BRIMSTONE_BRICKS, 4,
                Ingredient.of(EBBlocks.POLISHED_BRIMSTONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE), has(EBBlocks.POLISHED_BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_BRICKS)));

        stairBuilder(EBBlocks.BRIMSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.BRIMSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_BRICKS), has(EBBlocks.BRIMSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.BRIMSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_BRICKS), has(EBBlocks.BRIMSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BRIMSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_BRICKS), has(EBBlocks.BRIMSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_STAIRS, EBBlocks.BRIMSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_SLAB, EBBlocks.BRIMSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.BRIMSTONE_TILES, 4,
                Ingredient.of(EBBlocks.BRIMSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_BRICKS), has(EBBlocks.BRIMSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_TILES)));

        stairBuilder(EBBlocks.BRIMSTONE_TILE_STAIRS,
                Ingredient.of(EBBlocks.BRIMSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_TILES), has(EBBlocks.BRIMSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_SLAB,
                Ingredient.of(EBBlocks.BRIMSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_TILES), has(EBBlocks.BRIMSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BRIMSTONE_TILES))
                .unlockedBy(getHasName(EBBlocks.BRIMSTONE_TILES), has(EBBlocks.BRIMSTONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_STAIRS, EBBlocks.BRIMSTONE_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_SLAB, EBBlocks.BRIMSTONE_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILE_VERTICAL_STAIRS, EBBlocks.BRIMSTONE_TILES, 1);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_BRIMSTONE, EBBlocks.BRIMSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_BRICKS, EBBlocks.POLISHED_BRIMSTONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_TILES, EBBlocks.BRIMSTONE_BRICKS, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_PILLAR, 1)
                .define('#', EBBlocks.POLISHED_BRIMSTONE_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE_SLAB), has(EBBlocks.POLISHED_BRIMSTONE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_PILLAR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_LAMP, 4)
                .define('#', EBBlocks.POLISHED_BRIMSTONE).define('@', Items.GLOWSTONE_DUST)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@")
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE), has(EBBlocks.POLISHED_BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_LAMP)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_WINDOW, 4)
                .define('@', EBBlocks.POLISHED_BRIMSTONE).define('#', Items.GLOWSTONE_DUST)
                .pattern("@#@")
                .pattern("###")
                .pattern("@#@")
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE), has(EBBlocks.POLISHED_BRIMSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BRIMSTONE_WINDOW)));

        stairBuilder(EBBlocks.ASPHALT_STAIRS,
                Ingredient.of(EBBlocks.ASPHALT))
                .unlockedBy(getHasName(EBBlocks.ASPHALT), has(EBBlocks.ASPHALT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ASPHALT_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_SLAB,
                Ingredient.of(EBBlocks.ASPHALT))
                .unlockedBy(getHasName(EBBlocks.ASPHALT), has(EBBlocks.ASPHALT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ASPHALT_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ASPHALT_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ASPHALT))
                .unlockedBy(getHasName(EBBlocks.ASPHALT), has(EBBlocks.ASPHALT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ASPHALT_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_STAIRS, EBBlocks.ASPHALT, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_SLAB, EBBlocks.ASPHALT, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ASPHALT_VERTICAL_STAIRS, EBBlocks.ASPHALT, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_GRATE, 4)
                .define('#', Blocks.IRON_BLOCK)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.IRON_GRATE)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.IRON_GRATE, Blocks.IRON_BLOCK, 4);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE, 1)
                .requires(EBBlocks.ROSE)
                .unlockedBy(getHasName(EBBlocks.ROSE), has(EBBlocks.ROSE))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(Items.RED_DYE) + "_from_rose")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.CYAN_DYE, 1)
                .requires(EBBlocks.CYAN_ROSE)
                .unlockedBy(getHasName(EBBlocks.CYAN_ROSE), has(EBBlocks.CYAN_ROSE))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(Items.CYAN_DYE) + "_from_cyan_rose")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE, 1)
                .requires(EBBlocks.WHITE_ROSE)
                .unlockedBy(getHasName(EBBlocks.WHITE_ROSE), has(EBBlocks.WHITE_ROSE))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(Items.WHITE_DYE) + "_from_white_rose")));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_GRATE, 4)
                .define('#', Blocks.GOLD_BLOCK)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GOLD_GRATE)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GOLD_GRATE, Blocks.GOLD_BLOCK, 4);

        smeltingResultFromBase(exporter, EBBlocks.CRACKED_BRIMSTONE_BRICKS, EBBlocks.BRIMSTONE_BRICKS);
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_ANDESITE_BRICKS, EBBlocks.ANDESITE_BRICKS);
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_DIORITE_BRICKS, EBBlocks.DIORITE_BRICKS);
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_GRANITE_BRICKS, EBBlocks.GRANITE_BRICKS);
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_MUD_BRICKS, Blocks.MUD_BRICKS);

        createTwoByTwoRecipe(EBBlocks.SMOOTH_STONE_BRICKS, 4,
                Ingredient.of(Blocks.SMOOTH_STONE))
                .unlockedBy(getHasName(Blocks.SMOOTH_STONE), has(Blocks.SMOOTH_STONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_BRICKS)));

        stairBuilder(EBBlocks.SMOOTH_STONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_STONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICKS), has(EBBlocks.SMOOTH_STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.SMOOTH_STONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICKS), has(EBBlocks.SMOOTH_STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_STONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICKS), has(EBBlocks.SMOOTH_STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_BRICKS, Blocks.SMOOTH_STONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_BRICK_STAIRS, EBBlocks.SMOOTH_STONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_BRICK_SLAB, EBBlocks.SMOOTH_STONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_BRICK_VERTICAL_STAIRS, EBBlocks.SMOOTH_STONE_BRICKS, 1);

        createTwoByTwoRecipe(EBBlocks.SMOOTH_STONE_TILES, 4,
                Ingredient.of(EBBlocks.SMOOTH_STONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICKS), has(EBBlocks.SMOOTH_STONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_TILES)));

        stairBuilder(EBBlocks.SMOOTH_STONE_TILE_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_STONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_TILES), has(EBBlocks.SMOOTH_STONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_TILE_SLAB,
                Ingredient.of(EBBlocks.SMOOTH_STONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_TILES), has(EBBlocks.SMOOTH_STONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SMOOTH_STONE_TILES))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_TILES), has(EBBlocks.SMOOTH_STONE_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_TILES, EBBlocks.SMOOTH_STONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_TILE_STAIRS, EBBlocks.SMOOTH_STONE_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_TILE_SLAB, EBBlocks.SMOOTH_STONE_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_TILE_VERTICAL_STAIRS, EBBlocks.SMOOTH_STONE_TILES, 1);

        smeltingResultFromBase(exporter, EBBlocks.CRACKED_SMOOTH_STONE_BRICKS, EBBlocks.SMOOTH_STONE_BRICKS);
        smeltingResultFromBase(exporter, EBBlocks.CRACKED_SMOOTH_STONE_TILES, EBBlocks.SMOOTH_STONE_TILES);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_PILLAR, Blocks.SMOOTH_STONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SMOOTH_STONE_BRICKS, EBBlocks.SMOOTH_STONE_BRICKS, 1);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_STONE_PILLAR, 1)
                .define('#', Blocks.SMOOTH_STONE_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(Blocks.SMOOTH_STONE_SLAB), has(Blocks.SMOOTH_STONE_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SMOOTH_STONE_PILLAR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SMOOTH_STONE_BRICKS, 1)
                .define('#', EBBlocks.SMOOTH_STONE_BRICK_SLAB)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.SMOOTH_STONE_BRICK_SLAB), has(EBBlocks.SMOOTH_STONE_BRICK_SLAB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHISELED_SMOOTH_STONE_BRICKS)));

        createTwoByTwoCheckersMealRecipe(EBBlocks.POLISHED_STONE, 4,
                Ingredient.of(Blocks.STONE), Ingredient.of(Blocks.SMOOTH_STONE))
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_STONE)));

        stairBuilder(EBBlocks.POLISHED_STONE_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_STONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE), has(EBBlocks.POLISHED_STONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_STONE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_SLAB,
                Ingredient.of(EBBlocks.POLISHED_STONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE), has(EBBlocks.POLISHED_STONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_STONE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_STONE))
                .unlockedBy(getHasName(EBBlocks.POLISHED_STONE), has(EBBlocks.POLISHED_STONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_STONE_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE, Blocks.STONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_STAIRS, EBBlocks.POLISHED_STONE, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_SLAB, EBBlocks.POLISHED_STONE, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_STONE_VERTICAL_STAIRS, EBBlocks.POLISHED_STONE, 1);

        createTwoByTwoRecipe(EBBlocks.REDSTONE_BRICKS, 1,
                Ingredient.of(Items.REDSTONE))
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.REDSTONE_BRICKS)));

        stairBuilder(EBBlocks.REDSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.REDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.REDSTONE_BRICKS), has(EBBlocks.REDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.REDSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.REDSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.REDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.REDSTONE_BRICKS), has(EBBlocks.REDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.REDSTONE_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.REDSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.REDSTONE_BRICKS), has(EBBlocks.REDSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.REDSTONE_BRICKS, Blocks.REDSTONE_BLOCK, 4);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.REDSTONE_BRICK_STAIRS, EBBlocks.REDSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.REDSTONE_BRICK_SLAB, EBBlocks.REDSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.REDSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.REDSTONE_BRICKS, 1);

        createShelfBlock(EBBlocks.OAK_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.OAK_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.SPRUCE_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.SPRUCE_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.BIRCH_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.BIRCH_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.JUNGLE_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.JUNGLE_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.ACACIA_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.ACACIA_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.DARK_OAK_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.DARK_OAK_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.MANGROVE_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.MANGROVE_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.CHERRY_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.CHERRY_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.BAMBOO_DECORATIVE_SHELF, 1,
                Ingredient.of(Blocks.BAMBOO_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.CRIMSON_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.CRIMSON_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.WARPED_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.WARPED_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.ANCIENT_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.ANCIENT_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_DECORATIVE_SHELF)));

        createShelfBlock(EBBlocks.GLOOM_DECORATIVE_SHELF, 1,
                Ingredient.of(EBBlocks.GLOOM_MOSAIC), Ingredient.of(Items.BOOK))
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_DECORATIVE_SHELF)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.WEEPING_CANDLE, 1)
                .define('#', Items.HONEYCOMB).define('@', Items.STRING).define('!', Items.CRIMSON_FUNGUS)
                .pattern("@")
                .pattern("!")
                .pattern("#")
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_CANDLE)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.TWISTING_CANDLE, 1)
                .define('#', Items.HONEYCOMB).define('@', Items.STRING).define('!', Items.WARPED_FUNGUS)
                .pattern("@")
                .pattern("!")
                .pattern("#")
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_CANDLE)));

        createTwoByTwoRecipe(EBBlocks.TUFF_TILES, 4,
                Ingredient.of(Blocks.TUFF_BRICKS))
                .unlockedBy(getHasName(Blocks.TUFF_BRICKS), has(Blocks.TUFF_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_TILES)));

        stairBuilder(EBBlocks.TUFF_TILE_STAIRS,
                Ingredient.of(EBBlocks.TUFF_TILES))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES), has(EBBlocks.TUFF_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_TILE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_SLAB,
                Ingredient.of(EBBlocks.TUFF_TILES))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES), has(EBBlocks.TUFF_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_TILE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.TUFF_TILE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.TUFF_TILES))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES), has(EBBlocks.TUFF_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_TILE_VERTICAL_STAIRS)));

        createPaneRecipe(EBBlocks.TUFF_TILE_WALL, 6,
                Ingredient.of(EBBlocks.TUFF_TILES))
                .unlockedBy(getHasName(EBBlocks.TUFF_TILES), has(EBBlocks.TUFF_TILES))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TUFF_TILE_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILES, Blocks.TUFF_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_STAIRS, EBBlocks.TUFF_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_SLAB, EBBlocks.TUFF_TILES, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_VERTICAL_STAIRS, EBBlocks.TUFF_TILES, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TUFF_TILE_WALL, EBBlocks.TUFF_TILES, 1);

        stairBuilder(EBBlocks.ALMENTRA_STAIRS,
                Ingredient.of(EBBlocks.ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA), has(EBBlocks.ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_SLAB,
                Ingredient.of(EBBlocks.ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA), has(EBBlocks.ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ALMENTRA_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA), has(EBBlocks.ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_STAIRS, EBBlocks.ALMENTRA, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_SLAB, EBBlocks.ALMENTRA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_VERTICAL_STAIRS, EBBlocks.ALMENTRA, 1);

        createFourForFourWendysMealRecipe(EBBlocks.POLISHED_ALMENTRA,
                Ingredient.of(EBBlocks.ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA), has(EBBlocks.ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_ALMENTRA)));
        
        stairBuilder(EBBlocks.POLISHED_ALMENTRA_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ALMENTRA), has(EBBlocks.POLISHED_ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_ALMENTRA_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ALMENTRA_SLAB,
                Ingredient.of(EBBlocks.POLISHED_ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ALMENTRA), has(EBBlocks.POLISHED_ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_ALMENTRA_SLAB)));

        createVerticalStairsRecipe(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.POLISHED_ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ALMENTRA), has(EBBlocks.POLISHED_ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ALMENTRA, EBBlocks.ALMENTRA, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ALMENTRA_STAIRS, EBBlocks.POLISHED_ALMENTRA, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ALMENTRA_SLAB, EBBlocks.POLISHED_ALMENTRA, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ALMENTRA_VERTICAL_STAIRS, EBBlocks.POLISHED_ALMENTRA, 1);

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedPolishedAlmentra(colors.getId()), EBBlocks.getDyedAlmentra(colors.getId()), 1);
        }
        
        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedPolishedAlmentraStairs(colors.getId()), EBBlocks.getDyedPolishedAlmentra(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedPolishedAlmentraSlab(colors.getId()), EBBlocks.getDyedPolishedAlmentra(colors.getId()), 2);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedPolishedAlmentraVerticalStairs(colors.getId()), EBBlocks.getDyedPolishedAlmentra(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            createFourForFourWendysMealRecipe(EBBlocks.getDyedPolishedAlmentra(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId())), has(EBBlocks.getDyedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedPolishedAlmentra(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            stairBuilder(EBBlocks.getDyedPolishedAlmentraStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedPolishedAlmentra(colors.getId())), has(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedPolishedAlmentraStairs(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedPolishedAlmentraSlab(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedPolishedAlmentra(colors.getId())), has(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedPolishedAlmentraSlab(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            createVerticalStairsRecipe(EBBlocks.getDyedPolishedAlmentraVerticalStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedPolishedAlmentra(colors.getId())), has(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedPolishedAlmentraVerticalStairs(colors.getId()))));
        }

        createFourForFourWendysMealRecipe(EBBlocks.ALMENTRA_BRICKS,
                Ingredient.of(EBBlocks.POLISHED_ALMENTRA))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ALMENTRA), has(EBBlocks.POLISHED_ALMENTRA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_BRICKS)));

        stairBuilder(EBBlocks.ALMENTRA_BRICK_STAIRS,
                Ingredient.of(EBBlocks.ALMENTRA_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS), has(EBBlocks.ALMENTRA_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICK_SLAB,
                Ingredient.of(EBBlocks.ALMENTRA_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS), has(EBBlocks.ALMENTRA_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_BRICK_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ALMENTRA_BRICKS))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS), has(EBBlocks.ALMENTRA_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICKS, EBBlocks.POLISHED_ALMENTRA, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICK_STAIRS, EBBlocks.ALMENTRA_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICK_SLAB, EBBlocks.ALMENTRA_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICK_VERTICAL_STAIRS, EBBlocks.ALMENTRA_BRICKS, 1);

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBricks(colors.getId()), EBBlocks.getDyedPolishedAlmentra(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBrickStairs(colors.getId()), EBBlocks.getDyedAlmentraBricks(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBrickSlab(colors.getId()), EBBlocks.getDyedAlmentraBricks(colors.getId()), 2);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBrickVerticalStairs(colors.getId()), EBBlocks.getDyedAlmentraBricks(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            createFourForFourWendysMealRecipe(EBBlocks.getDyedAlmentraBricks(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedPolishedAlmentra(colors.getId())), has(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedAlmentraBricks(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            stairBuilder(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId())), has(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBrickSlab(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId())), has(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            createVerticalStairsRecipe(EBBlocks.getDyedAlmentraBrickVerticalStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId())), has(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedAlmentraBrickVerticalStairs(colors.getId()))));
        }

        for (DyeColor colors : DyeColor.values()) {
            createBlockEightDyingRecipe(EBBlocks.getDyedTerracottaTiles(colors.getId()), EBBlocks.TERRACOTTA_TILES, DyeItem.byColor(colors).getDyeColor())
            .unlockedBy(getHasName(EBBlocks.getDyedTerracottaTiles(colors.getId())), has(EBBlocks.getDyedTerracottaTiles(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedTerracottaTiles(colors.getId())) + "_from_base"));
        }

        for (DyeColor colors : DyeColor.values()) {
            createBlockEightDyingRecipe(EBBlocks.getDyedAlmentra(colors.getId()), EBBlocks.ALMENTRA, DyeItem.byColor(colors).getDyeColor())
            .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId())), has(EBBlocks.getDyedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedAlmentra(colors.getId())) + "_from_base"));
        }

        for (DyeColor colors : DyeColor.values()) {
            createBlockEightDyingRecipe(EBBlocks.getDyedPolishedAlmentra(colors.getId()), EBBlocks.POLISHED_ALMENTRA, DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.getDyedPolishedAlmentra(colors.getId())), has(EBBlocks.getDyedPolishedAlmentra(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedPolishedAlmentra(colors.getId())) + "_from_base"));
        }

        for (DyeColor colors : DyeColor.values()) {
            createBlockEightDyingRecipe(EBBlocks.getDyedAlmentraBricks(colors.getId()), EBBlocks.ALMENTRA_BRICKS, DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId())), has(EBBlocks.getDyedAlmentraBricks(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedAlmentraBricks(colors.getId())) + "_from_base"));
        }

        for (DyeColor colors : DyeColor.values()) {
            createBlockEightDyingTagRecipe(EBBlocks.getDyedKnittedWools(colors.getId()), EBTags.Items.KNITTED_WOOL, DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.getDyedKnittedWools(colors.getId())), has(EBBlocks.getDyedKnittedWools(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(colors.getId())) + "_from_any"));
        }

        for (DyeColor colors : DyeColor.values()) {
            createBlockEightDyingTagRecipe(EBBlocks.getDyedKnittedCarpets(colors.getId()), EBTags.Items.KNITTED_CARPET, DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.getDyedKnittedCarpets(colors.getId())), has(EBBlocks.getDyedKnittedCarpets(colors.getId())))
                    .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedCarpets(colors.getId())) + "_from_any"));
        }

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.WHITE.getId()),
                Ingredient.of(Items.WHITE_WOOL))
                .unlockedBy(getHasName(Items.WHITE_WOOL), has(Items.WHITE_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.WHITE.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.BLACK.getId()),
                Ingredient.of(Items.BLACK_WOOL))
                .unlockedBy(getHasName(Items.BLACK_WOOL), has(Items.BLACK_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.BLACK.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.PINK.getId()),
                Ingredient.of(Items.PINK_WOOL))
                .unlockedBy(getHasName(Items.PINK_WOOL), has(Items.PINK_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.PINK.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.MAGENTA.getId()),
                Ingredient.of(Items.MAGENTA_WOOL))
                .unlockedBy(getHasName(Items.MAGENTA_WOOL), has(Items.MAGENTA_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.MAGENTA.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.PURPLE.getId()),
                Ingredient.of(Items.PURPLE_WOOL))
                .unlockedBy(getHasName(Items.PURPLE_WOOL), has(Items.PURPLE_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.PURPLE.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.BLUE.getId()),
                Ingredient.of(Items.BLUE_WOOL))
                .unlockedBy(getHasName(Items.BLUE_WOOL), has(Items.BLUE_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.BLUE.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_BLUE.getId()),
                Ingredient.of(Items.LIGHT_BLUE_WOOL))
                .unlockedBy(getHasName(Items.LIGHT_BLUE_WOOL), has(Items.LIGHT_BLUE_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_BLUE.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.CYAN.getId()),
                Ingredient.of(Items.CYAN_WOOL))
                .unlockedBy(getHasName(Items.CYAN_WOOL), has(Items.CYAN_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.CYAN.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.GREEN.getId()),
                Ingredient.of(Items.GREEN_WOOL))
                .unlockedBy(getHasName(Items.GREEN_WOOL), has(Items.GREEN_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.GREEN.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.LIME.getId()),
                Ingredient.of(Items.LIME_WOOL))
                .unlockedBy(getHasName(Items.LIME_WOOL), has(Items.LIME_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.LIME.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.YELLOW.getId()),
                Ingredient.of(Items.YELLOW_WOOL))
                .unlockedBy(getHasName(Items.YELLOW_WOOL), has(Items.YELLOW_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.YELLOW.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.ORANGE.getId()),
                Ingredient.of(Items.ORANGE_WOOL))
                .unlockedBy(getHasName(Items.ORANGE_WOOL), has(Items.ORANGE_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.ORANGE.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.RED.getId()),
                Ingredient.of(Items.RED_WOOL))
                .unlockedBy(getHasName(Items.RED_WOOL), has(Items.RED_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.RED.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.BROWN.getId()),
                Ingredient.of(Items.BROWN_WOOL))
                .unlockedBy(getHasName(Items.BROWN_WOOL), has(Items.BROWN_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.BROWN.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.GRAY.getId()),
                Ingredient.of(Items.GRAY_WOOL))
                .unlockedBy(getHasName(Items.GRAY_WOOL), has(Items.GRAY_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.GRAY.getId()))));

        createFourForFourWendysMealRecipe(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_GRAY.getId()),
                Ingredient.of(Items.LIGHT_GRAY_WOOL))
                .unlockedBy(getHasName(Items.LIGHT_GRAY_WOOL), has(Items.LIGHT_GRAY_WOOL))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.getDyedKnittedWools(DyeColor.LIGHT_GRAY.getId()))));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.MOSS_PASTE, 4)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy(getHasName(Blocks.MOSS_BLOCK), has(Blocks.MOSS_BLOCK))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSS_PASTE))));

//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.SPRUCE_CHEST, 1)
//                .input('#', Items.SPRUCE_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.SPRUCE_PLANKS), conditionsFromItem(Items.SPRUCE_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.SPRUCE_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.CRIMSON_CHEST, 1)
//                .input('#', Items.CRIMSON_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.CRIMSON_PLANKS), conditionsFromItem(Items.CRIMSON_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CRIMSON_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.WARPED_CHEST, 1)
//                .input('#', Items.WARPED_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.WARPED_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.CHERRY_CHEST, 1)
//                .input('#', Items.CHERRY_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.CHERRY_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.MANGROVE_CHEST, 1)
//                .input('#', Items.MANGROVE_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.MANGROVE_PLANKS), conditionsFromItem(Items.MANGROVE_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.MANGROVE_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.DARK_OAK_CHEST, 1)
//                .input('#', Items.DARK_OAK_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.DARK_OAK_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.ACACIA_CHEST, 1)
//                .input('#', Items.ACACIA_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.ACACIA_PLANKS), conditionsFromItem(Items.ACACIA_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ACACIA_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.JUNGLE_CHEST, 1)
//                .input('#', Items.JUNGLE_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.JUNGLE_PLANKS), conditionsFromItem(Items.JUNGLE_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.JUNGLE_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.BIRCH_CHEST, 1)
//                .input('#', Items.BIRCH_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(Items.BIRCH_PLANKS), conditionsFromItem(Items.BIRCH_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.BIRCH_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.ANCIENT_CHEST, 1)
//                .input('#', EBBlocks.ANCIENT_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(EBBlocks.ANCIENT_PLANKS), conditionsFromItem(EBBlocks.ANCIENT_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.ANCIENT_CHEST)));
//
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, EBBlocks.GLOOM_CHEST, 1)
//                .input('#', EBBlocks.GLOOM_PLANKS)
//                .pattern("###")
//                .pattern("# #")
//                .pattern("###")
//                .criterion(hasItem(EBBlocks.GLOOM_PLANKS), conditionsFromItem(EBBlocks.GLOOM_PLANKS))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.GLOOM_CHEST)));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_SPRUCE_CHEST, 1)
//                .input(EBBlocks.SPRUCE_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.SPRUCE_CHEST), conditionsFromItem(EBBlocks.SPRUCE_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_SPRUCE_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_BIRCH_CHEST, 1)
//                .input(EBBlocks.BIRCH_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.BIRCH_CHEST), conditionsFromItem(EBBlocks.BIRCH_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_BIRCH_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_JUNGLE_CHEST, 1)
//                .input(EBBlocks.JUNGLE_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.JUNGLE_CHEST), conditionsFromItem(EBBlocks.JUNGLE_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_JUNGLE_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_ACACIA_CHEST, 1)
//                .input(EBBlocks.ACACIA_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.ACACIA_CHEST), conditionsFromItem(EBBlocks.ACACIA_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_ACACIA_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_DARK_OAK_CHEST, 1)
//                .input(EBBlocks.DARK_OAK_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.DARK_OAK_CHEST), conditionsFromItem(EBBlocks.DARK_OAK_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_DARK_OAK_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_MANGROVE_CHEST, 1)
//                .input(EBBlocks.MANGROVE_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.MANGROVE_CHEST), conditionsFromItem(EBBlocks.MANGROVE_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_MANGROVE_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_CHERRY_CHEST, 1)
//                .input(EBBlocks.CHERRY_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.CHERRY_CHEST), conditionsFromItem(EBBlocks.CHERRY_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_CHERRY_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_BAMBOO_CHEST, 1)
//                .input(EBBlocks.BAMBOO_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.BAMBOO_CHEST), conditionsFromItem(EBBlocks.BAMBOO_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_BAMBOO_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_WARPED_CHEST, 1)
//                .input(EBBlocks.WARPED_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.WARPED_CHEST), conditionsFromItem(EBBlocks.WARPED_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_WARPED_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_CRIMSON_CHEST, 1)
//                .input(EBBlocks.CRIMSON_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.CRIMSON_CHEST), conditionsFromItem(EBBlocks.CRIMSON_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_CRIMSON_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_ANCIENT_CHEST, 1)
//                .input(EBBlocks.ANCIENT_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.ANCIENT_CHEST), conditionsFromItem(EBBlocks.ANCIENT_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_ANCIENT_CHEST))));
//
//        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, EBBlocks.TRAPPED_GLOOM_CHEST, 1)
//                .input(EBBlocks.GLOOM_CHEST).input(Items.TRIPWIRE_HOOK)
//                .criterion(hasItem(EBBlocks.GLOOM_CHEST), conditionsFromItem(EBBlocks.GLOOM_CHEST))
//                .criterion(hasItem(Items.TRIPWIRE_HOOK), conditionsFromItem(Items.TRIPWIRE_HOOK))
//                .offerTo(exporter, Identifier.of((getRecipeName(EBBlocks.TRAPPED_GLOOM_CHEST))));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SANDSTONE_PILLAR, 2)
                .define('#', EBBlocks.POLISHED_SANDSTONE)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_SANDSTONE), has(EBBlocks.POLISHED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SANDSTONE_PILLAR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.RED_SANDSTONE_PILLAR, 2)
                .define('#', EBBlocks.POLISHED_RED_SANDSTONE)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_RED_SANDSTONE), has(EBBlocks.POLISHED_RED_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.RED_SANDSTONE_PILLAR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SOUL_SANDSTONE_PILLAR, 2)
                .define('#', EBBlocks.POLISHED_SOUL_SANDSTONE)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_SOUL_SANDSTONE), has(EBBlocks.POLISHED_SOUL_SANDSTONE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_SANDSTONE_PILLAR)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PAPER_BLOCK, 2)
                .define('#', Items.CLAY_BALL).define('@', Items.PAPER)
                .pattern("#@")
                .pattern("@#")
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.PAPER_BLOCK)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.THIN_PAPER_BLOCK, 5)
                .define('#', ItemTags.PLANKS).define('@', EBBlocks.PAPER_BLOCK)
                .pattern("@#@")
                .pattern("#@#")
                .pattern("@#@")
                .unlockedBy(getHasName(EBBlocks.PAPER_BLOCK), has(EBBlocks.PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THIN_PAPER_BLOCK)));

        stairBuilder(EBBlocks.THIN_PAPER_STAIRS,
                Ingredient.of(EBBlocks.THIN_PAPER_BLOCK))
                .unlockedBy(getHasName(EBBlocks.THIN_PAPER_BLOCK), has(EBBlocks.THIN_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THIN_PAPER_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.THIN_PAPER_SLAB,
                Ingredient.of(EBBlocks.THIN_PAPER_BLOCK))
                .unlockedBy(getHasName(EBBlocks.THIN_PAPER_BLOCK), has(EBBlocks.THIN_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THIN_PAPER_SLAB)));

        createVerticalStairsRecipe(EBBlocks.THIN_PAPER_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.THIN_PAPER_BLOCK))
                .unlockedBy(getHasName(EBBlocks.THIN_PAPER_BLOCK), has(EBBlocks.THIN_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THIN_PAPER_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.THICK_PAPER_STAIRS,
                Ingredient.of(EBBlocks.THICK_PAPER_BLOCK))
                .unlockedBy(getHasName(EBBlocks.THICK_PAPER_BLOCK), has(EBBlocks.THICK_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THICK_PAPER_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.THICK_PAPER_SLAB,
                Ingredient.of(EBBlocks.THICK_PAPER_BLOCK))
                .unlockedBy(getHasName(EBBlocks.THICK_PAPER_BLOCK), has(EBBlocks.THICK_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THICK_PAPER_SLAB)));

        createVerticalStairsRecipe(EBBlocks.THICK_PAPER_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.THICK_PAPER_BLOCK))
                .unlockedBy(getHasName(EBBlocks.THICK_PAPER_BLOCK), has(EBBlocks.THICK_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THICK_PAPER_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.THIN_DIAGONAL_PAPER_BLOCK, 6)
                .define('#', ItemTags.PLANKS).define('@', EBBlocks.THIN_PAPER_BLOCK)
                .pattern("@@#")
                .pattern("@#@")
                .pattern("#@@")
                .unlockedBy(getHasName(EBBlocks.THIN_PAPER_BLOCK), has(EBBlocks.THIN_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THIN_DIAGONAL_PAPER_BLOCK)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.THIN_DIVIDED_PAPER_BLOCK, 6)
                .define('#', ItemTags.PLANKS).define('@', EBBlocks.THIN_PAPER_BLOCK)
                .pattern("@#@")
                .pattern("@#@")
                .pattern("@#@")
                .unlockedBy(getHasName(EBBlocks.THIN_PAPER_BLOCK), has(EBBlocks.THIN_PAPER_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.THIN_DIVIDED_PAPER_BLOCK)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.AMETHYST_LAMP, 2)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.IRON_INGOT).define('!', Items.IRON_NUGGET)
                .pattern("@!@")
                .pattern("###")
                .pattern("@!@")
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.AMETHYST_LAMP)));

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraStairs(colors.getId()), EBBlocks.getDyedAlmentra(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraSlab(colors.getId()), EBBlocks.getDyedAlmentra(colors.getId()), 2);
        }

        for (DyeColor colors : DyeColor.values()) {
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraVerticalStairs(colors.getId()), EBBlocks.getDyedAlmentra(colors.getId()), 1);
        }

        for (DyeColor colors : DyeColor.values()) {
            stairBuilder(EBBlocks.getDyedAlmentraStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId())), has(EBBlocks.getDyedAlmentra(colors.getId())))
                    .save(exporter, getSimpleRecipeName(EBBlocks.getDyedAlmentraStairs(colors.getId())));
        }

        for (DyeColor colors : DyeColor.values()) {
            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraSlab(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId())), has(EBBlocks.getDyedAlmentra(colors.getId())))
                    .save(exporter, getSimpleRecipeName(EBBlocks.getDyedAlmentraSlab(colors.getId())));
        }

        for (DyeColor colors : DyeColor.values()) {
            createVerticalStairsRecipe(EBBlocks.getDyedAlmentraVerticalStairs(colors.getId()),
                    Ingredient.of(EBBlocks.getDyedAlmentra(colors.getId())))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId())), has(EBBlocks.getDyedAlmentra(colors.getId())))
                    .save(exporter, getSimpleRecipeName(EBBlocks.getDyedAlmentraVerticalStairs(colors.getId())));
        }

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1)
                .requires(Blocks.MOSS_BLOCK).requires(EBBlocks.COBBLESTONE_BRICKS)
                .unlockedBy(getHasName(Blocks.MOSS_BLOCK), has(Blocks.MOSS_BLOCK))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICKS) + "_from_moss")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1)
                .requires(Blocks.VINE).requires(EBBlocks.COBBLESTONE_BRICKS)
                .unlockedBy(getHasName(Blocks.VINE), has(Blocks.VINE))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICKS) + "_from_vine")));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.HAMMER, 1)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.GOLD_INGOT).define('!', Items.STICK)
                .pattern("###")
                .pattern("#@#")
                .pattern(" ! ")
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBItems.HAMMER)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS, 1)
                .requires(Blocks.SCULK).requires(EBBlocks.COBBLED_DEEPSLATE_BRICKS)
                .unlockedBy(getHasName(Blocks.SCULK), has(Blocks.SCULK))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS) + "_from_sculk")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS, 1)
                .requires(Blocks.SCULK_VEIN).requires(EBBlocks.COBBLED_DEEPSLATE_BRICKS)
                .unlockedBy(getHasName(Blocks.SCULK_VEIN), has(Blocks.SCULK_VEIN))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS) + "_from_vein")));

        stairBuilder(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS), has(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB,
                Ingredient.of(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS), has(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB)));
        
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_STAIRS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_SLAB, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS, 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_DEEPSLATE_BRICKS, 1)
                .requires(Blocks.SCULK).requires(Blocks.DEEPSLATE_BRICKS)
                .unlockedBy(getHasName(Blocks.SCULK), has(Blocks.SCULK))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSSY_DEEPSLATE_BRICKS) + "_from_sculk")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_DEEPSLATE_BRICKS, 1)
                .requires(Blocks.SCULK_VEIN).requires(Blocks.DEEPSLATE_BRICKS)
                .unlockedBy(getHasName(Blocks.SCULK_VEIN), has(Blocks.SCULK_VEIN))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.MOSSY_DEEPSLATE_BRICKS) + "_from_vein")));

        stairBuilder(EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.MOSSY_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_DEEPSLATE_BRICKS), has(EBBlocks.MOSSY_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB,
                Ingredient.of(EBBlocks.MOSSY_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_DEEPSLATE_BRICKS), has(EBBlocks.MOSSY_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, EBBlocks.MOSSY_DEEPSLATE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, EBBlocks.MOSSY_DEEPSLATE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_DEEPSLATE_BRICK_VERTICAL_STAIRS, EBBlocks.MOSSY_DEEPSLATE_BRICKS, 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_BLACKSTONE_BRICKS, 1)
                .requires(Blocks.WEEPING_VINES).requires(EBBlocks.BLACKSTONE_BRICKS)
                .unlockedBy(getHasName(Blocks.WEEPING_VINES), has(Blocks.WEEPING_VINES))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.WEEPING_BLACKSTONE_BRICKS) + "_from_vines")));

        stairBuilder(EBBlocks.WEEPING_BLACKSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WEEPING_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEEPING_BLACKSTONE_BRICKS), has(EBBlocks.WEEPING_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_BLACKSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_BLACKSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.WEEPING_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEEPING_BLACKSTONE_BRICKS), has(EBBlocks.WEEPING_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_BLACKSTONE_BRICK_SLAB)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_BLACKSTONE_BRICK_STAIRS, EBBlocks.WEEPING_BLACKSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_BLACKSTONE_BRICK_SLAB, EBBlocks.WEEPING_BLACKSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.WEEPING_BLACKSTONE_BRICKS, 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, 1)
                .requires(Blocks.WEEPING_VINES).requires(Blocks.POLISHED_BLACKSTONE_BRICKS)
                .unlockedBy(getHasName(Blocks.WEEPING_VINES), has(Blocks.WEEPING_VINES))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS) + "_from_vines")));

        stairBuilder(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS), has(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS), has(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_STAIRS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_SLAB, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_BLACKSTONE_BRICKS, 1)
                .requires(Blocks.TWISTING_VINES).requires(EBBlocks.BLACKSTONE_BRICKS)
                .unlockedBy(getHasName(Blocks.TWISTING_VINES), has(Blocks.TWISTING_VINES))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.TWISTING_BLACKSTONE_BRICKS) + "_from_vines")));

        stairBuilder(EBBlocks.TWISTING_BLACKSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.TWISTING_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.TWISTING_BLACKSTONE_BRICKS), has(EBBlocks.TWISTING_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_BLACKSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_BLACKSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.TWISTING_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.TWISTING_BLACKSTONE_BRICKS), has(EBBlocks.TWISTING_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_BLACKSTONE_BRICK_SLAB)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_BLACKSTONE_BRICK_STAIRS, EBBlocks.TWISTING_BLACKSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_BLACKSTONE_BRICK_SLAB, EBBlocks.TWISTING_BLACKSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.TWISTING_BLACKSTONE_BRICKS, 1);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, 1)
                .requires(Blocks.TWISTING_VINES).requires(Blocks.POLISHED_BLACKSTONE_BRICKS)
                .unlockedBy(getHasName(Blocks.TWISTING_VINES), has(Blocks.TWISTING_VINES))
                .save(exporter, ResourceLocation.parse((getSimpleRecipeName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS) + "_from_vines")));

        stairBuilder(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS,
                Ingredient.of(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS), has(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB,
                Ingredient.of(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS), has(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_STAIRS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, 1);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_SLAB, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_VERTICAL_STAIRS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, 1);

        stairBuilder(EBBlocks.OAK_BOARD_STAIRS,
                Ingredient.of(EBBlocks.OAK_BOARDS))
                .unlockedBy(getHasName(EBBlocks.OAK_BOARDS), has(EBBlocks.OAK_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OAK_BOARD_SLAB,
                Ingredient.of(EBBlocks.OAK_BOARDS))
                .unlockedBy(getHasName(EBBlocks.OAK_BOARDS), has(EBBlocks.OAK_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.OAK_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.OAK_BOARDS))
                .unlockedBy(getHasName(EBBlocks.OAK_BOARDS), has(EBBlocks.OAK_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.OAK_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.SPRUCE_BOARD_STAIRS,
                Ingredient.of(EBBlocks.SPRUCE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.SPRUCE_BOARDS), has(EBBlocks.SPRUCE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SPRUCE_BOARD_SLAB,
                Ingredient.of(EBBlocks.SPRUCE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.SPRUCE_BOARDS), has(EBBlocks.SPRUCE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.SPRUCE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.SPRUCE_BOARDS), has(EBBlocks.SPRUCE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SPRUCE_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.BIRCH_BOARD_STAIRS,
                Ingredient.of(EBBlocks.BIRCH_BOARDS))
                .unlockedBy(getHasName(EBBlocks.BIRCH_BOARDS), has(EBBlocks.BIRCH_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BIRCH_BOARD_SLAB,
                Ingredient.of(EBBlocks.BIRCH_BOARDS))
                .unlockedBy(getHasName(EBBlocks.BIRCH_BOARDS), has(EBBlocks.BIRCH_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BIRCH_BOARDS))
                .unlockedBy(getHasName(EBBlocks.BIRCH_BOARDS), has(EBBlocks.BIRCH_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BIRCH_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.JUNGLE_BOARD_STAIRS,
                Ingredient.of(EBBlocks.JUNGLE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.JUNGLE_BOARDS), has(EBBlocks.JUNGLE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.JUNGLE_BOARD_SLAB,
                Ingredient.of(EBBlocks.JUNGLE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.JUNGLE_BOARDS), has(EBBlocks.JUNGLE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.JUNGLE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.JUNGLE_BOARDS), has(EBBlocks.JUNGLE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.JUNGLE_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.ACACIA_BOARD_STAIRS,
                Ingredient.of(EBBlocks.ACACIA_BOARDS))
                .unlockedBy(getHasName(EBBlocks.ACACIA_BOARDS), has(EBBlocks.ACACIA_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ACACIA_BOARD_SLAB,
                Ingredient.of(EBBlocks.ACACIA_BOARDS))
                .unlockedBy(getHasName(EBBlocks.ACACIA_BOARDS), has(EBBlocks.ACACIA_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ACACIA_BOARDS))
                .unlockedBy(getHasName(EBBlocks.ACACIA_BOARDS), has(EBBlocks.ACACIA_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ACACIA_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.DARK_OAK_BOARD_STAIRS,
                Ingredient.of(EBBlocks.DARK_OAK_BOARDS))
                .unlockedBy(getHasName(EBBlocks.DARK_OAK_BOARDS), has(EBBlocks.DARK_OAK_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DARK_OAK_BOARD_SLAB,
                Ingredient.of(EBBlocks.DARK_OAK_BOARDS))
                .unlockedBy(getHasName(EBBlocks.DARK_OAK_BOARDS), has(EBBlocks.DARK_OAK_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.DARK_OAK_BOARDS))
                .unlockedBy(getHasName(EBBlocks.DARK_OAK_BOARDS), has(EBBlocks.DARK_OAK_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.DARK_OAK_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.MANGROVE_BOARD_STAIRS,
                Ingredient.of(EBBlocks.MANGROVE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.MANGROVE_BOARDS), has(EBBlocks.MANGROVE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MANGROVE_BOARD_SLAB,
                Ingredient.of(EBBlocks.MANGROVE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.MANGROVE_BOARDS), has(EBBlocks.MANGROVE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.MANGROVE_BOARDS))
                .unlockedBy(getHasName(EBBlocks.MANGROVE_BOARDS), has(EBBlocks.MANGROVE_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MANGROVE_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.CHERRY_BOARD_STAIRS,
                Ingredient.of(EBBlocks.CHERRY_BOARDS))
                .unlockedBy(getHasName(EBBlocks.CHERRY_BOARDS), has(EBBlocks.CHERRY_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHERRY_BOARD_SLAB,
                Ingredient.of(EBBlocks.CHERRY_BOARDS))
                .unlockedBy(getHasName(EBBlocks.CHERRY_BOARDS), has(EBBlocks.CHERRY_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.CHERRY_BOARDS))
                .unlockedBy(getHasName(EBBlocks.CHERRY_BOARDS), has(EBBlocks.CHERRY_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHERRY_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.BAMBOO_BOARD_STAIRS,
                Ingredient.of(EBBlocks.BAMBOO_BOARDS))
                .unlockedBy(getHasName(EBBlocks.BAMBOO_BOARDS), has(EBBlocks.BAMBOO_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BAMBOO_BOARD_SLAB,
                Ingredient.of(EBBlocks.BAMBOO_BOARDS))
                .unlockedBy(getHasName(EBBlocks.BAMBOO_BOARDS), has(EBBlocks.BAMBOO_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.BAMBOO_BOARDS))
                .unlockedBy(getHasName(EBBlocks.BAMBOO_BOARDS), has(EBBlocks.BAMBOO_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BAMBOO_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.CRIMSON_BOARD_STAIRS,
                Ingredient.of(EBBlocks.CRIMSON_BOARDS))
                .unlockedBy(getHasName(EBBlocks.CRIMSON_BOARDS), has(EBBlocks.CRIMSON_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CRIMSON_BOARD_SLAB,
                Ingredient.of(EBBlocks.CRIMSON_BOARDS))
                .unlockedBy(getHasName(EBBlocks.CRIMSON_BOARDS), has(EBBlocks.CRIMSON_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.CRIMSON_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.CRIMSON_BOARDS))
                .unlockedBy(getHasName(EBBlocks.CRIMSON_BOARDS), has(EBBlocks.CRIMSON_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CRIMSON_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.WARPED_BOARD_STAIRS,
                Ingredient.of(EBBlocks.WARPED_BOARDS))
                .unlockedBy(getHasName(EBBlocks.WARPED_BOARDS), has(EBBlocks.WARPED_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WARPED_BOARD_SLAB,
                Ingredient.of(EBBlocks.WARPED_BOARDS))
                .unlockedBy(getHasName(EBBlocks.WARPED_BOARDS), has(EBBlocks.WARPED_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.WARPED_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.WARPED_BOARDS))
                .unlockedBy(getHasName(EBBlocks.WARPED_BOARDS), has(EBBlocks.WARPED_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WARPED_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.ANCIENT_BOARD_STAIRS,
                Ingredient.of(EBBlocks.ANCIENT_BOARDS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_BOARDS), has(EBBlocks.ANCIENT_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANCIENT_BOARD_SLAB,
                Ingredient.of(EBBlocks.ANCIENT_BOARDS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_BOARDS), has(EBBlocks.ANCIENT_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ANCIENT_BOARDS))
                .unlockedBy(getHasName(EBBlocks.ANCIENT_BOARDS), has(EBBlocks.ANCIENT_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ANCIENT_BOARD_VERTICAL_STAIRS)));

        stairBuilder(EBBlocks.GLOOM_BOARD_STAIRS,
                Ingredient.of(EBBlocks.GLOOM_BOARDS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_BOARDS), has(EBBlocks.GLOOM_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_BOARD_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GLOOM_BOARD_SLAB,
                Ingredient.of(EBBlocks.GLOOM_BOARDS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_BOARDS), has(EBBlocks.GLOOM_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_BOARD_SLAB)));

        createVerticalStairsRecipe(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.GLOOM_BOARDS))
                .unlockedBy(getHasName(EBBlocks.GLOOM_BOARDS), has(EBBlocks.GLOOM_BOARDS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GLOOM_BOARD_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARMADILLO_SCUTE_BLOCK, 1)
                .define('@', Items.ARMADILLO_SCUTE)
                .pattern("@@")
                .pattern("@@")
                .unlockedBy(getHasName(Items.ARMADILLO_SCUTE), has(Items.ARMADILLO_SCUTE))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ARMADILLO_SCUTE_BLOCK)));

        stairBuilder(EBBlocks.ARMADILLO_SCUTE_STAIRS,
                Ingredient.of(EBBlocks.ARMADILLO_SCUTE_BLOCK))
                .unlockedBy(getHasName(EBBlocks.ARMADILLO_SCUTE_BLOCK), has(EBBlocks.ARMADILLO_SCUTE_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ARMADILLO_SCUTE_STAIRS)));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARMADILLO_SCUTE_SLAB,
                Ingredient.of(EBBlocks.ARMADILLO_SCUTE_BLOCK))
                .unlockedBy(getHasName(EBBlocks.ARMADILLO_SCUTE_BLOCK), has(EBBlocks.ARMADILLO_SCUTE_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ARMADILLO_SCUTE_SLAB)));

        createVerticalStairsRecipe(EBBlocks.ARMADILLO_SCUTE_VERTICAL_STAIRS,
                Ingredient.of(EBBlocks.ARMADILLO_SCUTE_BLOCK))
                .unlockedBy(getHasName(EBBlocks.ARMADILLO_SCUTE_BLOCK), has(EBBlocks.ARMADILLO_SCUTE_BLOCK))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.ARMADILLO_SCUTE_VERTICAL_STAIRS)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.WICKED_JACK_O_LANTERN, 1)
                .requires(EBBlocks.WICKED_CARVED_PUMPKIN).requires(Blocks.TORCH)
                .unlockedBy(getHasName(EBBlocks.WICKED_CARVED_PUMPKIN), has(EBBlocks.WICKED_CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WICKED_JACK_O_LANTERN)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.GRUMPY_JACK_O_LANTERN, 1)
                .requires(EBBlocks.GRUMPY_CARVED_PUMPKIN).requires(Blocks.TORCH)
                .unlockedBy(getHasName(EBBlocks.GRUMPY_CARVED_PUMPKIN), has(EBBlocks.GRUMPY_CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRUMPY_JACK_O_LANTERN)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.CHEERFUL_JACK_O_LANTERN, 1)
                .requires(EBBlocks.CHEERFUL_CARVED_PUMPKIN).requires(Blocks.TORCH)
                .unlockedBy(getHasName(EBBlocks.CHEERFUL_CARVED_PUMPKIN), has(EBBlocks.CHEERFUL_CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHEERFUL_JACK_O_LANTERN)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.WICKED_SOUL_JACK_O_LANTERN, 1)
                .requires(EBBlocks.WICKED_CARVED_PUMPKIN).requires(Blocks.SOUL_TORCH)
                .unlockedBy(getHasName(EBBlocks.WICKED_CARVED_PUMPKIN), has(EBBlocks.WICKED_CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WICKED_SOUL_JACK_O_LANTERN)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.GRUMPY_SOUL_JACK_O_LANTERN, 1)
                .requires(EBBlocks.GRUMPY_CARVED_PUMPKIN).requires(Blocks.SOUL_TORCH)
                .unlockedBy(getHasName(EBBlocks.GRUMPY_CARVED_PUMPKIN), has(EBBlocks.GRUMPY_CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.GRUMPY_SOUL_JACK_O_LANTERN)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.CHEERFUL_SOUL_JACK_O_LANTERN, 1)
                .requires(EBBlocks.CHEERFUL_CARVED_PUMPKIN).requires(Blocks.SOUL_TORCH)
                .unlockedBy(getHasName(EBBlocks.CHEERFUL_CARVED_PUMPKIN), has(EBBlocks.CHEERFUL_CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.CHEERFUL_SOUL_JACK_O_LANTERN)));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, EBBlocks.SOUL_JACK_O_LANTERN, 1)
                .requires(Blocks.CARVED_PUMPKIN).requires(Blocks.SOUL_TORCH)
                .unlockedBy(getHasName(Blocks.CARVED_PUMPKIN), has(Blocks.CARVED_PUMPKIN))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.SOUL_JACK_O_LANTERN)));

        createTerracottaPotRecipe(EBBlocks.TERRACOTTA_POT, 3,
                Ingredient.of(Blocks.TERRACOTTA))
                .unlockedBy(getHasName(Blocks.TERRACOTTA), has(Blocks.TERRACOTTA))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TERRACOTTA_POT)));
//todo dyed terracotta pots

//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.BLACK.getId()), 3,
//                Ingredient.ofItems(Blocks.BLACK_TERRACOTTA))
//                .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.BLACK.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.WHITE.getId()), 3,
//                Ingredient.ofItems(Blocks.WHITE_TERRACOTTA))
//                .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.WHITE.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.GRAY.getId()), 3,
//                Ingredient.ofItems(Blocks.GRAY_TERRACOTTA))
//                .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.GRAY.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.LIGHT_GRAY.getId()), 3,
//                Ingredient.ofItems(Blocks.LIGHT_GRAY_TERRACOTTA))
//                .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.LIGHT_GRAY.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.BROWN.getId()), 3,
//                Ingredient.ofItems(Blocks.BROWN_TERRACOTTA))
//                .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.BROWN.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.RED.getId()), 3,
//                Ingredient.ofItems(Blocks.RED_TERRACOTTA))
//                .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.RED.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.ORANGE.getId()), 3,
//                Ingredient.ofItems(Blocks.ORANGE_TERRACOTTA))
//                .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.ORANGE.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.YELLOW.getId()), 3,
//                Ingredient.ofItems(Blocks.YELLOW_TERRACOTTA))
//                .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.YELLOW.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.LIME.getId()), 3,
//                Ingredient.ofItems(Blocks.LIME_TERRACOTTA))
//                .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.LIME.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.GREEN.getId()), 3,
//                Ingredient.ofItems(Blocks.GREEN_TERRACOTTA))
//                .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.GREEN.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.BLUE.getId()), 3,
//                Ingredient.ofItems(Blocks.BLUE_TERRACOTTA))
//                .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.BLUE.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.LIGHT_BLUE.getId()), 3,
//                Ingredient.ofItems(Blocks.LIGHT_BLUE_TERRACOTTA))
//                .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.LIGHT_BLUE.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.CYAN.getId()), 3,
//                Ingredient.ofItems(Blocks.CYAN_TERRACOTTA))
//                .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.CYAN.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.PURPLE.getId()), 3,
//                Ingredient.ofItems(Blocks.PURPLE_TERRACOTTA))
//                .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.PURPLE.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.MAGENTA.getId()), 3,
//                Ingredient.ofItems(Blocks.MAGENTA_TERRACOTTA))
//                .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.MAGENTA.getId()))));
//
//        createTerracottaPotRecipe(EBBlocks.getDyedTerracottaPots(DyeColor.PINK.getId()), 3,
//                Ingredient.ofItems(Blocks.PINK_TERRACOTTA))
//                .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
//                .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(DyeColor.PINK.getId()))));
//
//        for (DyeColor colors : DyeColor.values()) {
//            createDyingRecipe(RecipeCategory.DECORATIONS, EBBlocks.getDyedTerracottaPots(colors.getId()), 3, DyeItem.byColor(colors).getColor())
//                    .criterion(hasItem(EBBlocks.getDyedTerracottaPots(colors.getId())), conditionsFromItem(EBBlocks.getDyedTerracottaPots(colors.getId())))
//                    .offerTo(exporter, Identifier.of(getRecipeName(EBBlocks.getDyedTerracottaPots(colors.getId())) + "_from_base"));
//        }

        createVerticalStairsRecipe(EBBlocks.MUD_BRICK_VERTICAL_STAIRS,
                Ingredient.of(Blocks.MUD_BRICKS))
                .unlockedBy(getHasName(Blocks.MUD_BRICKS), has(Blocks.MUD_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MUD_BRICK_VERTICAL_STAIRS)));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.LECTERN, 1)
                .define('#', ItemTags.WOODEN_SLABS).define('@', EBTags.Items.BOOKSHELF_VARIANTS)
                .pattern("###")
                .pattern(" @ ")
                .pattern(" # ")
                .unlockedBy(getHasName(Blocks.LECTERN), has(EBTags.Items.BOOKSHELF_VARIANTS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(Blocks.LECTERN)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.WRENCH, 1)
                .define('#', Items.COPPER_INGOT)
                .pattern(" # ")
                .pattern(" ##")
                .pattern("#  ")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBItems.WRENCH)));
        
        createPaneRecipe(EBBlocks.COBBLESTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.COBBLESTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS), has(EBBlocks.COBBLESTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLESTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_WALL, EBBlocks.COBBLESTONE_BRICKS, 1);

        createPaneRecipe(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_COBBLESTONE_BRICKS), has(EBBlocks.MOSSY_COBBLESTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL, EBBlocks.MOSSY_COBBLESTONE_BRICKS, 1);

        createPaneRecipe(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.COBBLED_DEEPSLATE_BRICKS), has(EBBlocks.COBBLED_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL, EBBlocks.COBBLED_DEEPSLATE_BRICKS, 1);

        createPaneRecipe(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS), has(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICK_WALL, EBBlocks.MOSSY_COBBLED_DEEPSLATE_BRICKS, 1);

        createPaneRecipe(EBBlocks.BLACKSTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.BLACKSTONE_BRICKS), has(EBBlocks.BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.BLACKSTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.BLACKSTONE_BRICK_WALL, EBBlocks.BLACKSTONE_BRICKS, 1);

        createPaneRecipe(EBBlocks.WEEPING_BLACKSTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.WEEPING_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEEPING_BLACKSTONE_BRICKS), has(EBBlocks.WEEPING_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_BLACKSTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_BLACKSTONE_BRICK_WALL, EBBlocks.WEEPING_BLACKSTONE_BRICKS, 1);

        createPaneRecipe(EBBlocks.TWISTING_BLACKSTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.TWISTING_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.TWISTING_BLACKSTONE_BRICKS), has(EBBlocks.TWISTING_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_BLACKSTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_BLACKSTONE_BRICK_WALL, EBBlocks.TWISTING_BLACKSTONE_BRICKS, 1);

        createPaneRecipe(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS), has(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICK_WALL, EBBlocks.WEEPING_POLISHED_BLACKSTONE_BRICKS, 1);

        createPaneRecipe(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL, 6,
                Ingredient.of(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS))
                .unlockedBy(getHasName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS), has(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS))
                .save(exporter, ResourceLocation.parse(getSimpleRecipeName(EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL)));

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICK_WALL, EBBlocks.TWISTING_POLISHED_BLACKSTONE_BRICKS, 1);
    }

    public static RecipeBuilder createShelfBlock(ItemLike output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, count)
                .define('#', input).define('@', input2)
                .pattern("###")
                .pattern("@@@")
                .pattern("###");
    }

    public static RecipeBuilder createWaxedRecipe(ItemLike output, int count, Ingredient input) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, count)
                .requires(input).requires(Ingredient.of(Items.HONEYCOMB));
    }

    public static RecipeBuilder createPaneRecipe(ItemLike output, int count, Ingredient input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, count)
                .define('#', input)
                .pattern("###")
                .pattern("###");
    }

    public static RecipeBuilder createLadderRecipe(ItemLike output, Ingredient input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, 8)
                .define('#', Ingredient.of(Items.STICK)).define('@', input)
                .pattern("# #")
                .pattern("#@#")
                .pattern("# #");
    }

    public static RecipeBuilder createDyeEightRecipe(ItemLike output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, count)
                .define('#', input).define('@', input2)
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }

    public static RecipeBuilder createBlockEightDyingTagRecipe(ItemLike output, TagKey input, DyeColor color) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define('#', input).define('@', DyeItem.byColor(color))
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }

    public static RecipeBuilder createBlockEightDyingRecipe(ItemLike output, Block input, DyeColor color) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define('#', input).define('@', DyeItem.byColor(color))
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }

    public static RecipeBuilder createDyingRecipe(RecipeCategory category, ItemLike output, int count, DyeColor color) {
        return ShapelessRecipeBuilder.shapeless(category, output, count)
                .requires(DyeItem.byColor(color)).requires(Ingredient.of(EBBlocks.TERRACOTTA_POT));
    }
    
    public static RecipeBuilder createVerticalStairsRecipe(ItemLike output, Ingredient input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define('#', input)
                .pattern("###")
                .pattern("## ")
                .pattern("#  ");
    }

    public static RecipeBuilder createFourForFourWendysMealRecipe(ItemLike output, Ingredient input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define('#', input)
                .pattern("##")
                .pattern("##");
    }

    public static RecipeBuilder createTwoByTwoCheckersMealRecipe(ItemLike output, int count, Ingredient input, Ingredient input2) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, count)
                .define('#', input).define('@', input2)
                .pattern("@#")
                .pattern("#@");
    }

    public static RecipeBuilder createTwoByTwoRecipe(ItemLike output, int count, Ingredient input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, count)
                .define('#', input)
                .pattern("##")
                .pattern("##");
    }

    public static RecipeBuilder createTerracottaPotRecipe(ItemLike output, int count, Ingredient input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, count)
                .define('#', input)
                .pattern(" # ")
                .pattern("# #")
                .pattern("###");
    }
}
