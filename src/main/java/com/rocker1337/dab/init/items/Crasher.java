package com.rocker1337.dab.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ninjawarrior1337 on 8/25/16.
 */
public class Crasher extends Item
{
    public Crasher()
    {
        setUnlocalizedName("crasher");
        setRegistryName("crasher");
        setMaxDamage(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        itemStackIn.damageItem(1, playerIn);
        if (worldIn.isRemote)
        {
            try
            {
                Thread.currentThread().sleep(1200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            playerIn.inventory.setInventorySlotContents(103, new ItemStack(Blocks.DIAMOND_BLOCK));
            System.out.print(21/0);
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(TextFormatting.AQUA + "Right Click For 1 Free Diamond Block" + TextFormatting.BOLD);
    }
}
