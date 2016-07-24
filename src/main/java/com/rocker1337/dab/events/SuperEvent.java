package com.rocker1337.dab.events;

import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import com.rocker1337.dab.init.blocks.DABBlocks;
import com.rocker1337.dab.init.items.DABItems;
import com.rocker1337.dab.init.items.GreatFlight;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
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
    static boolean isCreativeMode;
    static World world;
    static BlockPos BlockPos;

    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(LivingEvent.LivingUpdateEvent event) {
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
            // Disable flight if they don't have Greater or Lesser Flight or EnderFlight ring and if they aren't in creative.
            if (!hasGreatFlight & !hasLessFlight & !hasEnderFlight & !isCreativeMode)
            {
                player.capabilities.isFlying = false;
                player.capabilities.allowFlying = false;
            }

        }
    }
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(BlockEvent.HarvestDropsEvent event)
    {
        if(event.getHarvester() != null);
        {
            world.playSound(BlockPos.getX(), BlockPos.getY(), BlockPos.getZ(), SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);

        }
    }

}
