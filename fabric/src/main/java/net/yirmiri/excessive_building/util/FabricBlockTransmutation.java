package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.resources.ResourceLocation;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.util.BlockTransmutation;

public class FabricBlockTransmutation extends BlockTransmutation implements IdentifiableResourceReloadListener {

    @Override
    public ResourceLocation getFabricId() {
        return new ResourceLocation(ExcessiveBuilding.MOD_ID, "block_transmutations");
    }
}
