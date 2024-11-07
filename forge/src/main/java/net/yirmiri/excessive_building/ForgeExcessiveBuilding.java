package net.yirmiri.excessive_building;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExcessiveBuilding.MOD_ID)
public class ForgeExcessiveBuilding {
    
    public ForgeExcessiveBuilding() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EBForgeConfig.COMMON, "excessive-building.toml");

        ExcessiveBuilding.LOG.info("Keke took over Excessive Building or something");
        ExcessiveBuilding.init();
        
    }
}