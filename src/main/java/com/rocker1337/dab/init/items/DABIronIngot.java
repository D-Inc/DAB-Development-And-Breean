package com.rocker1337.dab.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ninjawarrior1337 on 10/27/16.
 */
public class DABIronIngot extends Item
{
    public DABIronIngot()
    {
        setUnlocalizedName("dab_iron_ingot");
        setRegistryName("dab_iron_ingot");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add("This item was pseudo requested by " + TextFormatting.DARK_RED + "Rocker545" + TextFormatting.RESET + " becuase he thought there was no iron ingots added by any mod.");
    }
}
