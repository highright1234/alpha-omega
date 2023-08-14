pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "alpha-omega"
include("alpha-omega-plugin")
include("alpha-omega-commander")
include("alpha-omega-core")
include("alpha-omega-common")
