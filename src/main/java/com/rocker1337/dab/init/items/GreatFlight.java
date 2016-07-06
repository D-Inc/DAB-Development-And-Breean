package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class GreatFlight extends Item
{
    public GreatFlight()
    {
        setUnlocalizedName(SetItemNames.DABItems.GREATFLIGHT.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.GREATFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.DARK_AQUA + "Works anywhere in your inventory!");
    }
}
