package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Boat.class)
public abstract class BoatMixin {
    @Shadow public abstract Object getVariant();

    @Inject(method = "getDropItem", at = @At(value = "RETURN"), cancellable = true)
    private void excessiveBuilding$getDropItem(CallbackInfoReturnable<Item> cir) {
        if (this.getVariant() == EBUtil.ANCIENT_BOAT) {
            cir.setReturnValue(EBItems.ANCIENT_BOAT.get());
        }
    }
}