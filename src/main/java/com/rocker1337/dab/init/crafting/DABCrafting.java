package com.rocker1337.dab.init.crafting;

import com.rocker1337.dab.init.DABItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABCrafting
{
    public static void initCrafting()
    {
        GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(DABItems.weed, 1, 0), 1000.0F);
        GameRegistry.addRecipe(new ItemStack(Blocks.LADDER, 4, 0), new Object[]{"W W","WWW","W W", 'W', new ItemStack(DABItems.weed, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TNT, 64, 0), new Object[]{DABItems.pussy, DABItems.Derek});
        GameRegistry.addSmelting(Items.LEATHER, new ItemStack(Items.ROTTEN_FLESH, 1, 0), 1000.0F);
    }
}
