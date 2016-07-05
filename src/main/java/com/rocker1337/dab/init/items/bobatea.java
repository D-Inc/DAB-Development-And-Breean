package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;


public class bobatea extends ItemFood
{

    public bobatea(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(SetItemNames.DABItems.BOBATEA.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.BOBATEA.getRegistryName());

        setAlwaysEdible();
    }
}
