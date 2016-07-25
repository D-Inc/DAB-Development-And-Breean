package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class moving_smiley_request extends Block
{
    public moving_smiley_request(Material materialIn)
    {
        super(materialIn);
        setUnlocalizedName(SetBlockNames.DABBlocks.moving_smiley_request.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.moving_smiley_request.getRegistryName());
    }
}
