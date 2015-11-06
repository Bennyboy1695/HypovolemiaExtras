package com.benny.HypovolemiaExtras;

import com.benny.item.BasicItems;
import com.benny.lib.HypoConfig;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void MainRegistry(){
		addOreRecipes();
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addOreRecipes(){
		
	}
	public static void addCraftingRec(){
		//Shaped

		
	//Shapeless
		if(!HypoConfig.defaultRecipe){
			GameRegistry.addShapelessRecipe(new ItemStack(BasicItems.wSplinter, 4), new Object[]{new ItemStack(Blocks.log, 1)});
	}else{
	}
	}
	public static void addSmeltingRec(){
		
	}

}
