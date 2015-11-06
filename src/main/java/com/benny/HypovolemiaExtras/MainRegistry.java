package com.benny.HypovolemiaExtras;

import com.benny.blocks.BasicBlocks;
import com.benny.creativetabs.hCreativeTabs;
import com.benny.item.BasicItems;
import com.benny.lib.HypoConfig;
import com.benny.lib.RefStrings;
import com.benny.world.BoneGeneration;
import com.benny.world.OwleryInstantStructure;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION, guiFactory = RefStrings.GUIFACTORY)
public class MainRegistry {
	private int SpawnRateConfig;
	public static Block owleryInstantStructure;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	public static Configuration config;
	
	@Mod.Instance(RefStrings.MODID)
	public static MainRegistry instance;
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent PreEvent){
		//Configs & Item/Block Handling
		config = new Configuration(PreEvent.getSuggestedConfigurationFile());
        HypoConfig.syncConfig();
        hCreativeTabs.initialiseTabs();
        BasicItems.MainRegistry();
		BasicBlocks.MainRegistry();
		if(!HypoConfig.worldGen){

		}else{
			GameRegistry.registerWorldGenerator(new BoneGeneration(), 0);
		}



	

	}
	
	
	
	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(RefStrings.MODID)){
			HypoConfig.syncConfig();
		}
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		//proxy, Entities, gui and packet registering
		proxy.registerRenderInfo();	
		CraftingManager.MainRegistry();
		FMLCommonHandler.instance().bus().register(instance);
		//OwleryInstantStructure.MainRegistry();
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent PostEvent){

		
	}
}
