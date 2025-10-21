package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;

import java.util.ArrayList;

public class EBLootTableGen extends FabricBlockLootTableProvider {
    public static final float[] LEAVES_STICK_DROP_CHANCE = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.01F, 0.05F, 0.08F, 0.1F};

    public EBLootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static final ArrayList<Block> usedBlocks = new ArrayList<>();

    @Override
    public void add(Block block, LootTable.Builder lootTable) {
        if(usedBlocks.contains(block)) {
            return;
        }
        super.add(block, lootTable);
        usedBlocks.add(block);
    }

    @Override
    public void generate() {
        dropSelf(EBBlocks.HECTALITE.get());
        dropSelf(EBBlocks.HECTALITE_STAIRS.get());
        add(EBBlocks.HECTALITE_SLAB.get(), createSlabItemTable(EBBlocks.HECTALITE_SLAB.get()));
        dropSelf(EBBlocks.HECTALITE_WALL.get());

        dropSelf(EBBlocks.POLISHED_HECTALITE.get());
        dropSelf(EBBlocks.POLISHED_HECTALITE_STAIRS.get());
        add(EBBlocks.POLISHED_HECTALITE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_HECTALITE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_HECTALITE_WALL.get());

        dropSelf(EBBlocks.HECTALITE_BRICKS.get());
        dropSelf(EBBlocks.HECTALITE_BRICK_STAIRS.get());
        add(EBBlocks.HECTALITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.HECTALITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.HECTALITE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_HECTALITE.get());

        dropSelf(EBBlocks.AMETHYST_BRICKS.get());
        dropSelf(EBBlocks.AMETHYST_BRICK_STAIRS.get());
        add(EBBlocks.AMETHYST_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.AMETHYST_BRICK_SLAB.get()));
        dropSelf(EBBlocks.AMETHYST_BRICK_WALL.get());

        addDyedDrops();
        dropSelf(EBBlocks.FROSTED_GLASS.get());

        dropSelf(EBBlocks.CHLOROSLATE.get());
        dropSelf(EBBlocks.CHLOROSLATE_STAIRS.get());
        add(EBBlocks.CHLOROSLATE_SLAB.get(), createSlabItemTable(EBBlocks.CHLOROSLATE_SLAB.get()));
        dropSelf(EBBlocks.CHLOROSLATE_WALL.get());

        dropSelf(EBBlocks.POLISHED_CHLOROSLATE.get());
        dropSelf(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get());
        add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_CHLOROSLATE_WALL.get());

        dropSelf(EBBlocks.CHLOROSLATE_BRICKS.get());
        dropSelf(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get());
        add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.CHLOROSLATE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.CHLOROSLATE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_CHLOROSLATE.get());

        dropSelf(EBBlocks.ARIDITE.get());
        dropSelf(EBBlocks.ARIDITE_STAIRS.get());
        add(EBBlocks.ARIDITE_SLAB.get(), createSlabItemTable(EBBlocks.ARIDITE_SLAB.get()));
        dropSelf(EBBlocks.ARIDITE_WALL.get());

        dropSelf(EBBlocks.POLISHED_ARIDITE.get());
        dropSelf(EBBlocks.POLISHED_ARIDITE_STAIRS.get());
        add(EBBlocks.POLISHED_ARIDITE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_ARIDITE_SLAB.get()));
        dropSelf(EBBlocks.POLISHED_ARIDITE_WALL.get());

        dropSelf(EBBlocks.ARIDITE_BRICKS.get());
        dropSelf(EBBlocks.ARIDITE_BRICK_STAIRS.get());
        add(EBBlocks.ARIDITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ARIDITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ARIDITE_BRICK_WALL.get());

        dropSelf(EBBlocks.CHISELED_ARIDITE.get());

        dropSelf(EBBlocks.HECTALITE_PILLAR.get());
        dropSelf(EBBlocks.CHLOROSLATE_PILLAR.get());
        dropSelf(EBBlocks.ARIDITE_PILLAR.get());

        dropSelf(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get());
        
        dropSelf(EBBlocks.COBBLESTONE_BRICKS.get());
        dropSelf(EBBlocks.COBBLESTONE_BRICK_STAIRS.get());
        add(EBBlocks.COBBLESTONE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.COBBLESTONE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.COBBLESTONE_BRICK_WALL.get());

        dropSelf(EBBlocks.DIORITE_BRICKS.get());
        dropSelf(EBBlocks.DIORITE_BRICK_STAIRS.get());
        add(EBBlocks.DIORITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.DIORITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.DIORITE_BRICK_WALL.get());

        dropSelf(EBBlocks.GRANITE_BRICKS.get());
        dropSelf(EBBlocks.GRANITE_BRICK_STAIRS.get());
        add(EBBlocks.GRANITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.GRANITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.GRANITE_BRICK_WALL.get());

        dropSelf(EBBlocks.ANDESITE_BRICKS.get());
        dropSelf(EBBlocks.ANDESITE_BRICK_STAIRS.get());
        add(EBBlocks.ANDESITE_BRICK_SLAB.get(), createSlabItemTable(EBBlocks.ANDESITE_BRICK_SLAB.get()));
        dropSelf(EBBlocks.ANDESITE_BRICK_WALL.get());

        dropSelf(EBBlocks.AMETHYST_LANTERN.get());
        add(EBBlocks.AMETHYST_FRAMED_GLASS.get(), createSilkTouchOnlyTable(EBBlocks.AMETHYST_FRAMED_GLASS.get()));
        add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), createSilkTouchOnlyTable(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get()));

        dropSelf(EBBlocks.KILN.get());

        add(EBBlocks.ALCHEMY_SHELF.get(), createSingleItemTableWithSilkTouch(EBBlocks.ALCHEMY_SHELF.get(), Items.GLASS_BOTTLE, ConstantValue.exactly(3.0F)));
        add(EBBlocks.ALCHEMY_SHELF_VARIANT1.get(), createSingleItemTableWithSilkTouch(EBBlocks.ALCHEMY_SHELF.get(), Items.GLASS_BOTTLE, ConstantValue.exactly(3.0F)));
        add(EBBlocks.ALCHEMY_SHELF_VARIANT2.get(), createSingleItemTableWithSilkTouch(EBBlocks.ALCHEMY_SHELF.get(), Items.GLASS_BOTTLE, ConstantValue.exactly(3.0F)));
        add(EBBlocks.ALCHEMY_SHELF_VARIANT3.get(), createSingleItemTableWithSilkTouch(EBBlocks.ALCHEMY_SHELF.get(), Items.GLASS_BOTTLE, ConstantValue.exactly(3.0F)));
        add(EBBlocks.ALCHEMY_SHELF_VARIANT4.get(), createSingleItemTableWithSilkTouch(EBBlocks.ALCHEMY_SHELF.get(), Items.GLASS_BOTTLE, ConstantValue.exactly(3.0F)));
        add(EBBlocks.ALCHEMY_SHELF_VARIANT5.get(), createSingleItemTableWithSilkTouch(EBBlocks.ALCHEMY_SHELF.get(), Items.GLASS_BOTTLE, ConstantValue.exactly(3.0F)));

        dropSelf(EBBlocks.POLISHED_PRISMARINE.get());
        dropSelf(EBBlocks.POLISHED_PRISMARINE_STAIRS.get());
        add(EBBlocks.POLISHED_PRISMARINE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_PRISMARINE_SLAB.get()));

        dropSelf(EBBlocks.POLISHED_DARK_PRISMARINE.get());
        dropSelf(EBBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get());
        add(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get(), createSlabItemTable(EBBlocks.POLISHED_DARK_PRISMARINE_SLAB.get()));

        dropSelf(EBBlocks.ZEUS_EPIC_BLOCK.get());

        add(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_leaves").get(),
                createLeavesDrops(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_leaves").get(), EBBlocks.ANCIENT_SAPLING.get(), SAPLING_DROP_CHANCE));

        dropPottedContents(EBBlocks.POTTED_ANCIENT_SAPLING.get());

        add(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_door").get(),
                createDoorTable(EBBlocks.ANCIENT_WOODSET.getBlock("ancient_door").get()));

        addNetherVinesDropTable(EBBlocks.ANCIENT_VINES.get(), EBBlocks.ANCIENT_VINES_PLANT.get());

        dropOther(EBBlocks.ANCIENT_SIGN.get(), EBItems.ANCIENT_SIGN.get());
        dropOther(EBBlocks.ANCIENT_WALL_SIGN.get(), EBItems.ANCIENT_SIGN.get());
        dropOther(EBBlocks.ANCIENT_HANGING_SIGN.get(), EBItems.ANCIENT_HANGING_SIGN.get());
        dropOther(EBBlocks.ANCIENT_WALL_HANGING_SIGN.get(), EBItems.ANCIENT_HANGING_SIGN.get());

        //USED
        usedBlocks.add(EBBlocks.BOOKSHELF_VARIANT1.get());
        usedBlocks.add(EBBlocks.BOOKSHELF_VARIANT2.get());
        usedBlocks.add(EBBlocks.BOOKSHELF_VARIANT3.get());
        usedBlocks.add(EBBlocks.BOOKSHELF_VARIANT4.get());
        usedBlocks.add(EBBlocks.BOOKSHELF_VARIANT5.get());

        for(ResourceLocation id : EBUtil.allBlockIdsInNamespace(ExcessiveBuilding.MOD_ID)) {
            Block block = BuiltInRegistries.BLOCK.get(id);
            if(usedBlocks.contains(block)) { continue; }
            this.dropSelf(block);
        }
    }

    private void addDyedDrops() {
        for (DyeColor colors : DyeColor.values()) {
            dropSelf(EBBlocks.getDyedFrostedGlass(colors.getId()).get());
            dropSelf(EBBlocks.getDyedChairs(colors.getId()).get());
        }
    }
}
