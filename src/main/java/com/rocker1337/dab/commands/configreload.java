package com.rocker1337.dab.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

import static com.rocker1337.dab.ConfigHandler.chestplateMagnet;
import static com.rocker1337.dab.ConfigHandler.syncConfig;

/**
 * Created by drkpa on 8/1/2016.
 */
public class configreload implements ICommand {

    private final List aliases;

    public configreload() {
        aliases = new ArrayList();
        aliases.add("configreload");
        aliases.add("configload");
    }

    @Override
    public String getCommandName()
    {
        return "configreload";
    }

    @Override
    public String getCommandUsage(ICommandSender sender)

    {
        return "/configreload";
    }

    @Override
    public List<String> getCommandAliases()
    {
        return this.aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        syncConfig();
        System.out.println("Command was ran successfully.");
        System.out.println(chestplateMagnet);
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender)
    {
        return true;
    }

    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos)
    {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index)
    {
        return false;
    }

    @Override
    public int compareTo(ICommand o)
    {
        return 0;
    }
}
