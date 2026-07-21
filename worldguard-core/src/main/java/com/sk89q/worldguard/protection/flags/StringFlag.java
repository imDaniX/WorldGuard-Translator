/*
 * WorldGuard, a suite of tools for Minecraft
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldGuard team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldguard.protection.flags;

import com.sk89q.worldguard.commands.CommandUtils;

import javax.annotation.Nullable;
import java.util.function.Supplier;

/**
 * Stores a string.
 */
public class StringFlag extends Flag<String> {

    private final String defaultValue;
    private final Supplier<String> defaultValueGetter;

    public StringFlag(String name) {
        this(name, (String) null);
    }

    public StringFlag(String name, String defaultValue) {
        super(name);
        this.defaultValue = defaultValue;
        this.defaultValueGetter = () -> this.defaultValue;
    }

    public StringFlag(String name, RegionGroup defaultGroup) {
        this(name, defaultGroup, null);
    }

    public StringFlag(String name, RegionGroup defaultGroup, String defaultValue) {
        super(name, defaultGroup);
        this.defaultValue = defaultValue;
        this.defaultValueGetter = () -> this.defaultValue;
    }

    // Making this private for compatibility reasons
    private StringFlag(String name, Supplier<String> defaultValueGetter) {
        super(name);
        this.defaultValue = null;
        this.defaultValueGetter = defaultValueGetter;
    }

    public static StringFlag of(String name, Supplier<String> defaultValue) {
        return new StringFlag(name, defaultValue);
    }

    @Nullable
    @Override
    public String getDefault() {
        return defaultValueGetter.get();
    }

    @Override
    public String parseInput(FlagContext context) throws InvalidFlagFormat {
        String lines = context.getUserInput().replaceAll("(?<!\\\\)\\\\n", "\n").replaceAll("\\\\\\\\n", "\\\\n");
        // Add color codes
        lines = CommandUtils.replaceColorMacros(lines);
        return lines;
    }

    @Override
    public String unmarshal(Object o) {
        if (o instanceof String) {
            return (String) o;
        } else {
            return null;
        }
    }

    @Override
    public Object marshal(String o) {
        return o;
    }

}
