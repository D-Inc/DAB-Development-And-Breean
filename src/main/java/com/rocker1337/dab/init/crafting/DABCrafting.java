package com.rocker1337.dab.init.crafting;

import com.rocker1337.dab.init.blocks.DABBlocks;
import com.rocker1337.dab.init.items.DABItems;
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
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TNT, 64, 0), new Object[]{DABItems.jenna, DABItems.Derek});
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1, 0), 10.0F);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 9, 15), new Object[]{Blocks.field_189880_di});
        GameRegistry.addRecipe(new ItemStack(DABItems.LessFlight), new Object[]{"ddd", "g g", "fgf", 'd', Blocks.DIAMOND_BLOCK, 'g', Blocks.GOLD_BLOCK, 'f', Items.FEATHER});
        GameRegistry.addRecipe(new ItemStack(DABItems.GreatFlight), new Object[]{"ddd", "gng", "fgf", 'd', Blocks.DIAMOND_BLOCK, 'g', Blocks.GOLD_BLOCK, 'f', Items.FEATHER, 'n', Items.NETHER_STAR});
        GameRegistry.addRecipe(new ItemStack(DABBlocks.controller2, 8, 0), new Object[]{"sss", "srs", "sss", 's', new ItemStack(Blocks.STONEBRICK, 1, 0), 'r', Items.REDSTONE});
        GameRegistry.addShapelessRecipe(new ItemStack(DABBlocks.controller, 1, 0), new Object[]{DABBlocks.controller2});
        GameRegistry.addShapelessRecipe(new ItemStack(DABBlocks.controller2, 1, 0), new Object[]{DABBlocks.controller});
        GameRegistry.addShapedRecipe(new ItemStack(DABItems.multitool, 1, 0), new Object[]{"psa", " c ", " g ", 'p', DABItems.thoriumpickaxe, 's', DABItems.thoriumshovel, 'a', DABItems.thoriumaxe, 'c', DABItems.thoriumcore, 'g', DABItems.thorium_gem});
        //Armor Crafting
        GameRegistry.addRecipe(new ItemStack(DABItems.thoriumhelmet), new Object[]{"ttt", "tct", "   ", 't', new ItemStack(DABItems.thorium_gem), 'c', new ItemStack(DABItems.thoriumcore)});
        GameRegistry.addRecipe(new ItemStack(DABItems.thoriumchestplate), new Object[]{"tct", "ttt", "ttt", 't', new ItemStack(DABItems.thorium_gem), 'c', new ItemStack(DABItems.thoriumcore)});
        GameRegistry.addRecipe(new ItemStack(DABItems.thoriumleggings), new Object[]{"ttt", "tct", "t t", 't', new ItemStack(DABItems.thorium_gem), 'c', new ItemStack(DABItems.thoriumcore)});
        GameRegistry.addRecipe(new ItemStack(DABItems.thoriumboots), new Object[]{"   ", "tct", "t t", 't', new ItemStack(DABItems.thorium_gem), 'c', new ItemStack(DABItems.thoriumcore)});
        GameRegistry.addRecipe(new ItemStack(DABItems.samsungs7), new Object[]{"iii", "igi", "iri", 'i', new ItemStack(Items.IRON_INGOT), 'g', new ItemStack(Blocks.GLASS_PANE), 'r', new ItemStack(Items.REDSTONE)});

    }
}
