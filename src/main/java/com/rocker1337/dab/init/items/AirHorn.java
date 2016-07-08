package com.rocker1337.dab.init.items;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundEvent;

import java.util.Random;

public class AirHorn extends Item
{
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
        worldIn.playSound(playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_BLAZE_DEATH, SoundCategory.PLAYERS, 100.0F, 1.0F, false);

        itemStackIn.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
    }
}
