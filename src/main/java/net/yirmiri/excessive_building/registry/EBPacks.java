package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

import java.util.Optional;

public class EBPacks {
    public static void registerPacks() {
        Optional<ModContainer> container = FabricLoader.getInstance().getModContainer(ExcessiveBuilding.MOD_ID);
        ResourceManagerHelper.registerBuiltinResourcePack(Identifier.of(ExcessiveBuilding.MOD_ID, "vanilla_retextures"), container.get(),
                Text.translatable("pack." + ExcessiveBuilding.MOD_ID + ".vanilla_retextures"), ResourcePackActivationType.DEFAULT_ENABLED);
    }
}
