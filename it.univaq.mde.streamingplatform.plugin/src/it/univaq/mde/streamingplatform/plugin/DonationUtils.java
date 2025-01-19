package it.univaq.mde.streamingplatform.plugin;


import java.util.UUID;
import java.util.Date;

import org.eclipse.emf.common.util.Diagnostic;

import org.eclipse.emf.ecore.util.Diagnostician;


import StreamingPlatform.Currency;
import StreamingPlatform.Donation;
import StreamingPlatform.PaymentMethod;
import StreamingPlatform.PaymentStatus;
import StreamingPlatform.StreamingPlatformFactory;


public class DonationUtils {
    public static Donation create(String name, String message, float amount, Currency currency, PaymentStatus paymentStatus,
            PaymentMethod paymentMethod, String description) {
        Donation donation = StreamingPlatformFactory.eINSTANCE.createDonation();
        donation.setName(name);
        donation.setDonationID(UUID.randomUUID().toString());
        donation.setMessage(message);
        donation.setAmount(amount);
        donation.setCurrency(currency);
        donation.setPaymentStatus(paymentStatus);
        donation.setPaymentMethod(paymentMethod);
        donation.setDescription(description);
        donation.setTransactionDate(new Date());
        return donation;
    }

    public static Diagnostic validate(Donation donation) {
        return Diagnostician.INSTANCE.validate(donation);
    }

}
