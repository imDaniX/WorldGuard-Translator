package me.imdanix.wgtranslator;

import com.sk89q.worldedit.util.formatting.text.Component;
import com.sk89q.worldedit.util.formatting.text.serializer.legacy.LegacyComponentSerializer;

import java.util.Locale;

public enum Msg {
    BLACKLIST__ACTION__ACQUIRE("acquire"),
    BLACKLIST__ACTION__BREAK("break"),
    BLACKLIST__ACTION__DESTROY("destroy with"),
    BLACKLIST__ACTION__DISPENSE("dispense"),
    BLACKLIST__ACTION__DROP("drop"),
    BLACKLIST__ACTION__EQUIP("equip"),
    BLACKLIST__ACTION__INTERACT("interact with"),
    BLACKLIST__ACTION__PLACE("place"),
    BLACKLIST__ACTION__USE("use"),

    BLACKLIST__PUNISHMENT__BAN__DEFAULT("Banned: You can't {action} {type}.", "action", "type"),
    BLACKLIST__PUNISHMENT__BAN__REASONED("Banned: {reason}", "reason"),
    BLACKLIST__PUNISHMENT__KICK__DEFAULT("You can't {action} {type}.", "action", "type"),
    BLACKLIST__PUNISHMENT__KICK__REASONED("{reason}", "reason"),
    BLACKLIST__PUNISHMENT__TELL__DEFAULT("You're not allowed to {action} {type}.", "action", "type"),
    BLACKLIST__PUNISHMENT__TELL__TEXT("{text}", "text"),

    CHEST_LOCK__DISABLED("&cWorldGuard's sign chest protection is disabled."),
    CHEST_LOCK__LOCK("[Lock]"),
    CHEST_LOCK__LOCK_POST("&cThe {lock} sign must be a sign post, not a wall sign.", "lock"),
    CHEST_LOCK__NOT_OWN_ADJACENT("&4You do not own the adjacent chest."),
    CHEST_LOCK__OWNER_LINE("&cThe first owner line must be your name."),
    CHEST_LOCK__PROTECTED("&eA chest or double chest above is now protected."),
    CHEST_LOCK__PROTECTED_CHEST("&4This chest is protected."),
    CHEST_LOCK__SPOT("&4This spot is for a chest that you don't have permission for."),
    CHEST_LOCK__UNSAFE("&cThat is not a safe block that you're putting this sign on."),

    COMMANDBOOK__WHOIS__BUILD("Can build"),
    COMMANDBOOK__WHOIS__CURRENT("Current Regions"),

    DISABLED__ARROWS("&cSorry, arrows with {effect} are presently disabled.", "effect"),
    DISABLED__POTIONS("&cSorry, potions with {effect} are presently disabled.", "effect"),
    DISABLED__POTIONS_BYPASS("&cSorry, potions with {effect} can't be thrown, " +
            "even if you have a permission to bypass it, " +
            "due to limitations (and because overly-reliable potion blocking is on).", "effect"),

    ERROR__INFO("&c{message}", "message"),
    ERROR__INVALID_HOST_KICK("You did not join with the valid host key!"),
    ERROR__MATCHER__EXPECT_ARG("Argument expected for #player."),
    ERROR__MATCHER__INVALID_GROUP("Invalid group '{group}'.", "group"),
    ERROR__MATCHER__INVALID_ID("Invalid identifier '{identifier}'.", "identifier"),
    ERROR__MATCHER__NO_END_WORLD("No end world found."),
    ERROR__MATCHER__NO_NETHER_WORLD("No nether world found."),
    ERROR__MATCHER__NO_NORMAL_WORLD("No normal world found."),
    ERROR__MATCHER__NO_PLAYERS("No players matched query."),
    ERROR__MATCHER__NO_WORLD("No world by that exact name found."),
    ERROR__NO_PERMISSIONS("&cYou don't have permission."),
    ERROR__OP_DEOP("&c/op and /deop can only be used in console (as set by a WG setting)."),

    ERROR__USAGE("&c{usage}", "usage"),

