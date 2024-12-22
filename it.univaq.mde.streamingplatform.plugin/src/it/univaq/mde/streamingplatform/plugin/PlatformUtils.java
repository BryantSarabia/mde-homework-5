package it.univaq.mde.streamingplatform.plugin;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.Platform;
import StreamingPlatform.Region;
import StreamingPlatform.Language;
import StreamingPlatform.Device;
import StreamingPlatform.Resolution;

public class PlatformUtils {
    public static Platform create(String name, float version, String description,
         Region[] supportedRegions, Language[] supportedLanguages, Device[] supportedDevices,
          Resolution[] supportedResolutions) {
        Platform platform = StreamingPlatformFactory.eINSTANCE.createPlatform();
        platform.setPlatformID(UUID.randomUUID());
        platform.setCreatedAt(new Date());
        platform.setName(name);
        platform.setVersion(version);
        platform.setDescription(description);
        platform.getSupportedRegions().addAll(Arrays.asList(supportedRegions));
        platform.getSupportedLanguages().addAll(Arrays.asList(supportedLanguages));
        platform.getSupportedDevices().addAll(Arrays.asList(supportedDevices));
        platform.getSupportedResolutions().addAll(Arrays.asList(supportedResolutions));
        return platform;
    }

    public static Diagnostic validate(Platform platform) {
        return Diagnostician.INSTANCE.validate(platform);
    }

}
