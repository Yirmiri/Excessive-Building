package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.yirmiri.excessive_building.core.registry.EBParticles;

public class FrostedLanternBlock extends LanternBlock {
    public static final BooleanProperty EMITTING = BooleanProperty.create("emitting");
    private final DyeColor color;

    protected static final VoxelShape AABB = Shapes.or(Block.box(5.0F, 0.0F, 5.0F, 11.0F, 7.0F, 11.0F),
            Block.box(6.0F, 7.0F, 6.0F, 10.0F, 9.0F, 10.0F));

    protected static final VoxelShape HANGING_AABB = Shapes.or(Block.box(5.0F, 1.0F, 5.0F, 11.0F, 8.0F, 11.0F),
            Block.box(6.0F, 8.0F, 6.0F, 10.0F, 10.0F, 10.0F));

    public FrostedLanternBlock(DyeColor color, Properties properties) {
        super(properties);
        this.color = color;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(HANGING) ? HANGING_AABB : AABB;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(EMITTING);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (color != null) {
            for (int i = 0; i < random.nextIntBetweenInclusive(2, 5); i++) {
                double posX = (pos.getX() + 0.5) + ((random.nextFloat() * 10) - 5);
                double posY = (pos.getY() + 0.5) + ((random.nextFloat() * 10) - 5);
                double posZ = (pos.getZ() + 0.5) + ((random.nextFloat() * 10) - 5);

                if (state.getValue(EMITTING)) {
                    if (state.getValue(HANGING)) {
                        level.addParticle(EBParticles.FROSTED.get(), posX, posY, posZ, color.getId(), 0, 0);
                    } else {
                        level.addParticle(EBParticles.FROSTED.get(), posX, posY, posZ, color.getId(), 1, 0);
                    }
                }
            }
        }
        super.animateTick(state, level, pos, random);
    }
}
