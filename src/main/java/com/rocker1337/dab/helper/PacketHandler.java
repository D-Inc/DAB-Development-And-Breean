package com.rocker1337.dab.helper;

import com.rocker1337.dab.packets.KeyPressPKT;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by drkpa on 8/2/2016.
 */
public final class PacketHandler {
    private static final int MAX_PKT_SIZE = 256;
    private static final SimpleNetworkWrapper HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("dab");

    public static void register()
    {
        int disc = 0;
        HANDLER.registerMessage(KeyPressPKT.Handler.class, KeyPressPKT.class, disc++, Side.SERVER);
    }
    /**
     * Sends a packet to the server.<br>
     * Must be called Client side.
     */
    public static void sendToServer(IMessage msg)
    {
        HANDLER.sendToServer(msg);
    }

    /**
     * Sends a packet to all the clients.<br>
     * Must be called Server side.
     */
    public static void sendToAll(IMessage msg)
    {
        HANDLER.sendToAll(msg);
    }

    /**
     * Send a packet to all players around a specific point.<br>
     * Must be called Server side.
     */
    public static void sendToAllAround(IMessage msg, NetworkRegistry.TargetPoint point)
    {
        HANDLER.sendToAllAround(msg, point);
    }

    /**
     * Send a packet to a specific player.<br>
     * Must be called Server side.
     */
    public static void sendTo(IMessage msg, EntityPlayerMP player)
    {
        if (!(player instanceof FakePlayer))
        {
            HANDLER.sendTo(msg, player);
        }
    }

    /**
     * Send a packet to all the players in the specified dimension.<br>
     *  Must be called Server side.
     */
    public static void sendToDimension(IMessage msg, int dimension)
    {
        HANDLER.sendToDimension(msg, dimension);
    }
}
