package com.rocker1337.dab.init.items;

public class ItemSetNames
{
    //Items
    public static enum DABItems
    {
        PUSSY("pussy", "pussy"),
        DEREK("Derek", "derek"),
        WEED("weed", "weed"),
        LAUSD("LAUSD", "LAUSD"),
        BOBATEA("bobatea", "bobatea"),
        LESSFLIGHT("lessflight", "lessflight"),
        GREATFLIGHT("greatflight", "greatflight");


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
