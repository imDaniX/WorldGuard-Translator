package me.imdanix.wgtranslator;

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

    // com.sk89q.worldguard.blacklist.action...
    BLACKLIST_ACTION_BAN_REASONED("Banned: {reason}", "reason"),
    BLACKLIST_ACTION_BAN_DEFAULT("Banned: You can't {action} {type}.", "action", "type"),
    BLACKLIST_ACTION_KICK_REASONED("{reason}", "reason"),
    BLACKLIST_ACTION_KICK_DEFAULT("You can't {action} {type}.", "action", "type"),
    BLACKLIST_ACTION_TELL_TEXT("{text}", "text"),
    BLACKLIST_ACTION_TELL_DEFAULT("You're not allowed to {action} {type}.", "action", "type")

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

    public String getDefault() {
        return defaultMsg;
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
    private static String colorize(String textToTranslate) {
        char[] b = textToTranslate.toCharArray();
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == '&' && "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx".indexOf(b[i + 1]) > -1) {
                b[i] = '\u00A7';
                b[i + 1] = Character.toLowerCase(b[i + 1]);
            }
        }
        return new String(b);
    }
}
