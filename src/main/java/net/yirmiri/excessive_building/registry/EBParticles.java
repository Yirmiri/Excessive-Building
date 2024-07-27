package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBParticles {
    public static final SimpleParticleType ANCIENT_PARTICLE = FabricParticleTypes.simple();
    public static final SimpleParticleType GLOOM_PARTICLE = FabricParticleTypes.simple();

    public static void registerEBParticles() {
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "ancient_particle"), ANCIENT_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "gloom_particle"), GLOOM_PARTICLE);
    }
}
