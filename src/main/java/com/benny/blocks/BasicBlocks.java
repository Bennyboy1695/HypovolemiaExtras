package com.benny.blocks;

import com.benny.creativetabs.hCreativeTabs;
import com.benny.lib.RefStrings;
import com.benny.world.OwleryInstantStructure;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BasicBlocks {

	public static void MainRegistry(){
		initializeBlock();
		registerItem();
	}
	
    public static Block BPillar;
    public static Block OStructure;
	
	public static void initializeBlock(){
    	BPillar = new BonePillar(Material.wood).setBlockName("BPillar").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":BPillar");
    	//OStructure = new OwleryInstantStructure(Material.anvil).setBlockName("OStructure").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":OStructure");
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(BPillar, BPillar.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(OStructure, OStructure.getUnlocalizedName().substring(5));

	}
}
