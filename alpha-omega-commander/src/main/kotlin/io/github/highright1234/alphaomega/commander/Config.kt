package io.github.highright1234.alphaomega.commander

import com.charleskorn.kaml.Yaml
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.io.File
import kotlin.system.exitProcess

@Serializable
data class Config(
    @SerialName("discord-bot-token") val token: String,
    @SerialName("server-ip") val serverIp: String,
    @SerialName("server-port") val serverPort: Int,
) {
    companion object {
        val config: Config by lazy { load() }
        private fun load(): Config {
            val file = File("config.yml")
            if (file.isDirectory) {
                println("config.yml must be file!!!!!")
                exitProcess(-1)
            }
            if (!file.exists()) {
                Config::class.java.classLoader.getResourceAsStream("config.yml")?.use { input ->
                    file.outputStream().buffered().use { output ->
                        input.copyTo(output)
                    }
                }
            }

            return Yaml.default.decodeFromStream(serializer(), file.inputStream().buffered())
        }
    }
}