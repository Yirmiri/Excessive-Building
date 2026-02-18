package net.yirmiri.excessive_building.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class GauntletItem extends TieredItem {
    public GauntletItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext ctx, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, ctx, tooltip, flag);
        tooltip.add(CommonComponents.EMPTY);
        tooltip.add(Component.translatable("item.excessive_building.hand").withStyle(ChatFormatting.GRAY));
        tooltip.add(CommonComponents.space().append(Component.translatable("item.excessive_building.gauntlet.desc").withStyle(ChatFormatting.BLUE)));
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    public static ItemAttributeModifiers createAttributes(Tier tier, float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, attackDamage + tier.getAttackDamageBonus(), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ResourceLocation.withDefaultNamespace("base_attack_knockbback"), 1.5, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)

                .add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.withDefaultNamespace("base_bir"),
                        3.0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HAND)
                .build();
    }
}