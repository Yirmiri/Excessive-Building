package net.yirmiri.excessive_building.core.registry;

import net.azurune.runiclib.RunicLib;
import net.azurune.runiclib.core.platform.RLServices;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.yirmiri.excessive_building.ExcessiveBuilding;

public class EBSounds {
    //SOFT ROCK
    public static final Holder<SoundEvent> SOFT_ROCK_PLACE = register("block.soft_rock.place");
    public static final Holder<SoundEvent> SOFT_ROCK_STEP = register("block.soft_rock.step");
    public static final Holder<SoundEvent> SOFT_ROCK_BREAK = register("block.soft_rock.break");
    public static final Holder<SoundEvent> SOFT_ROCK_FALL = register("block.soft_rock.fall");
    public static final Holder<SoundEvent> SOFT_ROCK_HIT = register("block.soft_rock.hit");

    private static Holder<SoundEvent> register(String id) {
        return RLServices.REGISTRY.registerForHolder(BuiltInRegistries.SOUND_EVENT, ExcessiveBuilding.MOD_ID, id, SoundEvent.createVariableRangeEvent(RunicLib.customid(ExcessiveBuilding.MOD_ID, id)));
    }

    public static void load() {
    }
}
