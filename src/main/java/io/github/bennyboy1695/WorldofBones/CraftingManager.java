package io.github.bennyboy1695.WorldofBones;

import io.github.bennyboy1695.blocks.BasicBlocks;
import io.github.bennyboy1695.item.BasicItems;
import io.github.bennyboy1695.lib.WOBConfig;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
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
		if(!WOBConfig.defaultRecipe){
			GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(BasicItems.wSplinter, 4), "logWood"));
	}else {
		}
	}
	public static void addCraftingRec(){
		//Shaped

		
	    //Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(BasicBlocks.RedRockStone), new ItemStack(Blocks.stone_button));

	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(BasicBlocks.RedRock, new ItemStack(BasicBlocks.RedRockStone), 0.5F);
	}

}
