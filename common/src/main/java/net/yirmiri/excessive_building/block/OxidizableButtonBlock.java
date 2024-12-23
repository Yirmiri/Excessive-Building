package net.yirmiri.excessive_building.block;

import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class OxidizableButtonBlock extends ButtonBlock implements WeatheringCopper {
    private final WeatheringCopper.WeatherState oxidationLevel;

    public OxidizableButtonBlock(WeatheringCopper.WeatherState oxidationLevel, BlockSetType blockSetType, int pressTicks, Properties settings) {
        super(blockSetType, pressTicks, settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, world, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.oxidationLevel;
    }
}
