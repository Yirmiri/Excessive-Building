package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBAttributes {
    public static final Holder<Attribute> PLACEMENT_DELAY = register("generic.placement_delay", new RangedAttribute(
            "attribute.excessive_building.placement_delay", 0.0, -4.0, 4.0).setSentiment(Attribute.Sentiment.NEGATIVE).setSyncable(true));

    public static Holder<Attribute> register(String id, Attribute supplier) {
        return RLServices.REGISTRY.registerAttribute(ExcessiveBuilding.MOD_ID, id, supplier);
    }

    public static void load() {
    }
}
