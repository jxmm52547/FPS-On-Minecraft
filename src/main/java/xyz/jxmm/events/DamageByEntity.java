package xyz.jxmm.events;

import com.mohistmc.bukkit.entity.MohistModsEntity;
import com.tacz.guns.api.event.common.EntityHurtByGunEvent;
import net.minecraft.world.entity.Entity;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.projectiles.ProjectileSource;

import java.util.Arrays;

import static xyz.jxmm.Cs_on_Minecraft.plugin;
import static xyz.jxmm.gaming.team_sd.TeamPlayerList.spectatorList;
import static xyz.jxmm.utils.SendActionBar.sendActionBar;

public class DamageByEntity implements Listener {
    public static DamageByEntity instance;

    public DamageByEntity(){
        instance = this;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onDamage(org.bukkit.event.entity.EntityDamageByEntityEvent event){
        plugin.getLogger().warning(Arrays.toString(EntityType.values()));

        if (event.getEntity() instanceof Player victim && event.getDamager() instanceof MohistModsEntity entity){

            Entity nmsEntity = entity.getHandle();

            if (nmsEntity instanceof com.tacz.guns.entity.EntityKineticBullet){
                com.tacz.guns.entity.EntityKineticBullet kineticBullet = (com.tacz.guns.entity.EntityKineticBullet) nmsEntity;
                ProjectileSource projectileSource = kineticBullet.projectileSource;

            }

            Player damager = (Player) event.getDamager();
            if (spectatorList.contains(damager)){
                sendActionBar(damager, ChatColor.RED + "旁观模式下, 您无法攻击玩家");
                event.setCancelled(true);
            } else {
                sendActionBar(damager, ChatColor.GREEN + victim.getName() + ChatColor.GOLD + " 剩余 " + ChatColor.RED + victim.getHealth() + "❤");

            }
        }
    }
}
