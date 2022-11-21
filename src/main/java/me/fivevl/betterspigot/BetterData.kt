package me.fivevl.betterspigot

import java.io.File

/**
 * @author 5vl
 * @since 0.0.1
 */
object BetterData {
    /**
     * Creates default yml file from resources folder if it doesn't exist yet
     * @param fileName The name of the file to create
     */
    fun createDefaultYml(fileName: String) {
        val dataFolder = BetterSpigot.instance.dataFolder
        if (!dataFolder.exists()) dataFolder.mkdir()
        val file = File(dataFolder, fileName)
        if (!file.exists()) BetterSpigot.instance.getResource(fileName)?.copyTo(file.outputStream())
    }
}