package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.yirmiri.excessive_building.block.AncientLeavesBlock;

public class EBProperties {
    public static class BlockP {
        //WOOD
        public static final Block.Settings GENERIC_WOOD = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
        public static final Block.Settings CHERRY_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS);
        public static final Block.Settings BAMBOO_WOOD = FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS);
        public static final Block.Settings CRIMSON_WOOD = FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS);
        public static final Block.Settings WARPED_WOOD = FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS);
        public static final Block.Settings ANCIENT_WOOD = FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.TERRACOTTA_WHITE);

        //STONE
        public static final Block.Settings COBBLESTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLESTONE);
        public static final Block.Settings COBBLED_DEEPSLATE_BRICKS = FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE);
        public static final Block.Settings BLACKSTONE_BRICKS = FabricBlockSettings.copyOf(Blocks.BLACKSTONE);

        //NATURE
        public static final Block.Settings ANCIENT_LEAVES = FabricBlockSettings.of().luminance(state -> AncientLeavesBlock.isGlowing(state) ? 0 : 8).mapColor(MapColor.RED).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.CHERRY_LEAVES).nonOpaque().allowsSpawning(Blocks::canSpawnOnLeaves).suffocates(Blocks::never).blockVision(Blocks::never).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never);
        public static final Block.Settings ANCIENT_SAPLING = FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).luminance(state -> 5);

        //MISC
        public static final Block.Settings KILN = FabricBlockSettings.copyOf(Blocks.FURNACE);
        public static final Block.Settings INDESTRUCTIBLE = FabricBlockSettings.copyOf(Blocks.BEDROCK);
    }

    public static class ItemP {
        //FOOD
        public static final Item.Settings ANCIENT_FRUIT = new Item.Settings().food(Food.ANCIENT_FRUIT);

        //MISC
        public static final Item.Settings SIGN = new Item.Settings().maxCount(16);

        public static class Food {
            public static final FoodComponent ANCIENT_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1.0F).alwaysEdible().build();
        }
    }
}
