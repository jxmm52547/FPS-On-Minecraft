package xyz.jxmm.api.command;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;

import java.util.List;

public abstract class SubCommand {

    // SubCommand name
    private String name;
    // Show the subCommand in the main command list
    private boolean show = false;
    // SubCommand parent
    private ParentCommand parent;
    // Command order in main command list
    private int priority = 20;
    // Display name/ info in subCommands list
    private TextComponent displayInfo;
    // True if this is an arena setup SubCommand
    private boolean arenaSetupCommand = false;
    // Sub command permission
    private String permission = "";

    /**
     *
     * @param name   sub-command name
     * @param parent parent command
     */
    public SubCommand(ParentCommand parent, String name) {
        this.name = name;
        this.parent = parent;
        parent.addSubCommand(this);
    }

    /**
     * Add your sub-command code under this method
     */
    public abstract boolean execute(String[] args, CommandSender s);

    /**
     * Get sub-command name
     */
    public String getSubCommandName() {
        return name;
    }

    /**
     * Display the sub-command under the main command
     * Don't forget to set the displayInfo
     * Ops only will see it cuz players receive a commands list from messages file
     */
    public void showInList(boolean value) {
        this.show = value;
    }

    /**
     * This is the command information in the subCommands list of the target parent
     */
    public void setDisplayInfo(TextComponent displayInfo) {
        this.displayInfo = displayInfo;
    }

    /**
     * This is the command priority in the sub-commands list
     * You may use this method if you set showInList true
     * Commands with a minor number will be displayed first
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * Get parent command
     */
    public ParentCommand getParent() {
        return parent;
    }

    /**
     * Get show priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Get command description for subCommands list
     */
    public TextComponent getDisplayInfo() {
        return displayInfo;
    }

    /**
     * True if it is an arena setup sub-command
     */
    public void setArenaSetupCommand(boolean arenaSetupCommand) {
        this.arenaSetupCommand = arenaSetupCommand;
    }

    /**
     * Check if it is an arena setup command
     */
    public boolean isArenaSetupCommand() {
        return arenaSetupCommand;
    }

    /**
     * Check if is displayed on the list
     */
    public boolean isShow() {
        return show;
    }

    /**
     * Set permission for sub-command
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Check if player has permission to use the command
     */
    public boolean hasPermission(CommandSender p) {
        return permission.isEmpty() || p.hasPermission("duels.*") || p.hasPermission(permission);
    }

    public abstract boolean needOp();



    /**
     * Manage sub-command tab complete
     */
    public abstract List<String> getTabComplete(CommandSender s, String alias, String[] args, Location location);
}
