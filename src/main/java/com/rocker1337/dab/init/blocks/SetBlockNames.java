package com.rocker1337.dab.init.blocks;

public class SetBlockNames
{
    public static enum DABBlocks
    {
        controller("controller", "controller");

        private String unlocalizedName;
        private String registryName;

        DABBlocks(String unlocalizedName, String registryName)
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

