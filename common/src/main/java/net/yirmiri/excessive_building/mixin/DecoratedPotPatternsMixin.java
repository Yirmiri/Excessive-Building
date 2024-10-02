package net.yirmiri.excessive_building.mixin;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.DecoratedPotPatterns;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DecoratedPotPatterns.class)
public abstract class DecoratedPotPatternsMixin {

    @Inject(method = "fromSherd", at = @At("RETURN"), cancellable = true)
    private static void fromSherd(Item item, CallbackInfoReturnable<ResourceKey<String>> cir) {
        if (item == EBItems.ROYALTY_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.ROYALTY_POTTERY_PATTERN);
        }
        if (item == EBItems.ANCIENT_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.ANCIENT_POTTERY_PATTERN);
        }
        if (item == EBItems.BITTER_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.BITTER_POTTERY_PATTERN);
        }
        if (item == EBItems.BOIN_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.BOIN_POTTERY_PATTERN);
        }
        if (item == EBItems.BUSTLING_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.BUSTLING_POTTERY_PATTERN);
        }
        if (item == EBItems.CHECKERED_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.CHECKERED_POTTERY_PATTERN);
        }
        if (item == EBItems.DECAY_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.DECAY_POTTERY_PATTERN);
        }
        if (item == EBItems.DESTRUCTION_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.DESTRUCTION_POTTERY_PATTERN);
        }
        if (item == EBItems.FORWARDS_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.FORWARDS_POTTERY_PATTERN);
        }
        if (item == EBItems.HEXXED_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.HEXXED_POTTERY_PATTERN);
        }
        if (item == EBItems.KITTEH_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.KITTEH_POTTERY_PATTERN);
        }
        if (item == EBItems.LIFE_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.LIFE_POTTERY_PATTERN);
        }
        if (item == EBItems.PORTAL_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.PORTAL_POTTERY_PATTERN);
        }
        if (item == EBItems.POTTERY_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.POTTERY_POTTERY_PATTERN);
        }
        if (item == EBItems.RING_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.RING_POTTERY_PATTERN);
        }
        if (item == EBItems.SNOUT_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.SNOUT_POTTERY_PATTERN);
        }
        if (item == EBItems.SPRITE_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.SPRITE_POTTERY_PATTERN);
        }
        if (item == EBItems.TWINS_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.TWINS_POTTERY_PATTERN);
        }
        if (item == EBItems.WRATHFUL_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.WRATHFUL_POTTERY_PATTERN);
        }
        if (item == EBItems.IS_THAT_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.IS_THAT_POTTERY_PATTERN);
        }
        if (item == EBItems.MESMERIZE_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.MESMERIZE_POTTERY_PATTERN);
        }
        if (item == EBItems.KOKOS_BUG_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.KOKOS_BUG_POTTERY_PATTERN);
        }
        if (item == EBItems.THIEF_POTTERY_SHERD) {
            cir.setReturnValue(EBDecoratedPotPatterns.THIEF_POTTERY_PATTERN);
        }
    }


    @Inject(method = "registerAndGetDefault", at = @At("TAIL"))
    private static void arts_and_crafts_bootstrap(Registry<String> registry, CallbackInfoReturnable<String> cir) {
        Registry.register(registry, EBDecoratedPotPatterns.ROYALTY_POTTERY_PATTERN, "royalty_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.ANCIENT_POTTERY_PATTERN, "ancient_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.BITTER_POTTERY_PATTERN, "bitter_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.BOIN_POTTERY_PATTERN, "boin_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.BUSTLING_POTTERY_PATTERN, "bustling_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.CHECKERED_POTTERY_PATTERN, "checkered_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.DECAY_POTTERY_PATTERN, "decay_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.DESTRUCTION_POTTERY_PATTERN, "destruction_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.FORWARDS_POTTERY_PATTERN, "forwards_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.HEXXED_POTTERY_PATTERN, "hexxed_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.KITTEH_POTTERY_PATTERN, "kitteh_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.LIFE_POTTERY_PATTERN, "life_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.PORTAL_POTTERY_PATTERN, "portal_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.POTTERY_POTTERY_PATTERN, "pottery_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.RING_POTTERY_PATTERN, "ring_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.SNOUT_POTTERY_PATTERN, "snout_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.SPRITE_POTTERY_PATTERN, "sprite_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.TWINS_POTTERY_PATTERN, "twins_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.WRATHFUL_POTTERY_PATTERN, "wrathful_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.IS_THAT_POTTERY_PATTERN, "is_that_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.MESMERIZE_POTTERY_PATTERN, "mesmerize_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.KOKOS_BUG_POTTERY_PATTERN, "kokos_bug_pottery_pattern");
        Registry.register(registry, EBDecoratedPotPatterns.THIEF_POTTERY_PATTERN, "thief_pottery_pattern");
    }
}