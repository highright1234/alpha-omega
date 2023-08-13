import org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly


plugins {
    id("net.minecrell.plugin-yml.bukkit") version Versions.PLUGIN_YML
}

val ktor_version: String = Versions.KTOR

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation(project(":alpha-omega-core"))
    compileOnly("io.papermc.paper:paper-api:${Versions.MINECRAFT}-R0.1-SNAPSHOT")
}

val directoryName = "alphaomega"
val pluginName = "AlphaOmegaPlugin"
bukkit {
    apiVersion = Versions.MINECRAFT
    name = pluginName
    main = "${project.group}.$directoryName.plugin.$pluginName"
    website = "http://www.github.com/highright1234/${project.name}"
    author = "HighRight"
    depend = listOf()
}
