package com.rocker1337.dab.init.items;

import net.minecraft.item.Item;

/**
 * Created by ninjawarrior1337 on 7/2/2016.
 */
public class EnderFlight extends Item
{
    public EnderFlight()
    {
        setUnlocalizedName(SetItemNames.DABItems.ENDERFLIGHT.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.ENDERFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }
}
