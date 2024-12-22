package it.univaq.mde.streamingplatform.plugin;

import java.util.Arrays;

import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.Category;
import StreamingPlatform.Clip;
import StreamingPlatform.Resolution;
import StreamingPlatform.StreamingPlatformFactory;


public class ClipUtils {
    public static Clip create(String title, Category category, String[] tags, Resolution[] resolutions, String description ) {
        Clip clip = StreamingPlatformFactory.eINSTANCE.createClip();
        clip.setClipID(UUID.randomUUID());
        clip.setTitle(title);
        clip.setCategory(category);
        clip.setDescription(description);
        clip.setViewCount(0);
        clip.getTags().addAll(Arrays.asList(tags));
		clip.getResolutions().addAll(Arrays.asList(resolutions));
        return clip;
    }

    public final static String FILENAME = "testClip.xmi";

    public static Diagnostic validate(Clip clip) {
        return Diagnostician.INSTANCE.validate(clip);
    }
}
