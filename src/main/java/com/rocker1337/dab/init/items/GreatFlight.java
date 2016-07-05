package com.rocker1337.dab.init.items;

import net.minecraft.item.Item;

public class GreatFlight extends Item
{
    public GreatFlight()
    {
        setUnlocalizedName(SetItemNames.DABItems.GREATFLIGHT.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.GREATFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }
}
