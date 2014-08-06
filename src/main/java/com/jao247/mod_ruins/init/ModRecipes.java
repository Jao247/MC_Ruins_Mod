package com.jao247.mod_ruins.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import com.jao247.mod_ruins.utility.LogHandler;

public class ModRecipes
{

	public static void init()
	{
		//Shaped Recipes
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.Bronze_Ingot, 4), new Object[]{"XX ", "XB ", 'X', ModItems.Copper_Ingot, 'B', ModItems.Tin_Ingot});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.BEBricks, 4), new Object[]{"IBI", "BBB", "IBI", 'I', ModItems.Bronze_Ingot, 'B', Blocks.stonebrick});

		//Smelting
		GameRegistry.addSmelting(ModBlocks.Copper_Ore, new ItemStack(ModItems.Copper_Ingot, 1), 0.7F);
		GameRegistry.addSmelting(ModBlocks.Tin_Ore, new ItemStack(ModItems.Tin_Ingot, 1), 0.7F);

		LogHandler.info("Recipes loaded");
	}
}
