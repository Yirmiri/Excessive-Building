package net.yirmiri.excessive_building.datagen;

import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.resources.ResourceLocation;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBItems.CORALSOIL_CLAY_BALL.get(), 4)
                .define('#', Items.CLAY_BALL).define('@', EBTags.ItemT.DEAD_CORAL_BLOCKS)
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.CLAY_BALL), has(EBTags.ItemT.DEAD_CORAL_BLOCKS))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBItems.CORALSOIL_CLAY_BALL.get())));

        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_CLAY.get(), EBItems.CORALSOIL_CLAY_BALL.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.CORALSOIL_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.CORALSOIL_HARDENED_CLAY.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_CLAY.get()), has(EBBlocks.CORALSOIL_CLAY.get())).save(exporter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.CORALSOIL_HARDENED_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.CORALSOIL_GLAZED_CLAY.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_HARDENED_CLAY.get()), has(EBBlocks.CORALSOIL_HARDENED_CLAY.get())).save(exporter);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get(), EBBlocks.CORALSOIL_HARDENED_CLAY.get());
        stonecutter.putRecipe(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get(), EBBlocks.CORALSOIL_HARDENED_CLAY.get());

        //BRICKS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_BRICKS.get(), 4)
                .define('#', Items.BRICK).define('@', EBItems.CORALSOIL_CLAY_BALL.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(EBItems.CORALSOIL_CLAY_BALL.get()), has(EBItems.CORALSOIL_CLAY_BALL.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CORALSOIL_BRICKS.get())));
        
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.CORALSOIL_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SMOOTH_CORALSOIL_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_BRICKS.get()), has(EBBlocks.CORALSOIL_BRICKS.get())).save(exporter);

        stairBuilder(EBBlocks.SMOOTH_CORALSOIL_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()), has(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_CORALSOIL_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()), has(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_CORALSOIL_BRICK_WALL.get(), Ingredient.of(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()), has(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.SMOOTH_CORALSOIL_BRICK_STAIRS.get(), EBBlocks.SMOOTH_CORALSOIL_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SMOOTH_CORALSOIL_BRICK_SLAB.get(), EBBlocks.SMOOTH_CORALSOIL_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SMOOTH_CORALSOIL_BRICK_WALL.get(), EBBlocks.SMOOTH_CORALSOIL_BRICKS.get());
        
        //NORMAL
        stairBuilder(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_SLAB.get(), Ingredient.of(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_WALL.get(), Ingredient.of(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_STAIRS.get(), EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_SLAB.get(), EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_WALL.get(), EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get());

        //=======================LAVENDER=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBItems.LAVENDER_CLAY_BALL.get(), 4)
                .define('#', Items.CLAY_BALL).define('@', EBBlocks.LAVENDER.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.CLAY_BALL), has(EBBlocks.LAVENDER.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBItems.LAVENDER_CLAY_BALL.get())));

        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_CLAY.get(), EBItems.LAVENDER_CLAY_BALL.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LAVENDER_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.LAVENDER_HARDENED_CLAY.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LAVENDER_CLAY.get()), has(EBBlocks.LAVENDER_CLAY.get())).save(exporter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LAVENDER_HARDENED_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.LAVENDER_GLAZED_CLAY.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LAVENDER_HARDENED_CLAY.get()), has(EBBlocks.LAVENDER_HARDENED_CLAY.get())).save(exporter);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get(), EBBlocks.LAVENDER_HARDENED_CLAY.get());
        stonecutter.putRecipe(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get(), EBBlocks.LAVENDER_HARDENED_CLAY.get());

        //BRICKS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_BRICKS.get(), 4)
                .define('#', Items.BRICK).define('@', EBItems.LAVENDER_CLAY_BALL.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(EBItems.LAVENDER_CLAY_BALL.get()), has(EBItems.LAVENDER_CLAY_BALL.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.LAVENDER_BRICKS.get())));

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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LAVENDER_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SMOOTH_LAVENDER_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.LAVENDER_BRICKS.get()), has(EBBlocks.LAVENDER_BRICKS.get())).save(exporter);

        stairBuilder(EBBlocks.SMOOTH_LAVENDER_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()), has(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LAVENDER_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()), has(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_LAVENDER_BRICK_WALL.get(), Ingredient.of(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()), has(EBBlocks.SMOOTH_LAVENDER_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.SMOOTH_LAVENDER_BRICK_STAIRS.get(), EBBlocks.SMOOTH_LAVENDER_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SMOOTH_LAVENDER_BRICK_SLAB.get(), EBBlocks.SMOOTH_LAVENDER_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SMOOTH_LAVENDER_BRICK_WALL.get(), EBBlocks.SMOOTH_LAVENDER_BRICKS.get());

        //NORMAL
        stairBuilder(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_SLAB.get(), Ingredient.of(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_WALL.get(), Ingredient.of(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_STAIRS.get(), EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_SLAB.get(), EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_WALL.get(), EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get());

        nineBlockStorageRecipesRecipesWithCustomUnpacking(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER.get(), RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAVENDER_BLOCK.get(), "lavender", "lavender");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.MOSSY_LAVENDER_HARDENED_CLAY_BRICKS.get(), 1)
                .requires(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get()).requires(EBBlocks.LAVENDER.get())
                .unlockedBy(getHasName(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get().asItem()), has(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.MOSSY_LAVENDER_HARDENED_CLAY_BRICKS.get()) + "_from_lavender"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.TARGET)
                .define('H', EBBlocks.LAVENDER_BLOCK.get().asItem()).define('R', Items.REDSTONE)
                .pattern(" R ")
                .pattern("RHR")
                .pattern(" R ")
                .unlockedBy(getHasName(Items.REDSTONE), has(EBBlocks.LAVENDER_BLOCK.get().asItem()))
                .group("target")
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.TARGET) + "_from_lavender_block"));

        //=======================SAGE=======================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBItems.SAGE_CLAY_BALL.get(), 4)
                .define('#', Items.CLAY_BALL).define('@', EBBlocks.SAGE.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(Items.CLAY_BALL), has(EBBlocks.SAGE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBItems.SAGE_CLAY_BALL.get())));

        twoByTwoPacker(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_CLAY.get(), EBItems.SAGE_CLAY_BALL.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.SAGE_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SAGE_HARDENED_CLAY.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.SAGE_CLAY.get()), has(EBBlocks.SAGE_CLAY.get())).save(exporter);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.SAGE_HARDENED_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SAGE_GLAZED_CLAY.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.SAGE_HARDENED_CLAY.get()), has(EBBlocks.SAGE_HARDENED_CLAY.get())).save(exporter);

        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get(), EBBlocks.SAGE_HARDENED_CLAY.get());
        stonecutter.putRecipe(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get(), EBBlocks.SAGE_HARDENED_CLAY.get());

        //BRICKS
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_BRICKS.get(), 4)
                .define('#', Items.BRICK).define('@', EBItems.SAGE_CLAY_BALL.get())
                .pattern("@#")
                .pattern("#@")
                .unlockedBy(getHasName(EBItems.SAGE_CLAY_BALL.get()), has(EBItems.SAGE_CLAY_BALL.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.SAGE_BRICKS.get())));

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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.SAGE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SMOOTH_SAGE_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(EBBlocks.SAGE_BRICKS.get()), has(EBBlocks.SAGE_BRICKS.get())).save(exporter);

        stairBuilder(EBBlocks.SMOOTH_SAGE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_SAGE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_SAGE_BRICKS.get()), has(EBBlocks.SMOOTH_SAGE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SAGE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_SAGE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_SAGE_BRICKS.get()), has(EBBlocks.SMOOTH_SAGE_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_SAGE_BRICK_WALL.get(), Ingredient.of(EBBlocks.SMOOTH_SAGE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_SAGE_BRICKS.get()), has(EBBlocks.SMOOTH_SAGE_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.SMOOTH_SAGE_BRICK_STAIRS.get(), EBBlocks.SMOOTH_SAGE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SMOOTH_SAGE_BRICK_SLAB.get(), EBBlocks.SMOOTH_SAGE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SMOOTH_SAGE_BRICK_WALL.get(), EBBlocks.SMOOTH_SAGE_BRICKS.get());

        //NORMAL
        stairBuilder(EBBlocks.SAGE_HARDENED_CLAY_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_HARDENED_CLAY_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_HARDENED_CLAY_BRICK_WALL.get(), Ingredient.of(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()), has(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.SAGE_HARDENED_CLAY_BRICK_STAIRS.get(), EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SAGE_HARDENED_CLAY_BRICK_SLAB.get(), EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SAGE_HARDENED_CLAY_BRICK_WALL.get(), EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get());

        nineBlockStorageRecipesRecipesWithCustomUnpacking(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE.get(), RecipeCategory.BUILDING_BLOCKS, EBBlocks.SAGE_BLOCK.get(), "sage", "sage");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBBlocks.MOSSY_SAGE_HARDENED_CLAY_BRICKS.get(), 1)
                .requires(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get()).requires(EBBlocks.SAGE.get())
                .unlockedBy(getHasName(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get().asItem()), has(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get().asItem()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.MOSSY_SAGE_HARDENED_CLAY_BRICKS.get()) + "_from_sage"));

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, Blocks.TARGET)
                .define('H', EBBlocks.SAGE_BLOCK.get().asItem()).define('R', Items.REDSTONE)
                .pattern(" R ")
                .pattern("RHR")
                .pattern(" R ")
                .unlockedBy(getHasName(Items.REDSTONE), has(EBBlocks.SAGE_BLOCK.get().asItem()))
                .group("target")
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.TARGET) + "_from_sage_block"));

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
                //.sign(EBBlocks.ANCIENT_SIGN.get(), EBBlocks.ANCIENT_WALL_SIGN.get())
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

        //=======================WINTERGREEN WOOD=======================
        BlockFamily wintergreenFamily = familyBuilder(EBBlocks.WINTERGREEN_PLANKS.get())
                .stairs(EBBlocks.WINTERGREEN_STAIRS.get())
                .slab(EBBlocks.WINTERGREEN_SLAB.get())
                .door(EBBlocks.WINTERGREEN_DOOR.get())
                .trapdoor(EBBlocks.WINTERGREEN_TRAPDOOR.get())
                .fence(EBBlocks.WINTERGREEN_FENCE.get())
                .fenceGate(EBBlocks.WINTERGREEN_FENCE_GATE.get())
                //.sign(EBBlocks.WINTERGREEN_SIGN.get(), EBBlocks.WINTERGREEN_WALL_SIGN.get())
                .button(EBBlocks.WINTERGREEN_BUTTON.get())
                .pressurePlate(EBBlocks.WINTERGREEN_PRESSURE_PLATE.get())
                .recipeGroupPrefix("wooden")
                .recipeUnlockedBy("has_planks")
                .getFamily();
        generateRecipes(exporter, wintergreenFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        planksFromLogs(exporter, EBBlocks.WINTERGREEN_PLANKS.get(), EBTags.ItemT.WINTERGREEN_LOGS, 4);
        woodenBoat(exporter, EBItems.WINTERGREEN_BOAT.get(), EBBlocks.WINTERGREEN_PLANKS.get());
        chestBoat(exporter, EBItems.WINTERGREEN_CHEST_BOAT.get(), EBItems.WINTERGREEN_BOAT.get());
        hangingSign(exporter, EBItems.WINTERGREEN_HANGING_SIGN.get(), EBBlocks.STRIPPED_WINTERGREEN_LOG.get());

        //==========================TOOLS==========================
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.GAUNTLET.get(), 1)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.COPPER_INGOT)
                .define('!', Items.AMETHYST_BLOCK).define('%', Items.DIAMOND)
                .pattern("!# ")
                .pattern("#%@")
                .pattern(" @@")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.MALLET.get(), 1)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.COPPER_INGOT).define('!', Items.STICK)
                .pattern("###")
                .pattern("#@#")
                .pattern(" ! ")
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

        //=======================SITRITE=======================
        BlockFamily sitriteFamily = familyBuilder(EBBlocks.SITRITE.get())
                .stairs(EBBlocks.SITRITE_STAIRS.get())
                .slab(EBBlocks.SITRITE_SLAB.get())
                .wall(EBBlocks.SITRITE_WALL.get())
                .polished(EBBlocks.POLISHED_SITRITE.get())
                .recipeUnlockedBy("has_sitrite")
                .getFamily();
        generateRecipes(exporter, sitriteFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.POLISHED_SITRITE.get(), EBBlocks.SITRITE.get());
        stonecutter.putRecipe(EBBlocks.SITRITE_STAIRS.get(), EBBlocks.SITRITE.get());
        stonecutter.putRecipe(EBBlocks.SITRITE_SLAB.get(), EBBlocks.SITRITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.SITRITE_WALL.get(), EBBlocks.SITRITE.get());

        //=======================POLISHED SITRITE=======================
        BlockFamily polishedSitriteFamily = familyBuilder(EBBlocks.POLISHED_SITRITE.get())
                .stairs(EBBlocks.POLISHED_SITRITE_STAIRS.get())
                .slab(EBBlocks.POLISHED_SITRITE_SLAB.get())
                .polished(EBBlocks.SITRITE_BRICKS.get())
                .recipeUnlockedBy("has_polished_sitrite")
                .getFamily();
        generateRecipes(exporter, polishedSitriteFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.SITRITE_BRICKS.get(), EBBlocks.POLISHED_SITRITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_SITRITE_STAIRS.get(), EBBlocks.POLISHED_SITRITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_SITRITE_SLAB.get(), EBBlocks.POLISHED_SITRITE.get(), 2);

        //=======================SITRITE BRICKS=======================
        BlockFamily sitriteBricksFamily = familyBuilder(EBBlocks.SITRITE_BRICKS.get())
                .stairs(EBBlocks.SITRITE_BRICK_STAIRS.get())
                .slab(EBBlocks.SITRITE_BRICK_SLAB.get())
                .wall(EBBlocks.SITRITE_BRICK_WALL.get())
                .polished(EBBlocks.SITRITE_TILES.get())
                .recipeUnlockedBy("has_sitrite_bricks")
                .getFamily();
        generateRecipes(exporter, sitriteBricksFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.SITRITE_TILES.get(), EBBlocks.SITRITE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SITRITE_BRICK_STAIRS.get(), EBBlocks.SITRITE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SITRITE_BRICK_SLAB.get(), EBBlocks.SITRITE_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SITRITE_BRICK_WALL.get(), EBBlocks.SITRITE_BRICKS.get());

        //=======================SITRITE TILES=======================
        BlockFamily sitriteTilesFamily = familyBuilder(EBBlocks.SITRITE_TILES.get())
                .stairs(EBBlocks.SITRITE_TILE_STAIRS.get())
                .slab(EBBlocks.SITRITE_TILE_SLAB.get())
                .recipeUnlockedBy("has_sitrite_tiles")
                .getFamily();
        generateRecipes(exporter, sitriteTilesFamily, FeatureFlagSet.of(FeatureFlags.VANILLA));

        stonecutter.putRecipe(EBBlocks.SITRITE_TILE_STAIRS.get(), EBBlocks.SITRITE_TILES.get());
        stonecutter.putRecipe(EBBlocks.SITRITE_TILE_SLAB.get(), EBBlocks.SITRITE_TILES.get(), 2);

        //=======================SITRITE MISC=======================
        stonecutter.putRecipe(EBBlocks.SITRITE_PILLAR.get(), EBBlocks.POLISHED_SITRITE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SITRITE_PILLAR.get(), 2)
                .define('#', EBBlocks.POLISHED_SITRITE.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_SITRITE.get()), has(EBBlocks.POLISHED_SITRITE.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.SITRITE_PILLAR.get())));

        stonecutter.putRecipe(EBBlocks.CHISELED_SITRITE.get(), EBBlocks.POLISHED_SITRITE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHISELED_SITRITE.get(), 1)
                .define('#', EBBlocks.POLISHED_SITRITE_SLAB.get())
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(EBBlocks.POLISHED_SITRITE_SLAB.get()), has(EBBlocks.POLISHED_SITRITE_SLAB.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.CHISELED_SITRITE.get())));

        //==========================MISC==========================
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ZEUS_EPIC_BLOCK.get(), 1)
                .define('#', Items.PURPLE_DYE)
                .pattern("## ")
                .pattern(" ##")
                .unlockedBy(getHasName(Items.PURPLE_DYE), has(Items.PURPLE_DYE))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.ZEUS_EPIC_BLOCK.get())));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.CORALSOIL_CLAY_BALL.get(), 4)
                .requires(EBBlocks.CORALSOIL_CLAY.get())
                .unlockedBy(getHasName(EBBlocks.CORALSOIL_CLAY.get()), has(EBBlocks.CORALSOIL_CLAY.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBItems.CORALSOIL_CLAY_BALL.get()) + "from_unpacking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.SAGE_CLAY_BALL.get(), 4)
                .requires(EBBlocks.SAGE_CLAY.get())
                .unlockedBy(getHasName(EBBlocks.SAGE_CLAY.get()), has(EBBlocks.SAGE_CLAY.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBItems.SAGE_CLAY_BALL.get()) + "from_unpacking"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, EBItems.LAVENDER_CLAY_BALL.get(), 4)
                .requires(EBBlocks.LAVENDER_CLAY.get())
                .unlockedBy(getHasName(EBBlocks.LAVENDER_CLAY.get()), has(EBBlocks.LAVENDER_CLAY.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBItems.LAVENDER_CLAY_BALL.get()) + "from_unpacking"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.BRICKS), RecipeCategory.BUILDING_BLOCKS,
                        EBBlocks.SMOOTH_BRICKS.get(), 0.1F, 200)
                .unlockedBy(getHasName(Blocks.BRICKS), has(Blocks.BRICKS)).save(exporter);

        stairBuilder(EBBlocks.SMOOTH_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.SMOOTH_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS.get()), has(EBBlocks.SMOOTH_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_SLAB.get(), Ingredient.of(EBBlocks.SMOOTH_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS.get()), has(EBBlocks.SMOOTH_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.SMOOTH_BRICK_WALL.get(), Ingredient.of(EBBlocks.SMOOTH_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.SMOOTH_BRICKS.get()), has(EBBlocks.SMOOTH_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.SMOOTH_BRICK_STAIRS.get(), EBBlocks.SMOOTH_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.SMOOTH_BRICK_SLAB.get(), EBBlocks.SMOOTH_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.SMOOTH_BRICK_WALL.get(), EBBlocks.SMOOTH_BRICKS.get());
        
        //AMETHYST
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICKS.get(), Blocks.AMETHYST_BLOCK);

        stairBuilder(EBBlocks.AMETHYST_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICK_SLAB.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICK_WALL.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.AMETHYST_BRICKS.get(), Blocks.AMETHYST_BLOCK, 4);

        stonecutter.putRecipe(EBBlocks.AMETHYST_BRICK_STAIRS.get(), EBBlocks.AMETHYST_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.AMETHYST_BRICK_SLAB.get(), EBBlocks.AMETHYST_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.AMETHYST_BRICK_WALL.get(), EBBlocks.AMETHYST_BRICKS.get());

        createCrystalLantern(EBBlocks.AMETHYST_LAMP.get().asItem(), Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.AMETHYST_LAMP.get())));

        createCrystalGlass(EBBlocks.AMETHYST_FRAMED_GLASS.get().asItem(), Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.AMETHYST_FRAMED_GLASS.get())));

        createPane(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get().asItem(), EBBlocks.AMETHYST_FRAMED_GLASS.get().asItem())
                .unlockedBy(getHasName(EBBlocks.AMETHYST_FRAMED_GLASS.get()), has(EBBlocks.AMETHYST_FRAMED_GLASS.get()))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get())));

        //LAPIS
        resourceBlock(EBBlocks.LAPIS_BRICKS.get().asItem(), Items.LAPIS_LAZULI.asItem())
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, "lapis_bricks"));

        stairBuilder(EBBlocks.LAPIS_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.LAPIS_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAPIS_BRICKS.get()), has(EBBlocks.LAPIS_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_SLAB.get(), Ingredient.of(EBBlocks.LAPIS_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAPIS_BRICKS.get()), has(EBBlocks.LAPIS_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.LAPIS_BRICK_WALL.get(), Ingredient.of(EBBlocks.LAPIS_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.LAPIS_BRICKS.get()), has(EBBlocks.LAPIS_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.LAPIS_BRICKS.get(), Items.LAPIS_LAZULI, 24);

        stonecutter.putRecipe(EBBlocks.LAPIS_BRICK_STAIRS.get(), EBBlocks.LAPIS_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.LAPIS_BRICK_SLAB.get(), EBBlocks.LAPIS_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.LAPIS_BRICK_WALL.get(), EBBlocks.LAPIS_BRICKS.get());

        createCrystalLantern(EBBlocks.LAPIS_LAMP.get().asItem(), Items.LAPIS_LAZULI)
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.LAPIS_LAMP.get())));

        createCrystalGlass(EBBlocks.LAPIS_FRAMED_GLASS.get().asItem(), Items.LAPIS_LAZULI)
                .unlockedBy(getHasName(Items.LAPIS_LAZULI), has(Items.LAPIS_LAZULI))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.LAPIS_FRAMED_GLASS.get())));

        createPane(EBBlocks.LAPIS_FRAMED_GLASS_PANE.get().asItem(), EBBlocks.LAPIS_FRAMED_GLASS.get().asItem())
                .unlockedBy(getHasName(EBBlocks.LAPIS_FRAMED_GLASS.get()), has(EBBlocks.LAPIS_FRAMED_GLASS.get()))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.LAPIS_FRAMED_GLASS_PANE.get())));

        //EMERALD
        resourceBlock(EBBlocks.EMERALD_BRICKS.get().asItem(), Items.EMERALD.asItem())
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, "emerald_bricks"));

        stairBuilder(EBBlocks.EMERALD_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.EMERALD_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS.get()), has(EBBlocks.EMERALD_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_SLAB.get(), Ingredient.of(EBBlocks.EMERALD_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS.get()), has(EBBlocks.EMERALD_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.EMERALD_BRICK_WALL.get(), Ingredient.of(EBBlocks.EMERALD_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.EMERALD_BRICKS.get()), has(EBBlocks.EMERALD_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.EMERALD_BRICKS.get(), Items.EMERALD, 24);

        stonecutter.putRecipe(EBBlocks.EMERALD_BRICK_STAIRS.get(), EBBlocks.EMERALD_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.EMERALD_BRICK_SLAB.get(), EBBlocks.EMERALD_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.EMERALD_BRICK_WALL.get(), EBBlocks.EMERALD_BRICKS.get());

        createCrystalLantern(EBBlocks.EMERALD_LAMP.get().asItem(), Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.EMERALD_LAMP.get())));

        createCrystalGlass(EBBlocks.EMERALD_FRAMED_GLASS.get().asItem(), Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.EMERALD_FRAMED_GLASS.get())));

        createPane(EBBlocks.EMERALD_FRAMED_GLASS_PANE.get().asItem(), EBBlocks.EMERALD_FRAMED_GLASS.get().asItem())
                .unlockedBy(getHasName(EBBlocks.EMERALD_FRAMED_GLASS.get()), has(EBBlocks.EMERALD_FRAMED_GLASS.get()))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.EMERALD_FRAMED_GLASS_PANE.get())));

        //DIAMOND
        resourceBlock(EBBlocks.DIAMOND_BRICKS.get().asItem(), Items.DIAMOND.asItem())
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, "diamond_bricks"));

        stairBuilder(EBBlocks.DIAMOND_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.DIAMOND_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIAMOND_BRICKS.get()), has(EBBlocks.DIAMOND_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_SLAB.get(), Ingredient.of(EBBlocks.DIAMOND_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIAMOND_BRICKS.get()), has(EBBlocks.DIAMOND_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIAMOND_BRICK_WALL.get(), Ingredient.of(EBBlocks.DIAMOND_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIAMOND_BRICKS.get()), has(EBBlocks.DIAMOND_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.DIAMOND_BRICKS.get(), Items.DIAMOND, 24);

        stonecutter.putRecipe(EBBlocks.DIAMOND_BRICK_STAIRS.get(), EBBlocks.DIAMOND_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.DIAMOND_BRICK_SLAB.get(), EBBlocks.DIAMOND_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.DIAMOND_BRICK_WALL.get(), EBBlocks.DIAMOND_BRICKS.get());

        createCrystalLantern(EBBlocks.DIAMOND_LAMP.get().asItem(), Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.DIAMOND_LAMP.get())));

        createCrystalGlass(EBBlocks.DIAMOND_FRAMED_GLASS.get().asItem(), Items.DIAMOND)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.DIAMOND_FRAMED_GLASS.get())));

        createPane(EBBlocks.DIAMOND_FRAMED_GLASS_PANE.get().asItem(), EBBlocks.DIAMOND_FRAMED_GLASS.get().asItem())
                .unlockedBy(getHasName(EBBlocks.DIAMOND_FRAMED_GLASS.get()), has(EBBlocks.DIAMOND_FRAMED_GLASS.get()))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.DIAMOND_FRAMED_GLASS_PANE.get())));

        //CLAY TODO REPLACE WITH FLUID INTERACTION
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.CORALSOIL_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                Blocks.CLAY, 0.1F, 200).unlockedBy(getHasName(EBBlocks.CORALSOIL_CLAY.get()), has(EBBlocks.CORALSOIL_CLAY.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.CLAY) + "_from_coralsoil_clay"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.LAVENDER_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        Blocks.CLAY, 0.1F, 200).unlockedBy(getHasName(EBBlocks.LAVENDER_CLAY.get()), has(EBBlocks.LAVENDER_CLAY.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.CLAY) + "_from_lavender_clay"));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.SAGE_CLAY.get()), RecipeCategory.BUILDING_BLOCKS,
                        Blocks.CLAY, 0.1F, 200).unlockedBy(getHasName(EBBlocks.SAGE_CLAY.get()), has(EBBlocks.SAGE_CLAY.get()))
                .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(Blocks.CLAY) + "_from_sage_clay"));

        //=======================DYED=======================
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

            stonecutter.putRecipe(EBBlocks.getDyedCorrugatedIronStairs(colors.getId()).get(), EBBlocks.getDyedCorrugatedIron(colors.getId()).get());
            stonecutter.putRecipe(EBBlocks.getDyedCorrugatedIronSlab(colors.getId()).get(), EBBlocks.getDyedCorrugatedIron(colors.getId()).get(), 2);

            //FROSTED GLASS
            dyeEightForEight(EBBlocks.getDyedFrostedGlass(colors.getId()).get().asItem(), EBBlocks.FROSTED_GLASS.get().asItem(), DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.FROSTED_GLASS.get()), has(EBBlocks.FROSTED_GLASS.get()))
                    .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.getDyedFrostedGlass(colors.getId()).get())));

            //FROSTED LANTERN
            frostedLantern(EBBlocks.getDyedFrostedLantern(colors.getId()).get().asItem(), EBBlocks.FROSTED_LANTERN.get().asItem(),
                    DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.FROSTED_LANTERN.get().asItem()), has(EBBlocks.FROSTED_LANTERN.get().asItem()))
                    .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.getDyedFrostedLantern(colors.getId()).get())));

            //ALMENTRA
            dyeEightForEight(EBBlocks.getDyedAlmentra(colors.getId()).get().asItem(), EBBlocks.ALMENTRA.get().asItem(),
                    DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.ALMENTRA.get().asItem()), has(EBBlocks.ALMENTRA.get().asItem()))
                    .save(exporter, RunicLib.customid(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.getDyedAlmentra(colors.getId()).get())));

            stairBuilder(EBBlocks.getDyedAlmentraStairs(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedAlmentra(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId()).get()), has(EBBlocks.getDyedAlmentra(colors.getId()).get()))
                    .save(exporter);

            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraSlab(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedAlmentra(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentra(colors.getId()).get()), has(EBBlocks.getDyedAlmentra(colors.getId()).get()))
                    .save(exporter);

            stonecutter.putRecipe(EBBlocks.getDyedAlmentraStairs(colors.getId()).get(), EBBlocks.getDyedAlmentra(colors.getId()).get());
            stonecutter.putRecipe(EBBlocks.getDyedAlmentraSlab(colors.getId()).get(), EBBlocks.getDyedAlmentra(colors.getId()).get(), 2);
            
            //ALMENTRA BRICKS
            polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBricks(colors.getId()).get(), EBBlocks.getDyedAlmentra(colors.getId()).get());

            stairBuilder(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()), has(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()))
                    .save(exporter);

            slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBrickSlab(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()), has(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()))
                    .save(exporter);

            wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.getDyedAlmentraBrickWall(colors.getId()).get(), Ingredient.of(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()))
                    .unlockedBy(getHasName(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()), has(EBBlocks.getDyedAlmentraBricks(colors.getId()).get()))
                    .save(exporter);

            stonecutter.putRecipe(EBBlocks.getDyedAlmentraBricks(colors.getId()).get(), EBBlocks.getDyedAlmentra(colors.getId()).get());

            stonecutter.putRecipe(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()).get(), EBBlocks.getDyedAlmentraBricks(colors.getId()).get());
            stonecutter.putRecipe(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()).get(), EBBlocks.getDyedAlmentraBricks(colors.getId()).get(), 2);
            stonecutter.putRecipe(EBBlocks.getDyedAlmentraBrickWall(colors.getId()).get(), EBBlocks.getDyedAlmentraBricks(colors.getId()).get());
        }

        //=======================UNDYED=======================
        stairBuilder(EBBlocks.ALMENTRA_STAIRS.get(), Ingredient.of(EBBlocks.ALMENTRA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS.get()), has(EBBlocks.ALMENTRA_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_SLAB.get(), Ingredient.of(EBBlocks.ALMENTRA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS.get()), has(EBBlocks.ALMENTRA_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.ALMENTRA_STAIRS.get(), EBBlocks.ALMENTRA_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.ALMENTRA_SLAB.get(), EBBlocks.ALMENTRA_BRICKS.get(), 2);
        
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICKS.get(), EBBlocks.ALMENTRA.get());

        stairBuilder(EBBlocks.ALMENTRA_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ALMENTRA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS.get()), has(EBBlocks.ALMENTRA_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ALMENTRA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS.get()), has(EBBlocks.ALMENTRA_BRICKS.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ALMENTRA_BRICK_WALL.get(), Ingredient.of(EBBlocks.ALMENTRA_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ALMENTRA_BRICKS.get()), has(EBBlocks.ALMENTRA_BRICKS.get()))
                .save(exporter);

        stonecutter.putRecipe(EBBlocks.ALMENTRA_BRICKS.get(), EBBlocks.ALMENTRA.get());

        stonecutter.putRecipe(EBBlocks.ALMENTRA_BRICK_STAIRS.get(), EBBlocks.ALMENTRA_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.ALMENTRA_BRICK_SLAB.get(), EBBlocks.ALMENTRA_BRICKS.get(), 2);
        stonecutter.putRecipe(EBBlocks.ALMENTRA_BRICK_WALL.get(), EBBlocks.ALMENTRA_BRICKS.get());
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS,
                EBBlocks.FROSTED_GLASS.get(), 0.1F, 200).unlockedBy(getHasName(Blocks.GLASS), has(Blocks.GLASS)).save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, EBBlocks.FROSTED_LANTERN.get(), 8)
                .define('#', EBBlocks.FROSTED_GLASS.get()).define('@', Items.TORCH).define('!', Items.IRON_NUGGET)
                .pattern("!#!")
                .pattern("#@#")
                .pattern("!#!")
                .unlockedBy(getHasName(EBBlocks.FROSTED_GLASS.get()), has(EBBlocks.FROSTED_GLASS.get()))
                .save(exporter, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.FROSTED_LANTERN.get())));

        //=======================MALACHITE=======================
        stairBuilder(EBBlocks.MALACHITE_STAIRS.get(), Ingredient.of(EBBlocks.MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.MALACHITE.get()), has(EBBlocks.MALACHITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MALACHITE_SLAB.get(), Ingredient.of(EBBlocks.MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.MALACHITE.get()), has(EBBlocks.MALACHITE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MALACHITE_WALL.get(), Ingredient.of(EBBlocks.MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.MALACHITE.get()), has(EBBlocks.MALACHITE.get()))
                .save(exporter);
        
        stonecutter.putRecipe(EBBlocks.MALACHITE_STAIRS.get(), EBBlocks.MALACHITE.get());
        stonecutter.putRecipe(EBBlocks.MALACHITE_SLAB.get(), EBBlocks.MALACHITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.MALACHITE_WALL.get(), EBBlocks.MALACHITE.get());

        //=======================CUT MALACHITE=======================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_MALACHITE.get(), EBBlocks.MALACHITE.get());

        stairBuilder(EBBlocks.CUT_MALACHITE_STAIRS.get(), Ingredient.of(EBBlocks.CUT_MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.CUT_MALACHITE.get()), has(EBBlocks.CUT_MALACHITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_MALACHITE_SLAB.get(), Ingredient.of(EBBlocks.CUT_MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.CUT_MALACHITE.get()), has(EBBlocks.CUT_MALACHITE.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CUT_MALACHITE_WALL.get(), Ingredient.of(EBBlocks.CUT_MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.CUT_MALACHITE.get()), has(EBBlocks.CUT_MALACHITE.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.CUT_MALACHITE.get(), EBBlocks.MALACHITE.get());
        stonecutter.putRecipe(EBBlocks.CUT_MALACHITE_STAIRS.get(), EBBlocks.CUT_MALACHITE.get());
        stonecutter.putRecipe(EBBlocks.CUT_MALACHITE_SLAB.get(), EBBlocks.CUT_MALACHITE.get(), 2);
        stonecutter.putRecipe(EBBlocks.CUT_MALACHITE_WALL.get(), EBBlocks.CUT_MALACHITE.get());

        //=======================POLISHED MALACHITE=======================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_MALACHITE.get(), EBBlocks.CUT_MALACHITE.get());

        stairBuilder(EBBlocks.POLISHED_MALACHITE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_MALACHITE.get()), has(EBBlocks.POLISHED_MALACHITE.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_MALACHITE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_MALACHITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_MALACHITE.get()), has(EBBlocks.POLISHED_MALACHITE.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.POLISHED_MALACHITE.get(), EBBlocks.CUT_MALACHITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_MALACHITE_STAIRS.get(), EBBlocks.POLISHED_MALACHITE.get());
        stonecutter.putRecipe(EBBlocks.POLISHED_MALACHITE_SLAB.get(), EBBlocks.POLISHED_MALACHITE.get(), 2);

        //=======================MALACHITE BRICKS=======================
        polished(exporter, RecipeCategory.BUILDING_BLOCKS, EBBlocks.MALACHITE_BRICKS.get(), EBBlocks.POLISHED_MALACHITE.get());

        stairBuilder(EBBlocks.MALACHITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.MALACHITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MALACHITE_BRICKS.get()), has(EBBlocks.MALACHITE_BRICKS.get()))
                .save(exporter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.MALACHITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.MALACHITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.MALACHITE_BRICKS.get()), has(EBBlocks.MALACHITE_BRICKS.get()))
                .save(exporter);

        stonecutter.putShadowRecipe(EBBlocks.MALACHITE_BRICKS.get(), EBBlocks.POLISHED_MALACHITE.get());
        stonecutter.putRecipe(EBBlocks.MALACHITE_BRICK_STAIRS.get(), EBBlocks.MALACHITE_BRICKS.get());
        stonecutter.putRecipe(EBBlocks.MALACHITE_BRICK_SLAB.get(), EBBlocks.MALACHITE_BRICKS.get(), 2);

        //====================================================
        stonecutter.generateRecipes(exporter);
    }

    public static ShapedRecipeBuilder resourceBlock(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 24)
                .define('#', ingredient).define('@', Items.COPPER_INGOT)
                .pattern("@@@")
                .pattern("@#@")
                .pattern("@@@")
                .unlockedBy(getHasName(ingredient), has(ingredient));
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

    public static ShapelessRecipeBuilder frostedLantern(Item output, Item lantern, DyeColor color) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, output, 1)
                .requires(lantern).requires(DyeItem.byColor(color))
                .unlockedBy(getHasName(lantern), has(lantern));
    }

    public static ShapedRecipeBuilder dyeEightForEight(Item output, Item ingredient, DyeColor color) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define('#', ingredient).define('@', DyeItem.byColor(color))
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }

    public static ShapedRecipeBuilder createCrystalLantern(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define('#', ingredient).define('@', Items.IRON_NUGGET)
                .pattern("@@@")
                .pattern("@#@")
                .pattern("@@@");
    }

    public static ShapedRecipeBuilder createCrystalGlass(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 12)
                .define('#', ingredient).define('@', Items.GLASS)
                .pattern(" @ ")
                .pattern("@#@")
                .pattern(" @ ");
    }

    public static ShapedRecipeBuilder createPane(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 16)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###");
    }
}