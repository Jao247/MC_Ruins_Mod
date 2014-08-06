package com.jao247.mod_ruins.block;

public class Block_CopperOre extends BlockRWOre
{
	public Block_CopperOre()
	{
		super();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypePiston);
		this.setBlockName("Copper_Ore");
		this.setBlockTextureName("Copper_Ore");
	}
}
