package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class CloneOtherBlock extends Block {
    private final Block cloneStack;

    public CloneOtherBlock(Block cloneStack, Properties properties) {
        super(properties);
        this.cloneStack = cloneStack;
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter level, BlockPos pos, BlockState state) {
        return new ItemStack(cloneStack);
    }
}
