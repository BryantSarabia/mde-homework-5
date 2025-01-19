package it.univaq.mde.streamingplatform.plugin;


import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.Emote;
import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.UnlockCondition;

public class EmoteUtils {
	
    public static Emote create(String name, short tenure ,String description ) {
        Emote emote = StreamingPlatformFactory.eINSTANCE.createEmote();
        emote.setEmoteID(UUID.randomUUID().toString());
        emote.setName(name);
        emote.setUnlockCondition(UnlockCondition.TENURE);
        emote.setTenure(tenure);
        emote.setDescription(description);
        return emote;
    }
    
    public static Emote create(String name, float donationAmount ,String description ) {
        Emote emote = StreamingPlatformFactory.eINSTANCE.createEmote();
        emote.setEmoteID(UUID.randomUUID().toString());
        emote.setName(name);
        emote.setUnlockCondition(UnlockCondition.DONATION_AMOUNT);
        emote.setDonationAmount(donationAmount);
        emote.setDescription(description);
        return emote;
    }


    public static Diagnostic validate(Emote emote) {
        return Diagnostician.INSTANCE.validate(emote);
    }

}
