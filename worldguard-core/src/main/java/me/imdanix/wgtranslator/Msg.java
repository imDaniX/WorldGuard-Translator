package me.imdanix.wgtranslator;

import com.sk89q.worldedit.util.formatting.text.Component;
import com.sk89q.worldedit.util.formatting.text.serializer.legacy.LegacyComponentSerializer;

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

    // com.sk89q.worldguard.protection.flags...
    REGION_FLAGS_INVALID_SENDERNOTPLAYER("Not a player"),
    REGION_FLAGS_INVALID_STATE("Expected none/allow/deny, but got '{input}'", "input"),
    REGION_FLAGS_INVALID_BOOLEAN("Not a yes/no value: {input}", "input"),
    REGION_FLAGS_INVALID_REGISTRY("Unknown {registry}: {key}", "registry", "key"),
    REGION_FLAGS_INVALID_ENUM("Unknown value '{input}' in {class}", "input", "class"),
    REGION_FLAGS_INVALID_INTEGER("Not a number: {input}", "input"),
    REGION_FLAGS_INVALID_DOUBLE("Not a number: {input}", "input"),
    REGION_FLAGS_INVALID_MAP("Input must be in a 'key:value,key1=value1' format. Either ':' or '=' can be used."),
    REGION_FLAGS_INVALID_UUID("Not a valid uuid: {input}", "input"),
    REGION_FLAGS_INVALID_ENTITYTYPE("Unknown entity type: {input}", "input"),
    REGION_FLAGS_INVALID_OUTSIDE("You can't set that flag outside of the region boundaries."),
    REGION_FLAGS_INVALID_LOCATION("Expected 'here' or x,y,z."),
    REGION_FLAGS_INVALID_PLUGIN("The plugin that registered this flag is not currently installed"),
    REGION_FLAGS_INVALID_UNRECOGNIZED("Unrecognized input."),
    REGION_FLAGS_INVALID_DATETIME("Expected 'now' or ISO 8601 formatted input."),
    REGION_FLAGS_INVALID_WEATHER("Unknown weather type: {input}", "input"),
    REGION_FLAGS_INVALID_GAMEMODE("Unknown game mode: {input}", "input"),

    // com.sk89q.worldguard.commands.region.RegionCommand
    REGION_DEFINE_ADDING("Adding region '{region}'", "region"),
    REGION_DEFINE_SUCCESS("A new region has been made named '{region}'", "region"),
    REGION_DEFINE_FAIL("Failed to add the region '{region}'", "region"),

    REGION_REDEFINE_ADDING("Updating region '{region}'", "region"),
    REGION_REDEFINE_WAIT("(Please wait... {description})", "description"),
    REGION_REDEFINE_SUCCESS("Region '{region}' has been updated with a new area.", "region"),
    REGION_REDEFINE_FAIL("Failed to update the region '{region}'", "region"),

    REGION_CLAIM_ADDING("Claiming region '{region}'", "region"),
    REGION_CLAIM_SUCCESS("A new region has been claimed named '{region}'", "region"),
    REGION_CLAIM_WAIT("(Please wait... {description})", "description"),
    REGION_CLAIM_FAIL("Failed to claim region"),
    REGION_CLAIM_ERROR_TOOMANY("You own too many regions, delete one first to claim a new one."),
    REGION_CLAIM_ERROR_ALREADYEXIST("This region already exists and you don't own it."),
    REGION_CLAIM_ERROR_OVERLAPS("This region overlaps with someone else's region."),
    REGION_CLAIM_ERROR_ONLYINSIDE("You may only claim regions inside existing regions that you or your group own."),
    REGION_CLAIM_ERROR_MAXINTEGER("The maximum claim volume get in the configuration is higher than is supported. Currently, it must be " + Integer.MAX_VALUE + " or smaller. Please contact a server administrator."),
    REGION_CLAIM_ERROR_NOPOLYGONS("Polygons are currently not supported for /rg claim."),
    REGION_CLAIM_ERROR_TOOLARGE1("This region is too large to claim."),
    REGION_CLAIM_ERROR_TOOLARGE2("Max. volume: {max}, your volume: {current}", "max", "current"),

    REGION_FLAGS_WARNING_DOCUMENTATION("this documentation page"),

    REGION_FLAGS_BUILD_WARNING_HEADER("WARNING:"),
    REGION_FLAGS_BUILD_WARNING_BODY(" Setting this flag is not required for protection."),
    REGION_FLAGS_BUILD_WARNING_DETAIL("Setting this flag will completely override default protection, and apply to members, non-members, pistons, sand physics, and everything else that can modify blocks."),
    REGION_FLAGS_BUILD_WARNING_DOCUMENTATION("Only set this flag if you are sure you know what you are doing. See "),

    REGION_INFO_SPECIFY("Please specify the region with /region info -w world_name region_name."),
    REGION_INFO_FETCHING("Fetching region info"),
    REGION_INFO_WAIT("(Please wait... fetching region information...)"),
    REGION_INFO_FAIL("Failed to fetch region information"),

    REGION_LIST_FETCHING("Getting region list"),
    REGION_LIST_WAIT("(Please wait... fetching region list...)"),
    REGION_LIST_FAIL("Failed to fetch region list"),

    REGION_FLAG_ERROR_EMPTY("You cannot use -e(mpty) with a flag value."),
    REGION_FLAG_LIST_FETCHING("Flag list for invalid flag command."),
    REGION_FLAG_ERROR_NOGROUP("Region flag '{flag}' does not have a group flag!", "flag"),
    REGION_FLAG_SET("Region flag {flag} set on '{region}' to '{value}'.", "flag", "region", "value"),
    REGION_FLAG_REMOVED("Region flag {flag} removed from '{region}'. (Any -g(roups) were also removed.)", "flag", "region"),
    REGION_FLAG_GROUP_RESET("Region group flag for '{flag}' reset to default.", "flag"),
    REGION_FLAG_GROUP_SET("Region group flag for '{flag}' set.", "flag"),
    REGION_FLAG_CURRENT_FLAGS("(Current flags: "),
    REGION_FLAG_CURRENT_FLAGSEND(")"),
    REGION_FLAGS_SPECIFY("Please specify the region with /region flags -w world_name region_name."),
    REGION_FLAGS_FAIL("Failed to get region flags"),

    REGION_PRIORITY_SET("Priority of '{region}' set to {priority} (higher numbers override).", "region", "priority"),

    REGION_PARENT_ERROR_CIRCULAR("Uh oh! Setting '{parent}' to be the parent of '{child}' would cause circular inheritance.", "parent", "child"),
    REGION_PARENT_CURRENT_INHERITANCE_INFO("(Current inheritance on '{parent}':", "parent"),
    REGION_PARENT_CURRENT_INHERITANCE_INFOEND(")"),
    REGION_PARENT_CURRENT_INHERITANCE_SHORT("(Current inheritance:"),
    REGION_PARENT_CURRENT_INHERITANCE_SHORTEND(")"),
    REGION_PARENT_SET("Inheritance set for region '{region}'.", "region"),
    REGION_PARENT_ORPHANED(" Region is now orphaned."),

    REGION_REMOVE_ERROR_FLAGS("You cannot use both -u (unset parent) and -f (remove children) together."),
    REGION_REMOVE_REMOVING("Removing region '{region}' in '{world}'", "region", "world"),
    REGION_REMOVE_WAIT("Please wait... removing region."),
    REGION_REMOVE_SUCCESS("Successfully removed {region}.", "region"),
    REGION_REMOVE_FAIL("Failed to remove region"),

    REGION_LOAD_NOMANAGER("No region manager exists for world '{world}'.", "world"),
    REGION_LOAD_LOADING("Loading region data for '{world}'.", "world"),
    REGION_LOAD_WAIT("Please wait... {description}", "description"),
    REGION_LOAD_SUCCESS("Loaded region data for '{world}'", "world"),
    REGION_LOAD_FAIL("Failed to load region data for '{world}'", "world"),
    REGION_LOAD_ALL_LOADING("Loading regions for all worlds"),
    REGION_LOAD_ALL_WAIT("(Please wait... loading region data for all worlds...)"),
    REGION_LOAD_ALL_SUCCESS("Successfully load the region data for all worlds."),
    REGION_LOAD_ALL_FAIL("Failed to load regions for all worlds"),

    REGION_SAVE_NOMANAGER("No region manager exists for world '{world}'.", "world"),
    REGION_SAVE_SAVING("Saving region data for '{world}'.", "world"),
    REGION_SAVE_WAIT("Please wait... {description}", "description"),
    REGION_SAVE_SUCCESS("Saving region data for '{world}'", "world"),
    REGION_SAVE_FAIL("Failed to save region data for '{world}'", "world"),
    REGION_SAVE_ALL_SAVING("Saving regions for all worlds"),
    REGION_SAVE_ALL_WAIT("(Please wait... saving region data for all worlds...)"),
    REGION_SAVE_ALL_SUCCESS("Successfully saved the region data for all worlds."),
    REGION_SAVE_ALL_FAIL("Failed to save regions for all worlds"),

    REGION_MIGRATEDB_ERROR_BASE("Error encountered while migrating: {message}", "message"),
    REGION_MIGRATEDB_ERROR_INVALID_FROM("The value of 'from' is not a recognized type of region data database."),
    REGION_MIGRATEDB_ERROR_INVALID_TO("The value of 'to' is not a recognized type of region region data database."),
    REGION_MIGRATEDB_ERROR_SAME("It is not possible to migrate between the same types of region data databases."),
    REGION_MIGRATEDB_CONFIRM("This command is potentially dangerous.\nPlease ensure you have made a backup of your data, and then re-enter the command with -y tacked on at the end to proceed."),
    REGION_MIGRATEDB_ERROR_UNSUPPORTED_FROM("The driver specified as 'from' does not seem to be supported in your version of WorldGuard."),
    REGION_MIGRATEDB_ERROR_UNSUPPORTED_TO("The driver specified as 'to' does not seem to be supported in your version of WorldGuard."),
    REGION_MIGRATEDB_PERFORMING("Now performing migration... this may take a while."),
    REGION_MIGRATEDB_COMPLETE("Migration complete! This only migrated the data. If you already changed your settings to use the target driver, then WorldGuard is now using the new data. If not, you have to adjust your configuration to use the new driver and then restart your server."),

    REGION_MIGRATEUUID_PERFORMING("Now performing migration... this may take a while."),
    REGION_MIGRATEUUID_COMPLETE("Migration complete!"),
    REGION_MIGRATEUUID_ERROR("Error encountered while migrating: {message}", "message"),

    REGION_MIGRATEHEIGHTS_CONFIRM("This command is potentially dangerous.\nPlease ensure you have made a backup of your data, and then re-enter the command with -y tacked on at the end to proceed."),
    REGION_MIGRATEHEIGHTS_COMPLETE("Migration complete!"),
    REGION_MIGRATEHEIGHTS_ERROR("Error encountered while migrating: {message}", "message"),

    REGION_TELEPORT_NOSPAWN("The region has no spawn point associated."),
    REGION_TELEPORT_NOCENTER("The region has no center point."),
    REGION_TELEPORT_SPECTATOR_ONLY("Center teleport is only available in Spectator gamemode."),
    REGION_TELEPORT_NOTELEPORT("The region has no teleport point associated."),
    REGION_TELEPORT_FAIL("Unable to teleport to region '{region}'.", "region"),

    REGION_BYPASS_INVALID("Allowed optional arguments are: on, off"),
    REGION_BYPASS_ENABLED("You are now bypassing region protection (as long as you have permission)."),
    REGION_BYPASS_DISABLED("You are no longer bypassing region protection."),

    REGION_FLAG_LIST_AVAILABLE("Available flags: "),
    REGION_FLAG_LIST_UNKNOWN("Unknown flag specified: {flag}", "flag"),
    REGION_FLAG_LIST_OR_USE("Or use the command "),
    REGION_FLAG_LIST_COMMAND("/rg flags {region}", "region"),

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

    INFINITESTACK_REMOVE("&cInfinite stack removed."),
    INFINITESTACK_REMOVESLOT("&cInfinite stack in slot #{slot} removed.", "slot"),

    ERROR_INVALIDHOSTKICK("You did not join with the valid host key!"),
    ERROR_OPDEOP("&c/op and /deop can only be used in console (as set by a WG setting)."),

    WAND_BUILD_INFO("&eCan you build? {check}", "check"),
    WAND_BUILD_NO("No"),
    WAND_BUILD_YES("Yes"),
    WAND_REGIONS_LIST("Applicable regions: {regions}", "regions"),
    WAND_REGIONS_EMPTY("WorldGuard: No defined regions here!"),

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
    REGION_PROTECTION_ACTION_CREATEPORTALS("create portals"),
    REGION_PROTECTION_ACTION_CHAT("chat"),
    REGION_PROTECTION_ACTION_USEWHAT("use {what}", "what"),

    // com.sk89q.worldguard.blacklist.action...
    BLACKLIST_PUNISHMENT_BAN_REASONED("Banned: {reason}", "reason"),
    BLACKLIST_PUNISHMENT_BAN_DEFAULT("Banned: You can't {action} {type}.", "action", "type"),
    BLACKLIST_PUNISHMENT_KICK_REASONED("{reason}", "reason"),
    BLACKLIST_PUNISHMENT_KICK_DEFAULT("You can't {action} {type}.", "action", "type"),
    BLACKLIST_PUNISHMENT_TELL_TEXT("{text}", "text"),
    BLACKLIST_PUNISHMENT_TELL_DEFAULT("You're not allowed to {action} {type}.", "action", "type"),

    // com.sk89q.worldguard.commands.region.RegionCommandsBase
    REGION_COMMANDS_WORLDSPECIFY("Please specify the world with -{flag} world_name.", "flag"),
    REGION_COMMANDS_REGIONINVALIDID("The region name of '{id}' contains characters that are not allowed.", "id"),
    REGION_COMMANDS_REGIONNOGLOBAL("Sorry, you can't use __global__ here."),
    REGION_COMMANDS_REGIONNOTFOUND("No region could be found with the name of '{id}'.", "id"),
    REGION_COMMANDS_NOTSTANDINGINREGION("You're not standing in a region. Specify an ID if you want to select a specific region."),
    REGION_COMMANDS_STANDINGINMULTIPLE("You're standing in several regions (please pick one)."),
    REGION_COMMANDS_CURRENTREGIONS("Current regions: "),
    REGION_COMMANDS_CLICKTOPICK("Click to pick this region"),
    REGION_COMMANDS_SELECTAREAFIRST("Please select an area first. Use WorldEdit to make a selection! (see: https://worldedit.enginehub.org/en/latest/usage/regions/selections/)."),
    REGION_COMMANDS_REGIONEXISTS("A region with that name already exists. Please choose another name."),
    REGION_COMMANDS_REGIONEXISTSREDEFINE(" To change the shape, use /region redefine {id}.", "id"),
    REGION_COMMANDS_REGIONSDISABLED("Region support is disabled in the target world. It can be enabled per-world in WorldGuard's configuration files. However, you may need to restart your server afterwards."),
    REGION_COMMANDS_REGIONDATALOADFAIL("Region data failed to load for this world. Please ask a server administrator to read the logs to identify the reason."),
    REGION_COMMANDS_UNSUPPORTEDSHAPE("Sorry, you can only use cuboids and polygons for WorldGuard regions."),
    REGION_COMMANDS_SAVEFAILURES("(Warning: The background saving of region data is failing for these worlds: {worlds}. Your changes are getting lost. See the server log for more information.)", "worlds"),
    REGION_COMMANDS_HEIGHTWARNING("(Warning: The height of the region was {height} block(s).)", "height"),
    REGION_COMMANDS_NEWUSERINFO1("(This region is NOW PROTECTED from modification from others. Don't want that? Use "),
    REGION_COMMANDS_NEWUSERINFO2(")"),
    REGION_COMMANDS_SPAWNOVERLAPWARNING("Warning!"),
    REGION_COMMANDS_SPAWNOVERLAPINFO(" This region overlaps vanilla's spawn protection. WorldGuard cannot override this, and only server operators will be able to interact with this area."),
    REGION_COMMANDS_SELECTED("Region selected as {type}", "type"),
    REGION_COMMANDS_TYPEFAIL("Can't select that region! The region type '{type}' can't be selected.", "type"),

    // com.sk89q.worldguard.commands.region.RegionPrintoutBuilder
    REGION_INFO_REGION_NAME("Region: "),
    REGION_INFO_REGION_TYPE(" (type="),
    REGION_INFO_REGION_PRIORITY(", priority="),
    REGION_INFO_REGION_END(")"),
    REGION_INFO_VOLUME("Volume: "),
    REGION_INFO_FLAGS_BASE("Flags: "),
    REGION_INFO_FLAGS_NONE("(none)"),
    REGION_INFO_FLAGS_CLICKTOSET("Click to set flag"),
    REGION_INFO_FLAGS_CLICKTOSETFLAG("Click to set a flag"),
    REGION_INFO_FLAGS_SETCOMMAND("[Flags]"),
    REGION_INFO_PARENT_INFO(" (parent, priority="),
    REGION_INFO_PARENT_CLICKINFO("Click for info"),
    REGION_INFO_PARENT_END(")"),
    REGION_INFO_PARENT_UNLINK("Click to unlink parent"),
    REGION_INFO_PARENT_UNLINKCMD("[X]"),
    REGION_INFO_OWNERS("Owners: "),
    REGION_INFO_MEMBERS("Members: "),
    REGION_INFO_DOMAIN_NONE("(none)"),
    REGION_INFO_DOMAIN_ADD("Click to add a player or group"),
    REGION_INFO_DOMAIN_ADDCMD("[Add]"),
    REGION_INFO_DOMAIN_REMOVE("Click to remove a player or group"),
    REGION_INFO_DOMAIN_REMOVECMD("[Rem]"),
    REGION_INFO_DOMAIN_CLEAR("Click to clear"),
    REGION_INFO_DOMAIN_CLEARCMD("[Clr]"),
    REGION_INFO_BOUND_BASE("Bounds:"),
    REGION_INFO_BOUNDS_CLICKSELECT("Click to select"),
    REGION_INFO_BOUNDS_TELEPORT("Click to teleport"),
    REGION_INFO_BOUNDS_TELEPORTCMD("[Teleport]"),
    REGION_INFO_BOUNDS_CENTERTELEPORT("Click to teleport to the center of the region"),
    REGION_INFO_BOUNDS_CENTERTELEPORTCMD("[Center Teleport]"),
    REGION_INFO_PRIORITY_CLICKCHANGE("Click to change"),
    REGION_INFO_LASTSEEN("Any names suffixed by * are 'last seen names' and may not be up to date."),
    REGION_INFO_TITLE("Region Info"),

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

    public Component text() {
        return LegacyComponentSerializer.legacyLinking().deserialize(currentMsg, '&');
    }

    public Component text(Object... args) {
        return LegacyComponentSerializer.legacyLinking().deserialize(get(args), '&');
    }

    public boolean setMessage(String msg) {
        if (msg == null) {
            currentMsg = defaultMsg;
            return false;
        } else {
            currentMsg = colorize(msg);
            return true;
        }
    }

    // org.bukkit.ChatColor#translateAlternateColorCodes
    public static String colorize(String textToTranslate) {
        if (textToTranslate == null) {
            return null;
        }
        char[] b = textToTranslate.toCharArray();
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == '&' && "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx".indexOf(b[i + 1]) > -1) {
                b[i] = '§';
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
