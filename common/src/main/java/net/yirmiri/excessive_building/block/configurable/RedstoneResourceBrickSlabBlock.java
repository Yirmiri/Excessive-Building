package net.yirmiri.excessive_building.block.configurable;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneResourceBrickSlabBlock extends ResourceBrickSlabBlock {
    public RedstoneResourceBrickSlabBlock(Properties settings) {
        super(settings);
    }

    public static final MapCodec<RedstoneResourceBrickSlabBlock> CODEC = simpleCodec(RedstoneResourceBrickSlabBlock::new);

    @Override
    public MapCodec<RedstoneResourceBrickSlabBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean isSignalSource(BlockState state) {
        return true;
    }

    @Override
    protected int getSignal(BlockState state, BlockGetter world, BlockPos pos, Direction direction) {
        return 15;
    }
}
