package net.yirmiri.excessive_building.mixin;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.DecoratedPotPattern;
import net.minecraft.world.level.block.entity.DecoratedPotPatterns;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DecoratedPotPatterns.class)
public abstract class DecoratedPotPatternsMixin {
    @Inject(method = "fromSherd", at = @At("RETURN"), cancellable = true)
    private static void excessiveBuilding_fromSherd(Item item, CallbackInfoReturnable<ResourceKey<DecoratedPotPattern>> cir) {
        if (EBDecoratedPotPatterns.SHERD_MAP.containsKey(item)) {
            cir.setReturnValue(EBDecoratedPotPatterns.SHERD_MAP.get(item));
        }
    }
}