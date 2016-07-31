package com.rocker1337.dab.init.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;


public class ThoriumArmor extends ItemArmor
{
    public ThoriumArmor(String unlocalizedname, String registryname, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setUnlocalizedName(unlocalizedname);
        this.setRegistryName(registryname);
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }
}
