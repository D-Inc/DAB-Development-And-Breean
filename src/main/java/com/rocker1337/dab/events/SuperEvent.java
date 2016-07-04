package com.rocker1337.dab.events;

import com.rocker1337.dab.init.DABItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rocker545 on 7/3/2016.
 */
public class SuperEvent {

    static EntityPlayer player;
    static boolean hasLessFlight;
    static boolean hasGreatFlight;

    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(LivingEvent.LivingUpdateEvent event) {
        event.getEntity();
        if (event.getEntity() instanceof EntityPlayer) {
            player = (EntityPlayer) event.getEntity();
            ItemStack heldItem = player.getHeldItemMainhand();
            // LessFlightEvent
            if (heldItem != null && heldItem.getItem() == DABItems.LessFlight) {
                player.capabilities.allowFlying = true;
                hasLessFlight = true;
            } else {
                hasLessFlight = false;
            }

            // GreaterFlightEvent
            if (player.inventory.hasItemStack(new ItemStack(DABItems.GreatFlight))) {
                player.capabilities.allowFlying = true;
                hasGreatFlight = true;
            } else {
                hasGreatFlight = false;
            }
            // Disable flight if they don't have Greater or Lesser Flight ring and if they aren't in creative.
            if (hasGreatFlight == false & hasLessFlight == false & player.capabilities.isCreativeMode == false) {
                player.capabilities.isFlying = false;
                player.capabilities.allowFlying = false;
            }
        }
    }
}
