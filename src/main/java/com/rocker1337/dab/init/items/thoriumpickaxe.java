package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemPickaxe;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class thoriumpickaxe extends ItemPickaxe
{
    protected thoriumpickaxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.THORIUMPICKAXE.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMPICKAXE.getRegistryName());
    }
}
