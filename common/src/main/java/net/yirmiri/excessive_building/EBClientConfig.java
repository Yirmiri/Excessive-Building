package net.yirmiri.excessive_building;

import net.neoforged.neoforge.common.ModConfigSpec;

public class EBClientConfig {
    public static final ModConfigSpec CLIENT;
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    //CLIENT
    public static final ModConfigSpec.BooleanValue ENABLE_CUSTOM_TOOLTIPS;
    public static final ModConfigSpec.BooleanValue ENABLE_HAMMERABLE_TOOLTIPS;

    static {
        //CLIENT TOGGLES
        BUILDER.push("Client Toggles").comment("Disabling these will make the corresponding feature not show on the client");

        ENABLE_CUSTOM_TOOLTIPS = BUILDER
                .comment("Should Excessive Building items with special interactions have custom tooltips? (default: true)")
                .define("enableCustomTooltips", true);

        ENABLE_HAMMERABLE_TOOLTIPS = BUILDER
                .comment("Should blocks that can be hammered display an informational tooltip? (default: true)")
                .define("enableHammerableTooltips", true);

        BUILDER.pop();
        CLIENT = BUILDER.build();
    }
}
