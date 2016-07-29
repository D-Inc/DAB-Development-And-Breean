package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemSpade;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class infinityshovel extends ItemSpade
{
    public infinityshovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.INFINITYSHOVEL.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.INFINITYSHOVEL.getRegistryName());
    }
}
