package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class EBMaterials {
    public static final Tier RADIANCE = new Tier() {
        public int getLevel() {
            return 4;
        }

        public int getUses() {
            return 3591;
        }

        public float getSpeed() {
            return 7.0F;
        }

        public float getAttackDamageBonus() {
            return 2.5F;
        }

        public int getEnchantmentValue() {
            return 20;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(EBItems.RADIANCE_POWERCELL.get());
        }
    };

    public EBMaterials() {
    }
}
