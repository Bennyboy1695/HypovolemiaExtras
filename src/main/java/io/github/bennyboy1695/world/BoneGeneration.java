package io.github.bennyboy1695.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
 
public class BoneGeneration implements IWorldGenerator {

    public void generate(Random random, int x, int z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
        case -1:
            generateNether(world, random, x * 16, z * 16);
        case 0:
            generateSurface(world, random, x * 16, z * 16);
        case 1:
            generateEnd(world, random, x * 16, z * 16);
        case -37:
        	generateDreamWorld(world, random, x * 16,z * 16);
        }
    }

    private void generateDreamWorld(World world, Random random, int x, int z) {
        for(int i = 0; i <
        		0.0001 //Spawn rate
        		; i++){
            int randPosX= x + random.nextInt(16);
            int randPosZ= z + random.nextInt(16);
            int randPosY= world.getHeightValue(randPosX, randPosZ);
            (new BoneTreeGen(false, 6, 0, 0, false)).generate(world, random, randPosX, randPosY, randPosZ);
        }

	}

	private void generateEnd(World world, Random random, int x, int z)
    {

    }
 
    private void generateSurface(World world, Random random, int x, int z){
            for(int i = 0; i <
            		1 //Spawn rate
            		; i++){
                int randPosX= x + random.nextInt(528);
                int randPosZ= z + random.nextInt(528);
                int randPosY= world.getHeightValue(randPosX, randPosZ);
                (new BoneTreeGen(false, 4, 0, 0, false)).generate(world, random, randPosX, randPosY, randPosZ);
            }
    }
 
    private void generateNether(World world, Random random, int x, int z){
    
    }
    	
    }