package com.rocker1337.dab;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Rocker545 on 7/31/2016.
 */
public class ConfigHandler {

    public static Configuration config;

    //Settings
    public static boolean chestplateMagnet;
    public static int swordxpmultiplier;
    public static boolean test;

    public static void init(File file)
    {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        chestplateMagnet = config.getBoolean("Thorium Chestplate Item Magnet", Configuration.CATEGORY_GENERAL, true, "True to enable magnet");
        swordxpmultiplier = config.getInt("Thorium Sword XP Multiplier", Configuration.CATEGORY_GENERAL, 2, 1, 2147483647, "This is the XP multiplyer when a player is holding the Thorium Sowrd");

        if(config.hasChanged())
        {
            config.save();
        }
    }
}
