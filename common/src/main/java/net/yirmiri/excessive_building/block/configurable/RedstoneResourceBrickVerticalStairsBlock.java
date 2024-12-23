package net.yirmiri.excessive_building.block.configurable;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneResourceBrickVerticalStairsBlock extends ResourceBrickVerticalStairsBlock {
    public RedstoneResourceBrickVerticalStairsBlock(Properties settings) {
        super(settings);
    }

    public static final MapCodec<RedstoneResourceBrickVerticalStairsBlock> CODEC = simpleCodec(RedstoneResourceBrickVerticalStairsBlock::new);

    @Override
    public MapCodec<RedstoneResourceBrickVerticalStairsBlock> codec() {
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
