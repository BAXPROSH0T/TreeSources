package com.bax.treesources.blocks;

import com.bax.treesources.IHasModel;
import com.bax.treesources.Main;
import com.bax.treesources.init.BlockInit;
import com.bax.treesources.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material materal)
	{
		super(materal);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.treesources);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	
}
