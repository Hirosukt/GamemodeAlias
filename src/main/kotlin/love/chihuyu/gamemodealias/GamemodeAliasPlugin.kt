package love.chihuyu.gamemodealias

import love.chihuyu.gamemodealias.commands.*
import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class GamemodeAliasPlugin: JavaPlugin() {
    companion object {
        lateinit var GamemodeAliasPlugin: JavaPlugin
        val prefix = "${ChatColor.GOLD}[GamemodeAlias]${ChatColor.RESET}"
    }

    init {
        GamemodeAliasPlugin = this
    }

    override fun onEnable() {
        super.onEnable()
        listOf(
            AdventureCommand,
            CreativeCommand,
            SpectatorCommand,
            SurvivalCommand
        ).forEach(Command::register)
    }
}