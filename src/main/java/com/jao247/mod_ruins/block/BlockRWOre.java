package com.jao247.mod_ruins.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockRWOre extends BlockRW
{
	public BlockRWOre()
	{
		super(Material.rock);
	}

	public Item getItemDropped(){return Item.getItemFromBlock(this);}

	public void dropBlocksAsItem(World world, int int_a, int int_b, int int_c, int int_d, int int_e){super.dropBlockAsItemWithChance(world,int_a,int_b,int_c,int_d,1.0F,int_e);}
}
