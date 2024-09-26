package xyz.jxmm.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class PlayerRespawn implements Listener {
    public static PlayerRespawn instance;

    public PlayerRespawn() {
        instance = this;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerDeath(org.bukkit.event.player.PlayerRespawnEvent e) {
        org.bukkit.entity.Player p = e.getPlayer();


    }
}
