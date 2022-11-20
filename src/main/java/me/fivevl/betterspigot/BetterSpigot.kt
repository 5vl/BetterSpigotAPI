package me.fivevl.betterspigot

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author 5vl
 * @since 0.0.1
 */
object BetterSpigot {
    /**
     * @return The API users JavaPlugin instance
     */
    lateinit var instance: JavaPlugin

    /**
     * Initializes the API
     */
    fun BetterSpigot(plugin: JavaPlugin) {
        instance = plugin
    }
}
