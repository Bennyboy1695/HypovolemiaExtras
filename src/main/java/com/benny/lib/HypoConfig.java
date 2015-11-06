package com.benny.lib;

import com.benny.HypovolemiaExtras.MainRegistry;

import cpw.mods.fml.common.FMLCommonHandler;

public class HypoConfig {

	public static boolean defaultRecipe;
	public static final boolean DEFAULTRECIPE_DEFAULT = false;
	public static final String DEFAULTRECIPE_NAME = "Disables the default recipe for Wood Splinters (Default = false)";
	public static boolean worldGen;
	public static final boolean WORLDGEN_DEFAULT = true;
	public static final String WORLDGEN_NAME = "Enables the world generation of the Bones! (Default = true)";
	
	
	public static void syncConfig(){
		FMLCommonHandler.instance().bus().register(MainRegistry.instance);
		
		final String RECIPES = MainRegistry.config.CATEGORY_GENERAL + MainRegistry.config.CATEGORY_SPLITTER + "Recipes";
		MainRegistry.config.addCustomCategoryComment(RECIPES, "Enable or Disables recipes");
		defaultRecipe = MainRegistry.config.get(RECIPES, DEFAULTRECIPE_NAME, DEFAULTRECIPE_DEFAULT).getBoolean(DEFAULTRECIPE_DEFAULT);
		if(MainRegistry.config.hasChanged()){
			MainRegistry.config.save();
		}
		final String WORLDGEN = MainRegistry.config.CATEGORY_GENERAL + MainRegistry.config.CATEGORY_SPLITTER + "WorldGen";
		MainRegistry.config.addCustomCategoryComment(WORLDGEN, "Enables or Disables WorldGenerated Blocks or Items");
		worldGen = MainRegistry.config.get(WORLDGEN, WORLDGEN_NAME, WORLDGEN_DEFAULT).getBoolean(WORLDGEN_DEFAULT);
		if(MainRegistry.config.hasChanged()){
			MainRegistry.config.save();
		}
		
	}
}
