package com.rocker1337.dab.events;

import com.rocker1337.dab.helper.ClientKeyHelper;
import com.rocker1337.dab.helper.PacketHandler;
import com.rocker1337.dab.packets.KeyPressPKT;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by drkpa on 8/2/2016.
 */
@SideOnly(Side.CLIENT)
public class KeyPressEvent {
    @SubscribeEvent
    public void keyPress(InputEvent.KeyInputEvent event)
    {
        for (KeyBinding k : ClientKeyHelper.mcToPe.keySet())
        {
            if(k.isPressed())
            {
                PacketHandler.sendToServer(new KeyPressPKT(ClientKeyHelper.mcToPe.get(k)));
            }
        }
    }
}
