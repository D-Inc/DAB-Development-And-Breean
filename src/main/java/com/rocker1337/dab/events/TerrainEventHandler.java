package com.rocker1337.dab.events;

import com.rocker1337.dab.ConfigHandler;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

/**
 * Created by drkpa on 11/15/2016.
 */
public class TerrainEventHandler
{
    public static boolean getRandomTreeBoolean()
    {
        return Math.random() < ConfigHandler.treeSpawnPercentage/100;
    }

    public static boolean getRandomFlowerBoolean()
    {
        return Math.random() < ConfigHandler.flowerSpawnPercentage/100;
    }

    public static boolean getRandomGrassBoolean()
    {
        return Math.random() < ConfigHandler.grassSpawnPercentage/100;
    }

    @SubscribeEvent(receiveCanceled = true)
    public void onDecorateEvent(DecorateBiomeEvent.Decorate event)
    {

//        if(event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS && !ConfigHandler.noTallGrass)
//        {
//            event.setResult(Event.Result.DENY);
//        }
//        if(event.getType() == DecorateBiomeEvent.Decorate.EventType.FLOWERS && !ConfigHandler.noFlowers)
//        {
//            event.setResult(Event.Result.DENY);
//        }
//        if (event.getType() == DecorateBiomeEvent.Decorate.EventType.TREE && !ConfigHandler.noTrees)
//        {
//            event.setResult(Event.Result.DENY);
//        }

        if(event.getType() == DecorateBiomeEvent.Decorate.EventType.GRASS && !getRandomGrassBoolean())
        {
            event.setResult(Event.Result.DENY);
        }
        if(event.getType() == DecorateBiomeEvent.Decorate.EventType.FLOWERS && !getRandomFlowerBoolean())
        {
            event.setResult(Event.Result.DENY);
        }
        if (event.getType() == DecorateBiomeEvent.Decorate.EventType.TREE && !getRandomTreeBoolean())
        {
            event.setResult(Event.Result.DENY);
        }
    }
}
