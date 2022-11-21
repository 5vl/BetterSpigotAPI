package me.fivevl.betterspigot

/**
 * @author 5vl
 * @since 0.0.1
 */
object BetterPlayers {
    /**
     * Send a message to all players on the server
     * @param message The message to send to all players
     * @sample BetterPlayers.sendAllMessage("Hello, world!")
     */
    fun sendAllMessage(message: String) {
        BetterSpigot.instance.server.onlinePlayers.forEach { it.sendMessage(message) }
    }
    /**
     * Send a message to all players on the server that have a specified permission
     * @param message The message to send to all players
     * @param permission Checks if player has this permission
     */
    fun sendAllMessage(message: String, permission: String) {
        BetterSpigot.instance.server.onlinePlayers.forEach { if (it.hasPermission(permission)) it.sendMessage(message) }
    }
}