package it.univaq.mde.streamingplatform.plugin;

import java.util.UUID;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.Subscription;
import StreamingPlatform.SubscriptionDuration;
import StreamingPlatform.Tier;
import StreamingPlatform.Currency;
import StreamingPlatform.PaymentStatus;
import StreamingPlatform.PaymentMethod;

public class SubscriptionUtils {
    public static Subscription create(String name, Tier tier, float price, SubscriptionDuration subscriptionDuration, boolean autoRenewal,Currency currency, PaymentStatus paymentStatus, PaymentMethod paymentMethod, String description) {
        Subscription subscription = StreamingPlatformFactory.eINSTANCE.createSubscription();
        
        subscription.setSubscriptionID(UUID.randomUUID());
        subscription.setName(name);
        subscription.setTier(tier);
        subscription.setPrice(price);
        float amount = calculateTotalPrice(price, subscriptionDuration);
        subscription.setAmount(amount);
        subscription.setDuration(subscriptionDuration);
        subscription.setAutoRenewal(autoRenewal);
        subscription.setCurrency(currency);
        subscription.setPaymentStatus(paymentStatus);
        subscription.setPaymentMethod(paymentMethod);
        Date startDate = new Date();
        subscription.setStartDate(startDate);
        Date endDate = calculateEndDate(startDate, subscriptionDuration);
        subscription.setEndDate(endDate);
        subscription.setDescription(description);
        subscription.setTransactionDate(new Date());

        return subscription;
    }

    public static Date calculateEndDate(Date startDate, SubscriptionDuration subscriptionDuration) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        if(subscriptionDuration == SubscriptionDuration.MONTHLY) {
            calendar.add(Calendar.MONTH, 1);
        } else if (subscriptionDuration == SubscriptionDuration.ANNUAL) {
            calendar.add(Calendar.YEAR, 1);
        }
        return calendar.getTime();
    }

    public static Diagnostic validate(Subscription subscription) {
        return Diagnostician.INSTANCE.validate(subscription);
    }
    
	public static float calculateTotalPrice(float price, SubscriptionDuration subscriptionDuration) {
        if(subscriptionDuration == SubscriptionDuration.MONTHLY) {
            return price;
        } else if (subscriptionDuration == SubscriptionDuration.ANNUAL) {
            return price * 12;
        }
        return 0;
    }

}
