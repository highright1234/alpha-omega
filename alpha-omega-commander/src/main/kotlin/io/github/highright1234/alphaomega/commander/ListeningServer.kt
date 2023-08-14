package io.github.highright1234.alphaomega.commander

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.websocket.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.time.Duration

object ListeningServer {
    fun start() = MainScope().launch {
        embeddedServer(Netty, port = Config.config.serverPort, host = Config.config.serverIp) {
            install(WebSockets) {
                pingPeriod = Duration.ofSeconds(15)
                timeout = Duration.ofSeconds(15)
                maxFrameSize = Long.MAX_VALUE
                masking = false
            }
            // TODO
        }.start(wait = true)
    }
}