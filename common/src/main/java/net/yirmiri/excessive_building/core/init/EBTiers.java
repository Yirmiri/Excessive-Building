package net.yirmiri.excessive_building.core.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class EBTiers {
    public static final Tier GAUNTLET = new Tier() {
        @Override
        public int getUses() {
            return 781;
        }

        @Override
        public float getSpeed() {
            return 1.5F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2.0F;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
        }

        @Override
        public int getEnchantmentValue() {
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(EBItems.ANCIENT_FRUIT.get());
        }
    };

    public static final Tier MALLET = new Tier() {
        @Override
        public int getUses() {
            return 781;
        }

        @Override
        public float getSpeed() {
            return 2.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 0.5F;
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
        }

        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.AMETHYST_SHARD);
        }
    };

    public EBTiers() {
    }
}