package com.rocker1337.dab.events;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * This class is useless. Do NOT Edit.
 */
public class LessFlightEvent
{
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(LivingEvent.LivingUpdateEvent event)
    {
        event.getEntity();
        if (event.getEntity() instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) event.getEntity();
            ItemStack heldItem = player.getHeldItemMainhand();

            if (heldItem != null && heldItem.getItem() == DABItems.LessFlight)
            {
                player.capabilities.allowFlying = true;

            }
        }
    }
}
