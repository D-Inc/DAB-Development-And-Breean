package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ninjawarrior1337 on 7/2/2016.
 */
public class EnderFlight extends Item
{
    public EnderFlight()
    {
        setUnlocalizedName(SetItemNames.DABItems.ENDERFLIGHT.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.ENDERFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.DARK_GREEN + "Do not consume if not in Colorado");
        toolTip.add(ChatFormatting.DARK_RED + "21");
        toolTip.add(ChatFormatting.RED + "22");
    }
}
