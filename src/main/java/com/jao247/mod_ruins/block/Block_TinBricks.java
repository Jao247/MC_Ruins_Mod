package com.jao247.mod_ruins.block;

import net.minecraft.block.material.Material;

public class Block_TinBricks extends BlockRW
{
	public Block_TinBricks()
	{
		super(Material.anvil);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeAnvil);
		this.setBlockName("Tin_Bricks");
		this.setBlockTextureName("Tin_Bricks");
	}
}
