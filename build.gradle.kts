
plugins {
    kotlin("jvm") version Versions.KOTLIN
    kotlin("plugin.serialization") version Versions.KOTLIN
    id("io.ktor.plugin") version Versions.KTOR
}

group = "io.github.highright1234"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

subprojects {

    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.serialization")
    apply(plugin = "io.ktor.plugin")

    repositories {
        mavenCentral()
    }

    dependencies {
        if (!project.name.endsWith("common")) {
            implementation(project(":alpha-omega-common"))
        }
        implementation(kotlin("stdlib-jdk8"))
    }

    kotlin {
        jvmToolchain(17)
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    }
}