package com.rocker1337.dab.events;

import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * Created by ninjawarrior1337 on 7/7/2016.
 */
public class AllowCheats
{
    @SubscribeEvent
    public void onEvent(TickEvent.WorldTickEvent event)
    {

        World world = event.world;
        WorldInfo worldInfo = world.getWorldInfo();
        final GameRules gameRules = world.getGameRules();

        if(gameRules.getBoolean(Gamerules.GameRule.ALLOW_CHEATS))
        {
            worldInfo.setAllowCommands(true);
        }

    }

}

