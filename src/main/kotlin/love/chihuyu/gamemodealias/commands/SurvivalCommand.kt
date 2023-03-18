package love.chihuyu.gamemodealias.commands

import love.chihuyu.gamemodealias.GamemodeAliasPlugin.Companion.prefix
import org.bukkit.GameMode
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object SurvivalCommand: Command("survival") {
    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {
        if (sender !is Player || !sender.hasPermission("gamemodealias.command.survival")) return

        sender.gameMode = GameMode.SURVIVAL
        sender.sendMessage("$prefix Gamemode set to survival.")
    }

    override fun onTabComplete(sender: CommandSender, label: String, args: Array<out String>): List<String>? {
        return emptyList()
    }
}