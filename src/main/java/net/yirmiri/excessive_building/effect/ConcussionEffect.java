package net.yirmiri.excessive_building.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.registry.EBStatusEffects;

public class ConcussionEffect extends StatusEffect {
    public ConcussionEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity living, int amplifier) {
        float slownessModifier = 1.0F + (living.getStatusEffect(EBStatusEffects.CONCUSSION)).getDuration() / 10;

        if (living.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED) == null) return false;
        var originalModifier = living.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED)
                .getModifier(Identifier.of(ExcessiveBuilding.MOD_ID, "effect.concussion"));

        if (originalModifier == null) return false;
        var newAttributeModifier = new EntityAttributeModifier(
                originalModifier.id(),
                slownessModifier * (amplifier + 1.0F),
                originalModifier.operation());

        living.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).removeModifier(originalModifier.id());
        living.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).addTemporaryModifier(newAttributeModifier);
        return true;
    }
}
