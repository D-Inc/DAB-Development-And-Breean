package com.rocker1337.dab.events;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.rocker1337.dab.ConfigHandler.syncConfig;

/**
 * Created by drkpa on 8/1/2016.
 */
public class ConfigChanged {
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        System.out.println("onConfigChanged doesnt work");
        if(event.getModID().equals("dab"))
        {
            syncConfig();
            System.out.println("It Works!");
        }
    }

}
