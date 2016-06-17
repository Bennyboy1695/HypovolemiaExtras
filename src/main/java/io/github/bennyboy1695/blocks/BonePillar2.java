package io.github.bennyboy1695.blocks;

import java.util.ArrayList;

import io.github.bennyboy1695.lib.WOBConfig;
import io.github.bennyboy1695.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BonePillar2 extends Block{
    protected BonePillar2(Material material) {
        super(material);
        this.setHardness(1.0F);
        this.setStepSound(soundTypeStone);
        if(!WOBConfig.defaultBoneLight){

        }else{
            this.setLightLevel(0.3F);
        }
        if(!WOBConfig.defaultBoneTexture){
            this.setBlockTextureName(RefStrings.MODID + ":BPillar");
        }else{
            this.setBlockTextureName(RefStrings.MODID + ":BPillar_extra");
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