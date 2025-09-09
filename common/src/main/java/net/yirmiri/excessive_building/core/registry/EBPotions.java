package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBPotions {
//    public static final Supplier<Potion> REACHING = Services.REGISTRY.registerPotion(ExcessiveBuilding.MOD_ID, "reaching",
//            () -> new Potion(new MobEffectInstance(EBEffects.REACHING.get(), 12000, 1)));
//
//    public static final Supplier<Potion> LONG_REACHING = Services.REGISTRY.registerPotion(ExcessiveBuilding.MOD_ID, "long_reaching",
//            () -> new Potion(new MobEffectInstance(EBEffects.REACHING.get(), 24000, 1)));
//
//    public static final Supplier<Potion> STRONG_REACHING = Services.REGISTRY.registerPotion(ExcessiveBuilding.MOD_ID, "strong_reaching",
//            () -> new Potion(new MobEffectInstance(EBEffects.REACHING.get(), 8400, 3)));

      public static final Supplier<Potion> RAPIDITY = Services.REGISTRY.registerPotion(ExcessiveBuilding.MOD_ID, "rapidity",
            () -> new Potion(new MobEffectInstance(EBEffects.RAPIDITY.get(), 6000, 0)));

    public static final Supplier<Potion> LONG_RAPIDITY = Services.REGISTRY.registerPotion(ExcessiveBuilding.MOD_ID, "long_rapidity",
            () -> new Potion(new MobEffectInstance(EBEffects.RAPIDITY.get(), 10200, 0)));

    public static final Supplier<Potion> STRONG_RAPIDITY = Services.REGISTRY.registerPotion(ExcessiveBuilding.MOD_ID, "strong_rapidity",
            () -> new Potion(new MobEffectInstance(EBEffects.RAPIDITY.get(), 3000, 1)));

    public static void loadPotions() {
    }
}
