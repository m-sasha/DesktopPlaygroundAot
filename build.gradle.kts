import org.gradle.internal.jvm.inspection.JvmVendor
import org.gradle.jvm.toolchain.internal.DefaultJvmVendorSpec
import org.jetbrains.compose.desktop.application.dsl.AotMode
//import org.jetbrains.compose.desktop.application.dsl.AppCdsMode
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.compilerRunner.processCompilerOutput

plugins {
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.compose")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    implementation(compose.desktop.currentOs)
}

val javaVersion = JavaLanguageVersion.of(25)
val javaVendor = DefaultJvmVendorSpec.of(JvmVendor.KnownJvmVendor.JETBRAINS)

kotlin {
    jvmToolchain {
        languageVersion.set(javaVersion)
        vendor.set(javaVendor)
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"

        javaHome = javaToolchains.launcherFor {
            languageVersion.set(javaVersion)
            vendor.set(javaVendor)
        }.get().metadata.installationPath.asFile.absolutePath

        buildTypes.release {
            proguard {
                isEnabled = false
            }
            aot {
                mode = AotMode.AotPrebuild
                logging = true
                exitAppOnAotFailure = true
            }
        }

        jvmArgs += "--enable-native-access=ALL-UNNAMED"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "DesktopPlayground"
            packageVersion = "1.0.0"
        }
    }
}
