package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBParticles {
    public static final SimpleParticleType ANCIENT_PARTICLE = FabricParticleTypes.simple();
    public static final SimpleParticleType GLOOM_PARTICLE = FabricParticleTypes.simple();

    public static void loadParticles() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "ancient_particle"), ANCIENT_PARTICLE);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "gloom_particle"), GLOOM_PARTICLE);
    }
}
