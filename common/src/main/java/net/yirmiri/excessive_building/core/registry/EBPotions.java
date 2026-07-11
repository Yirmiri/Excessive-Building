package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBPotions {
    //REACHING
    public static final Holder<Potion> REACHING = registerPotion("excessive_building.reaching",
            () -> new Potion(new MobEffectInstance(EBEffects.REACHING, 18000, 0)));

    public static final Holder<Potion> LONG_REACHING = registerPotion("excessive_building.long_reaching",
            () -> new Potion(new MobEffectInstance(EBEffects.REACHING, 36000, 0)));

    public static final Holder<Potion> STRONG_REACHING = registerPotion("excessive_building.strong_reaching",
            () -> new Potion(new MobEffectInstance(EBEffects.REACHING, 18000, 1)));

    private static Holder<Potion> registerPotion(String id, Supplier<Potion> type) {
        return RLServices.REGISTRY.registerForHolder(BuiltInRegistries.POTION, ExcessiveBuilding.MOD_ID, id, type);
    }

    public static void load() {
    }
}
