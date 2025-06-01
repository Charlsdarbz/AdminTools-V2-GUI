package org.darbz.adminToolGui.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.darbz.adminToolGui.menus.PlayerManager;

public class main_command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] args) {
        if(Sender instanceof Player) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("Manager")) {
                    Player player = (Player) Sender;
                    PlayerManager.MenuGUI(player);
                    player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1F, 0.5F);
                }
            }
        }
        return false;
    }
}
