package com.rocker1337.dab.init;

import com.rocker1337.dab.init.items.ItemDerek;
import com.rocker1337.dab.init.items.ItemLAUSD;
import com.rocker1337.dab.init.items.ItemPussy;
import com.rocker1337.dab.init.items.FoodWeed;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABItems
{

    public static Item pussy;
    public static Item weed;
    public static Item Derek;
    public static Item LAUSD;


    public static void init()
    {
        pussy = new ItemPussy();
        weed = new FoodWeed(1, 0.3F, true).setAlwaysEdible().setMaxStackSize(16);
        Derek = new ItemDerek();
        LAUSD = new ItemLAUSD().setMaxStackSize(1).setMaxDamage(21);
    }

    public static void register()
    {
        GameRegistry.register(pussy);
        GameRegistry.register(weed);
        GameRegistry.register(Derek);
        GameRegistry.register(LAUSD);
    }

    public static void registerRenders()
    {
        registerRender(pussy);
        registerRender(weed);
        registerRender(Derek);
        registerRender(LAUSD);
    }

    private static void  registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void setCreativeTab()
    {
        pussy.setCreativeTab(tabDAB);
        weed.setCreativeTab(tabDAB);
        Derek.setCreativeTab(tabDAB);
        LAUSD.setCreativeTab(tabDAB);
    }

    public static final CreativeTabs tabDAB = new CreativeTabs("Development and Breean") {
        @Override
        public Item getTabIconItem()
        {
            return DABItems.weed;
        }
    };
}
