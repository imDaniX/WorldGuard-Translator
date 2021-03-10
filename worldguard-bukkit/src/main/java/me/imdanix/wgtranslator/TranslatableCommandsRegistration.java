/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.imdanix.wgtranslator;

import com.sk89q.bukkit.util.CommandInfo;
import com.sk89q.bukkit.util.CommandsManagerRegistration;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandPermissions;
import com.sk89q.minecraft.util.commands.CommandsManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Deprecated
public class TranslatableCommandsRegistration extends CommandsManagerRegistration {
    private final File file;
    private final FileConfiguration cfg;
    private final boolean firstTime;

    public TranslatableCommandsRegistration(Plugin plugin, CommandsManager<?> commands, I18n translator) {
        super(plugin, commands);

        file = new File(plugin.getDataFolder(), "translator-commands.yml");
        firstTime = !file.exists();
        cfg = translator.getConfig(file, true);
    }

    public boolean registerAll(List<Command> registered) {
        List<CommandInfo> toRegister = new ArrayList<>();
        for (Command command : registered) {
            List<String> permissions = null;
            Method cmdMethod = commands.getMethods().get(null).get(command.aliases()[0]);
            Map<String, Method> childMethods = commands.getMethods().get(cmdMethod);

            if (cmdMethod != null && cmdMethod.isAnnotationPresent(CommandPermissions.class)) {
                permissions = Arrays.asList(cmdMethod.getAnnotation(CommandPermissions.class).value());
            } else if (cmdMethod != null && childMethods != null && !childMethods.isEmpty()) {
                permissions = new ArrayList<>();
                for (Method m : childMethods.values()) {
                    if (m.isAnnotationPresent(CommandPermissions.class)) {
                        permissions.addAll(Arrays.asList(m.getAnnotation(CommandPermissions.class).value()));
                    }
                }
            }

            // WGTranslator
            String commandName = command.aliases()[0];
            if (firstTime) {
                cfg.set(commandName + ".usage", command.usage());
                cfg.set(commandName + ".description.short", command.desc());
                cfg.set(commandName + ".description.full", commands.getCommands().get(commandName));
                cfg.set(commandName + ".help", commands.getHelpMessages().get(commandName));

                toRegister.add(new CommandInfo(command.usage(), command.desc(), command.aliases(), commands, permissions == null ? null : permissions.toArray(new String[permissions.size()])));
            } else {
                String usage = cfg.getString(commandName + ".usage", command.usage());
                String desc = cfg.getString(commandName + ".description.short", command.desc());
                if (cfg.contains(commandName + ".description.full")) commands.getCommands().put(commandName, cfg.getString(commandName + ".description.full", command.desc()));
                if (cfg.contains(commandName + ".help")) commands.getHelpMessages().put(commandName, cfg.getString(commandName + ".help"));

                toRegister.add(new CommandInfo(usage, desc, command.aliases(), commands, permissions == null ? null : permissions.toArray(new String[permissions.size()])));
            }
        }
        if (firstTime) {
            try {
                cfg.save(file);
            } catch (IOException e) {
                // TODO
                e.printStackTrace();
            }
        }

        return register(toRegister);
    }
}
