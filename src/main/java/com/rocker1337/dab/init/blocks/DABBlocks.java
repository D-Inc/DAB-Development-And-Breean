package com.rocker1337.dab.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.rocker1337.dab.init.items.DABItems.tabDAB;

public class DABBlocks
{
    public static Block controller2;
    public static Block controller;
    public static Block specialcobblestone;

    public static void init()
    {
        controller2 = new controller2();
        controller = new controller();
        specialcobblestone = new specialcobblestone(Material.ROCK);
    }
    public static void register()
    {
        registerBlock(controller);
        registerBlock(controller2);
        registerBlock(specialcobblestone);
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
        registerRender(controller2);
        registerRender(controller);
        registerRender(specialcobblestone);
    }

    private static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    public static void setCreativeTab()
    {
        controller2.setCreativeTab(tabDAB);
        controller.setCreativeTab(tabDAB);
        specialcobblestone.setCreativeTab(tabDAB);
    }
}
