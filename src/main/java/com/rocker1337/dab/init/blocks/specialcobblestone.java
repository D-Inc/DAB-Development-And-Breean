package com.rocker1337.dab.init.blocks;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundTypes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import javax.annotation.Nullable;
import java.util.Random;

public class specialcobblestone extends Block
{
    public specialcobblestone(Material materialIn)
    {
        super(materialIn);
        setUnlocalizedName(SetBlockNames.DABBlocks.specialcobblestone.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.specialcobblestone.getRegistryName());
        this.setHardness(1.5F);
        this.setResistance(30.0F);
        this.setHarvestLevel("pickaxe", 1);
        this.enableStats = true;
        this.setSoundType(RegisterSoundTypes.specialcobblestone);
    }
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Blocks.COBBLESTONE.getItemDropped(Blocks.COBBLESTONE.getDefaultState(), rand, fortune);
    }
}
