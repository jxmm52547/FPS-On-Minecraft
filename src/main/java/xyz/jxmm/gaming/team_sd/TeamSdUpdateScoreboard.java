package xyz.jxmm.gaming.team_sd;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import static xyz.jxmm.Cs_on_Minecraft.plugin;
import static xyz.jxmm.utils.SendActionBar.sendActionBar;

public class TeamSdUpdateScoreboard {
    private Player player;
    private final Scoreboard scoreboard = plugin.getServer().getScoreboardManager().getMainScoreboard();
    private String worldName;

    public TeamSdUpdateScoreboard(Player player){
        this.player = player;
        this.worldName = player.getWorld().getName();
    }

    public void death(){
        Objective deathCount = scoreboard.getObjective(worldName + "_deathCount");
        if (deathCount != null) {
            int score = deathCount.getScore(player.getName()).getScore();
            deathCount.getScore(player.getName()).setScore(score+1);
        }
        sendActionBar(player,
                ChatColor.DARK_RED + "死亡数: "
                + ChatColor.RED + deathCount.getScore(player.getName()).getScore());

    }

    public void kill(){
        Objective killCount = scoreboard.getObjective(worldName + "_killCount");
        if (killCount != null) {
            int score = killCount.getScore(player.getName()).getScore();
            killCount.getScore(player.getName()).setScore(score+1);
        }
        sendActionBar(player,
                ChatColor.DARK_GREEN + "击杀数: "
                        + ChatColor.GREEN + killCount.getScore(player.getName()).getScore());
        // 获取计分板
        if (TeamPlayerList.playerListA.contains(player)){
            Objective score = plugin.getServer().getScoreboardManager().getMainScoreboard().getObjective(worldName + "_score");
            int s = score.getScore("队伍A").getScore();
            score.getScore("队伍A").setScore(s + 1);
            plugin.getServer().getScoreboardManager().getMainScoreboard().clearSlot(DisplaySlot.SIDEBAR);
            score.setDisplaySlot(DisplaySlot.SIDEBAR);
        } else if (TeamPlayerList.playerListB.contains(player)){
            Objective score = plugin.getServer().getScoreboardManager().getMainScoreboard().getObjective(worldName + "_score");
            int s = score.getScore("队伍B").getScore();
            score.getScore("队伍B").setScore(s + 1);
            plugin.getServer().getScoreboardManager().getMainScoreboard().clearSlot(DisplaySlot.SIDEBAR);
            score.setDisplaySlot(DisplaySlot.SIDEBAR);
        }

    }

    public void clear(){
        Objective killCount = scoreboard.getObjective(worldName + "_killCount");
        Objective deathCount = scoreboard.getObjective(worldName + "_deathCount");
        if (killCount != null) {
            killCount.getScoreboard().resetScores(player.getName());
        }
        if (deathCount != null) {
            deathCount.getScoreboard().resetScores(player.getName());
        }

    }
}
