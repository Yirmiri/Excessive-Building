package net.yirmiri.excessive_building.block.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BrightnessCombiner;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractChestBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.EBChestBlock;

import java.util.Calendar;

@Environment(EnvType.CLIENT)
public class EBChestBlockEntityRenderer extends ChestRenderer<EBChestBlockEntity> {
    private final ModelPart singleChestLid;
    private final ModelPart singleChestBase;
    private final ModelPart singleChestLatch;
    private final ModelPart doubleChestLeftLid;
    private final ModelPart doubleChestLeftBase;
    private final ModelPart doubleChestLeftLatch;
    private final ModelPart doubleChestRightLid;
    private final ModelPart doubleChestRightBase;
    private final ModelPart doubleChestRightLatch;
    private boolean christmas;

    public EBChestBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        super(ctx);
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            christmas = true;
        }

        ModelPart modelPart = ctx.bakeLayer(ModelLayers.CHEST);
        singleChestBase = modelPart.getChild("bottom");
        singleChestLid = modelPart.getChild("lid");
        singleChestLatch = modelPart.getChild("lock");
        ModelPart modelPart2 = ctx.bakeLayer(ModelLayers.DOUBLE_CHEST_LEFT);
        doubleChestLeftBase = modelPart2.getChild("bottom");
        doubleChestLeftLid = modelPart2.getChild("lid");
        doubleChestLeftLatch = modelPart2.getChild("lock");
        ModelPart modelPart3 = ctx.bakeLayer(ModelLayers.DOUBLE_CHEST_RIGHT);
        doubleChestRightBase = modelPart3.getChild("bottom");
        doubleChestRightLid = modelPart3.getChild("lid");
        doubleChestRightLatch = modelPart3.getChild("lock");
    }

    public static Material createChestTextureId(String path) {
        return new Material(Sheets.CHEST_SHEET, ResourceLocation.fromNamespaceAndPath(ExcessiveBuilding.MOD_ID, "entity/chest/" + path));
    }

    private static Material getChestTextureId(ChestType type, Material single, Material left, Material right) {
        return switch (type) {
            case LEFT -> left;
            case RIGHT -> right;
            default -> single;
        };
    }

    private Material getChestTexture(EBChestBlockEntity entity, ChestType chestType, WoodType woodType) {
        if (christmas) {
            return Sheets.chooseMaterial(entity, chestType, true);
        } else {
            return getChestTextureId(chestType,
                    createChestTextureId(woodType.name()),
                    createChestTextureId(woodType.name() + "_left"),
                    createChestTextureId(woodType.name() + "_right"));
        }
    }

    @Override
    public void render(EBChestBlockEntity entity, float tickDelta, PoseStack matrices, MultiBufferSource vertexConsumers, int light, int overlay) {
        Level world = entity.getLevel();
        boolean bl = world != null;
        BlockState blockState = bl ? entity.getBlockState() : Blocks.CHEST.defaultBlockState().setValue(ChestBlock.FACING, Direction.SOUTH);
        ChestType chestType = blockState.hasProperty(ChestBlock.TYPE) ? blockState.getValue(ChestBlock.TYPE) : ChestType.SINGLE;
        WoodType woodType = EBChestBlock.getType(blockState.getBlock());
        if (blockState.getBlock() instanceof AbstractChestBlock<?> abstractChestBlock) {
            boolean bl2 = chestType != ChestType.SINGLE;
            matrices.pushPose();
            float f = (blockState.getValue(ChestBlock.FACING)).toYRot();
            matrices.translate(0.5F, 0.5F, 0.5F);
            matrices.mulPose(Axis.YP.rotationDegrees(-f));
            matrices.translate(-0.5F, -0.5F, -0.5F);
            DoubleBlockCombiner.NeighborCombineResult<? extends ChestBlockEntity> propertySource;
            if (bl) {
                propertySource = abstractChestBlock.combine(blockState, world, entity.getBlockPos(), true);
            } else {
                propertySource = DoubleBlockCombiner.Combiner::acceptNone;
            }

            float g = propertySource.apply(ChestBlock.opennessCombiner(entity)).get(tickDelta);
            g = 1.0F - g;
            g = 1.0F - g * g * g;
            int i = propertySource.apply(new BrightnessCombiner<>()).applyAsInt(light);
            Material spriteIdentifier = getChestTexture(entity, chestType, woodType);
            VertexConsumer vertexConsumer = spriteIdentifier.buffer(vertexConsumers, RenderType::entityCutout);
            if (bl2) {
                if (chestType == ChestType.LEFT) {
                    render(matrices, vertexConsumer, doubleChestLeftLid, doubleChestLeftLatch, doubleChestLeftBase, g, i, overlay);
                } else {
                    render(matrices, vertexConsumer, doubleChestRightLid, doubleChestRightLatch, doubleChestRightBase, g, i, overlay);
                }
            } else {
                render(matrices, vertexConsumer, singleChestLid, singleChestLatch, singleChestBase, g, i, overlay);
            }

            matrices.popPose();
        }
    }
}
