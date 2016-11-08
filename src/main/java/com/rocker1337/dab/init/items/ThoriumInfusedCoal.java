package com.rocker1337.dab.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ninjawarrior1337 on 11/8/16 at 2:53 PM.
 */
public class ThoriumInfusedCoal extends Item
{
    public ThoriumInfusedCoal()
    {
        setUnlocalizedName("thorium_coal");
        setRegistryName("thorium_coal");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add("This item will burn for approximately 3.4 years (yes, real life years)!");
    }
}
