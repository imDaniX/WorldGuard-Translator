package me.imdanix.wgtranslator;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandsManager;
import com.sk89q.worldedit.extension.platform.Actor;
import org.bukkit.configuration.file.FileConfiguration;

import java.lang.reflect.Method;
import java.util.List;

@Deprecated
public class TranslatableCommandsManager extends CommandsManager<Actor> {
    private FileConfiguration cfg;

    public void setConfig(FileConfiguration cfg) {
        this.cfg = cfg;
    }

    @Override
    public boolean hasPermission(Actor player, String permission) {
        return player.hasPermission(permission);
    }

    @Override
    public List<Command> registerMethods(Class<?> cls, Method parent) {
        if (parent != null) {
            List<Command> nestedList = super.registerMethods(cls, parent);
            String parentName = parent.getAnnotation(Command.class).aliases()[0];
            for (Command nested : nestedList) {
                String nestedName = nested.aliases()[0];
                String nestedPath = parentName + ".nested." + nestedName;
                if (!cfg.contains(nestedPath)) {
                    cfg.set(nestedPath + ".description", descs.get(nestedName));
                    cfg.set(nestedPath + ".help", helpMessages.get(nestedName).replace("\\n", "\n"));
                } else {
                    if (cfg.contains(nestedPath + ".description")) descs.put(nestedName, cfg.getString(nestedPath + ".description", nested.desc()));
                    if (cfg.contains(nestedPath + ".help")) helpMessages.put(nestedName, cfg.getString(nestedPath + ".help"));
                }
            }
            return nestedList;
        } else {
            return super.registerMethods(cls, parent);
        }
    }
}
