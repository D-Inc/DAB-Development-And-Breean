package com.rocker1337.dab.init.items;

import com.rocker1337.dab.Reference;
import net.minecraft.item.ItemFood;

public class FoodWeed extends ItemFood
{
    public FoodWeed(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(Reference.DABItems.WEED.getUnlocalizedName());
        setRegistryName(Reference.DABItems.WEED.getRegistryName());
    }
}
