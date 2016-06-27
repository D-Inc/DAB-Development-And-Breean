package com.rocker1337.dab.init.crafting;

import com.rocker1337.dab.Reference;
import com.rocker1337.dab.init.DABItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by troth on 6/27/2016.
 */
public class DABCrafting
{
    public static void initCrafting()
    {
        GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(DABItems.weed, 1, 0), 100.0F);
    }
}
