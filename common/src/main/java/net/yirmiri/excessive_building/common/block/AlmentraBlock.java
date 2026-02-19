package net.yirmiri.excessive_building.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraft.world.phys.BlockHitResult;
import net.yirmiri.excessive_building.core.registry.EBItems;

public class AlmentraBlock extends Block {
    protected final Block block;

    public AlmentraBlock(Block block, Properties properties) {
        super(properties);
        this.block = block;
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stackHand = player.getItemInHand(hand);
        BlockState stateToReplaceWith = block.withPropertiesOf(level.getBlockState(pos));

        if (stackHand.is(EBItems.MALLET.get()) && !level.isClientSide) {
            if (stateToReplaceWith.hasProperty(StatueBlock.ROTATION)) {
                stateToReplaceWith = stateToReplaceWith.setValue(
                        StatueBlock.ROTATION,
                        Integer.valueOf(RotationSegment.convertToSegment(player.getYRot()))
                );
            }

            level.setBlock(pos, stateToReplaceWith, 3);
            level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS, 1.0F, 1.0F);

            return ItemInteractionResult.SUCCESS;
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}