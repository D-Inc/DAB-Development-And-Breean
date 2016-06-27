package com.rocker1337.dab.proxy;

import com.rocker1337.dab.init.DABItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        DABItems.init();
        DABItems.register();
    }
    public void init(FMLInitializationEvent e)
    {
        DABItems.setCreativeTab();
    }
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
