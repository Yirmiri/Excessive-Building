package net.yirmiri.excessive_building.core.registry;

import com.mojang.serialization.MapCodec;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.feature.WintergreenFoliagePlacer;
import net.yirmiri.excessive_building.common.feature.WintergreenTrunkPlacer;
import net.yirmiri.excessive_building.core.mixin.FoliagePlacerInvoker;
import net.yirmiri.excessive_building.core.mixin.TrunkPlacerInvoker;

import java.util.function.Supplier;

public class EBPlacers {
    public static final Supplier<TrunkPlacerType<?>> WINTERGREEN_TRUNK = registerTrunkPlacer("wintergreen_trunk", WintergreenTrunkPlacer.CODEC);
    public static final Supplier<FoliagePlacerType<?>> WINTERGREEN_FOLIAGE = registerFoliagePlacer("wintergreen_foliage", WintergreenFoliagePlacer.CODEC);

    private static <P extends TrunkPlacer> Supplier<TrunkPlacerType<?>> registerTrunkPlacer(String id, MapCodec<P> codec) {
        return RLServices.REGISTRY.register(BuiltInRegistries.TRUNK_PLACER_TYPE, ExcessiveBuilding.MOD_ID, id, () -> TrunkPlacerInvoker.register(codec));
    }

    private static <P extends FoliagePlacer> Supplier<FoliagePlacerType<?>> registerFoliagePlacer(String id, MapCodec<P> codec) {
        return RLServices.REGISTRY.register(BuiltInRegistries.FOLIAGE_PLACER_TYPE, ExcessiveBuilding.MOD_ID, id, () -> FoliagePlacerInvoker.register(codec));
    }

    public static void load() {
    }
}