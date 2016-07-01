package com.rocker1337.dab.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StrengthSword {

    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            EntityPlayer entity = (EntityPlayer) event.getEntity();
             if (entity.inventory.hasItemStack(new ItemStack(Items.DIAMOND_SWORD))) {
                entity.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("strength"), 100, 2));
            }
        }
    }
}
