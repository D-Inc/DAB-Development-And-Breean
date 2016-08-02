package com.rocker1337.dab.events;

import com.rocker1337.dab.Reference;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.rocker1337.dab.ConfigHandler.syncConfig;

public class ConfigChangeEvent
{
    @SubscribeEvent(priority = EventPriority.HIGH, receiveCanceled = true)
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(Reference.MODID))
        {
            syncConfig();
        }
    }
}
