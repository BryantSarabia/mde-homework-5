package it.univaq.mde.streamingplatform.plugin;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;


import StreamingPlatform.Message;
import StreamingPlatform.StreamingPlatformFactory;

public class MessageUtils {
    public static Message create(String content, String description) {
        Message message = StreamingPlatformFactory.eINSTANCE.createMessage();
        message.setMessageID(UUID.randomUUID());
        message.setContent(content);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        message.setTimestamp(timestamp);
        return message;
    }

    public static Diagnostic validate(Message message) {
        return Diagnostician.INSTANCE.validate(message);
    }

}
