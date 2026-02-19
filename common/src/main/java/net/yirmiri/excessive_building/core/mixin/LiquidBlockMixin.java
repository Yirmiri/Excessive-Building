package net.yirmiri.excessive_building.core.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.yirmiri.excessive_building.core.registry.EBBlocks;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LiquidBlock.class)
public abstract class LiquidBlockMixin {

    @Shadow
    @Final
    protected FlowingFluid fluid;

    @Shadow
    @Final
    public static ImmutableList<Direction> POSSIBLE_FLOW_DIRECTIONS;

    @Shadow
    protected abstract void fizz(LevelAccessor level, BlockPos pos);

//    @Inject(method = "shouldSpreadLiquid", at = @At(value = "TAIL"), cancellable = true)
//    public void excessiveBuilding$shouldSpreadLiquid(Level level, BlockPos pos, BlockState blockState, CallbackInfoReturnable<Boolean> cir) {
//        if (fluid.is(FluidTags.LAVA)) {
//
//            boolean validSoil =
//                    level.getBlockState(pos.below()).is(EBBlocks.CORALSOIL_CLAY.get()) ||
//                            level.getBlockState(pos.below()).is(EBBlocks.LAVENDER_CLAY.get()) ||
//                            level.getBlockState(pos.below()).is(EBBlocks.SAGE_CLAY.get());
//
//            if (!validSoil) return;
//
//            for (Direction direction : POSSIBLE_FLOW_DIRECTIONS) {
//                BlockPos relativePos = pos.relative(direction.getOpposite());
//
//                if (!level.getFluidState(relativePos).isEmpty() && !level.getBlockState(relativePos).is(EBBlocks.SITRITE.get())) {
//                    level.setBlockAndUpdate(pos, Blocks.CLAY.defaultBlockState());
//                    fizz(level, pos);
//                    cir.setReturnValue(false);
//                }
//            }
//        }
//    }
}