    FIRE__ALLOW__ALREADY("Fire spread was already globally enabled."),
    FIRE__ALLOW__SUCCESS("Fire spread has been globally for '{world}' re-enabled by {player}.", "world", "player"),
    FIRE__DISABLED("&eFire spread is currently globally disabled for this world."),
    FIRE__STOP__ALREADY("Fire spread was already globally disabled."),
    FIRE__STOP__SUCCESS("Fire spread has been globally disabled for '{world}' by {player}.", "world", "player"),

    HALT__ALLOWED__BROADCAST("ALL intensive server activity is now allowed."),
    HALT__ALLOWED__INFO("ALL intensive server activity is now allowed."),
    HALT__ALLOWED__SILENT("(Silent) ALL intensive server activity is now allowed."),
    HALT__AUTO_REMOVE("Halt-Act: {removed} entities (>10) auto-removed from {world}", "removed", "world"),
    HALT__CONFIRM__PROMPT1("Click to confirm /{command}", "command"),
    HALT__CONFIRM__PROMPT2("[Click]"),
    HALT__CONFIRM__PROMPT3(" or type "),
    HALT__CONFIRM__PROMPT4(" to confirm."),
    HALT__CONFIRM__WARNING1("This command will "),
    HALT__CONFIRM__WARNING2("PERMANENTLY"),
    HALT__CONFIRM__WARNING3(" erase ALL animals in ALL loaded chunks in ALL loaded worlds. "),
    HALT__ENTITIES_REMOVED("{count} entities (>10) auto-removed from {world}", "count", "world"),
    HALT__HALTED__BROADCAST("ALL intensive server activity halted by {name}.", "name"),
    HALT__HALTED__INFO("ALL intensive server activity halted."),
    HALT__HALTED__SILENT("(Silent) ALL intensive server activity halted by {name}.", "name"),
    HALT__SERVER_HALTED("&eIntensive server activity has been HALTED."),
    HALT__STATUS__ALLOWED("ALL intensive server activity is allowed."),
    HALT__STATUS__HALTED("ALL intensive server activity is not allowed."),

    INFINITESTACK__REMOVE("&cInfinite stack removed."),
    INFINITESTACK__REMOVE_SLOT("&cInfinite stack in slot #{slot} removed.", "slot"),

    REGION__BYPASS__DISABLED("You are no longer bypassing region protection."),
    REGION__BYPASS__ENABLED("You are now bypassing region protection (as long as you have permission)."),
    REGION__BYPASS__INVALID("Allowed optional arguments are: on, off"),

    REGION__CLAIM__ADDING("Claiming region '{region}'", "region"),
    REGION__CLAIM__ERROR__ALREADY_EXIST("This region already exists and you don't own it."),
    REGION__CLAIM__ERROR__MAX_INTEGER("The maximum claim volume get in the configuration is higher than is supported. Currently, it must be " + Integer.MAX_VALUE + " or smaller. Please contact a server administrator."),
    REGION__CLAIM__ERROR__NO_POLYGONS("Polygons are currently not supported for /rg claim."),
    REGION__CLAIM__ERROR__ONLY_INSIDE("You may only claim regions inside existing regions that you or your group own."),
    REGION__CLAIM__ERROR__OVERLAPS("This region overlaps with someone else's region."),
    REGION__CLAIM__ERROR__TOO_LARGE1("This region is too large to claim."),
    REGION__CLAIM__ERROR__TOO_LARGE2("Max. volume: {max}, your volume: {current}", "max", "current"),
    REGION__CLAIM__ERROR__TOO_MANY("You own too many regions, delete one first to claim a new one."),
    REGION__CLAIM__FAIL("Failed to claim region"),
    REGION__CLAIM__SUCCESS("A new region has been claimed named '{region}'", "region"),
    REGION__CLAIM__WAIT("(Please wait... {description})", "description"),

