/*
 * BuildBattle 3 - Ultimate building competition minigame
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

/**
 * @author Plajer
 * <p>
 * Created at 14.05.2018
 */
public class MessageUtils {

    public static void thisVersionIsNotSupported() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "  _   _           _                                                    _                _ ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " | \\ | |   ___   | |_     ___   _   _   _ __    _ __     ___    _ __  | |_    ___    __| |");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " |  \\| |  / _ \\  | __|   / __| | | | | | '_ \\  | '_ \\   / _ \\  | '__| | __|  / _ \\  / _` |");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " | |\\  | | (_) | | |_    \\__ \\ | |_| | | |_) | | |_) | | (_) | | |    | |_  |  __/ | (_| |");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " |_| \\_|  \\___/   \\__|   |___/  \\__,_| | .__/  | .__/   \\___/  |_|     \\__|  \\___|  \\__,_|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "                                       |_|     |_|                                        ");
    }

    public static void weAreSadSadSad() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " __        __                                                     _          __         __");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " \\ \\      / /   ___      __ _   _ __    ___     ___    __ _    __| |    _   / /    _   / /");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "  \\ \\ /\\ / /   / _ \\    / _` | | '__|  / _ \\   / __|  / _` |  / _` |   (_) | |    (_) | | ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "   \\ V  V /   |  __/   | (_| | | |    |  __/   \\__ \\ | (_| | | (_| |    _  | |     _  | | ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "    \\_/\\_/     \\___|    \\__,_| |_|     \\___|   |___/  \\__,_|  \\__,_|   (_) | |    (_) | | ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "                                                                            \\_\\        \\_\\");
    }

    public static void errorOccured() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "  _____                                                                                  _   _ ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " | ____|  _ __   _ __    ___    _ __      ___     ___    ___   _   _   _ __    ___    __| | | |");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " |  _|   | '__| | '__|  / _ \\  | '__|    / _ \\   / __|  / __| | | | | | '__|  / _ \\  / _` | | |");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " | |___  | |    | |    | (_) | | |      | (_) | | (__  | (__  | |_| | | |    |  __/ | (_| | |_|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " |_____| |_|    |_|     \\___/  |_|       \\___/   \\___|  \\___|  \\__,_| |_|     \\___|  \\__,_| (_)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "                                                                                               ");
    }

    public static void updateIsHere() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "  _   _               _           _          ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " | | | |  _ __     __| |   __ _  | |_    ___ ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " | | | | | '_ \\   / _` |  / _` | | __|  / _ \\");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " | |_| | | |_) | | (_| | | (_| | | |_  |  __/");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "  \\___/  | .__/   \\__,_|  \\__,_|  \\__|  \\___|");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "         |_|                                 ");
    }

    public static void gonnaMigrate() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "  __  __   _                          _     _                    ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " |  \\/  | (_)   __ _   _ __    __ _  | |_  (_)  _ __     __ _             ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " | |\\/| | | |  / _` | | '__|  / _` | | __| | | | '_ \\   / _` |            ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " | |  | | | | | (_| | | |    | (_| | | |_  | | | | | | | (_| |  _   _   _ ");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + " |_|  |_| |_|  \\__, | |_|     \\__,_|  \\__| |_| |_| |_|  \\__, | (_) (_) (_)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "               |___/                                    |___/             ");
    }

}
