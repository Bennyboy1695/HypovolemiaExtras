package io.github.bennyboy1695.lib;

import java.util.List;

import io.github.bennyboy1695.HypovolemiaExtras.MainRegistry;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ConfigGui extends GuiConfig{

	public ConfigGui(GuiScreen screen) {
		super(screen, new ConfigElement(MainRegistry.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), RefStrings.NAME,
				false, false, GuiConfig.getAbridgedConfigPath(MainRegistry.config.toString()));
	}

}
