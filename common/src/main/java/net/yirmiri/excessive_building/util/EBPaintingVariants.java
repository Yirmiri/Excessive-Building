package net.yirmiri.excessive_building.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintingVariants {
    //PLACEABLE
    public static final ResourceKey<PaintingVariant> FORGOTTEN_KINGDOM = of("forgotten_kingdom");
    public static final ResourceKey<PaintingVariant> BEACON_OF_THE_DESERT = of("beacon_of_the_desert");
    public static final ResourceKey<PaintingVariant> BEACON_OF_THE_DESERT_TRIMMED = of("beacon_of_the_desert_trimmed");
    public static final ResourceKey<PaintingVariant> BURRITO = of("burrito");
    public static final ResourceKey<PaintingVariant> COURBET_ORIGINAL = of("courbet_original");
    public static final ResourceKey<PaintingVariant> CRASH_LANDING = of("crash_landing");
    public static final ResourceKey<PaintingVariant> FIT_FOR_A_QUEEN = of("fit_for_a_queen");
    public static final ResourceKey<PaintingVariant> FLOORS = of("floors");
    public static final ResourceKey<PaintingVariant> HORIZON = of("horizon");
    public static final ResourceKey<PaintingVariant> IMMINENT_DETONATION = of("imminent_detonation");
    public static final ResourceKey<PaintingVariant> KOLOS_BUG = of("kolos_bug");
    public static final ResourceKey<PaintingVariant> LONE_BRIDGE = of("lone_bridge");
    public static final ResourceKey<PaintingVariant> LONG_TRIPS = of("long_trips");
    public static final ResourceKey<PaintingVariant> PALEOBOTANY = of("paleobotany");
    public static final ResourceKey<PaintingVariant> PUFFERLIGHT = of("pufferlight");
    public static final ResourceKey<PaintingVariant> SCOURGE_BRINGER = of("scourge_bringer");
    public static final ResourceKey<PaintingVariant> SNIFFING_IN_THE_PINE_FOREST = of("sniffing_in_the_pine_forest");
    public static final ResourceKey<PaintingVariant> STAGE_ORIGINAL = of("stage_original");
    public static final ResourceKey<PaintingVariant> THE_END = of("the_end");
    public static final ResourceKey<PaintingVariant> THE_LONE_TREE = of("the_lone_tree");
    public static final ResourceKey<PaintingVariant> THINE_HOLY_PEANUT = of("thine_holy_peanut");
    public static final ResourceKey<PaintingVariant> WHY_DO_MY_EYES_HURT = of("why_do_my_eyes_hurt");
    public static final ResourceKey<PaintingVariant> EVIL_EYE = of("evil_eye");
    public static final ResourceKey<PaintingVariant> CATASTROPHES_BEFORE_THE_CALAMITY = of("catastrophes_before_the_calamity");
    public static final ResourceKey<PaintingVariant> ENDLESS = of("endless");
    public static final ResourceKey<PaintingVariant> ZA_HANDO = of("za_hando");
    public static final ResourceKey<PaintingVariant> ISAAC_WE_LOVE_YOU = of("isaac_we_love_you");
    public static final ResourceKey<PaintingVariant> TERRAIN = of("terrain");

    //CREATIVE
    public static final ResourceKey<PaintingVariant> REBELLIOUS = of("rebellious");
    public static final ResourceKey<PaintingVariant> GOODIEMALK = of("goodiemalk");

    public static void bootstrap(BootstrapContext<PaintingVariant> registry) {
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
            register(registry, ENDLESS, 8, 8);
            register(registry, ZA_HANDO, 1, 1);
            register(registry, ISAAC_WE_LOVE_YOU, 2, 2);
            register(registry, TERRAIN, 3, 3);

            //CREATIVE
            register(registry, REBELLIOUS, 8, 8);
            register(registry, GOODIEMALK, 4, 4);
    }

    private static void register(BootstrapContext<PaintingVariant> registry, ResourceKey<PaintingVariant> key, int width, int height) {
        registry.register(key, new PaintingVariant(width, height, key.location()));
    }

    private static ResourceKey<PaintingVariant> of(String id) {
        return ResourceKey.create(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, id));
    }
}
