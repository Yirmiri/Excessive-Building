package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

import java.util.function.Consumer;

public class EBRecipeGen extends FabricRecipeProvider {
    public EBRecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        StonecutterRecipeTreeGenerator stonecutterRecipeTreeGenerator = new StonecutterRecipeTreeGenerator();

        //==========================BASE==========================
        createWendysFourForFourMeal(EBBlocks.ELYERIUM.get().asItem(),
                EBBlocks.HECTALITE.get().asItem(), EBBlocks.ARIDITE.get().asItem())
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(consumer, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.ELYERIUM.get())));

        stairBuilder(EBBlocks.ELYERIUM_STAIRS.get(), Ingredient.of(EBBlocks.ELYERIUM.get()))
                .unlockedBy(getHasName(EBBlocks.ELYERIUM.get()), has(EBBlocks.ELYERIUM.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ELYERIUM_SLAB.get(), Ingredient.of(EBBlocks.ELYERIUM.get()))
                .unlockedBy(getHasName(EBBlocks.ELYERIUM.get()), has(EBBlocks.ELYERIUM.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ELYERIUM_WALL.get(), Ingredient.of(EBBlocks.ELYERIUM.get()))
                .unlockedBy(getHasName(EBBlocks.ELYERIUM.get()), has(EBBlocks.ELYERIUM.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_STAIRS.get(), EBBlocks.ELYERIUM.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_SLAB.get(), EBBlocks.ELYERIUM.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_WALL.get(), EBBlocks.ELYERIUM.get());

        //==========================POLISHED==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ELYERIUM.get(), EBBlocks.ELYERIUM.get());

        stairBuilder(EBBlocks.POLISHED_ELYERIUM_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_ELYERIUM.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ELYERIUM.get()), has(EBBlocks.POLISHED_ELYERIUM.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ELYERIUM_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_ELYERIUM.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ELYERIUM.get()), has(EBBlocks.POLISHED_ELYERIUM.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ELYERIUM_WALL.get(), Ingredient.of(EBBlocks.POLISHED_ELYERIUM.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ELYERIUM.get()), has(EBBlocks.POLISHED_ELYERIUM.get()))
                .save(consumer);

        createChiseled(EBBlocks.CHISELED_ELYERIUM.get().asItem(), EBBlocks.ELYERIUM.get().asItem());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ELYERIUM.get(), EBBlocks.ELYERIUM.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ELYERIUM_STAIRS.get(), EBBlocks.ELYERIUM.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ELYERIUM_SLAB.get(), EBBlocks.ELYERIUM.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ELYERIUM_WALL.get(), EBBlocks.ELYERIUM.get());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHISELED_ELYERIUM.get(), EBBlocks.POLISHED_ELYERIUM.get());

        //==========================BRICKS==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ELYERIUM_BRICKS.get(), EBBlocks.POLISHED_ELYERIUM.get());

        stairBuilder(EBBlocks.ELYERIUM_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ELYERIUM_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ELYERIUM_BRICKS.get()), has(EBBlocks.ELYERIUM_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ELYERIUM_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ELYERIUM_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ELYERIUM_BRICKS.get()), has(EBBlocks.ELYERIUM_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ELYERIUM_BRICK_WALL.get(), Ingredient.of(EBBlocks.ELYERIUM_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ELYERIUM_BRICKS.get()), has(EBBlocks.ELYERIUM_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_BRICKS.get(), EBBlocks.POLISHED_ELYERIUM.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_BRICK_STAIRS.get(), EBBlocks.POLISHED_ELYERIUM.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_BRICK_SLAB.get(), EBBlocks.POLISHED_ELYERIUM.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_BRICK_WALL.get(), EBBlocks.POLISHED_ELYERIUM.get());

        //==========================BASE==========================
        stairBuilder(EBBlocks.CHLOROSLATE_STAIRS.get(), Ingredient.of(EBBlocks.CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE.get()), has(EBBlocks.CHLOROSLATE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_SLAB.get(), Ingredient.of(EBBlocks.CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE.get()), has(EBBlocks.CHLOROSLATE.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_WALL.get(), Ingredient.of(EBBlocks.CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE.get()), has(EBBlocks.CHLOROSLATE.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_STAIRS.get(), EBBlocks.CHLOROSLATE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_SLAB.get(), EBBlocks.CHLOROSLATE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_WALL.get(), EBBlocks.CHLOROSLATE.get());

        //==========================POLISHED==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_CHLOROSLATE.get(), EBBlocks.CHLOROSLATE.get());

        stairBuilder(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_CHLOROSLATE.get()), has(EBBlocks.POLISHED_CHLOROSLATE.get()))
                .save(consumer);

        createChiseled(EBBlocks.CHISELED_CHLOROSLATE.get().asItem(), EBBlocks.CHLOROSLATE.get().asItem());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_CHLOROSLATE.get(), EBBlocks.CHLOROSLATE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), EBBlocks.CHLOROSLATE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), EBBlocks.CHLOROSLATE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), EBBlocks.CHLOROSLATE.get());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHISELED_CHLOROSLATE.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        //==========================BRICKS==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_BRICKS.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        stairBuilder(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE_BRICKS.get()), has(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE_BRICKS.get()), has(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.CHLOROSLATE_BRICK_WALL.get(), Ingredient.of(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.CHLOROSLATE_BRICKS.get()), has(EBBlocks.CHLOROSLATE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_BRICKS.get(), EBBlocks.POLISHED_CHLOROSLATE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), EBBlocks.POLISHED_CHLOROSLATE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), EBBlocks.POLISHED_CHLOROSLATE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_BRICK_WALL.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        //==========================BASE==========================
        stairBuilder(EBBlocks.HECTALITE_STAIRS.get(), Ingredient.of(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_SLAB.get(), Ingredient.of(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_WALL.get(), Ingredient.of(EBBlocks.HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE.get()), has(EBBlocks.HECTALITE.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_STAIRS.get(), EBBlocks.HECTALITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_SLAB.get(), EBBlocks.HECTALITE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_WALL.get(), EBBlocks.HECTALITE.get());

        //==========================POLISHED==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_HECTALITE.get(), EBBlocks.HECTALITE.get());

        stairBuilder(EBBlocks.POLISHED_HECTALITE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_HECTALITE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_HECTALITE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_HECTALITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_HECTALITE.get()), has(EBBlocks.POLISHED_HECTALITE.get()))
                .save(consumer);

        createChiseled(EBBlocks.CHISELED_HECTALITE.get().asItem(), EBBlocks.HECTALITE.get().asItem());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_HECTALITE.get(), EBBlocks.HECTALITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_HECTALITE_STAIRS.get(), EBBlocks.HECTALITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_HECTALITE_SLAB.get(), EBBlocks.HECTALITE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_HECTALITE_WALL.get(), EBBlocks.HECTALITE.get());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHISELED_HECTALITE.get(), EBBlocks.POLISHED_HECTALITE.get());

        //==========================BRICKS==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_BRICKS.get(), EBBlocks.POLISHED_HECTALITE.get());

        stairBuilder(EBBlocks.HECTALITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.HECTALITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE_BRICKS.get()), has(EBBlocks.HECTALITE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.HECTALITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE_BRICKS.get()), has(EBBlocks.HECTALITE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.HECTALITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.HECTALITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.HECTALITE_BRICKS.get()), has(EBBlocks.HECTALITE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_BRICKS.get(), EBBlocks.POLISHED_HECTALITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_BRICK_STAIRS.get(), EBBlocks.POLISHED_HECTALITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_BRICK_SLAB.get(), EBBlocks.POLISHED_HECTALITE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_BRICK_WALL.get(), EBBlocks.POLISHED_HECTALITE.get());

        //==========================BASE==========================
        stairBuilder(EBBlocks.ARIDITE_STAIRS.get(), Ingredient.of(EBBlocks.ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_SLAB.get(), Ingredient.of(EBBlocks.ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_WALL.get(), Ingredient.of(EBBlocks.ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE.get()), has(EBBlocks.ARIDITE.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_STAIRS.get(), EBBlocks.ARIDITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_SLAB.get(), EBBlocks.ARIDITE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_WALL.get(), EBBlocks.ARIDITE.get());

        //==========================POLISHED==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ARIDITE.get(), EBBlocks.ARIDITE.get());

        stairBuilder(EBBlocks.POLISHED_ARIDITE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ARIDITE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_ARIDITE_WALL.get(), Ingredient.of(EBBlocks.POLISHED_ARIDITE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_ARIDITE.get()), has(EBBlocks.POLISHED_ARIDITE.get()))
                .save(consumer);

        createChiseled(EBBlocks.CHISELED_ARIDITE.get().asItem(), EBBlocks.ARIDITE.get().asItem());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ARIDITE.get(), EBBlocks.ARIDITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ARIDITE_STAIRS.get(), EBBlocks.ARIDITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ARIDITE_SLAB.get(), EBBlocks.ARIDITE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_ARIDITE_WALL.get(), EBBlocks.ARIDITE.get());

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHISELED_ARIDITE.get(), EBBlocks.POLISHED_ARIDITE.get());

        //==========================BRICKS==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_BRICKS.get(), EBBlocks.POLISHED_ARIDITE.get());

        stairBuilder(EBBlocks.ARIDITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ARIDITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE_BRICKS.get()), has(EBBlocks.ARIDITE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ARIDITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE_BRICKS.get()), has(EBBlocks.ARIDITE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ARIDITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.ARIDITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ARIDITE_BRICKS.get()), has(EBBlocks.ARIDITE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_BRICKS.get(), EBBlocks.POLISHED_ARIDITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_BRICK_STAIRS.get(), EBBlocks.POLISHED_ARIDITE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_BRICK_SLAB.get(), EBBlocks.POLISHED_ARIDITE.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_BRICK_WALL.get(), EBBlocks.POLISHED_ARIDITE.get());

        //==========================MISC==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICKS.get(), Blocks.AMETHYST_BLOCK);

        stairBuilder(EBBlocks.AMETHYST_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICK_SLAB.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.AMETHYST_BRICK_WALL.get(), Ingredient.of(EBBlocks.AMETHYST_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.AMETHYST_BRICKS.get()), has(EBBlocks.AMETHYST_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.AMETHYST_BRICKS.get(), Blocks.AMETHYST_BLOCK);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.AMETHYST_BRICK_STAIRS.get(), EBBlocks.AMETHYST_BRICKS.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.AMETHYST_BRICK_SLAB.get(), EBBlocks.AMETHYST_BRICKS.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.AMETHYST_BRICK_WALL.get(), EBBlocks.AMETHYST_BRICKS.get());

        createCrystalLantern(EBBlocks.AMETHYST_LANTERN.get().asItem(), Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(consumer, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.AMETHYST_LANTERN.get())));

        createCrystalGlass(EBBlocks.AMETHYST_FRAMED_GLASS.get().asItem(), Items.AMETHYST_SHARD)
                .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(consumer, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.AMETHYST_FRAMED_GLASS.get())));

        createPane(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get().asItem(), EBBlocks.AMETHYST_FRAMED_GLASS.get().asItem())
                .unlockedBy(getHasName(EBBlocks.AMETHYST_FRAMED_GLASS.get()), has(EBBlocks.AMETHYST_FRAMED_GLASS.get()))
                .save(consumer, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get())));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.GLASS), RecipeCategory.BUILDING_BLOCKS,
                EBBlocks.FROSTED_GLASS.get(), 0.1F, 200).unlockedBy(getHasName(Blocks.GLASS), has(Blocks.GLASS)).save(consumer);

        for (DyeColor colors : DyeColor.values()) {
            dyeEightForEight(EBBlocks.getDyedFrostedGlass(colors.getId()).get().asItem(), EBBlocks.FROSTED_GLASS.get().asItem(), DyeItem.byColor(colors).getDyeColor())
                    .unlockedBy(getHasName(EBBlocks.getDyedFrostedGlass(colors.getId()).get()), has(EBBlocks.getDyedFrostedGlass(colors.getId()).get()))
                    .save(consumer, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, getSimpleRecipeName(EBBlocks.getDyedFrostedGlass(colors.getId()).get()) + "_from_base"));
        }

        createChiseled(EBBlocks.ARIDITE_PILLAR.get().asItem(), EBBlocks.ARIDITE_SLAB.get().asItem());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ARIDITE_PILLAR.get(), EBBlocks.POLISHED_ARIDITE.get());

        createChiseled(EBBlocks.HECTALITE_PILLAR.get().asItem(), EBBlocks.HECTALITE_SLAB.get().asItem());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.HECTALITE_PILLAR.get(), EBBlocks.POLISHED_HECTALITE.get());

        createChiseled(EBBlocks.CHLOROSLATE_PILLAR.get().asItem(), EBBlocks.CHLOROSLATE_SLAB.get().asItem());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.CHLOROSLATE_PILLAR.get(), EBBlocks.POLISHED_CHLOROSLATE.get());

        createChiseled(EBBlocks.ELYERIUM_PILLAR.get().asItem(), EBBlocks.ELYERIUM_SLAB.get().asItem());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ELYERIUM_PILLAR.get(), EBBlocks.POLISHED_ELYERIUM.get());

        //==========================MISC==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE);

        stairBuilder(EBBlocks.COBBLESTONE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.COBBLESTONE_BRICK_WALL.get(), Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.COBBLESTONE_BRICKS.get(), Blocks.COBBLESTONE);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.COBBLESTONE_BRICK_STAIRS.get(), EBBlocks.COBBLESTONE_BRICKS.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.COBBLESTONE_BRICK_SLAB.get(), EBBlocks.COBBLESTONE_BRICKS.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.COBBLESTONE_BRICK_WALL.get(), EBBlocks.COBBLESTONE_BRICKS.get());

        //==========================MISC==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICKS.get(), Blocks.DIORITE);

        stairBuilder(EBBlocks.DIORITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.DIORITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS.get()), has(EBBlocks.DIORITE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.DIORITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS.get()), has(EBBlocks.DIORITE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.DIORITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.DIORITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.DIORITE_BRICKS.get()), has(EBBlocks.DIORITE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.DIORITE_BRICKS.get(), Blocks.DIORITE);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.DIORITE_BRICK_STAIRS.get(), EBBlocks.DIORITE_BRICKS.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.DIORITE_BRICK_SLAB.get(), EBBlocks.DIORITE_BRICKS.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.DIORITE_BRICK_WALL.get(), EBBlocks.DIORITE_BRICKS.get());

        //==========================MISC==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICKS.get(), Blocks.GRANITE);

        stairBuilder(EBBlocks.GRANITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.GRANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS.get()), has(EBBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.GRANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS.get()), has(EBBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.GRANITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.GRANITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.GRANITE_BRICKS.get()), has(EBBlocks.GRANITE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.GRANITE_BRICKS.get(), Blocks.GRANITE);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.GRANITE_BRICK_STAIRS.get(), EBBlocks.GRANITE_BRICKS.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.GRANITE_BRICK_SLAB.get(), EBBlocks.GRANITE_BRICKS.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.GRANITE_BRICK_WALL.get(), EBBlocks.GRANITE_BRICKS.get());

        //==========================MISC==========================
        polished(consumer, RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICKS.get(), Blocks.ANDESITE);

        stairBuilder(EBBlocks.ANDESITE_BRICK_STAIRS.get(), Ingredient.of(EBBlocks.ANDESITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS.get()), has(EBBlocks.ANDESITE_BRICKS.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_SLAB.get(), Ingredient.of(EBBlocks.ANDESITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS.get()), has(EBBlocks.ANDESITE_BRICKS.get()))
                .save(consumer);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.ANDESITE_BRICK_WALL.get(), Ingredient.of(EBBlocks.ANDESITE_BRICKS.get()))
                .unlockedBy(getHasName(EBBlocks.ANDESITE_BRICKS.get()), has(EBBlocks.ANDESITE_BRICKS.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ANDESITE_BRICKS.get(), Blocks.ANDESITE);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ANDESITE_BRICK_STAIRS.get(), EBBlocks.ANDESITE_BRICKS.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ANDESITE_BRICK_SLAB.get(), EBBlocks.ANDESITE_BRICKS.get(), 2);
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.ANDESITE_BRICK_WALL.get(), EBBlocks.ANDESITE_BRICKS.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(EBBlocks.COBBLESTONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS,
                EBBlocks.CRACKED_COBBLESTONE_BRICKS.get(), 0.1F, 200).unlockedBy(getHasName(EBBlocks.COBBLESTONE_BRICKS.get()), has(EBBlocks.COBBLESTONE_BRICKS.get())).save(consumer);
        
        stonecutterRecipeTreeGenerator.generateRecipes(consumer);
    }

    public static ShapedRecipeBuilder createWendysFourForFourMeal(Item output, Item ingredient, Item ingredient2) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define('#', ingredient).define('@', ingredient2)
                .pattern("@#")
                .pattern("#@");
    }

    public static ShapedRecipeBuilder createCrystalLantern(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .define('#', ingredient).define('@', Items.IRON_INGOT).define('!', Items.IRON_NUGGET)
                .pattern("!@!")
                .pattern("###")
                .pattern("!@!");
    }

    public static ShapedRecipeBuilder createCrystalGlass(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .define('#', ingredient).define('@', Items.GLASS).define('!', Items.IRON_NUGGET)
                .pattern("!#!")
                .pattern("#@#")
                .pattern("!#!");
    }

    public static ShapedRecipeBuilder createPane(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 16)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###");
    }

    public static ShapedRecipeBuilder dyeEightForEight(Item output, Item ingredient, DyeColor color) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define('#', ingredient).define('@', DyeItem.byColor(color))
                .pattern("###")
                .pattern("#@#")
                .pattern("###");
    }

    public static ShapedRecipeBuilder createChiseled(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .define('#', ingredient)
                .pattern("#")
                .pattern("#");
    }
}
