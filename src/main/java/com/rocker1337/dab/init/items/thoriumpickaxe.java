package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class thoriumpickaxe extends ItemPickaxe {

    public static float speed = 15F;

    public static Item.ToolMaterial firststage = EnumHelper.addToolMaterial("firststage", 2147483647, -1, speed, 2147483647.0F, 2147483647);

    public thoriumpickaxe() {
        super(firststage);
        this.attackSpeed = 2147483647.0F;
        setUnlocalizedName(SetItemNames.DABItems.THORIUMPICKAXE.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMPICKAXE.getRegistryName());
    }

    @Override
    public boolean hasEffect(ItemStack itemStack) {
        return true;
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getStrVsBlock(stack, state) : speed;
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int metadata, boolean bool)
    {
        if(stack.getTagCompound() == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }

        stack.getTagCompound().setInteger("testInt", 1);

        if(entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)entity;
            stack.getTagCompound().setString("Owner", player.getDisplayNameString());
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.LIGHT_PURPLE + "Speed = " + speed);
    }
}
