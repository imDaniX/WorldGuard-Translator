package me.imdanix.wgtranslator;

import com.sk89q.minecraft.util.commands.Command;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class CommandPatcher {
    public static List<String> redefine(String prefix, Class<?> commandClass) {
        List<String> errors = new ArrayList<>();
        try {
            for (Method method : commandClass.getDeclaredMethods()) {
                if (!method.isAnnotationPresent(Command.class)) {
                    continue;
                }

                Command command = method.getAnnotation(Command.class);
                String label = "COMMAND_" + prefix.toUpperCase(Locale.ENGLISH) + "_" + command.aliases()[0].toUpperCase(Locale.ENGLISH);

                String usageStr = label + "_USAGE";
                String descStr = label + "_DESCRIPTION";
                String helpStr = label + "_HELP";

                Msg usage = Msg.getByName(usageStr);
                Msg desc = Msg.getByName(descStr);
                Msg help = Msg.getByName(helpStr);

                if (usage == null || desc == null || help == null) {
                    errors.add(label);
                }

                changeAnnotationValue(command, usage, desc, help);
            }
            return errors;
        } catch (Exception ignored) {}
        return Collections.emptyList();
    }

    /**
     * Changes the annotation value for the given key of the given annotation to newValue and returns
     * the previous value.
     * https://stackoverflow.com/questions/14268981/modify-a-class-definitions-annotation-string-parameter-at-runtime/28118436#28118436
     */
    @SuppressWarnings("unchecked")
    private static void changeAnnotationValue(Annotation annotation, Msg usage, Msg desc, Msg help) {
        Object handler = Proxy.getInvocationHandler(annotation);
        Field f;
        try {
            f = handler.getClass().getDeclaredField("memberValues");
        } catch (NoSuchFieldException | SecurityException e) {
            throw new IllegalStateException(e);
        }
        f.setAccessible(true);
        Map<String, Object> memberValues;
        try {
            memberValues = (Map<String, Object>) f.get(handler);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        if (usage != null) {
            memberValues.put("usage", usage.get());
        }
        if (desc != null) {
            memberValues.put("desc", desc.get());
        }
        if (help != null) {
            memberValues.put("help", help.get());
        }
    }
}
