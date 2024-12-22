package it.univaq.mde.streamingplatform.plugin;

import StreamingPlatform.*;

import java.util.Arrays;

import org.eclipse.emf.common.util.Diagnostic;

public class Main {
    public static void main(String[] args) {
    	// Global resolutions
        Resolution [] resolutions = new Resolution[] { Resolution.HD, Resolution.FULL_HD };

        // Users
        User otherlude = UserUtils.create("Otherlude", Role.VIEWER, "avatar.png", true, "Otherlude", "A regular viewer");
        User gomita13 = UserUtils.create("Gomita13", Role.VIEWER, "gomita13.png", true, "Gomita13", "A regular viewer");
        User ibai = UserUtils.create("Ibai", Role.STREAMER, "ibai.png", true, "Ibai", "A popular streamer");
        User admin = UserUtils.create("Admin", Role.ADMINISTRATOR, "admin.png", true, "Admin", "An administrator");
        
        // Donation
        Donation otherludeDonation = DonationUtils.create("Otherlude donation","Keep up the good work!", 50.0f, Currency.EUR, PaymentStatus.COMPLETED, PaymentMethod.PAYPAL, "Donation for the streamer");
        Donation gomita13Donation = DonationUtils.create("Gomita13 donation","Keep up the good work!", 10.0f, Currency.EUR, PaymentStatus.COMPLETED, PaymentMethod.PAYPAL, "Donation for the streamer");
        
        // Emotes
        Emote kappa = EmoteUtils.create("Kappa", 1, "kappa emoticon");
        Emote tiger = EmoteUtils.create("Tiger", 5.0f, "tiger emoticon");
        
        // Badges
        Badge founder = BadgeUtils.create("Founder", 1,"Founder badge");
        Badge vip = BadgeUtils.create("VIP", 50.0f, "VIP badge");
        
        // Subscription
        Subscription otherludeSubscription = SubscriptionUtils.create("Otherlude subscription", Tier.PREMIUM, 8.99f, SubscriptionDuration.ANNUAL, false, Currency.EUR, PaymentStatus.COMPLETED, PaymentMethod.PAYPAL, "Premium subscription");
        otherludeSubscription.getEmotes().addAll(Arrays.asList(kappa, tiger));
        otherludeSubscription.setBadge(vip);
        Subscription gomita13Subscription = SubscriptionUtils.create("Gomita13 subscription", Tier.BASIC, 4.99f, SubscriptionDuration.MONTHLY, false, Currency.EUR, PaymentStatus.COMPLETED, PaymentMethod.PAYPAL, "Basic subscription");
        gomita13Subscription.getEmotes().add(kappa);
        gomita13Subscription.setBadge(founder);
        
        // Reactions
        Reaction thumbsUp = ReactionUtils.create(ReactionType.THUMBS_UP, "I like this stream");
        thumbsUp.setUser(otherlude);
        Reaction thumbsDown = ReactionUtils.create(ReactionType.THUMBS_DOWN, "I don't like this stream");
        thumbsDown.setUser(gomita13);
        Message otherludeMessage = MessageUtils.create("Hello, I'm Otherlude", "Message description");
        otherludeMessage.setUser(otherlude);
        Message gomita13Message = MessageUtils.create("Hello, I'm Gomita13", "Message description");
        gomita13Message.setUser(gomita13);
        
        // Clips
        String [] clipTags = new String[] { "gaming", "League of Legends" };
        Clip clip = ClipUtils.create("LMAO!", Category.VIDEOGAMES, clipTags, resolutions,"Desc");
        clip.setCreatedBy(otherlude);
        Clip clip2 = ClipUtils.create("What a fail!", Category.VIDEOGAMES, clipTags, resolutions, "Desc");  
        clip2.setCreatedBy(gomita13);   
    
        // Stream
        String [] tags = new String[] { "gaming", "spanish", "funny", "League of Legends" };
        Stream stream = StreamUtils.create("Playing league of legends", true, Category.VIDEOGAMES, tags, resolutions, "Stream description");
        stream.getViewers().addAll(Arrays.asList(admin, otherlude));
        stream.setIsLive(true);
        stream.getReactions().add(thumbsUp);
        stream.getReactions().add(thumbsDown);
        stream.getMessages().add(otherludeMessage);
        stream.getMessages().add(gomita13Message);
        stream.setViewCount(3);
        
        String [] tags2 = new String[] { "gaming", "spanish", "funny", "Valorant" };
        Stream stream2 = StreamUtils.create("Playing Valorant", false, Category.VIDEOGAMES, tags2, resolutions, "Stream2 description");
        stream2.setViewCount(1);
        
        // Channel
        Channel channel = ChannelUtils.create("Ibai channel", "Ibai's channel");
        channel.setOwner(ibai);
        channel.getSubscriptions().addAll(Arrays.asList(otherludeSubscription, gomita13Subscription));
        channel.getDonations().addAll(Arrays.asList(otherludeDonation, gomita13Donation));
        channel.getFollowers().addAll(Arrays.asList(otherlude, gomita13));
        channel.getModerators().add(ibai);
        channel.getEmotes().addAll(Arrays.asList(kappa, tiger));
        channel.getBadges().addAll(Arrays.asList(founder, vip));
        channel.getStreams().addAll(Arrays.asList(stream, stream2));
        channel.getClips().addAll(Arrays.asList(clip, clip2));
        
        // Platform
        Region [] supportedRegions = new Region[] { Region.AMERICA, Region.EUROPE };
        Language [] supportedLanguages = new Language[] { Language.ENGLISH, Language.SPANISH };
        Device [] supportedDevices = new Device[] { Device.ANDROID, Device.IOS, Device.WEB };
        Resolution [] supportedResolutions = new Resolution[] { Resolution.HD, Resolution.FULL_HD };
        
        Platform platform = PlatformUtils.create("Twitch", 1.0f,"This is a famous streaming platform", supportedRegions, supportedLanguages, supportedDevices, supportedResolutions);
        platform.getChannels().add(channel);
        platform.getUsers().addAll(Arrays.asList(otherlude, ibai, admin, gomita13));
        platform.setRevenue(10000.0f);
        
        // Serialize all models
        PackageUtils.serialize(otherlude, "otherlude.xmi");
        PackageUtils.serialize(gomita13, "gomita13.xmi");
        PackageUtils.serialize(ibai, "ibai.xmi");
        PackageUtils.serialize(admin, "admin.xmi");
        PackageUtils.serialize(otherludeSubscription, "otherludeSubscription.xmi");
        PackageUtils.serialize(otherludeDonation, "otherludeDonation.xmi");
        PackageUtils.serialize(gomita13Subscription, "gomita13Subscription.xmi");
        PackageUtils.serialize(gomita13Donation, "gomita13Donation.xmi");
        PackageUtils.serialize(kappa, "kappa.xmi");
        PackageUtils.serialize(tiger, "tiger.xmi");
        PackageUtils.serialize(founder, "founder.xmi");
        PackageUtils.serialize(vip, "vip.xmi");
        PackageUtils.serialize(thumbsUp, "thumbsUp.xmi");
        PackageUtils.serialize(thumbsDown, "thumbsDown.xmi");
        PackageUtils.serialize(gomita13Message, "gomita13Message.xmi");
        PackageUtils.serialize(otherludeMessage, "otherludeMessage.xmi");
        PackageUtils.serialize(clip, "clip.xmi");
        PackageUtils.serialize(clip2, "clip2.xmi");
        PackageUtils.serialize(stream, "stream.xmi");
        PackageUtils.serialize(stream2, "stream2.xmi");
        PackageUtils.serialize(channel, "channel.xmi");
        PackageUtils.serialize(platform, "platform.xmi");
        
        // Load all models
        User otherludel = PackageUtils.load("otherlude.xmi", User.class);
        User gomita13l = PackageUtils.load("gomita13.xmi", User.class);
        User ibail = PackageUtils.load("ibai.xmi", User.class);
        User adminl = PackageUtils.load("admin.xmi", User.class);
        Subscription otherludeSubscriptionl = PackageUtils.load("otherludeSubscription.xmi", Subscription.class);
        Subscription gomita13Subscriptionl = PackageUtils.load("gomita13Subscription.xmi", Subscription.class);
        Donation otherludeDonationl = PackageUtils.load("otherludeDonation.xmi", Donation.class);
        Donation gomita13Donationl = PackageUtils.load("gomita13Donation.xmi", Donation.class);
        Emote kappal = PackageUtils.load("kappa.xmi", Emote.class);
        Emote tigerl = PackageUtils.load("tiger.xmi", Emote.class);
        Badge founderl = PackageUtils.load("founder.xmi", Badge.class);
        Badge vipl = PackageUtils.load("vip.xmi", Badge.class);
        Reaction thumbsUpl = PackageUtils.load("thumbsUp.xmi", Reaction.class);
        Reaction thumbsDownl = PackageUtils.load("thumbsDown.xmi", Reaction.class);
        Message otherludeMessagel = PackageUtils.load("otherludeMessage.xmi", Message.class);
        Message gomita13Messagel = PackageUtils.load("gomita13Message.xmi", Message.class);
        Clip clipl = PackageUtils.load("clip.xmi", Clip.class);
        Clip clip2l = PackageUtils.load("clip2.xmi", Clip.class);
        Stream streaml = PackageUtils.load("stream.xmi", Stream.class);
        Stream stream2l = PackageUtils.load("stream2.xmi", Stream.class);
        Channel channell = PackageUtils.load("channel.xmi", Channel.class);
        Platform platforml = PackageUtils.load("platform.xmi", Platform.class);
        
        // Validate all models
        String otherludeValidation = UserUtils.validate(otherludel).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String gomita13Validation = UserUtils.validate(gomita13l).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String ibaiValidation = UserUtils.validate(ibail).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String adminValidation = UserUtils.validate(adminl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String otherludeSubscriptionValidation = SubscriptionUtils.validate(otherludeSubscriptionl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String gomita13SubscriptionValidation = SubscriptionUtils.validate(gomita13Subscriptionl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String otherludeDonationValidation = DonationUtils.validate(otherludeDonationl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String gomita13DonationValidation = DonationUtils.validate(gomita13Donationl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String kappaValidation = EmoteUtils.validate(kappal).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String tigerValidation = EmoteUtils.validate(tigerl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String founderValidation = BadgeUtils.validate(founderl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String vipValidation = BadgeUtils.validate(vipl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String thumbsDownValidation = ReactionUtils.validate(thumbsDownl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String thumbsUpValidation = ReactionUtils.validate(thumbsUpl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String gomita13MessageValidation = MessageUtils.validate(gomita13Messagel).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String otherludeMessageValidation = MessageUtils.validate(otherludeMessagel).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String clipValidation = ClipUtils.validate(clipl).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String clip2Validation = ClipUtils.validate(clip2l).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String streamValidation = StreamUtils.validate(streaml).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String stream2Validation = StreamUtils.validate(stream2l).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String channelValidation = ChannelUtils.validate(channell).getSeverity() == Diagnostic.OK ? "passed" : "failed";
        String platformValidation = PlatformUtils.validate(platforml).getSeverity() == Diagnostic.OK ? "passed" : "failed";

        System.out.println("Otherlude validation: " + otherludeValidation);
        System.out.println("Gomita13 validation: " + gomita13Validation);
        System.out.println("Ibai validation: " + ibaiValidation);
        System.out.println("Admin validation: " + adminValidation);
        System.out.println("Otherlude subscription validation: " + otherludeSubscriptionValidation);
        System.out.println("Gomita13 subscription validation: " + gomita13SubscriptionValidation);
        System.out.println("Otherlude donation validation: " + otherludeDonationValidation);
        System.out.println("Gomita13 donation validation: " + gomita13DonationValidation);
        System.out.println("Kappa validation: " + kappaValidation);
        System.out.println("Tiger validation: " + tigerValidation);
        System.out.println("Founder validation: " + founderValidation);
        System.out.println("VIP validation: " + vipValidation);
        System.out.println("Thumbs up validation: " + thumbsUpValidation);
        System.out.println("Thumbs down validation: " + thumbsDownValidation);
        System.out.println("Otherlude message validation: " + otherludeMessageValidation);
        System.out.println("Gomita13 message validation: " + gomita13MessageValidation);
        System.out.println("Clip validation: " + clipValidation);
        System.out.println("Clip2 validation: " + clip2Validation);
        System.out.println("Stream validation: " + streamValidation);
        System.out.println("Stream2 validation: " + stream2Validation);
        System.out.println("Channel validation: " + channelValidation);
        System.out.println("Platform validation: " + platformValidation);
        
    }
}
