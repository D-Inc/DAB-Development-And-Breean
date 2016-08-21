package com.rocker1337.dab.init.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;


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
        this.setHardness(1.0F);
        this.setResistance(1000.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.WHITE + "Its Smoothr!");
    }
}
