package net.yirmiri.excessive_building.common.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

public class BookOfFormationsItem extends Item {
    public BookOfFormationsItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        int reach = 3;
        ItemStack stack = player.getItemInHand(hand);

        BlockPos pos = new BlockPos((int) Math.floor(player.getX() + player.getLookAngle().x * reach),
                (int) Math.floor(player.getEyeY() + player.getLookAngle().y * reach),
                (int) Math.floor(player.getZ() + player.getLookAngle().z * reach));

        if (level.getBlockState(pos).isAir() && level.getBlockState(pos.below()).getFluidState().is(FluidTags.WATER)) {
            pos = pos.below();
        }

        if (level.isInWorldBounds(pos) && level.getWorldBorder().isWithinBounds(pos) && level.getBlockState(pos).canBeReplaced()) {
            if (!level.isClientSide()) {
                level.setBlock(pos, EBBlocks.ICE_PILLAR.get().defaultBlockState(), 3);
                if (!player.getAbilities().instabuild) {
                    stack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
                }
                level.playSound(null, pos, SoundEvents.ENCHANTMENT_TABLE_USE, SoundSource.PLAYERS, 1.0F, 1.0F);

                if (level instanceof ServerLevel serverLevel) {
                    for (int i = 0; i < 20; i++) {
                        serverLevel.sendParticles(ParticleTypes.ENCHANT, pos.getX() + 0.5 + (serverLevel.random.nextDouble() - 0.5),
                                pos.getY() + 0.5 + (serverLevel.random.nextDouble() - 0.5),
                                pos.getZ() + 0.5 + (serverLevel.random.nextDouble() - 0.5), 1, 0, 0, 0, 0);
                    }
                }
            }
            return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
        }
        return InteractionResultHolder.pass(stack);
    }
}