    REGION__COMMANDS__CLICK_TO_PICK("Click to pick this region"),
    REGION__COMMANDS__CURRENT_REGIONS("Current regions: "),
    REGION__COMMANDS__HEIGHT_WARNING("(Warning: The height of the region was {height} block(s).)", "height"),
    REGION__COMMANDS__NEW_USER_INFO1("(This region is NOW PROTECTED from modification from others. Don't want that? Use "),
    REGION__COMMANDS__NEW_USER_INFO2(")"),
    REGION__COMMANDS__NOT_STANDING_IN_REGION("You're not standing in a region. Specify an ID if you want to select a specific region."),
    REGION__COMMANDS__REGIONS_DISABLED("Region support is disabled in the target world. It can be enabled per-world in WorldGuard's configuration files. However, you may need to restart your server afterwards."),
    REGION__COMMANDS__REGION_DATA_LOAD_FAIL("Region data failed to load for this world. Please ask a server administrator to read the logs to identify the reason."),
    REGION__COMMANDS__REGION_EXISTS("A region with that name already exists. Please choose another name."),
    REGION__COMMANDS__REGION_EXISTS_REDEFINE(" To change the shape, use /region redefine {id}.", "id"),
    REGION__COMMANDS__REGION_INVALID_ID("The region name of '{id}' contains characters that are not allowed.", "id"),
    REGION__COMMANDS__REGION_NOT_FOUND("No region could be found with the name of '{id}'.", "id"),
    REGION__COMMANDS__REGION_NO_GLOBAL("Sorry, you can't use __global__ here."),
    REGION__COMMANDS__SAVE_FAILURES("(Warning: The background saving of region data is failing for these worlds: {worlds}. Your changes are getting lost. See the server log for more information.)", "worlds"),
    REGION__COMMANDS__SELECT_AREA_FIRST("Please select an area first. Use WorldEdit to make a selection! (see: https://worldedit.enginehub.org/en/latest/usage/regions/selections/)."),
    REGION__COMMANDS__SPAWN_OVERLAP_INFO(" This region overlaps vanilla's spawn protection. WorldGuard cannot override this, and only server operators will be able to interact with this area."),
    REGION__COMMANDS__SPAWN_OVERLAP_WARNING("Warning!"),
    REGION__COMMANDS__STANDING_IN_MULTIPLE("You're standing in several regions (please pick one)."),
    REGION__COMMANDS__UNSUPPORTED_SHAPE("Sorry, you can only use cuboids and polygons for WorldGuard regions."),
    REGION__COMMANDS__WORLD_SPECIFY("Please specify the world with -{flag} world_name.", "flag"),

    REGION__DEFINE__ADDING("Adding region '{region}'", "region"),
    REGION__DEFINE__FAIL("Failed to add the region '{region}'", "region"),
    REGION__DEFINE__SUCCESS("A new region has been made named '{region}'", "region"),

    REGION__FLAGS__BUILD__WARNING__BODY(" Setting this flag is not required for protection."),
    REGION__FLAGS__BUILD__WARNING__DETAIL("Setting this flag will completely override default protection, and apply to members, non-members, pistons, sand physics, and everything else that can modify blocks."),
    REGION__FLAGS__BUILD__WARNING__DOCUMENTATION("Only set this flag if you are sure you know what you are doing. See "),
    REGION__FLAGS__BUILD__WARNING__HEADER("WARNING:"),
    REGION__FLAGS__CHANGE("Click to change"),
    REGION__FLAGS__CONSEQUENCES1("Setting this flag may have unintended consequences."),
    REGION__FLAGS__CONSEQUENCES2("Please read the documentation and set this flag manually if you really intend to."),
    REGION__FLAGS__CONSEQUENCES3("(Hint: You do not need to set this to protect the region!)"),
    REGION__FLAGS__FAIL("Failed to get region flags"),
    REGION__FLAGS__INHERITED__DEFAULT1("Default"),
    REGION__FLAGS__INHERITED__DEFAULT2(" value"),
    REGION__FLAGS__INHERITED__INHERITED("Inherited value"),
    REGION__FLAGS__INHERITED__INHERITED_DEFAULT1("Inherited & "),
    REGION__FLAGS__INHERITED__INHERITED_DEFAULT2("default"),
    REGION__FLAGS__INHERITED__INHERITED_DEFAULT3(" value"),
    REGION__FLAGS__SET("Click to set"),
    REGION__FLAGS__SET_CUSTOM("Click to set custom value"),
    REGION__FLAGS__SPECIAL__BUILD("This is a special flag which overrides build checks. (Not movement related!)"),
    REGION__FLAGS__SPECIAL__MEMBER("This is a special flag which defaults to allow for members, and deny for non-members"),
    REGION__FLAGS__SPECIFY("Please specify the region with /region flags -w world_name region_name."),
    REGION__FLAGS__THIRD_PARTY("Third-Party Flags"),
    REGION__FLAGS__TITLE("Flags for {region}", "region"),
    REGION__FLAGS__UNSET("Click to unset"),
    REGION__FLAGS__VALUES("Current values:"),

