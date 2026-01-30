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
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
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
                .requires(EBBlocks.LAVENDER_BRICKS.get()).requires(EBBlocks.LAVENDER.get())
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get().asItem()), has(EBBlocks.LAVENDER_BRICKS.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.MOSSY_LAVENDER_BRICKS.get()) + "_from_lavender"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.TARGET)
                .define('H', EBBlocks.LAVENDER_BLOCK.get().asItem()).define('R', Items.REDSTONE)
                .pattern(" R ")
                .pattern("RHR")
                .pattern(" R ")
                .unlockedBy(getHasName(Items.REDSTONE), has(EBBlocks.LAVENDER_BLOCK.get().asItem()))
                .group("target")
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

        //=======================BRIMSTONE=======================
        BlockFamily brimstoneFamily = familyBuilder(EBBlocks.BRIMSTONE.get())
                .stairs(EBBlocks.BRIMSTONE_STAIRS.get())
                .slab(EBBlocks.BRIMSTONE_SLAB.get())
                .wall(EBBlocks.BRIMSTONE_WALL.get())
                .polished(EBBlocks.POLISHED_BRIMSTONE.get())
                .recipeUnlockedBy("has_brimstone")
                .getFamily();
        generateRecipes(exporter, brimstoneFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.POLISHED_BRIMSTONE.get(), EBBlocks.BRIMSTONE.get());
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_STAIRS.get(), EBBlocks.BRIMSTONE.get());
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_SLAB.get(), EBBlocks.BRIMSTONE.get(), 2);
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_WALL.get(), EBBlocks.BRIMSTONE.get());

        //=======================POLISHED BRIMSTONE=======================
        BlockFamily polishedBrimstoneFamily = familyBuilder(EBBlocks.POLISHED_BRIMSTONE.get())
                .stairs(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get())
                .slab(EBBlocks.POLISHED_BRIMSTONE_SLAB.get())
                .polished(EBBlocks.BRIMSTONE_BRICKS.get())
                .recipeUnlockedBy("has_polished_brimstone")
                .getFamily();
        generateRecipes(exporter, polishedBrimstoneFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.BRIMSTONE_BRICKS.get(), EBBlocks.POLISHED_BRIMSTONE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get(), EBBlocks.POLISHED_BRIMSTONE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_BRIMSTONE_SLAB.get(), EBBlocks.POLISHED_BRIMSTONE.get(), 2);

        //=======================BRIMSTONE BRICKS=======================
        BlockFamily brimstoneBricksFamily = familyBuilder(EBBlocks.BRIMSTONE_BRICKS.get())
                .stairs(EBBlocks.BRIMSTONE_BRICK_STAIRS.get())
                .slab(EBBlocks.BRIMSTONE_BRICK_SLAB.get())
                .wall(EBBlocks.BRIMSTONE_BRICK_WALL.get())
                .polished(EBBlocks.BRIMSTONE_TILES.get())
                .recipeUnlockedBy("has_brimstone_bricks")
                .getFamily();
        generateRecipes(exporter, brimstoneBricksFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.BRIMSTONE_TILES.get(), EBBlocks.BRIMSTONE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_BRICK_STAIRS.get(), EBBlocks.BRIMSTONE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_BRICK_SLAB.get(), EBBlocks.BRIMSTONE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_BRICK_WALL.get(), EBBlocks.BRIMSTONE_BRICKS.get());

        //=======================BRIMSTONE TILES=======================
        BlockFamily brimstoneTilesFamily = familyBuilder(EBBlocks.BRIMSTONE_TILES.get())
                .stairs(EBBlocks.BRIMSTONE_TILE_STAIRS.get())
                .slab(EBBlocks.BRIMSTONE_TILE_SLAB.get())
                .recipeUnlockedBy("has_brimstone_tiles")
                .getFamily();
        generateRecipes(exporter, brimstoneTilesFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.BRIMSTONE_TILE_STAIRS.get(), EBBlocks.BRIMSTONE_TILES.get());
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_TILE_SLAB.get(), EBBlocks.BRIMSTONE_TILES.get(), 2);

        //=======================BRIMSTONE MISC=======================
        stonecutter.putRecipe(EBBlocks.BRIMSTONE_PILLAR.get(), EBBlocks.POLISHED_BRIMSTONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_PILLAR.get(), 2)
                .define('#', EBBlocks.POLISHED_BRIMSTONE.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE.get()), has(EBBlocks.POLISHED_BRIMSTONE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.BRIMSTONE_PILLAR.get())));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.BRIMSTONE_LAMP.get(), 5)
                .define('#', EBBlocks.POLISHED_BRIMSTONE.get()).define('@', Items.GLOWSTONE_DUST).define('!', Items.REDSTONE)
                .pattern("@#@")
                .pattern("#!#")
                .pattern("@#@")
                .unlockedBy(getHasName(EBBlocks.POLISHED_BRIMSTONE.get()), has(EBBlocks.POLISHED_BRIMSTONE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.BRIMSTONE_LAMP.get())));

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

        //==========================TOOLS==========================
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.GAUNTLET.get(), 1)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.COPPER_INGOT)
                .define('!', Items.AMETHYST_BLOCK).define('%', Items.DIAMOND)
                .pattern("!# ")
                .pattern("#%@")
                .pattern(" @@")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(exporter);
        //==========================MISC==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICKS.get(), Blocks.POLISHED_DIORITE);

        stairBuilder(EBBlocks.DIORITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.DIORITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS.get()), has(EBBlocks.DIORITE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.DIORITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS.get()), has(EBBlocks.DIORITE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.DIORITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS.get()), has(EBBlocks.DIORITE_BRICKS.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.DIORITE_BRICKS.get(), Blocks.POLISHED_DIORITE);
        stonecutter.putRecipe(EBBlocks.DIORITE_BRICK_STAIRS.get(), EBBlocks.DIORITE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.DIORITE_BRICK_SLAB.get(), EBBlocks.DIORITE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.DIORITE_BRICK_WALL.get(), EBBlocks.DIORITE_BRICKS.get());

        //==========================MISC==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICKS.get(), Blocks.POLISHED_GRANITE);

        stairBuilder(EBBlocks.GRANITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.GRANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS.get()), has(EBBlocks.GRANITE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.GRANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS.get()), has(EBBlocks.GRANITE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.GRANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS.get()), has(EBBlocks.GRANITE_BRICKS.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.GRANITE_BRICKS.get(), Blocks.POLISHED_GRANITE);
        stonecutter.putRecipe(EBBlocks.GRANITE_BRICK_STAIRS.get(), EBBlocks.GRANITE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.GRANITE_BRICK_SLAB.get(), EBBlocks.GRANITE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.GRANITE_BRICK_WALL.get(), EBBlocks.GRANITE_BRICKS.get());

        //==========================MISC==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICKS.get(), Blocks.POLISHED_ANDESITE);

        stairBuilder(EBBlocks.ANDESITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ANDESITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS.get()), has(EBBlocks.ANDESITE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ANDESITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS.get()), has(EBBlocks.ANDESITE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.ANDESITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS.get()), has(EBBlocks.ANDESITE_BRICKS.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.ANDESITE_BRICKS.get(), Blocks.POLISHED_ANDESITE);
        stonecutter.putRecipe(EBBlocks.ANDESITE_BRICK_STAIRS.get(), EBBlocks.ANDESITE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.ANDESITE_BRICK_SLAB.get(), EBBlocks.ANDESITE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.ANDESITE_BRICK_WALL.get(), EBBlocks.ANDESITE_BRICKS.get());

        //==========================BASE==========================
        stairBuilder(EBBlocks.CHLOROSLATE_STAIRS.get(), Ingredient.of(EBBlocks.CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE.get()), has(EBBlocks.CHLOROSLATE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_SLAB.get(), Ingredient.of(EBBlocks.CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE.get()), has(EBBlocks.CHLOROSLATE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_WALL.get(), Ingredient.of(EBBlocks.CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE.get()), has(EBBlocks.CHLOROSLATE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_STAIRS.get(), EBBlocks.CHLOROSLATE.get());
        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_SLAB.get(), EBBlocks.CHLOROSLATE.get(), 2);
        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_WALL.get(), EBBlocks.CHLOROSLATE.get());

        //==========================POLISHED==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_CHLOROSLATE.get(), EBBlocks.CHLOROSLATE.get());

        stairBuilder(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.POLISHED_CHLOROSLATE.get(), EBBlocks.CHLOROSLATE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), EBBlocks.CHLOROSLATE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), EBBlocks.CHLOROSLATE.get(), 2);
        stonecutter.putRecipe(EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), EBBlocks.CHLOROSLATE.get());

        stonecutter.putRecipe(EBBlocks.CHISELED_CHLOROSLATE.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        //==========================BRICKS==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_BRICKS.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        stairBuilder(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE_BRICKS.get()), has(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE_BRICKS.get()), has(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_BRICK_WALL.get(), Ingredient.of(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE_BRICKS.get()), has(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_BRICKS.get(), EBBlocks.POLISHED_CHLOROSLATE.get());
        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), EBBlocks.POLISHED_CHLOROSLATE.get());
        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), EBBlocks.POLISHED_CHLOROSLATE.get(), 2);
        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_BRICK_WALL.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        //==========================BASE==========================
        stairBuilder(EBBlocks.HECTALITE_STAIRS.get(), Ingredient.of(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_SLAB.get(), Ingredient.of(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_WALL.get(), Ingredient.of(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.HECTALITE_STAIRS.get(), EBBlocks.HECTALITE.get());
        stonecutter.putRecipe(EBBlocks.HECTALITE_SLAB.get(), EBBlocks.HECTALITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.HECTALITE_WALL.get(), EBBlocks.HECTALITE.get());

        //==========================POLISHED==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_HECTALITE.get(), EBBlocks.HECTALITE.get());

        stairBuilder(EBBlocks.POLISHED_HECTALITE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_HECTALITE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_HECTALITE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.POLISHED_HECTALITE.get(), EBBlocks.HECTALITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_HECTALITE_STAIRS.get(), EBBlocks.HECTALITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_HECTALITE_SLAB.get(), EBBlocks.HECTALITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.POLISHED_HECTALITE_WALL.get(), EBBlocks.HECTALITE.get());

        stonecutter.putRecipe(EBBlocks.CHISELED_HECTALITE.get(), EBBlocks.POLISHED_HECTALITE.get());

        //==========================BRICKS==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_BRICKS.get(), EBBlocks.POLISHED_HECTALITE.get());

        stairBuilder(EBBlocks.HECTALITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.HECTALITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE_BRICKS.get()), has(EBBlocks.HECTALITE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.HECTALITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE_BRICKS.get()), has(EBBlocks.HECTALITE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.HECTALITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE_BRICKS.get()), has(EBBlocks.HECTALITE_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.HECTALITE_BRICKS.get(), EBBlocks.POLISHED_HECTALITE.get());
        stonecutter.putRecipe(EBBlocks.HECTALITE_BRICK_STAIRS.get(), EBBlocks.POLISHED_HECTALITE.get());
        stonecutter.putRecipe(EBBlocks.HECTALITE_BRICK_SLAB.get(), EBBlocks.POLISHED_HECTALITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.HECTALITE_BRICK_WALL.get(), EBBlocks.POLISHED_HECTALITE.get());

        //==========================BASE==========================
        stairBuilder(EBBlocks.ARIDITE_STAIRS.get(), Ingredient.of(EBBlocks.ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_SLAB.get(), Ingredient.of(EBBlocks.ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_WALL.get(), Ingredient.of(EBBlocks.ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.ARIDITE_STAIRS.get(), EBBlocks.ARIDITE.get());
        stonecutter.putRecipe(EBBlocks.ARIDITE_SLAB.get(), EBBlocks.ARIDITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.ARIDITE_WALL.get(), EBBlocks.ARIDITE.get());

        //==========================POLISHED==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ARIDITE.get(), EBBlocks.ARIDITE.get());

        stairBuilder(EBBlocks.POLISHED_ARIDITE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ARIDITE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ARIDITE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.POLISHED_ARIDITE.get(), EBBlocks.ARIDITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_ARIDITE_STAIRS.get(), EBBlocks.ARIDITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_ARIDITE_SLAB.get(), EBBlocks.ARIDITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.POLISHED_ARIDITE_WALL.get(), EBBlocks.ARIDITE.get());

        stonecutter.putRecipe(EBBlocks.CHISELED_ARIDITE.get(), EBBlocks.POLISHED_ARIDITE.get());

        //==========================BRICKS==========================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_BRICKS.get(), EBBlocks.POLISHED_ARIDITE.get());

        stairBuilder(EBBlocks.ARIDITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ARIDITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE_BRICKS.get()), has(EBBlocks.ARIDITE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ARIDITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE_BRICKS.get()), has(EBBlocks.ARIDITE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.ARIDITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE_BRICKS.get()), has(EBBlocks.ARIDITE_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.ARIDITE_BRICKS.get(), EBBlocks.POLISHED_ARIDITE.get());
        stonecutter.putRecipe(EBBlocks.ARIDITE_BRICK_STAIRS.get(), EBBlocks.POLISHED_ARIDITE.get());
        stonecutter.putRecipe(EBBlocks.ARIDITE_BRICK_SLAB.get(), EBBlocks.POLISHED_ARIDITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.ARIDITE_BRICK_WALL.get(), EBBlocks.POLISHED_ARIDITE.get());

        //==========================COLOR MISC==========================
        stonecutter.putRecipe(EBBlocks.ARIDITE_PILLAR.get(), EBBlocks.POLISHED_ARIDITE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_PILLAR.get(), 2)
                .define('#', EBBlocks.POLISHED_ARIDITE.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.ARIDITE_PILLAR.get())));

        stonecutter.putRecipe(EBBlocks.HECTALITE_PILLAR.get(), EBBlocks.POLISHED_HECTALITE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_PILLAR.get(), 2)
                .define('#', EBBlocks.POLISHED_HECTALITE.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.HECTALITE_PILLAR.get())));

        stonecutter.putRecipe(EBBlocks.CHLOROSLATE_PILLAR.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_PILLAR.get(), 2)
                .define('#', EBBlocks.POLISHED_CHLOROSLATE.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CHLOROSLATE_PILLAR.get())));

        createChiseled(EBBlocks.CHISELED_CHLOROSLATE.get().asItem(), EBBlocks.POLISHED_CHLOROSLATE_SLAB.get().asItem())
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CHISELED_CHLOROSLATE.get())));

        createChiseled(EBBlocks.CHISELED_HECTALITE.get().asItem(), EBBlocks.POLISHED_HECTALITE_SLAB.get().asItem())
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CHISELED_HECTALITE.get())));

        createChiseled(EBBlocks.CHISELED_ARIDITE.get().asItem(), EBBlocks.POLISHED_ARIDITE_SLAB.get().asItem())
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CHISELED_ARIDITE.get())));

        //=======================SAGE=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_CLAY.get(), 2)
                .define('#', Items.CLAY_BALL).define('@', EBBlocks.SAGE.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.BONE_MEAL))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.SAGE_CLAY.get())));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.SAGE_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SAGE_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.SAGE_CLAY.get()), has(EBBlocks.SAGE_CLAY.get())).save(exporter);

        stairBuilder(EBBlocks.SAGE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SAGE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SAGE_BRICKS.get()), has(EBBlocks.SAGE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SAGE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SAGE_BRICKS.get()), has(EBBlocks.SAGE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_BRICK_WALL.get(), Ingredient.of(EBBlocks.SAGE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SAGE_BRICKS.get()), has(EBBlocks.SAGE_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.SAGE_BRICK_STAIRS.get(), EBBlocks.SAGE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SAGE_BRICK_SLAB.get(), EBBlocks.SAGE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SAGE_BRICK_WALL.get(), EBBlocks.SAGE_BRICKS.get());

        nineBlockStorageRecipesRecipesWithCustomUnpacking(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE.get(), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_BLOCK.get(), "sage", "sage");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.MOSSY_SAGE_BRICKS.get(), 1)
                .requires(EBBlocks.SAGE_BRICKS.get()).requires(EBBlocks.SAGE.get())
                .unlockedBy(getHasName(EBBlocks.SAGE_BRICKS.get().asItem()), has(EBBlocks.SAGE_BRICKS.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.MOSSY_SAGE_BRICKS.get()) + "_from_sage"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.TARGET)
                .define('H', EBBlocks.SAGE_BLOCK.get().asItem()).define('R', Items.REDSTONE)
                .pattern(" R ")
                .pattern("RHR")
                .pattern(" R ")
                .unlockedBy(getHasName(Items.REDSTONE), has(EBBlocks.SAGE_BLOCK.get().asItem()))
                .group("target")
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.TARGET) + "_from_sage_block"));

        //=======================DYED=======================
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS,
                EBBlocks.FROSTED_GLASS.get(), 0.1F, 200).unlockedBy(getHasName(Blocks.GLASS), has(Blocks.GLASS)).save(exporter);

        for (DyeColor colors : DyeColor.values()) {
            //CORRUGATED IRON
            createCorrugatedIron(EBBlocks.getDyedCorrugatedIron(colors.getId()).get(), DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                    .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.getDyedCorrugatedIron(colors.getId()).get())));

            stairBuilder(EBBlocks.getDyedCorrugatedIronStairs(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedCorrugatedIron(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedCorrugatedIron(colors.getId()).get()), has(EBBlocks.getDyedCorrugatedIron(colors.getId()).get()))
                    .save(exporter);

            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedCorrugatedIronSlab(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedCorrugatedIron(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedCorrugatedIron(colors.getId()).get()), has(EBBlocks.getDyedCorrugatedIron(colors.getId()).get()))
                    .save(exporter);

            //FROSTED GLASS
            dyeEightForEight(EBBlocks.getDyedFrostedGlass(colors.getId()).get().asItem(), EBBlocks.FROSTED_GLASS.get().asItem(), DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.FROSTED_GLASS.get()), has(EBBlocks.FROSTED_GLASS.get()))
                    .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.getDyedFrostedGlass(colors.getId()).get())));
        }

        //====================================================
        stonecutter.generateRecipes(exporter);
    }

    public static ShapedRecipeBuilder createChiseled(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .define('#', ingredient)
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ingredient), has(ingredient));
    }

    public static ShapedRecipeBuilder createCorrugatedIron(ItemLike output, DyeColor color) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, 8)
                .define('#', Items.IRON_INGOT).define('@', Items.IRON_NUGGET).define('!', DyeItem.byColor(color))
                .pattern("#@#")
                .pattern("@!@")
                .pattern("#@#");
    }

    public static ShapedRecipeBuilder dyeEightForEight(Item output, Item ingredient, DyeColor color) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define('#', ingredient).define('@', DyeItem.byColor(color))
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }
}