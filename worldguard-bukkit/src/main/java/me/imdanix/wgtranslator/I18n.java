package me.imdanix.wgtranslator;

import com.sk89q.worldguard.commands.DebuggingCommands;
import com.sk89q.worldguard.commands.GeneralCommands;
import com.sk89q.worldguard.commands.ProtectionCommands;
import com.sk89q.worldguard.commands.ToggleCommands;
import com.sk89q.worldguard.commands.WorldGuardCommands;
import com.sk89q.worldguard.commands.region.MemberCommands;
import com.sk89q.worldguard.commands.region.RegionCommands;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.logging.Logger;

public class I18n implements CommandExecutor {
    private final File file;

    public I18n(Plugin plugin) {
        Bukkit.getLogger().info("[WGTranslator] Initializing translation from the file. By imDaniX.");
        this.file = new File(plugin.getDataFolder(), "translator.yml");
        reload(getConfig(file, false));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Msg.colorize("&6&lWGTranslator &f&oby imDaniX"));
        if (!reload(getConfig(file, false))) {
            sender.sendMessage(ChatColor.YELLOW + "Translation is reloaded, but something went wrong. " +
                    "Please check the console.");
        } else {
            sender.sendMessage(ChatColor.GREEN + "Translation was successfully reloaded.");
        }
        return true;
    }

    private boolean reload(FileConfiguration cfg) {
        Objects.requireNonNull(cfg);
        List<String> errors = new ArrayList<>();
        for (Msg msg : Msg.values()) {
            String section = Msg.toSection(msg);
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
                    "Using default ones for these: " + String.join(", ", errors) + ".");
            return false;
        }
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public FileConfiguration getConfig(File file, boolean cmds) {
        if (!file.exists()) {
            Bukkit.getLogger().info("[WGTranslator] Creating new file with default messages" + (cmds ? " for commands." : "."));
            try {
                file.createNewFile();
                FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
                for (Msg msg : Msg.values()) {
                    cfg.set(Msg.toSection(msg), msg.getDefault());
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

}
