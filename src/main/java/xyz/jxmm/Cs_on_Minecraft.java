package xyz.jxmm.cs_on_Minecraft;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.jxmm.cs_on_Minecraft.commands.MainCommand;

import java.lang.reflect.Field;

public final class Cs_on_Minecraft extends JavaPlugin {

    public static String mainCmd = "cs", link ="https://github.com/jxmm52547/duels";

    @Override
    public void onEnable() {
        try{
            Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            bukkitCommandMap.setAccessible(true);
            CommandMap commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());
            commandMap.register(mainCmd, new MainCommand("duels"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
