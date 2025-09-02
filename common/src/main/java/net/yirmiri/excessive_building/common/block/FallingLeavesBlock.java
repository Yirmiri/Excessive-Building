package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class FallingLeavesBlock extends LeavesBlock {
    private static SimpleParticleType particle;

    public FallingLeavesBlock(SimpleParticleType particle, BlockBehaviour.Properties properties) {
        super(properties);
        FallingLeavesBlock.particle = particle;
    }

    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource source) {
        super.animateTick(state, level, pos, source);
        if (source.nextInt(10) == 0) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (!isFaceFull(blockstate.getCollisionShape(level, blockpos), Direction.UP)) {
                ParticleUtils.spawnParticleBelow(level, pos, source, particle);
            }
        }
    }
}
