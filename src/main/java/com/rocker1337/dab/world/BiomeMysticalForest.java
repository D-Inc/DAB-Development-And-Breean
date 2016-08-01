package com.rocker1337.dab.world;

import net.minecraft.init.Blocks;

/**
 * Created by ninjawarrior1337 on 7/31/16.
 */
public class BiomeMysticalForest extends net.minecraft.world.biome.Biome
{
    public BiomeMysticalForest(BiomeProperties properties)
    {
        super(properties);
        this.fillerBlock = Blocks.DIRT.getDefaultState();
        this.topBlock = Blocks.GRASS.getDefaultState();
        this.theBiomeDecorator.bigMushroomsPerChunk = 1;
        this.theBiomeDecorator.treesPerChunk = 3;
        this.spawnableCaveCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableMonsterList.clear();
    }
}
