package com.rocker1337.dab.init.TileEntity;

import com.rocker1337.dab.init.blocks.TileController;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ninjawarrior1337 on 1/10/2017.
 */
public class InitTile
{
    public static void init() {
        GameRegistry.registerTileEntity(TileController.class, "TileController");
    }
}
