package xyz.jxmm.gaming.team_sd.inventory.accessories;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import xyz.jxmm.gaming.team_sd.inventory.WeaponsMenuItems;

import java.util.Arrays;
import java.util.List;

import static xyz.jxmm.gaming.team_sd.inventory.InventoryFromItemBase64List.inventoryFromItemBase64List;

public class Muzzle {public static Inventory main() {
    Inventory inv = Bukkit.createInventory(null, 54, "§6狙击枪菜单");
    // 返回主菜单
    inv.setItem(4, WeaponsMenuItems.BACK_MAIN_MENU);

    List<String> itemBase64List = Arrays.asList(
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABYSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUJM\r\nS3JySEpMcTZweVV1T0xNM05TODVKVDQwdUxpa3VMR1FBZ3M4MnlMZ0FBQUE9PQ==\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUE3\r\nS3JySEpMcTZweVV1T0xNM05TODVKVDR3c3lFdk5LOG5Qaml3MFpBSXJtS2tNekFBQUE=\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABYSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUFy\r\nS3JySEpMcTZweVV1T0xNM05TODVKVDQzTXppeExUVXhrQUZsaWVOeThBQUFBPQ==\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABISDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdIZ0I3\r\nS3JySklTSy9QelVrdmljeTBaQU5ZaDBEMGtBQUFB\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUJi\r\nS3JySEpMcTZweVV1T0xNM05TODVKVDR3dEtNblB5QzRveml4a0FlMW1jR3pJQUFBQT0=\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUJi\r\nS3JySEpMcTZweVV1T0xNM05TODVKVDQ3UHpNdE16U3VJTFV4Z0EwVS9zNmpJQUFBQT0=\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABYSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUJM\r\nS3JySEpMcTZweVV1T1RpaEt6VStPVFN6SktjekpLR1FCQzdPR3FMZ0FBQUE9PQ==\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABYSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUJM\r\nS3JySEpMcTZweVV1T1RpaEt6VStNTE12UHpVbE9MR0FDeCszaHVMZ0FBQUE9PQ==\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABgSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUVQ4\r\nNUpMQzdPVEM2eXlpMnRxc3BKalU4dVNrM01yb3d2enN4SnpVdE9MV0lBQVBFSlhvazBBQUFB\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUFi\r\nS3JySEpMcTZweVV1T1RpaEt6VStPVEs1Tno4dk5TNDFPTUdBQW0rTFRHTVFBQUFBPT0=\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABUSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdFUUE3\r\nS3JySEpMcTZweVV1T1RpaEt6VStOTGlsSXJHQUFVL0NaTEt3QUFBQT09\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABMSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdFUUFM\r\nS3JySklTSy9QelVrdml6VEtNR1FBcEdVcmdKUUFBQUE9PQ==\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUI3\r\nS3JySEpMcTZweVV1T1Q4M01MVXZPS0UwdnlpK0pMaWpKVGdFb1lBRUc0RlpBMEFBQUE=\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABUSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdFUVRj\r\nNUpMQzdPVEM2eXFzZzFqeS9PekVuTlMwNHRZZ0FBTWV2L05pb0FBQUE9\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUVNj\r\nNUpMQzdPVEM2eXlpMnRxc3BKalMvT3pFbk5TMDR0aWs5TVRHWUFBTEpHcUFveEFBQUE=\r\n",
            "rO0ABXNyABpvcmcuYnVra2l0LnV0aWwuaW8uV3JhcHBlcvJQR+zxEm8FAgABTAADbWFwdAAPTGph\r\ndmEvdXRpbC9NYXA7eHBzcgA1Y29tLmdvb2dsZS5jb21tb24uY29sbGVjdC5JbW11dGFibGVNYXAk\r\nU2VyaWFsaXplZEZvcm0AAAAAAAAAAAIAAkwABGtleXN0ABJMamF2YS9sYW5nL09iamVjdDtMAAZ2\r\nYWx1ZXNxAH4ABHhwdXIAE1tMamF2YS5sYW5nLk9iamVjdDuQzlifEHMpbAIAAHhwAAAABHQAAj09\r\ndAABdnQABHR5cGV0AARtZXRhdXEAfgAGAAAABHQAHm9yZy5idWtraXQuaW52ZW50b3J5Lkl0ZW1T\r\ndGFja3NyABFqYXZhLmxhbmcuSW50ZWdlchLioKT3gYc4AgABSQAFdmFsdWV4cgAQamF2YS5sYW5n\r\nLk51bWJlcoaslR0LlOCLAgAAeHAAAA2JdAAPVEFDWl9BVFRBQ0hNRU5Uc3EAfgAAc3EAfgADdXEA\r\nfgAGAAAAA3EAfgAIdAAJbWV0YS10eXBldAAIaW50ZXJuYWx1cQB+AAYAAAADdAAISXRlbU1ldGF0\r\nAApVTlNQRUNJRklDdABcSDRzSUFBQUFBQUFBLytOaVlPQmc0SEVzS1VsTXpzaE56U3Z4VEdHUUE3\r\nS3JyRkpTRTlOelV1UFQ4M05TVXZQaWMvTHowdU9URW91S1VuTVlBQ0dsQ3pnekFBQUE=\r\n"
    );

    return inventoryFromItemBase64List(itemBase64List, inv);

    }
}
