package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.ItemCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.LocationPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class EBAdvancementGen extends FabricAdvancementProvider {
    public EBAdvancementGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookup) {
        super(output, lookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup lookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry EXCESSIVE_BUILDING = Advancement.Builder.createUntelemetered()
                .display(new AdvancementDisplay(new ItemStack(EBBlocks.LOGO_BLOCK),
                        Text.translatable("advancement.excessive_building.excessive_building"),
                        Text.translatable("advancement.excessive_building.excessive_building.description"),
                        Optional.of(Identifier.of(ExcessiveBuilding.MOD_ID, "textures/block/cobblestone_bricks.png")), AdvancementFrame.TASK,
                        false, false, false)).criterion("breh",
                        ConsumeItemCriterion.Conditions.any())
                .build(consumer, ExcessiveBuilding.MOD_ID + ":excessive_building");

        AdvancementEntry OBTAIN_ANCIENT_SAPLING = Advancement.Builder.createUntelemetered().parent(EXCESSIVE_BUILDING)
                .display(new AdvancementDisplay(new ItemStack(EBBlocks.ANCIENT_SAPLING),
                        Text.translatable("advancement.excessive_building.obtain_ancient_sapling"),
                        Text.translatable("advancement.excessive_building.obtain_ancient_sapling.description"),
                        Optional.empty(), AdvancementFrame.TASK,
                        true, true, false)).criterion("ancient_sapling",
                        InventoryChangedCriterion.Conditions.items(EBBlocks.ANCIENT_SAPLING))
                .build(consumer, ExcessiveBuilding.MOD_ID + ":obtain_ancient_sapling");

        AdvancementEntry EAT_ANCIENT_FRUIT = Advancement.Builder.createUntelemetered().parent(OBTAIN_ANCIENT_SAPLING)
                .display(new AdvancementDisplay(new ItemStack(EBItems.ANCIENT_FRUIT),
                        Text.translatable("advancement.excessive_building.eat_ancient_fruit"),
                        Text.translatable("advancement.excessive_building.eat_ancient_fruit.description"),
                        Optional.empty(), AdvancementFrame.TASK,
                        true, true, false)).criterion("ancient_fruit",
                        ConsumeItemCriterion.Conditions.predicate(ItemPredicate.Builder.create().items(EBItems.ANCIENT_FRUIT)))
                .build(consumer, ExcessiveBuilding.MOD_ID + ":eat_ancient_fruit");

        AdvancementEntry PLACE_GLOOM_SEEDS = Advancement.Builder.createUntelemetered().parent(OBTAIN_ANCIENT_SAPLING)
                .display(new AdvancementDisplay(new ItemStack(EBBlocks.GLOOM_SEEDS),
                        Text.translatable("advancement.excessive_building.place_gloom_seeds"),
                        Text.translatable("advancement.excessive_building.place_gloom_seeds.description"),
                        Optional.empty(), AdvancementFrame.TASK,
                        true, true, false)).criterion("gloom_seeds",
                        ItemCriterion.Conditions.createPlacedBlock(EBBlocks.GLOOM_SEEDS))
                .build(consumer, ExcessiveBuilding.MOD_ID + ":place_gloom_seeds");

        AdvancementEntry USE_HAMMER = Advancement.Builder.createUntelemetered().parent(EXCESSIVE_BUILDING)
                .display(new AdvancementDisplay(new ItemStack(EBItems.HAMMER),
                        Text.translatable("advancement.excessive_building.use_hammer"),
                        Text.translatable("advancement.excessive_building.use_hammer.description"),
                        Optional.empty(), AdvancementFrame.TASK,
                        true, true, false)).criterion("use_hammer",
                        ItemCriterion.Conditions.createItemUsedOnBlock(
                                LocationPredicate.Builder.create(), ItemPredicate.Builder.create().tag(EBTags.Items.EB_HAMMERS)))
                .build(consumer, ExcessiveBuilding.MOD_ID + ":use_hammer");

        AdvancementEntry PLACE_ALL_ALMENTRA_STATUES = Advancement.Builder.createUntelemetered().parent(USE_HAMMER)
                .display(new AdvancementDisplay(new ItemStack(EBBlocks.getDyedAlmentraStatues(DyeColor.LIME.getId())),
                        Text.translatable("advancement.excessive_building.place_all_almentra_statues"),
                        Text.translatable("advancement.excessive_building.place_all_almentra_statues.description"),
                        Optional.empty(), AdvancementFrame.GOAL,
                        true, true, false))
                .criterion("white_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.WHITE.getId())))
                .criterion("light_gray_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_GRAY.getId())))
                .criterion("gray_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.GRAY.getId())))
                .criterion("black_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.BLACK.getId())))
                .criterion("brown_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.BROWN.getId())))
                .criterion("red_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.RED.getId())))
                .criterion("orange_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.ORANGE.getId())))
                .criterion("yellow_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.YELLOW.getId())))
                .criterion("lime_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.LIME.getId())))
                .criterion("green_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.GREEN.getId())))
                .criterion("cyan_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.CYAN.getId())))
                .criterion("light_blue_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_BLUE.getId())))
                .criterion("blue_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.BLUE.getId())))
                .criterion("purple_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.PURPLE.getId())))
                .criterion("magenta_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.MAGENTA.getId())))
                .criterion("pink_almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.PINK.getId())))
                .criterion("almentra_statue", ItemCriterion.Conditions.createPlacedBlock(EBBlocks.ALMENTRA_STATUE))
                .build(consumer, ExcessiveBuilding.MOD_ID + ":place_all_almentra_statues");
    }
}
