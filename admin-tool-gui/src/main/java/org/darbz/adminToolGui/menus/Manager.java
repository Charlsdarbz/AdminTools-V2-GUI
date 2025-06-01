package org.darbz.adminToolGui.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Manager implements Listener {
    public static void ManagePlayer(Player player, String Mtarget) {

        Inventory menu = Bukkit.createInventory(player, 36, ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Manage" + Mtarget);

        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta meta = (SkullMeta) head.getItemMeta();

        OfflinePlayer targetPlayer = Bukkit.getOfflinePlayer(Mtarget);
        meta.setOwningPlayer(targetPlayer);
        meta.setDisplayName(ChatColor.GOLD + "Manage " + Mtarget);

        head.setItemMeta(meta);

        ItemStack background = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta bMeta = background.getItemMeta();
        bMeta.setDisplayName(" ");
        bMeta.setHideTooltip(true);
        background.setItemMeta(bMeta);
        for (int i = 0; i < 36; i++) {
            menu.setItem(i, background);
        }
        menu.setItem(49, head);

        ItemStack freeze = new ItemStack(Material.BLUE_ICE, 1);
        ItemMeta Fmeta = freeze.getItemMeta();

        Fmeta.setDisplayName(ChatColor.AQUA.toString() + ChatColor.BOLD + "Freeze" + targetPlayer.getName());

        freeze.setItemMeta(Fmeta);



        player.openInventory(menu);
    }
    @EventHandler
    public void ManagerClick(InventoryClickEvent e) {
        if(e.getView().getTitle().contains(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "Manage")) {
            e.setCancelled(true);
            if(e.getCurrentItem().getType() == Material.PLAYER_HEAD) {
                String Head = e.getCurrentItem().getItemMeta().getDisplayName().toString();

                Player target = Bukkit.getPlayerExact(Head);

            if(e.getCurrentItem().getType() == Material.BLUE_ICE) {
                // 1/06/2025 'Need to work on freeze'
            }




            }
        }
    }
}

