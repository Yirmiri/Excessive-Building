package net.yirmiri.excessive_building.item;

import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBClientConfig;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.util.EBTags;

import java.util.List;

public class HammerItem extends MiningToolItem {
    public static final Identifier BASE_ATTACK_DAMAGE_MODIFIER_ID = Identifier.ofVanilla("base_attack_damage");
    public static final Identifier BASE_ATTACK_SPEED_MODIFIER_ID = Identifier.ofVanilla("base_attack_speed");
    public static final Identifier BASE_ENTITY_INTERACTION_MODIFIER_ID = Identifier.ofVanilla("base_entity_interaction");
    public static final Identifier BASE_KNOCKBACK_MODIFIER_ID = Identifier.ofVanilla("base_knockback");

    public HammerItem(ToolMaterial material, Item.Settings settings) {
        super(material, EBTags.Blocks.HAMMER_MINEABLE, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        if (EBClientConfig.ENABLE_CUSTOM_TOOLTIPS.get() && EBConfig.ENABLE_HAMMERS.get()) {
            super.appendTooltip(stack, context, tooltip, options);
            tooltip.add(ScreenTexts.EMPTY);
            tooltip.add(Text.translatable("tooltip.block.interact").formatted(Formatting.GRAY));
            tooltip.add(ScreenTexts.space().append(Text.translatable("tooltip.item.hammer.desc").formatted(Formatting.BLUE)));
        }
    }

    public static AttributeModifiersComponent createAttributeModifiers() {
        float damage = 6.0F;
        float atk_speed = -3.4F;
        float atk_reach = -1.5F;
        float atk_kb = 1.5F;
        return AttributeModifiersComponent.builder().add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, damage, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
               .add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, atk_speed, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
               .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier(BASE_KNOCKBACK_MODIFIER_ID, atk_kb, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
               .add(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(BASE_ENTITY_INTERACTION_MODIFIER_ID, atk_reach, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build();

    }

    public int getEnchantability() {
        return 10;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isIn(EBTags.Items.HAMMER_REPAIRABLE);
    }

    @Override
    public boolean isEnabled(FeatureSet enable) {
        return EBConfig.ENABLE_HAMMERS.get();
    }
}
