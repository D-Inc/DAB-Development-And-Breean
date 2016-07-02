package com.rocker1337.dab;


import com.rocker1337.dab.events.FlyingArrow;
import com.rocker1337.dab.events.StrengthSword;
import com.rocker1337.dab.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class maindab
{

    @SidedProxy(clientSide="com.rocker1337.dab.proxy.ClientProxy", serverSide="com.rocker1337.dab.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        System.out.println("Starting Pre Init");
        proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        MinecraftForge.EVENT_BUS.register(new FlyingArrow());
        MinecraftForge.EVENT_BUS.register(new StrengthSword());
        System.out.println("Starting Init");
        proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        System.out.println("Starting Post Init");
        System.out.println("9+10=21");
        proxy.postInit(e);
    }
}
