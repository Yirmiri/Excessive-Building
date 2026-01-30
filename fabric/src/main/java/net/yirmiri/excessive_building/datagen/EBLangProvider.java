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

        build.add(EBBlocks.PEBBLESTONE.get(), "Pebblestone");
        build.add(EBBlocks.CONGLOMERATE.get(), "Conglomerate");
        build.add(EBBlocks.CONGLOMERATE_STAIRS.get(), "Conglomerate Stairs");
        build.add(EBBlocks.CONGLOMERATE_SLAB.get(), "Conglomerate Slab");
        build.add(EBBlocks.CONGLOMERATE_WALL.get(), "Conglomerate Wall");
        build.add(EBBlocks.CONGLOMERATE_BRICKS.get(), "Conglomerate Bricks");
        build.add(EBBlocks.CONGLOMERATE_BRICK_STAIRS.get(), "Conglomerate Brick Stairs");
        build.add(EBBlocks.CONGLOMERATE_BRICK_SLAB.get(), "Conglomerate Brick Slab");
        build.add(EBBlocks.CONGLOMERATE_BRICK_WALL.get(), "Conglomerate Brick Wall");
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
