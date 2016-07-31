package com.rocker1337.dab.init.items;

public class SetItemNames
{
    //Items
    public static enum DABItems
    {
        JENNA("jenna", "jenna"),
        DEREK("Derek", "derek"),
        WEED("weed", "weed"),
        LAUSD("LAUSD", "LAUSD"),
        BOBATEA("bobatea", "bobatea"),
        LESSFLIGHT("LessFlight", "LessFlight"),
        GREATFLIGHT("GreatFlight", "GreatFlight"),
        ENDERFLIGHT("EnderFlight", "EnderFlight"),
        HAMMER("Hammer", "Hammer"),
        AIRHORN("airhorn", "airhorn"),
        CANCANRECORD("cancanrecord", "cancanrecord"),
        SADAIRHORN("sadairhorn", "sadairhorn"),
        INFINITYPICKAXE("infinitypickaxe", "infinitypickaxe"),
        INFINITYSWORD("infinitysword", "infinitysword"),
        INFINITYAXE("infinityaxe", "infinityaxe"),
        INFINITYSHOVEL("infinityshovel", "infinityshovel"),
        MULTITOOL("multitool","multitool"),
        INFINITYHELMET("infinity_helmet", "infinity_helmet"),
        INFINITYCHESTPLATE("infinity_chestplate", "infinity_chestplate"),
        INFINITYLEGS("infinity_legs", "infinity_legs"),
        INFINITYBOOTS("infinity_boots", "infinity_boots");


        private String unlocalizedName;
        private String registryName;

        DABItems(String unlocalizedName, String registryName)
        {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getRegistryName()
        {
            return registryName;
        }

        public String getUnlocalizedName()
        {
            return unlocalizedName;
        }

    }
}
