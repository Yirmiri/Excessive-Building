package net.yirmiri.excessive_building;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yirmiri.excessive_building.common.util.BlockTransmutation;
import net.yirmiri.excessive_building.common.util.EBUtil;
import net.yirmiri.excessive_building.core.registry.EBBlocks;

@Mod(ExcessiveBuilding.MOD_ID)
public class ForgeExcessiveBuilding {
    public ForgeExcessiveBuilding() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ExcessiveBuilding.init();

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::onRegisterReloadListeners);
        eventBus.addListener(this::playerRightClickInteractEvent);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        ExcessiveBuildingClient.clientinit();
    }

    @SubscribeEvent
    public void onRegisterReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new BlockTransmutation());
    }

    @SubscribeEvent
    public void playerRightClickInteractEvent(PlayerInteractEvent.RightClickBlock event) {
        if (!event.getLevel().isClientSide()) {
            Player player = event.getEntity();
            BlockPos pos = event.getPos();
            ItemStack stack = player.getItemInHand(event.getHand());
            BlockTransmutation.TransmutationRule rule = BlockTransmutation.getResult(event.getLevel().getBlockState(pos).getBlock(), stack.getItem());

            if (rule != null) {
                BlockState originalState = event.getLevel().getBlockState(pos);
                BlockState newState = rule.resultBlock().defaultBlockState();
                BlockState newStateWithProperties = EBUtil.copyBlockProperties(originalState, newState);

                event.getLevel().setBlock(pos, newStateWithProperties, 3);

                if (rule.soundEvent() != null) {
                    event.getLevel().playSound(null, pos, BuiltInRegistries.SOUND_EVENT.get(rule.soundEvent()), SoundSource.BLOCKS, 1.0F, 1.0F);
                }

                if (!player.isCreative()) {
                    if (stack.isDamageableItem()) {
                        stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(event.getHand()));
                    } else {
                        stack.shrink(1);
                    }
                }

                event.setCancellationResult(InteractionResult.SUCCESS);
                event.setCanceled(true);
            }
        }
    }
}