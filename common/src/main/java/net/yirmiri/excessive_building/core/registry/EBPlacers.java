package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.feature.WintergreenFoliagePlacer;
import net.yirmiri.excessive_building.common.feature.WintergreenTrunkPlacer;

import java.util.function.Supplier;

public class EBPlacers {
    public static final Holder<TrunkPlacerType<?>> WINTERGREEN_TRUNK = registerTrunkPlacer("wintergreen_trunk", () -> new TrunkPlacerType<>(WintergreenTrunkPlacer.CODEC));
    public static final Holder<FoliagePlacerType<?>> WINTERGREEN_FOLIAGE = registerFoliagePlacer("wintergreen_foliage", () -> new FoliagePlacerType<>(WintergreenFoliagePlacer.CODEC));

    private static Holder<TrunkPlacerType<?>> registerTrunkPlacer(String id, Supplier<TrunkPlacerType<?>> supplier) {
        return RLServices.REGISTRY.registerForHolder(BuiltInRegistries.TRUNK_PLACER_TYPE, ExcessiveBuilding.MOD_ID, id, supplier);
    }

    private static Holder<FoliagePlacerType<?>> registerFoliagePlacer(String id, Supplier<FoliagePlacerType<?>> supplier) {
        return RLServices.REGISTRY.registerForHolder(BuiltInRegistries.FOLIAGE_PLACER_TYPE, ExcessiveBuilding.MOD_ID, id, supplier);
    }

    public static void load() {
    }
}