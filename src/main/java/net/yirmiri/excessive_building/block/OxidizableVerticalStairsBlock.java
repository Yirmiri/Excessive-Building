package net.yirmiri.excessive_building.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableVerticalStairsBlock extends VerticalStairsBlock implements Oxidizable {
    public static final MapCodec<OxidizableVerticalStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(Oxidizable.OxidationLevel.CODEC.fieldOf("weathering_state").forGetter(Degradable::getDegradationLevel), createSettingsCodec())
                    .apply(instance, OxidizableVerticalStairsBlock::new)
    );
    private final Oxidizable.OxidationLevel oxidationLevel;

    @Override
    public MapCodec<OxidizableVerticalStairsBlock> getCodec() {
        return CODEC;
    }

    public OxidizableVerticalStairsBlock(Oxidizable.OxidationLevel oxidationLevel, AbstractBlock.Settings settings) {
        super(settings);
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
