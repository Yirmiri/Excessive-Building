package net.yirmiri.excessive_building;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.yirmiri.excessive_building.platform.NeoForgeExcessiveBuildingRegistryHelper;

@Mod(ExcessiveBuilding.MOD_ID)
public class NeoForgeExcessiveBuilding {
    public NeoForgeExcessiveBuilding(IEventBus eventBus) {
        ExcessiveBuilding.init();

        NeoForgeExcessiveBuildingRegistryHelper.BLOCK.register(eventBus);
        NeoForgeExcessiveBuildingRegistryHelper.ITEM.register(eventBus);
        NeoForgeExcessiveBuildingRegistryHelper.ENTITY_TYPE.register(eventBus);
        NeoForgeExcessiveBuildingRegistryHelper.BLOCK_ENTITY_TYPE.register(eventBus);
        NeoForgeExcessiveBuildingRegistryHelper.MOB_EFFECT.register(eventBus);
        NeoForgeExcessiveBuildingRegistryHelper.SOUND_EVENT.register(eventBus);
        NeoForgeExcessiveBuildingRegistryHelper.CREATIVE_MODE_TAB.register(eventBus);

        //TODO: Neo equivalent of EBRegistries
    }
}