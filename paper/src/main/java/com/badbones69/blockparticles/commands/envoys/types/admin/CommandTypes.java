package com.badbones69.blockparticles.commands.envoys.types.admin;

import com.badbones69.blockparticles.Methods;
import com.badbones69.blockparticles.commands.envoys.BaseCommand;
import dev.triumphteam.cmd.bukkit.annotation.Permission;
import dev.triumphteam.cmd.core.annotations.Command;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionDefault;

public class CommandTypes extends BaseCommand {

    @Command("list")
    @Permission(value = "blockparticles.list", def = PermissionDefault.OP)
    public void list(Player sender) {
        Methods.listLoc(sender);
    }
}