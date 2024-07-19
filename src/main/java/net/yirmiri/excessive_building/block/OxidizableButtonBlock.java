package net.yirmiri.excessive_building.block;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableButtonBlock extends ButtonBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public OxidizableButtonBlock(Oxidizable.OxidationLevel oxidationLevel, BlockSetType blockSetType, int pressTicks, Settings settings) {
        super(blockSetType, pressTicks, settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
