package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class weed extends ItemFood
{
    public weed(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(ItemSetNames.DABItems.WEED.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.WEED.getRegistryName());

        setAlwaysEdible();
        setMaxStackSize(64);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.GREEN + "Do not consume if not in Colorado");
    }
}
