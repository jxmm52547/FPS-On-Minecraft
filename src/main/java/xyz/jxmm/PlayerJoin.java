package xyz.jxmm;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class PlayerJoin implements Listener {
    public static PlayerJoin instance;

    public PlayerJoin() {
        instance = this;
    }
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
        org.bukkit.entity.Player p = e.getPlayer();
        p.sendTitle("§a§l欢迎来到§b§l終末牽挂§a§l的§b§lTACZ", "§a§lWelcome back!", 10, 70, 20);
        p.setGameMode(GameMode.SPECTATOR);

    }
}