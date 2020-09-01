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
import java.util.function.Function;

public final class CommandPatcher {
    public static List<String> redefine(String prefix, Class<?> commandClass, Function<String, String> getter) {
        List<String> errors = new ArrayList<>();
        try {
            for (Method method : commandClass.getDeclaredMethods()) {
                if (!method.isAnnotationPresent(Command.class)) {
                    continue;
                }

                Command command = method.getAnnotation(Command.class);
                String label = "COMMAND_" + prefix.toUpperCase(Locale.ENGLISH) + command.aliases()[0].toUpperCase(Locale.ENGLISH);

                String usagePath = label + "_USAGE";
                String descPath = label + "_DESCRIPTION";

                String usage = getter.apply(usagePath);
                String desc = getter.apply(descPath);

                if (usage == null && desc == null) {
                    errors.add(label);
                    continue;
                }

                System.out.println("Change " + command.aliases()[0] + ". usage: \"" + command.usage() + "\", desc: \"" + command.desc() + "\"");
                changeAnnotationValue(command, usage, desc);
                System.out.println("Updated " + command.aliases()[0] + ". usage: \"" + command.usage() + "\", desc: \"" + command.desc() + "\"");
                command = method.getAnnotation(Command.class);
                System.out.println("Recheck " + command.aliases()[0] + ". usage: \"" + command.usage() + "\", desc: \"" + command.desc() + "\"");
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
    private static void changeAnnotationValue(Annotation annotation, String usage, String desc) {
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
            memberValues.put("usage", usage);
        }
        if (desc != null) {
            memberValues.put("desc", desc);
        }
    }
}
