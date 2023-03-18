package love.chihuyu.gamemodealias.commands

import love.chihuyu.gamemodealias.GamemodeAliasPlugin
import org.bukkit.GameMode
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object SpectatorCommand: Command("spectator") {
    override fun onCommand(sender: CommandSender, label: String, args: Array<out String>) {
        if (sender !is Player || !sender.hasPermission("gamemodealias.command.spectator")) return

        sender.gameMode = GameMode.SPECTATOR
        sender.sendMessage("${GamemodeAliasPlugin.prefix} Gamemode set to spectator.")
    }

    override fun onTabComplete(sender: CommandSender, label: String, args: Array<out String>): List<String>? {
        return emptyList()
    }
}