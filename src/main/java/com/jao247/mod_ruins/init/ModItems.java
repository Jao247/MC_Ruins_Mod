package com.jao247.mod_ruins.init;

import com.jao247.mod_ruins.item.ItemRW;
import com.jao247.mod_ruins.item.Item_Bronze;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	//public static final ItemRW <name> = new <itemClass>;
	public static final ItemRW Bronze = new Item_Bronze();

	public static void init()
	{
		//GameRegistry.registerItem(<name>,<nameAsString>)
		GameRegistry.registerItem(Bronze, "Bronze");
	}
}
