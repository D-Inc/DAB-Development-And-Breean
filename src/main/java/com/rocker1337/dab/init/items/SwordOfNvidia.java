package com.rocker1337.dab.init.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by ninjawarrior1337 on 9/3/16.
 */
public class SwordOfNvidia extends ItemSword
{

    public SwordOfNvidia(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("swordofnvivia");
        setRegistryName("swordofnividia");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        if(target instanceof EntityPlayer)
        {
            target.setHealth(21/0);
        }
        return true;
    }
}
