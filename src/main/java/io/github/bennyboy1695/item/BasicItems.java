package io.github.bennyboy1695.item;

import io.github.bennyboy1695.creativetabs.hCreativeTabs;
import io.github.bennyboy1695.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class BasicItems {
	
	public static void MainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static Item wSplinter;
	public static Item gTear;
	
	public static void initializeItem(){
		wSplinter = new Item().setUnlocalizedName("wSplinter").setCreativeTab(hCreativeTabs.tabHExtras).setTextureName(RefStrings.MODID + ":wSplinter");
		gTear = new Item().setUnlocalizedName("gTear").setCreativeTab(hCreativeTabs.tabHExtras).setTextureName(RefStrings.MODID + ":gTear");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(wSplinter, wSplinter.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gTear, gTear.getUnlocalizedName().substring(5));
		
	}


}
