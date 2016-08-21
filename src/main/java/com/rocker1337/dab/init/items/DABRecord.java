package com.rocker1337.dab.init.items;

import com.rocker1337.dab.Reference;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class DABRecord extends ItemRecord
{
    public DABRecord(String recordName, SoundEvent soundEvent)
    {
        super(recordName, soundEvent);
        setRegistryName("record_" + recordName);
        setUnlocalizedName("record");
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(Reference.RESOURCE_PREFIX+name);
    }
}

