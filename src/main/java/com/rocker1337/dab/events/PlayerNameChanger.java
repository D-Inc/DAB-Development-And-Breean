package com.rocker1337.dab.events;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rocker545 on 7/6/2016.
 */
public class PlayerNameChanger {

    @SubscribeEvent
    public void onEvent(PlayerEvent.NameFormat event){
        if(event.getUsername().equals("Rocker545"))
        {
            event.setDisplayname(TextFormatting.RED + "Rocker545" + TextFormatting.GOLD + TextFormatting.BOLD + " THE GOD");
        }
        if(event.getUsername().equals("ninjawarrior1337"))
        {
            event.setDisplayname(TextFormatting.DARK_AQUA + "ninjawarrior1337" + TextFormatting.GREEN + TextFormatting.BOLD + " The AE God");
        }
        if(event.getUsername().equals("Eric_James"))
        {
            event.setDisplayname("Breean_Chan");
        }
        if(event.getUsername().equals("Apriicot"))
        {
            event.setDisplayname("Apriinot");
        }
        if(event.getUsername().equals("Rocket_D"))
        {
            event.setDisplayname(TextFormatting.DARK_PURPLE + "LEBRON" + TextFormatting.GOLD + "HUMMUS");
        }
        if(event.getUsername().equals("JaxonHH"))
        {
            event.setDisplayname("JooxonHootchHootch");
        }
        if(event.getUsername().equals("etonais"))
        {
            event.setDisplayname("Etan the Sucky BobaTea CEO");
        }
        if(event.getUsername().contains("Player")){
            event.setDisplayname(TextFormatting.DARK_GRAY + "" + TextFormatting.BOLD + "UNPAID SCROOB");
        }
    }

}
