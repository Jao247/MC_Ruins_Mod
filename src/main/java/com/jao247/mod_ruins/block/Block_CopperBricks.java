package com.jao247.mod_ruins.block;

import net.minecraft.block.material.Material;

public class Block_CopperBricks extends BlockRW
{
	public Block_CopperBricks()
	{
		super(Material.anvil);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeAnvil);
		this.setBlockName("Copper_Bricks");
		this.setBlockTextureName("Copper_Bricks");
	}
}
