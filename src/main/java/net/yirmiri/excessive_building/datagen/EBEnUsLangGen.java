package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

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
        builder.add(EBBlocks.KILN, "Kiln");
        builder.add(EBBlocks.LOGO, "Logo Block");
        builder.add(EBBlocks.ANCIENT_PLANKS, "Ancient Planks");
        builder.add(EBBlocks.ANCIENT_STAIRS, "Ancient Stairs");
        builder.add(EBBlocks.ANCIENT_SLAB, "Ancient Slab");
        builder.add(EBBlocks.ANCIENT_VERTICAL_STAIRS, "Ancient Vertical Stairs");
        builder.add(EBBlocks.ANCIENT_MOSAIC, "Ancient Mosaic");
        builder.add(EBBlocks.ANCIENT_MOSAIC_STAIRS, "Ancient Mosaic Stairs");
        builder.add(EBBlocks.ANCIENT_MOSAIC_SLAB, "Ancient Mosaic Slab");
        builder.add(EBBlocks.ANCIENT_MOSAIC_VERTICAL_STAIRS, "Ancient Mosaic Vertical Stairs");
        builder.add(EBBlocks.ANCIENT_BUTTON, "Ancient Button");
        builder.add(EBBlocks.ANCIENT_PRESSURE_PLATE, "Ancient Pressure Plate");
        builder.add(EBBlocks.ANCIENT_DOOR, "Ancient Door");
        builder.add(EBBlocks.ANCIENT_TRAPDOOR, "Ancient Trapdoor");
        builder.add(EBBlocks.ANCIENT_LOG, "Ancient Log");
        builder.add(EBBlocks.ANCIENT_WOOD, "Ancient Wood");
        builder.add(EBBlocks.STRIPPED_ANCIENT_LOG, "Stripped Ancient Log");
        builder.add(EBBlocks.STRIPPED_ANCIENT_WOOD, "Stripped Ancient Wood");
        builder.add(EBBlocks.ANCIENT_LEAVES, "Ancient Leaves");
        builder.add(EBBlocks.ANCIENT_FENCE, "Ancient Fence");
        builder.add(EBBlocks.ANCIENT_FENCE_GATE, "Ancient Fence Gate");
        builder.add(EBBlocks.ANCIENT_SAPLING, "Ancient Sapling");
        builder.add(EBBlocks.POTTED_ANCIENT_SAPLING, "Potted Ancient Sapling");

        //ITEMS
        builder.add(EBItems.ANCIENT_SIGN, "Ancient Sign");
        builder.add(EBItems.ANCIENT_HANGING_SIGN, "Ancient Hanging Sign");
        builder.add(EBItems.ANCIENT_FRUIT, "Ancient Fruit");

        //TOOLTIPS
        builder.add("tooltip.block.interact", "Upon Interaction:");
        builder.add("tooltip.block.variant", "Cycles Block Variants:");
        builder.add("tooltip.block.interact_sugar", "Interact with Sugar:");
        builder.add("tooltip.block.swift", "Increases Movement Speed");
        builder.add("tooltip.block.interact_soil", "Interact with Soil:");
        builder.add("tooltip.block.fill", "Fills Up Pot");
        builder.add("tooltip.block.interact_glow_removals", "Interact with Paper:");
        builder.add("tooltip.block.glow_removal", "Removes it's Glow");
        builder.add("tooltip.block.when_powered", "When Powered by Redstone:");
        builder.add("tooltip.block.soul_magma", "Creates a Lifting Bubble Column");

        //MISC
        builder.add("excessive_building.container.kiln", "Kiln");

        //ITEM GROUPS
        builder.add("itemgroup.excessive_building", "Excessive Building");

        //PAINTING TITLES
        builder.add("painting.excessive_building.forgotten_kingdom.title", "Forgotten Kingdom");
        builder.add("painting.excessive_building.beacon_of_the_desert.title", "Beacon of the Desert");
        builder.add("painting.excessive_building.beacon_of_the_desert_trimmed.title", "Beacon of the Desert (Trimmed)");
        builder.add("painting.excessive_building.burrito.title", "Burrito?");
        builder.add("painting.excessive_building.courbet_original.title", "Courbet (Original)");
        builder.add("painting.excessive_building.crash_landing.title", "Crash Landing");
        builder.add("painting.excessive_building.fit_for_a_queen.title", "Fit for a Queen");
        builder.add("painting.excessive_building.floors.title", "Floors");
        builder.add("painting.excessive_building.horizon.title", "Shine");
        builder.add("painting.excessive_building.imminent_detonation.title", "Imminent Detonation");
        builder.add("painting.excessive_building.kolos_bug.title", "Kolos Bug");
        builder.add("painting.excessive_building.lone_bridge.title", "Lone Bridge");
        builder.add("painting.excessive_building.long_trips.title", "Long Trips");
        builder.add("painting.excessive_building.paleobotany.title", "Paleobotany");
        builder.add("painting.excessive_building.pufferlight.title", "Pufferlight");
        builder.add("painting.excessive_building.scourge_bringer.title", "Scourge Bringer");
        builder.add("painting.excessive_building.sniffing_in_the_pine_forest.title", "Sniffing in the Pine Forest");
        builder.add("painting.excessive_building.stage_original.title", "Stage (Original)");
        builder.add("painting.excessive_building.the_end.title", "The End");
        builder.add("painting.excessive_building.the_lone_tree.title", "The Lone Tree");
        builder.add("painting.excessive_building.thine_holy_peanut.title", "Thine Holy Peanut");
        builder.add("painting.excessive_building.why_do_my_eyes_hurt.title", "Bleeding Eclipse");
        builder.add("painting.excessive_building.evil_eye.title", "Evil Eye");
        builder.add("painting.excessive_building.rebellious.title", "Rebellious");
        builder.add("painting.excessive_building.catastrophes_before_the_calamity.title", "Catastrophes Before the Calamity");

        //PAINTING AUTHORS
        builder.add("painting.excessive_building.forgotten_kingdom.author", "Yirmiri");
        builder.add("painting.excessive_building.beacon_of_the_desert.author", "Brickerman");
        builder.add("painting.excessive_building.beacon_of_the_desert_trimmed.author", "Brickerman");
        builder.add("painting.excessive_building.burrito.author", "Drisfish");
        builder.add("painting.excessive_building.courbet_original.author", "Kristoffer Zetterstrand");
        builder.add("painting.excessive_building.crash_landing.author", "BackupCup");
        builder.add("painting.excessive_building.fit_for_a_queen.author", "Yirmiri");
        builder.add("painting.excessive_building.floors.author", "Brickerman");
        builder.add("painting.excessive_building.horizon.author", "HaWii");
        builder.add("painting.excessive_building.imminent_detonation.author", "BackupCup");
        builder.add("painting.excessive_building.kolos_bug.author", "Kolos");
        builder.add("painting.excessive_building.lone_bridge.author", "Nebula");
        builder.add("painting.excessive_building.long_trips.author", "SmillyScarfs");
        builder.add("painting.excessive_building.paleobotany.author", "Hecco");
        builder.add("painting.excessive_building.pufferlight.author", "Pepagg");
        builder.add("painting.excessive_building.scourge_bringer.author", "BackupCup");
        builder.add("painting.excessive_building.sniffing_in_the_pine_forest.author", "Brickerman");
        builder.add("painting.excessive_building.stage_original.author", "Kristoffer Zetterstrand");
        builder.add("painting.excessive_building.the_end.author", "BackupCup");
        builder.add("painting.excessive_building.the_lone_tree.author", "SuperMightByte");
        builder.add("painting.excessive_building.thine_holy_peanut.author", "YesMan2");
        builder.add("painting.excessive_building.why_do_my_eyes_hurt.author", "BackupCup");
        builder.add("painting.excessive_building.evil_eye.author", "Yirmiri");
        builder.add("painting.excessive_building.rebellious.author", "Rebel (the dog)");
        builder.add("painting.excessive_building.catastrophes_before_the_calamity.author", "BackupCup");
    }
}
