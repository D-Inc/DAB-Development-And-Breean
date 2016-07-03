package com.rocker1337.dab.init.items;

import net.minecraft.item.Item;

/**
 * Created by ninjawarrior1337 on 7/2/2016.
 */
public class EnderFlight extends Item
{
    public EnderFlight()
    {
        setUnlocalizedName(ItemSetNames.DABItems.ENDERFLIGHT.getUnlocalizedName());
        setRegistryName(ItemSetNames.DABItems.ENDERFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }
}
