package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class EBProperties {
//0xbca2e9 - RADIANT RARITY COLOR (for the future)

    public static class BlockP {
        //MISC
        public static final BlockBehaviour.Properties INDESTRUCTIBLE = BlockBehaviour.Properties.copy(Blocks.BEDROCK);
        public static final BlockBehaviour.Properties FROSTED_GLASS = BlockBehaviour.Properties.copy(Blocks.GLASS);

        //RADIANCE
        public static final BlockBehaviour.Properties RADIANCE = BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).lightLevel(s -> 5).mapColor(MapColor.COLOR_PURPLE);
        public static final BlockBehaviour.Properties DEEPSLATE_RADIANCE = BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).lightLevel(s -> 5).mapColor(MapColor.COLOR_PURPLE);
        public static final BlockBehaviour.Properties RADIANCE_BLOCK = BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_PURPLE);

        //STONES
        public static final BlockBehaviour.Properties COBBLESTONE = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE);
        public static final BlockBehaviour.Properties POLISHED_GRANITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE);
        public static final BlockBehaviour.Properties POLISHED_ANDESITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE);
        public static final BlockBehaviour.Properties POLISHED_DIORITE = BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE);

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

        //CRYSTALS
        public static final BlockBehaviour.Properties AMETHYST_BRICKS = BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK);
        public static final BlockBehaviour.Properties AMETHYST_GLASS = BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion();
        public static final BlockBehaviour.Properties AMETHYST_LANTERN = BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN);
    }

    public static class ItemP {
        //MISC
        public static final Item.Properties GENERIC = new Item.Properties();
        public static final Item.Properties UNCOMMON = new Item.Properties().rarity(Rarity.UNCOMMON);
        public static final Item.Properties RADIANCE_GAUNTLET = new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1);
    }

    public static class Food {
        //MISC
        public static final FoodProperties NOTHING = new FoodProperties.Builder().alwaysEat().build();
    }
}
