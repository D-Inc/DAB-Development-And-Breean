package com.rocker1337.dab.packets;

import com.rocker1337.dab.helper.DABKeybind;
import com.rocker1337.dab.init.items.DABItems;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

/**
 * Created by drkpa on 8/2/2016.
 */
public class KeyPressPKT implements IMessage{
    private DABKeybind key;

    public KeyPressPKT() {}

    public KeyPressPKT(DABKeybind key)
    {
        this.key = key;
    }
    @Override
    public void fromBytes(ByteBuf buf)
    {
        key = DABKeybind.values()[buf.readInt()];
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(key.ordinal());
    }
    public static class Handler implements IMessageHandler<KeyPressPKT, IMessage>
    {
        @Override
        public IMessage onMessage(final KeyPressPKT message, final MessageContext ctx)
        {
            ctx.getServerHandler().playerEntity.mcServer.addScheduledTask(new Runnable() {
                @Override
                public void run() {
                    EntityPlayerMP player = ctx.getServerHandler().playerEntity;
                    ItemStack heldItem = player.getHeldItemMainhand();
                    if (message.key == DABKeybind.INCREASE_SPEED && heldItem.getItem() != null && heldItem.getItem() == DABItems.thoriumpickaxe | heldItem.getItem() == DABItems.multitool) {
                            if (heldItem.getTagCompound().getFloat("Speed") != 2147483640.0F) {
                                float speedy = heldItem.getTagCompound().getFloat("Speed");
                                heldItem.getTagCompound().setFloat("Speed", speedy + 5.0F);
                            }
                        }
                        if (message.key == DABKeybind.DECREASE_SPEED && heldItem.getItem() != null && heldItem.getItem() == DABItems.thoriumpickaxe | heldItem.getItem() == DABItems.multitool) {
                            if (heldItem.getTagCompound().getFloat("Speed") != 15.0F) {
                                float sonic = heldItem.getTagCompound().getFloat("Speed");
                                heldItem.getTagCompound().setFloat("Speed", sonic - 5.0F);
                            }
                        }
                        if (message.key == DABKeybind.RESET_SPEED && heldItem.getItem() != null && heldItem.getItem() == DABItems.thoriumpickaxe | heldItem.getItem() == DABItems.multitool) {
                            if (heldItem.getTagCompound().getFloat("Speed") != 15F) {
                                heldItem.getTagCompound().setFloat("Speed", 15F);
                            }
                        }
                }
            });
            return null;
        }
    }
}
