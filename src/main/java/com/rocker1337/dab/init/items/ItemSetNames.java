package com.rocker1337.dab.init.items;

public class ItemSetNames
{
    //Items
    public static enum DABItems
    {
        PUSSY("pussy", "ItemPussy"),
        DEREK("Derek", "ItemDerek"),
        WEED("weed", "FoodWeed"),
        LAUSD("LAUSD", "ItemLAUSD");


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
