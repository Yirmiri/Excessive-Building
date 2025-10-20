package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DiggingEnchantment;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DiggingEnchantment.class)
public abstract class EfficiencyEnchantmentMixin {

    @Inject(method = "canEnchant", at = @At("HEAD"), cancellable = true)
    private void excessiveBuilding$canEnchant(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.is(EBItems.GAUNTLET.get())) {
            cir.setReturnValue(false);
        }
    }
}
