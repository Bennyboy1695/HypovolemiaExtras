package io.github.bennyboy1695.WorldofBones;

import io.github.bennyboy1695.blocks.BasicBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

public class OreDicManager {
	
	public static Block RedRock = BasicBlocks.RedRock;
	
	public static void MainRegistry(){
		oreRegistration();
	}
	
	public static void oreRegistration(){
		OreDictionary.registerOre("RedRock", RedRock);
		
	}
}
