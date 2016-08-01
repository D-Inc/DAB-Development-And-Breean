package com.rocker1337.dab;

import com.rocker1337.dab.commands.configreload;
import com.rocker1337.dab.proxy.CommonProxy;
import com.typesafe.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class maindab
{
    @SidedProxy(clientSide="com.rocker1337.dab.proxy.ClientProxy", serverSide="com.rocker1337.dab.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static File configDir;

    public static File getConfigDir()
    {
        return configDir;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
        configDir = new File(e.getModConfigurationDirectory() + "/" + Reference.MODID);
        configDir.mkdirs();
        ConfigHandler.init(new File(configDir.getPath(), Reference.MODID + ".cfg"));
    }
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new configreload());
    }
}
