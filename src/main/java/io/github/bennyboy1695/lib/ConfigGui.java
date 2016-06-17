package io.github.bennyboy1695.lib;

import io.github.bennyboy1695.WorldofBones.MainRegistry;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ConfigGui extends GuiConfig{

	public ConfigGui(GuiScreen screen) {
		super(screen, new ConfigElement(MainRegistry.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), RefStrings.NAME,
				false, false, GuiConfig.getAbridgedConfigPath(MainRegistry.config.toString()));
	}

}
