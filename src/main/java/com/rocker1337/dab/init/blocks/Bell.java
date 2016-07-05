package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


/**
 * Created by ninjawarrior1337 on 7/4/2016.
 */
public class Bell extends Block
{
    public Bell()
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.Bell.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.Bell.getUnlocalizedName());
    }
}
