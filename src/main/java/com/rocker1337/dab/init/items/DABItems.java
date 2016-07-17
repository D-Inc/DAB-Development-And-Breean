package com.rocker1337.dab.init.items;

import com.rocker1337.dab.Reference;
import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABItems
{

    public static Item jenna;
    public static Item weed;
    public static Item Derek;
    public static Item LAUSD;
    public static Item bobatea;
    public static Item LessFlight;
    public static Item GreatFlight;
    public static Item EnderFlight;
    public static Item Hammer;
    public static Item AirHorn;
    public static Item mlgcancan;
    public static Item SadAirHorn;


    public static void init()
    {
        jenna = new jenna();
        weed = new weed(1, 0.3F, true).setFull3D();
        Derek = new derek();
        LAUSD = new LAUSD().setFull3D();
        bobatea = new bobatea(20, 5.0F, true);
        LessFlight = new LessFlight();
        GreatFlight = new GreatFlight();
        EnderFlight = new EnderFlight();
        Hammer = new Hammer();
        AirHorn = new AirHorn();
        mlgcancan = new MLGCanCanDisk("mlgcancan", RegisterSoundEvents.records_mlgcancan);
        SadAirHorn = new SadAirHorn();
    }

    public static void register()
    {
        GameRegistry.register(jenna);
        GameRegistry.register(weed);
        GameRegistry.register(Derek);
        GameRegistry.register(LAUSD);
        GameRegistry.register(bobatea);
        GameRegistry.register(LessFlight);
        GameRegistry.register(GreatFlight);
        GameRegistry.register(EnderFlight);
        GameRegistry.register(Hammer);
        GameRegistry.register(AirHorn);
        GameRegistry.register(mlgcancan);
        GameRegistry.register(SadAirHorn);
    }

    public static void registerRenders()
    {
        registerRender(weed);
        registerRender(jenna);
        registerRender(Derek);
        registerRender(LAUSD);
        registerRender(bobatea);
        registerRender(LessFlight);
        registerRender(GreatFlight);
        registerRender(EnderFlight);
        registerRender(Hammer);
        registerRender(AirHorn);
        registerRender(mlgcancan);
        registerRender(SadAirHorn);
    }

    private static void  registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void setCreativeTab()
    {
        weed.setCreativeTab(tabDAB);
        jenna.setCreativeTab(tabDAB);
        Derek.setCreativeTab(tabDAB);
        LAUSD.setCreativeTab(tabDAB);
        bobatea.setCreativeTab(tabDAB);
        LessFlight.setCreativeTab(tabDAB);
        GreatFlight.setCreativeTab(tabDAB);
        EnderFlight.setCreativeTab(tabDAB);
        Hammer.setCreativeTab(tabDAB);
        AirHorn.setCreativeTab(tabDAB);
        mlgcancan.setCreativeTab(tabDAB);
        SadAirHorn.setCreativeTab(tabDAB);
    }

    public static final CreativeTabs tabDAB = new CreativeTabs("Development and Breean") {
        @Override
        public Item getTabIconItem()
        {
            return DABItems.weed;
        }
    };
}
