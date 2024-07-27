package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.AnyBlockUseCriterion;
import net.minecraft.advancement.criterion.ConsumeItemCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.ItemCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
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
    }
}
