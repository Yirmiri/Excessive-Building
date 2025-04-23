package net.yirmiri.excessive_building.core.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBParticles {
    public static final DefaultParticleType BLOODROOT_PARTICLE = FabricParticleTypes.simple();

    public static void loadParticles() {
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "ancient_particle"), BLOODROOT_PARTICLE);
    }
}
