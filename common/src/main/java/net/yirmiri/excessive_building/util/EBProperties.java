package net.yirmiri.excessive_building.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class EBProperties {
    //TODO: Fix broken properties (sounds, effects and some blocks need to be made first)

    public static class BlockP {
        //VANILLA ADDITIONS
        public static final BlockBehaviour.Properties QUARTZ_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS);

        //WOODS
        public static final BlockBehaviour.Properties GENERIC_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOD);
        public static final BlockBehaviour.Properties CHERRY_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD);
        public static final BlockBehaviour.Properties BAMBOO_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).sound(SoundType.BAMBOO_WOOD);
        public static final BlockBehaviour.Properties CRIMSON_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties WARPED_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties ANCIENT_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD);
        public static final BlockBehaviour.Properties GLOOM_WOOD = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.RAW_IRON).sound(SoundType.CHERRY_WOOD);

        //DOORS
        public static final BlockBehaviour.Properties ANCIENT_DOOR = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_DOOR).mapColor(MapColor.RAW_IRON).sound(SoundType.CHERRY_WOOD).noOcclusion();
        public static final BlockBehaviour.Properties ANCIENT_TRAPDOOR = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.RAW_IRON).sound(SoundType.CHERRY_WOOD).noOcclusion();
        public static final BlockBehaviour.Properties GLOOM_DOOR = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_DOOR).mapColor(MapColor.RAW_IRON).sound(SoundType.CHERRY_WOOD).noOcclusion();
        public static final BlockBehaviour.Properties GLOOM_TRAPDOOR = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.RAW_IRON).sound(SoundType.CHERRY_WOOD).noOcclusion();

        //BOOKSHELVES
        public static final BlockBehaviour.Properties GENERIC_SHELF = BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).sound(SoundType.WOOD);
        public static final BlockBehaviour.Properties CHERRY_SHELF = BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).sound(SoundType.CHERRY_WOOD);
        public static final BlockBehaviour.Properties BAMBOO_SHELF = BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).sound(SoundType.BAMBOO_WOOD);
        public static final BlockBehaviour.Properties CRIMSON_SHELF = BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).sound(SoundType.NETHER_WOOD);
        public static final BlockBehaviour.Properties WARPED_SHELF = BlockBehaviour.Properties.ofFullCopy(Blocks.BOOKSHELF).sound(SoundType.NETHER_WOOD);

        //LADDERS
        public static final BlockBehaviour.Properties GENERIC_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER);
        public static final BlockBehaviour.Properties CHERRY_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER);
        public static final BlockBehaviour.Properties BAMBOO_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER);
        public static final BlockBehaviour.Properties CRIMSON_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER);
        public static final BlockBehaviour.Properties WARPED_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER);
        public static final BlockBehaviour.Properties ANCIENT_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER).mapColor(MapColor.TERRACOTTA_WHITE);
        public static final BlockBehaviour.Properties GLOOM_LADDER = BlockBehaviour.Properties.ofFullCopy(Blocks.LADDER).sound(SoundType.LADDER).mapColor(MapColor.RAW_IRON);

        //STONES
        //public static final BlockBehaviour.Properties COBBLESTONE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).sound(EBSounds.COBBLED_BRICKS);
        //public static final BlockBehaviour.Properties COBBLED_DEEPSLATE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).sound(EBSounds.COBBLED_BRICKS);
        //public static final BlockBehaviour.Properties BLACKSTONE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).sound(EBSounds.COBBLED_BRICKS);
        public static final BlockBehaviour.Properties SMOOTH_STONE = BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE);
        public static final BlockBehaviour.Properties ALMENTRA = BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.COLOR_BROWN);
        public static final BlockBehaviour.Properties ALMENTRA_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS).mapColor(MapColor.COLOR_BROWN);

        //NATURE
        //public static final BlockBehaviour.Properties GLOWING_LEAVES = BlockBehaviour.Properties.of().lightLevel(state -> GlowingLeavesBlock.isGlowing(state) ? 8 : 0).mapColor(MapColor.COLOR_RED).strength(0.2F).randomTicks().sound(SoundType.CHERRY_LEAVES).noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(Blocks::never).isViewBlocking(Blocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor(Blocks::never);
        public static final BlockBehaviour.Properties GLOWING_SAPLING = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING).lightLevel(state -> 5);
        public static final BlockBehaviour.Properties GLOOM_SEEDS = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING).sound(SoundType.ROOTS);
        public static final BlockBehaviour.Properties GLOOM_LEAVES = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES);
        public static final BlockBehaviour.Properties GLOOM_SAPLING = BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING);

        //SEA GLASS
        public static final BlockBehaviour.Properties SEA_GLASS = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).noOcclusion();

        //NATURE
        public static final BlockBehaviour.Properties ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.COLOR_RED);
        public static final BlockBehaviour.Properties CYAN_ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.COLOR_CYAN);
        public static final BlockBehaviour.Properties WHITE_ROSE = BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.SNOW);
        public static final BlockBehaviour.Properties MOSS_PASTE = BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AZALEA_LEAVES);

        //RESOURCES
        public static final BlockBehaviour.Properties GOLD = BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK);
        public static final BlockBehaviour.Properties IRON = BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK);
        public static final BlockBehaviour.Properties EMERALD = BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK);
        public static final BlockBehaviour.Properties LAPIS = BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK);
        public static final BlockBehaviour.Properties DIAMOND = BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK);
        public static final BlockBehaviour.Properties NETHERITE = BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK);
        public static final BlockBehaviour.Properties REDSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK);

        //COPPERS
        public static final BlockBehaviour.Properties COPPER = BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK);
        public static final BlockBehaviour.Properties EXPOSED_COPPER = BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER);
        public static final BlockBehaviour.Properties WEATHERED_COPPER = BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER);
        public static final BlockBehaviour.Properties OXIDIZED_COPPER = BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER);

        //POLISHED SANDSTONES
        public static final BlockBehaviour.Properties POLISHED_SANDSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE);
        public static final BlockBehaviour.Properties POLISHED_RED_SANDSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE);

        //SOULS
        public static final BlockBehaviour.Properties SOUL_MAGMA = BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK).mapColor(MapColor.COLOR_BROWN);
        public static final BlockBehaviour.Properties SOUL_SANDSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).mapColor(MapColor.COLOR_BROWN);
        public static final BlockBehaviour.Properties CUT_SOUL_SANDSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE).mapColor(MapColor.COLOR_BROWN);
        public static final BlockBehaviour.Properties SMOOTH_SOUL_SANDSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.COLOR_BROWN);

        //DECORATIVES
        public static final BlockBehaviour.Properties WOODEN_MUG = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(0.5F).explosionResistance(0F);
        public static final BlockBehaviour.Properties GLASS_JAR = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).strength(0.5F).explosionResistance(0F).noOcclusion();
        public static final BlockBehaviour.Properties FIRE_GLASS_JAR = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).strength(0.5F).explosionResistance(0F).lightLevel(state -> 15).noOcclusion();
        public static final BlockBehaviour.Properties SOUL_FIRE_GLASS_JAR = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).strength(0.5F).explosionResistance(0F).lightLevel(state -> 7).noOcclusion();

        //STONE VARIANTS
        public static final BlockBehaviour.Properties POLISHED_GRANITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE);
        public static final BlockBehaviour.Properties POLISHED_ANDESITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE);
        public static final BlockBehaviour.Properties POLISHED_DIORITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE);

        //BRIMSTONE
        public static final BlockBehaviour.Properties BRIMSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE).sound(SoundType.DRIPSTONE_BLOCK).mapColor(MapColor.COLOR_RED);
        public static final BlockBehaviour.Properties POLISHED_BRIMSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).sound(SoundType.POLISHED_DEEPSLATE).mapColor(MapColor.COLOR_RED);
        public static final BlockBehaviour.Properties BRIMSTONE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).sound(SoundType.DEEPSLATE_BRICKS).mapColor(MapColor.COLOR_RED);
        public static final BlockBehaviour.Properties BRIMSTONE_TILES = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE).sound(SoundType.DEEPSLATE_TILES).mapColor(MapColor.COLOR_RED);
        public static final BlockBehaviour.Properties BRIMSTONE_LAMP = BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN).mapColor(MapColor.COLOR_RED);

        //MISC
        //public static final BlockBehaviour.Properties PARTICLE_CANDLE = BlockBehaviour.Properties.ofFullCopy(Blocks.CANDLE).lightLevel(ParticleCandleBlock.STATE_TO_LUMINANCE);
        public static final BlockBehaviour.Properties MUD_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS);
        public static final BlockBehaviour.Properties ASPHALT = BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK);
        public static final BlockBehaviour.Properties REACHING_LANTERN = BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN);
        public static final BlockBehaviour.Properties BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS);
        public static final BlockBehaviour.Properties BONE = BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK);
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK);
        public static final BlockBehaviour.Properties TERRACOTTA_POT = BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA).sound(SoundType.DECORATED_POT_CRACKED);
        public static final BlockBehaviour.Properties PAPER = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.WOOL);
        public static final BlockBehaviour.Properties LAMP = BlockBehaviour.Properties.ofFullCopy(Blocks.SEA_LANTERN);
    }

    public static class ItemP {
        //FOOD
        //public static final Item.Properties ANCIENT_FRUIT = new Item.Properties().food(Food.ANCIENT_FRUIT);

        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties NETHERITE = new Item.Properties().fireResistant();

        public static class Food {
            //public static final FoodProperties ANCIENT_FRUIT = new FoodProperties.Builder().nutrition(4).saturationMod(0.8F).alwaysEat()
                    //.effect(new MobEffectInstance(MobEffects.DIG_SPEED, EBConfig.ANCIENT_FRUIT_DURATION.get(),
                            //EBConfig.ANCIENT_FRUIT_AMPLIFIER.get()), 1.0F).build();
        }
    }
}
