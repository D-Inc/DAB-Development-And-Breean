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
        if(event.getUsername().contains("Rocker545"))
        {
            event.setDisplayname(TextFormatting.RED + "Rocker545" + TextFormatting.GOLD + TextFormatting.BOLD + " THE GOD");
        }
        if(event.getUsername().contains("ninjawarrior1337"))
        {
            event.setDisplayname(TextFormatting.DARK_AQUA + "ninjawarrior1337" + TextFormatting.GREEN + TextFormatting.BOLD + " The AE God");
        }
        if(event.getUsername().contains("Eric_James"))
        {
            event.setDisplayname("Breean_Chan");
        }
        if(event.getUsername().contains("Apriicot"))
        {
            event.setDisplayname("Apriinot");
        }
        if(event.getUsername().contains("Rocket_D"))
        {
            event.setDisplayname(TextFormatting.DARK_PURPLE + "LEBRON" + TextFormatting.GOLD + "HUMMUS");
        }
        if(event.getUsername().contains("JaxonHH"))
        {
            event.setDisplayname("JooxonHootchHootch");
        }
        if(event.getUsername().contains("etonais"))
        {
            event.setDisplayname("Etan the Sucky BobaTea CEO");
        }
    }

}
