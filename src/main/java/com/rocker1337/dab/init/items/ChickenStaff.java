package com.rocker1337.dab.init.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by troth on 10/15/2016.
 */
public class ChickenStaff extends Item
{
    public ChickenStaff()
    {
        setUnlocalizedName("chicken_staff");
        setRegistryName("chichen_staff");
        setMaxDamage(40);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        EntityChicken ec = new EntityChicken(worldIn);
        ec.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0);
        if (!worldIn.isRemote)
        {
            worldIn.spawnEntityInWorld(ec);
        }
        itemStackIn.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add("This item was requested by " + TextFormatting.YELLOW + "Bryan V." + TextFormatting.RESET + " in 2014");
    }
}


