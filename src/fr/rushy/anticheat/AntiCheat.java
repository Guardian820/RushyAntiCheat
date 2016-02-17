package fr.rushy.anticheat;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

/**
 * @author Quentixx
 * @author Itz_Kiwix
 * @author Fatapix
 */

public class AntiCheat extends JavaPlugin {

	public static Plugin plugin;
	private static ProtocolManager protocolManager;
	
	public void onLoad() {
		protocolManager = ProtocolLibrary.getProtocolManager();
	}
	
	public void onEnable() {
		plugin = this;
	}
	
	public static ProtocolManager getProtocolManager() {
		return protocolManager;
	}
}
