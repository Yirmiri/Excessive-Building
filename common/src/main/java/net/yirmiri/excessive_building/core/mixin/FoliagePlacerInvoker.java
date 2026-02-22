package net.yirmiri.excessive_building.core.mixin;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(FoliagePlacerType.class)
public interface FoliagePlacerInvoker {
    @Invoker("register")
    static <P extends FoliagePlacer> FoliagePlacerType<P> register(String id, MapCodec<P> codec) {
        throw new AssertionError();
    }

    @Invoker("<init>")
    static <P extends FoliagePlacer> FoliagePlacerType<P> init(MapCodec<P> codec) {
        throw new AssertionError();
    }
}