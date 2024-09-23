package net.yirmiri.excessive_building;

import net.minecraftforge.common.ForgeConfigSpec;

public class EBClientConfig {
    public static final ForgeConfigSpec CLIENT;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    //CLIENT
    public static final ForgeConfigSpec.BooleanValue ENABLE_CUSTOM_TOOLTIPS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CONTRIBUTOR_CAPES;

    static {
        //CLIENT TOGGLES
        BUILDER.push("Client Toggles");
        BUILDER.comment("Disabling these will make the corresponding feature not show on the client");

        ENABLE_CUSTOM_TOOLTIPS = BUILDER
                .comment("Should Excessive Building items with special interactions have custom tooltips? (default: true)")
                .define("enableCustomTooltips", true);

        ENABLE_CONTRIBUTOR_CAPES = BUILDER
                .comment("Should Excessive Building display contributor capes? (default: true)")
                .define("enableContributorCapes", true);

        BUILDER.pop();
        CLIENT = BUILDER.build();
    }
}
