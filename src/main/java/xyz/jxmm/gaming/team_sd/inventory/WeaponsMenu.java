package xyz.jxmm.gaming.team_sd.inventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import xyz.jxmm.events.InventoryClick;

import java.util.ArrayList;
import java.util.List;

import static xyz.jxmm.utils.ItemStackFromBase64.itemStackFromBase64;

public class WeaponsMenu {
    public static WeaponsMenu instance;

    public WeaponsMenu(){
        instance = this;
    }

    public Inventory main(){
        Inventory inv = Bukkit.createInventory(null, 54, "§6武器菜单");

        // 武器一级菜单
        inv.setItem(0, WeaponsMenuItems.PISTOL_MENU);
        inv.setItem(9, WeaponsMenuItems.SNIPER_MENU);
        inv.setItem(18, WeaponsMenuItems.RIFLE_MENU);
        inv.setItem(27, WeaponsMenuItems.SHOTGUN_MENU);
        inv.setItem(36, WeaponsMenuItems.SMG_MENU);
        inv.setItem(45, WeaponsMenuItems.MACHINE_GUN_MENU);

        // 配件一级菜单
        inv.setItem(8, WeaponsMenuItems.SCOPE_MENU);
        inv.setItem(17, WeaponsMenuItems.MUZZLE_MENU);
        inv.setItem(26, WeaponsMenuItems.STOCK_MENU);
        inv.setItem(35, WeaponsMenuItems.GRIP_MENU);
        inv.setItem(44, WeaponsMenuItems.EXTENDED_MAG_MENU);

        // 返回主菜单
        inv.setItem(4, WeaponsMenuItems.BACK_MAIN_MENU);
        // 关闭菜单
        inv.setItem(49, WeaponsMenuItems.CLOSE_MENU);
        // 加入队伍A
        inv.setItem(48, WeaponsMenuItems.TEAM_A);
        // 加入队伍B
        inv.setItem(50, WeaponsMenuItems.TEAM_B);
        
        // 弹药
        inv.setItem(53, WeaponsMenuItems.AMMO_MENU);
        return inv;
    }




}
