package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class EBMaterials {
    public static final Tier GAUNTLET = new Tier() {
        public int getLevel() {
            return 4;
        }

        public int getUses() {
            return 3591;
        }

        public float getSpeed() {
            return 1.5F;
        }

        public float getAttackDamageBonus() {
            return 1.5F;
        }

        public int getEnchantmentValue() {
            return 20;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.AMETHYST_SHARD);
        }
    };

    public static final Tier MALLET = new Tier() {
        public int getLevel() {
            return 4;
        }

        public int getUses() {
            return 781;
        }

        public float getSpeed() {
            return 2.0F;
        }

        public float getAttackDamageBonus() {
            return 1.5F;
        }

        public int getEnchantmentValue() {
            return 20;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.AMETHYST_SHARD);
        }
    };

    public EBMaterials() {
    }
}
