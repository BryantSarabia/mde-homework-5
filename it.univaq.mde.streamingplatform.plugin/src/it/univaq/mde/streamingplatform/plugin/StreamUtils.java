package it.univaq.mde.streamingplatform.plugin;

import java.util.Arrays;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.Category;
import StreamingPlatform.Resolution;
import StreamingPlatform.Stream;
import StreamingPlatform.StreamingPlatformFactory;

public class StreamUtils {
    public static Stream create(String title, boolean isLive,Category category, String[] tags, Resolution[] resolution, String description ) {
        Stream stream = StreamingPlatformFactory.eINSTANCE.createStream();
        stream.setStreamID(UUID.randomUUID().toString());
        stream.setTitle(title);
        stream.setIsLive(isLive);
        stream.setCategory(category);
        stream.getTags().addAll(Arrays.asList(tags));
        stream.setDescription(description);
        stream.getResolutions().addAll(Arrays.asList(resolution));
        return stream;
    }

    public static Diagnostic validate(Stream stream) {
        return Diagnostician.INSTANCE.validate(stream);
    }

}
