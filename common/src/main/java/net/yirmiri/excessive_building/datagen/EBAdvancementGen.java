package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class EBAdvancementGen extends FabricAdvancementProvider {
    public EBAdvancementGen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookup) {
        super(output, lookup);
    }

    @Override
    public void generateAdvancement(HolderLookup.Provider lookup, Consumer<AdvancementHolder> consumer) {
        AdvancementHolder EXCESSIVE_BUILDING = Advancement.Builder.recipeAdvancement()
                .display(new DisplayInfo(new ItemStack(EBBlocks.LOGO_BLOCK),
                        Component.translatable("advancement.excessive_building.excessive_building"),
                        Component.translatable("advancement.excessive_building.excessive_building.description"),
                        Optional.of(ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "textures/block/cobblestone_bricks.png")), AdvancementType.TASK,
                        false, false, false)).addCriterion("breh",
                        ConsumeItemTrigger.TriggerInstance.usedItem())
                .save(consumer, ExcessiveBuilding.MOD_ID + ":excessive_building");

        AdvancementHolder OBTAIN_ANCIENT_SAPLING = Advancement.Builder.recipeAdvancement().parent(EXCESSIVE_BUILDING)
                .display(new DisplayInfo(new ItemStack(EBBlocks.ANCIENT_SAPLING),
                        Component.translatable("advancement.excessive_building.obtain_ancient_sapling"),
                        Component.translatable("advancement.excessive_building.obtain_ancient_sapling.description"),
                        Optional.empty(), AdvancementType.TASK,
                        true, true, false)).addCriterion("ancient_sapling",
                        InventoryChangeTrigger.TriggerInstance.hasItems(EBBlocks.ANCIENT_SAPLING))
                .save(consumer, ExcessiveBuilding.MOD_ID + ":obtain_ancient_sapling");

        AdvancementHolder EAT_ANCIENT_FRUIT = Advancement.Builder.recipeAdvancement().parent(OBTAIN_ANCIENT_SAPLING)
                .display(new DisplayInfo(new ItemStack(EBItems.ANCIENT_FRUIT),
                        Component.translatable("advancement.excessive_building.eat_ancient_fruit"),
                        Component.translatable("advancement.excessive_building.eat_ancient_fruit.description"),
                        Optional.empty(), AdvancementType.TASK,
                        true, true, false)).addCriterion("ancient_fruit",
                        ConsumeItemTrigger.TriggerInstance.usedItem(ItemPredicate.Builder.item().of(EBItems.ANCIENT_FRUIT)))
                .save(consumer, ExcessiveBuilding.MOD_ID + ":eat_ancient_fruit");

        AdvancementHolder PLACE_GLOOM_SEEDS = Advancement.Builder.recipeAdvancement().parent(OBTAIN_ANCIENT_SAPLING)
                .display(new DisplayInfo(new ItemStack(EBBlocks.GLOOM_SEEDS),
                        Component.translatable("advancement.excessive_building.place_gloom_seeds"),
                        Component.translatable("advancement.excessive_building.place_gloom_seeds.description"),
                        Optional.empty(), AdvancementType.TASK,
                        true, true, false)).addCriterion("gloom_seeds",
                        ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.GLOOM_SEEDS))
                .save(consumer, ExcessiveBuilding.MOD_ID + ":place_gloom_seeds");

        AdvancementHolder USE_HAMMER = Advancement.Builder.recipeAdvancement().parent(EXCESSIVE_BUILDING)
                .display(new DisplayInfo(new ItemStack(EBItems.HAMMER),
                        Component.translatable("advancement.excessive_building.use_hammer"),
                        Component.translatable("advancement.excessive_building.use_hammer.description"),
                        Optional.empty(), AdvancementType.TASK,
                        true, true, false)).addCriterion("use_hammer",
                        ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                                LocationPredicate.Builder.location(), ItemPredicate.Builder.item().of(EBItems.HAMMER)))
                .save(consumer, ExcessiveBuilding.MOD_ID + ":use_hammer");

        AdvancementHolder PLACE_ALL_ALMENTRA_STATUES = Advancement.Builder.recipeAdvancement().parent(USE_HAMMER)
                .display(new DisplayInfo(new ItemStack(EBBlocks.getDyedAlmentraStatues(DyeColor.LIME.getId())),
                        Component.translatable("advancement.excessive_building.place_all_almentra_statues"),
                        Component.translatable("advancement.excessive_building.place_all_almentra_statues.description"),
                        Optional.empty(), AdvancementType.GOAL,
                        true, true, false))
                .addCriterion("white_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.WHITE.getId())))
                .addCriterion("light_gray_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_GRAY.getId())))
                .addCriterion("gray_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.GRAY.getId())))
                .addCriterion("black_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.BLACK.getId())))
                .addCriterion("brown_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.BROWN.getId())))
                .addCriterion("red_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.RED.getId())))
                .addCriterion("orange_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.ORANGE.getId())))
                .addCriterion("yellow_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.YELLOW.getId())))
                .addCriterion("lime_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.LIME.getId())))
                .addCriterion("green_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.GREEN.getId())))
                .addCriterion("cyan_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.CYAN.getId())))
                .addCriterion("light_blue_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.LIGHT_BLUE.getId())))
                .addCriterion("blue_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.BLUE.getId())))
                .addCriterion("purple_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.PURPLE.getId())))
                .addCriterion("magenta_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.MAGENTA.getId())))
                .addCriterion("pink_almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.getDyedAlmentraStatues(DyeColor.PINK.getId())))
                .addCriterion("almentra_statue", ItemUsedOnLocationTrigger.TriggerInstance.placedBlock(EBBlocks.ALMENTRA_STATUE))
                .save(consumer, ExcessiveBuilding.MOD_ID + ":place_all_almentra_statues");

        AdvancementHolder USE_WRENCH = Advancement.Builder.recipeAdvancement().parent(EXCESSIVE_BUILDING)
                .display(new DisplayInfo(new ItemStack(EBItems.WRENCH),
                        Component.translatable("advancement.excessive_building.use_wrench"),
                        Component.translatable("advancement.excessive_building.use_wrench.description"),
                        Optional.empty(), AdvancementType.TASK,
                        true, true, false)).addCriterion("use_wrench",
                        ItemUsedOnLocationTrigger.TriggerInstance.itemUsedOnBlock(
                                LocationPredicate.Builder.location(), ItemPredicate.Builder.item().of(EBItems.WRENCH)))
                .save(consumer, ExcessiveBuilding.MOD_ID + ":use_wrench");
    }
}
