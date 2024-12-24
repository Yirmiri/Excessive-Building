package net.yirmiri.excessive_building.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.util.EBProperties;
import net.yirmiri.excessive_building.util.EBTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BushBlock.class)
public class PlantBlockMixin {
    @Inject(method = "mayPlaceOn", at = @At("TAIL"), cancellable = true)
    public void excessiveBuilding_canPlantOnTop(BlockState state, BlockGetter world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (state.is(EBTags.Blocks.TERRACOTTA_POTS)) {
            cir.setReturnValue(state.getValue(EBProperties.FILLED));
        }
    }
}