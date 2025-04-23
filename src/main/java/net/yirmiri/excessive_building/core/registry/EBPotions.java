package net.yirmiri.excessive_building.core.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPotions {
    public static final Potion ENDURANCE = register("endurance_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, EBConfig.ENDURANCE_DURATION.get(), EBConfig.ENDURANCE_AMPLIFIER.get())));

    public static final Potion LONG_ENDURANCE = register("long_endurance_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, EBConfig.LONG_ENDURANCE_DURATION.get(), EBConfig.ENDURANCE_AMPLIFIER.get())));

    public static final Potion STRONG_ENDURANCE = register("strong_endurance_potion",
            new Potion(new StatusEffectInstance(StatusEffects.HASTE, EBConfig.ENDURANCE_DURATION.get(), EBConfig.STRONG_ENDURANCE_AMPLIFIER.get())));

    public static final Potion FATIGUING = register("fatiguing_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, EBConfig.FATIGUING_DURATION.get(), EBConfig.FATIGUING_AMPLIFIER.get())));

    public static final Potion LONG_FATIGUING = register("long_fatiguing_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, EBConfig.LONG_FATIGUING_DURATION.get(), EBConfig.FATIGUING_AMPLIFIER.get())));

    public static final Potion STRONG_FATIGUING = register("strong_fatiguing_potion",
            new Potion(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, EBConfig.FATIGUING_DURATION.get(), EBConfig.STRONG_ENDURANCE_AMPLIFIER.get())));

    private static Potion register(String id, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(ExcessiveBuilding.MOD_ID, id), potion);
    }

    public static void loadPotions() {
    }
}