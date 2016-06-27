package com.rocker1337.dab.init;

import com.rocker1337.dab.Reference;
import com.rocker1337.dab.init.items.ItemPussy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABItems
{

    public static Item pussy;


    public static void init()
    {
        pussy = new ItemPussy();
    }

    public static void register()
    {
        GameRegistry.register(pussy);
    }

    public static void registerRenders()
    {
        registerRender(pussy);
    }

    private static void  registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void setCreativeTab()
    {
        pussy.setCreativeTab(tabDAB);
    }

    public static final CreativeTabs tabDAB = new CreativeTabs("Development and Breean") {
        @Override
        public Item getTabIconItem()
        {
            return DABItems.pussy;
        }
    };
}
