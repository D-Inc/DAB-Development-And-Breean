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
    public static boolean test;

    public static void init(File file)
    {
        config = new Configuration(file);
        syncConfig();
    }

    private static void syncConfig() {
        chestplateMagnet = config.getBoolean("Thorium Chestplate Item Magnet", Configuration.CATEGORY_GENERAL, true, "True to enable magnet");
        config.save();
    }
}
