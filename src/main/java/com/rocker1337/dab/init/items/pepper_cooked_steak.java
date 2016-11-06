package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;

/**
 * Created by ninjawarrior1337 on 10/28/16.
 */
public class pepper_cooked_steak extends ItemFood
{
    public pepper_cooked_steak(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName("pepper_cooked_steak");
        setRegistryName("pepper_cooked_steak");
    }
}
