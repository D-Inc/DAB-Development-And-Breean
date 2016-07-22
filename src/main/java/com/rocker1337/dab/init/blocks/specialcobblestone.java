package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ActionResult;
import net.minecraftforge.event.world.BlockEvent;

/**
 * Created by ninjawarrior1337 on 7/22/16.
 */
public class specialcobblestone extends Block
{
    public specialcobblestone(Material materialIn)
    {
        super(materialIn);
        this.blockHardness = 1.0F;
    }
}
