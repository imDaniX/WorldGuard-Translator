package me.imdanix.wgtranslator;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public enum Msg {

    // com.sk89q.worldguard.bukkit.BukkitStringMatcher
    MATCHER_NO_NORMAL_WORLD("No normal world found."),
    MATCHER_NO_NETHER_WORLD("No nether world found."),
    MATCHER_NO_END_WORLD("No end world found."),
    MATCHER_EXPECT_ARG("Argument expected for #player."),
    MATCHER_INVALID_ID("Invalid identifier '{identifier}'.", "identifier"),
    MATCHER_NO_WORLD("No world by that exact name found."),
    MATCHER_NO_PLAYERS("No players matched query."),
    MATCHER_INVALID_GROUP("Invalid group '{group}'.", "group");

    private final String defaultMsg;
    private final String[] placeholders;
    private String currentMsg;

    Msg(String def, String... phs) {
        defaultMsg = ChatColor.translateAlternateColorCodes('&', def);
        currentMsg = defaultMsg;
        placeholders = new String[phs.length];
        for (int i = 0; i < phs.length; i++) {
            placeholders[i] = "{" + phs[i] + "}";
        }
    }

    public String get(Object... args) {
        String result = currentMsg;
        for (int i = 0; i < placeholders.length; i++) {
            result = StringUtils.replace(result, placeholders[i], String.valueOf(args[i]));
        }
        return result;
    }

    public boolean setMessage(String msg) {
        if(msg == null) {
            currentMsg = defaultMsg;
            return false;
        } else {
            currentMsg = ChatColor.translateAlternateColorCodes('&', msg);
            return true;
        }
    }

    public static boolean reload() {
        FileConfiguration cfg = getConfig();
        List<String> errors = new ArrayList<>();
        for(Msg msg : Msg.values()) {
            String section = StringUtils.replaceChars(msg.name().toLowerCase(Locale.ENGLISH), '_', '.');
            if (!msg.setMessage(cfg.getString(section))) {
                errors.add(section);
            }
        }
        Logger log = Bukkit.getLogger();
        if(errors.isEmpty()) {
            log.info("[WGTranslator] Successfully reloaded all the messages.");
            return true;
        } else {
            log.warning("[WGTranslator] Some messages don't have its translation in the config. " +
                    "Using default ones for these: " + String.join(", ", errors));
            return false;
        }
    }

    private static FileConfiguration getConfig() {
        File file = new File(WorldGuardPlugin.inst().getDataFolder(), "translator.yml");
        file.getParentFile().mkdirs();
        if (!file.exists())
            WorldGuardPlugin.inst().saveResource("translator.yml", false);
        return YamlConfiguration.loadConfiguration(file);
    }
}
