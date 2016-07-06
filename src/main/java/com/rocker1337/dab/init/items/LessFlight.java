package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class LessFlight extends Item
{
    public LessFlight()
    {
        setUnlocalizedName(SetItemNames.DABItems.LESSFLIGHT.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.LESSFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.DARK_PURPLE + "Only lets you fly while holding");
    }
}