    REGION__FLAGS__VALUE__DEFAULT__DENY("&c&lHey!&7 Sorry, but you can't %what% here."),
    REGION__FLAGS__VALUE__DEFAULT__ENTRY_DENY("&c&lHey!&7 You are not permitted to enter this area."),
    REGION__FLAGS__VALUE__DEFAULT__EXIT_DENY("&c&lHey!&7 You are not permitted to leave this area."),
    REGION__FLAGS__VALUE__DEFAULT__TELEPORT("&dTeleported you to the region '%id%'."),

    REGION__FLAGS__VALUE__INVALID__BOOLEAN("Not a yes/no value: {input}", "input"),
    REGION__FLAGS__VALUE__INVALID__DATETIME("Expected 'now' or ISO 8601 formatted input."),
    REGION__FLAGS__VALUE__INVALID__DOUBLE("Not a number: {input}", "input"),
    REGION__FLAGS__VALUE__INVALID__ENTITY_TYPE("Unknown entity type: {input}", "input"),
    REGION__FLAGS__VALUE__INVALID__ENUM("Unknown value '{input}' in {class}", "input", "class"),
    REGION__FLAGS__VALUE__INVALID__GAMEMODE("Unknown game mode: {input}", "input"),
    REGION__FLAGS__VALUE__INVALID__INTEGER("Not a number: {input}", "input"),
    REGION__FLAGS__VALUE__INVALID__LOCATION("Expected 'here' or x,y,z."),
    REGION__FLAGS__VALUE__INVALID__MAP("Input must be in a 'key:value,key1=value1' format. Either ':' or '=' can be used."),
    REGION__FLAGS__VALUE__INVALID__OUTSIDE("You can't set that flag outside of the region boundaries."),
    REGION__FLAGS__VALUE__INVALID__PLUGIN("The plugin that registered this flag is not currently installed"),
    REGION__FLAGS__VALUE__INVALID__REGISTRY("Unknown {registry}: {key}", "registry", "key"),
    REGION__FLAGS__VALUE__INVALID__SENDER_NOT_PLAYER("Not a player"),
    REGION__FLAGS__VALUE__INVALID__STATE("Expected none/allow/deny, but got '{input}'", "input"),
    REGION__FLAGS__VALUE__INVALID__UNRECOGNIZED("Unrecognized input."),
    REGION__FLAGS__VALUE__INVALID__UUID("Not a valid uuid: {input}", "input"),
    REGION__FLAGS__VALUE__INVALID__WEATHER("Unknown weather type: {input}", "input"),

    REGION__FLAGS__VALUE__LOCATION__CURRENT("Current value:"),
    REGION__FLAGS__VALUE__LOCATION__DEFAULT("Default value:"),
    REGION__FLAGS__VALUE__LOCATION__UNSET("unset location"),
    REGION__FLAGS__VALUE__NUMERIC__CUSTOM("[custom]"),
    REGION__FLAGS__VALUE__NUMERIC__UNSET("unset number"),
    REGION__FLAGS__VALUE__STRING__CURRENT("Current value:"),
    REGION__FLAGS__VALUE__STRING__DEFAULT("Default value:"),
    REGION__FLAGS__VALUE__STRING__UNSET("unset string"),

    REGION__FLAGS__WARNING__DOCUMENTATION("this documentation page"),

    REGION__FLAG__CURRENT__FLAGS("(Current flags: "),
    REGION__FLAG__CURRENT__FLAGS_END(")"),

    REGION__FLAG__ERROR__EMPTY("You cannot use -e(mpty) with a flag value."),
    REGION__FLAG__ERROR__NO_GROUP("Region flag '{flag}' does not have a group flag!", "flag"),

