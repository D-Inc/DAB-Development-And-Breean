package com.rocker1337.dab.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class LessFlight extends Item
{
    public LessFlight()
    {
        setUnlocalizedName(ItemSetNames.DABItems.LESSFLIGHT.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.LESSFLIGHT.getRegistryName());
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack Item, List<String> tooltip, boolean advanced){
        tooltip.add("Lesser Flight");

    }
}
