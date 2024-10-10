package xyz.jxmm.map;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.scoreboard.*;
import xyz.jxmm.Cs_on_Minecraft;

import java.util.List;

import static xyz.jxmm.Cs_on_Minecraft.plugin;
import static xyz.jxmm.map.config.MapList.SD_WORLDS;
import static xyz.jxmm.map.config.MapList.TEAM_SD_WORLDS;

public class CreateScoreboard {
    public CreateScoreboard() {
        try {
            plugin.getServer().getScoreboardManager().getMainScoreboard()
                    .registerNewObjective("Health", Criteria.HEALTH, ChatColor.RED + "❤")
                    .setDisplaySlot(DisplaySlot.BELOW_NAME);
        } catch (IllegalArgumentException e){
            plugin.getLogger().info("已存在Health计分板，已跳过");
        }
    }

    public static void load(){

    }
}
