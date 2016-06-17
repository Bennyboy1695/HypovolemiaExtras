package io.github.bennyboy1695.blocks;


import cpw.mods.fml.common.registry.GameRegistry;
import io.github.bennyboy1695.creativetabs.hCreativeTabs;
import io.github.bennyboy1695.lib.WOBConfig;
import io.github.bennyboy1695.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlocks {

	public static void MainRegistry(){
		initializeBlock();
		registerItem();
	}

    public static Block BPillar;
	public static Block BPillar2;
    public static Block RedRock;
	public static Block RedRockStone;
	public static Block BloodGrass;
    public static Block BloodGrassSmall;
    //public static Block OStructure;
	
	public static void initializeBlock(){
        BloodGrassSmall = new BloodGrassSmall(Material.grass).setBlockName("BloodGrassSmall").setCreativeTab(hCreativeTabs.tabHExtras);
		BloodGrass = new BloodGrass(Material.grass).setBlockName("BloodGrass").setCreativeTab(hCreativeTabs.tabHExtras);
		BPillar = new BonePillar(Material.wood).setBlockName("BPillar").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":BPillar");
        if(!WOBConfig.defaultBoneEnabled){
        }else{
            BPillar2 = new BonePillar2(Material.wood).setBlockName("BPillar2").setCreativeTab(hCreativeTabs.tabHExtras);
        }
		BPillar2 = new BonePillar2(Material.wood).setBlockName("BPillar2").setCreativeTab(hCreativeTabs.tabHExtras);
    	RedRock = new RedRock(Material.rock).setBlockName("RedRock").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":RedRock");
		RedRockStone = new RedRockStone(Material.rock).setBlockName("RedRockStone").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":RedRockStone");
    	//OStructure = new OwleryInstantStructure(Material.anvil).setBlockName("OStructure").setCreativeTab(hCreativeTabs.tabHExtras).setBlockTextureName(RefStrings.MODID + ":OStructure");
	}
	
	public static void registerItem() {
        GameRegistry.registerBlock(BPillar, BPillar.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BPillar2, BPillar2.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(RedRock, RedRock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(RedRockStone, RedRockStone.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(BloodGrass, BloodGrass.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(BloodGrassSmall, BloodGrassSmall.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(OStructure, OStructure.getUnlocalizedName().substring(5));
    }

}
