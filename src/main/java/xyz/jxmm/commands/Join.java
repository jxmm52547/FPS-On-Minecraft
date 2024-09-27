package xyz.jxmm.commands;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.bukkit.*;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.jxmm.Cs_on_Minecraft;
import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.api.command.SubCommand;
import xyz.jxmm.gaming.InGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static xyz.jxmm.utils.FileReaderMethod.fileReader;

public class Join extends SubCommand implements ParentCommand {
    private ParentCommand parent;
    private String name;
    static Plugin plugin = Cs_on_Minecraft.getPlugin();
    static Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    /**
     * @param parent parent command
     * @param name   sub-command name
     */
    public Join(ParentCommand parent, String name) {
        super(parent, name);
        this.parent = parent;
        this.name = name;
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
        if (args.length == 0){
            if (!player.getWorld().getName().equals(Cs_on_Minecraft.lobbyWorld)){
                new InGame(player).firstJoin();
            } else {
                player.sendMessage(ChatColor.RED + "无参数仅能在地图中使用!");
            }

            return true;
        } else {
            World w = Bukkit.getWorld(args[0].replaceAll(" ",""));
            player.teleport(w.getSpawnLocation());
            player.setGameMode(GameMode.SPECTATOR);
            player.sendTitle(ChatColor.GREEN + "You have joined " + args[0], ChatColor.AQUA + "Have fun!", 10, 70, 20);

            return true;
        }

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
        return tabComplete(s, alias, args, location);
    }

    @Override
    public List<String> tabComplete(CommandSender s, String alias, String[] args, Location location) throws IllegalArgumentException {
        if (!(s instanceof Player)) return null;

        Player p = (Player) s;
        if (p.getWorld().getName().equalsIgnoreCase(Cs_on_Minecraft.lobbyWorld)){
            List<String> list = new ArrayList<>();
            for (World w : Bukkit.getWorlds()){
                if (!w.getName().equals(Cs_on_Minecraft.lobbyWorld)){
                    list.add(w.getName());
                }
            }
            return list;
        }

        return null;
    }

    /**
     * Check if a parent command has the target sub-command
     *
     * @param name
     */
    @Override
    public boolean hasSubCommand(String name) {
        return false;
    }

    /**
     * Add a subCommand
     *
     * @param subCommand
     */
    @Override
    public void addSubCommand(SubCommand subCommand) {

    }

    /**
     * Send sub-commands list to a player
     * This includes subCommands with showInList true only
     * He can see only commands which he have permission
     *
     * @param p
     */
    @Override
    public void sendSubCommands(Player p) {

    }

    /**
     * Get available subCommands
     */
    @Override
    public List<SubCommand> getSubCommands() {
        return List.of();
    }

    /**
     * Get parent name
     */
    @Override
    public String getName() {
        return "";
    }
}
