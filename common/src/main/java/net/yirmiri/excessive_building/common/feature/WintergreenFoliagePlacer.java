package net.yirmiri.excessive_building.common.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.registry.EBPlacers;

public class WintergreenFoliagePlacer extends FoliagePlacer {
    private final IntProvider trunkHeight;

    public static final MapCodec<WintergreenFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((instance) ->
            foliagePlacerParts(instance).and(IntProvider.codec(0, 24)
                            .fieldOf("trunk_height").forGetter((placer) -> placer.trunkHeight))
                    .apply(instance, WintergreenFoliagePlacer::new));

    public WintergreenFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider trunkHeight) {
        super(radius, offset);
        this.trunkHeight = trunkHeight;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return EBPlacers.WINTERGREEN_FOLIAGE.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader world, FoliagePlacer.FoliageSetter placer, RandomSource random, TreeConfiguration config, int trunkHeight, FoliagePlacer.FoliageAttachment treeNode, int foliageHeight, int radius, int offset) {
        BlockPos blockPos = treeNode.pos();
        Direction d = EBUtil.randomHorizontalDirectionWithCoordinateSeed(blockPos);

        int i = 0;
        int j = 1;
        int k = 0;

        for (int l = offset+2; l >= -foliageHeight; --l) {
            if(l >= offset+2) {
                this.placeLeavesRow(world, placer, random, config, blockPos.relative(d, 4), 0, l, treeNode.doubleTrunk());
                this.placeLeavesRow(world, placer, random, config, blockPos.relative(d, 4), 0, l-1, treeNode.doubleTrunk());
            }
            else if(l >= offset+1) {
                this.placeLeavesRow(world, placer, random, config, blockPos.relative(d, 3), 0, l, treeNode.doubleTrunk());
                this.placeLeavesRow(world, placer, random, config, blockPos.relative(d, 3), 0, l-1, treeNode.doubleTrunk());
            }
            else if(l >= offset-1) {
                this.placeLeavesRow(world, placer, random, config, blockPos.relative(d, 2), 1, l, treeNode.doubleTrunk());
            }
            else if(l >= offset-4) {
                this.placeLeavesRow(world, placer, random, config, blockPos.relative(d, 1), 1, l, treeNode.doubleTrunk());
            }
            else {
                this.placeLeavesRow(world, placer, random, config, blockPos, i, l, treeNode.doubleTrunk());
            }

            if (i >= j) {
                i = k;
                k = 1;
                j = Math.min(j + 1, radius + treeNode.radiusOffset());
                continue;
            }
            ++i;
        }
    }

    @Override
    public int foliageHeight(RandomSource random, int trunkHeight, TreeConfiguration config) {
        return Math.max(4, trunkHeight - this.trunkHeight.sample(random));
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return dx == radius && dz == radius && radius > 0;
    }
}