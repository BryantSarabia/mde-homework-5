# 🕸️ Refined Streaming Platform Metamodel

## 🔗 General Changes

- Abstract Class `Taggable`: ➕ Introduced in the new model. Contains the tags attribute, allowing tagging for reusable components.

---

## Playlist

New class introduced to manage collections of `MediaContent`.

---

## ⚙️ Platform

- Attributes:
  - Added:
    - `supportedVideoQualities` (replacing `supportedResolutions`).
  - Removed:
    - `description`.
  - Changed:
    - `supportedResolutions` ➡️ `supportedVideoQualities`.
- Property `totalRevenue`:
  - Updated derivation to replace `donations` with `tips`.

---

## 🎤 Channel

- New properties:
  - `playlists`: List of playlists available on the channel.
- Attributes:
  - Added:
    - Inherits `tags` from the new `Taggable` class.
  - Removed:
    - `description`
  - Changed:
    - `donations` ➡️ `tips`.
- Derived attributes:
  - Renamed `totalDonations` ➡️ `totalTips`.

---

## 👤 User

- Attributes:
  - Added:
    - `tips` property replaces `donations`.
  - Removed:
    - `description`.
- Operations:
  - Changed:
    - `totalDonations()` ➡️ `totalTips()`.

---

## 🎞️ MediaContent

Added inheritance from `Taggable` class.

- Attributes:
  - Changed:
    - `resolutions` ➡️ `videoQualities`.

---

## 🔬 Enumerations

- Updated:
  - `Resolution` ➡️ renamed to `VideoQuality`.
  - `PaymentStatus`: Added new value `Refunded`.
