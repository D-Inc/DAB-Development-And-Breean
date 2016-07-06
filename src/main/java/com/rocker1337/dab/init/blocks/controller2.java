package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by ninjawarrior1337 on 7/5/2016.
 */
public class controller2 extends Block
{
    public controller2()
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.controller2.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.controller2.getRegistryName());
        setLightLevel(5.0F);
    }
}
