package net.yirmiri.excessive_building.registry;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class EBPaintingVariants {
    public static final RegistryKey<PaintingVariant> FORGOTTEN_KINGDOM = of("forgotten_kingdom");

    public static void bootstrap(Registerable<PaintingVariant> registry) {
        register(registry, FORGOTTEN_KINGDOM, 2, 1);
    }

    private static void register(Registerable<PaintingVariant> registry, RegistryKey<PaintingVariant> key, int width, int height) {
        registry.register(key, new PaintingVariant(width, height, key.getValue()));
    }

    private static RegistryKey<PaintingVariant> of(String id) {
        return RegistryKey.of(RegistryKeys.PAINTING_VARIANT, Identifier.ofVanilla(id));
    }
}
