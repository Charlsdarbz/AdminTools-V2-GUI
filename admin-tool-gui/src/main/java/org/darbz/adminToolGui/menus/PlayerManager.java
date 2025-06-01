package org.darbz.adminToolGui.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerManager {
    public static void MenuGUI(Player player) {
        Inventory menu = Bukkit.createInventory(player, 36,
                "§x§D§4§3§5§3§5§lᴀ§x§D§3§3§1§3§1§lᴅ§x§D§3§2§C§2§C§lᴍ§x§D§2§2§8§2§8§lɪ§x§D§1§2§3§2§3§lɴ §x§D§0§1§B§1§B§lᴍ§x§C§F§1§6§1§6§lᴀ§x§C§F§1§2§1§2§lɴ§x§C§E§0§D§0§D§lᴀ§x§C§D§0§9§0§9§lɢ§x§C§D§0§4§0§4§lᴇ§x§C§C§0§0§0§0§lʀ");

        ItemStack background = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta bMeta = background.getItemMeta();
        bMeta.setDisplayName(" ");
        bMeta.setHideTooltip(true);
        background.setItemMeta(bMeta);
        for (int i = 0; i < 36; i++) {
            menu.setItem(i, background);
        }

        int slot = 10;

        for (Player target : Bukkit.getOnlinePlayers()) {
            if (slot >= 36) break;

            ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
            SkullMeta meta = (SkullMeta) skull.getItemMeta();

            if (meta != null) {
                meta.setOwningPlayer(target);
                meta.setDisplayName(ChatColor.GREEN + target.getName());
                skull.setItemMeta(meta);
            }

            menu.setItem(slot, skull);

            slot++;
        }

        player.openInventory(menu);
    }
}
