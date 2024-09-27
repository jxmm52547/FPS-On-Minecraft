package xyz.jxmm.events;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.DisplaySlot;
import xyz.jxmm.Cs_on_Minecraft;

import java.util.List;

import static xyz.jxmm.Cs_on_Minecraft.plugin;

public class PlayerJoin implements Listener {
    public static PlayerJoin instance;

    public PlayerJoin() {
        instance = this;
    }
    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
        org.bukkit.entity.Player p = e.getPlayer();
        if (Cs_on_Minecraft.lobbyLocation != null){
            p.teleport(Cs_on_Minecraft.lobbyLocation);
        }
        p.sendTitle("§a§l欢迎来到§b§l終末牽挂§a§l的§b§lTACZ", "§a§lWelcome back!", 10, 70, 20);
        p.setGameMode(GameMode.ADVENTURE);

        List<World> worlds = plugin.getServer().getWorlds();
        for (World w : worlds){
            if (!w.getName().equalsIgnoreCase(Cs_on_Minecraft.lobbyWorld)){
                try{
                    plugin.getServer().getScoreboardManager().getMainScoreboard()
                            .registerNewObjective(w.getName() + "_killCount", Criteria.DUMMY, ChatColor.RED + "击杀数")
                            .setDisplaySlot(DisplaySlot.SIDEBAR);
                    plugin.getServer().getScoreboardManager().getMainScoreboard()
                            .registerNewObjective(w.getName() + "_deathCount", Criteria.DUMMY, ChatColor.BLUE + "死亡数")
                            .setDisplaySlot(DisplaySlot.PLAYER_LIST);
                } catch (IllegalArgumentException exception){
                    plugin.getServer().getScoreboardManager().getMainScoreboard().getObjective(w.getName() + "_killCount").unregister();
                    plugin.getServer().getScoreboardManager().getMainScoreboard().getObjective(w.getName() + "_deathCount").unregister();
                    plugin.getServer().getScoreboardManager().getMainScoreboard()
                            .registerNewObjective(w.getName() + "_killCount", Criteria.DUMMY, ChatColor.RED + "击杀数")
                            .setDisplaySlot(DisplaySlot.SIDEBAR);
                    plugin.getServer().getScoreboardManager().getMainScoreboard()
                            .registerNewObjective(w.getName() + "_deathCount", Criteria.DUMMY, ChatColor.BLUE + "死亡数")
                            .setDisplaySlot(DisplaySlot.PLAYER_LIST);
                }
            }
        }
    }
}