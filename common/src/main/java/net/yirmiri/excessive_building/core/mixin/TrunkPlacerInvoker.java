package net.yirmiri.excessive_building.core.mixin;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TrunkPlacerType.class)
public interface TrunkPlacerInvoker {
    @Invoker("register")
    static <P extends TrunkPlacer> TrunkPlacerType<P> register(String id, MapCodec<P> codec) {
        throw new AssertionError();
    }

    @Invoker("<init>")
    static <P extends TrunkPlacer> TrunkPlacerType<P> init(MapCodec<P> codec) {
        throw new AssertionError();
    }
}