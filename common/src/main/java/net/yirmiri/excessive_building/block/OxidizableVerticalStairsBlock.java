package net.yirmiri.excessive_building.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class OxidizableVerticalStairsBlock extends VerticalStairsBlock implements WeatheringCopper {
    public static final MapCodec<OxidizableVerticalStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(WeatheringCopper.WeatherState.CODEC.fieldOf("weathering_state").forGetter(ChangeOverTimeBlock::getAge), propertiesCodec())
                    .apply(instance, OxidizableVerticalStairsBlock::new)
    );
    private final WeatheringCopper.WeatherState oxidationLevel;

    @Override
    public MapCodec<OxidizableVerticalStairsBlock> codec() {
        return CODEC;
    }

    public OxidizableVerticalStairsBlock(WeatheringCopper.WeatherState oxidationLevel, BlockBehaviour.Properties settings) {
        super(settings);
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
