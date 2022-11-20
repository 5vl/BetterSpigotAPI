package me.fivevl.betterspigot

import org.bukkit.plugin.java.JavaPlugin

object BetterSpigot {
    lateinit var instance: JavaPlugin
    fun BetterSpigot(plugin: JavaPlugin) {
        instance = plugin
    }
}
