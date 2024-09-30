package net.yirmiri.excessive_building.mixin;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.registry.EBPotions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public abstract class BrewingRecipeRegistryMixin {
    @Inject(method = "registerDefaults", at = @At("TAIL"))
    private static void excessiveBuilding_registerDefaults(BrewingRecipeRegistry.Builder builder, CallbackInfo ci) {
        builder.registerPotionRecipe(Potions.WATER, EBItems.ANCIENT_FRUIT, Potions.MUNDANE);

        builder.registerPotionRecipe(Potions.AWKWARD, EBItems.ANCIENT_FRUIT, EBPotions.REACHING);
        builder.registerPotionRecipe(EBPotions.REACHING, Items.REDSTONE, EBPotions.LONG_REACHING);
        builder.registerPotionRecipe(EBPotions.REACHING, Items.GLOWSTONE_DUST, EBPotions.STRONG_REACHING);

        builder.registerPotionRecipe(EBPotions.REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.SHORTENING);
        builder.registerPotionRecipe(EBPotions.SHORTENING, Items.REDSTONE, EBPotions.LONG_SHORTENING);
        builder.registerPotionRecipe(EBPotions.SHORTENING, Items.GLOWSTONE_DUST, EBPotions.STRONG_SHORTENING);
        builder.registerPotionRecipe(EBPotions.LONG_REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.LONG_SHORTENING);
        builder.registerPotionRecipe(EBPotions.STRONG_REACHING, Items.FERMENTED_SPIDER_EYE, EBPotions.STRONG_SHORTENING);
    }
}
