package io.github.highright1234.alphaomega.core

import io.ktor.client.*
import io.ktor.client.plugins.websocket.*
import io.ktor.http.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

object AlphaOmegaClient {
    private val client = HttpClient {
        install(WebSockets)
    }
    val flow = MutableSharedFlow<String>()

    fun start() = MainScope().launch {
        client.webSocket(method = HttpMethod.Get, host = "127.0.0.1", port = 8080, path = "/chat") {
            while (true) {
                yield()
            }
        }
    }

    fun stop() {
        client.close()
    }
}