package com.rocker1337.dab.thirdparty;

import com.rocker1337.dab.init.WaliaHandlers.ControllerHandler;
import com.rocker1337.dab.init.blocks.TileController;
import mcp.mobius.waila.api.IWailaRegistrar;

/**
 * Created by ninjawarrior1337 on 1/10/2017.
 */
public class Waila
{
    public static void onWailaCall(IWailaRegistrar registrar)
    {
        registrar.registerBodyProvider(new ControllerHandler(), TileController.class);
    }
}
