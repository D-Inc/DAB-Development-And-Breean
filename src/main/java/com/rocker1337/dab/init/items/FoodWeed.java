package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;

public class FoodWeed extends ItemFood
{
    public FoodWeed(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(ItemSetNames.DABItems.WEED.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.WEED.getRegistryName());
    }
}
