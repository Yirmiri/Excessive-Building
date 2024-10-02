package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPotions {
    public static final Potion HASTY = register("hasty_potion",
            new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, EBConfig.HASTY_DURATION.get(), EBConfig.HASTY_AMPLIFIER.get())));

    public static final Potion LONG_HASTY = register("long_hasty_potion",
            new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, EBConfig.LONG_HASTY_DURATION.get(), EBConfig.HASTY_AMPLIFIER.get())));

    public static final Potion STRONG_HASTY = register("strong_hasty_potion",
            new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, EBConfig.HASTY_DURATION.get(), EBConfig.STRONG_HASTY_AMPLIFIER.get())));

    public static final Potion FATIGUED = register("fatigued_potion",
            new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, EBConfig.FATIGUED_DURATION.get(), EBConfig.FATIGUED_AMPLIFIER.get())));

    public static final Potion LONG_FATIGUED = register("long_fatigued_potion",
            new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, EBConfig.LONG_FATIGUED_DURATION.get(), EBConfig.FATIGUED_AMPLIFIER.get())));

    public static final Potion STRONG_FATIGUED = register("strong_fatigued_potion",
            new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, EBConfig.FATIGUED_DURATION.get(), EBConfig.STRONG_HASTY_AMPLIFIER.get())));

    private static Potion register(String id, Potion potion) {
        return Registry.register(BuiltInRegistries.POTION, new ResourceLocation(ExcessiveBuilding.MOD_ID, id), potion);
    }

    public static void loadPotions() {
    }
}