package io.github.bennyboy1695.blocks;

import java.util.ArrayList;
import java.util.Random;

import io.github.bennyboy1695.lib.HypoConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BonePillar extends Block {

	protected BonePillar(Material material) {
		super(material);
		this.setHardness(1.0F);
        if(!HypoConfig.defaultBoneLight){

        }else{
            this.setLightLevel(0.3F);
        }

		
	}
	@Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(Items.bone, world.rand.nextInt(4) + 1));
        drops.add(new ItemStack(Items.skull, world.rand.nextInt(1) + 1));
        return drops;
    }
}	
	

