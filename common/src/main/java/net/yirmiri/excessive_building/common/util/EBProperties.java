package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CaveVines;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.yirmiri.excessive_building.common.item.GauntletItem;
import net.yirmiri.excessive_building.core.init.EBTiers;
import net.yirmiri.excessive_building.core.registry.EBEffects;

import java.util.function.ToIntFunction;

public class EBProperties {
    public static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int lightLevel) {
        return (s) -> (Boolean) s.getValue(BlockStateProperties.LIT) ? lightLevel : 0;
    }

    public static class BlockP {
        //MISC
        public static final BlockBehaviour.Properties FROSTED_GLASS = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS);

        //STONES
        public static final BlockBehaviour.Properties COBBLESTONE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE);
        public static final BlockBehaviour.Properties CONGLOMERATE = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).mapColor(MapColor.TERRACOTTA_WHITE);
        public static final BlockBehaviour.Properties PEBBLESTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.GRAVEL).sound(SoundType.STONE);
        public static final BlockBehaviour.Properties BRIMSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).sound(SoundType.DRIPSTONE_BLOCK);
        public static final BlockBehaviour.Properties POLISHED_BRIMSTONE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE).sound(SoundType.POLISHED_DEEPSLATE);
        public static final BlockBehaviour.Properties BRIMSTONE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).sound(SoundType.POLISHED_DEEPSLATE);
        public static final BlockBehaviour.Properties BRIMSTONE_LAMP = BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE).sound(SoundType.GLASS).lightLevel(createLightLevelFromLitBlockState(12));
        public static final BlockBehaviour.Properties POLISHED_GRANITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE);
        public static final BlockBehaviour.Properties POLISHED_ANDESITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE);
        public static final BlockBehaviour.Properties POLISHED_DIORITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE);
        public static final BlockBehaviour.Properties HECTALITE = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(3.0F, 6.0F);
        public static final BlockBehaviour.Properties POLISHED_HECTALITE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).strength(3.0F, 6.0F);
        public static final BlockBehaviour.Properties HECTALITE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).strength(3.0F, 6.0F);
        public static final BlockBehaviour.Properties CHLOROSLATE = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLED_DEEPSLATE).strength(1.0F, 3.0F);
        public static final BlockBehaviour.Properties POLISHED_CHLOROSLATE = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).strength(1.0F, 3.0F);
        public static final BlockBehaviour.Properties CHLOROSLATE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DEEPSLATE).strength(1.0F, 3.0F);
        public static final BlockBehaviour.Properties ARIDITE = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F);
        public static final BlockBehaviour.Properties POLISHED_ARIDITE = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F);
        public static final BlockBehaviour.Properties ARIDITE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(1.5F, 6.0F);
        public static final BlockBehaviour.Properties SITRITE = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE);

        //METALS
        public static final BlockBehaviour.Properties COPPER = BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK);
        public static final BlockBehaviour.Properties CORRUGATED_IRON = BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK);

        //CLAY
        public static final BlockBehaviour.Properties LAVENDER = BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties POTTED_LAVENDER = BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties LAVENDER_CLAY = BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties LAVENDER_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties LAVENDER_BALE = BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).sound(SoundType.MOSS).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties SAGE = BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties POTTED_SAGE = BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties SAGE_CLAY = BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties SAGE_BRICKS = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties SAGE_BALE = BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).sound(SoundType.MOSS).mapColor(MapColor.COLOR_MAGENTA);
        public static final BlockBehaviour.Properties CORALSOIL_CLAY = BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD).mapColor(MapColor.COLOR_ORANGE);
        public static final BlockBehaviour.Properties CORALSOIL = BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE).mapColor(MapColor.COLOR_ORANGE).sound(SoundType.PACKED_MUD);

        //WOOD
        public static final BlockBehaviour.Properties LOG = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG);
        public static final BlockBehaviour.Properties PLANKS = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS);
        public static final BlockBehaviour.Properties DOOR = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR);
        public static final BlockBehaviour.Properties TRAPDOOR = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR);
        public static final BlockBehaviour.Properties FENCE = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE);
        public static final BlockBehaviour.Properties GATE = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE);
        public static final BlockBehaviour.Properties PLATE = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE);
        public static final BlockBehaviour.Properties BUTTON = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON);
        public static final BlockBehaviour.Properties LEAVES = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES);
        public static final BlockBehaviour.Properties GLOW_LEAVES = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).lightLevel(s -> 7).sound(SoundType.FLOWERING_AZALEA);
        public static final BlockBehaviour.Properties GLOW_SAPLING = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).lightLevel(s -> 3).sound(SoundType.CHERRY_SAPLING);
        public static final BlockBehaviour.Properties GLOW_SAPLING_POT = BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING).lightLevel(s -> 3);
        public static final BlockBehaviour.Properties HANG_VINES = BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().lightLevel(CaveVines.emission(14)).instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY);
        public static final BlockBehaviour.Properties ANCIENT_VINES = BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES).lightLevel(s -> 5).sound(SoundType.CAVE_VINES);
        public static final BlockBehaviour.Properties ANCIENT_VINES_PLANT = BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES_PLANT).lightLevel(s -> 5).sound(SoundType.CAVE_VINES);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties GENERIC_1 = new Item.Properties().stacksTo(1);
        public static final Item.Properties GENERIC_16 = new Item.Properties().stacksTo(16);
        public static final Item.Properties GAUNTLET = new Item.Properties().stacksTo(1).attributes(GauntletItem.createAttributes(EBTiers.GAUNTLET, 1, -2.5F));

        //FOOD
        public static final Item.Properties ANCIENT_FRUIT = new Item.Properties().food(FoodP.ANCIENT_FRUIT);
    }

    public static class FoodP {
        //MISC
        public static final FoodProperties ANCIENT_FRUIT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2F)
                .effect(new MobEffectInstance(EBEffects.REACHING, 200, 0), 1.0F)
                .build();
    }
}
