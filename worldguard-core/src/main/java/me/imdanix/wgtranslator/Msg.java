package me.imdanix.wgtranslator;

import java.util.Locale;

public enum Msg {

    // com.sk89q.worldguard.bukkit.BukkitStringMatcher
    ERROR_MATCHER_NONORMALWORLD("No normal world found."),
    ERROR_MATCHER_NONETHERWORLD("No nether world found."),
    ERROR_MATCHER_NOENDWORLD("No end world found."),
    ERROR_MATCHER_EXPECTARG("Argument expected for #player."),
    ERROR_MATCHER_INVALIDID("Invalid identifier '{identifier}'.", "identifier"),
    ERROR_MATCHER_NOWORLD("No world by that exact name found."),
    ERROR_MATCHER_NOPLAYERS("No players matched query."),
    ERROR_MATCHER_INVALIDGROUP("Invalid group '{group}'.", "group"),

    // com.sk89q.worldguard.bukkit.WorldGuardPlugin
    ERROR_NOPERMISSIONS("&cYou don't have permission."),
    ERROR_USAGE("&c{usage}", "usage"),
    ERROR_INFO("&c{message}", "message"),

    // com.sk89q.worldguard.commands.region.MemberCommands
    REGION_MEMBERSHIP_ADDMEMBER_ADDING("Adding members to the region '{region}' on '{world}'", "region", "world"),
    REGION_MEMBERSHIP_ADDMEMBER_SUCCESS("Region '{region}' updated with new members.", "region"),
    REGION_MEMBERSHIP_ADDMEMBER_FAIL("Failed to add new members"),
    REGION_MEMBERSHIP_ADDOWNER_ADDING("Adding owners to the region '{region}' on '{world}'", "region", "world"),
    REGION_MEMBERSHIP_ADDOWNER_SUCCESS("Region '{region}' updated with new owners.", "region"),
    REGION_MEMBERSHIP_ADDOWNER_FAIL("Failed to add new owners"),
    REGION_MEMBERSHIP_ADDOWNER_MAXIMUM("You already own the maximum allowed amount of regions."),
    REGION_MEMBERSHIP_REMOVEMEMBER_LIST("List some names to remove, or use -a to remove all."),
    REGION_MEMBERSHIP_REMOVEMEMBER_REMOVING("Removing members from the region '{region}' on '{world}'", "region", "world"),
    REGION_MEMBERSHIP_REMOVEMEMBER_WAIT("(Please wait... querying player names...)"),
    REGION_MEMBERSHIP_REMOVEMEMBER_SUCCESS("Region '{region}' updated with members removed.", "region"),
    REGION_MEMBERSHIP_REMOVEMEMBER_FAIL("Failed to remove members"),
    REGION_MEMBERSHIP_REMOVEOWNER_LIST("List some names to remove, or use -a to remove all."),
    REGION_MEMBERSHIP_REMOVEOWNER_REMOVING("Removing owners from the region '{region}' on '{world}'", "region", "world"),
    REGION_MEMBERSHIP_REMOVEOWNER_WAIT("(Please wait... querying player names...)"),
    REGION_MEMBERSHIP_REMOVEOWNER_SUCCESS("Region '{region}' updated with owners removed.", "region"),
    REGION_MEMBERSHIP_REMOVEOWNER_FAIL("Failed to remove owners"),

    // com.sk89q.worldguard.commands.region.FlagHelperBox
    REGION_FLAGS_TITLE("Flags for {region}", "region"),
    REGION_FLAGS_PAGECOMMAND("/rg flags -w \"{world}\" -p %page% {region}", "region", "world"),
    REGION_FLAGS_THIRDPARTY("Third-Party Flags"),
    REGION_FLAGS_SPECIAL_MEMBER("This is a special flag which defaults to allow for members, and deny for non-members"),
    REGION_FLAGS_SPECIAL_BUILD("This is a special flag which overrides build checks. (Not movement related!)"),
    REGION_FLAGS_UNSET("Click to unset"),
    REGION_FLAGS_CONSEQUENCES1("Setting this flag may have unintended consequences."),
    REGION_FLAGS_CONSEQUENCES2("Please read the documentation and set this flag manually if you really intend to."),
    REGION_FLAGS_CONSEQUENCES3("(Hint: You do not need to set this to protect the region!)"),
    REGION_FLAGS_SET("Click to set"),
    REGION_FLAGS_SETCUSTOM("Click to set custom value"),
    REGION_FLAGS_CHANGE("Click to change"),
    REGION_FLAGS_INHERITED_INHERITEDDEFAULT1("Inherited & "),
    REGION_FLAGS_INHERITED_INHERITEDDEFAULT2("default"),
    REGION_FLAGS_INHERITED_INHERITEDDEFAULT3(" value"),
    REGION_FLAGS_INHERITED_INHERITED("Inherited value"),
    REGION_FLAGS_INHERITED_DEFAULT1("Default"),
    REGION_FLAGS_INHERITED_DEFAULT2(" value"),
    REGION_FLAGS_VALUES("Current values:"),
    REGION_FLAGS_VALUE_LOCATION_UNSET("unset location"),
    REGION_FLAGS_VALUE_LOCATION_DEFAULT("Default value:"),
    REGION_FLAGS_VALUE_LOCATION_CURRENT("Current value:"),
    REGION_FLAGS_VALUE_NUMERIC_UNSET("unset number"),
    REGION_FLAGS_VALUE_NUMERIC_CUSTOM("[custom]"),
    REGION_FLAGS_VALUE_STRING_UNSET("unset string"),
    REGION_FLAGS_VALUE_STRING_DEFAULT("Default value:"),
    REGION_FLAGS_VALUE_STRING_CURRENT("Current value:"),

