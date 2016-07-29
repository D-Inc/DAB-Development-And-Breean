package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemPickaxe;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class infinitypickaxe extends ItemPickaxe
{
    protected infinitypickaxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.INFINITYPICKAXE.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.INFINITYPICKAXE.getRegistryName());
    }
}
