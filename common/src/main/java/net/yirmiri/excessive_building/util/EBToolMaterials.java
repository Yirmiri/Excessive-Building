package net.yirmiri.excessive_building.util;

import com.google.common.base.Suppliers;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum EBToolMaterials implements Tier {
    HAMMER(EBTags.Blocks.INCORRECT_FOR_HAMMER_TOOL, 781, 6.0F, 2.0F, 12, () -> Ingredient.of(EBTags.Items.HAMMER_REPAIRABLE));

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
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return dmg;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return inverseTag;
    }

    @Override
    public int getEnchantmentValue() {
        return enchant;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repair.get();
    }
}
