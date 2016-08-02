package com.rocker1337.dab.proxy;

import com.rocker1337.dab.init.blocks.DABBlocks;
import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy
{

    public static KeyBinding[] keyBindings;

    @Override
    public void preInit(FMLPreInitializationEvent e)
    {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e)
    {
        super.init(e);
        DABItems.registerRenders();
        DABBlocks.registerRenders();

        keyBindings = new KeyBinding[1];
        keyBindings[0] = new KeyBinding("key.thoriumtoolspeed.desc", Keyboard.KEY_V, "key.dab.category");
        keyBindings[1] = new KeyBinding("key.decreasetoolspeed.desc", Keyboard.KEY_B, "key.dab.category");
        for (int i = 0; i < keyBindings.length; ++i)
        {
            ClientRegistry.registerKeyBinding(keyBindings[i]);
        }
    }

    @Override
    public void postInit(  FMLPostInitializationEvent e)
    {
        super.postInit(e);
    }
}
