package com.rocker1337.dab.init.items;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

/**
 * Created by ninjawarrior1337 on 11/9/16 at 3:28 PM.
 */
public class UniversalDABDisc extends ItemRecord
{
    protected UniversalDABDisc(String recordname, SoundEvent soundIn)
    {
        super(recordname, soundIn);
        setUnlocalizedName(recordname);
        setRegistryName(recordname);
        setCreativeTab(DABItems.tabDAB);
    }
}
