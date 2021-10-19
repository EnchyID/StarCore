package me.frogas.starcore;

import cn.nukkit.Player;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;
import cn.nukkit.item.Item;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.event.player.PlayerJoinEvent;

public class StarCore extends PluginBase implements Listener {
    
    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getServer().getLogger().info("Enable by @Frogas");
    }

    public void onJoin(PlayerJoinEvent event){
        final Player player = event.getPlayer();
        inventory = player.getInventory();
        inventory.clearAll();
        inventory.setItem(0, Item.get(264, 0, 1).setCustomName("MY ITEM"));
    }

    public void onQuit(PlayerQuitEvent event){
        final Player player = event.getPlayer();
        itemHand = player.getInventory().getItemInHand();
        if(itemHand.getCustomName() == "MY ITEM"){
            player.sendMessage("You've clicked MY ITEM!");
            return true;
        }
    }
}
