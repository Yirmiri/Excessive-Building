package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.particles.SimpleParticleType;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBParticles {
    public static final Supplier<SimpleParticleType> ANCIENT = register("ancient");

    private static Supplier<SimpleParticleType> register(String id) {
        return RLServices.REGISTRY.registerParticle(ExcessiveBuilding.MOD_ID, id);
    }

    public static void load() {
    }
}
