package xyz.jxmm.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class HungryEvent implements Listener {
    public static HungryEvent instance;
    public HungryEvent() {
        instance = this;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onHungry(org.bukkit.event.entity.FoodLevelChangeEvent e) {
        Player player = (Player) e.getEntity();
        player.setFoodLevel(20);
    }
}
