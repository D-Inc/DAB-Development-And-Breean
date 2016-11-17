package com.rocker1337.dab.events;

import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by drkpa on 11/15/2016.
 */
public class TerrainEventHandler {

    @SubscribeEvent(priority = EventPriority.HIGH, receiveCanceled = true)
    public void onDecorateEvent(DecorateBiomeEvent.Decorate event)
    {
        System.out.println("test");
        if(event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS)
        {
            event.setResult(Event.Result.DENY);
        }
    }
}
