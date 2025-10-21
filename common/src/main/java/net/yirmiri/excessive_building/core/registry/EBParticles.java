package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.core.particles.SimpleParticleType;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.function.Supplier;

public class EBParticles {
    //public static final Supplier<SimpleParticleType> ANCIENT = registerParticle("ancient");

    private static Supplier<SimpleParticleType> registerParticle(String id) {
        return Services.REGISTRY.registerParticle(ExcessiveBuilding.MOD_ID, id);
    }

    public static void loadParticles() {
    }
}
