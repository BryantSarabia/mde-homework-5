package it.univaq.mde.streamingplatform.plugin;

import java.util.Date;
import java.util.UUID;
import java.sql.Timestamp;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;


import StreamingPlatform.Reaction;
import StreamingPlatform.ReactionType;
import StreamingPlatform.StreamingPlatformFactory;

public class ReactionUtils {
    public static Reaction create(ReactionType type, String description) {
        Reaction reaction = StreamingPlatformFactory.eINSTANCE.createReaction();
        reaction.setReactionID(UUID.randomUUID().toString());
        reaction.setReactionType(type);
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        reaction.setTimestamp(timestamp);
        return reaction;
    }

    public static Diagnostic validate(Reaction reaction) {
        return Diagnostician.INSTANCE.validate(reaction);
    }
}
