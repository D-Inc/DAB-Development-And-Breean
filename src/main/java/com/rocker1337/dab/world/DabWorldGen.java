package com.rocker1337.dab.world;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Rocker545 on 7/1/2016.
 */
public class DabWorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimension())
        {
            case 0: //Overworld Dimension
                this.runGenerator(diamondGenerator, world, random, chunkX, chunkZ, 3, 0, 30);
                break;
            case 1: //End Dimension

                break;
            case -1: //Nether
                this.runGenerator(netherGoldGenerator, world, random, chunkX, chunkZ, 60, 0, 120);
                break;
        }

    }

    public WorldGenerator diamondGenerator;
    public WorldGenerator netherGoldGenerator;

    public DabWorldGen()
    {
        diamondGenerator = new WorldGenMinable(Blocks.DIAMOND_BLOCK.getDefaultState(), 4);
        netherGoldGenerator = new WorldGenMinable(Blocks.GOLD_BLOCK.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));

    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
    {
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

}
