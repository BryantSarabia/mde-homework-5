package it.univaq.mde.streamingplatform.plugin;

import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.Badge;
import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.UnlockCondition;

public class BadgeUtils {
	
    public static Badge create(String name, short tenure ,String description ) {
        Badge badge = StreamingPlatformFactory.eINSTANCE.createBadge();
        badge.setBadgeID(UUID.randomUUID());
        badge.setName(name);
        badge.setUnlockCondition(UnlockCondition.TENURE);
        badge.setTenure(tenure);
        badge.setDescription(description);
        return badge;
    }
    
    public static Badge create(String name, float donationAmount ,String description ) {
        Badge badge = StreamingPlatformFactory.eINSTANCE.createBadge();
        badge.setBadgeID(UUID.randomUUID());
        badge.setName(name);
        badge.setUnlockCondition(UnlockCondition.DONATION_AMOUNT);
        badge.setDonationAmount(donationAmount);
        badge.setDescription(description);
        return badge;
    }

    public final static String FILENAME = "testBadge.xmi";

    public static Diagnostic validate(Badge badge) {
        return Diagnostician.INSTANCE.validate(badge);
    }

}
