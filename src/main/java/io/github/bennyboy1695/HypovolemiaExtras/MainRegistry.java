package io.github.bennyboy1695.HypovolemiaExtras;

import io.github.bennyboy1695.blocks.BasicBlocks;
import io.github.bennyboy1695.creativetabs.hCreativeTabs;
import io.github.bennyboy1695.item.BasicItems;
import io.github.bennyboy1695.lib.HypoConfig;
import io.github.bennyboy1695.lib.RefStrings;
import io.github.bennyboy1695.world.BoneGeneration;

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
		//OwleryInstantStructure.MainRegistry();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		//proxy, Entities, gui and packet registering
		proxy.registerRenderInfo();	
		OreDicManager.MainRegistry();
		CraftingManager.MainRegistry();
		FMLCommonHandler.instance().bus().register(instance);

		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent PostEvent){

		
	}
}
