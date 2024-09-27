package xyz.jxmm.gaming;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import xyz.jxmm.Cs_on_Minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static xyz.jxmm.Cs_on_Minecraft.plugin;
import static xyz.jxmm.utils.FileReaderMethod.fileReader;
import static xyz.jxmm.utils.ItemStackFromBase64.itemStackFromBase64;

public class InGame {
    static Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private Player player;
    private String folder = plugin.getDataFolder().toString() + "/arenas/";
    private World world;
    private int score;

    public InGame(Player player) {
        this.player = player;
        this.world = player.getWorld();
    }

    public void firstJoin(){
        player.setGameMode(GameMode.ADVENTURE);
        player.getInventory().clear();
        score = 0;

        JsonArray locations = gson.fromJson(fileReader(folder + world.getName() + ".json"), JsonObject.class).get("respawnPoints").getAsJsonArray();
        List<Location> locationList = new ArrayList<>();
        for (int i = 0; i < locations.size(); i++) {
            double x = locations.get(i).getAsJsonObject().get("x").getAsDouble();
            double y = locations.get(i).getAsJsonObject().get("y").getAsDouble();
            double z = locations.get(i).getAsJsonObject().get("z").getAsDouble();
            float yaw = locations.get(i).getAsJsonObject().get("yaw").getAsFloat();
            float pitch = locations.get(i).getAsJsonObject().get("pitch").getAsFloat();

            Location loc = new Location(world, x, y, z, yaw, pitch);
            locationList.add(loc);
        }
        player.setBedSpawnLocation(locationList.get(new Random().nextInt(locations.size())), true);
        respawn();

    }

    public void respawn(){
        player.setGameMode(GameMode.ADVENTURE);
        player.getInventory().clear();
        JsonArray locations = gson.fromJson(fileReader(folder + world.getName() + ".json"), JsonObject.class).get("respawnPoints").getAsJsonArray();
        List<Location> locationList = new ArrayList<>();
        for (int i = 0; i < locations.size(); i++) {
            double x = locations.get(i).getAsJsonObject().get("x").getAsDouble();
            double y = locations.get(i).getAsJsonObject().get("y").getAsDouble();
            double z = locations.get(i).getAsJsonObject().get("z").getAsDouble();
            float yaw = locations.get(i).getAsJsonObject().get("yaw").getAsFloat();
            float pitch = locations.get(i).getAsJsonObject().get("pitch").getAsFloat();

            Location loc = new Location(world, x, y, z, yaw, pitch);
            locationList.add(loc);
        }
        player.setBedSpawnLocation(locationList.get(new Random().nextInt(locations.size())), true);
        player.teleport(locationList.get(new Random().nextInt(locations.size())));
        this.giveWeapon();
        this.giveDefaultItem();
    }

    public void giveDefaultItem(){
        JsonArray defaultItems = gson.fromJson(fileReader(folder + world.getName() + ".json"), JsonObject.class).get("items").getAsJsonArray();
        List<ItemStack> defaultItemsList = new ArrayList<>();
        for (int i = 0; i < defaultItems.size(); i++) {
            String item = defaultItems.get(i).getAsString();
            ItemStack itemStack = itemStackFromBase64(item);
            defaultItemsList.add(itemStack);
        }

        for (ItemStack itemStack : defaultItemsList){
            player.getInventory().addItem(itemStack);
        }

    }

    public void giveWeapon(){
        player.getInventory().clear();
        JsonArray weapons = gson.fromJson(fileReader(folder + world.getName() + ".json"), JsonObject.class).get("weapons").getAsJsonArray();
        List<ItemStack> weaponsList = new ArrayList<>();
        for (int i = 0; i < weapons.size(); i++) {
            String weapon = weapons.get(i).getAsString();
            ItemStack itemStack = itemStackFromBase64(weapon);
            weaponsList.add(itemStack);
        }
        player.getInventory().addItem(weaponsList.get(score));

    }

    public void addScore(){
        score++;
        this.giveWeapon();
    }
}
