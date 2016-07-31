package com.rocker1337.dab.init.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.event.entity.living.LivingHurtEvent;


public class InfinityArmor extends ItemArmor
{
    LivingHurtEvent e;

    public InfinityArmor(String unlocalizedname, String registryname, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedname);
        this.setRegistryName(registryname);
    }
}
