package org.darbz.adminToolGui.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class InventoryClick_Manager implements Listener {

    private static final String GUI_TITLE = "§x§D§4§3§5§3§5§lᴀ§x§D§3§3§1§3§1§lᴅ§x§D§3§2§C§2§C§lᴍ§x§D§2§2§8§2§8§lɪ§x§D§1§2§3§2§3§lɴ §x§D§0§1§B§1§B§lᴍ§x§C§F§1§6§1§6§lᴀ§x§C§F§1§2§1§2§lɴ§x§C§E§0§D§0§D§lᴀ§x§C§D§0§9§0§9§lɢ§x§C§D§0§4§0§4§lᴇ§x§C§C§0§0§0§0§lʀ";

    @EventHandler
    private void InventoryClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        ItemStack clickedItem = e.getCurrentItem();

        if (e.getView().getTitle().equalsIgnoreCase(GUI_TITLE)) {
            e.setCancelled(true);

            if (clickedItem == null || clickedItem.getType() != Material.PLAYER_HEAD) return;

            if (clickedItem.hasItemMeta() && clickedItem.getItemMeta() instanceof SkullMeta) {
                SkullMeta skullMeta = (SkullMeta) clickedItem.getItemMeta();
                OfflinePlayer headOwner = skullMeta.getOwningPlayer();

                if (headOwner != null) {
                    String headName = headOwner.getName();

                    Player target = Bukkit.getPlayerExact(headName);
                    if (target != null && target.isOnline()) {


                    }
                }
            }
        }
    }
}
