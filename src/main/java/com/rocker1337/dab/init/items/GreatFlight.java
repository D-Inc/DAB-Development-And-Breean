package com.rocker1337.dab.init.items;

import baubles.api.BaubleType;
import baubles.common.container.InventoryBaubles;
import baubles.common.items.ItemRing;
import baubles.common.lib.PlayerHandler;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@Optional.InterfaceList({
        @Optional.Interface(iface = "baubles.common.items.ItemRing", modid = "CoFHLib")})
public class GreatFlight extends ItemRing {
    public GreatFlight() {
        setUnlocalizedName(SetItemNames.DABItems.GREATFLIGHT.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.GREATFLIGHT.getRegistryName());
        this.setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
        toolTip.add(ChatFormatting.DARK_AQUA + "Works anywhere in your inventory!");
        toolTip.add(ChatFormatting.AQUA + "Works in Baubles™");
    }

    @Override
    public BaubleType getBaubleType(ItemStack stack){
        return BaubleType.RING;
    }

    public static ItemStack getGreatRing(EntityPlayer player) {
        InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(player);
        ItemStack stack1 = baubles.getStackInSlot(1);
        ItemStack stack2 = baubles.getStackInSlot(2);
        return isGreatRing(stack1) ? stack1 : isGreatRing(stack2) ? stack2 : null;
    }

    public static boolean isGreatRing(ItemStack stack) {
        return stack != null && (stack.getItem() == DABItems.GreatFlight);
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        if(itemstack.getItemDamage() == 0 && player.ticksExisted % 39 == 0) {
        }

    }
    @Override
    public boolean hasEffect(ItemStack itemStack)
    {
        return false;
    }
}

