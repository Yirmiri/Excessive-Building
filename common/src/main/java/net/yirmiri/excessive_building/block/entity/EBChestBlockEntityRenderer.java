package net.yirmiri.excessive_building.block.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import net.minecraft.client.render.block.entity.LightmapCoordinatesRetriever;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.EBChestBlock;

import java.util.Calendar;

@Environment(EnvType.CLIENT)
public class EBChestBlockEntityRenderer extends ChestBlockEntityRenderer<EBChestBlockEntity> {
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

    public EBChestBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        super(ctx);
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            christmas = true;
        }

        ModelPart modelPart = ctx.getLayerModelPart(EntityModelLayers.CHEST);
        singleChestBase = modelPart.getChild("bottom");
        singleChestLid = modelPart.getChild("lid");
        singleChestLatch = modelPart.getChild("lock");
        ModelPart modelPart2 = ctx.getLayerModelPart(EntityModelLayers.DOUBLE_CHEST_LEFT);
        doubleChestLeftBase = modelPart2.getChild("bottom");
        doubleChestLeftLid = modelPart2.getChild("lid");
        doubleChestLeftLatch = modelPart2.getChild("lock");
        ModelPart modelPart3 = ctx.getLayerModelPart(EntityModelLayers.DOUBLE_CHEST_RIGHT);
        doubleChestRightBase = modelPart3.getChild("bottom");
        doubleChestRightLid = modelPart3.getChild("lid");
        doubleChestRightLatch = modelPart3.getChild("lock");
    }

    public static SpriteIdentifier createChestTextureId(String path) {
        return new SpriteIdentifier(TexturedRenderLayers.CHEST_ATLAS_TEXTURE, Identifier.of(ExcessiveBuilding.MOD_ID, "entity/chest/" + path));
    }

    private static SpriteIdentifier getChestTextureId(ChestType type, SpriteIdentifier single, SpriteIdentifier left, SpriteIdentifier right) {
        return switch (type) {
            case LEFT -> left;
            case RIGHT -> right;
            default -> single;
        };
    }

    private SpriteIdentifier getChestTexture(EBChestBlockEntity entity, ChestType chestType, WoodType woodType) {
        if (christmas) {
            return TexturedRenderLayers.getChestTextureId(entity, chestType, true);
        } else {
            return getChestTextureId(chestType,
                    createChestTextureId(woodType.name()),
                    createChestTextureId(woodType.name() + "_left"),
                    createChestTextureId(woodType.name() + "_right"));
        }
    }

    @Override
    public void render(EBChestBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        World world = entity.getWorld();
        boolean bl = world != null;
        BlockState blockState = bl ? entity.getCachedState() : Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, Direction.SOUTH);
        ChestType chestType = blockState.contains(ChestBlock.CHEST_TYPE) ? blockState.get(ChestBlock.CHEST_TYPE) : ChestType.SINGLE;
        WoodType woodType = EBChestBlock.getType(blockState.getBlock());
        if (blockState.getBlock() instanceof AbstractChestBlock<?> abstractChestBlock) {
            boolean bl2 = chestType != ChestType.SINGLE;
            matrices.push();
            float f = (blockState.get(ChestBlock.FACING)).asRotation();
            matrices.translate(0.5F, 0.5F, 0.5F);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-f));
            matrices.translate(-0.5F, -0.5F, -0.5F);
            DoubleBlockProperties.PropertySource<? extends ChestBlockEntity> propertySource;
            if (bl) {
                propertySource = abstractChestBlock.getBlockEntitySource(blockState, world, entity.getPos(), true);
            } else {
                propertySource = DoubleBlockProperties.PropertyRetriever::getFallback;
            }

            float g = propertySource.apply(ChestBlock.getAnimationProgressRetriever(entity)).get(tickDelta);
            g = 1.0F - g;
            g = 1.0F - g * g * g;
            int i = propertySource.apply(new LightmapCoordinatesRetriever<>()).applyAsInt(light);
            SpriteIdentifier spriteIdentifier = getChestTexture(entity, chestType, woodType);
            VertexConsumer vertexConsumer = spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityCutout);
            if (bl2) {
                if (chestType == ChestType.LEFT) {
                    render(matrices, vertexConsumer, doubleChestLeftLid, doubleChestLeftLatch, doubleChestLeftBase, g, i, overlay);
                } else {
                    render(matrices, vertexConsumer, doubleChestRightLid, doubleChestRightLatch, doubleChestRightBase, g, i, overlay);
                }
            } else {
                render(matrices, vertexConsumer, singleChestLid, singleChestLatch, singleChestBase, g, i, overlay);
            }

            matrices.pop();
        }
    }
}
