package net.yirmiri.excessive_building.mixin;

import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DecoratedPotPatterns.class)
public abstract class DecoratedPotPatternsMixin {
    @Inject(method = "fromSherd", at = @At("RETURN"), cancellable = true)
    private static void fromSherd(Item item, CallbackInfoReturnable<RegistryKey<String>> cir) {
        if (EBDecoratedPotPatterns.SHERD_MAP.containsKey(item)) {
            cir.setReturnValue(EBDecoratedPotPatterns.SHERD_MAP.get(item));
        }
    }
}