    REGION__FLAG__GROUP__RESET("Region group flag for '{flag}' reset to default.", "flag"),
    REGION__FLAG__GROUP__SET("Region group flag for '{flag}' set.", "flag"),

    REGION__FLAG__LIST__AVAILABLE("Available flags: "),
    REGION__FLAG__LIST__COMMAND("/rg flags {region}", "region"),
    REGION__FLAG__LIST__FETCHING("Flag list for invalid flag command."),

    REGION__FLAG__LIST__OR_USE("Or use the command "),
    REGION__FLAG__LIST__UNKNOWN("Unknown flag specified: {flag}", "flag"),
    REGION__FLAG__REMOVED("Region flag {flag} removed from '{region}'. (Any -g(roups) were also removed.)", "flag", "region"),
    REGION__FLAG__SET("Region flag {flag} set on '{region}' to '{value}'.", "flag", "region", "value"),

    REGION__INFO__BOUNDS__BASE("Bounds:"),
    REGION__INFO__BOUNDS__CENTER_TELEPORT("Click to teleport to the center of the region"),
    REGION__INFO__BOUNDS__CENTER_TELEPORT_CMD("[Center Teleport]"),
    REGION__INFO__BOUNDS__CLICK_SELECT("Click to select"),
    REGION__INFO__BOUNDS__TELEPORT("Click to teleport"),
    REGION__INFO__BOUNDS__TELEPORT_CMD("[Teleport]"),

    REGION__INFO__DOMAIN__ADD("Click to add a player or group"),
    REGION__INFO__DOMAIN__ADD_CMD("[Add]"),
    REGION__INFO__DOMAIN__CLEAR("Click to clear"),
    REGION__INFO__DOMAIN__CLEAR_CMD("[Clr]"),
    REGION__INFO__DOMAIN__NONE("(none)"),
    REGION__INFO__DOMAIN__REMOVE("Click to remove a player or group"),
    REGION__INFO__DOMAIN__REMOVE_CMD("[Rem]"),

    REGION__INFO__FAIL("Failed to fetch region information"),
    REGION__INFO__FETCHING("Fetching region info"),

    REGION__INFO__FLAGS__BASE("Flags: "),
    REGION__INFO__FLAGS__CLICK_TO_SET("Click to set flag"),
    REGION__INFO__FLAGS__CLICK_TO_SET_FLAG("Click to set a flag"),
    REGION__INFO__FLAGS__NONE("(none)"),
    REGION__INFO__FLAGS__SET_COMMAND("[Flags]"),

    REGION__INFO__LAST_SEEN("Any names suffixed by * are 'last seen names' and may not be up to date."),

    REGION__INFO__MEMBERS("Members: "),
    REGION__INFO__OWNERS("Owners: "),

    REGION__INFO__PARENT__CLICK_INFO("Click for info"),
    REGION__INFO__PARENT__END(")"),
    REGION__INFO__PARENT__INFO(" (parent, priority="),
    REGION__INFO__PARENT__UNLINK("Click to unlink parent"),
    REGION__INFO__PARENT__UNLINK_CMD("[X]"),

    REGION__INFO__PRIORITY__CLICK_CHANGE("Click to change"),

    REGION__INFO__REGION__END(")"),
    REGION__INFO__REGION__NAME("Region: "),
    REGION__INFO__REGION__PRIORITY(", priority="),
    REGION__INFO__REGION__TYPE(" (type="),

    REGION__INFO__SPECIFY("Please specify the region with /region info -w world_name region_name."),

    REGION__INFO__TITLE("Region Info"),
    REGION__INFO__VOLUME("Volume: "),

    REGION__INFO__WAIT("(Please wait... fetching region information...)"),

    REGION__LIST__FAIL("Failed to fetch region list"),
    REGION__LIST__FETCHING("Getting region list"),
    REGION__LIST__WAIT("(Please wait... fetching region list...)"),

