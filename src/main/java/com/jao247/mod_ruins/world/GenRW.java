package com.jao247.mod_ruins.world;

import com.jao247.mod_ruins.block.BlockRW;
import com.jao247.mod_ruins.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class GenRW implements IWorldGenerator
{
	public int rarity = 0;
	public int maxHeight = 256;
	public BlockRW block;
	public int veinVariance;

	public GenRW(int rarity, int maxHeight, BlockRW block, int veinVariance)
	{
		this.rarity =  rarity;
		this.maxHeight = maxHeight;
		this.block = block;
		this.veinVariance = veinVariance;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
			case -1:
				NetherGen(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				OWorldGen(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				EndGen(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}

	private void NetherGen(World world, Random random, int x, int z)
	{
	}

	private void OWorldGen(World world, Random random, int x, int z)
	{
		if (maxHeight > 256) maxHeight = 256;

		for (int i = 0; i < rarity; i++) // for Limit = Rarity
		{
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(maxHeight);
			int chunkZ = z + random.nextInt(16);

			(new WorldGenMinable(block, veinVariance)).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

	private void EndGen(World world, Random random, int x, int z)
	{
	}
}
