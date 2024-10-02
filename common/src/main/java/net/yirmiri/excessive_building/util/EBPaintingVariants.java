package net.yirmiri.excessive_building.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBPaintingVariants {
    //PLACEABLE
    public static final PaintingVariant FORGOTTEN_KINGDOM = register("forgotten_kingdom", new PaintingVariant(2, 1));
    public static final PaintingVariant BEACON_OF_THE_DESERT = register("beacon_of_the_desert", new PaintingVariant(1, 2));
    public static final PaintingVariant BEACON_OF_THE_DESERT_TRIMMED = register("beacon_of_the_desert_trimmed", new PaintingVariant(1, 2));
    public static final PaintingVariant BURRITO = register("burrito", new PaintingVariant(1, 1));
    public static final PaintingVariant COURBET_ORIGINAL = register("courbet_original", new PaintingVariant(2, 1));
    public static final PaintingVariant CRASH_LANDING = register("crash_landing", new PaintingVariant(5, 3));
    public static final PaintingVariant FIT_FOR_A_QUEEN = register("fit_for_a_queen", new PaintingVariant(1, 1));
    public static final PaintingVariant FLOORS = register("floors", new PaintingVariant(1, 1));
    public static final PaintingVariant HORIZON = register("horizon", new PaintingVariant(2, 2));
    public static final PaintingVariant IMMINENT_DETONATION = register("imminent_detonation", new PaintingVariant(5, 3));
    public static final PaintingVariant KOLOS_BUG = register("kolos_bug", new PaintingVariant(2, 2));
    public static final PaintingVariant LONE_BRIDGE = register("lone_bridge", new PaintingVariant(4, 2));
    public static final PaintingVariant LONG_TRIPS = register("long_trips", new PaintingVariant(4, 6));
    public static final PaintingVariant PALEOBOTANY = register("paleobotany", new PaintingVariant(3, 3));
    public static final PaintingVariant PUFFERLIGHT = register("pufferlight", new PaintingVariant(4, 2));
    public static final PaintingVariant SCOURGE_BRINGER = register("scourge_bringer", new PaintingVariant(5, 3));
    public static final PaintingVariant SNIFFING_IN_THE_PINE_FOREST = register("sniffing_in_the_pine_forest", new PaintingVariant(4, 3));
    public static final PaintingVariant STAGE_ORIGINAL = register("stage_original", new PaintingVariant(2, 2));
    public static final PaintingVariant THE_END = register("the_end", new PaintingVariant(5, 3));
    public static final PaintingVariant THE_LONE_TREE = register("the_lone_tree", new PaintingVariant(2, 2));
    public static final PaintingVariant THINE_HOLY_PEANUT = register("thine_holy_peanut", new PaintingVariant(2, 1));
    public static final PaintingVariant WHY_DO_MY_EYES_HURT = register("why_do_my_eyes_hurt", new PaintingVariant(5, 3));
    public static final PaintingVariant EVIL_EYE = register("evil_eye", new PaintingVariant(2, 2));
    public static final PaintingVariant CATASTROPHES_BEFORE_THE_CALAMITY = register("catastrophes_before_the_calamity", new PaintingVariant(7, 4));
    public static final PaintingVariant ENDLESS = register("endless", new PaintingVariant(8, 8));
    public static final PaintingVariant ZA_HANDO = register("za_hando", new PaintingVariant(1, 1));
    public static final PaintingVariant ISAAC_WE_LOVE_YOU = register("isaac_we_love_you", new PaintingVariant(2, 2));
    public static final PaintingVariant TERRAIN = register("terrain", new PaintingVariant(3, 3));

    //CREATIVE
    public static final PaintingVariant REBELLIOUS = register("rebellious", new PaintingVariant(8, 8));
    public static final PaintingVariant GOODIE_MALK = register("goodiemalk", new PaintingVariant(4, 4));

    private static PaintingVariant register(String id, PaintingVariant variant) {
        return Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(ExcessiveBuilding.MOD_ID, id), variant);
    }

    public static void loadEBPaintings() {
    }
}
