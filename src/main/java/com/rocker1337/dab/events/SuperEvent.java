package com.rocker1337.dab.events;

import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import com.rocker1337.dab.init.blocks.DABBlocks;
import com.rocker1337.dab.init.items.DABItems;
import com.rocker1337.dab.init.items.GreatFlight;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.rocker1337.dab.init.items.GreatFlight.getGreatRing;
import static com.rocker1337.dab.init.items.GreatFlight.isGreatRing;

/**
 * Created by Rocker545 on 7/3/2016.
 */
public class SuperEvent {

    static EntityPlayer player;
    static boolean hasLessFlight;
    static boolean hasGreatFlight;
    static boolean hasEnderFlight;
    static boolean hasThoriumFlight;
    static boolean isCreativeMode;
    static World worldIn;

    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(LivingEvent.LivingUpdateEvent event)
    {
        event.getEntity();
        if (event.getEntity() instanceof EntityPlayer) {
            player = (EntityPlayer) event.getEntity();
            isCreativeMode = player.capabilities.isCreativeMode;
            ItemStack heldItem = player.getHeldItemMainhand();
            // LessFlightEvent
            if (heldItem != null && heldItem.getItem() == DABItems.LessFlight) {
                player.capabilities.allowFlying = true;
                hasLessFlight = true;
            } else {
                hasLessFlight = false;
            }

            // GreaterFlightEvent
            if (getGreatRing(player) != null | player.inventory.hasItemStack(new ItemStack(DABItems.GreatFlight))) {
                player.capabilities.allowFlying = true;
                hasGreatFlight = true;
            } else {
                hasGreatFlight = false;
            }
            // EnderFlightEvent
            if (player.getInventoryEnderChest().getStackInSlot(0) != null && player.getInventoryEnderChest().getStackInSlot(0).getItem() == DABItems.EnderFlight)
            {
                player.capabilities.allowFlying = true;
                hasEnderFlight = true;
            }
            else
            {
                hasEnderFlight = false;
            }
            if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == DABItems.thoriumhelmet && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == DABItems.thoriumchestplate && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == DABItems.thoriumleggings && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == DABItems.thoriumboots)
            {
                player.capabilities.allowFlying = true;
                hasThoriumFlight = true;
            }
            else
            {
                hasThoriumFlight = false;
            }
            if(player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == DABItems.thoriumhelmet)
            {
                player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("night_vision"), 25, 1));
            }
            // Disable flight if they don't have Greater or Lesser Flight or EnderFlight ring and if they aren't in creative.
            if (!hasGreatFlight & !hasLessFlight & !hasEnderFlight & !hasThoriumFlight & !isCreativeMode)
            {
                player.capabilities.isFlying = false;
                player.capabilities.allowFlying = false;
            }

        }
    }
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEntityGetHurt(LivingHurtEvent e)
    {
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == DABItems.thoriumhelmet && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == DABItems.thoriumchestplate && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == DABItems.thoriumleggings && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == DABItems.thoriumboots)
        {
            if (e.getEntity() instanceof EntityPlayer)
            {
                e.setCanceled(true);
            }
        }
    }
}
