
// SelfCoded by Almazoff а ой by BaNoF_

package ru.mine.banoff.Utils;

import org.bukkit.ChatColor;

public class ColorUtils {
    public static String colorize(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}