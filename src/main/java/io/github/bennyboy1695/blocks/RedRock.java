package io.github.bennyboy1695.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class RedRock extends Block {

	protected RedRock(Material material) {
		super(material);
		this.setHardness(1.0F);
	}

}
