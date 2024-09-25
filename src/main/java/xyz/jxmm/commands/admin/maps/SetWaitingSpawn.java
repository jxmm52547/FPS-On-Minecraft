package xyz.jxmm.commands.admin.maps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.jxmm.Cs_on_Minecraft;
import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.api.command.SubCommand;
import xyz.jxmm.map.Misc;
import xyz.jxmm.utils.FileReaderMethod;
import xyz.jxmm.utils.FileWriterMethod;

import java.io.File;
import java.util.List;

public class SetWaitingSpawn extends SubCommand {
    private ParentCommand parent;
    private String name;
    static Plugin plugin = Cs_on_Minecraft.getPlugin();
    static Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    static File arenasFolder = new File(plugin.getDataFolder() + "\\arenas");

    /**
     * @param parent parent command
     * @param name   sub-command name
     */
    public SetWaitingSpawn(ParentCommand parent, String name) {
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
        if (s instanceof Player p) {
            if (p.isOp()) {
                if (!p.getWorld().getName().equals(Cs_on_Minecraft.lobbyWorld)) {
                    Location loc = p.getLocation();
                    World world = loc.getWorld();
                    world.setSpawnLocation(loc);
                    JsonObject json = gson.fromJson(FileReaderMethod.fileReader(arenasFolder + "\\" + world.getName() + ".json"), JsonObject.class);
                    json.get("lobbyLoc").getAsJsonObject().addProperty("x", loc.getX());
                    json.get("lobbyLoc").getAsJsonObject().addProperty("y", loc.getY());
                    json.get("lobbyLoc").getAsJsonObject().addProperty("z", loc.getZ());
                    FileWriterMethod.fileWriter(arenasFolder + "\\" + world.getName() + ".json", gson.toJson(json));

                    p.sendMessage("§a设置等待大厅成功！");
                    p.spigot().sendMessage(Misc.msgHoverClick(ChatColor.BLUE + "     ▪     " + ChatColor.GOLD + "CLICK HERE TO ADD SPAWN POINT    " + ChatColor.BLUE + " ▪", ChatColor.DARK_RED + "Click to add spawn point.", "/" + Cs_on_Minecraft.mainCmd + " admin addSpawnPoint", ClickEvent.Action.RUN_COMMAND));
                    return true;
                } else {
                    p.sendMessage("§c你无法在主大厅设置等待大厅");
                    return true;
                }
            }
        }
        return false;
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
        return List.of();
    }
}
