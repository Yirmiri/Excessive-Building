package net.yirmiri.excessive_building.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlantBlock.class)
public abstract class PlantBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At("TAIL"), cancellable = true)
    public void excessiveBuilding_canPlantOnTop(BlockState state, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (state.isIn(EBTags.Blocks.TERRACOTTA_POTS)) {
            cir.setReturnValue(state.get(EBProperties.FILLED));
        }
    }
}