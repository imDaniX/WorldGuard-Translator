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

package com.sk89q.worldguard.bukkit.listener;

import com.sk89q.commandbook.InfoComponent;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import me.imdanix.wgtranslator.Msg;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * @author zml2008
 */
public class WorldGuardCommandBookListener implements Listener {
    private final WorldGuardPlugin plugin;
    
    public WorldGuardCommandBookListener(WorldGuardPlugin plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerWhois(InfoComponent.PlayerWhoisEvent event) {
        if (event.getPlayer() instanceof Player) {
            Player player = (Player) event.getPlayer();
            LocalPlayer localPlayer = plugin.wrapPlayer(player);
            if (WorldGuard.getInstance().getPlatform().getGlobalStateManager().get(localPlayer.getWorld()).useRegions) {
                ApplicableRegionSet regions =
                        WorldGuard.getInstance().getPlatform().getRegionContainer().createQuery().getApplicableRegions(localPlayer.getLocation());
                
                // Current regions
                StringBuilder regionStr = new StringBuilder();
                boolean first = true;
                
                for (ProtectedRegion region : regions) {
                    if (!first) {
                        regionStr.append(", ");
                    }
                    
                    if (region.isOwner(localPlayer)) {
                        regionStr.append("+");
                    } else if (region.isMemberOnly(localPlayer)) {
                        regionStr.append("-");
                    }
                    
                    regionStr.append(region.getId());
                    
                    first = false;
                }
                
                if (regions.size() > 0) {
                    event.addWhoisInformation(Msg.COMMANDBOOK_WHOIS_CURRENT.get(), regionStr);
                }
                event.addWhoisInformation(Msg.COMMANDBOOK_WHOIS_BUILD.get(), regions.testState(localPlayer, Flags.BUILD));
            }
        }
    }
}
