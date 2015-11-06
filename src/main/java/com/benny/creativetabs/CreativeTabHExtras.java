package com.benny.creativetabs;

import com.benny.blocks.BasicBlocks;
import com.benny.item.BasicItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabHExtras extends CreativeTabs {

	public CreativeTabHExtras(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(BasicBlocks.BPillar);
	}


}
