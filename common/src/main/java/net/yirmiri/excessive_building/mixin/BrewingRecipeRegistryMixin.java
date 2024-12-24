package net.yirmiri.excessive_building.mixin;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.registry.EBPotions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PotionBrewing.class)
public class BrewingRecipeRegistryMixin {
    @Inject(method = "addVanillaMixes", at = @At("TAIL"))
    private static void excessiveBuilding_registerDefaults(PotionBrewing.Builder builder, CallbackInfo ci) {
        builder.addMix(Potions.WATER, EBItems.ANCIENT_FRUIT.value(), Potions.MUNDANE);

        builder.addMix(Potions.AWKWARD, EBItems.ANCIENT_FRUIT.value(), EBPotions.REACHING);
        builder.addMix(EBPotions.REACHING, Items.REDSTONE, EBPotions.LONG_REACHING);
        builder.addMix(EBPotions.REACHING, Items.GLOWSTONE_DUST, EBPotions.STRONG_REACHING);

        builder.addMix(EBPotions.REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.SHORTENING);
        builder.addMix(EBPotions.SHORTENING, Items.REDSTONE, EBPotions.LONG_SHORTENING);
        builder.addMix(EBPotions.SHORTENING, Items.GLOWSTONE_DUST, EBPotions.STRONG_SHORTENING);
        builder.addMix(EBPotions.LONG_REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.LONG_SHORTENING);
        builder.addMix(EBPotions.STRONG_REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.STRONG_SHORTENING);
    }
}
