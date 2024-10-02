package net.yirmiri.excessive_building.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPotions {
    public static final Potion HASTY = register("hasty_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, EBConfig.HASTY_DURATION.get(), EBConfig.HASTY_AMPLIFIER.get())));

    public static final Potion LONG_HASTY = register("long_hasty_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, EBConfig.LONG_HASTY_DURATION.get(), EBConfig.HASTY_AMPLIFIER.get())));

    public static final Potion STRONG_HASTY = register("strong_hasty_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, EBConfig.HASTY_DURATION.get(), EBConfig.STRONG_HASTY_AMPLIFIER.get())));

    public static final Potion FATIGUED = register("fatigued_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, EBConfig.FATIGUED_DURATION.get(), EBConfig.FATIGUED_AMPLIFIER.get())));

    public static final Potion LONG_FATIGUED = register("long_fatigued_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, EBConfig.LONG_FATIGUED_DURATION.get(), EBConfig.FATIGUED_AMPLIFIER.get())));

    public static final Potion STRONG_FATIGUED = register("strong_fatigued_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, EBConfig.FATIGUED_DURATION.get(), EBConfig.STRONG_HASTY_AMPLIFIER.get())));

    private static Potion register(String id, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(ExcessiveBuilding.MOD_ID, id), potion);
    }

    public static void loadPotions() {
    }
}