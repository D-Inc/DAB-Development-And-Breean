package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by ninjawarrior1337 on 10/27/16.
 */
public class DABIronOre extends Block
{
    public DABIronOre(Material materialIn)
    {
        super(materialIn);
        setUnlocalizedName("dab_iron_ore");
        setRegistryName("dab_iron_ore");
        setHarvestLevel("pickaxe", 1);
        setHardness(3.0F);
        setResistance(15.0F);
    }
}
