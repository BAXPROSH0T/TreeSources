package com.bax.treesources;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.bax.treesources.creativetab.TreeSourcesTab;
import com.bax.treesources.proxy.CommonProxy;
import com.bax.treesources.util.compat.OreDictionaryCompat;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	
	public static final CreativeTabs treesources = new TreeSourcesTab("treesourcestab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
  
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    		OreDictionaryCompat.registerOre();
    }
    @EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
    {
    	
    }
	
}
