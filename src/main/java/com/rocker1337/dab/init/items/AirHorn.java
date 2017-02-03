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

public class AirHorn extends Item
{
    private long stored;

    private long capacity;

    private long inputRate;

    private long outputRate;

    public AirHorn()
    {
        setUnlocalizedName(SetItemNames.DABItems.AIRHORN.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.AIRHORN.getUnlocalizedName());
        setMaxStackSize(1);
        setMaxDamage(21);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ, RegisterSoundEvents.airhorn, SoundCategory.PLAYERS, 25.0F, 1.0F);

        itemStackIn.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }
}
