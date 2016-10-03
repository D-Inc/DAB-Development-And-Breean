package com.rocker1337.dab.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by ninjawarrior1337 on 10/3/2016.
 */
public class SamsungS7 extends Item
{
    public SamsungS7()
    {
        setUnlocalizedName("samsungS7");
        setRegistryName("samsungS7");
        setMaxDamage(1);
        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        worldIn.newExplosion(null, playerIn.posX, playerIn.posY, playerIn.posZ, 4, true, true);

        itemStackIn.damageItem(2, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }
}
