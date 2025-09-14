package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.core.platform.Services;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.common.entity.ChairEntity;

import java.util.function.Supplier;

public class EBEntities {
    public static final Supplier<EntityType<ChairEntity>> CHAIR = register("chair", () -> EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
            .noSummon().clientTrackingRange(4).sized(0.5F, 0.15F).build(ExcessiveBuilding.MOD_ID + ":" + "chair"));

    private static <T extends EntityType<?>> Supplier<T> register(String id, Supplier<T> supplier) {
        return Services.REGISTRY.registerEntityType(ExcessiveBuilding.MOD_ID, id, supplier);
    }

    public static void loadEntities() {
    }
}
