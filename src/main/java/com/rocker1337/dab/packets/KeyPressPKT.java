package com.rocker1337.dab.packets;

import com.rocker1337.dab.helper.DABKeybind;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.rocker1337.dab.init.items.thoriumpickaxe.speed;

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
                    if(message.key == DABKeybind.INCREASE_SPEED)
                    {
                        System.out.println("Packet was sent.");
                        if(speed == 15F)
                        {
                            speed = 20F;
                            System.out.println(speed);
                        }
                        else if(speed == 20F)
                        {
                            speed = 25F;
                            System.out.println(speed);
                        }
                        else if(speed == 25F)
                        {
                            speed = 30F;
                            System.out.println(speed);
                        }
                    }
                    if(message.key == DABKeybind.DECREASE_SPEED)
                    {
                        System.out.println("Decrease was sent.");
                        if(speed == 20F)
                        {
                            speed = 15F;
                            System.out.println(speed);
                        }
                        else if(speed == 25F)
                        {
                            speed = 20F;
                            System.out.println(speed);
                        }
                        else if(speed == 30F)
                        {
                            speed = 25F;
                            System.out.println(speed);
                        }
                    }
                }
            });
            return null;
        }
    }
}
