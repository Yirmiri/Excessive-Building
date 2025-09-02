package net.yirmiri.excessive_building.common.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    public static Set<ResourceLocation> allBlockIdsInNamespace(String namespace) {
        Set<ResourceLocation> set = BuiltInRegistries.BLOCK.keySet();
        Set<ResourceLocation> a = new HashSet<>();
        for (ResourceLocation id : set) {
            if(Objects.equals(id.getNamespace(), namespace)) {
                a.add(id);
            }
        }
        return a;
    }
    public static Set<ResourceLocation> allItemIdsInNamespace(String namespace) {
        Set<ResourceLocation> set = BuiltInRegistries.ITEM.keySet();
        Set<ResourceLocation> a = new HashSet<>();
        for (ResourceLocation id : set) {
            if(Objects.equals(id.getNamespace(), namespace)) {
                a.add(id);
            }
        }
        return a;
    }

    public static String toSentenceCase(String s) {
        String[] words = s.split("[\\s|_]");
        StringBuilder capitalizeWord = new StringBuilder();
        for (String w : words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            capitalizeWord
                    .append(first.toUpperCase())
                    .append(afterFirst)
                    .append(" ");
        }
        return capitalizeWord.toString().trim();
    }
}
