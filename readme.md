# 🕸️ Streaming Platform Metamodel

## 🔍 Overview

This repository defines the metamodel for a **Streaming Platform** designed using the Eclipse Modeling Framework (EMF). It models the essential entities and their relationships within a streaming platform ecosystem, such as users, channels, subscriptions, and media content.

## 🌐 Features

- **Platform Management**: Tracks supported regions, languages, devices, and resolutions.
- **User Interaction**: Includes functionality for messages, reactions, donations, and subscriptions.
- **Content Delivery**: Models streams, clips, and other media content.
- **Monetization**: Handles donations and subscriptions with attributes for transaction details.
- **Auditing**: Tracks creation and update timestamps for key entities.

---

## 🗋 Package Structure

### 🔹 Package URI

`http://www.eclipse.org/emf/2002/Ecore`

### 🔹 Package Namespace

`StreamingPlatform : SP = ''`

---

## 🔍 Key Components

### 💡 Abstract Classes

- **NamedElement**: Base class providing a `name` attribute.
- **Auditable**: Tracks creation and update timestamps.
- **Feature**: Represents unlockable features like badges and emotes.
- **MediaContent**: Abstract class for streams and clips.
- **Monetization**: Base class for handling financial transactions.
- **UserInteraction**: Base class for user-generated interactions.

### 🌐 Core Classes

#### ⚙️ Platform

- **Attributes**:
  - `platformID`: Unique identifier.
  - `revenue`: Platform’s revenue.
  - `version`: Platform version.
  - `description`: Platform description.
  - `supportedRegions`: List of regions.
  - `supportedLanguages`: List of languages.
  - `supportedDevices`: List of devices.
  - `supportedResolutions`: List of resolutions.
  - `totalRevenue` (Derived): Sum of donations and subscriptions across channels.
- **Properties**:
  - `users`: List of users.
  - `channels`: List of channels.
- **Operations**:
  - `activeUsersCount`: Returns the number of online users.
  - `findChannelByName`: Finds a channel by its name.

#### 🎤 Channel

- **Attributes**:
  - `channelID`: Unique identifier.
  - `description`: Channel description.
  - `totalDonations` (Derived): Total donations.
  - `totalFollowers` (Derived): Total followers.
  - `totalViews` (Derived): Total view count.
- **Properties**:
  - `streams`, `clips`: Media content under the channel.
  - `moderators`, `followers`: Relationships with users.
  - `donations`, `subscriptions`: Monetization details.
  - `emotes`, `badges`: Channel-specific features.
  - `owner`: The channel’s owner.

#### 👤 User

- **Attributes**:
  - `userID`: Unique identifier.
  - `role`: Role (Administrator, Streamer, Viewer).
  - `avatar`: User avatar.
  - `isOnline`: Online status.
  - `nickname`: User nickname.
  - `description`: User description.
- **Properties**:
  - `subscriptions`, `donations`: Monetization relationships.
  - `followedChannels`: Channels the user follows.
- **Operations**:
  - `totalDonations`: Total donations made.
  - `isFollowing`: Checks if the user follows a specific channel.
  - `totalSpending`: Calculates total spending.

#### 🎞️ Media Content

- **Stream**:
  - Attributes: `isLive`, `activeViewers` (Derived), `viewCount`
  - Invariants:
    - A live stream must have at least one viewer.
- **Clip**:
  - Attributes: `clipID`
  - Properties: `createdBy` (User who created the clip).

#### 💵 Monetization

- **Donation**:
  - Attributes: `donationID`, `message`, `amount`, `currency`.
- **Subscription**:
  - Attributes: `subscriptionID`, `tier`, `price`, `duration`, `startDate`, `endDate`.
  - Properties: `emotes`, `badge`.
  - Invariants:
    - `startDate ≤ endDate`.

---

## 🔬 Enumerations

- **SubscriptionDuration**: Monthly, Annual.
- **Category**: Videogames, JustChatting, Esports, Sports, TalkShowsAndPodcasts.
- **Currency**: EUR, USD, GBP.
- **Device**: iOS, Android, Web, TV.
- **Language**: Italian, Spanish, English.
- **Region**: Europe, America.
- **Resolution**: SD, HD, UltraHD, QuadHD, FullHD.
- **PaymentMethod**: Paypal, CreditCard.
- **PaymentStatus**: Pending, Completed, Rejected.
- **ReactionType**: Love, ThumbsUp, ThumbsDown, Funny.
- **Role**: Administrator, Streamer, Viewer.
- **Tier**: Basic, Premium, VIP.
- **UnlockCondition**: DonationAmount, Tenure.

---

## 🔢 Data Types

- **UUID**: `java.util.UUID`
- **Timestamp**: `java.sql.Timestamp`

---

## ✍️ Usage

1. **Setup**: Import the metamodel into your EMF-compatible tool.
2. **Customization**: Extend or modify classes based on your platform’s requirements.
3. **Validation**: Ensure all invariants are satisfied before deploying instances.

---
