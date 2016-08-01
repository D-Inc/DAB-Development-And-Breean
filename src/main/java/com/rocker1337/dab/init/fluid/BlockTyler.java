package com.rocker1337.dab.init.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Created by ninjawarrior1337 on 8/1/16.
 */
public class BlockTyler extends BlockFluidClassic
{
    public static final String name = "tyler_fluid";
    public static final BlockTyler instance = new BlockTyler();

    public BlockTyler()
    {
        super(tylerfluid.instance, Material.WATER);
        setUnlocalizedName(name);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
}
