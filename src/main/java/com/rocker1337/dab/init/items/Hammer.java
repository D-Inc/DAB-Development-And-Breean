package com.rocker1337.dab.init.items;

import cofh.api.item.IToolHammer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional;

/**
 * Created by Rocker545 on 7/6/2016.
 */
@Optional.InterfaceList({
        @Optional.Interface(iface = "cofh.api.item.IToolHammer", modid = "CoFHLib")})
public class Hammer extends Item implements IToolHammer {

    public Hammer() {
        setUnlocalizedName(SetItemNames.DABItems.HAMMER.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.HAMMER.getRegistryName());
        setMaxStackSize(1);
    }

    @Override
    @Optional.Method(modid = "CoFHLib")
    public boolean isUsable(ItemStack item, EntityLivingBase user, int x, int y, int z) {
        return true;
    }

    @Override
    @Optional.Method(modid = "CoFHLib")
    public void toolUsed(ItemStack item, EntityLivingBase user, int x, int y, int z) {
    }
}

