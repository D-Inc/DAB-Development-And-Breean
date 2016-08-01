package com.rocker1337.dab.init.SoundEvents;

import com.rocker1337.dab.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ninjawarrior1337 on 7/8/2016.
 */
public class RegisterSoundEvents
{
    public static SoundEvent airhorn;
    public static SoundEvent records_mlgcancan;
    public static SoundEvent sadairhorn;
    public static SoundEvent specialcobblestone;


    public static void init()
    {
        airhorn = registerSound("airhorn");
        records_mlgcancan = registerSound("mlgcancan");
        sadairhorn = registerSound("sadairhorn");
        specialcobblestone = registerSound("specialcobblestone");
    }


    private static SoundEvent registerSound(String soundName)
    {
        final ResourceLocation soundID = new ResourceLocation(Reference.MODID, soundName);
        return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
    }
}
