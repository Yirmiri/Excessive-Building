package net.yirmiri.excessive_building.util;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum EBToolMaterials implements ToolMaterial {
    HAMMER(EBTags.Blocks.INCORRECT_FOR_HAMMER_TOOL, 781, 6.0F, 2.0F, 12, () -> Ingredient.fromTag(EBTags.Items.HAMMER_REPAIRABLE));

    private final TagKey<Block> inverseTag;
    private final int durability;
    private final float speed;
    private final float dmg;
    private final int enchant;
    private final Supplier<Ingredient> repair;

    EBToolMaterials(final TagKey<Block> inverseTag, final int durability, final float speed, final float dmg, final int enchant, final Supplier<Ingredient> repair) {
        this.inverseTag = inverseTag;
        this.durability = durability;
        this.speed = speed;
        this.dmg = dmg;
        this.enchant = enchant;
        this.repair = Suppliers.memoize(repair::get);
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return speed;
    }

    @Override
    public float getAttackDamage() {
        return dmg;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return enchant;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repair.get();
    }
}
