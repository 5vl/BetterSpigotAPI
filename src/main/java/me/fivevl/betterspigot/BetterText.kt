package me.fivevl.betterspigot

import net.md_5.bungee.api.ChatColor

/**
 * @author 5vl
 * @since 0.0.1
 */
object BetterText {
    /**
     * @return The color-translated string
     * @sample String#color() - "&aGreen, &cRed and &bBlue".color()
     */
    fun String.color(): String {
        return ChatColor.translateAlternateColorCodes('&', this)
    }
}
