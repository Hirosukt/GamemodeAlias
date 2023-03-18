package love.chihuyu.gamemodealias.commands

import love.chihuyu.gamemodealias.GamemodeAliasPlugin.Companion.prefix
import org.bukkit.GameMode
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object AdventureCommand: Command("adventure") {
    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {

        if (sender !is Player || !sender.hasPermission("gamemodealias.command.adventure")) return

        sender.gameMode = GameMode.CREATIVE
        sender.sendMessage("$prefix Gamemode set to adventure.")
    }

    override fun onTabComplete(sender: CommandSender, label: String, args: Array<out String>): List<String>? {
        return emptyList()
    }
}