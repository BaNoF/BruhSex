
// SelfCoded by Almazoff а ой by BaNoF_

package ru.mine.banoff;

import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import ru.mine.banoff.Utils.ColorUtils;

public class BruhSex extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("sex")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                spawnParticles(player);
                player.sendMessage(ColorUtils.colorize("&1Ах-Да, глубже..."));
                return true;
            } else {
                sender.sendMessage(ColorUtils.colorize("&cСиреноголовые не могут писать комманды"));
                return true;
            }
        }
        return false;
    }

    private void spawnParticles(Player player) {
        for (int i = 0; i < 100; i++) {
            double offsetX = Math.random() * 2 - 1;
            double offsetY = Math.random() * 2;
            double offsetZ = Math.random() * 2 - 1;
            player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation().add(offsetX, offsetY, offsetZ), 0);
        }
    }
}
