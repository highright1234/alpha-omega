package io.github.highright1234.alphaomega.plugin

import io.github.alphaomega.core.AlphaOmegaMain
import org.bukkit.plugin.java.JavaPlugin

@Suppress("Unused")
class AlphaOmegaPlugin: JavaPlugin() {
    override fun onEnable() = AlphaOmegaMain.start()
    override fun onDisable() = AlphaOmegaMain.stop()
}