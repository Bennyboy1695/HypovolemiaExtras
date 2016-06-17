package io.github.bennyboy1695.WorldofBones;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import cpw.mods.fml.common.registry.EntityRegistry;
import io.github.bennyboy1695.blocks.BasicBlocks;
import io.github.bennyboy1695.creativetabs.hCreativeTabs;
import io.github.bennyboy1695.entities.MobCaithleen;
import io.github.bennyboy1695.item.BasicItems;
import io.github.bennyboy1695.lib.WOBConfig;
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
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION, guiFactory = RefStrings.GUIFACTORY)
public class MainRegistry {
	private int SpawnRateConfig;
	public static Block owleryInstantStructure;
    BiomeGenBase[] allBiomes = Iterators.toArray(Iterators.filter(Iterators.forArray(BiomeGenBase.getBiomeGenArray()),
            Predicates.notNull()), BiomeGenBase.class);
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	public static Configuration config;
	
	@Mod.Instance(RefStrings.MODID)
	public static MainRegistry instance;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent PreEvent){
		//Configs & Item/Block Handling
		config = new Configuration(PreEvent.getSuggestedConfigurationFile());
        WOBConfig.syncConfig();
        hCreativeTabs.initialiseTabs();
        BasicItems.MainRegistry();
		BasicBlocks.MainRegistry();
		if(!WOBConfig.worldGen){

		}else{
			GameRegistry.registerWorldGenerator(new BoneGeneration(), 0);
		}



	

	}
	
	
	
	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(RefStrings.MODID)){
			WOBConfig.syncConfig();
		}		
		//OwleryInstantStructure.MainRegistry();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent Event){
		//proxy, Entities, gui and packet registering
		EntityRegistry.registerGlobalEntityID(MobCaithleen.class, "Caithleen", 0, 112, 27);
        EntityRegistry.addSpawn(MobCaithleen.class, 2, 0, 1, EnumCreatureType.monster, BiomeGenBase.beach,BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.deepOcean, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.iceMountains, BiomeGenBase.forestHills, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.taigaHills, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.stoneBeach, BiomeGenBase.roofedForest, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau, BiomeGenBase.mesa, BiomeGenBase.megaTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.jungle);
		proxy.registerRenderInfo();
		OreDicManager.MainRegistry();
		CraftingManager.MainRegistry();
		FMLCommonHandler.instance().bus().register(instance);



	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent PostEvent){

		
	}
}
