package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.yirmiri.excessive_building.core.registry.EBItems;
import net.yirmiri.excessive_building.core.registry.EBPotions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PotionBrewing.class)
public abstract class BrewingRecipeRegistryMixin {

    @Inject(method = "addVanillaMixes", at = @At("TAIL"))
    private static void excessiveBuilding$addVanillaMixes(PotionBrewing.Builder builder, CallbackInfo ci) {
//        builder.addMix(Potions.AWKWARD, EBItems.ANCIENT_FRUIT.get(), EBPotions.REACHING);
//        builder.addMix(EBPotions.REACHING, Items.REDSTONE, EBPotions.LONG_REACHING);
//        builder.addMix(EBPotions.REACHING, Items.GLOWSTONE_DUST, EBPotions.STRONG_REACHING);
//
//        builder.addMix(EBPotions.REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.RAPIDITY);
//        builder.addMix(EBPotions.RAPIDITY, Items.REDSTONE, EBPotions.LONG_RAPIDITY);
        //builder.addMix(EBPotions.RAPIDITY, Items.GLOWSTONE_DUST, EBPotions.STRONG_RAPIDITY); intentionally left out for now
    }
}