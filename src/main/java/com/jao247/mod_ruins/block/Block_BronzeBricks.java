package com.jao247.mod_ruins.block;

import net.minecraft.block.material.Material;

public class Block_BronzeBricks extends BlockRW
{
	public Block_BronzeBricks()
	{
		super(Material.anvil);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeAnvil);
		this.setBlockName("Bronze_Bricks");
		this.setBlockTextureName("Bronze_Bricks");
	}
}
