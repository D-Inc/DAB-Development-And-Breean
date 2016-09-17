package com.rocker1337.dab;

import com.rocker1337.dab.commands.configreload;
import com.rocker1337.dab.commands.gamemodec;
import com.rocker1337.dab.commands.gamemodes;
import com.rocker1337.dab.helper.PacketHandler;
import com.rocker1337.dab.init.entities.derek.EntityDerek;
import com.rocker1337.dab.init.entities.jenna.EntityJenna;
import com.rocker1337.dab.init.entities.platypus.EntityPlatypus;
import com.rocker1337.dab.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.io.File;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, guiFactory = "com.rocker1337.dab.gui.DABGuiFactory", dependencies = "required-after:Baubles")
public class maindab
{
    @SidedProxy(clientSide="com.rocker1337.dab.proxy.ClientProxy", serverSide="com.rocker1337.dab.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static File configDir;

    public static File getConfigDir()
    {
        return configDir;
    }

    static
    {
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.Instance("dab")
    public static maindab instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        PacketHandler.register();
        proxy.preInit(e);
        configDir = new File(e.getModConfigurationDirectory() + "/" + Reference.MODID);
        configDir.mkdirs();
        ConfigHandler.init(new File(configDir.getPath(), Reference.MODID + ".cfg"));
        //Init Mobs
        EntityRegistry.registerModEntity(EntityPlatypus.class, "platypus", 1, this, 80, 3, true, 1609872, 14180352);
        EntityRegistry.registerModEntity(EntityDerek.class, "derek", 2, this, 80, 3, true, 16777215, 2560771);
        EntityRegistry.registerModEntity(EntityJenna.class, "jenna", 3, this, 80, 3, true, 10170623, 16711935);
        FMLInterModComms.sendRuntimeMessage("dab", "VersionChecker", "addVersionCheck", link)

    }
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        MinecraftForge.EVENT_BUS.register(instance);
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
        event.registerServerCommand(new gamemodec());
        event.registerServerCommand(new gamemodes());
    }
}
