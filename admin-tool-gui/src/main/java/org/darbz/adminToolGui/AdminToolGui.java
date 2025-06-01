package org.darbz.adminToolGui;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.darbz.adminToolGui.commands.main_command;
import org.darbz.adminToolGui.commands.tabcompletor.main_tabcompletor;
import org.darbz.adminToolGui.menus.PlayerManager;

public final class AdminToolGui extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().broadcastMessage("Admin-Tools V-2.0 Has Started.");
        System.out.println("Admin-Tools V-2.0 Has Started.");
        getCommand("admintools").setExecutor(new main_command());
        getCommand("admintools").setTabCompleter(new main_tabcompletor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
