package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.RunicLib;
import net.azurune.runiclib.common.publicized.PublicMobEffect;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBEffects {
    //BENEFICIAL
    public static final Holder<MobEffect> REACHING = register("reaching", new PublicMobEffect(MobEffectCategory.BENEFICIAL, 0xe5246c)
            .addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, RunicLib.customid(ExcessiveBuilding.MOD_ID, "effect.reaching"), 2.0F, AttributeModifier.Operation.ADD_VALUE)
    );

    private static Holder<MobEffect> register(String id, MobEffect effect) {
        return RLServices.REGISTRY.registerForHolder(BuiltInRegistries.MOB_EFFECT, ExcessiveBuilding.MOD_ID, id, effect);
    }

    public static void load() {
    }
}
