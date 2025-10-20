package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {

//    @Inject(method = "hasSilkTouch", at = @At("HEAD"), cancellable = true)
//    private static void excessiveBuilding$hasSilkTouch(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
//        if (stack.getItem() == EBItems.RADIANCE_MALLET.get()) {
//            cir.setReturnValue(true);
//        }
//    }

    @Inject(method = "getKnockbackBonus", at = @At("HEAD"), cancellable = true)
    private static void excessiveBuilding$getKnockbackBonus(LivingEntity player, CallbackInfoReturnable<Integer> cir) {
        if (player.getMainHandItem().is(EBItems.GAUNTLET.get())) {
            cir.setReturnValue(3);
        }

        if (player.getOffhandItem().is(EBItems.GAUNTLET.get())) {
            cir.setReturnValue(3);
        }
    }
}