    REGION__LOAD__ALL__FAIL("Failed to load regions for all worlds"),
    REGION__LOAD__ALL__LOADING("Loading regions for all worlds"),
    REGION__LOAD__ALL__SUCCESS("Successfully load the region data for all worlds."),
    REGION__LOAD__ALL__WAIT("(Please wait... loading region data for all worlds...)"),
    REGION__LOAD__FAIL("Failed to load region data for '{world}'", "world"),
    REGION__LOAD__LOADING("Loading region data for '{world}'.", "world"),
    REGION__LOAD__NO_MANAGER("No region manager exists for world '{world}'.", "world"),
    REGION__LOAD__SUCCESS("Loaded region data for '{world}'", "world"),
    REGION__LOAD__WAIT("Please wait... {description}", "description"),

    REGION__MEMBERSHIP__ADDMEMBER__ADDING("Adding members to the region '{region}' on '{world}'", "region", "world"),
    REGION__MEMBERSHIP__ADDMEMBER__FAIL("Failed to add new members"),
    REGION__MEMBERSHIP__ADDMEMBER__SUCCESS("Region '{region}' updated with new members.", "region"),

    REGION__MEMBERSHIP__ADDOWNER__ADDING("Adding owners to the region '{region}' on '{world}'", "region", "world"),
    REGION__MEMBERSHIP__ADDOWNER__FAIL("Failed to add new owners"),
    REGION__MEMBERSHIP__ADDOWNER__MAXIMUM("You already own the maximum allowed amount of regions."),
    REGION__MEMBERSHIP__ADDOWNER__SUCCESS("Region '{region}' updated with new owners.", "region"),

    REGION__MEMBERSHIP__REMOVEMEMBER__FAIL("Failed to remove members"),
    REGION__MEMBERSHIP__REMOVEMEMBER__LIST("List some names to remove, or use -a to remove all."),
    REGION__MEMBERSHIP__REMOVEMEMBER__REMOVING("Removing members from the region '{region}' on '{world}'", "region", "world"),
    REGION__MEMBERSHIP__REMOVEMEMBER__SUCCESS("Region '{region}' updated with members removed.", "region"),
    REGION__MEMBERSHIP__REMOVEMEMBER__WAIT("(Please wait... querying player names...)"),

    REGION__MEMBERSHIP__REMOVEOWNER__FAIL("Failed to remove owners"),
    REGION__MEMBERSHIP__REMOVEOWNER__LIST("List some names to remove, or use -a to remove all."),
    REGION__MEMBERSHIP__REMOVEOWNER__REMOVING("Removing owners from the region '{region}' on '{world}'", "region", "world"),
    REGION__MEMBERSHIP__REMOVEOWNER__SUCCESS("Region '{region}' updated with owners removed.", "region"),
    REGION__MEMBERSHIP__REMOVEOWNER__WAIT("(Please wait... querying player names...)"),

    REGION__MIGRATEDB__COMPLETE("Migration complete! This only migrated the data. If you already changed your settings to use the target driver, then WorldGuard is now using the new data. If not, you have to adjust your configuration to use the new driver and then restart your server."),
    REGION__MIGRATEDB__CONFIRM("This command is potentially dangerous.\nPlease ensure you have made a backup of your data, and then re-enter the command with -y tacked on at the end to proceed."),
    REGION__MIGRATEDB__ERROR__BASE("Error encountered while migrating: {message}", "message"),
    REGION__MIGRATEDB__ERROR__INVALID__FROM("The value of 'from' is not a recognized type of region data database."),
    REGION__MIGRATEDB__ERROR__INVALID__TO("The value of 'to' is not a recognized type of region region data database."),
    REGION__MIGRATEDB__ERROR__SAME("It is not possible to migrate between the same types of region data databases."),
    REGION__MIGRATEDB__ERROR__UNSUPPORTED__FROM("The driver specified as 'from' does not seem to be supported in your version of WorldGuard."),
    REGION__MIGRATEDB__ERROR__UNSUPPORTED__TO("The driver specified as 'to' does not seem to be supported in your version of WorldGuard."),
    REGION__MIGRATEDB__PERFORMING("Now performing migration... this may take a while."),

    REGION__MIGRATEHEIGHTS__COMPLETE("Migration complete!"),
    REGION__MIGRATEHEIGHTS__CONFIRM("This command is potentially dangerous.\nPlease ensure you have made a backup of your data, and then re-enter the command with -y tacked on at the end to proceed."),
    REGION__MIGRATEHEIGHTS__ERROR("Error encountered while migrating: {message}", "message"),

