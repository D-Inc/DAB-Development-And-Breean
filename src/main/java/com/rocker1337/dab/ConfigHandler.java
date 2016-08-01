package com.rocker1337.dab;

import net.minecraftforge.common.config.Configuration;

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
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        System.out.println("syncConfig has ran.");
        chestplateMagnet = config.getBoolean("Thorium Chestplate Item Magnet", CATEGORY_GENERAL, true, "True to enable magnet");
        swordxpmultiplier = config.getInt("Thorium Sword XP Multiplier", CATEGORY_GENERAL, 2, 1, 2147483647, "This is the XP multiplyer when a player is holding the Thorium Sowrd");
        config.save();
        //boolean configChanged = config.hasChanged();
        //System.out.println(configChanged);
        //if(configChanged)
        //{
         //   config.save();
        //}
    }
}
