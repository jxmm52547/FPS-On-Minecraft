package xyz.jxmm.commands.maps;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.api.command.SubCommand;

import java.util.List;

public class CreateMap extends SubCommand implements ParentCommand {
    private ParentCommand parent;
    private String name;
    /**
     * @param parent parent command
     * @param name   sub-command name
     */
    public CreateMap(ParentCommand parent, String name) {
        super(parent, name);
        this.parent = parent;
        this.name = name;
    }

    @Override
    public List<String> tabComplete(CommandSender s, String alias, String[] args, Location location) throws IllegalArgumentException {
        return List.of();
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
        return name;
    }

    /**
     * Add your sub-command code under this method
     *
     * @param args
     * @param s
     */
    @Override
    public boolean execute(String[] args, CommandSender s) {
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
