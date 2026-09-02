package ajstrick81.morphe.patches.primevideo.shared

import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    private const val PACKAGE_NAME = "com.amazon.amazonvideo.livingroom"
    private const val VERSION_6_23 = "6.23.23+v15.5.0.70-armv7a"
    private const val VERSION_6_24 = "6.24.5+v16.0.0.231-allAbis"

    val COMPATIBILITY_6_23 = Compatibility(
        name = "Prime Video Android TV",
        packageName = PACKAGE_NAME,
        appIconColor = 0x177BCE,
        targets = listOf(AppTarget(VERSION_6_23)),
    )

    val COMPATIBILITY_6_24 = Compatibility(
        name = "Prime Video Android TV",
        packageName = PACKAGE_NAME,
        appIconColor = 0x177BCE,
        targets = listOf(AppTarget(VERSION_6_24)),
    )

    val COMPATIBILITY = Compatibility(
        name = "Prime Video Android TV",
        packageName = PACKAGE_NAME,
        appIconColor = 0x177BCE,
        targets = listOf(AppTarget(VERSION_6_23), AppTarget(VERSION_6_24)),
    )
}
