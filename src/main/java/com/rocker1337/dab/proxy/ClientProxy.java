package com.rocker1337.dab.proxy;

import api.player.model.ModelPlayerAPI;
import com.rocker1337.dab.events.KeyPressEvent;
import com.rocker1337.dab.helper.ClientKeyHelper;
import com.rocker1337.dab.init.blocks.DABBlocks;
import com.rocker1337.dab.init.entities.derek.EntityDerek;
import com.rocker1337.dab.init.entities.derek.RenderDerek;
import com.rocker1337.dab.init.entities.jenna.EntityJenna;
import com.rocker1337.dab.init.entities.jenna.RenderJenna;
import com.rocker1337.dab.init.entities.platypus.EntityPlatypus;
import com.rocker1337.dab.init.entities.platypus.RenderPlatypus;
import com.rocker1337.dab.init.items.DABItems;
import com.rocker1337.dab.render.dabModelPlayerBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

    //public static KeyBinding increasespeed;
    //public static KeyBinding decreasespeed;

    @Override
    public void preInit(FMLPreInitializationEvent e)
    {
        super.preInit(e);
        RenderingRegistry.registerEntityRenderingHandler(EntityPlatypus.class, RenderPlatypus.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityDerek.class, RenderDerek.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityJenna.class, RenderJenna.FACTORY);
    }

    @Override
    public void init(FMLInitializationEvent e)
    {
        super.init(e);
        DABItems.registerRenders();
        DABBlocks.registerRenders();
        ClientKeyHelper.registerMCBindings();

        ModelPlayerAPI.register("dab", dabModelPlayerBase.class);

        MinecraftForge.EVENT_BUS.register(new KeyPressEvent());
    }

    @Override
    public void postInit(  FMLPostInitializationEvent e)
    {
        super.postInit(e);
    }
}
