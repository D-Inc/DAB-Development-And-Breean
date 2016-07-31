package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class thoriumsword extends ItemSword
{
    public thoriumsword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.THORIUMSWORD.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMSWORD.getRegistryName());
    }
}
