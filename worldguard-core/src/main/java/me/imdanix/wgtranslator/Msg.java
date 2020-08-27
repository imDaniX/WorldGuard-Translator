package me.imdanix.wgtranslator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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

    // com.sk89q.worldguard.bukkit.listener.WorldGuardCommandBookListener
    COMMANDBOOK_WHOIS_CURRENT("Current Regions"),
    COMMANDBOOK_WHOIS_BUILD("Can build"),

    // com.sk89q.worldguard.bukkit.listener.WorldGuardEntityListener
    PROTECTION_REGION_PROTECTEDPORTAL("Destination is an a protected area."),

    // com.sk89q.worldguard.bukkit.listener.WorldGuardPlayerListener
    HALT_SERVERHALTED("&eIntensive server activity has been HALTED."),
    HALT_AUTOREMOVE("Halt-Act: {removed} entities (>10) auto-removed from {world}", "removed", "world"),
    CONFIG_WORLD_FIREDISABLED("&eFire spread is currently globally disabled for this world."),
    INVALIDHOST_KICK("You did not join with the valid host key!"),
    INFINITYSTACK_REMOVE("&cInfinite stack removed."),
    INFINITYSTACK_REMOVESLOT("&cInfinite stack in slot #{slot} removed.", "slot"),
    WAND_BUILD_INFO("&eCan you build? {check}", "check"),
    WAND_BUILD_NO("No"),
    WAND_BUILD_YES("Yes"),
    WAND_REGIONS_LIST("Applicable regions: {regions}", "regions"),
    WAND_REGIONS_EMPTY("WorldGuard: No defined regions here!"),
    COMMAND_ERROR_OPDEOP("&c/op and /deop can only be used in console (as set by a WG setting)."),

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

    // com.sk89q.worldguard.bukkit.listener.RegionProtectionListener
    PROTECTION_REGION_ACTION_FIRE("place fire"),
    PROTECTION_REGION_ACTION_FROSTWALKER("use frostwalker"),
    PROTECTION_REGION_ACTION_PLACE("place that block"),
    PROTECTION_REGION_ACTION_DYNAMITE("use dynamite"),
    PROTECTION_REGION_ACTION_BREAK("break that block"),

    PROTECTION_REGION_ACTION_USE("use that"),
    PROTECTION_REGION_ACTION_OPEN("open that"),
    PROTECTION_REGION_ACTION_TAKE("take that"),
    PROTECTION_REGION_ACTION_SLEEP("sleep"),
    PROTECTION_REGION_ACTION_ANCHOR("use anchor"),
    PROTECTION_REGION_ACTION_EXPLOSIVES("use explosives"),
    PROTECTION_REGION_ACTION_CHANGE("change that"),

    PROTECTION_REGION_ACTION_ITEMDROP("drop items"),
    PROTECTION_REGION_ACTION_ITEMPICKUP("pick up items"),
    PROTECTION_REGION_ACTION_XPDROP("drop xp"),
    PROTECTION_REGION_ACTION_POTION("use lingering potions"),
    PROTECTION_REGION_ACTION_THINGS("place things"),
    PROTECTION_REGION_ACTION_ENTITYBREAK("break things"),

    PROTECTION_REGION_ACTION_HIT("hit that"),
    PROTECTION_REGION_ACTION_PVP("PvP"),
    PROTECTION_REGION_ACTION_DAMAGE("damage that"),
    PROTECTION_REGION_ACTION_HARM("harm that"),

    PROTECTION_REGION_ACTION_VEHICLEPLACE("place vehicles"),
    PROTECTION_REGION_ACTION_VEHICLEBREAK("break vehicles"),
    PROTECTION_REGION_ACTION_RIDE("ride that"),
    PROTECTION_REGION_ACTION_DISEMBARK("&6Don't disembark here!&7 You can't get back on."),

    // com.sk89q.worldguard.blacklist.event...
    PROTECTION_REGION_BLACKLIST_BREAK("break"),
    PROTECTION_REGION_BLACKLIST_DISPENSE("dispense"),
    PROTECTION_REGION_BLACKLIST_INTERACT("interact with"),
    PROTECTION_REGION_BLACKLIST_PLACE("place"),
    PROTECTION_REGION_BLACKLIST_ACQUIRE("acquire"),
    PROTECTION_REGION_BLACKLIST_DESTROY("destroy with"),
    PROTECTION_REGION_BLACKLIST_DROP("drop"),
    PROTECTION_REGION_BLACKLIST_EQUIP("equip"),
    PROTECTION_REGION_BLACKLIST_USE("use"),

    // com.sk89q.worldguard.blacklist.action...
    BLACKLIST_ACTION_BAN_REASONED("Banned: {reason}", "reason"),
    BLACKLIST_ACTION_BAN_DEFAULT("Banned: You can't {action} {type}.", "action", "type"),
    BLACKLIST_ACTION_KICK_REASONED("{reason}", "reason"),
    BLACKLIST_ACTION_KICK_DEFAULT("You can't {action} {type}.", "action", "type"),
    BLACKLIST_ACTION_TELL_TEXT("{text}", "text"),
    BLACKLIST_ACTION_TELL_DEFAULT("You're not allowed to {action} {type}.", "action", "type"),

    ;
    private static final Map<String, Msg> BY_NAME;
    static {
        Map<String, Msg> byName = new HashMap<>();
        for (Msg msg : values()) {
            byName.put(msg.name(), msg);
        }
        BY_NAME = Collections.unmodifiableMap(byName);
    }

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

    public String getDefault() {
        return defaultMsg;
    }

    public String get() {
        return currentMsg;
    }

    public String get(Object... args) {
        String result = currentMsg;
        for (int i = 0; i < placeholders.length; i++) {
            result = replace(result, placeholders[i], String.valueOf(args[i]));
        }
        return result;
    }

    public boolean setMessage(String msg) {
        if(msg == null) {
            currentMsg = defaultMsg;
            return false;
        } else {
            currentMsg = colorize(msg);
            return true;
        }
    }

    // org.apache.commons.lang.StringUtils#replace
    private static String replace(String text, String searchString, String replacement) {
        int max = -1;
        int start = 0;
        int end = text.indexOf(searchString, start);
        if (end == -1) {
            return text;
        }
        int replLength = searchString.length();
        int increase = replacement.length() - replLength;
        increase = (increase < 0 ? 0 : increase) * 16;
        StringBuilder buf = new StringBuilder(text.length() + increase);
        while (end != -1) {
            buf.append(text, start, end).append(replacement);
            start = end + replLength;
            if (--max == 0) {
                break;
            }
            end = text.indexOf(searchString, start);
        }
        buf.append(text.substring(start));
        return buf.toString();
    }

    // org.bukkit.ChatColor#translateAlternateColorCodes
    public static String colorize(String textToTranslate) {
        if(textToTranslate == null) {
            return null;
        }
        char[] b = textToTranslate.toCharArray();
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == '&' && "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx".indexOf(b[i + 1]) > -1) {
                b[i] = '\u00A7';
                b[i + 1] = Character.toLowerCase(b[i + 1]);
            }
        }
        return new String(b);
    }

    public static Msg getByName(String name) {
        return BY_NAME.get(name);
    }

    public static String toSection(Msg msg) {
        return toSection(msg.name());
    }

    public static String toSection(String msg) {
        return msg.toLowerCase(Locale.ENGLISH).replace('_', '.');
    }
}
