/*
 *  Village Defense 3 - Protect villagers from hordes of zombies
 * Copyright (C) 2018  Plajer's Lair - maintained by Plajer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.plajer.buildbattle3.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import pl.plajer.buildbattle3.arena.Arena;

/**
 * Created by Tom on 15/06/2015.
 */
public class SetupInventory {

    private Inventory inventory;

    //todo better
    public SetupInventory(Arena arena) {
        this.inventory = Bukkit.createInventory(null, 9 * 2, "Arena: " + arena.getID());



        addItem(new ItemBuilder(new ItemStack(Material.REDSTONE_BLOCK)).name(ChatColor.GOLD + "Set End Location").lore(ChatColor.GRAY + "Click to set the end location.").lore(ChatColor.GRAY + "on the place where you are standing").build(), "bb " + arena.getID() + " set ENDLOC");
        addItem(new ItemBuilder(new ItemStack(Material.LAPIS_BLOCK)).name(ChatColor.GOLD + "Set Lobby Location").lore(ChatColor.GRAY + "Click to set the lobby location").lore(ChatColor.GRAY + "on the place where you are standing").build(), "bb " + arena.getID() + " set LOBBYLOC");
        //todo later addItem(new ItemBuilder(new ItemStack(Material.CHEST)).name(ChatColor.GOLD + "Add new plot"));
        addItem(new ItemBuilder(new ItemStack(Material.EMERALD, arena.getMinimumPlayers())).name(ChatColor.GOLD + "Set min players").lore(ChatColor.GRAY + "LEFT click to decrease").lore(ChatColor.GRAY + "RIGHT click to increase").build(), "bb " + arena.getID() + " set MINPLAYERS " + arena.getMinimumPlayers());
        addItem(new ItemBuilder(new ItemStack(Material.EMERALD, arena.getMaximumPlayers())).name(ChatColor.GOLD + "Set max players").lore(ChatColor.GRAY + "LEFT click to decrease").lore(ChatColor.GRAY + "RIGHT click to increase").build(), "bb " + arena.getID() + " set MAXPLAYERS " + arena.getMaximumPlayers());
        if(!Arena.getPlugin().isBungeeActivated()) {
            addItem(new ItemBuilder(new ItemStack(Material.SIGN)).name(ChatColor.GOLD + "Add signs").lore(ChatColor.GRAY + "Select a region with your").lore(ChatColor.GRAY + "world edit wand and click this.").lore(ChatColor.RED + "Be aware that you have Bungee disabled!").build(), "addsigns");
        }
        addItem(new ItemBuilder(new ItemStack(Material.NAME_TAG)).name(ChatColor.GOLD + "Set a mapname (currently: " + arena.getMapName()).lore(ChatColor.GRAY + "Replace this nametag with another nametag").lore(ChatColor.GRAY + "that is named as the mapname").build(), "bb " + arena.getID() + " set MAPNAME <NAME>");
    }

    public void addItem(ItemStack itemStack, String command) {
        inventory.addItem(new ItemBuilder(itemStack).lore(ChatColor.RED + "Command: " + ChatColor.GRAY + "/" + command).build());
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void openInventory(Player player) {
        player.openInventory(inventory);
    }


}
