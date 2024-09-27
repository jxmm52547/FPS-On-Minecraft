package xyz.jxmm.events;

import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Score;
import xyz.jxmm.gaming.InGame;

import java.util.Set;

public class PlayerRespawn implements Listener {
    public static PlayerRespawn instance;

    public PlayerRespawn() {
        instance = this;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerDeath(org.bukkit.event.player.PlayerRespawnEvent e) {
        Player deathPlayer = e.getPlayer();
        Player killer = e.getPlayer().getKiller();
        new InGame(deathPlayer).respawn();
        if (killer != null && killer.getHealth() + 4 <=20) {
            killer.setHealth(killer.getHealth() + 4);
            new InGame(killer).addScore();
        }


    }

}
