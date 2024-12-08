package net.yirmiri.excessive_building.util;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintingVariants {
    //PLACEABLE
    public static PaintingVariant FORGOTTEN_KINGDOM;
    public static PaintingVariant BEACON_OF_THE_DESERT;
    public static PaintingVariant BEACON_OF_THE_DESERT_TRIMMED;
    public static PaintingVariant BURRITO;
    public static PaintingVariant COURBET_ORIGINAL;
    public static PaintingVariant CRASH_LANDING;
    public static PaintingVariant FIT_FOR_A_QUEEN;
    public static PaintingVariant FLOORS;
    public static PaintingVariant HORIZON;
    public static PaintingVariant IMMINENT_DETONATION;
    public static PaintingVariant KOLOS_BUG;
    public static PaintingVariant LONE_BRIDGE;
    public static PaintingVariant LONG_TRIPS;
    public static PaintingVariant PALEOBOTANY;
    public static PaintingVariant PUFFERLIGHT;
    public static PaintingVariant SCOURGE_BRINGER;
    public static PaintingVariant SNIFFING_IN_THE_PINE_FOREST;
    public static PaintingVariant STAGE_ORIGINAL;
    public static PaintingVariant THE_END;
    public static PaintingVariant THE_LONE_TREE;
    public static PaintingVariant THINE_HOLY_PEANUT;
    public static PaintingVariant WHY_DO_MY_EYES_HURT;
    public static PaintingVariant EVIL_EYE;
    public static PaintingVariant CATASTROPHES_BEFORE_THE_CALAMITY;
    public static PaintingVariant TERRAIN;

    //CREATIVE
    public static PaintingVariant REBELLIOUS;
    public static PaintingVariant GOODIE_MALK;

    public static void loadEBPaintings() {
        //PLACEABLE
        FORGOTTEN_KINGDOM = register("forgotten_kingdom", new PaintingVariant(32, 16));
        BEACON_OF_THE_DESERT = register("beacon_of_the_desert", new PaintingVariant(16, 32));
        BEACON_OF_THE_DESERT_TRIMMED = register("beacon_of_the_desert_trimmed", new PaintingVariant(16, 32));
        BURRITO = register("burrito", new PaintingVariant(16, 16));
        COURBET_ORIGINAL = register("courbet_original", new PaintingVariant(32, 16));
        CRASH_LANDING = register("crash_landing", new PaintingVariant(80, 48));
        FIT_FOR_A_QUEEN = register("fit_for_a_queen", new PaintingVariant(16, 16));
        FLOORS = register("floors", new PaintingVariant(16, 16));
        HORIZON = register("horizon", new PaintingVariant(32, 32));
        IMMINENT_DETONATION = register("imminent_detonation", new PaintingVariant(80, 48));
        KOLOS_BUG = register("kolos_bug", new PaintingVariant(48, 48));
        LONE_BRIDGE = register("lone_bridge", new PaintingVariant(64, 32));
        LONG_TRIPS = register("long_trips", new PaintingVariant(64, 96));
        PALEOBOTANY = register("paleobotany", new PaintingVariant(48, 48));
        PUFFERLIGHT = register("pufferlight", new PaintingVariant(64, 32));
        SCOURGE_BRINGER = register("scourge_bringer", new PaintingVariant(80, 48));
        SNIFFING_IN_THE_PINE_FOREST = register("sniffing_in_the_pine_forest", new PaintingVariant(64, 48));
        STAGE_ORIGINAL = register("stage_original", new PaintingVariant(32, 32));
        THE_END = register("the_end", new PaintingVariant(80, 48));
        THE_LONE_TREE = register("the_lone_tree", new PaintingVariant(32, 32));
        THINE_HOLY_PEANUT = register("thine_holy_peanut", new PaintingVariant(32, 16));
        WHY_DO_MY_EYES_HURT = register("why_do_my_eyes_hurt", new PaintingVariant(80, 32));
        EVIL_EYE = register("evil_eye", new PaintingVariant(32, 32));
        CATASTROPHES_BEFORE_THE_CALAMITY = register("catastrophes_before_the_calamity", new PaintingVariant(112, 64));
        TERRAIN = register("terrain", new PaintingVariant(48, 48));

        //CREATIVE
        REBELLIOUS = register("rebellious", new PaintingVariant(128, 128));
        GOODIE_MALK = register("goodiemalk", new PaintingVariant(64, 64));
    }

    private static PaintingVariant register(String id, PaintingVariant variant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(ExcessiveBuilding.MOD_ID, id), variant);
    }
}
