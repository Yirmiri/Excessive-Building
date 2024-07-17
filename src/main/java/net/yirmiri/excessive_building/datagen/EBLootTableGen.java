package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.concurrent.CompletableFuture;

public class EBLootTableGen extends FabricBlockLootTableProvider {
    public EBLootTableGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> future) {
        super(output, future);
    }

    @Override
    public void generate() {
        addDrop(EBBlocks.OAK_MOSAIC);
        addDrop(EBBlocks.OAK_MOSAIC_STAIRS);
        addDrop(EBBlocks.OAK_MOSAIC_SLAB, slabDrops(EBBlocks.OAK_MOSAIC_SLAB));
        addDrop(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.SPRUCE_MOSAIC);
        addDrop(EBBlocks.SPRUCE_MOSAIC_STAIRS);
        addDrop(EBBlocks.SPRUCE_MOSAIC_SLAB, slabDrops(EBBlocks.SPRUCE_MOSAIC_SLAB));
        addDrop(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.BIRCH_MOSAIC);
        addDrop(EBBlocks.BIRCH_MOSAIC_STAIRS);
        addDrop(EBBlocks.BIRCH_MOSAIC_SLAB, slabDrops(EBBlocks.BIRCH_MOSAIC_SLAB));
        addDrop(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.JUNGLE_MOSAIC);
        addDrop(EBBlocks.JUNGLE_MOSAIC_STAIRS);
        addDrop(EBBlocks.JUNGLE_MOSAIC_SLAB, slabDrops(EBBlocks.JUNGLE_MOSAIC_SLAB));
        addDrop(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.ACACIA_MOSAIC);
        addDrop(EBBlocks.ACACIA_MOSAIC_STAIRS);
        addDrop(EBBlocks.ACACIA_MOSAIC_SLAB, slabDrops(EBBlocks.ACACIA_MOSAIC_SLAB));
        addDrop(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.DARK_OAK_MOSAIC);
        addDrop(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
        addDrop(EBBlocks.DARK_OAK_MOSAIC_SLAB, slabDrops(EBBlocks.DARK_OAK_MOSAIC_SLAB));
        addDrop(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.MANGROVE_MOSAIC);
        addDrop(EBBlocks.MANGROVE_MOSAIC_STAIRS);
        addDrop(EBBlocks.MANGROVE_MOSAIC_SLAB, slabDrops(EBBlocks.MANGROVE_MOSAIC_SLAB));
        addDrop(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.CHERRY_MOSAIC);
        addDrop(EBBlocks.CHERRY_MOSAIC_STAIRS);
        addDrop(EBBlocks.CHERRY_MOSAIC_SLAB, slabDrops(EBBlocks.CHERRY_MOSAIC_SLAB));
        addDrop(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.CRIMSON_MOSAIC);
        addDrop(EBBlocks.CRIMSON_MOSAIC_STAIRS);
        addDrop(EBBlocks.CRIMSON_MOSAIC_SLAB, slabDrops(EBBlocks.CRIMSON_MOSAIC_SLAB));
        addDrop(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.WARPED_MOSAIC);
        addDrop(EBBlocks.WARPED_MOSAIC_STAIRS);
        addDrop(EBBlocks.WARPED_MOSAIC_SLAB, slabDrops(EBBlocks.WARPED_MOSAIC_SLAB));
        addDrop(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);
        addDrop(EBBlocks.COBBLESTONE_BRICKS);
        addDrop(EBBlocks.COBBLESTONE_BRICK_STAIRS);
        addDrop(EBBlocks.COBBLESTONE_BRICK_SLAB, slabDrops(EBBlocks.COBBLESTONE_BRICK_SLAB));
        addDrop(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, slabDrops(EBBlocks.COBBLESTONE_BRICK_SLAB));
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, slabDrops(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB));
        addDrop(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
        addDrop(EBBlocks.BLACKSTONE_BRICKS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_STAIRS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_SLAB, slabDrops(EBBlocks.BLACKSTONE_BRICK_SLAB));
        addDrop(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
        addDrop(EBBlocks.BLACKSTONE_BRICK_WALL);
        addDrop(EBBlocks.COBBLESTONE_BRICK_WALL);
        addDrop(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);
        addDrop(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);
        addDrop(EBBlocks.ANCIENT_PLANKS);
        addDrop(EBBlocks.ANCIENT_STAIRS);
        addDrop(EBBlocks.ANCIENT_SLAB, slabDrops(EBBlocks.ANCIENT_SLAB));
        addDrop(EBBlocks.ANCIENT_MOSAIC);
        addDrop(EBBlocks.ANCIENT_MOSAIC_STAIRS);
        addDrop(EBBlocks.ANCIENT_MOSAIC_SLAB, slabDrops(EBBlocks.ANCIENT_MOSAIC_SLAB));
        addDrop(EBBlocks.ANCIENT_FENCE);
        addDrop(EBBlocks.ANCIENT_FENCE_GATE);
        addDrop(EBBlocks.ANCIENT_BUTTON);
        addDrop(EBBlocks.ANCIENT_PRESSURE_PLATE);
        doorDrops(EBBlocks.ANCIENT_DOOR);
        addDrop(EBBlocks.ANCIENT_TRAPDOOR);
        addDrop(EBBlocks.ANCIENT_LOG);
        addDrop(EBBlocks.ANCIENT_WOOD);
        addDrop(EBBlocks.STRIPPED_ANCIENT_LOG);
        addDrop(EBBlocks.STRIPPED_ANCIENT_WOOD);
        ancientLeavesDrops(EBBlocks.ANCIENT_LEAVES, EBBlocks.ANCIENT_SAPLING);
        addDrop(EBBlocks.ANCIENT_SAPLING);
        addPottedPlantDrops(EBBlocks.POTTED_ANCIENT_SAPLING);
        addDrop(EBBlocks.CHISELED_OAK_PLANKS);
        addDrop(EBBlocks.CHISELED_SPRUCE_PLANKS);
        addDrop(EBBlocks.CHISELED_BIRCH_PLANKS);
        addDrop(EBBlocks.CHISELED_JUNGLE_PLANKS);
        addDrop(EBBlocks.CHISELED_ACACIA_PLANKS);
        addDrop(EBBlocks.CHISELED_DARK_OAK_PLANKS);
        addDrop(EBBlocks.CHISELED_MANGROVE_PLANKS);
        addDrop(EBBlocks.CHISELED_CHERRY_PLANKS);
        addDrop(EBBlocks.CHISELED_BAMBOO_PLANKS);
        addDrop(EBBlocks.CHISELED_CRIMSON_PLANKS);
        addDrop(EBBlocks.CHISELED_WARPED_PLANKS);
    }

    public LootTable.Builder ancientLeavesDrops(Block leaves, Block sapling, float... saplingChance) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.leavesDrops(leaves, sapling, saplingChance)
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .conditionally(this.createWithoutShearsOrSilkTouchCondition()).with(
                                ((LeafEntry.Builder) this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(EBItems.ANCIENT_FRUIT)))
                                        .conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
                        )
                );
    }
}
