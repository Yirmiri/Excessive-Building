package net.yirmiri.excessive_building.platform.services;

public interface EBConfigHelper {
    //CONTENT
    boolean enableHammers();
    boolean enableWrenches();
    boolean enableAsphalt();
    boolean enableVerticalStairs();
    boolean enableResourceBricks();
    boolean enableShelfVariants();
    boolean enableDecorativeShelfs();
    boolean enableCraftingTableVariants();
    boolean enableLadderVariants();
    boolean enableEBPotterySherds();
    boolean enableParticleCandles();
    boolean enableTerracottaVases();
    boolean enableDecoratives();
    boolean enableAncientSaplings();
    boolean enableGloomSeeds();

    //BALANCE
    boolean enableHammerAsWeapon();
    boolean enableEBVillagerTrades();
    boolean enableSoulMagmaBubbleColumnToggle();
    boolean enableReachingLanternFunctionality();
    int reachingLanternAmplifier();
    int reachingLanternRange();
    int reachingDuration();
    int longReachingDuration();
    int reachingAmplifier();
    int strongReachingAmplifier();
    int shorteningDuration();
    int longShorteningDuration();
    int shorteningAmplifier();
    int strongShorteningAmplifier();
    int ancientFruitDuration();
    int ancientFruitAmplifier();

    //CLIENT
    boolean enableCustomTooltips();
    boolean enableHammerableTooltips();
}
