package net.yirmiri.excessive_building.common.util;

import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class EBUtil {
    public static final Boat.Type ANCIENT_BOAT = Boat.Type.byName("ancient");

    public static BlockState copyBlockProperties(BlockState state, BlockState state1) {
        for (Property<?> property : state.getProperties()) {
            if (state1.hasProperty(property)) {
                state1 = withProperty(state1, property, state.getValue(property));
            }
        }
        return state1;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> BlockState withProperty(BlockState state, Property<T> property, Comparable<?> value) {
        return state.setValue(property, (T) value);
    }
}
