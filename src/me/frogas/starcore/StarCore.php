package me.frogas.starcore;

import cn.nukkit.Player;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.event.player.PlayerJoinEvent;

public class StarCore extends PluginBase implements Listener {
    
    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getServer().getLogger().info("Enable by @Frogas");
    }
}
