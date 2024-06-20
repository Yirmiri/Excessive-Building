package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.yirmiri.excessive_building.registry.EBBlocks;

import java.util.concurrent.CompletableFuture;

public class EBEnUsLangGen extends FabricLanguageProvider {
    public EBEnUsLangGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder builder) {
        //BLOCKS
        builder.add(EBBlocks.OAK_MOSAIC, "Oak Mosaic");
        builder.add(EBBlocks.OAK_MOSAIC_STAIRS, "Oak Mosaic Stairs");
        builder.add(EBBlocks.OAK_MOSAIC_SLAB, "Oak Mosaic Slab");
        builder.add(EBBlocks.OAK_MOSAIC_VERTICAL_STAIRS, "Oak Mosaic Vertical Stairs");
        builder.add(EBBlocks.SPRUCE_MOSAIC, "Spruce Mosaic");
        builder.add(EBBlocks.SPRUCE_MOSAIC_STAIRS, "Spruce Mosaic Stairs");
        builder.add(EBBlocks.SPRUCE_MOSAIC_SLAB, "Spruce Mosaic Slab");
        builder.add(EBBlocks.SPRUCE_MOSAIC_VERTICAL_STAIRS, "Spruce Mosaic Vertical Stairs");
        builder.add(EBBlocks.BIRCH_MOSAIC, "Birch Mosaic");
        builder.add(EBBlocks.BIRCH_MOSAIC_STAIRS, "Birch Mosaic Stairs");
        builder.add(EBBlocks.BIRCH_MOSAIC_SLAB, "Birch Mosaic Slab");
        builder.add(EBBlocks.BIRCH_MOSAIC_VERTICAL_STAIRS, "Birch Mosaic Vertical Stairs");
        builder.add(EBBlocks.JUNGLE_MOSAIC, "Jungle Mosaic");
        builder.add(EBBlocks.JUNGLE_MOSAIC_STAIRS, "Jungle Mosaic Stairs");
        builder.add(EBBlocks.JUNGLE_MOSAIC_SLAB, "Jungle Mosaic Slab");
        builder.add(EBBlocks.JUNGLE_MOSAIC_VERTICAL_STAIRS, "Jungle Mosaic Vertical Stairs");
        builder.add(EBBlocks.ACACIA_MOSAIC, "Acacia Mosaic");
        builder.add(EBBlocks.ACACIA_MOSAIC_STAIRS, "Acacia Mosaic Stairs");
        builder.add(EBBlocks.ACACIA_MOSAIC_SLAB, "Acacia Mosaic Slab");
        builder.add(EBBlocks.ACACIA_MOSAIC_VERTICAL_STAIRS, "Acacia Mosaic Vertical Stairs");
        builder.add(EBBlocks.DARK_OAK_MOSAIC, "Dark Oak Mosaic");
        builder.add(EBBlocks.DARK_OAK_MOSAIC_STAIRS, "Dark Oak Mosaic Stairs");
        builder.add(EBBlocks.DARK_OAK_MOSAIC_SLAB, "Dark Oak Mosaic Slab");
        builder.add(EBBlocks.DARK_OAK_MOSAIC_VERTICAL_STAIRS, "Dark Oak Mosaic Vertical Stairs");
        builder.add(EBBlocks.MANGROVE_MOSAIC, "Mangrove Mosaic");
        builder.add(EBBlocks.MANGROVE_MOSAIC_STAIRS, "Mangrove Mosaic Stairs");
        builder.add(EBBlocks.MANGROVE_MOSAIC_SLAB, "Mangrove Mosaic Slab");
        builder.add(EBBlocks.MANGROVE_MOSAIC_VERTICAL_STAIRS, "Mangrove Mosaic Vertical Stairs");
        builder.add(EBBlocks.CHERRY_MOSAIC, "Cherry Mosaic");
        builder.add(EBBlocks.CHERRY_MOSAIC_STAIRS, "Cherry Mosaic Stairs");
        builder.add(EBBlocks.CHERRY_MOSAIC_SLAB, "Cherry Mosaic Slab");
        builder.add(EBBlocks.CHERRY_MOSAIC_VERTICAL_STAIRS, "Cherry Mosaic Vertical Stairs");
        builder.add(EBBlocks.CRIMSON_MOSAIC, "Crimson Mosaic");
        builder.add(EBBlocks.CRIMSON_MOSAIC_STAIRS, "Crimson Mosaic Stairs");
        builder.add(EBBlocks.CRIMSON_MOSAIC_SLAB, "Crimson Mosaic Slab");
        builder.add(EBBlocks.CRIMSON_MOSAIC_VERTICAL_STAIRS, "Crimson Mosaic Vertical Stairs");
        builder.add(EBBlocks.WARPED_MOSAIC, "Warped Mosaic");
        builder.add(EBBlocks.WARPED_MOSAIC_STAIRS, "Warped Mosaic Stairs");
        builder.add(EBBlocks.WARPED_MOSAIC_SLAB, "Warped Mosaic Slab");
        builder.add(EBBlocks.WARPED_MOSAIC_VERTICAL_STAIRS, "Warped Mosaic Vertical Stairs");
        builder.add(EBBlocks.BAMBOO_MOSAIC_VERTICAL_STAIRS, "Bamboo Mosaic Vertical Stairs");
        builder.add(EBBlocks.COBBLESTONE_BRICKS, "Cobblestone Bricks");
        builder.add(EBBlocks.COBBLESTONE_BRICK_STAIRS, "Cobblestone Brick Stairs");
        builder.add(EBBlocks.COBBLESTONE_BRICK_SLAB, "Cobblestone Brick Slab");
        builder.add(EBBlocks.COBBLESTONE_BRICK_VERTICAL_STAIRS, "Cobblestone Brick Vertical Stairs");
        builder.add(EBBlocks.CRACKED_COBBLESTONE_BRICKS, "Cracked Cobblestone Bricks");
        builder.add(EBBlocks.MOSSY_COBBLESTONE_BRICKS, "Mossy Cobblestone Bricks");
        builder.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_STAIRS, "Mossy Cobblestone Brick Stairs");
        builder.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_SLAB, "Mossy Cobblestone Brick Slab");
        builder.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_VERTICAL_STAIRS, "Mossy Cobblestone Brick Vertical Stairs");
        builder.add(EBBlocks.COBBLED_DEEPSLATE_BRICKS, "Cobbled Deepslate Bricks");
        builder.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_STAIRS, "Cobbled Deepslate Brick Stairs");
        builder.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_SLAB, "Cobbled Deepslate Brick Slab");
        builder.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_VERTICAL_STAIRS, "Cobbled Deepslate Brick Vertical Stairs");
        builder.add(EBBlocks.CRACKED_COBBLED_DEEPSLATE_BRICKS, "Cracked Cobbled Deepslate Bricks");
        builder.add(EBBlocks.BLACKSTONE_BRICKS, "Blackstone Bricks");
        builder.add(EBBlocks.BLACKSTONE_BRICK_STAIRS, "Blackstone Brick Stairs");
        builder.add(EBBlocks.BLACKSTONE_BRICK_SLAB, "Blackstone Brick Slab");
        builder.add(EBBlocks.BLACKSTONE_BRICK_VERTICAL_STAIRS, "Blackstone Brick Vertical Stairs");
        builder.add(EBBlocks.CRACKED_BLACKSTONE_BRICKS, "Cracked Blackstone Bricks");
        builder.add(EBBlocks.COBBLESTONE_BRICK_WALL, "Cobblestone Brick Wall");
        builder.add(EBBlocks.MOSSY_COBBLESTONE_BRICK_WALL, "Mossy Cobblestone Brick Wall");
        builder.add(EBBlocks.COBBLED_DEEPSLATE_BRICK_WALL, "Cobbled Deepslate Brick Wall");
        builder.add(EBBlocks.BLACKSTONE_BRICK_WALL, "Blackstone Brick Wall");

        //ITEM GROUPS
        builder.add("itemgroup.excessive_building", "Excessive Building");
    }
}
