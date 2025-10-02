package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.yirmiri.excessive_building.common.entity.render.InvisibleEntityRenderer;
import net.yirmiri.excessive_building.common.particle.FallingLeavesParticle;
import net.yirmiri.excessive_building.core.registry.EBEntities;
import net.yirmiri.excessive_building.core.registry.EBParticles;

@Environment(EnvType.CLIENT)
public class FabricExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcessiveBuildingClient.clientinit();

        EntityRendererRegistry.register(EBEntities.CHAIR.get(), InvisibleEntityRenderer::new);

        //ParticleFactoryRegistry.getInstance().register(EBParticles.ANCIENT.get(), FallingLeavesParticle.Provider::new);
    }
}
