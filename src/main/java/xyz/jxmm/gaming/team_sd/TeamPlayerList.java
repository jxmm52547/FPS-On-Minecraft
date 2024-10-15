package xyz.jxmm.gaming.team_sd;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.ArrayList;
import java.util.List;

import static xyz.jxmm.Cs_on_Minecraft.plugin;

public class TeamPlayerList {
    public static List<Player> playerListA = new ArrayList<>();
    public static List<Player> playerListB = new ArrayList<>();
    public static List<Player> spectatorList = new ArrayList<>();

    public static void main(Player p, String teamName){
        String worldName = p.getWorld().getName();
        teamName = teamName.replaceAll(worldName,"");

        for (Team team : plugin.getServer().getScoreboardManager().getMainScoreboard().getTeams()){
            if (team.hasPlayer(p)){
                team.removePlayer(p);
                playerListA.remove(p);
                playerListB.remove(p);
            }
        }
        Team team = plugin.getServer().getScoreboardManager().getMainScoreboard().getTeam(worldName + teamName);
        team.addPlayer(p);

        switch (teamName){
            case "teamA": {
                playerListA.add(p);
                break;
            }
            case "teamB": {
                playerListB.add(p);
            }
        }
    }

    /**
     * 处理玩家是否加入观战
     *
     * @param p  要操作的玩家
     * @param target
     *
     * "join" - 加入观战
     * "quit" - 退出观战
     */
    public static void spectator(Player p, String target){
        switch (target) {
            case "join" -> spectatorList.add(p);
            case "quit" -> spectatorList.remove(p);
        }
    }
}
