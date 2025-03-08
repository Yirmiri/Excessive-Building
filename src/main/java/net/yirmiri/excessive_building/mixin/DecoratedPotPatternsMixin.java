package net.yirmiri.excessive_building.mixin;

import net.minecraft.block.DecoratedPotPatterns;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.yirmiri.excessive_building.registry.EBItems;
import net.yirmiri.excessive_building.util.EBDecoratedPotPatterns;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(DecoratedPotPatterns.class)
public abstract class DecoratedPotPatternsMixin {
    @Unique
    private static final Map<Item, RegistryKey<String>> ITEMS_TO_PATTERN_MAP = Map.ofEntries(
            Map.entry(EBItems.ROYALTY_POTTERY_SHERD, EBDecoratedPotPatterns.ROYALTY_POTTERY_PATTERN),
            Map.entry(EBItems.ANCIENT_POTTERY_SHERD, EBDecoratedPotPatterns.ANCIENT_POTTERY_PATTERN),
            Map.entry(EBItems.BITTER_POTTERY_SHERD, EBDecoratedPotPatterns.BITTER_POTTERY_PATTERN),
            Map.entry(EBItems.BOIN_POTTERY_SHERD, EBDecoratedPotPatterns.BOIN_POTTERY_PATTERN),
            Map.entry(EBItems.BUSTLING_POTTERY_SHERD, EBDecoratedPotPatterns.BUSTLING_POTTERY_PATTERN),
            Map.entry(EBItems.CHECKERED_POTTERY_SHERD, EBDecoratedPotPatterns.CHECKERED_POTTERY_PATTERN),
            Map.entry(EBItems.DECAY_POTTERY_SHERD, EBDecoratedPotPatterns.DECAY_POTTERY_PATTERN),
            Map.entry(EBItems.DESTRUCTION_POTTERY_SHERD, EBDecoratedPotPatterns.DESTRUCTION_POTTERY_PATTERN),
            Map.entry(EBItems.FORWARDS_POTTERY_SHERD, EBDecoratedPotPatterns.FORWARDS_POTTERY_PATTERN),
            Map.entry(EBItems.HEXXED_POTTERY_SHERD, EBDecoratedPotPatterns.HEXXED_POTTERY_PATTERN),
            Map.entry(EBItems.KITTEH_POTTERY_SHERD, EBDecoratedPotPatterns.KITTEH_POTTERY_PATTERN),
            Map.entry(EBItems.LIFE_POTTERY_SHERD, EBDecoratedPotPatterns.LIFE_POTTERY_PATTERN),
            Map.entry(EBItems.PORTAL_POTTERY_SHERD, EBDecoratedPotPatterns.PORTAL_POTTERY_PATTERN),
            Map.entry(EBItems.POTTERY_POTTERY_SHERD, EBDecoratedPotPatterns.POTTERY_POTTERY_PATTERN),
            Map.entry(EBItems.RING_POTTERY_SHERD, EBDecoratedPotPatterns.RING_POTTERY_PATTERN),
            Map.entry(EBItems.SNOUT_POTTERY_SHERD, EBDecoratedPotPatterns.SNOUT_POTTERY_PATTERN),
            Map.entry(EBItems.SPRITE_POTTERY_SHERD, EBDecoratedPotPatterns.SPRITE_POTTERY_PATTERN),
            Map.entry(EBItems.TWINS_POTTERY_SHERD, EBDecoratedPotPatterns.TWINS_POTTERY_PATTERN),
            Map.entry(EBItems.WRATHFUL_POTTERY_SHERD, EBDecoratedPotPatterns.WRATHFUL_POTTERY_PATTERN),
            Map.entry(EBItems.IS_THAT_POTTERY_SHERD, EBDecoratedPotPatterns.IS_THAT_POTTERY_PATTERN),
            Map.entry(EBItems.MESMERIZE_POTTERY_SHERD, EBDecoratedPotPatterns.MESMERIZE_POTTERY_PATTERN),
            Map.entry(EBItems.KOKOS_BUG_POTTERY_SHERD, EBDecoratedPotPatterns.KOKOS_BUG_POTTERY_PATTERN),
            Map.entry(EBItems.THIEF_POTTERY_SHERD, EBDecoratedPotPatterns.THIEF_POTTERY_PATTERN)
    );

    @Inject(method = "fromSherd", at = @At("RETURN"), cancellable = true)
    private static void excessiveBuilding$fromSherd(Item item, CallbackInfoReturnable<RegistryKey<String>> cir) {
        RegistryKey<String> patterns = ITEMS_TO_PATTERN_MAP.get(item);
        if (patterns != null) {
            cir.setReturnValue(patterns);
        }
    }


    @Inject(method = "registerAndGetDefault", at = @At("TAIL"))
    private static void excessiveBuilding$bootstrap(Registry<String> registry, CallbackInfoReturnable<String> cir) {
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