package me.imdanix.wgtranslator;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public enum Msg {

    // com.sk89q.worldguard.bukkit.BukkitStringMatcher
    COMMAND_ERROR_MATCHER_NONORMALWORLD("No normal world found."),
    COMMAND_ERROR_MATCHER_NONETHERWORLD("No nether world found."),
    COMMAND_ERROR_MATCHER_NOENDWORLD("No end world found."),
    COMMAND_ERROR_MATCHER_EXPECTARG("Argument expected for #player."),
    COMMAND_ERROR_MATCHER_INVALIDID("Invalid identifier '{identifier}'.", "identifier"),
    COMMAND_ERROR_MATCHER_NOWORLD("No world by that exact name found."),
    COMMAND_ERROR_MATCHER_NOPLAYERS("No players matched query."),
    COMMAND_ERROR_MATCHER_INVALIDGROUP("Invalid group '{group}'.", "group"),

    // com.sk89q.worldguard.bukkit.WorldGuardPlugin
    COMMAND_ERROR_NOPERMISSIONS("&cYou don't have permission."),
    COMMAND_ERROR_USAGE("&c{usage}", "usage"),
    COMMAND_ERROR_INFO("&c{message}", "message"),

    // com.sk89q.worldguard.bukkit.listener.BlockedPotionsListener
    PROTECTION_BLOCKED_POTIONSBYPASS("&cSorry, potions with {effect} can't be thrown, " +
            "even if you have a permission to bypass it, " +
            "due to limitations (and because overly-reliable potion blocking is on).", "effect"),
    PROTECTION_BLOCKED_POTIONS("&cSorry, potions with {effect} are presently disabled.", "effect"),
    PROTECTION_BLOCKED_ARROWS("&cSorry, arrows with {effect} are presently disabled.", "effect"),

    // com.sk89q.worldguard.bukkit.listener.ChestProtectionListener
    PROTECTION_CHEST_LOCK("[Lock]"),
    PROTECTION_CHEST_SPOT("&4This spot is for a chest that you don't have permission for."),
    PROTECTION_CHEST_PROTECTEDCHEST("&4This chest is protected."),
    PROTECTION_CHEST_NOTOWNADJACENT("&4You do not own the adjacent chest."),
    PROTECTION_CHEST_LOCKPOST("&cThe {lock} sign must be a sign post, not a wall sign.", "lock"),
    PROTECTION_CHEST_OWNERLINE("&cThe first owner line must be your name."),
    PROTECTION_CHEST_UNSAFE("&cThat is not a safe block that you're putting this sign on."),
    PROTECTION_CHEST_PROTECTED("&eA chest or double chest above is now protected."),
    PROTECTION_CHEST_DISABLED("&cWorldGuard's sign chest protection is disabled."),

    ;
    private final String defaultMsg;
    private final String[] placeholders;
    private String currentMsg;

    Msg(String def, String... phs) {
        defaultMsg = def;
        placeholders = new String[phs.length];
        for (int i = 0; i < phs.length; i++) {
            placeholders[i] = "{" + phs[i] + "}";
        }
        setMessage(defaultMsg);
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
            String section = toSection(msg);
            if (!msg.setMessage(cfg.getString(section))) {
                errors.add(section);
            }
        }
        Logger log = Bukkit.getLogger();
        if(errors.isEmpty()) {
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
                file.createNewFile();
                FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
                for (Msg msg : Msg.values()) {
                    cfg.set(toSection(msg), msg.defaultMsg);
                }
                cfg.save(file);
                return cfg;
            } catch (IOException e) {
                Bukkit.getLogger().warning("[WGTranslator] Something went wrong during translation config creation.");
                e.printStackTrace();
            }
        }
        return YamlConfiguration.loadConfiguration(file);
    }

    private static String toSection(Msg msg) {
        return StringUtils.replaceChars(msg.name().toLowerCase(Locale.ENGLISH), '_', '.');
    }
}
