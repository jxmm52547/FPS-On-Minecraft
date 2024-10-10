package xyz.jxmm.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import xyz.jxmm.gaming.team_sd.inventory.InventoryList;
import xyz.jxmm.gaming.team_sd.inventory.WeaponsMenuItems;

public class ItemUse implements Listener {
    public static ItemUse instance;
    public ItemUse() {
        instance = this;
    }
    @EventHandler
    public void onUse(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().equals(WeaponsMenuItems.OPEN_MENU)){
            player.openInventory(InventoryList.instance.WEAPON_MENU);
        }
    }
}
