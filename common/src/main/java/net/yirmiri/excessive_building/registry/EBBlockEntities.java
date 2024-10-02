package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.entity.*;

public class EBBlockEntities {

    public static final BlockEntityType<EBSignBlockEntity> EB_SIGN = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(ExcessiveBuilding.MOD_ID, "eb_sign"), FabricBlockEntityTypeBuilder.create(EBSignBlockEntity::new,
                    EBBlocks.ANCIENT_SIGN, EBBlocks.ANCIENT_WALL_SIGN,
                    EBBlocks.GLOOM_SIGN, EBBlocks.GLOOM_WALL_SIGN
            ).build());

    public static final BlockEntityType<EBHangingSignBlockEntity> EB_HANGING_SIGN = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(ExcessiveBuilding.MOD_ID, "eb_hanging_sign"), FabricBlockEntityTypeBuilder.create(EBHangingSignBlockEntity::new,
                    EBBlocks.ANCIENT_HANGING_SIGN, EBBlocks.ANCIENT_WALL_HANGING_SIGN,
                    EBBlocks.GLOOM_HANGING_SIGN, EBBlocks.GLOOM_WALL_HANGING_SIGN
            ).build());

    public static final BlockEntityType<EBChestBlockEntity> EB_CHEST = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(ExcessiveBuilding.MOD_ID, "eb_chest"), FabricBlockEntityTypeBuilder.create(EBChestBlockEntity::new//,
//                    EBBlocks.SPRUCE_CHEST, EBBlocks.BIRCH_CHEST, EBBlocks.JUNGLE_CHEST, EBBlocks.ACACIA_CHEST, EBBlocks.DARK_OAK_CHEST,
//                    EBBlocks.MANGROVE_CHEST, EBBlocks.CHERRY_CHEST, EBBlocks.BAMBOO_CHEST, EBBlocks.CRIMSON_CHEST, EBBlocks.WARPED_CHEST,
//                    EBBlocks.ANCIENT_CHEST, EBBlocks.GLOOM_CHEST
            ).build());

    public static final BlockEntityType<EBTrappedChestBlockEntity> EB_TRAPPED_CHEST = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            Identifier.of(ExcessiveBuilding.MOD_ID, "eb_trapped_chest"), FabricBlockEntityTypeBuilder.create(EBTrappedChestBlockEntity::new//,
//                    EBBlocks.TRAPPED_SPRUCE_CHEST, EBBlocks.TRAPPED_BIRCH_CHEST, EBBlocks.TRAPPED_JUNGLE_CHEST, EBBlocks.TRAPPED_ACACIA_CHEST, EBBlocks.TRAPPED_DARK_OAK_CHEST,
//                    EBBlocks.TRAPPED_MANGROVE_CHEST, EBBlocks.TRAPPED_CHERRY_CHEST, EBBlocks.TRAPPED_BAMBOO_CHEST, EBBlocks.TRAPPED_CRIMSON_CHEST, EBBlocks.TRAPPED_WARPED_CHEST,
//                    EBBlocks.TRAPPED_ANCIENT_CHEST, EBBlocks.TRAPPED_GLOOM_CHEST
            ).build());

    public static void loadBlockEntities() {
    }
}
