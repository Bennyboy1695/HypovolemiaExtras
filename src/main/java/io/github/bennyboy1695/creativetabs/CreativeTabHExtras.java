package io.github.bennyboy1695.creativetabs;

import io.github.bennyboy1695.blocks.BasicBlocks;
import io.github.bennyboy1695.item.BasicItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabHExtras extends CreativeTabs {

	public CreativeTabHExtras(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BasicBlocks.BPillar);
	}


}
