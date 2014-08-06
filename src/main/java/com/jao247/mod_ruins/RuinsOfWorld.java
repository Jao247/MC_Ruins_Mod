package com.jao247.mod_ruins;

import com.jao247.mod_ruins.handler.ConfigHandler;
import com.jao247.mod_ruins.init.ModBlocks;
import com.jao247.mod_ruins.init.ModItems;
import com.jao247.mod_ruins.init.ModRecipes;
import com.jao247.mod_ruins.proxy.IProxy;
import com.jao247.mod_ruins.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RuinsOfWorld
{
	@Mod.Instance(Reference.MOD_ID)
	public static RuinsOfWorld instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		ConfigHandler.init(e.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		ModItems.init();

		ModBlocks.init();

		ModRecipes.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e)
	{

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{

	}
}
