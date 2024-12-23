package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.effect.NoSpecialEffect;

public class EBStatusEffects {
    public static final Holder<MobEffect> REACHING = register("reaching", new NoSpecialEffect(MobEffectCategory.BENEFICIAL, 0xc33066).addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "effect.reaching"), 1.0, AttributeModifier.Operation.ADD_VALUE));
    public static final Holder<MobEffect> SHORTENING = register("shortening", new NoSpecialEffect(MobEffectCategory.HARMFUL, 0xa62fb4).addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "effect.shortening"), -1.0, AttributeModifier.Operation.ADD_VALUE));

    private static Holder<MobEffect> register(String id, MobEffect statusEffect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id), statusEffect);
    }

    public static void loadEffects() {
    }
}
