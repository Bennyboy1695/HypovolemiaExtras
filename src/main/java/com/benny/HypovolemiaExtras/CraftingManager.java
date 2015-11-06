package com.benny.HypovolemiaExtras;

import com.benny.item.BasicItems;
import com.benny.lib.HypoConfig;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManager {
	public static void MainRegistry(){
		addOreRecipes();
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addOreRecipes(){
		//Shaped
		
		//Shapeless
		if(!HypoConfig.defaultRecipe){
			GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(BasicItems.wSplinter, 4), "logWood"));
	}else{
	}
	}
	public static void addCraftingRec(){
		//Shaped

		
	    //Shapeless

	}
	public static void addSmeltingRec(){
		
	}

}
