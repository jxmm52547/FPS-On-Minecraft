package xyz.jxmm.gaming.team_sd.inventory.weapons;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import xyz.jxmm.gaming.team_sd.inventory.WeaponsMenuItems;

import java.util.Arrays;
import java.util.List;

import static xyz.jxmm.gaming.team_sd.inventory.InventoryFromItemBase64List.inventoryFromItemBase64List;

public class MachineGun {
    public static Inventory main() {
        Inventory inv = Bukkit.createInventory(null, 54, "§6狙击枪菜单");
        // 返回主菜单
        inv.setItem(4, WeaponsMenuItems.BACK_MAIN_MENU);

        List<String> itemBase64List = Arrays.asList(
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AKBINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVlSQk5yN0pLeWtsTXpvN1BUU3pLVGkySkx5cklOamZoWU9B\r\nR1NydGxGcVg2NXFla01yQTRob2I0TXpNSUE4V2NTNEg2ODBvY2MzUHpuZk5MODBvWUdCaDBHUURG\r\naU9mdFpnQUFBQT09\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AJBINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVllQk1yN0lxc1RETXlVM25ZT0FHQ3JsbEZxWDY1cWVrTXJB\r\nNGhvYjRNek1JQThXY1M0RjY4a29jYzNQem5mTkw4MG9ZR0JneUdRQUtPM2tmV2dBQUFBPT0=\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AJhINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVlSQklyN0pLemtrc0xzNU1qaThxeURZMzRXRGdCc3E0WlJh\r\nbCt1YW5wREt3T0lhRytETXpDQVBGbkV1Qld2TktISE56ODUzelMvTktHQmdZZEJrQXRvMnVWV0VB\r\nQUFBPQ==\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AJBINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVllQXNTVXl1c3NvMU1ySGtZT0FHQ3JsbEZxWDY1cWVrTXJB\r\nNGhvYjRNek1JQThXY1M0RjY4a29jYzNQem5mTkw4MG9ZR0JpOEdRQkRVbk8zV2dBQUFBPT0=\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AIxINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVllQW9TVXl1c2lvcXlPWmc0QWFLdUdVV3Bmcm1wNlF5c0Rp\r\nR2h2Z3pNd2dEeFp4TGdWcnlTaHh6Yy9PZDgwdnpTaGdZR0RRWUFIWjZmL3BaQUFBQQ==\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AJhINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVlSQkl6a2tzTHM1TUxyTEt6Y3pMVEMvTjQyRGdCc3E0WlJh\r\nbCt1YW5wREt3T0lhRytETXpDQVBGbkV1Qld2TktISE56ODUzelMvTktnRVovWVFBQTNJMUFTMkVB\r\nQUFBPQ==\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AJRINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVllQkp6a2tzTHM1TUxyTEtOVFBnWU9BR2lycGxGcVg2NXFl\r\na01yQTRob2I0TXpNSUE4V2NTNEhhOGtvY2MzUHpuZk5MODBvWUdCaFNHQUNRNXo1dVhRQUFBQT09\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AKRINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVlaQkl6a2tzTHM1TUxySXFxU3hJamJjMGpjL0p6MHRQeWkv\r\nbllPQUdxbkRMTEVyMXpVOUpaV0J4REEzeFoyWVFCb281bHdLTnlDdHh6TTNOZDg0dnpTdGhZR0N3\r\nWVFBQTZNTjhiV2tBQUFBPQ==\r\n",
                "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAXVEFDWl9NT0RFUk5fS0lORVRJQ19HVU5zcQB+AABz\r\ncQB+AAN1cQB+AAYAAAADcQB+AAh0AAltZXRhLXR5cGV0AAhpbnRlcm5hbHVxAH4ABgAAAAN0AAhJ\r\ndGVtTWV0YXQAClVOU1BFQ0lGSUN0AJhINHNJQUFBQUFBQUEvK05pWUdCa0VQUklMSFlxemNsSkxm\r\nSE1jMG9zS2tyTlllUmdZSFV2emZOTVlSQk16a2tzTHM1TUxyTEtOVEt4akM5T0xPZGc0QVpLdVdV\r\nV3Bmcm1wNlF5c0RpR2h2Z3pNd2dEeFp4TGdYcnpTaHh6Yy9PZDgwdnpTaGdZR09RWUFQRVJXL2xp\r\nQUFBQQ==\r\n"
        );

        return inventoryFromItemBase64List(itemBase64List, inv);

    }
}
