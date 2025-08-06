package net.yirmiri.excessive_building.common.item;

import net.minecraft.network.chat.TextColor;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class RadianceMalletItem extends DiggerItem {
    public RadianceMalletItem(float attackDamageModifier, float attackSpeedModifier, Tier tier, TagKey<Block> blocks, Properties properties) {
        super(attackDamageModifier, attackSpeedModifier, tier, blocks, properties);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return TextColor.fromRgb(0xfc52dd).getValue();
    }
}
