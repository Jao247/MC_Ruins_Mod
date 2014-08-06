package com.jao247.mod_ruins.init;

import com.jao247.mod_ruins.item.ItemRW;
import com.jao247.mod_ruins.item.Item_BronzeIngot;
import com.jao247.mod_ruins.item.Item_CopperIngot;
import com.jao247.mod_ruins.item.Item_TinIngot;
import com.jao247.mod_ruins.utility.LogHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
	//public static final ItemRW <name> = new <itemClass>;
	public static final ItemRW Bronze_Ingot = new Item_BronzeIngot();
	public static final ItemRW Copper_Ingot = new Item_CopperIngot();
	public static final ItemRW Tin_Ingot = new Item_TinIngot();

	public static void init()
	{
		//GameRegistry.registerItem(<name>,<nameAsString>)

		//Ingots
		GameRegistry.registerItem(Bronze_Ingot, "Bronze_Ingot");
		GameRegistry.registerItem(Copper_Ingot, "Copper_Ingot");
		GameRegistry.registerItem(Tin_Ingot, "Tin_Ingot");

		LogHandler.info("Items Loaded");
		}
}
