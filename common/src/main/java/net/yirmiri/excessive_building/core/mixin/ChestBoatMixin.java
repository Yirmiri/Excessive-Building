package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.yirmiri.excessive_building.common.util.EBUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChestBoat.class)
public abstract class ChestBoatMixin extends Boat {
    public ChestBoatMixin(EntityType<? extends Boat> type, Level level) {
        super(type, level);
    }

    @Inject(at = @At(value = "RETURN"), method = "getDropItem", cancellable = true)
    public void excessiveBuilding$getDropItem(CallbackInfoReturnable<Item> cir) {
        if (this.getVariant() == EBUtil.ANCIENT_BOAT) {
            cir.setReturnValue(Items.SPRUCE_BOAT);
        }
    }
}
