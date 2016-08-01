package com.rocker1337.dab.world;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

/**
 * Created by ninjawarrior1337 on 7/31/16.
 */
public class DABBiomeRegistry
{
    public static void MainRegistry()
    {
        initializeBiome();
        registerBiome();
    }

    public static Biome mysticalforest;
    public static final int mysticalforestbiomeid = 40;

    public static void initializeBiome()
    {
        mysticalforest = new BiomeMysticalForest(new Biome.BiomeProperties("mysticalforest").setRainfall(0.0F).setTemperature(0.8F).setRainDisabled().setWaterColor(14745518).setBaseHeight(1.0F).setHeightVariation(1.0F));
        Biome.registerBiome(mysticalforestbiomeid, "Mystical Forest", mysticalforest);
    }
    public static void registerBiome()
    {
        BiomeDictionary.registerBiomeType(mysticalforest, BiomeDictionary.Type.MAGICAL);
        BiomeManager.addSpawnBiome(mysticalforest);
    }
}
