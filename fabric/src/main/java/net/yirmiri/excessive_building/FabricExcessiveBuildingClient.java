package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.yirmiri.excessive_building.common.entity.render.InvisibleEntityRenderer;
import net.yirmiri.excessive_building.core.registry.EBEntities;

@Environment(EnvType.CLIENT)
public class FabricExcessiveBuildingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcessiveBuildingClient.clientinit();

        //ParticleFactoryRegistry.getInstance().register((SimpleParticleType) EBParticles.ANCIENT.get(), FallingLeavesParticle.Provider::new);

        EntityRendererRegistry.register(EBEntities.CHAIR.get(), InvisibleEntityRenderer::new);
    }
}
