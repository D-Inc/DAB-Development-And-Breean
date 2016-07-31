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
        THORIUMPICKAXE("thoriumpickaxe", "thoriumpickaxe"),
        THORIUMSWORD("thoriumsword", "thoriumsword"),
        THORIUMAXE("thoriumaxe", "thoriumaxe"),
        THORIUMSHOVEL("thoriumshovel", "thoriumshovel"),
        MULTITOOL("multitool","multitool"),
        THORIUMHELMET("thorium_helmet", "thorium_helmet"),
        THORIUMCHESTPLATE("thorium_chestplate", "thorium_chestplate"),
        THORIUMLEGS("thorium_legs", "thorium_legs"),
        THORIUMBOOTS("thorium_boots", "thorium_boots");
        THORIUMGEM("thorium_gem", "thorium_gem");


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
