package net.yirmiri.excessive_building.core.mixin.client;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.profiling.ProfilerFiller;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(ModelBakery.class)
public abstract class ModelBakeryMixin {
    @Shadow protected abstract void loadTopLevel(ModelResourceLocation location);

    @SuppressWarnings("rawtypes")
    @Inject(method = "<init>", at = @At(value = "TAIL"))
    void excessiveBuilding$init(BlockColors colors, ProfilerFiller filler, Map modelresources, Map map, CallbackInfo ci) {
        loadTopLevel(new ModelResourceLocation(ExcessiveBuilding.MOD_ID, "radiance_gauntlet_model", "inventory"));
        loadTopLevel(new ModelResourceLocation(ExcessiveBuilding.MOD_ID, "radiance_gauntlet_model_offhand", "inventory"));
    }
}