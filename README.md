# aapam patches

Patches for apps I like/use or requested by others.

- A special thanks to [ajstrick81](https://github.com/ajstrick81/morphe-androidtv-patches/) for the cleaver idea behind Prime TV patches 
- I typically wouldn't update the patches to every version updates, unless a new feature is added in major/minor version and we need it. 
- You can mix my patches with other people patches. I wouldn't do all the features, but only the ones that are not best in other patches. (e.g only one patch in Telegram, because most other features from other devs are good enough for me)
- For Cred, the patches would work for UPI. However for NFC support:
  - Your device must meet Strong integrity. Try [Integrity Box](https://github.com/MeowDump/Integrity-Box)
  - You would need to have [TEESimulator](https://github.com/JingMatrix/TEESimulator) installed 
    - Cred package should be part of the scope
    - Operation mode should be 'generation'
  - Need [SigSpoof](https://github.com/oct888/sigspoof) Vector/Lsposed module
    - If your devices is Android 14 or less you need a different version of this module that is yet to be merged. [Build yourself](https://github.com/oct888/sigspoof/pull/1)

  - You would need to configure Cred in the module to return original signature: ```MIIDTzCCAjegAwIBAgIEUJk5TTANBgkqhkiG9w0BAQsFADBYMQswCQYDVQQGEwJJTjESMBAGA1UEBxMJQmFuZ2Fsb3JlMRIwEAYDVQQKEwlEcmVhbVBsdWcxETAPBgNVBAsTCENvbnN1bWVyMQ4wDAYDVQQDEwVEcmVhbTAeFw0xODA1MjcxNDUyNThaFw00MzA1MjExNDUyNThaMFgxCzAJBgNVBAYTAklOMRIwEAYDVQQHEwlCYW5nYWxvcmUxEjAQBgNVBAoTCURyZWFtUGx1ZzERMA8GA1UECxMIQ29uc3VtZXIxDjAMBgNVBAMTBURyZWFtMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqsXbPmCpuCidGHCM6ntrOXwlfzl5cC9AXolA0pixCv8g2xkPkqqb7/fqMx8ZMkI65rON1ITwJEP9e9tvZ/4fAqszEk2Q/EN7vXKRKc+/wrDWcgg7XVeNSrQzQxDgeFMJfP64r21A+YqrQM9KUwqeYaJqVjAarOttKvOR80w2HuM22dlYXnxQ/zb/uH4UsBW3nSfsuN79XlVi/TxakGvnwi0A5WpYZoIAyWH5EY5hY+3XNEHTukRsaN2LppDPljzeXJiB7TeTELN5aeki0DCBnwn2J75+PHR0bODClG5VzYBGle/DfpAlz0As6BTbqy+pRt1C8lEqXcukUTJB1cKUsQIDAQABoyEwHzAdBgNVHQ4EFgQUi9wcVbE1LYmwfyxQHL3cbHYoIx8wDQYJKoZIhvcNAQELBQADggEBAH4UgaDVbnFDl27ZjjtwzLW4XJN0EgXPkaN9CWJOs0A4Gf31rQc/tiwveNva8IgFmZKY62IpgwklcOwMSvHlVBW+PlCZtGsAET5XcA1jYat+LlkSO92JNo5nS3OqS8yUtmmMbaqd7aLNrBs1VdFlnIaCVMh/vpnUDfMsRfocc+SAddMtRoU3JwJHVf4Wr13LGwPTRJcvia4zdB3y8CtQk/q1dnEiqacyPaY2Z6vU/FEbixG2hJEF5SbcYNVvQedB8IV4K8OMUMWvN3nBXCohxiZvGMGnXIHcx8xYOPezVXHs1N2sVOqZ78HQZQg1gF7hghWGCnDfHuobP+mPB3nhY2Q=```

### How to use these patches

Click here to add these patches to Morphe: https://morphe.software/add-source?github=WZSE/aapam-patches

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.7.0](https://github.com/WZSE/aapam-patches/releases/tag/v1.7.0)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;25 patches total
<details open>
<summary>📦 Telegram&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

<details open>
<summary>🎯 12.8.3&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Anti-disappearing media](#anti-disappearing-media) | Keeps view-once and self-destructing media viewable forever; the sender sees them as expired. |  |

</details>

<details open>
<summary>🎯 12.10.1&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Anti-disappearing media](#anti-disappearing-media) | Keeps view-once and self-destructing media viewable forever; the sender sees them as expired. |  |

</details>

</details>

<details open>
<summary>📦 SonyLIV Android TV&nbsp;&nbsp;•&nbsp;&nbsp;5 patches</summary>
<br>

<details open>
<summary>🎯 6.23.1&nbsp;&nbsp;•&nbsp;&nbsp;5 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Auto skip intro and recap](#auto-skip-intro-and-recap) | Automatically skips the intro, recap and song segments as soon as the 'Skip' button would appear, without waiting for a tap. |  |
| [Auto-skip Up Next](#auto-skip-up-next) | Plays the next episode immediately when the "Up Next" card appears, skipping the auto-play countdown. |  |
| [Disable tracking](#disable-tracking) | Disables CleverTap, Firebase Analytics/Crashlytics, and AppsFlyer tracking and telemetry exfiltration. |  |
| [Disable video ads](#disable-video-ads) | Disables client-side Google IMA video ads in the SonyLIV player by forcing the ad eligibility check to false and returning an empty ad tag URL. |  |
| [Hide promo banners](#hide-promo-banners) | Hides the CleverTap-driven subscribe/premium promo banners and promo trays on the home screen. Content rows and CleverTap pop-ups/overlays are not affected. |  |

</details>

<details open>
<summary>🎯 6.29.13&nbsp;&nbsp;•&nbsp;&nbsp;5 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Auto skip intro and recap](#auto-skip-intro-and-recap) | Automatically skips the intro, recap and song segments as soon as the 'Skip' button would appear, without waiting for a tap. |  |
| [Auto-skip Up Next](#auto-skip-up-next) | Plays the next episode immediately when the "Up Next" card appears, skipping the auto-play countdown. |  |
| [Disable tracking](#disable-tracking) | Disables CleverTap, Firebase Analytics/Crashlytics, and AppsFlyer tracking and telemetry exfiltration. |  |
| [Disable video ads](#disable-video-ads) | Disables client-side Google IMA video ads in the SonyLIV player by forcing the ad eligibility check to false and returning an empty ad tag URL. |  |
| [Hide promo banners](#hide-promo-banners) | Hides the CleverTap-driven subscribe/premium promo banners and promo trays on the home screen. Content rows and CleverTap pop-ups/overlays are not affected. |  |

</details>

</details>

<details open>
<summary>📦 MyGate&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

<details open>
<summary>🎯 7.37.0&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Block Flutter Ads](#block-flutter-ads) | Removes home feed advertisements and sponsored community notice cards. |  |
| [Unlock Premium Plan](#unlock-premium-plan) | Enables premium resident status and removes promotional banners. |  |

</details>

<details open>
<summary>🎯 7.38.2&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Block Flutter Ads](#block-flutter-ads) | Removes home feed advertisements and sponsored community notice cards. |  |
| [Unlock Premium Plan](#unlock-premium-plan) | Enables premium resident status and removes promotional banners. |  |

</details>

</details>

<details open>
<summary>📦 Prime Video Android TV&nbsp;&nbsp;•&nbsp;&nbsp;7 patches</summary>
<br>

<details open>
<summary>🎯 6.23.23+v15.5.0.70-armv7a&nbsp;&nbsp;•&nbsp;&nbsp;7 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Bundle native ad-strip hook](#bundle-native-ad-strip-hook) | Packages the Prime Video libignite interception library for this APK's ABIs. |  |
| [Clone Prime Video](#clone-prime-video) | Renames the package to <original>.mod (and its provider authorities / custom permissions) so the patched app installs side-by-side with a non-removable system Prime Video. Opt-in. |  |
| [Disable auto-updates](#disable-auto-updates) | Prevents Google Play Store from automatically replacing the patched APK with the official unpatched version. |  |
| [Load native ad-strip hook](#load-native-ad-strip-hook) | Loads libpvhook.so at startup before Prime Video constructs its media pipeline. |  |
| [Override certificate pinning](#override-certificate-pinning) | Adds a network_security_config trusting user CAs (no pin sets) so AdGuard Premium can inspect the app's platform-stack HTTPS. Optional adjunct: Prime Video's ad plane is largely native libcurl, so DNS blocking is the primary tool. |  |
| [Prime Video extension](#prime-video-extension) | Integrates the Prime Video ATV extension for ad group skipping. |  |
| [Skip ads](#skip-ads) | Multi-layer ad suppression targeting the SSAI schedule, impression reporting, and the Volley network chokepoint. |  |

</details>

<details open>
<summary>🎯 6.24.5+v16.0.0.231-allAbis&nbsp;&nbsp;•&nbsp;&nbsp;6 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Bundle native ad-strip hook](#bundle-native-ad-strip-hook) | Packages the Prime Video libignite interception library for this APK's ABIs. |  |
| [Clone Prime Video](#clone-prime-video) | Renames the package to <original>.mod (and its provider authorities / custom permissions) so the patched app installs side-by-side with a non-removable system Prime Video. Opt-in. |  |
| [Disable auto-updates](#disable-auto-updates) | Prevents Google Play Store from automatically replacing the patched APK with the official unpatched version. |  |
| [Load native ad-strip hook](#load-native-ad-strip-hook) | Loads libpvhook.so at startup before Prime Video constructs its media pipeline. |  |
| [Override certificate pinning](#override-certificate-pinning) | Adds a network_security_config trusting user CAs (no pin sets) so AdGuard Premium can inspect the app's platform-stack HTTPS. Optional adjunct: Prime Video's ad plane is largely native libcurl, so DNS blocking is the primary tool. |  |
| [Prime Video extension](#prime-video-extension) | Integrates the Prime Video ATV extension for ad group skipping. |  |

</details>

<details open>
<summary>🎯 6.24.8+v16.0.0.361-allAbis&nbsp;&nbsp;•&nbsp;&nbsp;6 patches</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Bundle native ad-strip hook](#bundle-native-ad-strip-hook) | Packages the Prime Video libignite interception library for this APK's ABIs. |  |
| [Clone Prime Video](#clone-prime-video) | Renames the package to <original>.mod (and its provider authorities / custom permissions) so the patched app installs side-by-side with a non-removable system Prime Video. Opt-in. |  |
| [Disable auto-updates](#disable-auto-updates) | Prevents Google Play Store from automatically replacing the patched APK with the official unpatched version. |  |
| [Load native ad-strip hook](#load-native-ad-strip-hook) | Loads libpvhook.so at startup before Prime Video constructs its media pipeline. |  |
| [Override certificate pinning](#override-certificate-pinning) | Adds a network_security_config trusting user CAs (no pin sets) so AdGuard Premium can inspect the app's platform-stack HTTPS. Optional adjunct: Prime Video's ad plane is largely native libcurl, so DNS blocking is the primary tool. |  |
| [Prime Video extension](#prime-video-extension) | Integrates the Prime Video ATV extension for ad group skipping. |  |

</details>

</details>

<details open>
<summary>📦 INDmoney&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

**🎯 Supported versions:**

| 9.9.92 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable App Inventory Tracking](#disable-app-inventory-tracking) | Prevents INDmoney from querying installed applications, competitor apps, and UPI handlers. |  |
| [Suppress App Blocked Screen](#suppress-app-blocked-screen) | Neutralizes Talsec RASP callbacks, threat dispatchers, memory map checks, and AppExitTracker to prevent access blocked screens and premature process termination. |  |

</details>

<details open>
<summary>📦 ZEE5 Android TV&nbsp;&nbsp;•&nbsp;&nbsp;4 patches</summary>
<br>

**🎯 Supported versions:**

| 5.83.2 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable CleverTap](#disable-clevertap) | Prevents the CleverTap analytics SDK from initializing, stopping behavioral tracking and advertising-id (GAID) collection. |  |
| [Disable Firebase analytics](#disable-firebase-analytics) | Prevents Firebase Analytics from initializing, stopping event and user-property reporting to Google. |  |
| [Disable ads](#disable-ads) | Removes Google IMA ad insertion (client-side and server-side DAI) from the ZEE5 player. The media source factory is returned DRM-configured but with ad-insertion components never attached, so content and DRM playback are unaffected. |  |
| [Disable analytics](#disable-analytics) | Disables all third-party analytics (CleverTap, Firebase, Mixpanel, videoanalytics) by short-circuiting the central analytics dispatch method. No tracking data is sent. |  |

</details>

<details open>
<summary>📦 CRED&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

<details open>
<summary>🎯 6.1.6.170&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable Spying & Security Checks](#disable-spying-security-checks) | Suppresses background watchdog crashes, stubs app inventory harvesters, bypasses device profiling & root checks, and neutralizes OEM task-killer service flags. |  |

</details>

<details open>
<summary>🎯 6.1.4.157&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable Spying & Security Checks](#disable-spying-security-checks) | Suppresses background watchdog crashes, stubs app inventory harvesters, bypasses device profiling & root checks, and neutralizes OEM task-killer service flags. |  |

</details>

<details open>
<summary>🎯 6.1.2.144&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable Spying & Security Checks](#disable-spying-security-checks) | Suppresses background watchdog crashes, stubs app inventory harvesters, bypasses device profiling & root checks, and neutralizes OEM task-killer service flags. |  |

</details>

</details>

<details open>
<summary>📦 Coloring and Learn&nbsp;&nbsp;•&nbsp;&nbsp;2 patches</summary>
<br>

**🎯 Supported versions:**

| 2.28 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Disable ads](#disable-ads) | Removes all AdMob ads (banner, interstitial, rewarded, rewarded interstitial, app open) by intercepting the Corona SDK AdMob plugin bridge before any ad is initialised, loaded, or shown. |  |
| [Unlock ad-free](#unlock-ad-free) | Hooks CoronaRuntime.onWillLoadMain() to execute a Lua bootstrap script that stubs in-app purchases (Tienda.ProductoComprado returning 'S'), hides promo/ad UI buttons, and stubs libads. |  |

</details>

<details open>
<summary>📦 Monect PC Link TV&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 8.3.4 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Unlock Premium](#unlock-premium) | Unlocks full Premium VIP status across Monect PC Link TV, enabling 4K/2K/1080p remote desktop streaming, up to 10 hosts, unlimited file transfers, custom screen casting ratios, and removing all ads. |  |

</details>

<!-- PATCHES_END -->

## 📜 License

aapam Patches are licensed under the [GNU General Public License v3.0](LICENSE)
