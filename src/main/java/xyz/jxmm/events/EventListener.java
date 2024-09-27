package xyz.jxmm.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import xyz.jxmm.Cs_on_Minecraft;

public class EventListener {
    static Plugin plugin = Cs_on_Minecraft.getPlugin();
    public static void main(){
        // 监听玩家连接到服务器
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), plugin);
        Bukkit.getPluginManager().registerEvents(new PlayerRespawn(), plugin);
        Bukkit.getPluginManager().registerEvents(new HungryEvent(), plugin);
    }
}
