package net.yirmiri.excessive_building.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class OxidizablePressurePlate extends PressurePlateBlock implements Oxidizable {
    private int redstoneOutput;
    private final Oxidizable.OxidationLevel oxidationLevel;

    public OxidizablePressurePlate(Oxidizable.OxidationLevel oxidationLevel, BlockSetType type, Settings settings, int redstoneOutput) {
        super(type, settings);
        this.redstoneOutput = redstoneOutput;
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

    @Override
    protected int getRedstoneOutput(BlockState state) {
        return state.get(POWERED) ? redstoneOutput : 0;
    }

    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        Class<? extends Entity> class_ = switch (ActivationRule.PLAYER) {
            case ActivationRule.PLAYER -> PlayerEntity.class;
        };
        return getEntityCount(world, BOX.offset(pos), class_) > 0 ? 15 : 0;
    }

    public enum ActivationRule {
        PLAYER
    }
}