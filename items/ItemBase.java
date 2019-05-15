package com.bax.treesources.items;

import com.bax.treesources.IHasModel;
import com.bax.treesources.Main;
import com.bax.treesources.init.ItemInit;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase (String name) {
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.treesources);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
