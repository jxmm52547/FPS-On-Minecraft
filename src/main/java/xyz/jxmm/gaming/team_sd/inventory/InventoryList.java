package xyz.jxmm.gaming.team_sd.inventory;

import org.bukkit.inventory.Inventory;
import xyz.jxmm.gaming.team_sd.inventory.accessories.*;
import xyz.jxmm.gaming.team_sd.inventory.weapons.*;

public final class InventoryList {
    public static InventoryList instance;
    
    public final Inventory WEAPON_MENU;
    public final Inventory PISOTL_MENU;
    public final Inventory SNIPER_MENU;
    public final Inventory RIFLE_MENU;
    public final Inventory SHOTGUN_MENU;
    public final Inventory SMG_MENU;
    public final Inventory MG_MENU;
    public final Inventory SCOPE_MENU;
    public final Inventory MUZZLE_MENU;
    public final Inventory STOCK_MENU;
    public final Inventory GRIP_MENU;
    public final Inventory EXTENDED_MAG_MENU;
    
    
    public InventoryList(){
        instance = this;

        // 主菜单
        this.WEAPON_MENU = new WeaponsMenu().main();

        // 手枪菜单
        this.PISOTL_MENU = Pistol.main();

        // 狙击枪菜单
        this.SNIPER_MENU = Sniper.main();

        // 步枪菜单
        this.RIFLE_MENU = Rifle.main();
        
        // 霰弹枪菜单
        this.SHOTGUN_MENU = ShotGun.main();
        
        // 冲锋枪菜单
        this.SMG_MENU = SMG.main();

        // 机枪菜单
        this.MG_MENU = MachineGun.main();

        // 瞄具菜单
        this.SCOPE_MENU = Scope.main();

        // 枪口菜单
        this.MUZZLE_MENU = Muzzle.main();

        // 枪托菜单
        this.STOCK_MENU = Stock.main();

        // 握把菜单
        this.GRIP_MENU = Grip.main();

        // 弹匣菜单
        this.EXTENDED_MAG_MENU = ExtendedMag.main();

    }
}
