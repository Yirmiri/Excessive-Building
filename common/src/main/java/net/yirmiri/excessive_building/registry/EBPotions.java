package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPotions {
    public static final Holder<Potion> REACHING = Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "reaching_potion"),
            new Potion(new MobEffectInstance(EBStatusEffects.REACHING, EBConfig.REACHING_DURATION.get(), EBConfig.REACHING_AMPLIFIER.get())));

    public static final Holder<Potion> LONG_REACHING = Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "long_reaching_potion"),
            new Potion(new MobEffectInstance(EBStatusEffects.REACHING, EBConfig.LONG_REACHING_DURATION.get(), EBConfig.REACHING_AMPLIFIER.get())));

    public static final Holder<Potion> STRONG_REACHING = Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "strong_reaching_potion"),
            new Potion(new MobEffectInstance(EBStatusEffects.REACHING, EBConfig.REACHING_DURATION.get(), EBConfig.STRONG_REACHING_AMPLIFIER.get())));

    public static final Holder<Potion> SHORTENING = Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "shortening_potion"),
            new Potion(new MobEffectInstance(EBStatusEffects.SHORTENING, EBConfig.SHORTENING_DURATION.get(), EBConfig.SHORTENING_AMPLIFIER.get())));

    public static final Holder<Potion> LONG_SHORTENING = Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "long_shortening_potion"),
            new Potion(new MobEffectInstance(EBStatusEffects.SHORTENING, EBConfig.LONG_SHORTENING_DURATION.get(), EBConfig.SHORTENING_AMPLIFIER.get())));

    public static final Holder<Potion> STRONG_SHORTENING = Registry.registerForHolder(BuiltInRegistries.POTION, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "strong_shortening_potion"),
            new Potion(new MobEffectInstance(EBStatusEffects.SHORTENING, EBConfig.SHORTENING_DURATION.get(), EBConfig.STRONG_REACHING_AMPLIFIER.get())));

    public static void loadPotions() {
    }
}