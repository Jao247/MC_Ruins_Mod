package com.jao247.mod_ruins.init;

import com.jao247.mod_ruins.block.*;
import com.jao247.mod_ruins.utility.LogHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	//public static final BlockRW <name> = new <blockClass>;
	public static final BlockRW BEBricks = new Block_BEBricks();
	public static final BlockRW Copper_Ore = new Block_CopperOre();
	public static final BlockRW Tin_Ore = new Block_TinOre();

	public static void init()
	{
		//GameRegistry.registerBlock (<name> ,<nameAsString>)
		GameRegistry.registerBlock(BEBricks, "Bronze_Edged_Bricks");

		//Ores
		GameRegistry.registerBlock(Copper_Ore, "Copper_Ore");
		GameRegistry.registerBlock(Tin_Ore, "Tin_Ore");

		LogHandler.info("Blocks Loaded");
	}

}
