package xyz.jxmm.gaming.team_sd.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

import static xyz.jxmm.utils.ItemStackFromBase64.itemStackFromBase64;

public class InventoryFromItemBase64List{
    public static Inventory inventoryFromItemBase64List(List<String> itemBase64List, Inventory inv){
        List<ItemStack> itemList = new ArrayList<>();

        for (String s : itemBase64List ){
            itemList.add(itemStackFromBase64(s));
        }

        for (int i = 0; i < itemList.size(); i++) {
            inv.setItem(i+ 9, itemList.get(i));
        }

        return inv;
    }

}
