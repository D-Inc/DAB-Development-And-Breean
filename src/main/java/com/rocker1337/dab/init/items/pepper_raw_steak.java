package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * Created by ninjawarrior1337 on 10/27/16.
 */
public class pepper_raw_steak extends ItemFood
{
    public pepper_raw_steak(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName("pepper_raw_steak");
        setRegistryName("pepper_raw_steak");
    }
    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 16;
    }
}
