package net.yirmiri.excessive_building.platform;

import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.platform.services.EBRegistryHelper;
import net.yirmiri.excessive_building.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final EBRegistryHelper REGISTRY = load(EBRegistryHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        ExcessiveBuilding.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}