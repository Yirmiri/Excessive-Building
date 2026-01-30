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
        }

        //MISC
        build.add("itemgroup.excessive_building", "Excessive Building");
        build.add("item.excessive_building.hand", "When in Any Hand:");
        build.add("item.excessive_building.gauntlet.desc", "Reduces the delay of placing blocks");

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

        build.add(EBBlocks.CORALSOIL.get(), "Coralsoil");
        build.add(EBBlocks.CORALSOIL_BRICKS.get(), "Coralsoil Bricks");
        build.add(EBBlocks.CORALSOIL_BRICK_STAIRS.get(), "Coralsoil Brick Stairs");
        build.add(EBBlocks.CORALSOIL_BRICK_SLAB.get(), "Coralsoil Brick Slab");
        build.add(EBBlocks.CORALSOIL_BRICK_WALL.get(), "Coralsoil Brick Wall");

        build.add(EBBlocks.LAVENDER_BLOCK.get(), "Lavender Bale");
        build.add(EBBlocks.LAVENDER.get(), "Lavender");
        build.add(EBBlocks.LAVENDER_CLAY.get(), "Lavender Clay");
        build.add(EBBlocks.MOSSY_LAVENDER_BRICKS.get(), "Mossy Lavender Bricks");
        build.add(EBBlocks.LAVENDER_BRICKS.get(), "Lavender Bricks");
        build.add(EBBlocks.LAVENDER_BRICK_STAIRS.get(), "Lavender Brick Stairs");
        build.add(EBBlocks.LAVENDER_BRICK_SLAB.get(), "Lavender Brick Slab");
        build.add(EBBlocks.LAVENDER_BRICK_WALL.get(), "Lavender Brick Wall");

        build.add(EBBlocks.SAGE_BLOCK.get(), "Sage Bale");
        build.add(EBBlocks.SAGE.get(), "Sage");
        build.add(EBBlocks.SAGE_CLAY.get(), "Sage Clay");
        build.add(EBBlocks.MOSSY_SAGE_BRICKS.get(), "Mossy Sage Bricks");
        build.add(EBBlocks.SAGE_BRICKS.get(), "Sage Bricks");
        build.add(EBBlocks.SAGE_BRICK_STAIRS.get(), "Sage Brick Stairs");
        build.add(EBBlocks.SAGE_BRICK_SLAB.get(), "Sage Brick Slab");
        build.add(EBBlocks.SAGE_BRICK_WALL.get(), "Sage Brick Wall");

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

        //ITEMS
        build.add(EBItems.ANCIENT_BOAT.get(), "Ancient Boat");
        build.add(EBItems.ANCIENT_CHEST_BOAT.get(), "Ancient Chest Boat");
        build.add(EBItems.ANCIENT_SIGN.get(), "Ancient Sign");
        build.add(EBItems.ANCIENT_HANGING_SIGN.get(), "Ancient Hanging Sign");
        build.add(EBItems.ANCIENT_FRUIT.get(), "Ancient Fruit");
        build.add(EBItems.GAUNTLET.get(), "Gauntlet");
        
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
