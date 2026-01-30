package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.yirmiri.excessive_building.common.particle.FallingLeafParticle;
import net.yirmiri.excessive_building.core.registry.EBParticles;

@Environment(EnvType.CLIENT)
public class FabricExcessiveBuildingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ExcessiveBuildingClient.init();

        ParticleFactoryRegistry.getInstance().register(EBParticles.ANCIENT.get(), FallingLeafParticle.Provider::new);
    }
}
