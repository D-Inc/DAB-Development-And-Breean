package com.rocker1337.dab.init.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import static com.rocker1337.dab.ConfigHandler.swordxpmultiplier;

/**
 * Created by ninjawarrior1337 on 7/28/16.
 */
public class thoriumsword extends ItemSword
{
    public thoriumsword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName(SetItemNames.DABItems.THORIUMSWORD.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.THORIUMSWORD.getRegistryName());
    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return true;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.AQUA + "The sword multiplies the xp given to you by " + swordxpmultiplier);
    }
}
