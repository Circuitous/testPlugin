package testTube;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by Const on 28.04.2015.
 */
public class TestPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable(){
        getLogger().info("Plugin works just fine.");
    }

    @Override
    public void onDisable(){

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void loginMessage(PlayerLoginEvent event){
        getLogger().log(Level.INFO, "Player " + event.getPlayer().getName() + " has joined our struggle.");
    }
}
