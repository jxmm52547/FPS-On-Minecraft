package xyz.jxmm.cs_on_Minecraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class MainCommand extends Command implements ParentCommand {
    public MainCommand(String name) {
        super(name);
        this.name = name;
        setAliases(List.of("d"));
        new Admin(this,"admin");
        new SetWaitingSpawn(this,"setWaitingSpawn");
        new CreateTeam(this,"createTeam");
        new SetTeamSpawnPoint(this,"setTeamSpawnPoint");

    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        return false;
    }
}