    REGION__MIGRATEUUID__COMPLETE("Migration complete!"),
    REGION__MIGRATEUUID__ERROR("Error encountered while migrating: {message}", "message"),
    REGION__MIGRATEUUID__PERFORMING("Now performing migration... this may take a while."),

    REGION__PARENT__CURRENT_INHERITANCE__INFO("(Current inheritance on '{parent}':", "parent"),
    REGION__PARENT__CURRENT_INHERITANCE__INFO_END(")"),
    REGION__PARENT__CURRENT_INHERITANCE__SHORT("(Current inheritance:"),
    REGION__PARENT__CURRENT_INHERITANCE__SHORT_END(")"),
    REGION__PARENT__ERROR__CIRCULAR("Uh oh! Setting '{parent}' to be the parent of '{child}' would cause circular inheritance.", "parent", "child"),
    REGION__PARENT__ORPHANED(" Region is now orphaned."),
    REGION__PARENT__SET("Inheritance set for region '{region}'.", "region"),

    REGION__PRIORITY__SET("Priority of '{region}' set to {priority} (higher numbers override).", "region", "priority"),

    REGION__PROTECTION__ACTION__ANCHOR("use anchor"),
    REGION__PROTECTION__ACTION__ANVIL("use that"),
    REGION__PROTECTION__ACTION__BREAK("break that block"),
    REGION__PROTECTION__ACTION__CHANGE("change that"),
    REGION__PROTECTION__ACTION__CHAT("chat"),
    REGION__PROTECTION__ACTION__CREATE_PORTALS("create portals"),
    REGION__PROTECTION__ACTION__DAMAGE("damage that"),
    REGION__PROTECTION__ACTION__DISEMBARK("&6Don't disembark here!&7 You can't get back on."),
    REGION__PROTECTION__ACTION__DYNAMITE("use dynamite"),
    REGION__PROTECTION__ACTION__ENTITY_BREAK("break things"),
    REGION__PROTECTION__ACTION__EXPLOSIVES("use explosives"),
    REGION__PROTECTION__ACTION__FIRE("place fire"),
    REGION__PROTECTION__ACTION__FROSTWALKER("use frostwalker"),
    REGION__PROTECTION__ACTION__HARM("harm that"),
    REGION__PROTECTION__ACTION__HIT("hit that"),
    REGION__PROTECTION__ACTION__ITEM_DROP("drop items"),
    REGION__PROTECTION__ACTION__ITEM_PICKUP("pick up items"),
    REGION__PROTECTION__ACTION__OPEN("open that"),
    REGION__PROTECTION__ACTION__OTHER("use that"),
    REGION__PROTECTION__ACTION__PLACE("place that block"),
    REGION__PROTECTION__ACTION__POTION("use lingering potions"),
    REGION__PROTECTION__ACTION__PVP("PvP"),
    REGION__PROTECTION__ACTION__RIDE("ride that"),
    REGION__PROTECTION__ACTION__SLEEP("sleep"),
    REGION__PROTECTION__ACTION__TAKE("take that"),
    REGION__PROTECTION__ACTION__THINGS("place things"),
    REGION__PROTECTION__ACTION__USE("use that"),
    REGION__PROTECTION__ACTION__USE_WHAT("use {what}", "what"),
    REGION__PROTECTION__ACTION__VEHICLE_BREAK("break vehicles"),
    REGION__PROTECTION__ACTION__VEHICLE_PLACE("place vehicles"),
    REGION__PROTECTION__ACTION__XP_DROP("drop xp"),

    REGION__REDEFINE__ADDING("Updating region '{region}'", "region"),
    REGION__REDEFINE__FAIL("Failed to update the region '{region}'", "region"),
    REGION__REDEFINE__SUCCESS("Region '{region}' has been updated with a new area.", "region"),
    REGION__REDEFINE__WAIT("(Please wait... {description})", "description"),

