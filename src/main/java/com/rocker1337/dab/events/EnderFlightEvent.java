package com.rocker1337.dab.events;

import com.rocker1337.dab.init.DABItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EnderFlightEvent
{
        @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
        public void onEvent(LivingEvent.LivingUpdateEvent event)
        {
            event.getEntity();
            if (event.getEntity() instanceof EntityPlayer)
            {
                EntityPlayer entity = (EntityPlayer) event.getEntity();
                if (entity.getInventoryEnderChest().getStackInSlot(0) == new ItemStack(DABItems.EnderFlight, 1, 0))
                {
                    entity.capabilities.allowFlying = true;
                }
            }
        }
}
