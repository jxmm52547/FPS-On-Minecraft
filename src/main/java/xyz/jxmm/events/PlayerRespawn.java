package xyz.jxmm.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import xyz.jxmm.gaming.InGame;
import xyz.jxmm.gaming.UpdateScoreboard;

public class PlayerRespawn implements Listener {
    public static PlayerRespawn instance;

    public PlayerRespawn() {
        instance = this;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerDeath(org.bukkit.event.player.PlayerRespawnEvent e) {
        Player deathPlayer = e.getPlayer();
        new UpdateScoreboard(deathPlayer).death();

        Player killer = e.getPlayer().getKiller();
        if (killer != null) {
            new UpdateScoreboard(killer).kill();
            new InGame(killer).updateWeapon();
        }

        new InGame(deathPlayer).respawn();
        if (killer != null && killer.getHealth() + 4 <=20) {
            killer.setHealth(killer.getHealth() + 4);
        }


    }

}
