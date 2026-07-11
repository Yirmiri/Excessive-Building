package net.yirmiri.excessive_building;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.yirmiri.excessive_building.common.block.sign.EBHangingSignRenderer;
import net.yirmiri.excessive_building.common.block.sign.EBSignRenderer;
import net.yirmiri.excessive_building.common.particle.FallingLeafParticle;
import net.yirmiri.excessive_building.common.particle.FrostedParticle;
import net.yirmiri.excessive_building.core.init.EBModelLayers;
import net.yirmiri.excessive_building.core.registry.EBParticles;

@Environment(EnvType.CLIENT)
public class FabricExcessiveBuildingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ExcessiveBuildingClient.init();

        ParticleFactoryRegistry.getInstance().register(EBParticles.ANCIENT.get(), FallingLeafParticle.Provider::new);
        ParticleFactoryRegistry.getInstance().register(EBParticles.FROSTED.get(), FrostedParticle.Provider::new);
        ParticleFactoryRegistry.getInstance().register(EBParticles.WINTERGREEN.get(), FallingLeafParticle.Provider::new);

        EntityModelLayerRegistry.registerModelLayer(EBModelLayers.ANCIENT_SIGN, EBSignRenderer::createSignLayer);
        EntityModelLayerRegistry.registerModelLayer(EBModelLayers.ANCIENT_HANGING_SIGN, EBHangingSignRenderer::createHangingSignLayer);
        EntityModelLayerRegistry.registerModelLayer(EBModelLayers.WINTERGREEN_SIGN, EBSignRenderer::createSignLayer);
        EntityModelLayerRegistry.registerModelLayer(EBModelLayers.WINTERGREEN_HANGING_SIGN, EBHangingSignRenderer::createHangingSignLayer);
    }
}
