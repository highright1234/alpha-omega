package io.github.highright1234.alphaomega.commander

import dev.kord.core.Kord
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

object DiscordBot {
    fun start() = MainScope().launch {
        val kord = Kord(Config.config.token)
        // TODO
        kord.login()
    }
}