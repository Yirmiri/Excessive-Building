package net.yirmiri.excessive_building.core.init;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.yirmiri.excessive_building.common.util.EBFamilyTypes;

public class EBModelLayers {
    public static final ModelLayerLocation ANCIENT_SIGN = ModelLayers.createSignModelName(EBFamilyTypes.WoodTypes.ANCIENT);
    public static final ModelLayerLocation ANCIENT_HANGING_SIGN = ModelLayers.createHangingSignModelName(EBFamilyTypes.WoodTypes.ANCIENT);
    public static final ModelLayerLocation WINTERGREEN_SIGN = ModelLayers.createSignModelName(EBFamilyTypes.WoodTypes.WINTERGREEN);
    public static final ModelLayerLocation WINTERGREEN_HANGING_SIGN = ModelLayers.createHangingSignModelName(EBFamilyTypes.WoodTypes.WINTERGREEN);
}