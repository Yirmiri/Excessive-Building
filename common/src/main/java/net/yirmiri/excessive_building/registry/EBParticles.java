package net.yirmiri.excessive_building.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.yirmiri.excessive_building.platform.Services;

public class EBParticles {
    public static final Holder<SimpleParticleType> ANCIENT_PARTICLE = registerParticle("ancient_particle");
    public static final Holder<SimpleParticleType> GLOOM_PARTICLE = registerParticle("gloom_particle");

    private static Holder<SimpleParticleType> registerParticle(String id) {
        return Services.REGISTRY.registerParticle(id);
    }

    public static void loadParticles() {
    }
}