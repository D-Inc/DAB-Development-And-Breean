package com.rocker1337.dab.init.items;

import com.rocker1337.dab.Reference;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

public class DABRecord extends ItemRecord
{
    protected DABRecord(String recordName, SoundEvent soundEvent)
    {
        super(Reference.RESOURCE_PREFIX + recordName, soundEvent);
        setRegistryName("record_" + recordName);
        setUnlocalizedName("record");
    }
}

