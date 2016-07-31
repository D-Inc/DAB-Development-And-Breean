package com.rocker1337.dab.init.items;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
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
    public static Item infinityhelmet;
    public static Item infinitychestplate;
    public static Item infinityleggings;
    public static Item infinityboots;
    public static Item thorium_gem;

    //Tool Materials
    public static Item.ToolMaterial infinitymaterial = EnumHelper.addToolMaterial("infinitymaterial", 2147483647, -1, 2147483647.0F, 2147483647.0F, 2147483647);
    //Armor Materials
    public static ItemArmor.ArmorMaterial InfinityArmor = EnumHelper.addArmorMaterial("InfinityArmor", "dab:infinity", -1, new int[] {7, 7, 7, 7}, 2147483647, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2147483647.0F);

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
        infinityhelmet = new InfinityArmor(SetItemNames.DABItems.INFINITYHELMET.getUnlocalizedName(), SetItemNames.DABItems.INFINITYHELMET.getRegistryName(), DABItems.InfinityArmor, 1, EntityEquipmentSlot.HEAD);
        infinitychestplate = new InfinityArmor(SetItemNames.DABItems.INFINITYCHESTPLATE.getUnlocalizedName(), SetItemNames.DABItems.INFINITYCHESTPLATE.getRegistryName(), DABItems.InfinityArmor, 1, EntityEquipmentSlot.CHEST);
        infinityleggings = new InfinityArmor(SetItemNames.DABItems.INFINITYLEGS.getUnlocalizedName(), SetItemNames.DABItems.INFINITYLEGS.getRegistryName(), DABItems.InfinityArmor, 2, EntityEquipmentSlot.LEGS);
        infinityboots = new InfinityArmor(SetItemNames.DABItems.INFINITYBOOTS.getUnlocalizedName(), SetItemNames.DABItems.INFINITYBOOTS.getRegistryName(), DABItems.InfinityArmor, 1, EntityEquipmentSlot.FEET);
        thorium_gem = new ThoriumGem();
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
        GameRegistry.register(infinityhelmet);
        GameRegistry.register(infinitychestplate);
        GameRegistry.register(infinityleggings);
        GameRegistry.register(infinityboots);
        GameRegistry.register(thorium_gem);

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
        registerRender(infinityhelmet);
        registerRender(infinitychestplate);
        registerRender(infinityleggings);
        registerRender(infinityboots);
        registerRender(thorium_gem);
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
        infinityhelmet.setCreativeTab(tabDAB);
        infinityboots.setCreativeTab(tabDAB);
        infinityleggings.setCreativeTab(tabDAB);
        infinitychestplate.setCreativeTab(tabDAB);
        thorium_gem.setCreativeTab(tabDAB);
    }

    public static final CreativeTabs tabDAB = new CreativeTabs("Development and Breean") {
        @Override
        public Item getTabIconItem()
        {
            return DABItems.weed;
        }
    };
}
