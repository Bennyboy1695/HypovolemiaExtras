package io.github.bennyboy1695.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import io.github.bennyboy1695.creativetabs.hCreativeTabs;
import io.github.bennyboy1695.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlocks {

	public static void MainRegistry(){
		initializeBlock();
		registerItem();
	}

    public static Block BPillar;
    public static Block RedRock;
	public static Block RedRockStone;
    //public static Block OStructure;
	//public static Block CreativeTank;
	
	public static void initializeBlock(){
		BPillar = new BonePillar(Material.wood).setBlockName("BPillar").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":BPillar");
    	RedRock = new RedRock(Material.rock).setBlockName("RedRock").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":RedRock");
		RedRockStone = new RedRockStone(Material.rock).setBlockName("RedRockStone").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":RedRockStone");
    	//OStructure = new OwleryInstantStructure(Material.anvil).setBlockName("OStructure").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":OStructure");
	}
	
	public static void registerItem() {
        GameRegistry.registerBlock(BPillar, BPillar.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(RedRock, RedRock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(RedRockStone, RedRockStone.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(OStructure, OStructure.getUnlocalizedName().substring(5));

    }

}
