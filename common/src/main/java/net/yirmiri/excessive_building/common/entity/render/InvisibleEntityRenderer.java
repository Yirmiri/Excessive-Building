package net.yirmiri.excessive_building.common.entity.render;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class InvisibleEntityRenderer extends EntityRenderer<Entity> {
    public InvisibleEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    @Override
    public ResourceLocation getTextureLocation(net.minecraft.world.entity.Entity entity) {
        return ResourceLocation.tryBuild(ExcessiveBuilding.MOD_ID, "textures/literally_nothing");
    }
}
