package net.yirmiri.excessive_building;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.yirmiri.excessive_building.common.block.sign.EBHangingSignRenderer;
import net.yirmiri.excessive_building.common.block.sign.EBSignRenderer;
import net.yirmiri.excessive_building.common.particle.FallingLeafParticle;
import net.yirmiri.excessive_building.common.particle.FrostedParticle;
import net.yirmiri.excessive_building.core.init.EBModelLayers;
import net.yirmiri.excessive_building.core.registry.EBParticles;

@EventBusSubscriber(modid = ExcessiveBuilding.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoForgeExcessiveBuildingClient {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ExcessiveBuildingClient.init();
    }

    @SubscribeEvent
    public static void onRegisterParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(EBParticles.ANCIENT.get(), FallingLeafParticle.Provider::new);
        event.registerSpriteSet(EBParticles.FROSTED.get(), FrostedParticle.Provider::new);
        event.registerSpriteSet(EBParticles.WINTERGREEN.get(), FallingLeafParticle.Provider::new);
    }

    @SubscribeEvent
    public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(EBModelLayers.ANCIENT_SIGN, EBSignRenderer::createSignLayer);
        event.registerLayerDefinition(EBModelLayers.ANCIENT_HANGING_SIGN, EBHangingSignRenderer::createHangingSignLayer);
        event.registerLayerDefinition(EBModelLayers.WINTERGREEN_SIGN, EBSignRenderer::createSignLayer);
        event.registerLayerDefinition(EBModelLayers.WINTERGREEN_HANGING_SIGN, EBHangingSignRenderer::createHangingSignLayer);
    }
}
