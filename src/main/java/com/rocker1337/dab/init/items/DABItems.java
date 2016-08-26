package com.rocker1337.dab.init.items;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
    public static DABRecord mlgcancan;
    public static Item SadAirHorn;
    public static Item thoriumpickaxe;
    public static Item thoriumsword;
    public static Item thoriumaxe;
    public static Item thoriumshovel;
    public static Item multitool;
    public static Item thoriumhelmet;
    public static Item thoriumchestplate;
    public static Item thoriumleggings;
    public static Item thoriumboots;
    public static Item thorium_gem;
    public static Item thoriumcore;
    public static Item crasher;

    //Tool Materials
    public static Item.ToolMaterial thoriummaterial = EnumHelper.addToolMaterial("thoriummaterial", 2147483647, -1, Float.intBitsToFloat(0x7f800000), Float.intBitsToFloat(0x7f800000), 2147483647);
    //Armor Materials
    public static ItemArmor.ArmorMaterial ThoriumArmor = EnumHelper.addArmorMaterial("ThoriumArmor", "dab:thorium", -1, new int[] {7, 7, 7, 7}, 2147483647, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Float.intBitsToFloat(0x7f800000));

    public void isThorium()
    {

    }

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
        mlgcancan = new DABRecord("mlgcancan", RegisterSoundEvents.records_mlgcancan);
        SadAirHorn = new SadAirHorn();
        thoriumpickaxe = new thoriumpickaxe();
        thoriumaxe = new thoriumaxe(DABItems.thoriummaterial, Float.intBitsToFloat(0x7f800000), Float.intBitsToFloat(0x7f800000));
        thoriumsword = new thoriumsword(DABItems.thoriummaterial);
        thoriumshovel = new thoriumshovel(DABItems.thoriummaterial);
        multitool = new multitool();
        thoriumhelmet = new ThoriumArmor(SetItemNames.DABItems.THORIUMHELMET.getUnlocalizedName(), SetItemNames.DABItems.THORIUMHELMET.getRegistryName(), DABItems.ThoriumArmor, 1, EntityEquipmentSlot.HEAD);
        thoriumchestplate = new ThoriumArmor(SetItemNames.DABItems.THORIUMCHESTPLATE.getUnlocalizedName(), SetItemNames.DABItems.THORIUMCHESTPLATE.getRegistryName(), DABItems.ThoriumArmor, 1, EntityEquipmentSlot.CHEST);
        thoriumleggings = new ThoriumArmor(SetItemNames.DABItems.THORIUMLEGS.getUnlocalizedName(), SetItemNames.DABItems.THORIUMLEGS.getRegistryName(), DABItems.ThoriumArmor, 2, EntityEquipmentSlot.LEGS);
        thoriumboots = new ThoriumArmor(SetItemNames.DABItems.THORIUMBOOTS.getUnlocalizedName(), SetItemNames.DABItems.THORIUMBOOTS.getRegistryName(), DABItems.ThoriumArmor, 1, EntityEquipmentSlot.FEET);
        thorium_gem = new ThoriumGem();
        thoriumcore = new ThoriumCore();
        crasher = new Crasher();
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
        GameRegistry.register(thoriumpickaxe);
        GameRegistry.register(thoriumshovel);
        GameRegistry.register(thoriumaxe);
        GameRegistry.register(thoriumsword);
        GameRegistry.register(multitool);
        GameRegistry.register(thoriumhelmet);
        GameRegistry.register(thoriumchestplate);
        GameRegistry.register(thoriumleggings);
        GameRegistry.register(thoriumboots);
        GameRegistry.register(thorium_gem);
        GameRegistry.register(thoriumcore);
        GameRegistry.register(crasher);

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
        registerRender(thoriumpickaxe);
        registerRender(thoriumaxe);
        registerRender(thoriumsword);
        registerRender(thoriumshovel);
        registerRender(multitool);
        registerRender(thoriumhelmet);
        registerRender(thoriumchestplate);
        registerRender(thoriumleggings);
        registerRender(thoriumboots);
        registerRender(thorium_gem);
        registerRender(thoriumcore);
        registerRender(crasher);
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
        thoriumpickaxe.setCreativeTab(tabDAB);
        thoriumshovel.setCreativeTab(tabDAB);
        thoriumaxe.setCreativeTab(tabDAB);
        thoriumsword.setCreativeTab(tabDAB);
        thoriumhelmet.setCreativeTab(tabDAB);
        thoriumboots.setCreativeTab(tabDAB);
        thoriumleggings.setCreativeTab(tabDAB);
        thoriumchestplate.setCreativeTab(tabDAB);
        thorium_gem.setCreativeTab(tabDAB);
        thoriumcore.setCreativeTab(tabDAB);
        crasher.setCreativeTab(tabDAB);
    }

    public static final CreativeTabs tabDAB = new CreativeTabs("Development and Breean") {
        @Override
        public Item getTabIconItem()
        {
            return DABItems.weed;
        }
    };
}
