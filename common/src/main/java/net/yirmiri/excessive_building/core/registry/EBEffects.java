package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.common.publicized.PublicMobEffect;
import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBEffects {
    //BENEFICIAL
    public static final Supplier<MobEffect> RAPIDITY = registerEffect("rapidity", () -> new PublicMobEffect(MobEffectCategory.BENEFICIAL, 0x7e4fd1));

    private static Supplier<MobEffect> registerEffect(String id, Supplier<MobEffect> type) {
        return Services.REGISTRY.registerEffect(ExcessiveBuilding.MOD_ID, id, type);
    }

    public static void loadEffects() {
    }
}
