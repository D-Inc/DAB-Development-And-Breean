package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class infinitysword extends ItemSword
{
    public infinitysword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.INFINITYSWORD.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.INFINITYSWORD.getRegistryName());
    }
}
