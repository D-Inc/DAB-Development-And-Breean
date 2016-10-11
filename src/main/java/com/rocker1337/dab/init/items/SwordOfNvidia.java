package com.rocker1337.dab.init.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by ninjawarrior1337 on 9/3/16.
 */
public class SwordOfNvidia extends Item
{
    public SwordOfNvidia(ToolMaterial material)
    {
        super(/*material*/);
        setUnlocalizedName("swordofnvivia");
        setRegistryName("swordofnividia");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        if (attacker.isSneaking())
        {
            target.setHealth(target.getHealth()+4);
        }
        else
        {
            target.setHealth(target.getHealth()-1);
            ((EntityPlayer) target).inventory.armorItemInSlot(0).damageItem(((EntityPlayer) target).inventory.armorItemInSlot(0).getItemDamage()/2, target);
            ((EntityPlayer) target).inventory.armorItemInSlot(1).damageItem(((EntityPlayer) target).inventory.armorItemInSlot(1).getItemDamage()/2, target);
            ((EntityPlayer) target).inventory.armorItemInSlot(2).damageItem(((EntityPlayer) target).inventory.armorItemInSlot(2).getItemDamage()/2, target);
            ((EntityPlayer) target).inventory.armorItemInSlot(3).damageItem(((EntityPlayer) target).inventory.armorItemInSlot(3).getItemDamage()/2, target);
        }
        return true;
    }
}
