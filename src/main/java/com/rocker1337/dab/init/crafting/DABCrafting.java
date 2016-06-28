package com.rocker1337.dab.init.crafting;

import com.rocker1337.dab.init.DABItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABCrafting
{
    public static void initCrafting()
    {
        GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(DABItems.weed, 1, 0), 1000.0F);

    }
}
