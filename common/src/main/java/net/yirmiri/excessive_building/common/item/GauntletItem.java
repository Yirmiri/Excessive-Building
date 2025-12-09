package net.yirmiri.excessive_building.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;

public class GauntletItem extends DiggerItem {
    public GauntletItem(float attackDamageModifier, float attackSpeedModifier, Tier tier, TagKey<Block> blocks, Properties properties) {
        super(attackDamageModifier, attackSpeedModifier, tier, blocks, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag ctx) {
        super.appendHoverText(stack, level, tooltip, ctx);
        tooltip.add(CommonComponents.EMPTY);
        tooltip.add(Component.translatable("item.excessive_building.hand").withStyle(ChatFormatting.GRAY));
        tooltip.add(CommonComponents.space().append(Component.translatable("item.excessive_building.gauntlet.desc").withStyle(ChatFormatting.BLUE)));
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
