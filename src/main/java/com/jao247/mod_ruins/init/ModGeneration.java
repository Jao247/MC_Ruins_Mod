package com.jao247.mod_ruins.init;

import com.jao247.mod_ruins.block.ore.Block_CopperOre;
import com.jao247.mod_ruins.block.ore.Block_TinOre;
import com.jao247.mod_ruins.world.GenRW;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModGeneration
{
	public static final GenRW CopperGen = new GenRW(12, 100, ModBlocks.Copper_Ore, 4);
	public static final GenRW TinGen = new GenRW(10, 75, ModBlocks.Tin_Ore, 7);

	public static void init()
	{
		GameRegistry.registerWorldGenerator(CopperGen, 2);
		GameRegistry.registerWorldGenerator(TinGen, 2);
	}
}
