package io.github.bennyboy1695.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class RedRockStone extends Block {

	protected RedRockStone(Material material) {
		super(material);
		this.setHardness(1.5F);
	}
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(BasicBlocks.RedRock);
    }
}
