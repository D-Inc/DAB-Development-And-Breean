package com.rocker1337.dab;

/**
 * Created by troth on 6/27/2016.
 */
public class Reference
{
    public static final String MODID = "dab";
    public static final String MODNAME = "DAB (Development and Breean)";
    public static final String VERSION = "0.1";
    
    //Items
    public static enum DABItems
    {
        PUSSY("pussy", "ItemPussy"),
        WEED("weed", "ItemWeed");


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
