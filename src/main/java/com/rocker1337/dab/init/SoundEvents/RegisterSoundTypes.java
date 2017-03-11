package com.rocker1337.dab.init.SoundEvents;

import com.rocker1337.dab.Reference;
import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class RegisterSoundTypes
{
    public static final SoundType specialcobblestone = new SoundType(1.0F, 1.25F, new SoundEvent(new ResourceLocation(Reference.MODID, "specialcobblestone")), SoundEvents.BLOCK_STONE_STEP, SoundEvents.BLOCK_STONE_PLACE, SoundEvents.BLOCK_STONE_HIT, SoundEvents.BLOCK_STONE_FALL);
}

