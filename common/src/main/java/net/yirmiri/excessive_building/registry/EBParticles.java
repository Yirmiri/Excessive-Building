package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBParticles {
    public static final DefaultParticleType ANCIENT_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType GLOOM_PARTICLE = FabricParticleTypes.simple();

    public static void loadParticles() {
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "ancient_particle"), ANCIENT_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "gloom_particle"), GLOOM_PARTICLE);
    }
}
