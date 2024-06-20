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
            FabricItemGroup.builder().icon(() -> new ItemStack(EBBlocks.LOGO)).displayName(Text.translatable("itemgroup.excessive_building")).entries((ctx, entries) -> {
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

                entries.add(EBBlocks.COBBLESTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_COBBLESTONE_BRICKS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLESTONE_BRICK_SLAB);
                entries.add(EBBlocks.COBBLESTONE_BRICK_WALL);

                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICKS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB);
                entries.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL);

                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICKS);
                entries.add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB);
                entries.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL);

                entries.add(EBBlocks.BLACKSTONE_BRICKS);
                entries.add(EBBlocks.CRACKED_BLACKSTONE_BRICKS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS);
                entries.add(EBBlocks.BLACKSTONE_BRICK_SLAB);
                entries.add(EBBlocks.BLACKSTONE_BRICK_WALL);

                entries.add(EBBlocks.KILN);

                //TODO: All EB painting variants at the bottom
            }).build());

    public static void registerEBItemGroups() {
    }
}
