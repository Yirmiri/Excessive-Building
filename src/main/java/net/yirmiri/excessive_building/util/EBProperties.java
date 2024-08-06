package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.GlowingLeavesBlock;
import net.yirmiri.excessive_building.block.ParticleCandleBlock;
import net.yirmiri.excessive_building.registry.EBSounds;
import net.yirmiri.excessive_building.registry.EBStatusEffects;

public class EBProperties {
    public static class BlockP {
        //VANILLA ADDITIONS
        public static final Block.Settings QUARTZ_BRICKS = FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS);

        //WOODS
        public static final Block.Settings GENERIC_WOOD = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD);
        public static final Block.Settings CHERRY_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD);
        public static final Block.Settings BAMBOO_WOOD = FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).sounds(BlockSoundGroup.BAMBOO_WOOD);
        public static final Block.Settings CRIMSON_WOOD = FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD);
        public static final Block.Settings WARPED_WOOD = FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD);
        public static final Block.Settings ANCIENT_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.CHERRY_WOOD);
        public static final Block.Settings GLOOM_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.RAW_IRON_PINK).sounds(BlockSoundGroup.CHERRY_WOOD);

        //DOORS
        public static final Block.Settings ANCIENT_DOOR = FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).mapColor(MapColor.RAW_IRON_PINK).sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque();
        public static final Block.Settings ANCIENT_TRAPDOOR = FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.RAW_IRON_PINK).sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque();
        public static final Block.Settings GLOOM_DOOR = FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).mapColor(MapColor.RAW_IRON_PINK).sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque();
        public static final Block.Settings GLOOM_TRAPDOOR = FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.RAW_IRON_PINK).sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque();

        //BOOKSHELVES
        public static final Block.Settings GENERIC_SHELF = FabricBlockSettings.copyOf(Blocks.BOOKSHELF).sounds(BlockSoundGroup.WOOD);
        public static final Block.Settings CHERRY_SHELF = FabricBlockSettings.copyOf(Blocks.BOOKSHELF).sounds(BlockSoundGroup.CHERRY_WOOD);
        public static final Block.Settings BAMBOO_SHELF = FabricBlockSettings.copyOf(Blocks.BOOKSHELF).sounds(BlockSoundGroup.BAMBOO_WOOD);
        public static final Block.Settings CRIMSON_SHELF = FabricBlockSettings.copyOf(Blocks.BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD);
        public static final Block.Settings WARPED_SHELF = FabricBlockSettings.copyOf(Blocks.BOOKSHELF).sounds(BlockSoundGroup.NETHER_WOOD);

        //LADDERS
        public static final Block.Settings GENERIC_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER);
        public static final Block.Settings CHERRY_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER);
        public static final Block.Settings BAMBOO_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER);
        public static final Block.Settings CRIMSON_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER);
        public static final Block.Settings WARPED_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER);
        public static final Block.Settings ANCIENT_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER).mapColor(MapColor.TERRACOTTA_WHITE);
        public static final Block.Settings GLOOM_LADDER = FabricBlockSettings.copyOf(Blocks.LADDER).sounds(BlockSoundGroup.LADDER).mapColor(MapColor.RAW_IRON_PINK);

        //STONES
        public static final Block.Settings COBBLESTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLESTONE).sounds(EBSounds.COBBLED_BRICKS);
        public static final Block.Settings COBBLED_DEEPSLATE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).sounds(EBSounds.COBBLED_BRICKS);
        public static final Block.Settings BLACKSTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.BLACKSTONE).sounds(EBSounds.COBBLED_BRICKS);
        public static final Block.Settings SMOOTH_STONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE);
        public static final Block.Settings TUFF_TILES = FabricBlockSettings.copyOf(Blocks.TUFF_BRICKS);
        public static final Block.Settings ALMENTRA = FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.PACKED_MUD);
        public static final Block.Settings ALMENTRA_BRICKS = FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.MUD_BRICKS);

        //NATURE
        public static final Block.Settings GLOWING_LEAVES = FabricBlockSettings.of().luminance(state -> GlowingLeavesBlock.isGlowing(state) ? 8 : 0).mapColor(MapColor.RED).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.CHERRY_LEAVES).nonOpaque().allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never);
        public static final Block.Settings GLOWING_SAPLING = FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).luminance(state -> 5);
        public static final Block.Settings GLOOM_SEEDS = FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).sounds(BlockSoundGroup.ROOTS);
        public static final Block.Settings GLOOM_LEAVES = FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES);
        public static final Block.Settings GLOOM_SAPLING = FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING);

        //SEA GLASS
        public static final Block.Settings SEA_GLASS = FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque();

        //NATURE
        public static final Block.Settings ROSE = FabricBlockSettings.copyOf(Blocks.POPPY).mapColor(MapColor.RED);
        public static final Block.Settings CYAN_ROSE = FabricBlockSettings.copyOf(Blocks.POPPY).mapColor(MapColor.CYAN);
        public static final Block.Settings WHITE_ROSE = FabricBlockSettings.copyOf(Blocks.POPPY).mapColor(MapColor.WHITE);
        public static final Block.Settings MOSS_PASTE = FabricBlockSettings.copyOf(Blocks.GLOW_LICHEN).mapColor(MapColor.GREEN).sounds(BlockSoundGroup.AZALEA_LEAVES).lightLevel(0);

        //RESOURCES
        public static final Block.Settings GOLD = FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK);
        public static final Block.Settings IRON = FabricBlockSettings.copyOf(Blocks.IRON_BLOCK);
        public static final Block.Settings EMERALD = FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK);
        public static final Block.Settings LAPIS = FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK);
        public static final Block.Settings DIAMOND = FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK);
        public static final Block.Settings NETHERITE = FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK);
        public static final Block.Settings REDSTONE = FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK);

        //COPPERS
        public static final Block.Settings COPPER = FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK);
        public static final Block.Settings EXPOSED_COPPER = FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER);
        public static final Block.Settings WEATHERED_COPPER = FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER);
        public static final Block.Settings OXIDIZED_COPPER = FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER);
        public static final Block.Settings COPPER_BUTTON = FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
        public static final Block.Settings COPPER_PRESSURE_PLATE = FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);

        //POLISHED SANDSTONES
        public static final Block.Settings POLISHED_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE);
        public static final Block.Settings POLISHED_RED_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE);

        //SOULS
        public static final Block.Settings SOUL_MAGMA = FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK).mapColor(MapColor.BROWN);
        public static final Block.Settings SOUL_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.BROWN);
        public static final Block.Settings CUT_SOUL_SANDSTONE = FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.BROWN);
        public static final Block.Settings SMOOTH_SOUL_SANDSTONE = FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.BROWN);

        //DECORATIVES
        public static final Block.Settings WOODEN_MUG = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(0.5F).resistance(0F);
        public static final Block.Settings GLASS_JAR = FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.5F).resistance(0F).nonOpaque();
        public static final Block.Settings FIRE_GLASS_JAR = FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.5F).resistance(0F).lightLevel(15).nonOpaque();
        public static final Block.Settings SOUL_FIRE_GLASS_JAR = FabricBlockSettings.copyOf(Blocks.GLASS).strength(0.5F).resistance(0F).lightLevel(7).nonOpaque();

        //STONE VARIANTS
        public static final Block.Settings POLISHED_GRANITE = FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE);
        public static final Block.Settings POLISHED_ANDESITE = FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE);
        public static final Block.Settings POLISHED_DIORITE = FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE);

        //BRIMSTONE
        public static final Block.Settings BRIMSTONE = FabricBlockSettings.copyOf(Blocks.GRANITE).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.RED);
        public static final Block.Settings POLISHED_BRIMSTONE = FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).sounds(BlockSoundGroup.POLISHED_DEEPSLATE).mapColor(MapColor.RED);
        public static final Block.Settings BRIMSTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS).mapColor(MapColor.RED);
        public static final Block.Settings BRIMSTONE_TILES = FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).sounds(BlockSoundGroup.DEEPSLATE_TILES).mapColor(MapColor.RED);
        public static final Block.Settings BRIMSTONE_LAMP = FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).mapColor(MapColor.RED);

        //MISC
        public static final Block.Settings PARTICLE_CANDLE = FabricBlockSettings.copyOf(Blocks.CANDLE).luminance(ParticleCandleBlock.STATE_TO_LUMINANCE);
        public static final Block.Settings MUD_BRICKS = FabricBlockSettings.copyOf(Blocks.MUD_BRICKS);
        public static final Block.Settings IRON_GRATE = FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never);
        public static final Block.Settings GOLD_GRATE = FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never);
        public static final Block.Settings ASPHALT = FabricBlockSettings.copyOf(Blocks.DRIPSTONE_BLOCK);
        public static final Block.Settings REACHING_LANTERN = FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN);
        public static final Block.Settings BRICKS = FabricBlockSettings.copyOf(Blocks.BRICKS);
        public static final Block.Settings BONE = FabricBlockSettings.copyOf(Blocks.BONE_BLOCK);
        public static final Block.Settings INDESTRUCTIBLE = FabricBlockSettings.copyOf(Blocks.BEDROCK);
        public static final Block.Settings TERRACOTTA_POT = FabricBlockSettings.copyOf(Blocks.TERRACOTTA).sounds(BlockSoundGroup.DECORATED_POT_SHATTER);
    }

    public static class ItemP {
        //FOOD
        public static final Item.Settings ANCIENT_FRUIT = new Item.Settings().food(Food.ANCIENT_FRUIT);

        //MISC
        public static final Item.Settings GENERIC = new Item.Settings();
        public static final Item.Settings NETHERITE = new Item.Settings().fireproof();

        public static class Food {
            public static final FoodComponent ANCIENT_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(EBStatusEffects.REACHING, EBConfig.ANCIENT_FRUIT_DURATION.get(), EBConfig.ANCIENT_FRUIT_AMPLIFIER.get()), 1.0F).alwaysEdible().build();
        }
    }
}
