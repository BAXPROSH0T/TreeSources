package com.bax.treesources.util.compat;

import com.bax.treesources.init.ItemInit;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOre() 
	{
		OreDictionary.registerOre("ingotCopper", ItemInit.COPPER_INGOT);
		OreDictionary.registerOre("ingotSilver", ItemInit.SILVER_INGOT);
		OreDictionary.registerOre("ingotNickel", ItemInit.NICKEL_INGOT);
		OreDictionary.registerOre("ingotTin", ItemInit.TIN_INGOT);
		OreDictionary.registerOre("ingotLead", ItemInit.LEAD_INGOT);
		OreDictionary.registerOre("ingotBronze", ItemInit.BRONZE_INGOT);
		OreDictionary.registerOre("ingotSteel", ItemInit.STEEL_INGOT);
		OreDictionary.registerOre("ingotAluminum", ItemInit.ALUMINUM_INGOT);
	}
}
