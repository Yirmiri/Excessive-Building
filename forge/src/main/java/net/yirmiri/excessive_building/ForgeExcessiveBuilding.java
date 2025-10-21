package net.yirmiri.excessive_building;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yirmiri.excessive_building.common.entity.render.InvisibleEntityRenderer;
import net.yirmiri.excessive_building.common.particle.FallingLeavesParticle;
import net.yirmiri.excessive_building.core.registry.EBEntities;
import net.yirmiri.excessive_building.core.registry.EBParticles;
import net.yirmiri.excessive_building.core.registry.EBRegistries;
import net.yirmiri.excessive_building.util.ForgeEBLootModifiers;

@Mod(ExcessiveBuilding.MOD_ID)
public class ForgeExcessiveBuilding {
    public ForgeExcessiveBuilding() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ExcessiveBuilding.init();
        ForgeEBLootModifiers.LOOT_MODIFIERS.register(eventBus);

        eventBus.addListener(this::clientSetup);
        //eventBus.addListener(this::registerParticles);
        eventBus.addListener(this::registerEntityRenderer);
    }

    @SubscribeEvent
    public void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(EBRegistries::loadRegistries);
    }

//    @SubscribeEvent
//    public void registerParticles(RegisterParticleProvidersEvent event) {
//        event.registerSpriteSet(EBParticles.ANCIENT.get(), FallingLeavesParticle.Provider::new);
//    }

    @SubscribeEvent
    public void registerEntityRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EBEntities.CHAIR.get(), InvisibleEntityRenderer::new);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        ExcessiveBuildingClient.clientinit();
    }
}