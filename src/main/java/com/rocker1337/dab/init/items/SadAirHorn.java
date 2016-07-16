package com.rocker1337.dab.init.items;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class SadAirHorn extends Item
{
    public SadAirHorn()
    {
        setUnlocalizedName(SetItemNames.DABItems.SADAIRHORN.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.SADAIRHORN.getUnlocalizedName());
        setMaxStackSize(1);
        setMaxDamage(21);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, RegisterSoundEvents.sadairhorn, SoundCategory.PLAYERS, 25.0F, 1.0F);

        itemStackIn.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }
}
