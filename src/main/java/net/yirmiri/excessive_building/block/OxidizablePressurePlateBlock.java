package net.yirmiri.excessive_building.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizablePressurePlateBlock extends CopperPressurePlateBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public OxidizablePressurePlateBlock(Oxidizable.OxidationLevel oxidationLevel, BlockSetType type, Settings settings, int ticks) {
        super(type, settings, ticks);
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