package com.rocker1337.dab;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Rocker545 on 7/31/2016.
 */
public class ConfigHandler {
    //CONFIG ENTRY VARIABLES
    public static Boolean test;
    public static Boolean chestplatemagnet;

    public void preInit(FMLPreInitializationEvent e)
    {
        //Configuration
        Configuration config = new Configuration(e.getSuggestedConfigurationFile());
        config.load();
        //CONFIG ENTRIES START
        test = config.getBoolean("PUT NAME HERE", Configuration.CATEGORY_GENERAL, true, "PUT DESCRIPTION HERE");
        chestplatemagnet = config.getBoolean("Thorium Chestplate Magnet", Configuration.CATEGORY_GENERAL, true, "True to enable magnet and false to disable");
        //CONFIG ENTRIES END
        config.save();
    }
}
