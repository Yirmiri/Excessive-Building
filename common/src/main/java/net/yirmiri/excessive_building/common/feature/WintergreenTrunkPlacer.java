package net.yirmiri.excessive_building.common.feature;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.registry.EBPlacers;

import java.util.List;
import java.util.function.BiConsumer;

public class WintergreenTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<WintergreenTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec((instance) ->
            trunkPlacerParts(instance).apply(instance, WintergreenTrunkPlacer::new));

    public WintergreenTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return EBPlacers.WINTERGREEN_TRUNK.value();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random, int height, BlockPos startPos, TreeConfiguration config) {
        Direction d = EBUtil.randomHorizontalDirectionWithCoordinateSeed(startPos);

        TrunkPlacer.setDirtAt(world, replacer, random, startPos.below(), config);
        int base = Math.max(this.baseHeight, 11);
        for (int i = 0; i < height; ++i) {
            if (i < base - 4) {
                this.placeLog(world, replacer, random, startPos.above(i), config);
            }
            else if (i < base - 1) {
                this.placeLog(world, replacer, random, startPos.above(i).relative(d, 1), config);
            }
            else {
                this.placeLog(world, replacer, random, startPos.above(i).relative(d, 2), config);
            }
        }

        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(height), 0, false));
    }
}