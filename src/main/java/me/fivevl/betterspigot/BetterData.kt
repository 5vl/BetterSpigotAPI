package me.fivevl.betterspigot

import org.bukkit.configuration.file.YamlConfiguration
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
        if (!dataFolder.exists()) dataFolder.mkdirs()
        val file = File(dataFolder, fileName)
        if (!file.exists()) BetterSpigot.instance.getResource(fileName)?.copyTo(file.outputStream())
    }

    /**
     * Gets the custom yml file from the data folder
     * @param fileName The name of the file to get
     * @return The YamlConfiguration of the file
     */
    fun getYml(fileName: String): YamlConfiguration {
        return YamlConfiguration.loadConfiguration(File(BetterSpigot.instance.dataFolder, fileName))
    }
}