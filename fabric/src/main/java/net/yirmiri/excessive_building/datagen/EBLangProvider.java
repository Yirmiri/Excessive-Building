package net.yirmiri.excessive_building.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class EBLangProvider extends FabricLanguageProvider {
    public EBLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder build) {
        for (DyeColor colors : DyeColor.values()) {
            String dyeString = StringUtils.capitalize(StringUtils.replace(StringUtils.replace(StringUtils.replace(colors.getName(),
                    "_", " "), "gray", "Gray"), "blue", "Blue"));

            build.add(EBBlocks.getDyedCorrugatedIron(colors.getId()).get(), dyeString + " Corrugated Iron");
            build.add(EBBlocks.getDyedCorrugatedIronStairs(colors.getId()).get(), dyeString + " Corrugated Iron Stairs");
            build.add(EBBlocks.getDyedCorrugatedIronSlab(colors.getId()).get(), dyeString + " Corrugated Iron Slab");
            build.add(EBBlocks.getDyedFrostedGlass(colors.getId()).get(), dyeString + " Stained Frosted Glass");
            build.add(EBBlocks.getDyedFrostedLantern(colors.getId()).get(), dyeString + " Frosted Lantern");
            build.add(EBBlocks.getDyedAlmentra(colors.getId()).get(), dyeString + " Almentra");
            build.add(EBBlocks.getDyedAlmentraStairs(colors.getId()).get(), dyeString + " Almentra Stairs");
            build.add(EBBlocks.getDyedAlmentraSlab(colors.getId()).get(), dyeString + " Almentra Slab");
            build.add(EBBlocks.getDyedAlmentraStatue(colors.getId()).get(), dyeString + " Almentra Statue");
            build.add(EBBlocks.getDyedAlmentraBricks(colors.getId()).get(), dyeString + " Almentra Bricks");
            build.add(EBBlocks.getDyedAlmentraBrickStairs(colors.getId()).get(), dyeString + " Almentra Brick Stairs");
            build.add(EBBlocks.getDyedAlmentraBrickSlab(colors.getId()).get(), dyeString + " Almentra Brick Slab");
            build.add(EBBlocks.getDyedAlmentraBrickWall(colors.getId()).get(), dyeString + " Almentra Brick Wall");
        }

        //MISC
        build.add("itemgroup.excessive_building", "Excessive Building");
        build.add("item.excessive_building.hand", "When in Any Hand:");
        build.add("item.excessive_building.gauntlet.desc", "Reduces the delay of placing blocks");
        build.add("item.excessive_building.magnet.desc", "Broken blocks immediately enter user's inventory");
        build.add("item.excessive_building.magnet.sneak.desc", "Sneaking attracts items to the user");

        //BLOCKS
        build.add(EBBlocks.COPPER_BRICKS.get(), "Copper Bricks");
        build.add(EBBlocks.COPPER_BRICK_STAIRS.get(), "Copper Brick Stairs");
        build.add(EBBlocks.COPPER_BRICK_SLAB.get(), "Copper Brick Slab");

        build.add(EBBlocks.EXPOSED_COPPER_BRICKS.get(), "Exposed Copper Bricks");
        build.add(EBBlocks.EXPOSED_COPPER_BRICK_STAIRS.get(), "Exposed Copper Brick Stairs");
        build.add(EBBlocks.EXPOSED_COPPER_BRICK_SLAB.get(), "Exposed Copper Brick Slab");

        build.add(EBBlocks.WEATHERED_COPPER_BRICKS.get(), "Weathered Copper Bricks");
        build.add(EBBlocks.WEATHERED_COPPER_BRICK_STAIRS.get(), "Weathered Copper Brick Stairs");
        build.add(EBBlocks.WEATHERED_COPPER_BRICK_SLAB.get(), "Weathered Copper Brick Slab");

        build.add(EBBlocks.OXIDIZED_COPPER_BRICKS.get(), "Oxidized Copper Bricks");
        build.add(EBBlocks.OXIDIZED_COPPER_BRICK_STAIRS.get(), "Oxidized Copper Brick Stairs");
        build.add(EBBlocks.OXIDIZED_COPPER_BRICK_SLAB.get(), "Oxidized Copper Brick Slab");

        build.add(EBBlocks.WAXED_COPPER_BRICKS.get(), "Waxed Copper Bricks");
        build.add(EBBlocks.WAXED_COPPER_BRICK_STAIRS.get(), "Waxed Copper Brick Stairs");
        build.add(EBBlocks.WAXED_COPPER_BRICK_SLAB.get(), "Waxed Copper Brick Slab");

        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICKS.get(), "Waxed Exposed Copper Bricks");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_STAIRS.get(), "Waxed Exposed Copper Brick Stairs");
        build.add(EBBlocks.WAXED_EXPOSED_COPPER_BRICK_SLAB.get(), "Waxed Exposed Copper Brick Slab");

        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICKS.get(), "Waxed Weathered Copper Bricks");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_STAIRS.get(), "Waxed Weathered Copper Brick Stairs");
        build.add(EBBlocks.WAXED_WEATHERED_COPPER_BRICK_SLAB.get(), "Waxed Weathered Copper Brick Slab");

        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICKS.get(), "Waxed Oxidized Copper Bricks");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_STAIRS.get(), "Waxed Oxidized Copper Brick Stairs");
        build.add(EBBlocks.WAXED_OXIDIZED_COPPER_BRICK_SLAB.get(), "Waxed Oxidized Copper Brick Slab");

        build.add(EBBlocks.COBBLESTONE_BRICKS.get(), "Cobblestone Bricks");
        build.add(EBBlocks.CRACKED_COBBLESTONE_BRICKS.get(), "Cracked Cobblestone Bricks");
        build.add(EBBlocks.COBBLESTONE_BRICK_STAIRS.get(), "Cobblestone Brick Stairs");
        build.add(EBBlocks.COBBLESTONE_BRICK_SLAB.get(), "Cobblestone Brick Slab");
        build.add(EBBlocks.COBBLESTONE_BRICK_WALL.get(), "Cobblestone Brick Wall");

        build.add(EBBlocks.CORALSOIL_CLAY.get(), "Coralsoil Clay");
        build.add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICKS.get(), "Coralsoil Clay Bricks");
        build.add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_STAIRS.get(), "Coralsoil Clay Brick Stairs");
        build.add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_SLAB.get(), "Coralsoil Clay Brick Slab");
        build.add(EBBlocks.CORALSOIL_HARDENED_CLAY_BRICK_WALL.get(), "Coralsoil Clay Brick Wall");
        build.add(EBBlocks.CORALSOIL_HARDENED_CLAY.get(), "Coralsoil Hardened Clay");
        build.add(EBBlocks.CORALSOIL_GLAZED_CLAY.get(), "Coralsoil Glazed Clay");
        build.add(EBBlocks.CORALSOIL_BRICKS.get(), "Coralsoil Bricks");
        build.add(EBBlocks.CORALSOIL_BRICK_STAIRS.get(), "Coralsoil Brick Stairs");
        build.add(EBBlocks.CORALSOIL_BRICK_SLAB.get(), "Coralsoil Brick Slab");
        build.add(EBBlocks.CORALSOIL_BRICK_WALL.get(), "Coralsoil Brick Wall");
        build.add(EBBlocks.SMOOTH_CORALSOIL_BRICKS.get(), "Smooth Coralsoil Bricks");
        build.add(EBBlocks.SMOOTH_CORALSOIL_BRICK_STAIRS.get(), "Smooth Coralsoil Brick Stairs");
        build.add(EBBlocks.SMOOTH_CORALSOIL_BRICK_SLAB.get(), "Smooth Coralsoil Brick Slab");
        build.add(EBBlocks.SMOOTH_CORALSOIL_BRICK_WALL.get(), "Smooth Coralsoil Brick Wall");

        build.add(EBBlocks.LAVENDER_BLOCK.get(), "Lavender Bale");
        build.add(EBBlocks.LAVENDER.get(), "Lavender");
        build.add(EBBlocks.LAVENDER_CLAY.get(), "Lavender Clay");
        build.add(EBBlocks.MOSSY_LAVENDER_HARDENED_CLAY_BRICKS.get(), "Mossy Lavender Clay Bricks");
        build.add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICKS.get(), "Lavender Clay Bricks");
        build.add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_STAIRS.get(), "Lavender Clay Brick Stairs");
        build.add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_SLAB.get(), "Lavender Clay Brick Slab");
        build.add(EBBlocks.LAVENDER_HARDENED_CLAY_BRICK_WALL.get(), "Lavender Clay Brick Wall");
        build.add(EBBlocks.LAVENDER_HARDENED_CLAY.get(), "Lavender Hardened Clay");
        build.add(EBBlocks.LAVENDER_GLAZED_CLAY.get(), "Lavender Glazed Clay");
        build.add(EBBlocks.LAVENDER_BRICKS.get(), "Lavender Bricks");
        build.add(EBBlocks.LAVENDER_BRICK_STAIRS.get(), "Lavender Brick Stairs");
        build.add(EBBlocks.LAVENDER_BRICK_SLAB.get(), "Lavender Brick Slab");
        build.add(EBBlocks.LAVENDER_BRICK_WALL.get(), "Lavender Brick Wall");
        build.add(EBBlocks.SMOOTH_LAVENDER_BRICKS.get(), "Smooth Lavender Bricks");
        build.add(EBBlocks.SMOOTH_LAVENDER_BRICK_STAIRS.get(), "Smooth Lavender Brick Stairs");
        build.add(EBBlocks.SMOOTH_LAVENDER_BRICK_SLAB.get(), "Smooth Lavender Brick Slab");
        build.add(EBBlocks.SMOOTH_LAVENDER_BRICK_WALL.get(), "Smooth Lavender Brick Wall");

        build.add(EBBlocks.SAGE_BLOCK.get(), "Sage Bale");
        build.add(EBBlocks.SAGE.get(), "Sage");
        build.add(EBBlocks.SAGE_CLAY.get(), "Sage Clay");
        build.add(EBBlocks.MOSSY_SAGE_HARDENED_CLAY_BRICKS.get(), "Mossy Sage Clay Bricks");
        build.add(EBBlocks.SAGE_HARDENED_CLAY_BRICKS.get(), "Sage Clay Bricks");
        build.add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_STAIRS.get(), "Sage Clay Brick Stairs");
        build.add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_SLAB.get(), "Sage Clay Brick Slab");
        build.add(EBBlocks.SAGE_HARDENED_CLAY_BRICK_WALL.get(), "Sage Clay Brick Wall");
        build.add(EBBlocks.SAGE_HARDENED_CLAY.get(), "Sage Hardened Clay");
        build.add(EBBlocks.SAGE_GLAZED_CLAY.get(), "Sage Glazed Clay");
        build.add(EBBlocks.SAGE_BRICKS.get(), "Sage Bricks");
        build.add(EBBlocks.SAGE_BRICK_STAIRS.get(), "Sage Brick Stairs");
        build.add(EBBlocks.SAGE_BRICK_SLAB.get(), "Sage Brick Slab");
        build.add(EBBlocks.SAGE_BRICK_WALL.get(), "Sage Brick Wall");
        build.add(EBBlocks.SMOOTH_SAGE_BRICKS.get(), "Smooth Sage Bricks");
        build.add(EBBlocks.SMOOTH_SAGE_BRICK_STAIRS.get(), "Smooth Sage Brick Stairs");
        build.add(EBBlocks.SMOOTH_SAGE_BRICK_SLAB.get(), "Smooth Sage Brick Slab");
        build.add(EBBlocks.SMOOTH_SAGE_BRICK_WALL.get(), "Smooth Sage Brick Wall");

        build.add(EBBlocks.SMOOTH_BRICKS.get(), "Smooth Bricks");
        build.add(EBBlocks.SMOOTH_BRICK_STAIRS.get(), "Smooth Brick Stairs");
        build.add(EBBlocks.SMOOTH_BRICK_SLAB.get(), "Smooth Brick Slab");
        build.add(EBBlocks.SMOOTH_BRICK_WALL.get(), "Smooth Brick Wall");

        build.add(EBBlocks.FROSTED_LANTERN.get(), "Frosted Lantern");

        build.add(EBBlocks.PEBBLESTONE.get(), "Pebblestone");
        build.add(EBBlocks.CONGLOMERATE.get(), "Conglomerate");
        build.add(EBBlocks.CONGLOMERATE_STAIRS.get(), "Conglomerate Stairs");
        build.add(EBBlocks.CONGLOMERATE_SLAB.get(), "Conglomerate Slab");
        build.add(EBBlocks.CONGLOMERATE_WALL.get(), "Conglomerate Wall");
        build.add(EBBlocks.CONGLOMERATE_BRICKS.get(), "Conglomerate Bricks");
        build.add(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get(), "Conglomerate Brick Stairs");
        build.add(EBBlocks.CONGLOMERATE_BRICK_SLAB.get(), "Conglomerate Brick Slab");
        build.add(EBBlocks.CONGLOMERATE_BRICK_WALL.get(), "Conglomerate Brick Wall");

        build.add(EBBlocks.ANCIENT_SAPLING.get(), "Ancient Sapling");
        build.add(EBBlocks.ANCIENT_LOG.get(), "Ancient Log");
        build.add(EBBlocks.ANCIENT_WOOD.get(), "Ancient Wood");
        build.add(EBBlocks.STRIPPED_ANCIENT_LOG.get(), "Stripped Ancient Log");
        build.add(EBBlocks.STRIPPED_ANCIENT_WOOD.get(), "Stripped Ancient Wood");
        build.add(EBBlocks.ANCIENT_PLANKS.get(), "Ancient Planks");
        build.add(EBBlocks.ANCIENT_STAIRS.get(), "Ancient Stairs");
        build.add(EBBlocks.ANCIENT_SLAB.get(), "Ancient Slab");
        build.add(EBBlocks.ANCIENT_PRESSURE_PLATE.get(), "Ancient Pressure Plate");
        build.add(EBBlocks.ANCIENT_BUTTON.get(), "Ancient Button");
        build.add(EBBlocks.ANCIENT_TRAPDOOR.get(), "Ancient Trapdoor");
        build.add(EBBlocks.ANCIENT_DOOR.get(), "Ancient Door");
        build.add(EBBlocks.ANCIENT_LEAVES.get(), "Ancient Leaves");
        build.add(EBBlocks.ANCIENT_FENCE.get(), "Ancient Fence");
        build.add(EBBlocks.ANCIENT_FENCE_GATE.get(), "Ancient Fence Gate");
        build.add(EBBlocks.ANCIENT_VINES.get(), "Ancient Vines");

        build.add(EBBlocks.WINTERGREEN_SAPLING.get(), "Wintergreen Sapling");
        build.add(EBBlocks.WINTERGREEN_LOG.get(), "Wintergreen Log");
        build.add(EBBlocks.WINTERGREEN_WOOD.get(), "Wintergreen Wood");
        build.add(EBBlocks.STRIPPED_WINTERGREEN_LOG.get(), "Stripped Wintergreen Log");
        build.add(EBBlocks.STRIPPED_WINTERGREEN_WOOD.get(), "Stripped Wintergreen Wood");
        build.add(EBBlocks.WINTERGREEN_PLANKS.get(), "Wintergreen Planks");
        build.add(EBBlocks.WINTERGREEN_STAIRS.get(), "Wintergreen Stairs");
        build.add(EBBlocks.WINTERGREEN_SLAB.get(), "Wintergreen Slab");
        build.add(EBBlocks.WINTERGREEN_PRESSURE_PLATE.get(), "Wintergreen Pressure Plate");
        build.add(EBBlocks.WINTERGREEN_BUTTON.get(), "Wintergreen Button");
        build.add(EBBlocks.WINTERGREEN_TRAPDOOR.get(), "Wintergreen Trapdoor");
        build.add(EBBlocks.WINTERGREEN_DOOR.get(), "Wintergreen Door");
        build.add(EBBlocks.WINTERGREEN_LEAVES.get(), "Wintergreen Leaves");
        build.add(EBBlocks.WINTERGREEN_FENCE.get(), "Wintergreen Fence");
        build.add(EBBlocks.WINTERGREEN_FENCE_GATE.get(), "Wintergreen Fence Gate");

        build.add(EBBlocks.BRIMSTONE.get(), "Brimstone");
        build.add(EBBlocks.BRIMSTONE_STAIRS.get(), "Brimstone Stairs");
        build.add(EBBlocks.BRIMSTONE_SLAB.get(), "Brimstone Slab");
        build.add(EBBlocks.BRIMSTONE_WALL.get(), "Brimstone Wall");

        build.add(EBBlocks.POLISHED_BRIMSTONE.get(), "Polished Brimstone");
        build.add(EBBlocks.POLISHED_BRIMSTONE_STAIRS.get(), "Polished Brimstone Stairs");
        build.add(EBBlocks.POLISHED_BRIMSTONE_SLAB.get(), "Polished Brimstone Slab");

        build.add(EBBlocks.BRIMSTONE_BRICKS.get(), "Brimstone Bricks");
        build.add(EBBlocks.BRIMSTONE_BRICK_STAIRS.get(), "Brimstone Brick Stairs");
        build.add(EBBlocks.BRIMSTONE_BRICK_SLAB.get(), "Brimstone Brick Slab");
        build.add(EBBlocks.BRIMSTONE_BRICK_WALL.get(), "Brimstone Brick Wall");

        build.add(EBBlocks.BRIMSTONE_TILES.get(), "Brimstone Tiles");
        build.add(EBBlocks.BRIMSTONE_TILE_STAIRS.get(), "Brimstone Tile Stairs");
        build.add(EBBlocks.BRIMSTONE_TILE_SLAB.get(), "Brimstone Tile Slab");

        build.add(EBBlocks.BRIMSTONE_LAMP.get(), "Brimstone Lamp");
        build.add(EBBlocks.BRIMSTONE_PILLAR.get(), "Brimstone Pillar");

        build.add(EBBlocks.ANDESITE_BRICKS.get(), "Andesite Bricks");
        build.add(EBBlocks.ANDESITE_BRICK_STAIRS.get(), "Andesite Brick Stairs");
        build.add(EBBlocks.ANDESITE_BRICK_SLAB.get(), "Andesite Brick Slab");
        build.add(EBBlocks.ANDESITE_BRICK_WALL.get(), "Andesite Brick Wall");

        build.add(EBBlocks.GRANITE_BRICKS.get(), "Granite Bricks");
        build.add(EBBlocks.GRANITE_BRICK_STAIRS.get(), "Granite Brick Stairs");
        build.add(EBBlocks.GRANITE_BRICK_SLAB.get(), "Granite Brick Slab");
        build.add(EBBlocks.GRANITE_BRICK_WALL.get(), "Granite Brick Wall");

        build.add(EBBlocks.DIORITE_BRICKS.get(), "Diorite Bricks");
        build.add(EBBlocks.DIORITE_BRICK_STAIRS.get(), "Diorite Brick Stairs");
        build.add(EBBlocks.DIORITE_BRICK_SLAB.get(), "Diorite Brick Slab");
        build.add(EBBlocks.DIORITE_BRICK_WALL.get(), "Diorite Brick Wall");

        build.add(EBBlocks.HECTALITE.get(), "Hectalite");
        build.add(EBBlocks.HECTALITE_STAIRS.get(), "Hectalite Stairs");
        build.add(EBBlocks.HECTALITE_SLAB.get(), "Hectalite Slab");
        build.add(EBBlocks.HECTALITE_WALL.get(), "Hectalite Wall");
        build.add(EBBlocks.POLISHED_HECTALITE.get(), "Polished Hectalite");
        build.add(EBBlocks.POLISHED_HECTALITE_STAIRS.get(), "Polished Hectalite Stairs");
        build.add(EBBlocks.POLISHED_HECTALITE_SLAB.get(), "Polished Hectalite Slab");
        build.add(EBBlocks.POLISHED_HECTALITE_WALL.get(), "Polished Hectalite Wall");
        build.add(EBBlocks.HECTALITE_BRICKS.get(), "Hectalite Bricks");
        build.add(EBBlocks.HECTALITE_BRICK_STAIRS.get(), "Hectalite Brick Stairs");
        build.add(EBBlocks.HECTALITE_BRICK_SLAB.get(), "Hectalite Brick Slab");
        build.add(EBBlocks.HECTALITE_BRICK_WALL.get(), "Hectalite Brick Wall");
        build.add(EBBlocks.CHISELED_HECTALITE.get(), "Chiseled Hectalite");

        build.add(EBBlocks.CHLOROSLATE.get(), "Chloroslate");
        build.add(EBBlocks.CHLOROSLATE_STAIRS.get(), "Chloroslate Stairs");
        build.add(EBBlocks.CHLOROSLATE_SLAB.get(), "Chloroslate Slab");
        build.add(EBBlocks.CHLOROSLATE_WALL.get(), "Chloroslate Wall");
        build.add(EBBlocks.POLISHED_CHLOROSLATE.get(), "Polished Chloroslate");
        build.add(EBBlocks.POLISHED_CHLOROSLATE_STAIRS.get(), "Polished Chloroslate Stairs");
        build.add(EBBlocks.POLISHED_CHLOROSLATE_SLAB.get(), "Polished Chloroslate Slab");
        build.add(EBBlocks.POLISHED_CHLOROSLATE_WALL.get(), "Polished Chloroslate Wall");
        build.add(EBBlocks.CHLOROSLATE_BRICKS.get(), "Chloroslate Bricks");
        build.add(EBBlocks.CHLOROSLATE_BRICK_STAIRS.get(), "Chloroslate Brick Stairs");
        build.add(EBBlocks.CHLOROSLATE_BRICK_SLAB.get(), "Chloroslate Brick Slab");
        build.add(EBBlocks.CHLOROSLATE_BRICK_WALL.get(), "Chloroslate Brick Wall");
        build.add(EBBlocks.CHISELED_CHLOROSLATE.get(), "Chiseled Chloroslate");

        build.add(EBBlocks.ARIDITE.get(), "Aridite");
        build.add(EBBlocks.ARIDITE_STAIRS.get(), "Aridite Stairs");
        build.add(EBBlocks.ARIDITE_SLAB.get(), "Aridite Slab");
        build.add(EBBlocks.ARIDITE_WALL.get(), "Aridite Wall");
        build.add(EBBlocks.POLISHED_ARIDITE.get(), "Polished Aridite");
        build.add(EBBlocks.POLISHED_ARIDITE_STAIRS.get(), "Polished Aridite Stairs");
        build.add(EBBlocks.POLISHED_ARIDITE_SLAB.get(), "Polished Aridite Slab");
        build.add(EBBlocks.POLISHED_ARIDITE_WALL.get(), "Polished Aridite Wall");
        build.add(EBBlocks.ARIDITE_BRICKS.get(), "Aridite Bricks");
        build.add(EBBlocks.ARIDITE_BRICK_STAIRS.get(), "Aridite Brick Stairs");
        build.add(EBBlocks.ARIDITE_BRICK_SLAB.get(), "Aridite Brick Slab");
        build.add(EBBlocks.ARIDITE_BRICK_WALL.get(), "Aridite Brick Wall");
        build.add(EBBlocks.CHISELED_ARIDITE.get(), "Chiseled Aridite");

        build.add(EBBlocks.ARIDITE_PILLAR.get(), "Aridite Pillar");
        build.add(EBBlocks.CHLOROSLATE_PILLAR.get(), "Chloroslate Pillar");
        build.add(EBBlocks.HECTALITE_PILLAR.get(), "Hectalite Pillar");

        build.add(EBBlocks.FROSTED_GLASS.get(), "Frosted Glass");

        build.add(EBBlocks.SITRITE.get(), "Sitrite");
        build.add(EBBlocks.SITRITE_STAIRS.get(), "Sitrite Stairs");
        build.add(EBBlocks.SITRITE_SLAB.get(), "Sitrite Slab");
        build.add(EBBlocks.SITRITE_WALL.get(), "Sitrite Wall");

        build.add(EBBlocks.POLISHED_SITRITE.get(), "Polished Sitrite");
        build.add(EBBlocks.POLISHED_SITRITE_STAIRS.get(), "Polished Sitrite Stairs");
        build.add(EBBlocks.POLISHED_SITRITE_SLAB.get(), "Polished Sitrite Slab");

        build.add(EBBlocks.SITRITE_BRICKS.get(), "Sitrite Bricks");
        build.add(EBBlocks.SITRITE_BRICK_STAIRS.get(), "Sitrite Brick Stairs");
        build.add(EBBlocks.SITRITE_BRICK_SLAB.get(), "Sitrite Brick Slab");
        build.add(EBBlocks.SITRITE_BRICK_WALL.get(), "Sitrite Brick Wall");

        build.add(EBBlocks.SITRITE_TILES.get(), "Sitrite Tiles");
        build.add(EBBlocks.SITRITE_TILE_STAIRS.get(), "Sitrite Tile Stairs");
        build.add(EBBlocks.SITRITE_TILE_SLAB.get(), "Sitrite Tile Slab");

        build.add(EBBlocks.CHISELED_SITRITE.get(), "Chiseled Sitrite");
        build.add(EBBlocks.SITRITE_PILLAR.get(), "Sitrite Pillar");

        build.add(EBBlocks.AMETHYST_BRICKS.get(), "Amethyst Bricks");
        build.add(EBBlocks.AMETHYST_BRICK_STAIRS.get(), "Amethyst Brick Stairs");
        build.add(EBBlocks.AMETHYST_BRICK_SLAB.get(), "Amethyst Brick Slab");
        build.add(EBBlocks.AMETHYST_BRICK_WALL.get(), "Amethyst Brick Wall");
        build.add(EBBlocks.AMETHYST_LAMP.get(), "Amethyst Lamp");
        build.add(EBBlocks.AMETHYST_FRAMED_GLASS.get(), "Amethyst Framed Glass");
        build.add(EBBlocks.AMETHYST_FRAMED_GLASS_PANE.get(), "Amethyst Framed Glass Pane");

        build.add(EBBlocks.ZEUS_EPIC_BLOCK.get(), "Zeus' Epic Block");

        build.add(EBBlocks.ALMENTRA.get(), "Almentra");
        build.add(EBBlocks.ALMENTRA_STAIRS.get(), "Almentra Stairs");
        build.add(EBBlocks.ALMENTRA_SLAB.get(), "Almentra Slab");
        build.add(EBBlocks.ALMENTRA_STATUE.get(), "Almentra Statue");
        
        build.add(EBBlocks.ALMENTRA_BRICKS.get(), "Almentra Bricks");
        build.add(EBBlocks.ALMENTRA_BRICK_STAIRS.get(), "Almentra Brick Stairs");
        build.add(EBBlocks.ALMENTRA_BRICK_SLAB.get(), "Almentra Brick Slab");
        build.add(EBBlocks.ALMENTRA_BRICK_WALL.get(), "Almentra Brick Wall");

        build.add(EBBlocks.EMERALD_BRICKS.get(), "Emerald Bricks");
        build.add(EBBlocks.EMERALD_BRICK_STAIRS.get(), "Emerald Brick Stairs");
        build.add(EBBlocks.EMERALD_BRICK_SLAB.get(), "Emerald Brick Slab");
        build.add(EBBlocks.EMERALD_BRICK_WALL.get(), "Emerald Brick Wall");
        build.add(EBBlocks.EMERALD_LAMP.get(), "Emerald Lamp");
        build.add(EBBlocks.EMERALD_FRAMED_GLASS.get(), "Emerald Framed Glass");
        build.add(EBBlocks.EMERALD_FRAMED_GLASS_PANE.get(), "Emerald Framed Glass Pane");

        build.add(EBBlocks.DIAMOND_BRICKS.get(), "Diamond Bricks");
        build.add(EBBlocks.DIAMOND_BRICK_STAIRS.get(), "Diamond Brick Stairs");
        build.add(EBBlocks.DIAMOND_BRICK_SLAB.get(), "Diamond Brick Slab");
        build.add(EBBlocks.DIAMOND_BRICK_WALL.get(), "Diamond Brick Wall");
        build.add(EBBlocks.DIAMOND_LAMP.get(), "Diamond Lamp");
        build.add(EBBlocks.DIAMOND_FRAMED_GLASS.get(), "Diamond Framed Glass");
        build.add(EBBlocks.DIAMOND_FRAMED_GLASS_PANE.get(), "Diamond Framed Glass Pane");

        build.add(EBBlocks.LAPIS_BRICKS.get(), "Lapis Bricks");
        build.add(EBBlocks.LAPIS_BRICK_STAIRS.get(), "Lapis Brick Stairs");
        build.add(EBBlocks.LAPIS_BRICK_SLAB.get(), "Lapis Brick Slab");
        build.add(EBBlocks.LAPIS_BRICK_WALL.get(), "Lapis Brick Wall");
        build.add(EBBlocks.LAPIS_LAMP.get(), "Lapis Lamp");
        build.add(EBBlocks.LAPIS_FRAMED_GLASS.get(), "Lapis Framed Glass");
        build.add(EBBlocks.LAPIS_FRAMED_GLASS_PANE.get(), "Lapis Framed Glass Pane");

        build.add(EBBlocks.MALACHITE.get(), "Malachite");
        build.add(EBBlocks.MALACHITE_STAIRS.get(), "Malachite Stairs");
        build.add(EBBlocks.MALACHITE_SLAB.get(), "Malachite Slab");
        build.add(EBBlocks.MALACHITE_WALL.get(), "Malachite Wall");

        build.add(EBBlocks.POLISHED_MALACHITE.get(), "Polished Malachite");
        build.add(EBBlocks.POLISHED_MALACHITE_STAIRS.get(), "Polished Malachite Stairs");
        build.add(EBBlocks.POLISHED_MALACHITE_SLAB.get(), "Polished Malachite Slab");

        build.add(EBBlocks.CUT_MALACHITE.get(), "Cut Malachite");
        build.add(EBBlocks.CUT_MALACHITE_STAIRS.get(), "Cut Malachite Stairs");
        build.add(EBBlocks.CUT_MALACHITE_SLAB.get(), "Cut Malachite Slab");
        build.add(EBBlocks.CUT_MALACHITE_WALL.get(), "Cut Malachite Wall");

        build.add(EBBlocks.MALACHITE_BRICKS.get(), "Malachite Bricks");
        build.add(EBBlocks.MALACHITE_BRICK_STAIRS.get(), "Malachite Brick Stairs");
        build.add(EBBlocks.MALACHITE_BRICK_SLAB.get(), "Malachite Brick Slab");
        build.add(EBBlocks.MALACHITE_BRICK_WALL.get(), "Malachite Brick Wall");

        //ITEMS
        build.add(EBItems.ANCIENT_BOAT.get(), "Ancient Boat");
        build.add(EBItems.ANCIENT_CHEST_BOAT.get(), "Ancient Chest Boat");
        build.add(EBItems.ANCIENT_SIGN.get(), "Ancient Sign");
        build.add(EBItems.ANCIENT_HANGING_SIGN.get(), "Ancient Hanging Sign");
        build.add(EBItems.ANCIENT_FRUIT.get(), "Ancient Fruit");
        build.add(EBItems.GAUNTLET.get(), "Gauntlet");
        build.add(EBItems.SAGE_CLAY_BALL.get(), "Sage Clay Ball");
        build.add(EBItems.LAVENDER_CLAY_BALL.get(), "Lavender Clay Ball");
        build.add(EBItems.CORALSOIL_CLAY_BALL.get(), "Coralsoil Clay Ball");
        build.add(EBItems.WINTERGREEN_BOAT.get(), "Wintergreen Boat");
        build.add(EBItems.WINTERGREEN_CHEST_BOAT.get(), "Wintergreen Chest Boat");
        build.add(EBItems.WINTERGREEN_SIGN.get(), "Wintergreen Sign");
        build.add(EBItems.WINTERGREEN_HANGING_SIGN.get(), "Wintergreen Hanging Sign");
        build.add(EBItems.WINTER_BERRIES.get(), "Winter Berries");
        build.add(EBItems.MALLET.get(), "Mallet");
        build.add(EBItems.MAGNET.get(), "Magnet");
        
        //POTIONS
        build.add("effect.excessive_building.reaching", "Reaching");
        build.add("item.minecraft.potion.effect.excessive_building.reaching", "Potion of Reaching");
        build.add("item.minecraft.potion.effect.excessive_building.long_reaching", "Potion of Reaching");
        build.add("item.minecraft.potion.effect.excessive_building.strong_reaching", "Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.excessive_building.reaching", "Splash Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.excessive_building.long_reaching", "Splash Potion of Reaching");
        build.add("item.minecraft.splash_potion.effect.excessive_building.strong_reaching", "Splash Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.excessive_building.reaching", "Lingering Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.excessive_building.long_reaching", "Lingering Potion of Reaching");
        build.add("item.minecraft.lingering_potion.effect.excessive_building.strong_reaching", "Lingering Potion of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.excessive_building.reaching", "Arrow of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.excessive_building.long_reaching", "Arrow of Reaching");
        build.add("item.minecraft.tipped_arrow.effect.excessive_building.strong_reaching", "Arrow of Reaching");
        build.add("effect.excessive_building.reaching.description", "Increases the interaction range for building and breaking of the user.");

        build.add("effect.excessive_building.rapidity", "Rapidity");
        build.add("item.minecraft.potion.effect.excessive_building.rapidity", "Potion of Rapidity");
        build.add("item.minecraft.potion.effect.excessive_building.long_rapidity", "Potion of Rapidity");
        build.add("item.minecraft.potion.effect.excessive_building.strong_rapidity", "Potion of Rapidity");
        build.add("item.minecraft.splash_potion.effect.excessive_building.rapidity", "Splash Potion of Rapidity");
        build.add("item.minecraft.splash_potion.effect.excessive_building.long_rapidity", "Splash Potion of Rapidity");
        build.add("item.minecraft.splash_potion.effect.excessive_building.strong_rapidity", "Splash Potion of Rapidity");
        build.add("item.minecraft.lingering_potion.effect.excessive_building.rapidity", "Lingering Potion of Rapidity");
        build.add("item.minecraft.lingering_potion.effect.excessive_building.long_rapidity", "Lingering Potion of Rapidity");
        build.add("item.minecraft.lingering_potion.effect.excessive_building.strong_rapidity", "Lingering Potion of Rapidity");
        build.add("item.minecraft.tipped_arrow.effect.excessive_building.rapidity", "Arrow of Rapidity");
        build.add("item.minecraft.tipped_arrow.effect.excessive_building.long_rapidity", "Arrow of Rapidity");
        build.add("item.minecraft.tipped_arrow.effect.excessive_building.strong_rapidity", "Arrow of Rapidity");
        build.add("effect.excessive_building.rapidity.description", "Decreases the cooldown between placement of blocks, allowing for faster building.");

        //PAINTING
        build.add("painting.excessive_building.burrito.title", "Burrito(?)");
        build.add("painting.excessive_building.burrito.author", "DriSFiSH(?)");

        build.add("painting.excessive_building.floors.title", "Floors");
        build.add("painting.excessive_building.floors.author", "Brickerman");

        build.add("painting.excessive_building.beacon_of_the_desert.title", "Beacon of the Desert");
        build.add("painting.excessive_building.beacon_of_the_desert.author", "Brickerman");

        build.add("painting.excessive_building.beacon_of_the_desert_trimmed.title", "Beacon of the Desert Trimmed");
        build.add("painting.excessive_building.beacon_of_the_desert_trimmed.author", "Brickerman");

        build.add("painting.excessive_building.forgotten_kingdom.title", "Forgotten Kingdom");
        build.add("painting.excessive_building.forgotten_kingdom.author", "Yirmiri");

        build.add("painting.excessive_building.evil_eye.title", "Evil Eye");
        build.add("painting.excessive_building.evil_eye.author", "Yirmiri");

        build.add("painting.excessive_building.kolos_bug.title", "Kolos Bug");
        build.add("painting.excessive_building.kolos_bug.author", "Kolos");

        build.add("painting.excessive_building.the_lone_tree.title", "The Lone Tree");
        build.add("painting.excessive_building.the_lone_tree.author", "SuperMightByte");

        build.add("painting.excessive_building.lone_bridge.title", "Lone Bridge");
        build.add("painting.excessive_building.lone_bridge.author", "NebulaIsMine");

        build.add("painting.excessive_building.pufferlight.title", "Pufferlight");
        build.add("painting.excessive_building.pufferlight.author", "Pepagg");

        build.add("painting.excessive_building.paleobotany.title", "Paleobotany");
        build.add("painting.excessive_building.paleobotany.author", "Hecco");

        build.add("painting.excessive_building.sniffing_in_the_pine_forest.title", "Sniffing in the Pine Forest");
        build.add("painting.excessive_building.sniffing_in_the_pine_forest.author", "Brickerman");

        build.add("painting.excessive_building.peace_sells_but_whos_crafting.title", "Peace Sells But Who's Crafting?");
        build.add("painting.excessive_building.peace_sells_but_whos_crafting.author", "Brickerman");

        build.add("painting.excessive_building.imminent_detonation.title", "Imminent Detonation");
        build.add("painting.excessive_building.imminent_detonation.author", "BackupCup");

        build.add("painting.excessive_building.scourge_bringer.title", "Scourge Bringer");
        build.add("painting.excessive_building.scourge_bringer.author", "BackupCup");

        build.add("painting.excessive_building.the_end.title", "The End");
        build.add("painting.excessive_building.the_end.author", "BackupCup");

        build.add("painting.excessive_building.why_do_my_eyes_hurt.title", "Why Do My Eyes Hurt");
        build.add("painting.excessive_building.why_do_my_eyes_hurt.author", "BackupCup");

        build.add("painting.excessive_building.crash_landing.title", "Crash Landing");
        build.add("painting.excessive_building.crash_landing.author", "BackupCup");

        build.add("painting.excessive_building.long_trips.title", "Long Trips");
        build.add("painting.excessive_building.long_trips.author", "SmillyBlade (also formerly known as SmillyScarfs until they got hacked!)");

        build.add("painting.excessive_building.catastrophes_before_the_calamity.title", "Catastrophes Before The Calamity");
        build.add("painting.excessive_building.catastrophes_before_the_calamity.author", "BackupCup");
    }

    private void addDamage(TranslationBuilder build, ResourceKey<DamageType> type, String deathMsg, String killMsg) {
        build.add(type.location().toLanguageKey(), deathMsg);
        build.add("death.attack." + type.location().toLanguageKey(), deathMsg);
        build.add("death.attack." + type.location().toLanguageKey() + ".player", killMsg);
    }

    public static void addYT(FabricLanguageProvider.TranslationBuilder build, Block block, String tooltip) {
        build.add("yapping_tooltips." + block.getDescriptionId() + ".desc", tooltip);
    }

    public static void addYT(FabricLanguageProvider.TranslationBuilder build, Supplier<Block> block, String tooltip) {
        build.add("yapping_tooltips." + block.get().getDescriptionId() + ".desc", tooltip);
    }

    public static void addYT(FabricLanguageProvider.TranslationBuilder builder, Item item, String tooltip) {
        builder.add("yapping_tooltips." + item.getDescriptionId() + ".desc", tooltip);
    }
}
