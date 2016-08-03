package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

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
        this.attackSpeed = 2147483647.0F;
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }
}
