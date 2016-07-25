package com.rocker1337.dab.init.blocks;

public class SetBlockNames
{
    public static enum DABBlocks
    {
        controller("dab_controller", "dab_controller"),
        controller2("dab_controller2", "dab_controller2"),
        specialcobblestone("dab_cobblestone", "dab_cobblestone"),
        moving_smiley_request("moving_smiley", "moving_smiley");

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

