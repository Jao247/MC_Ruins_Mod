package com.jao247.mod_ruins.block;

public class Block_TinOre extends BlockRWOre
{
	public Block_TinOre()
	{
		super();
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypePiston);
		this.setBlockName("Tin_Ore");
		this.setBlockTextureName("Tin_Ore");
	}
}
