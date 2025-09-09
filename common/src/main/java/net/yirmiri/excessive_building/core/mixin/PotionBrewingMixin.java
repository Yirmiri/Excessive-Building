package net.yirmiri.excessive_building.core.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(PotionBrewing.class)
public interface PotionBrewingMixin {
    @Invoker("addMix")
    static void excessiveBuilding$addMix(Potion input, Item item, Potion output) {
        throw new AssertionError();
    }
}