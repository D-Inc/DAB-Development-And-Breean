package com.rocker1337.dab.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by ninjawarrior1337 on 7/31/16.
 */
public class ThoriumGem extends Item
{
    public ThoriumGem()
    {
        setUnlocalizedName(SetItemNames.DABItems.THORIUMGEM.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMGEM.getUnlocalizedName());
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }
}
