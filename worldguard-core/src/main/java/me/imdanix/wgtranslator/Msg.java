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

    // com.sk89q.worldguard.commands.region.MemberCommands
    COMMAND_REGION_MEMBERSHIP_ADDMEMBER_ADDING("Adding members to the region '{region}' on '{world}'", "region", "world"),
    COMMAND_REGION_MEMBERSHIP_ADDMEMBER_SUCCESS("Region '{region}' updated with new members.", "region"),
    COMMAND_REGION_MEMBERSHIP_ADDMEMBER_FAIL("Failed to add new members"),
    COMMAND_REGION_MEMBERSHIP_ADDOWNER_ADDING("Adding owners to the region '{region}' on '{world}'", "region", "world"),
    COMMAND_REGION_MEMBERSHIP_ADDOWNER_SUCCESS("Region '{region}' updated with new owners.", "region"),
    COMMAND_REGION_MEMBERSHIP_ADDOWNER_FAIL("Failed to add new owners"),
    COMMAND_REGION_MEMBERSHIP_ADDOWNER_MAXIMUM("You already own the maximum allowed amount of regions."),
    COMMAND_REGION_MEMBERSHIP_REMOVEMEMBER_LIST("List some names to remove, or use -a to remove all."),
    COMMAND_REGION_MEMBERSHIP_REMOVEMEMBER_REMOVING("Removing members from the region '{region}' on '{world}'", "region", "world"),
    COMMAND_REGION_MEMBERSHIP_REMOVEMEMBER_WAIT("(Please wait... querying player names...)"),
    COMMAND_REGION_MEMBERSHIP_REMOVEMEMBER_SUCCESS("Region '{region}' updated with members removed.", "region"),
    COMMAND_REGION_MEMBERSHIP_REMOVEMEMBER_FAIL("Failed to remove members"),
    COMMAND_REGION_MEMBERSHIP_REMOVEOWNER_LIST("List some names to remove, or use -a to remove all."),
    COMMAND_REGION_MEMBERSHIP_REMOVEOWNER_REMOVING("Removing owners from the region '{region}' on '{world}'", "region", "world"),
    COMMAND_REGION_MEMBERSHIP_REMOVEOWNER_WAIT("(Please wait... querying player names...)"),
    COMMAND_REGION_MEMBERSHIP_REMOVEOWNER_SUCCESS("Region '{region}' updated with owners removed.", "region"),
    COMMAND_REGION_MEMBERSHIP_REMOVEOWNER_FAIL("Failed to remove owners"),

    // com.sk89q.worldguard.commands.region.FlagHelperBox
    COMMAND_REGION_FLAGS_TITLE("Flags for {region}", "region"),
    COMMAND_REGION_FLAGS_PAGECOMMAND("/rg flags -w \"{world}\" -p %page% {region}", "region", "world"),
    COMMAND_REGION_FLAGS_THIRDPARTY("Third-Party Flags"),
    COMMAND_REGION_FLAGS_SPECIAL_MEMBER("This is a special flag which defaults to allow for members, and deny for non-members"),
    COMMAND_REGION_FLAGS_SPECIAL_BUILD("This is a special flag which overrides build checks. (Not movement related!)"),
    COMMAND_REGION_FLAGS_UNSET("Click to unset"),
    COMMAND_REGION_FLAGS_CONSEQUENCES1("Setting this flag may have unintended consequences."),
    COMMAND_REGION_FLAGS_CONSEQUENCES2("Please read the documentation and set this flag manually if you really intend to."),
    COMMAND_REGION_FLAGS_CONSEQUENCES3("(Hint: You do not need to set this to protect the region!)"),
    COMMAND_REGION_FLAGS_SET("Click to set"),
    COMMAND_REGION_FLAGS_SETCUSTOM("Click to set custom value"),
    COMMAND_REGION_FLAGS_CHANGE("Click to change"),
    COMMAND_REGION_FLAGS_INHERITED_INHERITEDDEFAULT1("Inherited & "),
    COMMAND_REGION_FLAGS_INHERITED_INHERITEDDEFAULT2("default"),
    COMMAND_REGION_FLAGS_INHERITED_INHERITEDDEFAULT3(" value"),
    COMMAND_REGION_FLAGS_INHERITED_INHERITED("Inherited value"),
    COMMAND_REGION_FLAGS_INHERITED_DEFAULT1("Default"),
    COMMAND_REGION_FLAGS_INHERITED_DEFAULT2(" value"),
    COMMAND_REGION_FLAGS_VALUES("Current values:"),
    COMMAND_REGION_FLAGS_VALUE_LOCATION_UNSET("unset location"),
    COMMAND_REGION_FLAGS_VALUE_LOCATION_DEFAULT("Default value:"),
    COMMAND_REGION_FLAGS_VALUE_LOCATION_CURRENT("Current value:"),
    COMMAND_REGION_FLAGS_VALUE_NUMERIC_UNSET("unset number"),
    COMMAND_REGION_FLAGS_VALUE_NUMERIC_CUSTOM("[custom]"),
    COMMAND_REGION_FLAGS_VALUE_STRING_UNSET("unset string"),
    COMMAND_REGION_FLAGS_VALUE_STRING_DEFAULT("Default value:"),
    COMMAND_REGION_FLAGS_VALUE_STRING_CURRENT("Current value:"),

    // com.sk89q.worldguard.commands.region.RegionCommand
    COMMAND_REGION_DEFINE_ADDING("Adding region '{region}'", "region"),
    COMMAND_REGION_DEFINE_SUCCESS("A new region has been made named '{region}'", "region"),
    COMMAND_REGION_DEFINE_FAIL("Failed to add the region '{region}'", "region"),
    COMMAND_REGION_REDEFINE_ADDING("Updating region '{region}'", "region"),
    COMMAND_REGION_REDEFINE_WAIT("(Please wait... {description})", "description"),
    COMMAND_REGION_REDEFINE_SUCCESS("Region '{region}' has been updated with a new area.", "region"),
    COMMAND_REGION_REDEFINE_FAIL("Failed to update the region '{region}'", "region"),
    COMMAND_REGION_CLAIM_ERROR_TOOMANY("You own too many regions, delete one first to claim a new one."),
    COMMAND_REGION_CLAIM_ERROR_ALREADYEXIST("This region already exists and you don't own it."),
    COMMAND_REGION_CLAIM_ERROR_OVERLAPS("This region overlaps with someone else's region."),
    COMMAND_REGION_CLAIM_ERROR_ONLYINSIDE("You may only claim regions inside existing regions that you or your group own."),
    COMMAND_REGION_CLAIM_ERROR_MAXINTEGER("The maximum claim volume get in the configuration is higher than is supported. Currently, it must be " + Integer.MAX_VALUE + " or smaller. Please contact a server administrator."),
    COMMAND_REGION_CLAIM_ERROR_NOPOLYGONS("Polygons are currently not supported for /rg claim."),
    COMMAND_REGION_CLAIM_ERROR_TOOLARGE1("This region is too large to claim."),
    COMMAND_REGION_CLAIM_ERROR_TOOLARGE2("Max. volume: {max}, your volume: {current}", "max", "current"),
    COMMAND_REGION_CLAIM_ADDING("Claiming region '{region}'", "region"),
    COMMAND_REGION_CLAIM_SUCCESS("A new region has been claimed named '{region}'", "region"),
    COMMAND_REGION_CLAIM_WAIT("(Please wait... {description})", "description"),
    COMMAND_REGION_CLAIM_FAIL("Failed to claim region"),
    COMMAND_REGION_SELECT_SPECIFY("Please specify a region name."),
    COMMAND_REGION_SELECT_SELECTED("Region selected as {region}", "region"),
    COMMAND_REGION_SELECT_TYPEFAIL("Can't select that region! The region type '{type}' can't be selected.", "type"),

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
    PROTECTION_REGION_ACTION_ANVIL("use that"),
    PROTECTION_REGION_ACTION_OPEN("open that"),
    PROTECTION_REGION_ACTION_TAKE("take that"),
    PROTECTION_REGION_ACTION_SLEEP("sleep"),
    PROTECTION_REGION_ACTION_ANCHOR("use anchor"),
    PROTECTION_REGION_ACTION_EXPLOSIVES("use explosives"),
    PROTECTION_REGION_ACTION_CHANGE("change that"),
    PROTECTION_REGION_ACTION_OTHER("use that"),

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
