package net.yirmiri.excessive_building.platform;

import net.yirmiri.excessive_building.ExcessiveBuilding;
import net.yirmiri.excessive_building.platform.services.PlatformHelper;
import net.yirmiri.excessive_building.platform.services.RegistryHelper;

import java.util.ServiceLoader;

public class Services {
    public static final RegistryHelper REGISTRY = load(RegistryHelper.class);

    public static final PlatformHelper PLATFORM = load(PlatformHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        ExcessiveBuilding.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
