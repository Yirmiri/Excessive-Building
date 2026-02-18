package net.yirmiri.excessive_building.common.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.vehicle.Boat;

public class EBUtil {
    public static final Boat.Type ANCIENT_BOAT = Boat.Type.byName("ancient");
    public static final Boat.Type WINTERGREEN_BOAT = Boat.Type.byName("wintergreen");

    public static Direction randomHorizontalDirectionWithCoordinateSeed(BlockPos pos) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        long seed = ((long) x * z) - y;
        RandomSource random = RandomSource.create(seed);

        int d = random.nextInt(4);
        return Direction.from2DDataValue(d);
    }
}
