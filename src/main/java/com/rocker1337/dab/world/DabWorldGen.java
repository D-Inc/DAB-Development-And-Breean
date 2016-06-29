package com.rocker1337.dab.world;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class DabWorldGen implements IWorldGenerator
{
    private WorldGenerator diamond_block;
    private WorldGenerator nether_gold_block;

    public DabWorldGen()
    {
        this.diamond_block = new WorldGenMinable(Blocks.DIAMOND_BLOCK.getDefaultState(), 2);
        this.nether_gold_block = new WorldGenMinable(Blocks.GOLD_BLOCK.getDefaultState(), 2);
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.getDimension())
        {
            case 0: //Overworld
                this.runGenerator(this.diamond_block, world, random, chunkX, chunkZ, 20, 0, 64);

                break;
            case -1: //Nether
                this.runGenerator(this.nether_gold_block, world, random, chunkX, chunkZ, 20, 0, 64);
                break;
            case 1: //End
                break;
        }
    }
}

