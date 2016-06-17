package io.github.bennyboy1695.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.bennyboy1695.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class BloodGrassSmall extends BlockBush {

    private IIcon icon;

    protected BloodGrassSmall(Material material) {
        super(Material.plants);
        setStepSound(soundTypeGrass);
        setTickRandomly(true);
        this.setBlockBounds(0.05F, 0.0F, 0.1F, 1.0F, 0.3F, 1.0F);
        setBlockTextureName(RefStrings.MODID + ":BloodGrassSmall");

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2) {
        return this.icon;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1) {
        this.icon = par1.registerIcon(RefStrings.MODID + ":BloodGrassSmall");
    }

    @Override
    public boolean canPlaceBlockOn(Block block) {
        return block == BasicBlocks.RedRock || block == BasicBlocks.RedRockStone || block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland;
    }

    @Override
    public Item getItemDropped(int i, Random aint, int dropping) {
        return null;
    }
}
