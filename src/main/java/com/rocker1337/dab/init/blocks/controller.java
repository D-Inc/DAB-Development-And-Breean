package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


/**
 * Created by ninjawarrior1337 on 7/4/2016.
 */
public class controller extends Block
{
    public controller()
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
    }
}
