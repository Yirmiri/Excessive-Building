package net.yirmiri.excessive_building.mixin;

import net.minecraft.world.level.block.state.properties.WoodType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(WoodType.class)
public interface WoodTypeMixin {
    @Invoker
    static WoodType invokeRegister(WoodType type) {
        throw new AssertionError();
    }
}
