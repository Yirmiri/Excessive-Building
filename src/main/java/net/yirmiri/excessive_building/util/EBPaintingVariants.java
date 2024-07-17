package net.yirmiri.excessive_building.util;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintingVariants {
    //PLACEABLE
    public static final RegistryKey<PaintingVariant> FORGOTTEN_KINGDOM = of("forgotten_kingdom");
    public static final RegistryKey<PaintingVariant> BEACON_OF_THE_DESERT = of("beacon_of_the_desert");
    public static final RegistryKey<PaintingVariant> BEACON_OF_THE_DESERT_TRIMMED = of("beacon_of_the_desert_trimmed");
    public static final RegistryKey<PaintingVariant> BURRITO = of("burrito");
    public static final RegistryKey<PaintingVariant> COURBET_ORIGINAL = of("courbet_original");
    public static final RegistryKey<PaintingVariant> CRASH_LANDING = of("crash_landing");
    public static final RegistryKey<PaintingVariant> FIT_FOR_A_QUEEN = of("fit_for_a_queen");
    public static final RegistryKey<PaintingVariant> FLOORS = of("floors");
    public static final RegistryKey<PaintingVariant> HORIZON = of("horizon");
    public static final RegistryKey<PaintingVariant> IMMINENT_DETONATION = of("imminent_detonation");
    public static final RegistryKey<PaintingVariant> KOLOS_BUG = of("kolos_bug");
    public static final RegistryKey<PaintingVariant> LONE_BRIDGE = of("lone_bridge");
    public static final RegistryKey<PaintingVariant> LONG_TRIPS = of("long_trips");
    public static final RegistryKey<PaintingVariant> PALEOBOTANY = of("paleobotany");
    public static final RegistryKey<PaintingVariant> PUFFERLIGHT = of("pufferlight");
    public static final RegistryKey<PaintingVariant> SCOURGE_BRINGER = of("scourge_bringer");
    public static final RegistryKey<PaintingVariant> SNIFFING_IN_THE_PINE_FOREST = of("sniffing_in_the_pine_forest");
    public static final RegistryKey<PaintingVariant> STAGE_ORIGINAL = of("stage_original");
    public static final RegistryKey<PaintingVariant> THE_END = of("the_end");
    public static final RegistryKey<PaintingVariant> THE_LONE_TREE = of("the_lone_tree");
    public static final RegistryKey<PaintingVariant> THINE_HOLY_PEANUT = of("thine_holy_peanut");
    public static final RegistryKey<PaintingVariant> WHY_DO_MY_EYES_HURT = of("why_do_my_eyes_hurt");
    public static final RegistryKey<PaintingVariant> EVIL_EYE = of("evil_eye");
    public static final RegistryKey<PaintingVariant> CATASTROPHES_BEFORE_THE_CALAMITY = of("catastrophes_before_the_calamity");

    //CREATIVE
    public static final RegistryKey<PaintingVariant> REBELLIOUS = of("rebellious");

    public static void bootstrap(Registerable<PaintingVariant> registry) {
            register(registry, FORGOTTEN_KINGDOM, 2, 1);
            register(registry, BEACON_OF_THE_DESERT, 1, 2);
            register(registry, BEACON_OF_THE_DESERT_TRIMMED, 1, 2);
            register(registry, BURRITO, 1, 1);
            register(registry, COURBET_ORIGINAL, 2, 1);
            register(registry, CRASH_LANDING, 5, 3);
            register(registry, FIT_FOR_A_QUEEN, 1, 1);
            register(registry, FLOORS, 1, 1);
            register(registry, HORIZON, 2, 2);
            register(registry, IMMINENT_DETONATION, 5, 3);
            register(registry, KOLOS_BUG, 2, 2);
            register(registry, LONE_BRIDGE, 4, 2);
            register(registry, LONG_TRIPS, 4, 6);
            register(registry, PALEOBOTANY, 3, 3);
            register(registry, PUFFERLIGHT, 4, 2);
            register(registry, SCOURGE_BRINGER, 5, 3);
            register(registry, SNIFFING_IN_THE_PINE_FOREST, 4, 3);
            register(registry, STAGE_ORIGINAL, 2, 2);
            register(registry, THE_END, 5, 3);
            register(registry, THE_LONE_TREE, 2, 2);
            register(registry, THINE_HOLY_PEANUT, 2, 1);
            register(registry, WHY_DO_MY_EYES_HURT, 5, 3);
            register(registry, EVIL_EYE, 2, 2);
            register(registry, CATASTROPHES_BEFORE_THE_CALAMITY, 7, 4);

            //CREATIVE
            register(registry, REBELLIOUS, 8, 8);
    }

    private static void register(Registerable<PaintingVariant> registry, RegistryKey<PaintingVariant> key, int width, int height) {
        registry.register(key, new PaintingVariant(width, height, key.getValue()));
    }

    private static RegistryKey<PaintingVariant> of(String id) {
        return RegistryKey.of(RegistryKeys.PAINTING_VARIANT, Identifier.of(ExcessiveBuilding.MOD_ID, id));
    }
}
