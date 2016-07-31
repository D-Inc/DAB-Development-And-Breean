package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class thoriumaxe extends ItemAxe
{

    protected thoriumaxe(ToolMaterial material, float damage, float speed)
    {
        super(material, damage, speed);
        setUnlocalizedName(SetItemNames.DABItems.THORIUMAXE.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMAXE.getRegistryName());
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }
}
