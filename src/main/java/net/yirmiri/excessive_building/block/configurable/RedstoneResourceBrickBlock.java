package net.yirmiri.excessive_building.block.configurable;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneResourceBrickBlock extends ResourceBrickBlock {
    public RedstoneResourceBrickBlock(Settings settings) {
        super(settings);
    }

    public static final MapCodec<RedstoneResourceBrickBlock> CODEC = createCodec(RedstoneResourceBrickBlock::new);

    @Override
    public MapCodec<RedstoneResourceBrickBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}
