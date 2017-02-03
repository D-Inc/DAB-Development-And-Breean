package com.rocker1337.dab.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by drkpa on 8/1/2016.
 */
public class gamemodes implements ICommand
{

    private final List aliases;

    public gamemodes()
    {
        aliases = new ArrayList();
        aliases.add("gms");
    }

    @Override
    public String getCommandName() {
        return "gms";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/gms";
    }

    @Override
    public List<String> getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        GameType survival = WorldSettings.getGameTypeById(0);
        EntityPlayer commander = (EntityPlayer)sender;
        commander.setGameType(survival);
        EntityPlayer player = (EntityPlayer)sender;
        player.addChatComponentMessage(new TextComponentString("Your game mode has been updated to " + TextFormatting.ITALIC + TextFormatting.GRAY + "Survival Mode"));
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
