package xyz.jxmm.map;

import org.bukkit.entity.Player;

public interface ISetupSession {
    /**
     * Get used world name.
     */
    String getWorldName();

    /**
     * Get player doing the setup.
     */
    Player getPlayer();

    /**
     * Teleport player target world.
     */
    void teleportPlayer();

    /**
     * Close setup session.
     */
    void close();
}
