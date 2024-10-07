package xyz.jxmm.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import xyz.jxmm.Cs_on_Minecraft;

public class EventListener {
    static Plugin plugin = Cs_on_Minecraft.getPlugin();
    public static void main(){
        // 监听玩家连接到服务器
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), plugin);
        // 监听玩家死亡
        Bukkit.getPluginManager().registerEvents(new PlayerRespawn(), plugin);
        // 监听玩家饥饿值
        Bukkit.getPluginManager().registerEvents(new HungryEvent(), plugin);
        // 监听玩家传送
        Bukkit.getPluginManager().registerEvents(new PlayerWorldChange(), plugin);
    }
}
