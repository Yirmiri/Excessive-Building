package net.yirmiri.excessive_building.block;

import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class OxidizablePressurePlateBlock extends CopperPressurePlateBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState oxidationLevel;

    public OxidizablePressurePlateBlock(WeatheringCopper.WeatherState oxidationLevel, PressurePlateBlock.Sensitivity rule, BlockBehaviour.Properties settings, BlockSetType type, int ticks) {
        super(rule, settings, type, ticks);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.onRandomTick(state, world, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.oxidationLevel;
    }
}