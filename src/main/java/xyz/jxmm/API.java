package xyz.jxmm;

import xyz.jxmm.api.command.ParentCommand;
import xyz.jxmm.commands.MainCommand;

import java.util.logging.Level;

public class API implements xyz.jxmm.api.Duels{
    @Override
    public IStats getStatsUtil() {
        return null;
    }

    @Override
    public ParentCommand getBedWarsCommand() {
        return MainCommand.instance;
    }


}
