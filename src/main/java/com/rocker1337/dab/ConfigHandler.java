package com.rocker1337.dab;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

/**
 * Created by Rocker545 on 7/31/2016.
 */
public class ConfigHandler {

    public static Configuration config;

    //Settings
    public static boolean chestplateMagnet;
    public static int swordxpmultiplier;

    public static void init(File file)
    {
        if(config == null)
        {
            config = new Configuration(file);
            syncConfig();
        }
    }

    public static void syncConfig()
    {
        try {
            chestplateMagnet = config.getBoolean("Thorium Chestplate Item Magnet", CATEGORY_GENERAL, true, "True to enable magnet");
            swordxpmultiplier = config.getInt("Thorium Sword XP Multiplier", CATEGORY_GENERAL, 2, 1, 2147483647, "This is the XP multiplyer when a player is holding the Thorium Sowrd");
        }
        catch (Exception e)
        {
            System.out.println("CONFIG WAS DESTROYED");
        }
        finally
        {
            if (config.hasChanged()) config.save();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.PostConfigChangedEvent event)
    {
        String test = event.getModID();
        System.out.println("onConfigChangeEvent " + test);
        syncConfig();
    }
}
