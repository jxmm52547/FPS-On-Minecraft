package xyz.jxmm;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.jxmm.commands.MainCommand;

import java.lang.reflect.Field;

public final class Cs_on_Minecraft extends JavaPlugin {

    public static String mainCmd = "cs", link ="https://github.com/jxmm52547/duels";
    private static Plugin plugin;
    private static xyz.jxmm.api.Duels api;

    @Override
    public void onLoad() {
    }

    @Override
    public void onEnable() {
        plugin = this;
        api = new API();

        // 注册指令
        try{
            Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            bukkitCommandMap.setAccessible(true);
            CommandMap commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());
            commandMap.register(mainCmd, new MainCommand("cs"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        Bukkit.getServicesManager().register(xyz.jxmm.api.Duels.class, api, this, ServicePriority.Highest);

        // 监听玩家连接到服务器
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
