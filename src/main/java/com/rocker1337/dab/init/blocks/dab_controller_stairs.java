package com.rocker1337.dab.init.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

/**
 * Created by ninjawarrior1337 on 8/2/16.
 */
public class dab_controller_stairs extends BlockStairs
{
    public dab_controller_stairs(IBlockState modelState)
    {
        super(modelState);
        setUnlocalizedName("dab_controller_stairs");
        setRegistryName("dab_controller_stairs");
        this.useNeighborBrightness = true;
    }
}
