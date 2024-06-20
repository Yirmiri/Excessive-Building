package net.yirmiri.excessive_building.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.block.entity.KilnBlockEntity;

public class EBBlockEntities {
    public static final BlockEntityType<KilnBlockEntity> KILN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(ExcessiveBuilding.MOD_ID, "kiln_block_entity"),
            FabricBlockEntityTypeBuilder.create(KilnBlockEntity::new, EBBlocks.KILN).build()
    );

    public static void registerEBBlockEntities() {
    }
}
