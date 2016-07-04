package com.rocker1337.dab.events;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * Created by Rocker545 on 7/3/2016.
 */
public class DisableWeather {

    @SubscribeEvent
    public void onEvent(TickEvent.WorldTickEvent event){

        World world = event.world;
        WorldInfo worldInfo = world.getWorldInfo();
        final GameRules gameRules = world.getGameRules();

        if(gameRules.getBoolean(Gamerules.GameRule.DISABLE_WEATHER)){
            worldInfo.setCleanWeatherTime(1);
            worldInfo.setRaining(false);
            worldInfo.setThundering(false);
        }

    }

}

