package com.jao247.mod_ruins.creativeTab;

import com.jao247.mod_ruins.init.ModBlocks;
import com.jao247.mod_ruins.init.ModItems;
import com.jao247.mod_ruins.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRW
{
	public static final CreativeTabs RW_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.Bronze;
		}
	};
}
