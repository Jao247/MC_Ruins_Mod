package com.jao247.mod_ruins.client.gui;

import com.jao247.mod_ruins.handler.ConfigHandler;
import com.jao247.mod_ruins.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class Mod_GuiConfig extends GuiConfig
{
	public Mod_GuiConfig(GuiScreen guiScreen)
	{
		super(guiScreen,
				new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
	}
}
