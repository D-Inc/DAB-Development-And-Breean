package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import static com.rocker1337.dab.ConfigHandler.swordxpmultiplier;

public class thoriumsword extends ItemSword
{
    private final float attackDamage;
    private final float attackSpeed;

    public thoriumsword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.THORIUMSWORD.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMSWORD.getRegistryName());
        this.attackDamage = material.getDamageVsEntity();
        this.attackSpeed = material.getEfficiencyOnProperMaterial();
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }

    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.WEB)
        {
            return Float.intBitsToFloat(0x7f800000);
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.AQUA + "The sword multiplies the xp given to you by " + swordxpmultiplier);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase victim, EntityLivingBase player)
    {
        if (victim instanceof EntityPlayer)
        {
            boolean isVictimCreative = ((EntityPlayer) victim).capabilities.isCreativeMode;
            if(isVictimCreative)
            {
                victim.setDead();
            }
        }
        else
        victim.setHealth(0);
        return true;
    }
}
