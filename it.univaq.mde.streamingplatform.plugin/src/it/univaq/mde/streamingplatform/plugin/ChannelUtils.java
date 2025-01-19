package it.univaq.mde.streamingplatform.plugin;


import java.util.Date;

import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;

import org.eclipse.emf.ecore.util.Diagnostician;


import StreamingPlatform.Channel;
import StreamingPlatform.StreamingPlatformFactory;

public class ChannelUtils {
    public static Channel create(String name, String description) {
        Channel channel = StreamingPlatformFactory.eINSTANCE.createChannel();
        channel.setChannelID(UUID.randomUUID().toString());
        channel.setName(name);
        channel.setDescription(description);
        channel.setCreatedAt(new Date());
        return channel;
    }

    public final static String FILENAME = "testChannel.xmi";

    public static Diagnostic validate(Channel channel) {
        return Diagnostician.INSTANCE.validate(channel);
    }

}
