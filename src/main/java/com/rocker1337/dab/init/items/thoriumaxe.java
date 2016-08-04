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
        this.attackSpeed = Float.intBitsToFloat(0x7f800000);
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }
}