    // com.sk89q.worldguard.commands.region.RegionCommand
    REGION_DEFINE_ADDING("Adding region '{region}'", "region"),
    REGION_DEFINE_SUCCESS("A new region has been made named '{region}'", "region"),
    REGION_DEFINE_FAIL("Failed to add the region '{region}'", "region"),
    REGION_REDEFINE_ADDING("Updating region '{region}'", "region"),
    REGION_REDEFINE_WAIT("(Please wait... {description})", "description"),
    REGION_REDEFINE_SUCCESS("Region '{region}' has been updated with a new area.", "region"),
    REGION_REDEFINE_FAIL("Failed to update the region '{region}'", "region"),
    REGION_CLAIM_ERROR_TOOMANY("You own too many regions, delete one first to claim a new one."),
    REGION_CLAIM_ERROR_ALREADYEXIST("This region already exists and you don't own it."),
    REGION_CLAIM_ERROR_OVERLAPS("This region overlaps with someone else's region."),
    REGION_CLAIM_ERROR_ONLYINSIDE("You may only claim regions inside existing regions that you or your group own."),
    REGION_CLAIM_ERROR_MAXINTEGER("The maximum claim volume get in the configuration is higher than is supported. Currently, it must be " + Integer.MAX_VALUE + " or smaller. Please contact a server administrator."),
    REGION_CLAIM_ERROR_NOPOLYGONS("Polygons are currently not supported for /rg claim."),
    REGION_CLAIM_ERROR_TOOLARGE1("This region is too large to claim."),
    REGION_CLAIM_ERROR_TOOLARGE2("Max. volume: {max}, your volume: {current}", "max", "current"),
    REGION_CLAIM_ADDING("Claiming region '{region}'", "region"),
    REGION_CLAIM_SUCCESS("A new region has been claimed named '{region}'", "region"),
    REGION_CLAIM_WAIT("(Please wait... {description})", "description"),
    REGION_CLAIM_FAIL("Failed to claim region"),
    REGION_SELECT_SPECIFY("Please specify a region name."),
    REGION_SELECT_SELECTED("Region selected as {region}", "region"),
    REGION_SELECT_TYPEFAIL("Can't select that region! The region type '{type}' can't be selected.", "type"),

    // com.sk89q.worldguard.bukkit.listener.BlockedPotionsListener
    DISABLED_POTIONSBYPASS("&cSorry, potions with {effect} can't be thrown, " +
            "even if you have a permission to bypass it, " +
            "due to limitations (and because overly-reliable potion blocking is on).", "effect"),
    DISABLED_POTIONS("&cSorry, potions with {effect} are presently disabled.", "effect"),
    DISABLED_ARROWS("&cSorry, arrows with {effect} are presently disabled.", "effect"),

    // com.sk89q.worldguard.bukkit.listener.WorldGuardCommandBookListener
    COMMANDBOOK_WHOIS_CURRENT("Current Regions"),
    COMMANDBOOK_WHOIS_BUILD("Can build"),

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
    ERROR_OPDEOP("&c/op and /deop can only be used in console (as set by a WG setting)."),

    // com.sk89q.worldguard.bukkit.listener.ChestProtectionListener
    CHESTLOCK_LOCK("[Lock]"),
    CHESTLOCK_SPOT("&4This spot is for a chest that you don't have permission for."),
    CHESTLOCK_PROTECTEDCHEST("&4This chest is protected."),
    CHESTLOCK_NOTOWNADJACENT("&4You do not own the adjacent chest."),
    CHESTLOCK_LOCKPOST("&cThe {lock} sign must be a sign post, not a wall sign.", "lock"),
    CHESTLOCK_OWNERLINE("&cThe first owner line must be your name."),
    CHESTLOCK_UNSAFE("&cThat is not a safe block that you're putting this sign on."),
    CHESTLOCK_PROTECTED("&eA chest or double chest above is now protected."),
    CHESTLOCK_DISABLED("&cWorldGuard's sign chest protection is disabled."),

