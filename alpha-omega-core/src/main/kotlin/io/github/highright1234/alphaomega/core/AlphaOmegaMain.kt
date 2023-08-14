package io.github.highright1234.alphaomega.core

object AlphaOmegaMain {
    fun start() {
        AlphaOmegaClient.start()
        LogInterceptor.start()
    }

    fun stop() {
        AlphaOmegaClient.stop()
    }
}