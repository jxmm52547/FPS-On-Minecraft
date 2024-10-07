package xyz.jxmm.commands.admin.maps;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.api.command.SubCommand;

import java.util.List;

import static xyz.jxmm.Cs_on_Minecraft.lobbyWorld;
import static xyz.jxmm.Cs_on_Minecraft.plugin;

public class ReStart extends SubCommand implements ParentCommand {
    /**
     * @param parent parent command
     * @param name   sub-command name
     */
    public ReStart(ParentCommand parent, String name) {
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
        if (s instanceof ConsoleCommandSender) return false;

        if (args.length == 0){
            for (Player all : ((Player) s).getWorld().getPlayers()){
                all.sendRawMessage("/cs exit");
                return true;
            }
        } else {
            if (args[0].equalsIgnoreCase(lobbyWorld)){
                s.sendMessage( ChatColor.RED + "无法对大厅使用该指令");
            } else {
                for (Player all : plugin.getServer().getWorld(args[0]).getPlayers()){
                    all.sendRawMessage("/cs exit");
                    return true;
                }
            }

        }

        return true;
    }

    @Override
    public boolean needOp() {
        return true;
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
        return tabComplete(s, alias, args, location);
    }

    @Override
    public List<String> tabComplete(CommandSender s, String alias, String[] args, Location location) throws IllegalArgumentException {
        if (args.length == 1) return plugin.getServer().getWorlds().stream().map(World::getName).toList();
        return List.of();
    }

    @Override
    public boolean hasSubCommand(String name) {
        return false;
    }

    @Override
    public void addSubCommand(SubCommand subCommand) {

    }

    @Override
    public void sendSubCommands(Player p) {

    }

    @Override
    public List<SubCommand> getSubCommands() {
        return List.of();
    }

    @Override
    public String getName() {
        return "";
    }
}
