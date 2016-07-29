package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemAxe;

public class infinityaxe extends ItemAxe
{

    protected infinityaxe(ToolMaterial material, float damage, float speed)
    {
        super(material, damage, speed);
        setUnlocalizedName(SetItemNames.DABItems.INFINITYAXE.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.INFINITYAXE.getRegistryName());
    }
}
