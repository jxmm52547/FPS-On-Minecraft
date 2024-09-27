package xyz.jxmm.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.Cs_on_Minecraft;
import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.api.command.SubCommand;
import xyz.jxmm.gaming.UpdateScoreboard;

import java.util.List;

public class Exit extends SubCommand {
    /**
     * @param parent parent command
     * @param name   sub-command name
     */
    public Exit(ParentCommand parent, String name) {
        super(parent, name);
    }

    /**
     * Add your sub-command code under this method
     *
     * @param args
     * @param s
     */
    @Override
    public boolean execute(String[] args, CommandSender s) {
        if (s instanceof ConsoleCommandSender) {
            s.sendMessage("This command is for player");
            return false;
        }

        Player player = (Player) s;
        if (!player.getWorld().getName().equals(Cs_on_Minecraft.lobbyWorld)){
            player.teleport(player.getWorld().getSpawnLocation());
            player.setGameMode(GameMode.SPECTATOR);
            player.sendTitle("§a§l已切换至旁观模式", "§a§l休息会吗", 10, 70, 20);
            player.setBedSpawnLocation(Cs_on_Minecraft.lobbyLocation,true);

            new UpdateScoreboard(player).clear();


            return true;


        } else {
            player.sendMessage(ChatColor.RED + "无法在大厅使用该指令!");
        }
        return false;
    }

    @Override
    public boolean needOp() {
        return false;
    }

    /**
     * Manage sub-command tab complete
     *
     * @param s
     * @param alias
     * @param args
     * @param location
     */
    @Override
    public List<String> getTabComplete(CommandSender s, String alias, String[] args, Location location) {
        return List.of();
    }
}
