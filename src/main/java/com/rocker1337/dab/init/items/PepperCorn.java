package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

/**
 * Created by ninjawarrior1337 on 10/24/16.
 */
public class PepperCorn extends ItemFood
{

    public PepperCorn(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName("pepper_corn");
        setRegistryName("pepper_corn");
        setAlwaysEdible();
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 8;
    }
}
