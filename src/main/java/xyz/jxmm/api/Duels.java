package xyz.jxmm.api;

import org.bukkit.entity.Player;

import xyz.jxmm.api.command.ParentCommand;

public interface Duels {
    IStats getStatsUtil();

    interface IStats {


        /**
         * This will give the lobby items to the player.
         * Not used in serverType BUNGEE.
         * This will clear the inventory first.
         */
        void sendLobbyCommandItems(Player p);
    }
    /**
     * Get bedWars main command
     */
    ParentCommand getBedWarsCommand();




}

