package net.yirmiri.excessive_building.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
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
        if (state.isOf(EBBlocks.SOUL_MAGMA_BLOCK) && state.get(SoulMagmaBlock.POWERED) == Boolean.TRUE) {
            cir.setReturnValue(Blocks.BUBBLE_COLUMN.getDefaultState().with(BubbleColumnBlock.DRAG, false));

        } else if (state.isOf(EBBlocks.SOUL_MAGMA_BLOCK) && state.get(SoulMagmaBlock.POWERED) == Boolean.FALSE && EBConfig.ENABLE_SOUL_MAGMA_COLUMN_TOGGLE.get()) {
            cir.setReturnValue(Blocks.BUBBLE_COLUMN.getDefaultState().with(BubbleColumnBlock.DRAG, true));
        }
    }

    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void canPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState below = world.getBlockState(pos.down());
        if (below.isOf(EBBlocks.SOUL_MAGMA_BLOCK)) {
            cir.setReturnValue(true);
        }
    }
}
