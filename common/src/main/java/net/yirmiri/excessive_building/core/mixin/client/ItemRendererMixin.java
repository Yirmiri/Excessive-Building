package net.yirmiri.excessive_building.core.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.ItemModelShaper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.core.registry.EBItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @Shadow public abstract ItemModelShaper getItemModelShaper();

    @ModifyVariable(method = "render", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel excessiveBuilding$render(BakedModel model, ItemStack stack, ItemDisplayContext ctx, boolean leftHanded, PoseStack matrices, MultiBufferSource buffer, int light, int overlay) {
        if (stack.is(EBItems.GAUNTLET.get())) {
            if (ctx == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND || ctx == ItemDisplayContext.THIRD_PERSON_RIGHT_HAND) {
                return (this.getItemModelShaper().getModelManager()
                        .getModel(new ModelResourceLocation(ExcessiveBuilding.MOD_ID, "gauntlet_model", "inventory")));
            } else if (ctx == ItemDisplayContext.FIRST_PERSON_LEFT_HAND || ctx == ItemDisplayContext.THIRD_PERSON_LEFT_HAND) {
                return (this.getItemModelShaper().getModelManager()
                        .getModel(new ModelResourceLocation(ExcessiveBuilding.MOD_ID, "gauntlet_model_offhand", "inventory")));
            }
        }
        return model;
    }
}