package com.rocker1337.dab.proxy;

import com.rocker1337.dab.events.GreaterFlightEvent;
import com.rocker1337.dab.events.LessFlightEvent;
import com.rocker1337.dab.events.StrengthSword;
import com.rocker1337.dab.init.DABItems;
import com.rocker1337.dab.init.crafting.DABCrafting;
import com.rocker1337.dab.world.DabWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent e)
    {
        System.out.println("Starting Pre Init");
        DABItems.init();
        DABItems.register();
    }
    public void init(FMLInitializationEvent e)
    {
        System.out.println("Starting Init");
        DABItems.setCreativeTab();
        DABCrafting.initCrafting();
        GameRegistry.registerWorldGenerator(new DabWorldGen(), 0);
        MinecraftForge.EVENT_BUS.register(new LessFlightEvent());
        MinecraftForge.EVENT_BUS.register(new StrengthSword());
        MinecraftForge.EVENT_BUS.register(new GreaterFlightEvent());
    }
    public void postInit(FMLPostInitializationEvent e)
    {
        System.out.println("Starting Post Init");
        System.out.println("9+10=21");
    }
}
