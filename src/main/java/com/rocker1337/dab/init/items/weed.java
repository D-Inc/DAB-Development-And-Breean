package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;

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
}
