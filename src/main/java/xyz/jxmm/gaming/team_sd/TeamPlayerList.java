package xyz.jxmm.gaming.team_sd;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;
import java.util.List;

import static xyz.jxmm.Cs_on_Minecraft.plugin;

public class TeamPlayerList {
    public static List<Player> playerListA = new ArrayList<>();
    public static List<Player> playerListB = new ArrayList<>();

    public static void main(Player p, String teamName){
        String worldName = p.getWorld().getName();
        for (Team team : plugin.getServer().getScoreboardManager().getMainScoreboard().getTeams()){
            if (team.hasEntry(p.getName())) team.removeEntry(p.getName());
        }
        Team team = plugin.getServer().getScoreboardManager().getMainScoreboard().getTeam(teamName);
        team.addEntry(p.getName());

        teamName = teamName.replaceAll(worldName,"");
        switch (teamName){
            case "teamA" -> playerListA.add(p);
            case "teamB" -> playerListB.add(p);
        }


    }
}
