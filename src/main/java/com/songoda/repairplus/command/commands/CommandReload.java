package com.songoda.repairplus.command.commands;

import com.songoda.arconix.api.methods.formatting.TextComponent;
import com.songoda.repairplus.RepairPlus;
import com.songoda.repairplus.command.AbstractCommand;
import org.bukkit.command.CommandSender;

public class CommandReload extends AbstractCommand {

    public CommandReload(AbstractCommand parent) {
        super("reload", parent, false);
    }

    @Override
    protected ReturnType runCommand(RepairPlus instance, CommandSender sender, String... args) {
        instance.reload();
        sender.sendMessage(TextComponent.formatText(instance.references.getPrefix() + "&7Configuration and Language files reloaded."));
        return ReturnType.SUCCESS;
    }

    @Override
    public String getPermissionNode() {
        return "repairplus.admin";
    }

    @Override
    public String getSyntax() {
        return "/rp reload";
    }

    @Override
    public String getDescription() {
        return "Reload the Configuration and Language files.";
    }
}
