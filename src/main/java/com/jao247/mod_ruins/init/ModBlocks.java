package com.jao247.mod_ruins.init;

import com.jao247.mod_ruins.block.BlockRW;
import com.jao247.mod_ruins.block.Block_BEBricks;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	//public static final BlockRW <name> = new <blockClass>;
	public static final BlockRW BEBricks = new Block_BEBricks();

	public static void init()
	{
		//GameRegistry.registerBlock (<name> ,<nameAsString>)
		GameRegistry.registerBlock(BEBricks, "BronzeEdgedBricks");
	}

}
