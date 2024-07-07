package net.yirmiri.excessive_building.registry;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.effect.NoSpecialEffect;

public class EBStatusEffects {
    public static final RegistryEntry<StatusEffect> REACHING = register("reaching", new NoSpecialEffect(StatusEffectCategory.BENEFICIAL, 0xc33066).addAttributeModifier(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE, Identifier.of(ExcessiveBuilding.MOD_ID, "effect.reaching"), 1.0, EntityAttributeModifier.Operation.ADD_VALUE));
    public static final RegistryEntry<StatusEffect> SHORTENING = register("shortening", new NoSpecialEffect(StatusEffectCategory.HARMFUL, 0xa62fb4).addAttributeModifier(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE, Identifier.of(ExcessiveBuilding.MOD_ID, "effect.shortening"), -1.0, EntityAttributeModifier.Operation.ADD_VALUE));

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(ExcessiveBuilding.MOD_ID, id), statusEffect);
    }

    public static void registerEBEffects() {
    }
}
