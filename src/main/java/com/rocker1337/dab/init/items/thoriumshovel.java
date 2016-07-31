package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemSpade;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class thoriumshovel extends ItemSpade
{
    public thoriumshovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.THORIUMSHOVEL.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMSHOVEL.getRegistryName());
    }
}