    // com.sk89q.worldguard.bukkit.listener.RegionProtectionListener
    REGION_PROTECTION_ACTION_FIRE("place fire"),
    REGION_PROTECTION_ACTION_FROSTWALKER("use frostwalker"),
    REGION_PROTECTION_ACTION_PLACE("place that block"),
    REGION_PROTECTION_ACTION_DYNAMITE("use dynamite"),
    REGION_PROTECTION_ACTION_BREAK("break that block"),

    REGION_PROTECTION_ACTION_USE("use that"),
    REGION_PROTECTION_ACTION_ANVIL("use that"),
    REGION_PROTECTION_ACTION_OPEN("open that"),
    REGION_PROTECTION_ACTION_TAKE("take that"),
    REGION_PROTECTION_ACTION_SLEEP("sleep"),
    REGION_PROTECTION_ACTION_ANCHOR("use anchor"),
    REGION_PROTECTION_ACTION_EXPLOSIVES("use explosives"),
    REGION_PROTECTION_ACTION_CHANGE("change that"),
    REGION_PROTECTION_ACTION_OTHER("use that"),

    REGION_PROTECTION_ACTION_ITEMDROP("drop items"),
    REGION_PROTECTION_ACTION_ITEMPICKUP("pick up items"),
    REGION_PROTECTION_ACTION_XPDROP("drop xp"),
    REGION_PROTECTION_ACTION_POTION("use lingering potions"),
    REGION_PROTECTION_ACTION_THINGS("place things"),
    REGION_PROTECTION_ACTION_ENTITYBREAK("break things"),

    REGION_PROTECTION_ACTION_HIT("hit that"),
    REGION_PROTECTION_ACTION_PVP("PvP"),
    REGION_PROTECTION_ACTION_DAMAGE("damage that"),
    REGION_PROTECTION_ACTION_HARM("harm that"),

    REGION_PROTECTION_ACTION_VEHICLEPLACE("place vehicles"),
    REGION_PROTECTION_ACTION_VEHICLEBREAK("break vehicles"),
    REGION_PROTECTION_ACTION_RIDE("ride that"),
    REGION_PROTECTION_ACTION_DISEMBARK("&6Don't disembark here!&7 You can't get back on."),

    // com.sk89q.worldguard.blacklist.event...
    BLACKLIST_ACTION_BREAK("break"),
    BLACKLIST_ACTION_DISPENSE("dispense"),
    BLACKLIST_ACTION_INTERACT("interact with"),
    BLACKLIST_ACTION_PLACE("place"),
    BLACKLIST_ACTION_ACQUIRE("acquire"),
    BLACKLIST_ACTION_DESTROY("destroy with"),
    BLACKLIST_ACTION_DROP("drop"),
    BLACKLIST_ACTION_EQUIP("equip"),
    BLACKLIST_ACTION_USE("use"),

    // com.sk89q.worldguard.bukkit.listener.RegionProtectionListener
    DENY_CREATEPORTALS("create portals"),
    DENY_CHAT("chat"),
    DENY_USE("use {what}", "what"),

    // com.sk89q.worldguard.blacklist.action...
    BLACKLIST_PUNISHMENT_BAN_REASONED("Banned: {reason}", "reason"),
    BLACKLIST_PUNISHMENT_BAN_DEFAULT("Banned: You can't {action} {type}.", "action", "type"),
    BLACKLIST_PUNISHMENT_KICK_REASONED("{reason}", "reason"),
    BLACKLIST_PUNISHMENT_KICK_DEFAULT("You can't {action} {type}.", "action", "type"),
    BLACKLIST_PUNISHMENT_TELL_TEXT("{text}", "text"),
    BLACKLIST_PUNISHMENT_TELL_DEFAULT("You're not allowed to {action} {type}.", "action", "type"),

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

    public String get() {
        return currentMsg;
    }

    public String get(Object arg) {
        return currentMsg
                .replace(placeholders[0], String.valueOf(arg));
    }

    public String get(Object arg1, Object arg2) {
        return currentMsg
                .replace(placeholders[0], String.valueOf(arg1))
                .replace(placeholders[1], String.valueOf(arg2));
    }

    public String get(Object arg1, Object arg2, Object arg3) {
        return currentMsg
                .replace(placeholders[0], String.valueOf(arg1))
                .replace(placeholders[1], String.valueOf(arg2))
                .replace(placeholders[2], String.valueOf(arg3));
    }

    public String get(Object... args) {
        String result = currentMsg;
        for (int i = 0; i < placeholders.length; i++) {
            result = result.replace(placeholders[i], String.valueOf(args[i]));
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

    public String asSection() {
        return toSection(name());
    }

    private static String toSection(String msg) {
        return msg.toLowerCase(Locale.ENGLISH).replace('_', '.');
    }
}
