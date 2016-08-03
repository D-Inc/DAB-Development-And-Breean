package com.rocker1337.dab.helper;

import com.google.common.collect.ImmutableBiMap;
import com.rocker1337.dab.Reference;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

/**
 * Created by drkpa on 8/2/2016.
 */
@SideOnly(Side.CLIENT)
public class ClientKeyHelper {
    public static ImmutableBiMap<KeyBinding, DABKeybind> mcToPe;
    public static ImmutableBiMap<DABKeybind, KeyBinding> peToMc;

    public static void registerMCBindings()
    {
        ImmutableBiMap.Builder<KeyBinding, DABKeybind> builder = ImmutableBiMap.builder();
        for (DABKeybind k : DABKeybind.values())
        {
            KeyBinding mcK = new KeyBinding(k.keyName, k.defaultKeyCode, Reference.MODID);
            builder.put(mcK, k);
            ClientRegistry.registerKeyBinding(mcK);
        }
        mcToPe = builder.build();
        peToMc = mcToPe.inverse();
    }

    /**
     * Get the key name this DABKeybind is bound to.
     */
    public static String getKeyName(DABKeybind k)
    {
        int keyCode = peToMc.get(k).getKeyCode();
        if (keyCode > Keyboard.getKeyCount() || keyCode < 0)
        {
            return "INVALID KEY";
        }
        return Keyboard.getKeyName(keyCode);
    }

    public static String getKeyName(KeyBinding k)
    {
        int keyCode = k.getKeyCode();
        if (keyCode > Keyboard.getKeyCount() || keyCode < 0)
        {
            return "INVALID KEY";
        }
        return Keyboard.getKeyName(keyCode);
    }
}
