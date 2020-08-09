package me.imdanix.wgtranslator;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public class I18n implements CommandExecutor {

    public I18n() {
        Bukkit.getLogger().info("[WGTranslator] Initializing translation from the file.");
        reload();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("&6&lWGTranslator &f&oby imDaniX");
        if (!reload()) {
            sender.sendMessage(ChatColor.YELLOW + "Translation is reloaded, but something went wrong. " +
                    "Please check the console.");
        } else {
            sender.sendMessage(ChatColor.GREEN + "Translation was successfully reloaded.");
        }
        return true;
    }

    private static boolean reload() {
        FileConfiguration cfg = getConfig();
        if (cfg == null) {
            return false;
        }
        List<String> errors = new ArrayList<>();
        for (Msg msg : Msg.values()) {
            String section = toSection(msg);
            if (!msg.setMessage(cfg.getString(section))) {
                errors.add(section);
            }
        }
        Logger log = Bukkit.getLogger();
        if (errors.isEmpty()) {
            log.info("[WGTranslator] Successfully reloaded all the messages.");
            return true;
        } else {
            log.warning("[WGTranslator] Some messages don't have its translation in translator.yml. " +
                    "Using default ones for these: " + String.join(", ", errors));
            return false;
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private static FileConfiguration getConfig() {
        File file = new File(WorldGuardPlugin.inst().getDataFolder(), "translator.yml");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            try {
                Bukkit.getLogger().info("[WGTranslator] Creating new file with default messages.");
                file.createNewFile();
                FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
                for (Msg msg : Msg.values()) {
                    cfg.set(toSection(msg), msg.getDefault());
                }
                cfg.save(file);
                return cfg;
            } catch (Exception e) {
                Bukkit.getLogger().warning("[WGTranslator] Something went wrong during translation file creation.");
                e.printStackTrace();
                return null;
            }
        }
        Bukkit.getLogger().info("[WGTranslator] Loading file with current messages.");
        return YamlConfiguration.loadConfiguration(file);
    }

    private static String toSection(Msg msg) {
        return StringUtils.replaceChars(msg.name().toLowerCase(Locale.ENGLISH), '_', '.');
    }
}
