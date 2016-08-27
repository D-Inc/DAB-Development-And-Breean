package com.rocker1337.dab.events;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by ninjawarrior1337 on 8/25/16.
 */
public class ThoriumEvents
{
    static EntityPlayer player;

    @SubscribeEvent
    public void onEvent(AttackEntityEvent entityEvent)
    {
        if (entityEvent.getEntity() instanceof EntityPlayer)
        {
            player = (EntityPlayer) entityEvent.getEntity();

            if (player.getHeldItemMainhand().getItem() != null && player.getHeldItemMainhand().getItem() == DABItems.thoriumsword)
            {
                entityEvent.getTarget().isDead = true;
            }
        }
    }
}
