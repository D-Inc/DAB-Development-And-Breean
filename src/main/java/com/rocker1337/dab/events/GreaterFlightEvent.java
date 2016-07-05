package com.rocker1337.dab.events;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * This class is useless. Do NOT Edit.
 */
public class GreaterFlightEvent
{
    @SubscribeEvent
    public void onEvent(LivingEvent.LivingUpdateEvent event)
    {
        if (event.getEntity() instanceof EntityPlayer)
        {
            EntityPlayer entity = (EntityPlayer) event.getEntity();
            if (entity.inventory.hasItemStack(new ItemStack(DABItems.GreatFlight)))
            {
                entity.capabilities.allowFlying = true;
            }
            else
            {
                entity.capabilities.isFlying = false;
                entity.capabilities.allowFlying = false;

            }
        }
    }
}