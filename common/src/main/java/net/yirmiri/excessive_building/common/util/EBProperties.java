package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CaveVines;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.ToIntFunction;

public class EBProperties {
    public static class BlockP {
        private static ToIntFunction<BlockState> litBlockEmission(int defaultVal, int lightValue) {
            return (state) -> (Boolean)state.getValue(BlockStateProperties.LIT) ? lightValue : defaultVal;
        }

        //MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.copy(Blocks.BEDROCK);
        public static final BlockBehaviour.Properties FROSTED_GLASS = BlockBehaviour.Properties.copy(Blocks.GLASS);
        public static final BlockBehaviour.Properties KILN = BlockBehaviour.Properties.copy(Blocks.FURNACE).lightLevel(litBlockEmission(3, 13));
        public static final BlockBehaviour.Properties ICE = BlockBehaviour.Properties.copy(Blocks.ICE);
        public static final BlockBehaviour.Properties ZEUS = BlockBehaviour.Properties.copy(Blocks.STONE).strength(6.0F, 12.0F).mapColor(MapColor.COLOR_PURPLE);

        //WOOD
        public static final BlockBehaviour.Properties LOG = BlockBehaviour.Properties.copy(Blocks.OAK_LOG);
        public static final BlockBehaviour.Properties PLANKS = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
        public static final BlockBehaviour.Properties FENCE = BlockBehaviour.Properties.copy(Blocks.OAK_FENCE);
        public static final BlockBehaviour.Properties GATE = BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE);
        public static final BlockBehaviour.Properties PLATE = BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE);
        public static final BlockBehaviour.Properties BUTTON = BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON);
        public static final BlockBehaviour.Properties LEAVES = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
        public static final BlockBehaviour.Properties GLOW_LEAVES = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).lightLevel(s -> 7);
        public static final BlockBehaviour.Properties GLOW_SAPLING = BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).lightLevel(s -> 3);
        public static final BlockBehaviour.Properties GLOW_SAPLING_POT = BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).lightLevel(s -> 3);
        public static final BlockBehaviour.Properties HANG_VINES = BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().lightLevel(CaveVines.emission(14)).instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY);
        public static final BlockBehaviour.Properties BOOKSHELF = BlockBehaviour.Properties.copy(Blocks.BOOKSHELF);
        public static final BlockBehaviour.Properties ANCIENT_VINES = BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES).lightLevel(s -> 5);
        public static final BlockBehaviour.Properties ANCIENT_VINES_PLANT = BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT).lightLevel(s -> 5);

        //STONES
        public static final BlockBehaviour.Properties COBBLESTONE = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE);
        public static final BlockBehaviour.Properties POLISHED_GRANITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE);
        public static final BlockBehaviour.Properties POLISHED_ANDESITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE);
        public static final BlockBehaviour.Properties POLISHED_DIORITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE);
        public static final BlockBehaviour.Properties PRISMARINE = BlockBehaviour.Properties.copy(Blocks.PRISMARINE);
        public static final BlockBehaviour.Properties DARK_PRISMARINE = BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE);

        public static final BlockBehaviour.Properties ELYERIUM = BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(6.0F, 12.0F);
        public static final BlockBehaviour.Properties POLISHED_ELYERIUM = BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).strength(6.0F, 12.0F);
        public static final BlockBehaviour.Properties ELYERIUM_BRICKS = BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).strength(6.0F, 12.0F);

        public static final BlockBehaviour.Properties HECTALITE = BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(3.0F, 6.0F);
        public static final BlockBehaviour.Properties POLISHED_HECTALITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).strength(3.0F, 6.0F);
        public static final BlockBehaviour.Properties HECTALITE_BRICKS = BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).strength(3.0F, 6.0F);

        public static final BlockBehaviour.Properties CHLOROSLATE = BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(1.0F, 3.0F);
        public static final BlockBehaviour.Properties POLISHED_CHLOROSLATE = BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).strength(1.0F, 3.0F);
        public static final BlockBehaviour.Properties CHLOROSLATE_BRICKS = BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE).strength(1.0F, 3.0F);

        public static final BlockBehaviour.Properties ARIDITE = BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F);
        public static final BlockBehaviour.Properties POLISHED_ARIDITE = BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F);
        public static final BlockBehaviour.Properties ARIDITE_BRICKS = BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F);

        //METALS
        public static final BlockBehaviour.Properties COPPER = BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK);
        public static final BlockBehaviour.Properties EXPOSED_COPPER = BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER);
        public static final BlockBehaviour.Properties WEATHERED_COPPER = BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER);
        public static final BlockBehaviour.Properties OXIDIZED_COPPER = BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER);

        //CRYSTALS
        public static final BlockBehaviour.Properties AMETHYST_BRICKS = BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK);
        public static final BlockBehaviour.Properties CRYSTAL_GLASS = BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion();
        public static final BlockBehaviour.Properties CRYSTAL_LANTERN = BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties UNCOMMON = new Item.Properties().rarity(Rarity.UNCOMMON);
        public static final Item.Properties RARE = new Item.Properties().rarity(Rarity.RARE);
        public static final Item.Properties EPIC = new Item.Properties().rarity(Rarity.EPIC);
        public static final Item.Properties AMETHYST_TOOL = new Item.Properties().stacksTo(1);
        public static final Item.Properties ANCIENT = new Item.Properties().food(FoodP.ANCIENT_FRUIT);
    }

    public static class FoodP {
        //MISC
        public static final FoodProperties ANCIENT_FRUIT = new FoodProperties.Builder().nutrition(4).saturationMod(0.2F)
                .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 0), 1.0F).build();
    }
}
