package net.yirmiri.excessive_building.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.block.SoulMagmaBlock;
import net.yirmiri.excessive_building.registry.EBBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BubbleColumnBlock.class)
public abstract class BubbleColumnBlockMixin {
    @Inject(method = "getBubbleState", at = @At("HEAD"), cancellable = true)
    private static void getBubbleState(BlockState state, CallbackInfoReturnable<BlockState> cir) {
        if (state.is(EBBlocks.SOUL_MAGMA_BLOCK) && state.getValue(SoulMagmaBlock.POWERED) == Boolean.TRUE) {
            cir.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(BubbleColumnBlock.DRAG_DOWN, false));

        } else if (state.is(EBBlocks.SOUL_MAGMA_BLOCK) && state.getValue(SoulMagmaBlock.POWERED) == Boolean.FALSE && EBConfig.ENABLE_SOUL_MAGMA_COLUMN_TOGGLE.get()) {
            cir.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(BubbleColumnBlock.DRAG_DOWN, true));
        }
    }

    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void canPlaceAt(BlockState state, LevelReader world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState below = world.getBlockState(pos.below());
        if (below.is(EBBlocks.SOUL_MAGMA_BLOCK)) {
            cir.setReturnValue(true);
        }
    }
}
