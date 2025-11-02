package net.yirmiri.excessive_building.datagen;

import com.google.common.collect.ImmutableList;
import net.azurune.runiclib.RunicLib;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.BlockFamily;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import static net.minecraft.data.BlockFamilies.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.core.init.EBTags;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

import java.util.function.Consumer;

public class EBRecipeGen extends FabricRecipeProvider {
    public EBRecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> consumer) {
        StonecutterRecipeTreeGenerator stonecutterRecipeTreeGenerator = new StonecutterRecipeTreeGenerator();

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

        //==========================TOOLS==========================
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.GAUNTLET.get(), 1)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.COPPER_INGOT).define('!', Items.AMETHYST_BLOCK)
                .pattern("!# ")
                .pattern("#!@")
                .pattern(" @@")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBItems.MALLET.get(), 1)
                .define('#', Items.AMETHYST_SHARD).define('@', Items.COPPER_INGOT).define('!', Items.STICK)
                .pattern("###")
                .pattern("#@#")
                .pattern(" ! ")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(consumer);
        //==========================PRISMARINE==========================
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.PRISMARINE), RecipeCategory.MISC, EBBlocks.POLISHED_PRISMARINE.get(), 0.1F, 200)
                .unlockedBy("has_prismarine", has(Blocks.PRISMARINE)).save(consumer, getSmeltingRecipeName(EBBlocks.POLISHED_PRISMARINE.get()));

        stairBuilder(EBBlocks.POLISHED_PRISMARINE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_PRISMARINE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_PRISMARINE.get()), has(EBBlocks.POLISHED_PRISMARINE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_PRISMARINE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_PRISMARINE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_PRISMARINE.get()), has(EBBlocks.POLISHED_PRISMARINE.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_PRISMARINE_STAIRS.get(), EBBlocks.POLISHED_PRISMARINE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_PRISMARINE_SLAB.get(), EBBlocks.POLISHED_PRISMARINE.get(), 2);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.DARK_PRISMARINE), RecipeCategory.MISC, EBBlocks.POLISHED_DARK_PRISMARINE.get(), 0.1F, 200)
                .unlockedBy("has_dark_prismarine", has(Blocks.DARK_PRISMARINE)).save(consumer, getSmeltingRecipeName(EBBlocks.POLISHED_DARK_PRISMARINE.get()));

        stairBuilder(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get(), Ingredient.of(EBBlocks.POLISHED_DARK_PRISMARINE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_DARK_PRISMARINE.get()), has(EBBlocks.POLISHED_DARK_PRISMARINE.get()))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get(), Ingredient.of(EBBlocks.POLISHED_DARK_PRISMARINE.get()))
                .unlockedBy(getHasName(EBBlocks.POLISHED_DARK_PRISMARINE.get()), has(EBBlocks.POLISHED_DARK_PRISMARINE.get()))
                .save(consumer);

        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get(), EBBlocks.POLISHED_DARK_PRISMARINE.get());
        stonecutterRecipeTreeGenerator.putRecipe(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get(), EBBlocks.POLISHED_DARK_PRISMARINE.get(), 2);

        //==========================ANCIENT WOOD==========================
        BlockFamily ancientFamily = familyBuilder(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_planks").get())
                .button(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_button").get())
                .fence(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_fence").get())
                .fenceGate(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_fence_gate").get())
                .pressurePlate(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_pressure_plate").get())
                .slab(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_slab").get())
                .stairs(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_stairs").get())
                .door(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_door").get())
                .trapdoor(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_trapdoor").get())
                .recipeGroupPrefix("wooden")
                .recipeUnlockedBy("has_planks")
                .getFamily();
        generateRecipes(consumer, ancientFamily);

        planksFromLogs(consumer, EBBlocks.ANCIENT_WOODSET.getBlock("ancient_planks").get(), EBTags.ItemT.ANCIENT_LOGS, 4);
        woodenBoat(consumer, EBItems.ANCIENT_BOAT.get(), EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_planks"));
        chestBoat(consumer, EBItems.ANCIENT_CHEST_BOAT.get(), EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_planks"));
        signBuilder(EBItems.ANCIENT_SIGN.get(), Ingredient.of(EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_planks")))
                .save(consumer, "ancient_sign");
        hangingSign(consumer, EBItems.ANCIENT_HANGING_SIGN.get(), EBBlocks.ANCIENT_WOODSET.getBlockItem("ancient_planks"));

        //==========================OTHER==========================
        createShelf(EBBlocks.ALCHEMY_SHELF.get().asItem(), Blocks.OAK_PLANKS.asItem(), Items.GLASS_BOTTLE)
                .save(consumer, "alchemy_shelf");

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, EBBlocks.ZEUS_EPIC_BLOCK.get(), 1)
                .define('#', Items.PURPLE_DYE)
                .pattern("## ")
                .pattern(" ##");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE, 2)
                .requires(EBBlocks.ANCIENT_VINES.get()).group("red_dye");

        //==========================CHAIR==========================
        createChair(EBBlocks.getDyedChairs(DyeColor.WHITE.getId()).get().asItem(), Items.WHITE_WOOL).save(consumer, "white_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.LIGHT_GRAY.getId()).get().asItem(), Items.LIGHT_GRAY_WOOL).save(consumer, "light_gray_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.GRAY.getId()).get().asItem(), Items.GRAY_WOOL).save(consumer, "gray_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.BLACK.getId()).get().asItem(), Items.BLACK_WOOL).save(consumer, "black_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.BROWN.getId()).get().asItem(), Items.BROWN_WOOL).save(consumer, "brown_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.RED.getId()).get().asItem(), Items.RED_WOOL).save(consumer, "red_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.ORANGE.getId()).get().asItem(), Items.ORANGE_WOOL).save(consumer, "orange_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.YELLOW.getId()).get().asItem(), Items.YELLOW_WOOL).save(consumer, "yellow_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.LIME.getId()).get().asItem(), Items.LIME_WOOL).save(consumer, "lime_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.GREEN.getId()).get().asItem(), Items.GREEN_WOOL).save(consumer, "green_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.CYAN.getId()).get().asItem(), Items.CYAN_WOOL).save(consumer, "cyan_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.LIGHT_BLUE.getId()).get().asItem(), Items.LIGHT_BLUE_WOOL).save(consumer, "light_blue_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.BLUE.getId()).get().asItem(), Items.BLUE_WOOL).save(consumer, "blue_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.PURPLE.getId()).get().asItem(), Items.PURPLE_WOOL).save(consumer, "purple_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.MAGENTA.getId()).get().asItem(), Items.MAGENTA_WOOL).save(consumer, "magenta_chair");
        createChair(EBBlocks.getDyedChairs(DyeColor.PINK.getId()).get().asItem(), Items.PINK_WOOL)  .save(consumer, "pink_chair");

        //====================================================
        stonecutterRecipeTreeGenerator.generateRecipes(consumer);
    }

    public static ShapedRecipeBuilder createWendysFourForFourMeal(Item output, Item ingredient, Item ingredient2) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define('#', ingredient).define('@', ingredient2)
                .pattern("@#")
                .pattern("#@");
    }

    public static void woodenBoat(Consumer<FinishedRecipe> consumer, ItemLike boat, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, boat).define('#', material)
                .pattern("# #")
                .pattern("###")
                .group("boat").unlockedBy("in_water", insideOf(Blocks.WATER))
                .save(consumer);
    }

    public static void chestBoat(Consumer<FinishedRecipe> consumer, ItemLike boat, ItemLike material) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, boat).requires(Blocks.CHEST).requires(material)
                .group("chest_boat").unlockedBy("has_boat", has(ItemTags.BOATS))
                .save(consumer);
    }

    public static ShapedRecipeBuilder createShelf(Item output, Item wood, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, 1)
                .define('#', ingredient).define('@', wood)
                .pattern("###")
                .pattern("@@@")
                .pattern("###");
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

    public static ShapedRecipeBuilder createChair(Item output, Item wool) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .define('@', ItemTags.PLANKS).define('#', wool)
                .pattern("###")
                .pattern("@ @")
                .group("chair").unlockedBy("has_wool", has(wool));
    }

    public static ShapedRecipeBuilder createChiseled(Item output, Item ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .define('#', ingredient)
                .pattern("#")
                .pattern("#");
    }
}
