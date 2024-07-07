package net.yirmiri.excessive_building.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPotions {
    public static final RegistryEntry<Potion> REACHING = Registry.registerReference(Registries.POTION, Identifier.of(ExcessiveBuilding.MOD_ID, "reaching_potion"),
            new Potion(new StatusEffectInstance(EBStatusEffects.REACHING,12000,2)));

    public static final RegistryEntry<Potion> LONG_REACHING = Registry.registerReference(Registries.POTION, Identifier.of(ExcessiveBuilding.MOD_ID, "long_reaching_potion"),
            new Potion(new StatusEffectInstance(EBStatusEffects.REACHING,24000,2)));

    public static final RegistryEntry<Potion> STRONG_REACHING = Registry.registerReference(Registries.POTION, Identifier.of(ExcessiveBuilding.MOD_ID, "strong_reaching_potion"),
            new Potion(new StatusEffectInstance(EBStatusEffects.REACHING,12000,4)));

    public static final RegistryEntry<Potion> SHORTENING = Registry.registerReference(Registries.POTION, Identifier.of(ExcessiveBuilding.MOD_ID, "shortening_potion"),
            new Potion(new StatusEffectInstance(EBStatusEffects.SHORTENING,12000,1)));

    public static final RegistryEntry<Potion> LONG_SHORTENING = Registry.registerReference(Registries.POTION, Identifier.of(ExcessiveBuilding.MOD_ID, "long_shortening_potion"),
            new Potion(new StatusEffectInstance(EBStatusEffects.SHORTENING,24000,1)));

    public static final RegistryEntry<Potion> STRONG_SHORTENING = Registry.registerReference(Registries.POTION, Identifier.of(ExcessiveBuilding.MOD_ID, "strong_shortening_potion"),
            new Potion(new StatusEffectInstance(EBStatusEffects.SHORTENING,12000,2)));

    public static void registerEBPotions() {
    }
}