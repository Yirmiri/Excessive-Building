package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.particle.PublicSimpleParticleType;

import java.util.function.Supplier;

public class EBParticles {
    //public static final Supplier<ParticleType<?>> ANCIENT = registerParticle("ancient", () -> new PublicSimpleParticleType(false));

    private static Supplier<ParticleType<?>> registerParticle(String id, Supplier<ParticleType<?>> type) {
        return Services.REGISTRY.registerParticle(ExcessiveBuilding.MOD_ID, id, type);
    }

    public static void loadParticles() {
    }
}
