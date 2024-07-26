package net.yirmiri.excessive_building.block.configurable;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneResourceBrickSlabBlock extends ResourceBrickSlabBlock {
    public RedstoneResourceBrickSlabBlock(Settings settings) {
        super(settings);
    }

    public static final MapCodec<RedstoneResourceBrickSlabBlock> CODEC = createCodec(RedstoneResourceBrickSlabBlock::new);

    @Override
    public MapCodec<RedstoneResourceBrickSlabBlock> getCodec() {
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
