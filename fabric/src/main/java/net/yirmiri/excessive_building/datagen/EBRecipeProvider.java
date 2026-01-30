package net.yirmiri.excessive_building.datagen;

import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;
import net.yirmiri.excessive_building.datagen.util.StonecutterRecipeTreeGenerator;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.BlockFamilies.familyBuilder;

public class EBRecipeProvider extends FabricRecipeProvider {
    public EBRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        StonecutterRecipeTreeGenerator stonecutter = new StonecutterRecipeTreeGenerator();

        //=======================COPPER=======================
        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICKS.get(), Items.COPPER_INGOT);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICKS.get(), 4)
                .define('#', Blocks.COPPER_BLOCK)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(Blocks.COPPER_BLOCK), has(Blocks.COPPER_BLOCK))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.COPPER_BRICKS.get()) + "_from_block"));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS.get()), has(EBBlocks.COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COPPER_BRICKS.get()), has(EBBlocks.COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.COPPER_BRICK_STAIRS.get(), EBBlocks.COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.COPPER_BRICK_SLAB.get(), EBBlocks.COPPER_BRICKS.get(), 2);

        //=======================EXPOSED COPPER=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICKS.get(), 4)
                .define('#', Blocks.EXPOSED_COPPER)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(Blocks.EXPOSED_COPPER), has(Blocks.EXPOSED_COPPER))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.EXPOSED_COPPER_BRICKS.get()) + "_from_block"));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.EXPOSED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_BRICKS.get()), has(EBBlocks.EXPOSED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.EXPOSED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EXPOSED_COPPER_BRICKS.get()), has(EBBlocks.EXPOSED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get(), EBBlocks.EXPOSED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get(), EBBlocks.EXPOSED_COPPER_BRICKS.get(), 2);

        //=======================WEATHERED COPPER=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICKS.get(), 4)
                .define('#', Blocks.WEATHERED_COPPER)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(Blocks.WEATHERED_COPPER), has(Blocks.WEATHERED_COPPER))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.WEATHERED_COPPER_BRICKS.get()) + "_from_block"));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.WEATHERED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_BRICKS.get()), has(EBBlocks.WEATHERED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.WEATHERED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WEATHERED_COPPER_BRICKS.get()), has(EBBlocks.WEATHERED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get(), EBBlocks.WEATHERED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get(), EBBlocks.WEATHERED_COPPER_BRICKS.get(), 2);

        //=======================OXIDIZED COPPER=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICKS.get(), 4)
                .define('#', Blocks.OXIDIZED_COPPER)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(Blocks.OXIDIZED_COPPER), has(Blocks.OXIDIZED_COPPER))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.OXIDIZED_COPPER_BRICKS.get()) + "_from_block"));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.OXIDIZED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_BRICKS.get()), has(EBBlocks.OXIDIZED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.OXIDIZED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.OXIDIZED_COPPER_BRICKS.get()), has(EBBlocks.OXIDIZED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get(), EBBlocks.OXIDIZED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get(), EBBlocks.OXIDIZED_COPPER_BRICKS.get(), 2);
        
        //=======================WAXED COPPER=======================
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.WAXED_COPPER_BRICKS.get(), 1)
                .requires(EBBlocks.COPPER_BRICKS.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.WAXED_COPPER_BRICKS.get())));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.WAXED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.WAXED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.WAXED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_COPPER_BRICKS.get(), 2);

        //=======================WAXED EXPOSED COPPER=======================
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get(), 1)
                .requires(EBBlocks.EXPOSED_COPPER_BRICKS.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get())));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get(), 2);

        //=======================WAXED WEATHERED COPPER=======================
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get(), 1)
                .requires(EBBlocks.WEATHERED_COPPER_BRICKS.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get())));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get(), 2);

        //=======================WAXED OXIDIZED COPPER=======================
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get(), 1)
                .requires(EBBlocks.OXIDIZED_COPPER_BRICKS.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get())));

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get()))
                .save(exporter);

        stairBuilder(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get()), has(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get(), EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get(), 2);

        //=======================COBBLESTONE BRICKS=======================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE);

        stairBuilder(EBBlocks.COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_WALL.get(), Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE);
        stonecutter.putRecipe(EBBlocks.COBBLESTONE_BRICK_STAIRS.get(), EBBlocks.COBBLESTONE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.COBBLESTONE_BRICK_SLAB.get(), EBBlocks.COBBLESTONE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.COBBLESTONE_BRICK_WALL.get(), EBBlocks.COBBLESTONE_BRICKS.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS,
                EBBlocks.CRACKED_COBBLESTONE_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get())).save(exporter);

        //=======================CORALSOIL=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL.get(), 2)
                .define('#', Items.CLAY_BALL).define('@', EBTags.ItemT.DEAD_CORAL_BLOCKS)
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CORALSOIL.get())));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.CORALSOIL.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.CORALSOIL_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.CORALSOIL.get()), has(EBBlocks.CORALSOIL.get())).save(exporter);

        stairBuilder(EBBlocks.CORALSOIL_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.CORALSOIL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_BRICKS.get()), has(EBBlocks.CORALSOIL_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_BRICK_SLAB.get(), Ingredient.of(EBBlocks.CORALSOIL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_BRICKS.get()), has(EBBlocks.CORALSOIL_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_BRICK_WALL.get(), Ingredient.of(EBBlocks.CORALSOIL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_BRICKS.get()), has(EBBlocks.CORALSOIL_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.CORALSOIL_BRICK_STAIRS.get(), EBBlocks.CORALSOIL_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.CORALSOIL_BRICK_SLAB.get(), EBBlocks.CORALSOIL_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.CORALSOIL_BRICK_WALL.get(), EBBlocks.CORALSOIL_BRICKS.get());

        //=======================LAVENDER=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_CLAY.get(), 2)
                .define('#', Items.CLAY_BALL).define('@', EBBlocks.LAVENDER.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.BONE_MEAL))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.LAVENDER_CLAY.get())));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LAVENDER_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                EBBlocks.LAVENDER_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LAVENDER_CLAY.get()), has(EBBlocks.LAVENDER_CLAY.get())).save(exporter);

        stairBuilder(EBBlocks.LAVENDER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.LAVENDER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get()), has(EBBlocks.LAVENDER_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.LAVENDER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get()), has(EBBlocks.LAVENDER_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_BRICK_WALL.get(), Ingredient.of(EBBlocks.LAVENDER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get()), has(EBBlocks.LAVENDER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.LAVENDER_BRICK_STAIRS.get(), EBBlocks.LAVENDER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.LAVENDER_BRICK_SLAB.get(), EBBlocks.LAVENDER_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.LAVENDER_BRICK_WALL.get(), EBBlocks.LAVENDER_BRICKS.get());

        nineBlockStorageRecipesRecipesWithCustomUnpacking(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER.get(), RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_BLOCK.get(), "lavender", "lavender");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.MOSSY_LAVENDER_BRICKS.get(), 1)
                .requires(EBBlocks.LAVENDER_BRICKS.get()).requires(Items.MOSS_BLOCK)
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get().asItem()), has(EBBlocks.LAVENDER_BRICKS.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.MOSSY_LAVENDER_BRICKS.get()) + "_from_moss_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.MOSSY_LAVENDER_BRICKS.get(), 1)
                .requires(EBBlocks.LAVENDER_BRICKS.get()).requires(Items.VINE)
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get().asItem()), has(EBBlocks.LAVENDER_BRICKS.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.MOSSY_LAVENDER_BRICKS.get()) + "_from_vine"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.TARGET)
                .define('H', EBBlocks.LAVENDER_BLOCK.get().asItem()).define('R', Items.REDSTONE)
                .pattern(" R ")
                .pattern("RHR")
                .pattern(" R ")
                .unlockedBy(getHasName(Items.REDSTONE), has(EBBlocks.LAVENDER_BLOCK.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.TARGET) + "_from_lavender_block"));
        
        //=======================CONGLOMERATE=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.PEBBLESTONE.get(), 8)
                .define('#', Blocks.SAND).define('!', Blocks.GRAVEL).define('@', ItemTags.STONE_CRAFTING_MATERIALS)
                .pattern("!!!")
                .pattern("!#@")
                .pattern("@@@")
                .unlockedBy(getHasName(Blocks.SAND), has(Blocks.SAND))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.PEBBLESTONE.get())));

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CONGLOMERATE.get(), EBBlocks.PEBBLESTONE.get());

        stairBuilder(EBBlocks.CONGLOMERATE_STAIRS.get(), Ingredient.of(EBBlocks.CONGLOMERATE.get()))
                .unlockedBy(getHasName(EBBlocks.CONGLOMERATE.get()), has(EBBlocks.CONGLOMERATE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CONGLOMERATE_SLAB.get(), Ingredient.of(EBBlocks.CONGLOMERATE.get()))
                .unlockedBy(getHasName(EBBlocks.CONGLOMERATE.get()), has(EBBlocks.CONGLOMERATE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CONGLOMERATE_WALL.get(), Ingredient.of(EBBlocks.CONGLOMERATE.get()))
                .unlockedBy(getHasName(EBBlocks.CONGLOMERATE.get()), has(EBBlocks.CONGLOMERATE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_STAIRS.get(), EBBlocks.CONGLOMERATE.get());
        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_SLAB.get(), EBBlocks.CONGLOMERATE.get(), 2);
        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_WALL.get(), EBBlocks.CONGLOMERATE.get());

        //=======================CONGLOMERATE BRICKS=======================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CONGLOMERATE_BRICKS.get(), EBBlocks.CONGLOMERATE.get());

        stairBuilder(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.CONGLOMERATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CONGLOMERATE_BRICKS.get()), has(EBBlocks.CONGLOMERATE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CONGLOMERATE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.CONGLOMERATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CONGLOMERATE_BRICKS.get()), has(EBBlocks.CONGLOMERATE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CONGLOMERATE_BRICK_WALL.get(), Ingredient.of(EBBlocks.CONGLOMERATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CONGLOMERATE_BRICKS.get()), has(EBBlocks.CONGLOMERATE_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_BRICKS.get(), EBBlocks.CONGLOMERATE.get());
        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get(), EBBlocks.CONGLOMERATE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_BRICK_SLAB.get(), EBBlocks.CONGLOMERATE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.CONGLOMERATE_BRICK_WALL.get(), EBBlocks.CONGLOMERATE_BRICKS.get());

        //=======================ANCIENT WOOD=======================
        BlockFamily ancientFamily = familyBuilder(EBBlocks.ANCIENT_PLANKS.get())
                .stairs(EBBlocks.ANCIENT_STAIRS.get())
                .slab(EBBlocks.ANCIENT_SLAB.get())
                .door(EBBlocks.ANCIENT_DOOR.get())
                .trapdoor(EBBlocks.ANCIENT_TRAPDOOR.get())
                .fence(EBBlocks.ANCIENT_FENCE.get())
                .fenceGate(EBBlocks.ANCIENT_FENCE_GATE.get())
                .sign(EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get())
                .button(EBBlocks.ANCIENT_BUTTON.get())
                .pressurePlate(EBBlocks.ANCIENT_PRESSURE_PLATE.get())
                .recipeGroupPrefix("wooden")
                .recipeUnlockedBy("has_planks")
                .getFamily();
        generateRecipes(exporter, ancientFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        planksFromLogs(exporter, EBBlocks.ANCIENT_PLANKS.get(), EBTags.ItemT.ANCIENT_LOGS, 4);
        woodenBoat(exporter, EBItems.ANCIENT_BOAT.get(), EBBlocks.ANCIENT_PLANKS.get());
        chestBoat(exporter, EBItems.ANCIENT_CHEST_BOAT.get(), EBItems.ANCIENT_BOAT.get());
        hangingSign(exporter, EBItems.ANCIENT_HANGING_SIGN.get(), EBBlocks.STRIPPED_ANCIENT_LOG.get());
        
        //====================================================
        stonecutter.generateRecipes(exporter);
    }
}