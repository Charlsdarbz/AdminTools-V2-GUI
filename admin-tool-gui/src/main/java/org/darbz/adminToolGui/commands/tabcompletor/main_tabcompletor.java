package org.darbz.adminToolGui.commands.tabcompletor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class main_tabcompletor implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {

        List<String> m_complets = new ArrayList<>();

        if(args.length == 1) {
            m_complets.add("Manager");
        }


        return m_complets;
    }
}
