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
        String Tyler = "7ce98ec4-496c-4ab0-968b-280c750f423b";
        String Derek = "35536359-762d-401a-ae4e-b020c0f9756c";
        String Bryan = "f95d14d4-77a2-45f2-963e-bdfe06ce84bb";
        String Jenna = "2a20bf57-fde0-4dec-81bd-1d50ce1059ec";
        String Dylan = "1f573fb3-5ceb-4961-b08b-a45264771c0d";
        String Jaxon = "114f9e56-d7c1-40b2-b75d-34c2f5ab0826";
        String Ethan = "eab0594b-c596-444f-9eaf-6f16837210a9";

        if(event.getEntityPlayer().getUniqueID().toString().equals(Tyler))
        {
            event.setDisplayname(TextFormatting.DARK_AQUA + "ninjawarrior1337" + TextFormatting.GREEN + TextFormatting.BOLD + " The AE God");
        }

        if(event.getEntityPlayer().getUniqueID().toString().equals(Derek))
        {
            event.setDisplayname(TextFormatting.RED + "Rocker545" + TextFormatting.GOLD + TextFormatting.BOLD + " THE GOD");
        }

        if(event.getEntityPlayer().getUniqueID().toString().equals(Bryan))
        {
            event.setDisplayname("Breean_Chan");
        }

        if(event.getEntityPlayer().getUniqueID().toString().equals(Jenna))
        {
            event.setDisplayname(TextFormatting.AQUA + "dank gay memelord " + TextFormatting.LIGHT_PURPLE + TextFormatting.BOLD + "Apriicot");
        }

        if(event.getEntityPlayer().getUniqueID().toString().equals(Dylan))
        {
            event.setDisplayname(TextFormatting.DARK_PURPLE + "LEBRON" + TextFormatting.GOLD + "HUMMUS");
        }

        if(event.getEntityPlayer().getUniqueID().toString().equals(Jaxon))
        {
            event.setDisplayname("JooxonHootchHootch");
        }

        if(event.getEntityPlayer().getUniqueID().toString().equals(Ethan))
        {
            event.setDisplayname("Etan the Sucky BobaTea CEO");
        }

        if(event.getEntityPlayer().getName().contains("Player"))
        {
            event.setDisplayname(TextFormatting.DARK_GRAY + "" + TextFormatting.BOLD + "UNPAID SCROOB");
        }

        if(event.getEntityPlayer().equals("OG_Arist0tle"))
        {
            event.setDisplayname("OG_NotNiceGuyWhoReplacesIronWithSteel :)");
        }
    }

}
