package com.rocker1337.dab.events;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rocker545 on 7/6/2016.
 */
public class PlayerNameChanger {

    @SubscribeEvent
    public void onEvent(PlayerEvent.NameFormat event){
        if(event.getUsername().contains("Rocker545")){
            event.setDisplayname(TextFormatting.RED + "Rocker545" + TextFormatting.GOLD + TextFormatting.BOLD + " THE GOD");
        }

    }
}
