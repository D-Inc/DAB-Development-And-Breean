package com.rocker1337.dab.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class LessFlight extends Item
{
    public LessFlight()
    {
        setUnlocalizedName(ItemSetNames.DABItems.LESSFLIGHT.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.LESSFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack Item, List<String> toolTip, boolean advanced)
    {
        toolTip.add("Much Weak Much Wow");


    }
}
