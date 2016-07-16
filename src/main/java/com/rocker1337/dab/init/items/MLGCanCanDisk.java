package com.rocker1337.dab.init.items;

import com.google.common.collect.Maps;
import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.client.audio.Sound;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.Map;

/**
 * Created by ninjawarrior1337 on 7/15/16.
 */
public class MLGCanCanDisk extends ItemRecord
{
    protected MLGCanCanDisk(String name, SoundEvent soundIn)
    {
        super(name, soundIn);
        setUnlocalizedName(SetItemNames.DABItems.CANCANRECORD.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.CANCANRECORD.getRegistryName());
        this.setMaxStackSize(1);

    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation("dab:"+name);
    }
}

