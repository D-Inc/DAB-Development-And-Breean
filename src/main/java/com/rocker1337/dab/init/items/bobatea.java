package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;


public class bobatea extends ItemFood
{

    public bobatea(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(ItemSetNames.DABItems.BOBATEA.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.BOBATEA.getRegistryName());
    }
}
