package com.rocker1337.dab.init.blocks;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleBlockDust;
import net.minecraft.client.particle.ParticleSimpleAnimated;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.event.world.BlockEvent;

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
    }
}
