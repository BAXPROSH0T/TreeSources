package com.bax.treesources.creativetab;

import com.bax.treesources.init.BlockInit;
import com.bax.treesources.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TreeSourcesTab extends CreativeTabs 
{
	public TreeSourcesTab(String label) { super ("treesourcestab");
	this.setBackgroundImageName("default.png");
		}


	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.ALUMINUM_SAPLING);
	}
}
