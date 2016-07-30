package com.rocker1337.dab.init.items;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABItems
{
    //Items
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
    public static Item infinitypickaxe;
    public static Item infinitysword;
    public static Item infinityaxe;
    public static Item infinityshovel;
    public static Item multitool;

    //Tool Materials
    public static Item.ToolMaterial infinitymaterial = EnumHelper.addToolMaterial("infinitymaterial", 2147483647, -1, 2147483647.0F, 2147483647.0F, 2147483647);

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
        infinitypickaxe = new infinitypickaxe(DABItems.infinitymaterial);
        infinityaxe = new infinityaxe(DABItems.infinitymaterial, 2147483647.0F, 2147483647.0F);
        infinitysword = new infinitysword(DABItems.infinitymaterial);
        infinityshovel = new infinityshovel(DABItems.infinitymaterial);
        multitool = new multitool(DABItems.infinitymaterial);
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
        GameRegistry.register(infinitypickaxe);
        GameRegistry.register(infinityshovel);
        GameRegistry.register(infinityaxe);
        GameRegistry.register(infinitysword);
        GameRegistry.register(multitool);
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
        registerRender(infinitypickaxe);
        registerRender(infinityaxe);
        registerRender(infinitysword);
        registerRender(infinityshovel);
        registerRender(multitool);
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
        infinitypickaxe.setCreativeTab(tabDAB);
        infinityshovel.setCreativeTab(tabDAB);
        infinityaxe.setCreativeTab(tabDAB);
        infinitysword.setCreativeTab(tabDAB);
    }

    public static final CreativeTabs tabDAB = new CreativeTabs("Development and Breean") {
        @Override
        public Item getTabIconItem()
        {
            return DABItems.weed;
        }
    };
}
