package xyz.jxmm.commands;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import xyz.jxmm.Cs_on_Minecraft;
import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.api.command.SubCommand;

import java.util.List;

public class Join extends SubCommand {
    private ParentCommand parent;
    private String name;
    static Plugin plugin = Cs_on_Minecraft.getPlugin();
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
        player.setGameMode(GameMode.ADVENTURE);

        return true;
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
        return null;
    }
}
