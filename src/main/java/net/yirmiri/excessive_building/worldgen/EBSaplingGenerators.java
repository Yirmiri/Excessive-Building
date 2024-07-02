package net.yirmiri.excessive_building.worldgen;

import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class EBSaplingGenerators {

    public static final SaplingGenerator ANCIENT = new SaplingGenerator("ancient", Optional.empty(),
            Optional.of(EBConfiguredFeatures.ANCIENT_TREE), Optional.empty()
    );
}