    REGION__REMOVE__ERROR__FLAGS("You cannot use both -u (unset parent) and -f (remove children) together."),
    REGION__REMOVE__FAIL("Failed to remove region"),
    REGION__REMOVE__REMOVING("Removing region '{region}' in '{world}'", "region", "world"),
    REGION__REMOVE__SUCCESS("Successfully removed {region}.", "region"),
    REGION__REMOVE__WAIT("Please wait... removing region."),

    REGION__SAVE__ALL__FAIL("Failed to save regions for all worlds"),
    REGION__SAVE__ALL__SAVING("Saving regions for all worlds"),
    REGION__SAVE__ALL__SUCCESS("Successfully saved the region data for all worlds."),
    REGION__SAVE__ALL__WAIT("(Please wait... saving region data for all worlds...)"),

    REGION__SAVE__FAIL("Failed to save region data for '{world}'", "world"),
    REGION__SAVE__NO_MANAGER("No region manager exists for world '{world}'.", "world"),
    REGION__SAVE__SAVING("Saving region data for '{world}'.", "world"),
    REGION__SAVE__SUCCESS("Saving region data for '{world}'", "world"),
    REGION__SAVE__WAIT("Please wait... {description}", "description"),

    REGION__SELECT__SELECTED("Region selected as {region}", "region"),
    REGION__SELECT__SPECIFY("Please specify a region name."),
    REGION__SELECT__TYPE_FAIL("Can't select that region! The region type '{type}' can't be selected.", "type"),

    REGION__TELEPORT__FAIL("Unable to teleport to region '{region}'.", "region"),
    REGION__TELEPORT__NO_CENTER("The region has no center point."),
    REGION__TELEPORT__NO_SPAWN("The region has no spawn point associated."),
    REGION__TELEPORT__NO_TELEPORT("The region has no teleport point associated."),
    REGION__TELEPORT__SPECTATOR_ONLY("Center teleport is only available in Spectator gamemode."),

    WAND__BUILD__INFO("&eCan you build? {check}", "check"),
    WAND__BUILD__NO("No"),
    WAND__BUILD__YES("Yes"),
    WAND__REGIONS__EMPTY("WorldGuard: No defined regions here!"),
    WAND__REGIONS__LIST("Applicable regions: {regions}", "regions"),

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

    public static String colorize(String message) {
        StringBuilder builder = new StringBuilder(message.length() + 32);
        int i = 0;
        int len = message.length();

        while (i < len) {
            if (i + 7 < len && (message.charAt(i) == '&' || message.charAt(i) == '§') && message.charAt(i + 1) == '#') {
                boolean isHex = true;
                for (int j = 2; j < 8; j++) {
                    char c = message.charAt(i + j);
                    if (!isColorCode(c)) {
                        isHex = false;
                        break;
                    }
                }
                if (isHex) {
                    String hexDigits = message.substring(i + 2, i + 8);
                    builder.append('§').append('x');
                    for (int k = 0; k < 6; k++) {
                        builder.append('§').append(Character.toLowerCase(hexDigits.charAt(k)));
                    }
                    i += 8;
                    continue;
                }
            }

            if (i + 1 < len && message.charAt(i) == '&') {
                char next = message.charAt(i + 1);
                if (isFormatCode(next)) {
                    builder.append('§').append(Character.toLowerCase(next));
                    i += 2;
                    continue;
                }
            }

            builder.append(message.charAt(i));
            i++;
        }

        return builder.toString();
    }

    private static boolean isColorCode(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                 'a', 'b', 'c', 'd', 'e', 'f',
                 'A', 'B', 'C', 'D', 'E', 'F' -> true;
            default -> false;
        };
    }

    private static boolean isFormatCode(char c) {
        return switch (c) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                 'a', 'b', 'c', 'd', 'e', 'f',
                 'A', 'B', 'C', 'D', 'E', 'F',
                 'k', 'l', 'm', 'n', 'o', 'r',
                 'K', 'L', 'M', 'N', 'O', 'R',
                 'x', 'X' -> true;
            default -> false;
        };
    }

    public String asSection() {
        return name().toLowerCase(Locale.ENGLISH)
                .replace("__", ".")
                .replace('_', '-');
    }

    public String asLegacySection() {
        return name().toLowerCase(Locale.ENGLISH)
                .replace("__", ".")
                .replace("_", "");
    }
}
