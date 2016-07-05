package com.rocker1337.dab.init.blocks;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.rocker1337.dab.init.items.DABItems.tabDAB;

public class DABBlocks
{
    public static Block Bell;

    public static void init()
    {
        Bell = new Bell();
    }
    public static void register()
    {
       registerBlock(Bell);
    }

    private static void registerBlock(Block block)
    {
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders()
    {
        registerRender(Bell);
    }

    private static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    public static void setCreativeTab()
    {
        Bell.setCreativeTab(tabDAB);
    }
}
