package com.rocker1337.dab.init.items;

import net.minecraft.item.Item;

public class GreatFlight extends Item
{
    public GreatFlight()
    {
        setUnlocalizedName(ItemSetNames.DABItems.GREATFLIGHT.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.GREATFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }
}
