package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBItemGroups {
    public static ItemGroup EXCESSIVE_BUILDING = Registry.register(Registries.ITEM_GROUP, Identifier.of(ExcessiveBuilding.MOD_ID, "excessive_building"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EBBlocks.OAK_MOSAIC)).displayName(Text.translatable("itemgroup.excessive_building")).entries((displayContext, entries) -> {
                entries.add(EBBlocks.OAK_MOSAIC);
                entries.add(EBBlocks.OAK_MOSAIC_STAIRS);
                entries.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.OAK_MOSAIC_SLAB);

                entries.add(EBBlocks.SPRUCE_MOSAIC);
                entries.add(EBBlocks.SPRUCE_MOSAIC_STAIRS);
                entries.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.SPRUCE_MOSAIC_SLAB);

                entries.add(EBBlocks.BIRCH_MOSAIC);
                entries.add(EBBlocks.BIRCH_MOSAIC_STAIRS);
                entries.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.BIRCH_MOSAIC_SLAB);

                entries.add(EBBlocks.JUNGLE_MOSAIC);
                entries.add(EBBlocks.JUNGLE_MOSAIC_STAIRS);
                entries.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.JUNGLE_MOSAIC_SLAB);

                entries.add(EBBlocks.ACACIA_MOSAIC);
                entries.add(EBBlocks.ACACIA_MOSAIC_STAIRS);
                entries.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.ACACIA_MOSAIC_SLAB);

                entries.add(EBBlocks.DARK_OAK_MOSAIC);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.DARK_OAK_MOSAIC_SLAB);

                entries.add(EBBlocks.MANGROVE_MOSAIC);
                entries.add(EBBlocks.MANGROVE_MOSAIC_STAIRS);
                entries.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.MANGROVE_MOSAIC_SLAB);

                entries.add(EBBlocks.CHERRY_MOSAIC);
                entries.add(EBBlocks.CHERRY_MOSAIC_STAIRS);
                entries.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CHERRY_MOSAIC_SLAB);

                entries.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS);

                entries.add(EBBlocks.CRIMSON_MOSAIC);
                entries.add(EBBlocks.CRIMSON_MOSAIC_STAIRS);
                entries.add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.CRIMSON_MOSAIC_SLAB);

                entries.add(EBBlocks.WARPED_MOSAIC);
                entries.add(EBBlocks.WARPED_MOSAIC_STAIRS);
                entries.add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS);
                entries.add(EBBlocks.WARPED_MOSAIC_SLAB);
            }).build());
//TODO: Add to vanilla tabs

//    public static void registerAddToVanilla() {
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
//            entries.addAfter(Items.OAK_PLANKS, EBBlocks.OAK_MOSAIC);
//            entries.addAfter(Items.OAK_STAIRS, EBBlocks.OAK_MOSAIC_STAIRS);
//            entries.addAfter(Items.OAK_SLAB, EBBlocks.OAK_MOSAIC_SLAB);
//        });
//    }
}
