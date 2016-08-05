package com.rocker1337.dab.events;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rocker545 on 8/4/2016.
 */
public class FastFlyBreak
{
    @SubscribeEvent
    public void blockBreakSpeed(PlayerEvent.BreakSpeed event)
    {
        if(!event.getEntityPlayer().onGround && event.getEntityPlayer().capabilities.isFlying)
        {
            float newSpeed = event.getOriginalSpeed() * 5;
            event.setNewSpeed(newSpeed);
        }
    }
}
