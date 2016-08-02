package com.rocker1337.dab.gui;

import com.rocker1337.dab.ConfigHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;


public class ConfigGUI extends GuiConfig
{
    public ConfigGUI(GuiScreen parentScreen)
    {
        super(parentScreen, new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), "dab", false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}