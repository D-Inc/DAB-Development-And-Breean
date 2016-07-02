package com.rocker1337.dab.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rocker545 on 7/1/2016.
 */
public class FlyingArrow
{
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(LivingEvent.LivingUpdateEvent event)
    {
        event.getEntity();
        if (event.getEntity() instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) event.getEntity();
            ItemStack heldItem = player.getHeldItemMainhand();

            if (heldItem != null && heldItem.getItem() == Items.ARROW)
            {
                player.capabilities.allowFlying = true;
            }
            else
            {
                player.capabilities.allowFlying = player.capabilities.isCreativeMode ? true : false;
            }
        }

    }
}
